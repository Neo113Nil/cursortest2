package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.counter.VkCounter;
import com.vkontakte.android.R;
import xsna.cq8;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: ButtonVh.kt */
/* loaded from: classes2.dex */
public final class vr8 extends vfz<cq8> {
    public final VkCell l;
    public final dp8 m;
    public cq8 n;

    /* compiled from: ButtonVh.kt */
    public static final class a implements aju0 {
        @Override // xsna.aju0
        public final ziu0 create(Context context) {
            return new b(context);
        }
    }

    /* compiled from: ButtonVh.kt */
    public static final class b extends FrameLayout implements ziu0 {
        public boolean b;
        public final VkOnboardingHighlighter c;
        public final b d;
        public final AppCompatTextView e;

        public b(Context context) {
            super(context);
            this.b = true;
            this.d = this;
            setClipChildren(false);
            VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) LayoutInflater.from(context).inflate(R.layout.vkim_contacts_button_highlighted_title, (ViewGroup) null, false);
            this.c = vkOnboardingHighlighter;
            addView(vkOnboardingHighlighter);
            vkOnboardingHighlighter.setAutoHighlight(false);
            this.e = (AppCompatTextView) findViewById(R.id.text);
        }

        @Override // xsna.ziu0
        public final AppCompatTextView a() {
            return this.e;
        }

        @Override // xsna.ziu0
        public final View getView() {
            return this.d;
        }

        @Override // xsna.ziu0
        public final void setText(CharSequence charSequence) {
            this.c.setText(charSequence);
            if (charSequence == null || !drm0.D(charSequence, "<u>", false)) {
                return;
            }
            post(new m67(this, 1));
        }
    }

    public vr8(VkCell vkCell, dp8 dp8Var) {
        super(vkCell);
        this.l = vkCell;
        this.m = dp8Var;
        getContext();
        bwt0.i0(this.itemView, new zt4(this, 3));
        vkCell.setMiddleTitleHolderFactory(new a());
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(cq8 cq8Var) {
        String string;
        cq8 cq8Var2 = cq8Var;
        boolean z = cq8Var2.f;
        int i = cq8Var2.e;
        int i2 = cq8Var2.c;
        this.n = cq8Var2;
        boolean z2 = (cq8Var2 instanceof cq8.e) && ((cq8.e) cq8Var2).h;
        if (z2) {
            string = "<u>" + b6().getString(i2) + "</u>";
        } else {
            string = b6().getString(i2);
        }
        int i3 = z2 ? R.attr.vk_ui_text_primary_invariably : R.attr.vk_ui_text_accent;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        SpannableStringBuilder c = cqm0.c(e3m.f(i3, this.itemView.getContext()), string);
        aVar2.getClass();
        tlo0.h hVar = new tlo0.h(c);
        VkCell.Right.d dVar = null;
        VkCell.Middle.b a2 = VkCell.Middle.a.a(aVar, new VkCell.Middle.e(hVar, 1, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, z ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_circle_12), new k1u0.a(new x7g(R.attr.vk_ui_icon_negative)), (tlo0.f) null, (Size) null, 12) : null, 26), null, null, 14);
        VkCell vkCell = this.l;
        vkCell.setMiddle(a2);
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(cq8Var2.d, VkCell.Left.Main.Size.Small, new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (tlo0.h) null, 8), null));
        if (!z && i > 0) {
            dVar = new VkCell.Right.d(new VkCell.Right.a.d(i, (VkCounter.CounterAppearance.Appearance) null, 6), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30);
        }
        vkCell.setRight(dVar);
        if (cq8Var2.g) {
            f4m.t(cn70.b(8), this.itemView);
        }
    }
}
