package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextFlag;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ayv0;
import xsna.e3m;

/* compiled from: StorySubtitleView.kt */
/* loaded from: classes6.dex */
public final class sim0 extends ViewGroup {
    public static final int h = iah0.a(12);
    public static final int i = iah0.a(2);
    public static final int j = iah0.a(16);
    public static final float k = iah0.b(4.0f);
    public ImageView b;
    public LottieAnimationView c;
    public VkUserStack d;
    public TextView e;
    public ImageView f;
    public ImageView g;

    /* compiled from: StorySubtitleView.kt */
    public static final class a extends ViewGroup.MarginLayoutParams {
    }

    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int marginStart = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return view.getMeasuredWidth() + marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
    }

    private final a getEndImageLayoutParams() {
        int i2 = h;
        a aVar = new a(i2, i2);
        aVar.setMargins(i, 0, 0, 0);
        return aVar;
    }

    private final a getStartImageLayoutParams() {
        int i2 = h;
        a aVar = new a(i2, i2);
        aVar.setMargins(0, 0, i, 0);
        return aVar;
    }

    private final int getWhiteColor() {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        return context.getColor(R.color.vk_white);
    }

    public final float getTextSize() {
        TextView textView = this.e;
        return textView != null ? textView.getTextSize() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i8 = ((i5 - i3) - measuredHeight) / 2;
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int marginStart = i6 + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            int i9 = measuredWidth + marginStart;
            childAt.layout(marginStart, i8, i9, measuredHeight + i8);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            i6 = (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0) + i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int i4;
        TextView textView;
        int a2;
        TextView textView2;
        TextView textView3;
        ViewGroup.LayoutParams layoutParams;
        int size = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            measureChild(childAt, i2, i3);
            int measuredWidth = childAt.getMeasuredWidth() + i6;
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            int marginStart = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart() : 0;
            ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
            i6 = marginStart + (layoutParams3 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd() : 0) + measuredWidth;
            i7 = Math.max(i7, childAt.getMeasuredHeight());
        }
        if (i6 > size) {
            TextView textView4 = this.e;
            if (textView4 != null) {
                ViewGroup.LayoutParams layoutParams4 = textView4.getLayoutParams();
                if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                    i4 = ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart();
                    textView = this.e;
                    if (textView != null) {
                        ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            i5 = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd();
                        }
                    }
                    a2 = size - ((a(this.g) + (a(this.f) + (a(this.d) + (a(this.c) + a(this.b))))) + (i4 + i5));
                    textView2 = this.e;
                    if (textView2 != null && (layoutParams = textView2.getLayoutParams()) != null) {
                        layoutParams.width = a2;
                    }
                    textView3 = this.e;
                    if (textView3 != null) {
                        textView3.measure(View.MeasureSpec.makeMeasureSpec(a2, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                    }
                }
            }
            i4 = 0;
            textView = this.e;
            if (textView != null) {
            }
            a2 = size - ((a(this.g) + (a(this.f) + (a(this.d) + (a(this.c) + a(this.b))))) + (i4 + i5));
            textView2 = this.e;
            if (textView2 != null) {
                layoutParams.width = a2;
            }
            textView3 = this.e;
            if (textView3 != null) {
            }
        }
        setMeasuredDimension(size, i7);
    }

    public final void setData(x0n0 x0n0Var) {
        float f;
        Integer num = x0n0Var.b;
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(getStartImageLayoutParams());
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(intValue);
            imageView.setColorFilter(getWhiteColor());
            addView(imageView);
            this.b = imageView;
        }
        String str = x0n0Var.d;
        if (str != null) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
            lottieAnimationView.setLayoutParams(getStartImageLayoutParams());
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.setAnimation(str);
            lottieAnimationView.m0();
            lottieAnimationView.V(new udy("**"), t800.I, new a900(new upj0(getWhiteColor())));
            addView(lottieAnimationView);
            this.c = lottieAnimationView;
        }
        List<String> list = x0n0Var.e;
        int i2 = 2;
        Integer num2 = null;
        int i3 = i;
        if (list != null) {
            VkUserStack vkUserStack = new VkUserStack(getContext(), null, 6);
            a aVar = new a(-2, j);
            aVar.setMargins(i3, 0, i3, 0);
            vkUserStack.setLayoutParams(aVar);
            vkUserStack.setSize(VkUserStack.Size.Small);
            vkUserStack.setElevation(k);
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (String str2 : list2) {
                arrayList.add(str2.length() == 0 ? new ayv0.a(new LayerDrawable(new Drawable[]{new ColorDrawable(vkUserStack.getContext().getColor(R.color.vk_gray_200)), new InsetDrawable((Drawable) dhr0.t.b(R.drawable.vk_icon_user_24, R.attr.vk_ui_icon_contrast), iah0.a(4))})) : new ayv0.c(str2));
            }
            vkUserStack.setAvatars(arrayList);
            addView(vkUserStack);
            this.d = vkUserStack;
        }
        String str3 = x0n0Var.a;
        int i4 = x0n0Var.g;
        TextView textView = new TextView(getContext());
        textView.setText(str3);
        textView.setMaxLines(i4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        Context context = textView.getContext();
        FontFamily fontFamily = FontFamily.REGULAR;
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        int i5 = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
        if (i5 == 1) {
            f = 12.0f;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(12.0f);
        }
        Font.Companion.getClass();
        Font a2 = Font.a.a(fontFamily, f);
        Typeface k2 = a2.k(context);
        float j2 = a2.j();
        textView.setTypeface(k2);
        textView.setLetterSpacing(j2);
        if ((TextFlag.DO_NOT_CHANGE_SIZE.h() & 0) == 0) {
            int i6 = b.a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
            if (i6 == 1) {
                i2 = 0;
            } else if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textView.setTextSize(i2, 12.0f);
        }
        textView.setTextColor(getWhiteColor());
        textView.setPadding(0, 0, 0, i3);
        textView.setShadowLayer(6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, textView.getContext().getColor(R.color.vk_black_alpha35));
        addView(textView);
        this.e = textView;
        Integer num3 = x0n0Var.c;
        Integer num4 = x0n0Var.j;
        if (num4 != null) {
            Context context2 = getContext();
            int intValue2 = num4.intValue();
            e3m.a aVar2 = e3m.a;
            num2 = Integer.valueOf(context2.getColor(intValue2));
        }
        if (num3 != null) {
            int intValue3 = num3.intValue();
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setLayoutParams(getEndImageLayoutParams());
            imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView2.setImageResource(intValue3);
            imageView2.setColorFilter(num2 != null ? num2.intValue() : getWhiteColor());
            addView(imageView2);
            this.f = imageView2;
        }
        if (x0n0Var.f) {
            ImageView imageView3 = new ImageView(getContext());
            imageView3.setLayoutParams(getEndImageLayoutParams());
            imageView3.setImageResource(R.drawable.vk_icon_chevron_12);
            imageView3.setColorFilter(getWhiteColor());
            addView(imageView3);
            this.g = imageView3;
        }
    }
}
