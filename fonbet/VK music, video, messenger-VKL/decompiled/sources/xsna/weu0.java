package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.SizeF;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ayv0;

/* compiled from: VkBaseUserStack.kt */
@SuppressLint({"SetTextI18n"})
/* loaded from: classes17.dex */
public final class weu0 extends FrameLayout implements too0 {
    public final ArrayList b;
    public Path c;
    public Integer d;
    public float e;
    public float f;
    public int g;
    public SizeF h;
    public int i;
    public boolean j;
    public final GradientDrawable k;
    public final TextView l;
    public final List<? extends VkAvatar> m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public weu0(Context context) {
        super(context, null, 0);
        AttributeSet attributeSet = null;
        int i = 0;
        this.b = new ArrayList(3);
        this.h = new SizeF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.i = Integer.MAX_VALUE;
        this.j = false;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.k = gradientDrawable;
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setText("+" + this.d);
        gpo0.i(textView, R.attr.vk_ui_text_contrast);
        int a = e3m.a(R.dimen.vk_ui_spacing_size_xs, context);
        textView.setPadding(a, 0, a, 0);
        gradientDrawable.setCornerRadius(2.1474836E9f);
        textView.setBackground(gradientDrawable);
        this.l = textView;
        int i2 = 6;
        List<? extends VkAvatar> l = e43.l(new VkAvatar(context, attributeSet, i2, i), new VkAvatar(context, attributeSet, i2, i), new VkAvatar(context, attributeSet, i2, i));
        this.m = l;
        if (l != null) {
            for (Object obj : l) {
                int i3 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                VkAvatar vkAvatar = (VkAvatar) obj;
                addView(vkAvatar);
                vkAvatar.setPlaceholderImage(R.drawable.ds_internal_avatar_placeholder);
                i = i3;
            }
        }
        addView(this.l);
        GradientDrawable gradientDrawable2 = this.k;
        getContext();
        gradientDrawable2.setColor(gpo0.d(R.attr.vk_ui_icon_secondary, this));
        getContext();
        gradientDrawable2.setStroke((int) UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, gpo0.d(R.attr.vk_ui_image_border_alpha, this));
    }

    @Override // xsna.too0
    public final void Ng() {
        getContext();
        int d = gpo0.d(R.attr.vk_ui_icon_secondary, this);
        GradientDrawable gradientDrawable = this.k;
        gradientDrawable.setColor(d);
        getContext();
        gradientDrawable.setStroke((int) UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, gpo0.d(R.attr.vk_ui_image_border_alpha, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
    
        if (r7 == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        SizeF sizeF;
        Path path;
        VkAvatar vkAvatar;
        VkAvatar vkAvatar2;
        VkAvatar vkAvatar3;
        Path path2 = new Path();
        if (this.d != null || this.j) {
            SizeF sizeF2 = this.h;
            sizeF = new SizeF(-sizeF2.getWidth(), -sizeF2.getHeight());
        } else {
            sizeF = this.h;
        }
        getContext();
        float a = hbh0.a(getContext(), (this.f - this.e) / 2);
        float a2 = hbh0.a(getContext(), this.f);
        path2.addRoundRect(new RectF(hbh0.a(getContext(), sizeF.getWidth()) - a, hbh0.a(getContext(), sizeF.getHeight()) - a, (hbh0.a(getContext(), sizeF.getWidth()) + a2) - a, (hbh0.a(getContext(), sizeF.getHeight()) + a2) - a), 2.1474836E9f, 2.1474836E9f, Path.Direction.CW);
        path2.setFillType(Path.FillType.INVERSE_WINDING);
        this.c = path2;
        List<? extends VkAvatar> list = this.m;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((VkAvatar) it.next()).setVisibility(8);
            }
        }
        ArrayList arrayList = this.b;
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            ayv0 ayv0Var = (ayv0) obj;
            VkAvatar vkAvatar4 = list != null ? list.get(i) : null;
            if (vkAvatar4 != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) hbh0.a(getContext(), this.e), (int) hbh0.a(getContext(), this.e));
                layoutParams.gravity = 8388691;
                SizeF sizeF3 = this.h;
                float f = i;
                layoutParams.setMarginStart((int) (Math.abs(hbh0.a(getContext(), sizeF3.getWidth())) * f));
                layoutParams.bottomMargin = (int) (Math.abs(hbh0.a(getContext(), sizeF3.getHeight())) * f);
                vkAvatar4.setLayoutParams(layoutParams);
                vkAvatar4.setVisibility(0);
            }
            if (this.d != null || this.j ? i != arrayList.size() - 1 || this.d != null : i != 0) {
                path = this.c;
            }
            path = null;
            if (path != null) {
                if (vkAvatar4 != null) {
                    vkAvatar4.setCutout(path);
                }
            } else if (vkAvatar4 != null) {
                vkAvatar4.setCutout(null);
            }
            if (ayv0Var instanceof ayv0.a) {
                if (list != null && (vkAvatar3 = list.get(i)) != null) {
                    vkAvatar3.setImageDrawable(((ayv0.a) ayv0Var).a);
                }
            } else if (!(ayv0Var instanceof ayv0.b)) {
                if (!(ayv0Var instanceof ayv0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (list != null && (vkAvatar = list.get(i)) != null) {
                    vkAvatar.o0(((ayv0.c) ayv0Var).a, null);
                }
            } else if (list != null && (vkAvatar2 = list.get(i)) != null) {
                vkAvatar2.setImageResource(((ayv0.b) ayv0Var).a);
            }
            i = i2;
        }
        TextView textView = this.l;
        textView.setVisibility(8);
        if (this.d != null) {
            int size = arrayList.size();
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) hbh0.a(getContext(), this.e));
            layoutParams2.gravity = 8388691;
            SizeF sizeF4 = this.h;
            float f2 = size;
            layoutParams2.setMarginStart((int) (Math.abs(hbh0.a(getContext(), sizeF4.getWidth())) * f2));
            layoutParams2.bottomMargin = (int) (Math.abs(hbh0.a(getContext(), sizeF4.getHeight())) * f2);
            textView.setLayoutParams(layoutParams2);
            textView.setMinimumWidth((int) hbh0.a(getContext(), this.e));
            textView.setVisibility(0);
        }
    }

    public final SizeF getAvatarOffset() {
        return this.h;
    }

    public final float getAvatarSize() {
        return this.e;
    }

    public final Integer getCounter() {
        return this.d;
    }

    public final int getCounterFont() {
        return this.g;
    }

    public final float getCutoutDiameter() {
        return this.f;
    }

    public final int getMaxCounterValue() {
        return this.i;
    }

    public final void setAvatarOffset(SizeF sizeF) {
        this.h = sizeF;
    }

    public final void setAvatarSize(float f) {
        this.e = f;
    }

    public final void setAvatars(List<? extends ayv0> list) {
        ArrayList arrayList = this.b;
        if (list.equals(arrayList)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(j5g.H0(list, 3));
        a();
    }

    public final void setCounter(Integer num) {
        Integer num2 = this.d;
        this.d = num;
        boolean z = !epx.f(num2, num) && (num == null || num2 == null);
        if (num != null) {
            this.l.setText("+" + swe0.g(num.intValue(), 1, this.i));
        }
        if (z) {
            a();
        }
    }

    public final void setCounterFont(int i) {
        this.g = i;
        this.l.setTextAppearance(i);
    }

    public final void setCutoutDiameter(float f) {
        this.f = f;
    }

    public final void setMaxCounterValue(int i) {
        this.i = i;
    }

    public final void setReverseCutoutDirection(boolean z) {
        this.j = z;
    }
}
