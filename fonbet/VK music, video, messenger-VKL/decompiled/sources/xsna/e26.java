package xsna;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: BannerItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class e26 extends vfz<k26> {
    public k26 l;
    public final AppCompatTextView m;
    public final AppCompatImageView n;
    public final ViewGroup o;
    public final VKImageView p;

    public e26(View view, com.vk.channels.impl.list.f fVar) {
        super(view);
        this.m = (AppCompatTextView) view.findViewById(R.id.channels_banner_title);
        this.n = (AppCompatImageView) view.findViewById(R.id.chevron_icon);
        this.o = (ViewGroup) view.findViewById(R.id.channels_banner);
        this.p = (VKImageView) view.findViewById(R.id.banner_image);
        bwt0.i0(view, new oh3(3, this, fVar));
    }

    @Override // xsna.vfz
    public final void W5(k26 k26Var) {
        Integer num;
        k26 k26Var2 = k26Var;
        this.l = k26Var2;
        String str = k26Var2.b;
        AppCompatTextView appCompatTextView = this.m;
        appCompatTextView.setText(str);
        String str2 = k26Var2.d;
        ViewGroup viewGroup = this.o;
        Drawable background = viewGroup.getBackground();
        Integer num2 = null;
        try {
            num = Integer.valueOf(Color.parseColor(str2));
        } catch (Throwable unused) {
            num = null;
        }
        int intValue = num != null ? num.intValue() : 0;
        if (background == null) {
            float a = cn70.a() * 16.0f;
            float[] fArr = new float[8];
            for (int i = 0; i < 8; i++) {
                fArr[i] = a;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(intValue);
            viewGroup.setBackground(shapeDrawable);
        } else if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(intValue);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background).setColor(intValue);
        } else {
            background.setTint(intValue);
        }
        try {
            num2 = Integer.valueOf(Color.parseColor(k26Var2.e));
        } catch (Throwable unused2) {
        }
        int intValue2 = num2 != null ? num2.intValue() : e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext());
        appCompatTextView.setTextColor(intValue2);
        bwt0.o0(this.n, intValue2);
        String str3 = k26Var2.f;
        VKImageView vKImageView = this.p;
        if (str3 == null || drm0.N(str3)) {
            vKImageView.clear();
            f4m.j(vKImageView);
        } else {
            vKImageView.setVisibility(0);
            vKImageView.setDontLoadAgainIfSameResource(true);
            vKImageView.load(str3);
        }
    }
}
