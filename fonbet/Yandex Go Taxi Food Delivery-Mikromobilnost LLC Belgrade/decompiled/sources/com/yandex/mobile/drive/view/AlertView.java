package com.yandex.mobile.drive.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import androidx.transition.AutoTransition;
import androidx.transition.ChangeScroll;
import androidx.transition.Scene;
import androidx.transition.TransitionManager;
import com.yandex.mobile.drive.uikit.window.DecorationColor;
import com.yandex.mobile.drive.view.AlertView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.d4;
import defpackage.dvw;
import defpackage.g651;
import defpackage.h651;
import defpackage.i851;
import defpackage.j0;
import defpackage.j18;
import defpackage.k4o;
import defpackage.lhc;
import defpackage.mxp0;
import defpackage.ni91;
import defpackage.pey;
import defpackage.qq1;
import defpackage.qx60;
import defpackage.r751;
import defpackage.ro1;
import defpackage.s2u0;
import defpackage.sls;
import defpackage.tj;
import defpackage.tls;
import defpackage.tr1;
import defpackage.u90;
import defpackage.ur1;
import defpackage.v5;
import defpackage.w511;
import defpackage.y6i0;
import defpackage.zgh0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001eB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJi\u0010\u001c\u001a\u00020\u001a2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b#\u0010$Jk\u0010%\u001a\u00020\u001a2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b%\u0010\u001dJ-\u0010*\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u00072\u0006\u0010'\u001a\u00020/2\u0006\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001aH\u0002¢\u0006\u0004\b2\u0010\"J\u001d\u00104\u001a\u00020\u001a2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b4\u0010 J\u001d\u00105\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b5\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00107R$\u0010:\u001a\u0002082\u0006\u00109\u001a\u0002088\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010?\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u00020I2\u0006\u00109\u001a\u00020I8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010P\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010S\u001a\n O*\u0004\u0018\u00010R0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010U\u001a\n O*\u0004\u0018\u00010/0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010W\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010QR\u001c\u0010X\u001a\n O*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010Z\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010QR\u001c\u0010[\u001a\n O*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR\u001c\u0010\\\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010QR\u001c\u0010^\u001a\n O*\u0004\u0018\u00010]0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010`R$\u0010d\u001a\u00020I2\u0006\u00109\u001a\u00020I8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010M¨\u0006f"}, d2 = {"Lcom/yandex/mobile/drive/view/AlertView;", "Landroid/widget/FrameLayout;", "Lpey;", "Landroid/content/Context;", "context", "Lh651;", "windowDecorator", "", "overrideStyle", "Lqx60;", "onBackPressedDispatcher", "", "layoutId", "<init>", "(Landroid/content/Context;Lh651;ZLqx60;I)V", "textId", "", "text", "detailsId", "details", "", "Lqq1;", "buttons", "iconId", "closeButton", "Lkotlin/Function0;", "Lzy11;", "onCancel", "show", "(Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/Integer;ZLsls;)V", "after", "dismiss", "(Lsls;)V", "destroy", "()V", "awaitDismiss", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Landroid/widget/TextView;", "view", "resId", "string", "updateText", "(Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/CharSequence;)Z", "button", "addButton", "(Lqq1;)V", "Lcom/yandex/mobile/drive/view/AlertButtonView;", "bindButton", "(Lcom/yandex/mobile/drive/view/AlertButtonView;Lqq1;)Z", "dismissWithCancellation", "onDone", "showInternal", "doDismiss", "Lh651;", "Z", "Lcom/yandex/mobile/drive/view/AlertView$State;", "value", ClidProvider.STATE, "Lcom/yandex/mobile/drive/view/AlertView$State;", "setState", "(Lcom/yandex/mobile/drive/view/AlertView$State;)V", "Landroidx/lifecycle/t;", "lifecycle", "Landroidx/lifecycle/t;", "getLifecycle", "()Landroidx/lifecycle/t;", "", "callbacks", "Ljava/util/List;", "Landroid/animation/ValueAnimator;", "currentAnimation", "Landroid/animation/ValueAnimator;", "", "_progress", "F", "set_progress", "(F)V", "Landroid/view/View;", "kotlin.jvm.PlatformType", "alert", "Landroid/view/View;", "Landroid/view/ViewGroup;", "buttonList", "Landroid/view/ViewGroup;", "cancel", "Lcom/yandex/mobile/drive/view/AlertButtonView;", "main", Constants.KEY_MESSAGE, "Landroid/widget/TextView;", "separator", "title", "topSpace", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "Lsls;", "getProgress", "()F", "setProgress", "progress", "State", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AlertView extends FrameLayout implements pey {
    private float _progress;
    private final View alert;
    private final ViewGroup buttonList;
    private List<sls> callbacks;
    private final AlertButtonView cancel;
    private ValueAnimator currentAnimation;
    private final ImageView icon;
    private final t lifecycle;
    private final View main;
    private final TextView message;
    private sls onCancel;
    private final boolean overrideStyle;
    private final View separator;
    private State state;
    private final TextView title;
    private final View topSpace;
    private final h651 windowDecorator;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/mobile/drive/view/AlertView$State;", "", "Closed", "Opened", "InTransition", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Closed;
        public static final State InTransition;
        public static final State Opened;

        static {
            State state = new State("Closed", 0);
            Closed = state;
            State state2 = new State("Opened", 1);
            Opened = state2;
            State state3 = new State("InTransition", 2);
            InTransition = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public AlertView(Context context, h651 h651Var, boolean z, qx60 qx60Var, int i) {
        super(context);
        this.windowDecorator = h651Var;
        this.overrideStyle = z;
        this.state = State.Closed;
        final int i2 = 1;
        this.lifecycle = new t(this, true);
        if (qx60Var != null) {
            qx60Var.a(this, new a(this));
        }
        this.callbacks = new ArrayList();
        setVisibility(4);
        LayoutInflater.from(context).inflate(i, this);
        View findViewById = findViewById(zgh0.alert);
        this.alert = findViewById;
        this.buttonList = (ViewGroup) findViewById(zgh0.buttonList);
        AlertButtonView alertButtonView = (AlertButtonView) findViewById(zgh0.cancel);
        this.cancel = alertButtonView;
        View findViewById2 = findViewById(zgh0.main);
        this.main = findViewById2;
        this.message = (TextView) findViewById(zgh0.message);
        this.separator = findViewById(zgh0.separator);
        this.title = (TextView) findViewById(zgh0.title);
        this.topSpace = findViewById(zgh0.topSpace);
        this.icon = (ImageView) findViewById(zgh0.icon);
        this.onCancel = new ro1(5);
        findViewById.addOnLayoutChangeListener(new u90(2, this));
        d.a(alertButtonView).setListener(new tls(this) { // from class: rr1
            public final /* synthetic */ AlertView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 _init_$lambda$3;
                zy11 _init_$lambda$2;
                int i3 = i2;
                AlertView alertView = this.b;
                zy11 zy11Var = (zy11) obj;
                switch (i3) {
                    case 0:
                        _init_$lambda$3 = AlertView._init_$lambda$3(alertView, zy11Var);
                        return _init_$lambda$3;
                    default:
                        _init_$lambda$2 = AlertView._init_$lambda$2(alertView, zy11Var);
                        return _init_$lambda$2;
                }
            }
        });
        final int i3 = 0;
        d.a(this).setListener(new tls(this) { // from class: rr1
            public final /* synthetic */ AlertView b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 _init_$lambda$3;
                zy11 _init_$lambda$2;
                int i32 = i3;
                AlertView alertView = this.b;
                zy11 zy11Var = (zy11) obj;
                switch (i32) {
                    case 0:
                        _init_$lambda$3 = AlertView._init_$lambda$3(alertView, zy11Var);
                        return _init_$lambda$3;
                    default:
                        _init_$lambda$2 = AlertView._init_$lambda$2(alertView, zy11Var);
                        return _init_$lambda$2;
                }
            }
        });
        findViewById2.setClipToOutline(true);
        alertButtonView.setClipToOutline(true);
        ni91.j(findViewById, new s2u0(27));
        getLifecycle().i(Lifecycle.State.CREATED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AlertView alertView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        alertView.setProgress(alertView.get_progress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$2(AlertView alertView, zy11 zy11Var) {
        alertView.dismissWithCancellation();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$3(AlertView alertView, zy11 zy11Var) {
        alertView.dismissWithCancellation();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addButton(qq1 button) {
        AlertButtonView alertButtonView = new AlertButtonView(getContext(), null, 2, 0 == true ? 1 : 0);
        if (!bindButton(alertButtonView, button)) {
            alertButtonView = null;
        }
        if (alertButtonView != null) {
            this.buttonList.addView(alertButtonView);
        }
    }

    private final boolean bindButton(AlertButtonView view, qq1 button) {
        CharSequence charSequence = button.a;
        Integer num = button.b;
        if (charSequence == null) {
            if (num == null) {
                return false;
            }
            charSequence = getContext().getString(num.intValue());
        }
        view.setContent(charSequence, null, null);
        view.setHintColor(button.d);
        view.setOnTap(button.c);
        view.setDismissOnTap(button.f);
        d.a(view).setListener(new v5(12, view, this));
        button.e.invoke(view);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindButton$lambda$10(AlertButtonView alertButtonView, AlertView alertView, zy11 zy11Var) {
        if (alertButtonView.getDismissOnTap()) {
            dismiss$default(alertView, null, 1, null);
        }
        alertButtonView.getOnTap().invoke(alertButtonView);
        return zy11.a;
    }

    public static /* synthetic */ void dismiss$default(AlertView alertView, sls slsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            slsVar = new ro1(4);
        }
        alertView.dismiss(slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 dismiss$lambda$13(AlertView alertView, sls slsVar) {
        alertView.doDismiss(slsVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissWithCancellation() {
        dismiss(this.onCancel);
    }

    private final void doDismiss(sls after) {
        setState(State.InTransition);
        getLifecycle().i(Lifecycle.State.CREATED);
        ValueAnimator duration = ValueAnimator.ofFloat(get_progress(), 0.0f).setDuration((long) (get_progress() * 250.0f));
        duration.addUpdateListener(new mxp0(25, new tr1(this, 0)));
        duration.setInterpolator(new AccelerateInterpolator());
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.mobile.drive.view.AlertView$doDismiss$$inlined$addOnEndListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                AlertView.this.destroy();
                AlertView.this.setState(AlertView.State.Closed);
            }
        });
        duration.start();
        ValueAnimator valueAnimator = this.currentAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimation = duration;
        after.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 doDismiss$lambda$14(AlertView alertView, Object obj, float f) {
        alertView.setProgress(((Float) obj).floatValue());
        return zy11.a;
    }

    /* renamed from: getProgress, reason: from getter */
    private final float get_progress() {
        return this._progress;
    }

    private final void setProgress(float f) {
        set_progress(y6i0.c(f, 0.0f, 1.0f));
        this.alert.setTranslationY((1.0f - this._progress) * r3.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(State state) {
        this.state = state;
        setClickable(state != State.Closed);
        List<sls> list = this.callbacks;
        this.callbacks = new ArrayList();
        Iterator<sls> it = list.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
    }

    private final void set_progress(float f) {
        this._progress = f;
        setVisibility((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0 ? 4 : 0);
        setBackgroundColor(lhc.f(ModalContentViewContainer.BASE_SHADOW_COLOR, (int) (f * 153.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 show$lambda$5(AlertView alertView) {
        alertView.getLifecycle().i(Lifecycle.State.RESUMED);
        alertView.setState(State.Opened);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 show$lambda$6(AlertView alertView, Integer num, CharSequence charSequence, Integer num2, CharSequence charSequence2, List list, Integer num3, boolean z, sls slsVar) {
        alertView.show(num, charSequence, num2, charSequence2, list, num3, z, slsVar);
        return zy11.a;
    }

    private final void showInternal(final sls onDone) {
        float f = get_progress();
        ValueAnimator duration = ValueAnimator.ofFloat(f, 1.0f).setDuration((long) ((1.0f - f) * 250.0f));
        duration.addUpdateListener(new mxp0(25, new tr1(this, 1)));
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.mobile.drive.extensions.AnimatorKt$addOnEndListener$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                sls.this.invoke();
            }
        });
        duration.setInterpolator(new DecelerateInterpolator());
        duration.start();
        ValueAnimator valueAnimator = this.currentAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.currentAnimation = duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showInternal$lambda$11(AlertView alertView, Object obj, float f) {
        alertView.setProgress(((Float) obj).floatValue());
        return zy11.a;
    }

    private final void update(Integer textId, CharSequence text, Integer detailsId, CharSequence details, List<qq1> buttons, Integer iconId, boolean closeButton, sls onCancel) {
        this.cancel.setVisibility(closeButton ? 0 : 8);
        ImageView imageView = this.icon;
        if (iconId != null) {
            imageView.setImageResource(iconId.intValue());
            this.icon.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        boolean z = updateText(this.message, detailsId, details) || updateText(this.title, textId, text);
        this.topSpace.setVisibility(z ? 0 : 8);
        this.separator.setVisibility(z ? 0 : 8);
        this.buttonList.removeAllViews();
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            addButton((qq1) it.next());
        }
        this.buttonList.setVisibility(buttons.isEmpty() ? 8 : 0);
        this.onCancel = onCancel;
    }

    private final boolean updateText(TextView view, Integer resId, CharSequence string) {
        if (string != null) {
            view.setText(string);
            view.setVisibility(0);
            return true;
        }
        if (resId == null) {
            view.setVisibility(8);
            return false;
        }
        view.setText(resId.intValue());
        view.setVisibility(0);
        return true;
    }

    public final Object awaitDismiss(Continuation<? super zy11> continuation) {
        if (getLifecycle().w != Lifecycle.State.DESTROYED) {
            j18 j18Var = new j18(1, dvw.b(continuation));
            j18Var.u();
            ur1 ur1Var = new ur1(0, j18Var, this);
            getLifecycle().a(ur1Var);
            j18Var.w(new tj(3, this, ur1Var));
            Object s = j18Var.s();
            if (s == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return s;
            }
        }
        return zy11.a;
    }

    public final void destroy() {
        this.buttonList.removeAllViews();
        ValueAnimator valueAnimator = this.currentAnimation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        getLifecycle().i(Lifecycle.State.DESTROYED);
    }

    public final void dismiss(sls after) {
        int i = b.a[this.state.ordinal()];
        if (i == 1) {
            doDismiss(after);
            return;
        }
        if (i == 2) {
            after.invoke();
        } else if (i == 3) {
            this.callbacks.add(new j0(23, this, after));
        } else {
            w511.b();
        }
    }

    public final void show(final Integer textId, final CharSequence text, final Integer detailsId, final CharSequence details, final List<qq1> buttons, final Integer iconId, final boolean closeButton, final sls onCancel) {
        int i = b.a[this.state.ordinal()];
        int i2 = 0;
        if (i == 1) {
            setState(State.InTransition);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.Z(new ChangeScroll());
            autoTransition.d0(0);
            autoTransition.P(350L);
            autoTransition.X(new c(this));
            Scene scene = new Scene();
            scene.a = this;
            TransitionManager.d(scene, autoTransition);
            update(textId, text, detailsId, details, buttons, iconId, closeButton, onCancel);
            setProgress(1.0f);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.callbacks.add(new sls() { // from class: sr1
                    @Override // defpackage.sls
                    public final Object invoke() {
                        zy11 show$lambda$6;
                        show$lambda$6 = AlertView.show$lambda$6(AlertView.this, textId, text, detailsId, details, buttons, iconId, closeButton, onCancel);
                        return show$lambda$6;
                    }
                });
                return;
            } else {
                w511.b();
                return;
            }
        }
        setState(State.InTransition);
        if (this.overrideStyle) {
            i851 i851Var = new i851(DecorationColor.Transparent, 1);
            h651 h651Var = this.windowDecorator;
            r751 r751Var = h651Var.d;
            DecorationColor decorationColor = i851Var.b;
            Boolean bool = i851Var.a;
            if (bool != null || decorationColor != null) {
                if (bool != null) {
                    r751Var.a(!bool.booleanValue());
                }
                if (decorationColor == null) {
                    decorationColor = h651Var.e;
                }
                boolean booleanValue = bool != null ? bool.booleanValue() : h651Var.f;
                if (h651Var.e != decorationColor || h651Var.f != booleanValue) {
                    h651Var.e = decorationColor;
                    h651Var.f = booleanValue;
                    Window window = h651Var.a;
                    int i3 = g651.a[decorationColor.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            w511.b();
                            return;
                        }
                        i2 = (int) (booleanValue ? 1275068416L : 3019898879L);
                    }
                    window.setNavigationBarColor(i2);
                }
            }
        }
        update(textId, text, detailsId, details, buttons, iconId, closeButton, onCancel);
        getLifecycle().i(Lifecycle.State.STARTED);
        showInternal(new d4(25, this));
    }

    @Override // defpackage.pey
    public t getLifecycle() {
        return this.lifecycle;
    }
}
