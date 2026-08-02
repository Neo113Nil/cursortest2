package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.ui.utils.ItemType;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SimpleAdapter.kt */
/* loaded from: classes17.dex */
public final class bpj0 extends on6 {
    public static final /* synthetic */ int r = 0;
    public final ViewGroup n;
    public final Context o;
    public final ImageView p;
    public final TextView q;

    public bpj0(ViewGroup viewGroup) {
        super(viewGroup);
        this.n = viewGroup;
        this.o = viewGroup.getContext();
        this.p = (ImageView) viewGroup.findViewById(R.id.icon);
        this.q = (TextView) viewGroup.findViewById(R.id.title);
        jjc.g(viewGroup, new w110(this, 28));
    }

    @Override // xsna.on6
    public final void V5(brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
        int i;
        baf0 f;
        boolean z = brj0Var.h;
        Drawable drawable = brj0Var.c;
        this.l = brj0Var;
        this.m = izsVar;
        int i2 = brj0Var.d;
        Context context = this.o;
        CharSequence string = i2 != 0 ? context.getString(i2) : brj0Var.e;
        boolean z2 = brj0Var.g;
        if (z2) {
            i = R.attr.vk_ui_background_negative;
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.attr.vk_ui_icon_accent;
        }
        if (drawable != null) {
            f = new baf0(drawable, i);
        } else {
            int i3 = brj0Var.b;
            f = i3 != 0 ? krv0.f(i3, i, context) : null;
        }
        ItemType itemType = brj0Var.i;
        ItemType itemType2 = ItemType.DEFAULT_WITH_CHECK;
        ViewGroup viewGroup = this.n;
        if (itemType == itemType2) {
            Integer num = brj0Var.n;
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.checked);
            if (num != null) {
                int intValue = num.intValue();
                Drawable mutate = imageView.getDrawable().mutate();
                mutate.setTint(intValue);
                imageView.setImageDrawable(mutate);
            }
        }
        Integer num2 = brj0Var.k;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            baf0 baf0Var = f != null ? f : null;
            if (baf0Var != null) {
                baf0Var.a(intValue2);
            }
        }
        int m = krv0.m(z ? brj0Var.l.h() : TitleColorAttr.SECONDARY.h(), context);
        TextView textView = this.q;
        textView.setTextColor(m);
        Integer num3 = brj0Var.f;
        if (num3 != null) {
            f4m.s(num3.intValue(), textView);
        }
        viewGroup.setContentDescription(string);
        textView.setText(string);
        ImageView imageView2 = this.p;
        imageView2.setImageDrawable(f);
        imageView2.setVisibility(f == null ? 8 : 0);
        viewGroup.setId(brj0Var.j);
        viewGroup.setEnabled(z);
    }
}
