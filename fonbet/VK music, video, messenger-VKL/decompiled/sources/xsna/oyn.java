package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vkontakte.android.R;
import xsna.k1u0;
import xsna.kyn;
import xsna.tlo0;

/* compiled from: DonutBlockViewHolder.kt */
/* loaded from: classes18.dex */
public final class oyn extends j0n0<nyn> implements View.OnClickListener {
    public final izs<nyn, s3q0> n;
    public final VkCell o;

    /* compiled from: DonutBlockViewHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: DonutBlockViewHolder.kt */
    public static final class c implements VkCell.f {
        public static final c a = new c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oyn(ViewGroup viewGroup, PaidSubscriptionsFragment.d dVar) {
        super(r0, viewGroup);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.n = dVar;
        VkCell vkCell2 = (VkCell) this.itemView;
        this.o = vkCell2;
        vkCell2.setLeftMainAvatarController(new b());
        vkCell2.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(c.a, VkCell.Left.Main.Size.Medium)));
        vkCell2.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23));
        vkCell2.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        VkCell.Middle.d dVar;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.a aVar2 = tlo0.Companion;
        kyn kynVar = ((nyn) obj).b;
        String str = kynVar.a;
        if (str == null) {
            str = "";
        }
        VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(aVar2, str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
        kyn.a aVar3 = kynVar.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (aVar3 instanceof kyn.a.b) {
            spannableStringBuilder.append((CharSequence) ((kyn.a.b) aVar3).b);
            spannableStringBuilder.append((CharSequence) " ");
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) aVar3.a);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_link)), length, spannableStringBuilder.length(), 0);
        if (drm0.N(spannableStringBuilder)) {
            spannableStringBuilder = null;
        }
        if (spannableStringBuilder != null) {
            dVar = new VkCell.Middle.d(new tlo0.h(spannableStringBuilder), (gzs) null, 0, (TextUtils.TruncateAt) null, new VkCell.Middle.d.b.C0815b(new gko(R.drawable.vk_icon_payment_card_outline_16), new k1u0.a(new x7g(R.attr.vk_ui_text_link)), 4), (VkCell.Middle.d.b.C0815b) null, 46);
        } else {
            dVar = null;
        }
        this.o.setMiddle(VkCell.Middle.a.a(aVar, eVar, dVar, null, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nyn nynVar = (nyn) this.m;
        if (nynVar != null) {
            this.n.invoke(nynVar);
        }
    }

    /* compiled from: DonutBlockViewHolder.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            this.a = vkAvatar;
            vkAvatar.setImageResource(R.drawable.vk_icon_illustration_donut_logo_circle_48h);
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
        }
    }
}
