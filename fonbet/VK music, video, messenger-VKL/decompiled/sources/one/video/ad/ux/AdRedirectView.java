package one.video.ad.ux;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import one.video.ad.ux.AdRedirectView;
import xsna.asp;
import xsna.ck80;
import xsna.eog0;
import xsna.epx;
import xsna.gq9;
import xsna.ih7;
import xsna.k9q0;
import xsna.kiw;
import xsna.m33;
import xsna.sh0;
import xsna.x5r0;
import xsna.zjw;
import xsna.zrp;

/* compiled from: AdRedirectView.kt */
/* loaded from: classes8.dex */
public final class AdRedirectView extends LinearLayout {
    public static final int h = (int) x5r0.a(4, 1);
    public static final int i = (int) x5r0.a(8, 1);
    public static final int j = (int) x5r0.a(20, 1);
    public static final int k = (int) x5r0.a(28, 1);
    public static final int l = (int) x5r0.a(50, 1);
    public final ck80 b;
    public final ValueAnimator c;
    public zjw d;
    public gq9 e;
    public sh0 f;
    public Type g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdRedirectView.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CATALOG;
        public static final Type DISCOVERY;
        public static final Type POST_VIEW;
        public static final Type REDIRECT_INSIDE;

        static {
            Type type = new Type("CATALOG", 0);
            CATALOG = type;
            Type type2 = new Type("DISCOVERY", 1);
            DISCOVERY = type2;
            Type type3 = new Type("POST_VIEW", 2);
            POST_VIEW = type3;
            Type type4 = new Type("REDIRECT_INSIDE", 3);
            REDIRECT_INSIDE = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: AdRedirectView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.REDIRECT_INSIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.CATALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.POST_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.DISCOVERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AdRedirectView.kt */
    public static final class b implements zjw.a {
        public b() {
        }

        @Override // xsna.zjw.a
        public final void a(Bitmap bitmap) {
            AppCompatImageView appCompatImageView = AdRedirectView.this.b.b;
            Object obj = x5r0.a;
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            float f = min;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawOval(rectF, paint);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            canvas.drawOval(rectF, paint);
            appCompatImageView.setImageBitmap(createBitmap);
        }

        @Override // xsna.zjw.a
        public final void onError() {
            AdRedirectView.this.b.b.setImageBitmap(null);
        }
    }

    public AdRedirectView(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final void setButtonColor(Integer num) {
        int intValue = num != null ? num.intValue() : getContext().getColor(R.color.one_video_azure_300);
        int color = getContext().getColor(R.color.one_video_white);
        Drawable a2 = m33.a(R.drawable.one_video_background_rounded_8, getContext());
        if (a2 != null) {
            a2.setTint(intValue);
        } else {
            a2 = null;
        }
        this.b.e.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[]{android.R.attr.state_activated}, new int[0]}, new int[]{color, color, color, intValue}), a2, null));
    }

    public final void a(sh0 sh0Var, Type type) {
        int i2;
        int i3;
        String str = sh0Var.d;
        if (epx.f(this.f, sh0Var) && this.g == type) {
            return;
        }
        this.f = sh0Var;
        this.g = type;
        ck80 ck80Var = this.b;
        AppCompatTextView appCompatTextView = ck80Var.g;
        ProgressBar progressBar = ck80Var.d;
        AppCompatTextView appCompatTextView2 = ck80Var.e;
        FrameLayout frameLayout = ck80Var.c;
        AppCompatImageView appCompatImageView = ck80Var.b;
        appCompatTextView.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        ck80Var.g.setText(str);
        appCompatTextView2.setText(sh0Var.a);
        Integer num = sh0Var.c;
        if (num != null) {
            appCompatTextView2.setTextColor(num.intValue());
        }
        setButtonColor(sh0Var.b);
        appCompatImageView.setImageBitmap(null);
        int[] iArr = a.$EnumSwitchMapping$0;
        int i4 = iArr[type.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            i2 = j;
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = k;
        }
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams.height != i2 || layoutParams.width != i2) {
            layoutParams.width = i2;
            layoutParams.height = i2;
            appCompatImageView.setLayoutParams(layoutParams);
        }
        int i5 = iArr[type.ordinal()];
        if (i5 == 1 || i5 == 2 || i5 == 3) {
            i3 = h;
        } else {
            if (i5 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = i;
        }
        Object obj = x5r0.a;
        x5r0.e(i3, frameLayout);
        kiw kiwVar = sh0Var.e;
        String str2 = kiwVar != null ? kiwVar.a : null;
        if (str2 != null) {
            frameLayout.setVisibility(0);
            gq9 gq9Var = this.e;
            if (gq9Var != null) {
                gq9Var.cancel();
            }
            zjw zjwVar = this.d;
            if (zjwVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.e = zjwVar.a(Uri.parse(str2), new b(), new ih7[0]);
        } else {
            frameLayout.setVisibility(8);
        }
        progressBar.setProgress(0);
        progressBar.setVisibility(8);
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator.isRunning()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.end();
        gq9 gq9Var = this.e;
        if (gq9Var != null) {
            gq9Var.cancel();
        }
        this.e = null;
    }

    public final void setBtnClickListener(View.OnClickListener onClickListener) {
        this.b.e.setOnClickListener(onClickListener);
    }

    public final void setImageLoader(zjw zjwVar) {
        this.d = zjwVar;
    }

    public final void setTextColor(int i2) {
        this.b.g.setTextColor(i2);
    }

    public AdRedirectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public AdRedirectView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 8, 0);
    }

    public /* synthetic */ AdRedirectView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, 0);
    }

    public AdRedirectView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        LayoutInflater.from(context).inflate(R.layout.one_video_ad_redirect_view, this);
        int i4 = R.id.icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) k9q0.j(R.id.icon, this);
        if (appCompatImageView != null) {
            i4 = R.id.icon_container;
            FrameLayout frameLayout = (FrameLayout) k9q0.j(R.id.icon_container, this);
            if (frameLayout != null) {
                i4 = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) k9q0.j(R.id.progressBar, this);
                if (progressBar != null) {
                    i4 = R.id.redirect_button;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.redirect_button, this);
                    if (appCompatTextView != null) {
                        i4 = R.id.shimmerOverlay;
                        FrameLayout frameLayout2 = (FrameLayout) k9q0.j(R.id.shimmerOverlay, this);
                        if (frameLayout2 != null) {
                            i4 = R.id.url_title;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) k9q0.j(R.id.url_title, this);
                            if (appCompatTextView2 != null) {
                                this.b = new ck80(this, appCompatImageView, frameLayout, progressBar, appCompatTextView, frameLayout2, appCompatTextView2);
                                final ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                ofFloat.setDuration(2500L);
                                ofFloat.setRepeatMode(1);
                                ofFloat.setRepeatCount(-1);
                                ofFloat.setInterpolator(new LinearInterpolator());
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.th0
                                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        int i5 = AdRedirectView.h;
                                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        float duration = 1000.0f / ofFloat.getDuration();
                                        AdRedirectView adRedirectView = this;
                                        if (floatValue >= duration) {
                                            adRedirectView.b.f.setVisibility(8);
                                            return;
                                        }
                                        ck80 ck80Var = adRedirectView.b;
                                        ck80Var.f.setVisibility(0);
                                        int i6 = AdRedirectView.l;
                                        FrameLayout frameLayout3 = ck80Var.f;
                                        float f = floatValue / duration;
                                        float f2 = -i6;
                                        float width = (frameLayout3.getWidth() + (i6 * 2)) * f;
                                        frameLayout3.getBackground().setBounds((int) (f2 + width), 0, (int) width, frameLayout3.getHeight());
                                    }
                                });
                                this.c = ofFloat;
                                frameLayout2.setClipToOutline(true);
                                frameLayout2.setOutlineProvider(new eog0(i));
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
    }
}
