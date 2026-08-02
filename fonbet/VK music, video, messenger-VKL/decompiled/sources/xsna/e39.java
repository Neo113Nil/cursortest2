package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.t69;

/* compiled from: CallFeatureOnboardingViewHolder.kt */
/* loaded from: classes7.dex */
public final class e39 extends vfz<t69.a.C3724a> {
    public final q69 l;
    public final VKImageView m;
    public final View n;
    public final TextView o;
    public final TextView p;
    public final View q;
    public final View r;

    public e39(ViewGroup viewGroup, q69 q69Var) {
        super(R.layout.voip_onboarding_item_view, viewGroup);
        this.l = q69Var;
        this.m = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.n = this.itemView.findViewById(R.id.background);
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (TextView) this.itemView.findViewById(R.id.subtitle);
        View findViewById = this.itemView.findViewById(R.id.close);
        this.q = findViewById;
        this.r = this.itemView.findViewById(R.id.trigger);
        this.itemView.setClipToOutline(true);
        findViewById.setContentDescription(findViewById.getContext().getString(R.string.voip_accessibility_icon_close_call_onboarding_banner));
        awt0.o(findViewById, new com.vk.movika.sdk.base.observable.e(findViewById, 12));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(t69.a.C3724a c3724a) {
        t69.a.C3724a c3724a2 = c3724a;
        int i = c3724a2.i;
        int i2 = c3724a2.h;
        String string = this.itemView.getContext().getString(c3724a2.d);
        String string2 = this.itemView.getContext().getString(c3724a2.e);
        View view = this.itemView;
        view.setContentDescription(view.getContext().getString(R.string.voip_accessibility_call_onboarding_banner, cqm0.e(string.concat(string2))));
        Integer num = c3724a2.f;
        VKImageView vKImageView = this.m;
        if (num != null) {
            vKImageView.setImageResource(num.intValue());
        }
        bwt0.p0(vKImageView, num != null);
        this.o.setText(string);
        this.p.setText(string2);
        bwt0.i0(this.q, new com.vk.libvideo.design.view.video.a(3, this, c3724a2));
        Integer num2 = c3724a2.g;
        View view2 = this.n;
        if (num2 != null) {
            view2.setBackgroundResource(num2.intValue());
            Drawable background = view2.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
            }
        } else {
            Context context = this.itemView.getContext();
            if (i2 == i) {
                view2.setBackground(new ColorDrawable(context.getColor(i2)));
            } else {
                view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{context.getColor(i2), context.getColor(i)}));
            }
        }
        bwt0.i0(this.r, new zf1(2, this, c3724a2));
    }
}
