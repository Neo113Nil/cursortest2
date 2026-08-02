package xsna;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: TooltipView.kt */
/* loaded from: classes3.dex */
public final class n6p0 extends LinearLayout {
    public final float b;
    public final TextView c;
    public final AppCompatImageView d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;

    public n6p0(Context context) {
        super(context, null);
        dhr0.a.getClass();
        dhr0.f.getClass();
        int f = e3m.f(R.attr.vk_ui_background_accent_tint, context);
        float f2 = 8;
        float a = iah0.a(f2);
        this.b = a;
        TextView textView = new TextView(context);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_contrast, context));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{a, a, a, a, a, a, a, a}, null, null));
        shapeDrawable.setTint(f);
        textView.setBackground(shapeDrawable);
        float f3 = 12;
        float f4 = 9;
        textView.setPadding(iah0.a(f3), iah0.a(f4), iah0.a(f3), iah0.a(f4));
        this.c = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setImageResource(R.drawable.vk_icon_tip_8h);
        bwt0.o0(appCompatImageView, f);
        this.d = appCompatImageView;
        this.e = iah0.a(20);
        this.f = iah0.a(f2);
        addView(textView, -2, -2);
        setPointerGravity(80);
    }

    public final void a() {
        Float valueOf;
        int orientation = getOrientation();
        Float f = null;
        float f2 = this.b;
        int i = this.f;
        int i2 = this.e;
        if (orientation == 0) {
            int i3 = this.g;
            if (i3 != 3) {
                if (i3 != 5) {
                    if (i3 != 8388611) {
                        if (i3 != 8388613) {
                            valueOf = null;
                        }
                    }
                }
                valueOf = Float.valueOf((i - i2) / 2.0f);
            }
            valueOf = Float.valueOf((i2 - i) / 2.0f);
        } else {
            float f3 = i2;
            float measuredWidth = (getMeasuredWidth() - f2) - f3;
            valueOf = f2 > measuredWidth ? Float.valueOf(f2) : Float.valueOf(swe0.f(this.h - (f3 / 2.0f), f2, measuredWidth));
        }
        AppCompatImageView appCompatImageView = this.d;
        if (valueOf != null) {
            appCompatImageView.setX(valueOf.floatValue());
        }
        if (getOrientation() != 1) {
            float f4 = i2;
            float measuredHeight = (getMeasuredHeight() - f2) - f4;
            f = f2 > measuredHeight ? Float.valueOf(f2) : Float.valueOf(((i2 - i) / 2.0f) + swe0.f(this.h - (f4 / 2.0f), f2, measuredHeight));
        }
        if (f != null) {
            appCompatImageView.setY(f.floatValue());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }

    public final void setPointerBias(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        a();
    }

    public final void setPointerGravity(int i) {
        Triple triple;
        Triple triple2;
        if (this.g == i) {
            return;
        }
        if (i != 3) {
            if (i != 5) {
                if (i == 48) {
                    triple2 = new Triple(0, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 1);
                    triple = triple2;
                    int intValue = ((Number) triple.d()).intValue();
                    float floatValue = ((Number) triple.g()).floatValue();
                    int intValue2 = ((Number) triple.h()).intValue();
                    this.g = i;
                    setOrientation(intValue2);
                    AppCompatImageView appCompatImageView = this.d;
                    appCompatImageView.setRotation(floatValue);
                    removeView(appCompatImageView);
                    addView(appCompatImageView, intValue, new LinearLayout.LayoutParams(this.e, this.f));
                    setPointerMargin(this.i);
                }
                if (i == 80) {
                    triple = new Triple(1, Float.valueOf(180.0f), 1);
                    int intValue3 = ((Number) triple.d()).intValue();
                    float floatValue2 = ((Number) triple.g()).floatValue();
                    int intValue22 = ((Number) triple.h()).intValue();
                    this.g = i;
                    setOrientation(intValue22);
                    AppCompatImageView appCompatImageView2 = this.d;
                    appCompatImageView2.setRotation(floatValue2);
                    removeView(appCompatImageView2);
                    addView(appCompatImageView2, intValue3, new LinearLayout.LayoutParams(this.e, this.f));
                    setPointerMargin(this.i);
                }
                if (i != 8388611) {
                    if (i != 8388613) {
                        L l = L.a;
                        l.getClass();
                        if (L.m(LoggerOutputTarget.NONE)) {
                            return;
                        }
                        L.u(l, L.LogType.w, new Object[]{tgw.b(i, "Unsupported pointer gravity ", ". Ignore!")});
                        return;
                    }
                }
            }
            triple2 = new Triple(1, Float.valueOf(90.0f), 0);
            triple = triple2;
            int intValue32 = ((Number) triple.d()).intValue();
            float floatValue22 = ((Number) triple.g()).floatValue();
            int intValue222 = ((Number) triple.h()).intValue();
            this.g = i;
            setOrientation(intValue222);
            AppCompatImageView appCompatImageView22 = this.d;
            appCompatImageView22.setRotation(floatValue22);
            removeView(appCompatImageView22);
            addView(appCompatImageView22, intValue32, new LinearLayout.LayoutParams(this.e, this.f));
            setPointerMargin(this.i);
        }
        triple = new Triple(0, Float.valueOf(270.0f), 0);
        int intValue322 = ((Number) triple.d()).intValue();
        float floatValue222 = ((Number) triple.g()).floatValue();
        int intValue2222 = ((Number) triple.h()).intValue();
        this.g = i;
        setOrientation(intValue2222);
        AppCompatImageView appCompatImageView222 = this.d;
        appCompatImageView222.setRotation(floatValue222);
        removeView(appCompatImageView222);
        addView(appCompatImageView222, intValue322, new LinearLayout.LayoutParams(this.e, this.f));
        setPointerMargin(this.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPointerMargin(int i) {
        Pair pair;
        Pair pair2;
        int i2;
        Pair pair3;
        Pair pair4;
        this.i = i;
        int i3 = this.g;
        if (i3 == 48) {
            pair = new Pair(Integer.valueOf(i), 0);
        } else {
            if (i3 != 80) {
                pair2 = new Pair(0, 0);
                int intValue = ((Number) pair2.d()).intValue();
                int intValue2 = ((Number) pair2.g()).intValue();
                i2 = this.g;
                int i4 = this.f;
                int i5 = this.e;
                if (i2 != 3) {
                    pair3 = new Pair(Integer.valueOf(i - (i5 - i4)), 0);
                } else {
                    if (i2 != 5) {
                        pair4 = new Pair(0, 0);
                        bwt0.e0(this.d, ((Number) pair4.d()).intValue(), intValue, ((Number) pair4.g()).intValue(), intValue2);
                    }
                    pair3 = new Pair(0, Integer.valueOf(i - (i5 - i4)));
                }
                pair4 = pair3;
                bwt0.e0(this.d, ((Number) pair4.d()).intValue(), intValue, ((Number) pair4.g()).intValue(), intValue2);
            }
            pair = new Pair(0, Integer.valueOf(i));
        }
        pair2 = pair;
        int intValue3 = ((Number) pair2.d()).intValue();
        int intValue22 = ((Number) pair2.g()).intValue();
        i2 = this.g;
        int i42 = this.f;
        int i52 = this.e;
        if (i2 != 3) {
        }
        pair4 = pair3;
        bwt0.e0(this.d, ((Number) pair4.d()).intValue(), intValue3, ((Number) pair4.g()).intValue(), intValue22);
    }

    public final void setText(String str) {
        this.c.setText(str);
    }
}
