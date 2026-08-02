package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.views.PointerView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: ZoomInDrawOnboardingDialog.kt */
/* loaded from: classes4.dex */
public final class r6y0 extends Dialog implements DialogInterface.OnShowListener {
    public static final float f = alk.p(6);
    public static final float g = alk.p(14);
    public static final float h = alk.p(12);
    public static final float i = alk.p(18);
    public static final float j = alk.p(20);
    public static final float k = 1.0f;
    public static final float l = 2.0f;
    public final ow4 b;
    public final View c;
    public final PointerView d;
    public final PointerView e;

    public r6y0(Context context, ow4 ow4Var) {
        super(context, R.style.ZoomInDrawOnboardingDialogTheme);
        this.b = ow4Var;
        ColorDrawable colorDrawable = new ColorDrawable(1375731712);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(colorDrawable);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(R.style.ZoomInDrawOnboardingDialogAnimation);
        }
        setContentView(LayoutInflater.from(context).inflate(R.layout.dialog_zoom_in_draw_onboarding, (ViewGroup) null));
        this.d = (PointerView) findViewById(R.id.view_pointer_touch_top);
        this.e = (PointerView) findViewById(R.id.view_pointer_touch_bottom);
        this.c = findViewById(R.id.text_view_onboarding_title);
        setOnShowListener(this);
        setCancelable(false);
    }

    public static AnimatorSet b(PointerView pointerView, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(pointerView, (Property<PointerView, Float>) View.TRANSLATION_X, f2), ObjectAnimator.ofFloat(pointerView, (Property<PointerView, Float>) View.TRANSLATION_Y, f3));
        return animatorSet;
    }

    public final AnimatorSet a(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        PointerView pointerView = this.e;
        int i2 = 24;
        byte b = 0;
        int i3 = 9;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pointerView == null ? null : pointerView, new xe2("outerCircleRadius", new hwi0(i2), pointerView == null ? null : pointerView, new ldi(b, i3)), f2);
        PointerView pointerView2 = this.d;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pointerView2 == null ? null : pointerView2, new xe2("outerCircleRadius", new hwi0(i2), pointerView2 == null ? null : pointerView2, new ldi(b, i3)), f2);
        PointerView pointerView3 = pointerView == null ? null : pointerView;
        if (pointerView == null) {
            pointerView = null;
        }
        int i4 = 13;
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(pointerView3, new xe2("innerCircleRadius", new tml0(i4), pointerView, new z9g(12)), f3), ObjectAnimator.ofFloat(pointerView2 == null ? null : pointerView2, new xe2("innerCircleRadius", new tml0(i4), pointerView2 != null ? pointerView2 : null, new z9g(12)), f3));
        return animatorSet;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet a = a(g, f);
        View view = this.c;
        View view2 = view == null ? null : view;
        Property property = View.ALPHA;
        animatorSet2.playTogether(a, ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 1.0f));
        animatorSet2.setDuration(500L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        AnimatorSet a2 = a(i, h);
        PointerView pointerView = this.d;
        PointerView pointerView2 = pointerView == null ? null : pointerView;
        float f2 = j;
        float f3 = -f2;
        AnimatorSet b = b(pointerView2, f2, f3);
        PointerView pointerView3 = this.e;
        AnimatorSet b2 = b(pointerView3 == null ? null : pointerView3, f3, f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = k;
        ofFloat.addUpdateListener(new i4p0(1, this, ref$FloatRef));
        s3q0 s3q0Var = s3q0.a;
        animatorSet3.playTogether(a2, b, b2, ofFloat);
        animatorSet3.setDuration(1000L);
        animatorSet3.setStartDelay(100L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        if (view == null) {
            view = null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pointerView == null ? null : pointerView, (Property<PointerView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pointerView3 == null ? null : pointerView3, (Property<PointerView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AnimatorSet b3 = b(pointerView == null ? null : pointerView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (pointerView3 == null) {
            pointerView3 = null;
        }
        AnimatorSet b4 = b(pointerView3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        ref$FloatRef2.element = l;
        ofFloat5.addUpdateListener(new a980(1, this, ref$FloatRef2));
        animatorSet4.playTogether(ofFloat2, ofFloat3, ofFloat4, b3, b4, ofFloat5);
        animatorSet4.setDuration(1000L);
        we2.a(animatorSet4, new dtv0(this, 7));
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4);
        animatorSet.start();
    }
}
