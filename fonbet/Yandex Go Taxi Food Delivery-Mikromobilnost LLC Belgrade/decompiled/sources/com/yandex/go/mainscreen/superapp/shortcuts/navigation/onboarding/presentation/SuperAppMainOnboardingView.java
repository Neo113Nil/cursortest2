package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.analytics.evgen.MainScreenOnboardingAnalytics$ClickTarget;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.a1w0;
import defpackage.b64;
import defpackage.bae0;
import defpackage.c1w0;
import defpackage.c2x0;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.d1w0;
import defpackage.d2x0;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.f1w0;
import defpackage.hbp0;
import defpackage.ip11;
import defpackage.j170;
import defpackage.j18;
import defpackage.lnv0;
import defpackage.m2y;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.r8c0;
import defpackage.scc;
import defpackage.sei0;
import defpackage.sls;
import defpackage.tei0;
import defpackage.tj;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uj;
import defpackage.vmu0;
import defpackage.x0w0;
import defpackage.xbg0;
import defpackage.xm91;
import defpackage.xng0;
import defpackage.xsq0;
import defpackage.xw31;
import defpackage.y0w0;
import defpackage.zmh;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 G2\u00020\u0001:\u0002HIBM\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJK\u0010*\u001a\u00020\u0018*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J;\u00100\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u0004\u0018\u00010.2\u0006\u00102\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0018H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0018H\u0014¢\u0006\u0004\b7\u00106J9\u00109\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00108\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006J"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/shortcuts/navigation/onboarding/presentation/SuperAppMainOnboardingView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "activity", "Ly0w0;", "presenter", "Lip11;", "typefaceDelegate", "Lc2x0;", "systemBarsCoordinator", "Lbae0;", "popupPriorityLauncher", "Landroid/view/View;", "mainScreenRoot", "Ltt2;", "appDispatchers", "<init>", "(Landroid/content/Context;Landroid/app/Activity;Ly0w0;Lip11;Lc2x0;Lbae0;Landroid/view/View;Ltt2;)V", "", "shortcutId", "Lj170;", "onboarding", "Lzy11;", "setDismissTouch", "(Ljava/lang/String;Lj170;)V", "Landroid/graphics/Point;", "getLocationOnScreen", "(Landroid/view/View;)Landroid/graphics/Point;", "Lru/yandex/taxi/widget/RobotoTextView;", "", "text", "", "shortcutIsOnLeftSide", "", "leftPadding", "rightPadding", "Lkotlin/Function0;", "onClick", "Landroid/graphics/Typeface;", "typeface", "initTextView", "(Lru/yandex/taxi/widget/RobotoTextView;Ljava/lang/CharSequence;ZIILsls;Landroid/graphics/Typeface;)V", "onboardingView", "", "Landroid/graphics/Bitmap;", "otherBitmaps", "showOnboarding", "(Landroid/view/View;Lj170;Ljava/lang/String;Ljava/util/Map;)V", "view", "getPixelCopyBitmap", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "shortcutBitmap", "attachOnboardingView", "(Ljava/lang/String;Lj170;Landroid/graphics/Bitmap;Ljava/util/Map;)V", "Landroid/app/Activity;", "Ly0w0;", "Lip11;", "Lc2x0;", "Lbae0;", "Landroid/view/View;", "Ltt2;", "Lhbp0;", "scope", "Lhbp0;", "shouldBeVisible", "Z", "Companion", "com/yandex/go/mainscreen/superapp/shortcuts/navigation/onboarding/presentation/b", "f1w0", "navigation"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppMainOnboardingView extends FrameLayout {
    private static final long ANIMATION_DURATION = 300;
    private static final float BACKGROUND_ROOT_CAPACITY = 0.9f;
    private static final long DELAY_FOR_RELOAD = 150;
    private static final String IMAGE_TAG = "image";
    public static final String ONBOARDING_POPUP_ID = "superapp_main_onboarding";
    private final Activity activity;
    private final tt2 appDispatchers;
    private final View mainScreenRoot;
    private final bae0 popupPriorityLauncher;
    private final y0w0 presenter;
    private final hbp0 scope;
    private boolean shouldBeVisible;
    private final c2x0 systemBarsCoordinator;
    private final ip11 typefaceDelegate;
    public static final f1w0 Companion = new f1w0();
    private static final List<String> overlappingContainers = scc.g("banners_container", "top_modal_views_container");

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppMainOnboardingView(Context context, Activity activity, y0w0 y0w0Var, ip11 ip11Var, c2x0 c2x0Var, bae0 bae0Var, View view, tt2 tt2Var) {
        super(context);
        this.activity = activity;
        this.presenter = y0w0Var;
        this.typefaceDelegate = ip11Var;
        this.systemBarsCoordinator = c2x0Var;
        this.popupPriorityLauncher = bae0Var;
        this.mainScreenRoot = view;
        this.appDispatchers = tt2Var;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setAlpha(0.0f);
        setZ(Float.MAX_VALUE);
        setDismissTouch(null, null);
        this.scope = new hbp0(new SuperAppMainOnboardingView$scope$1(0, tt2Var, tt2.class, "main", "main()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 attachOnboardingView$lambda$2(ViewGroup viewGroup, SuperAppMainOnboardingView superAppMainOnboardingView, j170 j170Var, String str) {
        viewGroup.getChildAt(0).performClick();
        y0w0 y0w0Var = superAppMainOnboardingView.presenter;
        y0w0Var.C.b(j170Var);
        y0w0Var.A.a.h(j170Var.a, str, MainScreenOnboardingAnalytics$ClickTarget.Shortcut);
        a1w0 a1w0Var = y0w0Var.B;
        a1w0Var.getClass();
        Map map = j170Var.d;
        if (map != null) {
            ((tei0) ((sei0) a1w0Var.b.getValue())).a(new SendRealtimeAnalyticsAction.Event(PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, j170Var.a, CreativeType.MainScreenOnboarding.getCreativeName(), RealtimeEventType.Clicked.getEventName(), xsq0.b(map)));
        }
        ((x0w0) y0w0Var.Dg()).u1();
        return zy11.a;
    }

    private final Point getLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, uj] */
    public final Object getPixelCopyBitmap(View view, Continuation<? super Bitmap> continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        Ref$ObjectRef y = b64.y(j18Var);
        cx60 cx60Var = new cx60(10, y);
        cl7 cl7Var = new cl7(j18Var, cx60Var);
        SuperAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2 superAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2 = new SuperAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2(cl7Var);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        rect.offsetTo(iArr[0], iArr[1]);
        int i = -((int) view.getElevation());
        rect.inset(i, i);
        if (rect.width() < 1 || rect.height() < 1) {
            superAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2.invoke(null);
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            xm91.c(this.activity.getWindow(), rect, createBitmap, getHandler(), new tj(26, superAppMainOnboardingView$getPixelCopyBitmap$$inlined$suspendCallbackApi$2, createBitmap));
        }
        y.element = uj.H;
        if (cl7Var.c()) {
            cx60Var.invoke();
        } else {
            j18Var.w(new dx60(cl7Var, 11));
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    private final void initTextView(RobotoTextView robotoTextView, CharSequence charSequence, boolean z, int i, int i2, sls slsVar, Typeface typeface) {
        if (getLayoutDirection() != 0) {
            z = !z;
        }
        int i3 = 3;
        robotoTextView.setTextAlignment(z ? 2 : 3);
        robotoTextView.setText(charSequence);
        robotoTextView.setPadding(i, 0, i2, 0);
        robotoTextView.setOnClickListener(new xbg0(10, slsVar));
        if (typeface != null) {
            robotoTextView.setTypeface(typeface);
        }
        robotoTextView.post(new lnv0(i3, robotoTextView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initTextView$lambda$2(RobotoTextView robotoTextView) {
        robotoTextView.getLayoutParams().height = robotoTextView.getLineHeight() * robotoTextView.getLineCount();
        robotoTextView.requestLayout();
    }

    private final void setDismissTouch(final String shortcutId, final j170 onboarding) {
        setOnTouchListener(new View.OnTouchListener() { // from class: e1w0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean dismissTouch$lambda$0;
                dismissTouch$lambda$0 = SuperAppMainOnboardingView.setDismissTouch$lambda$0(SuperAppMainOnboardingView.this, onboarding, shortcutId, view, motionEvent);
                return dismissTouch$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDismissTouch$lambda$0(SuperAppMainOnboardingView superAppMainOnboardingView, j170 j170Var, String str, View view, MotionEvent motionEvent) {
        Object value;
        superAppMainOnboardingView.setOnTouchListener(null);
        y0w0 y0w0Var = superAppMainOnboardingView.presenter;
        if (j170Var == null) {
            r0 r0Var = y0w0Var.C.b.d;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, c1w0.a((c1w0) value, null, 11)));
            ((x0w0) y0w0Var.Dg()).A2();
            return false;
        }
        if (str == null) {
            str = "";
        }
        y0w0Var.C.b(j170Var);
        y0w0Var.A.a.i(j170Var.a, str);
        ((x0w0) y0w0Var.Dg()).u1();
        return true;
    }

    private final void showOnboarding(View onboardingView, j170 onboarding, String shortcutId, Map<View, Bitmap> otherBitmaps) {
        Bitmap t = xw31.t(this.mainScreenRoot);
        Canvas canvas = new Canvas(t);
        Iterator<Map.Entry<View, Bitmap>> it = otherBitmaps.entrySet().iterator();
        while (it.hasNext()) {
            canvas.drawBitmap(it.next().getValue(), 0.0f, getLocationOnScreen(r2.getKey()).y, new Paint());
        }
        Paint paint = new Paint();
        paint.setColor(Color.argb((int) (Color.alpha(ModalContentViewContainer.BASE_SHADOW_COLOR) * BACKGROUND_ROOT_CAPACITY), Color.red(ModalContentViewContainer.BASE_SHADOW_COLOR), Color.green(ModalContentViewContainer.BASE_SHADOW_COLOR), Color.blue(ModalContentViewContainer.BASE_SHADOW_COLOR)));
        canvas.drawRect(0.0f, 0.0f, t.getWidth(), t.getHeight(), paint);
        setBackground(new BitmapDrawable(getResources(), t));
        addView(onboardingView);
        setDismissTouch(shortcutId, onboarding);
        y0w0 y0w0Var = this.presenter;
        y0w0Var.A.a.j(onboarding.a, shortcutId);
        tje.N(y0w0Var.Jg(), null, null, new SuperAppMainOnboardingPresenter$onboardingShowed$1(y0w0Var, onboarding, null), 3);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new d1w0(this, 0));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView$showOnboarding$lambda$1$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                c2x0 c2x0Var;
                SuperAppMainOnboardingView.this.setVisibility(0);
                c2x0Var = SuperAppMainOnboardingView.this.systemBarsCoordinator;
                ((d2x0) c2x0Var).a(0, qoi0.a(ofFloat.getClass()), true);
            }
        });
        if (this.shouldBeVisible) {
            ofFloat.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOnboarding$lambda$1$0(SuperAppMainOnboardingView superAppMainOnboardingView, ValueAnimator valueAnimator) {
        superAppMainOnboardingView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public final void attachOnboardingView(String shortcutId, j170 onboarding, Bitmap shortcutBitmap, Map<View, Bitmap> otherBitmaps) {
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) getParent()).findViewWithTag(shortcutId);
        if (viewGroup == null) {
            return;
        }
        float w = tje.w(8, getContext());
        float w2 = tje.w(12, getContext());
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        int i = (int) w;
        int i2 = width + i;
        int i3 = (int) w2;
        int i4 = height + i3;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(qje.t(xng0.bgMain, getContext()));
        Path path = new Path();
        float f = width + w;
        float f2 = height + w2;
        path.addRoundRect(new RectF(0.0f, 0.0f, f, f2), tje.w(24, getContext()), tje.w(24, getContext()), Path.Direction.CW);
        Canvas canvas = new Canvas(createBitmap);
        canvas.clipPath(path);
        canvas.drawRect(0.0f, 0.0f, f, f2, paint);
        canvas.drawBitmap(shortcutBitmap, w / 2.0f, w2 / 2.0f, new Paint());
        boolean z = (viewGroup.getWidth() / 2) + getLocationOnScreen(viewGroup).x <= this.mainScreenRoot.getWidth() / 2;
        int w3 = z ? (getLocationOnScreen(viewGroup).x - i) + ((int) tje.w(4, getContext())) : 0;
        int width2 = z ? 0 : (this.mainScreenRoot.getWidth() - getLocationOnScreen(viewGroup).x) - viewGroup.getWidth();
        int width3 = getWidth();
        r8c0 r8c0Var = new r8c0(viewGroup, this, onboarding, shortcutId, 15);
        boolean z2 = z;
        m2y s = m2y.s(LayoutInflater.from(getContext()), this);
        FrameLayout frameLayout = (FrameLayout) s.d;
        RobotoTextView robotoTextView = (RobotoTextView) s.e;
        CharSequence charSequence = onboarding.b;
        ip11 ip11Var = this.typefaceDelegate;
        getContext();
        int i5 = w3;
        int i6 = width2;
        initTextView(robotoTextView, charSequence, z2, i5, i6, r8c0Var, ((zmh) ip11Var).e());
        initTextView((RobotoTextView) s.b, onboarding.c, z2, i5, i6, r8c0Var, null);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(createBitmap);
        imageView.setOnClickListener(new vmu0(4, r8c0Var));
        frameLayout.addView(imageView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.topMargin = getLocationOnScreen(viewGroup).y - (i3 / 2);
        layoutParams.leftMargin = getLocationOnScreen(viewGroup).x - (i / 2);
        c.D(i2, frameLayout.getLayoutParams().height, frameLayout);
        c.D(frameLayout.getLayoutParams().width, i4, frameLayout);
        s.r().measure(View.MeasureSpec.makeMeasureSpec(width3, 1073741824), 0);
        if (s.r().getMeasuredHeight() <= getHeight()) {
            showOnboarding(s.r(), onboarding, shortcutId, otherBitmaps);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scope.a();
        y0w0 y0w0Var = this.presenter;
        b bVar = new b(this);
        y0w0Var.Bg(bVar);
        tje.N(y0w0Var.Jg(), null, null, new SuperAppMainOnboardingPresenter$attachView$1(y0w0Var, bVar, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.scope.b();
        this.presenter.Cg();
    }
}
