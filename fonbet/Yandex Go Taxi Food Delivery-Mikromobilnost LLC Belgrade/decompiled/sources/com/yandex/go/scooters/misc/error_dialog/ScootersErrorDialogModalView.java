package com.yandex.go.scooters.misc.error_dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogAnalyticsState;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$BackDialogButtonListenerType;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$OkDialogButtonListenerType;
import com.yandex.go.scooters.misc.api.error_dialog.ScootersErrorDialogPresentation$RetryDialogButtonListenerType;
import defpackage.akn0;
import defpackage.bkn0;
import defpackage.ci91;
import defpackage.ckn0;
import defpackage.cma1;
import defpackage.dkn0;
import defpackage.e9m;
import defpackage.ekn0;
import defpackage.f1h0;
import defpackage.fcl0;
import defpackage.fkn0;
import defpackage.g18;
import defpackage.gkn0;
import defpackage.hkn0;
import defpackage.ikn0;
import defpackage.jkn0;
import defpackage.k7x0;
import defpackage.kkn0;
import defpackage.kyh0;
import defpackage.lbm;
import defpackage.lq31;
import defpackage.m2v;
import defpackage.m7h0;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.ndl0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pdc;
import defpackage.pwy0;
import defpackage.qdb1;
import defpackage.qjn0;
import defpackage.qu;
import defpackage.rjn0;
import defpackage.sjn0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tp11;
import defpackage.ufu;
import defpackage.v3n0;
import defpackage.vjn0;
import defpackage.w511;
import defpackage.wjh0;
import defpackage.wjn0;
import defpackage.yjn0;
import defpackage.zo31;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.scooters.domain.model.ScootersBleAttemptFailedException;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.c;

@Metadata(d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0081\u0001\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010'0&2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0014¢\u0006\u0004\b-\u0010,J%\u0010/\u001a\u00020.2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020*H\u0002¢\u0006\u0004\b3\u0010,J\u0018\u00105\u001a\u00020*2\u0006\u00104\u001a\u00020.H\u0082@¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u00020*2\u0006\u00104\u001a\u000207H\u0082@¢\u0006\u0004\b8\u00109J\u0018\u0010;\u001a\u00020*2\u0006\u00104\u001a\u00020:H\u0082@¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010E\u001a\u00020*2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020*2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bG\u0010FJ\u0018\u0010K\u001a\u00020J2\u0006\u0010I\u001a\u00020HH\u0082@¢\u0006\u0004\bK\u0010LJ3\u0010S\u001a\b\u0012\u0004\u0012\u00020*0R2\u0006\u0010N\u001a\u00020M2\b\u0010O\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bS\u0010TJ8\u0010V\u001a\b\u0012\u0004\u0012\u00020*0R2\u0006\u0010Q\u001a\u00020P2\b\u0010O\u001a\u0004\u0018\u00010\u00162\u000e\b\u0004\u0010U\u001a\b\u0012\u0004\u0012\u00020*0RH\u0082\b¢\u0006\u0004\bV\u0010WR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010YR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010ZR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010[R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\\R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010]R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010^R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010_R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010`R\u0014\u00104\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010f\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010g¨\u0006i"}, d2 = {"Lcom/yandex/go/scooters/misc/error_dialog/ScootersErrorDialogModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwjn0;", "Landroid/content/Context;", "context", "", "Lsjn0;", "scootersErrorDialogHandlers", "Lpav;", "imageLoader", "Lpdc;", "colorConverter", "Lk7x0;", "tagUrlFormatter", "Lpwy0;", "themeSwitcherProvider", "Lru/yandex/taxi/widget/c;", "formattedTextConverter", "Lrjn0;", "scootersErrorDialogAnalytics", "", "throwable", "", FinishFlowStatus.ORDER_ID_FIELD_NAME, "", "scooterNumbers", "Lyjn0;", "navigator", "<init>", "(Landroid/content/Context;Ljava/util/Set;Lpav;Lpdc;Lk7x0;Lpwy0;Lru/yandex/taxi/widget/c;Lrjn0;Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/List;Lyjn0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwjn0;", "Llq31;", "eventType", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Ljkn0;", "createDialogPresentation", "(Ljava/util/Set;Ljava/lang/Throwable;)Ljkn0;", "createDefaultDialogPresentation", "()Ljkn0;", "setupButtons", "dialogPresentation", "render", "(Ljkn0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfkn0;", "renderSingleButtonErrorDialog", "(Lfkn0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbkn0;", "renderDoubleButtonErrorDialog", "(Lbkn0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isCloseButtonVisible", "bindCloseButton", "(Z)V", "Landroid/widget/ImageView;", "view", "Lekn0;", "icon", "setTitleIcon", "(Landroid/widget/ImageView;Lekn0;)V", "setDescriptionIcon", "Likn0;", "textSource", "", "getTextFromTextSource", "(Likn0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lakn0;", "listenerType", ErrorResponseData.JSON_ERROR_CODE, "Lcom/yandex/go/scooters/misc/error_dialog/ScootersErrorDialogAnalytics$TappedButton;", "tappedButton", "Lkotlin/Function0;", "createOnDialogButtonClickListener", "(Lakn0;Ljava/lang/String;Lcom/yandex/go/scooters/misc/error_dialog/ScootersErrorDialogAnalytics$TappedButton;)Lsls;", "listener", "createOnButtonClickListener", "(Lcom/yandex/go/scooters/misc/error_dialog/ScootersErrorDialogAnalytics$TappedButton;Ljava/lang/String;Lsls;)Lsls;", "Lpav;", "Lpdc;", "Lk7x0;", "Lpwy0;", "Lru/yandex/taxi/widget/c;", "Lrjn0;", "Ljava/lang/String;", "Ljava/util/List;", "Lyjn0;", "Ljkn0;", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "closeButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lg18;", "loadTitleImageCancellable", "Lg18;", "loadDescriptionImageCancellable", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersErrorDialogModalView extends SlideableBindingModalView<wjn0> {
    public static final int $stable = 8;
    private FloatButtonIconComponent closeButton;
    private final pdc colorConverter;
    private final jkn0 dialogPresentation;
    private final c formattedTextConverter;
    private final pav imageLoader;
    private g18 loadDescriptionImageCancellable;
    private g18 loadTitleImageCancellable;
    private final yjn0 navigator;
    private final String orderId;
    private final List<String> scooterNumbers;
    private final rjn0 scootersErrorDialogAnalytics;
    private final k7x0 tagUrlFormatter;
    private final pwy0 themeSwitcherProvider;

    public ScootersErrorDialogModalView(Context context, Set<sjn0> set, pav pavVar, pdc pdcVar, k7x0 k7x0Var, pwy0 pwy0Var, c cVar, rjn0 rjn0Var, Throwable th, String str, List<String> list, yjn0 yjn0Var) {
        super(context);
        this.imageLoader = pavVar;
        this.colorConverter = pdcVar;
        this.tagUrlFormatter = k7x0Var;
        this.themeSwitcherProvider = pwy0Var;
        this.formattedTextConverter = cVar;
        this.scootersErrorDialogAnalytics = rjn0Var;
        this.orderId = str;
        this.scooterNumbers = list;
        this.navigator = yjn0Var;
        this.dialogPresentation = createDialogPresentation(set, th);
        setAnalyticsContext(createAnalyticsContext(th instanceof ScootersBleAttemptFailedException ? "ScootersBluetoothAuthDialog" : "ScootersAlert", new LinkedHashSet()));
    }

    private final void bindCloseButton(boolean isCloseButtonVisible) {
        FloatButtonIconComponent floatButtonIconComponent = this.closeButton;
        if (!isCloseButtonVisible) {
            if (floatButtonIconComponent != null) {
                removeView(floatButtonIconComponent);
            }
            this.closeButton = null;
        } else if (floatButtonIconComponent == null) {
            this.closeButton = qdb1.c(this, new v3n0(11, this.navigator));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindCloseButton$close(yjn0 yjn0Var) {
        ((kkn0) ((ndl0) yjn0Var).b).r(new qu(9));
    }

    private final jkn0 createDefaultDialogPresentation() {
        return new bkn0(ScootersErrorDialogAnalyticsState.ANOTHER, new gkn0(getContext().getString(kyh0.scooters_data_load_failed)), null, new gkn0(getContext().getString(kyh0.scooters_general_error_subtitle)), new ckn0(f1h0.ic_dialog_error), null, null, null, null, 2004);
    }

    private final jkn0 createDialogPresentation(Set<? extends sjn0> scootersErrorDialogHandlers, Throwable throwable) {
        Iterator<? extends sjn0> it = scootersErrorDialogHandlers.iterator();
        jkn0 jkn0Var = null;
        while (it.hasNext() && (jkn0Var = it.next().a(throwable)) == null) {
        }
        return jkn0Var == null ? createDefaultDialogPresentation() : jkn0Var;
    }

    private final sls createOnButtonClickListener(ScootersErrorDialogAnalytics$TappedButton tappedButton, String errorCode, sls listener) {
        return new e9m(errorCode, this, tappedButton, listener, 1);
    }

    private final sls createOnDialogButtonClickListener(akn0 listenerType, String errorCode, ScootersErrorDialogAnalytics$TappedButton tappedButton) {
        if (listenerType == ScootersErrorDialogPresentation$OkDialogButtonListenerType.DEFAULT) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.OK;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 1);
        }
        if (listenerType == ScootersErrorDialogPresentation$OkDialogButtonListenerType.FIND_ANOTHER_SCOOTER_ON_PARKING) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.OK;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 2);
        }
        if (listenerType == ScootersErrorDialogPresentation$OkDialogButtonListenerType.OPEN_MOS_RU) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.OK;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 3);
        }
        if (listenerType == ScootersErrorDialogPresentation$BackDialogButtonListenerType.DEFAULT) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.CANCEL;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 4);
        }
        if (listenerType == ScootersErrorDialogPresentation$BackDialogButtonListenerType.RISKY_PARKING_CANCEL) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.RISKY_PARKING_CANCEL;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 5);
        }
        if (listenerType == ScootersErrorDialogPresentation$RetryDialogButtonListenerType.DEFAULT) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.OK;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 6);
        }
        if (listenerType == ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_SUPPORT) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.SUPPORT;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 7);
        }
        if (listenerType == ScootersErrorDialogPresentation$RetryDialogButtonListenerType.FIND_NEAREST_PARKING) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.FIND_NEAREST_PARKING;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 8);
        }
        if (listenerType == ScootersErrorDialogPresentation$RetryDialogButtonListenerType.OPEN_PAYMENT_METHODS) {
            if (tappedButton == null) {
                tappedButton = ScootersErrorDialogAnalytics$TappedButton.PAYMENT_METHODS;
            }
            return new vjn0(errorCode, this, tappedButton, this.navigator, 9);
        }
        if (listenerType != ScootersErrorDialogPresentation$RetryDialogButtonListenerType.RISKY_PARKING) {
            w511.b();
            return null;
        }
        if (tappedButton == null) {
            tappedButton = ScootersErrorDialogAnalytics$TappedButton.RISKY_PARKING_OK;
        }
        return new vjn0(errorCode, this, tappedButton, this.navigator, 0);
    }

    public static /* synthetic */ sls createOnDialogButtonClickListener$default(ScootersErrorDialogModalView scootersErrorDialogModalView, akn0 akn0Var, String str, ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton, int i, Object obj) {
        if ((i & 4) != 0) {
            scootersErrorDialogAnalytics$TappedButton = null;
        }
        return scootersErrorDialogModalView.createOnDialogButtonClickListener(akn0Var, str, scootersErrorDialogAnalytics$TappedButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getTextFromTextSource(ikn0 ikn0Var, Continuation<? super CharSequence> continuation) {
        if (ikn0Var instanceof gkn0) {
            return ((gkn0) ikn0Var).a;
        }
        if (ikn0Var instanceof hkn0) {
            return c.e(this.formattedTextConverter, ((hkn0) ikn0Var).a, null, false, continuation, 30);
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object render(jkn0 jkn0Var, Continuation<? super zy11> continuation) {
        if (jkn0Var instanceof fkn0) {
            return renderSingleButtonErrorDialog((fkn0) jkn0Var, continuation);
        }
        if (jkn0Var instanceof bkn0) {
            return renderDoubleButtonErrorDialog((bkn0) jkn0Var, continuation);
        }
        w511.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object renderDoubleButtonErrorDialog(bkn0 bkn0Var, Continuation<? super zy11> continuation) {
        ScootersErrorDialogModalView$renderDoubleButtonErrorDialog$1 scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1;
        Object obj;
        int i;
        wjn0 wjn0Var;
        zo31 zo31Var;
        Object textFromTextSource;
        bkn0 bkn0Var2;
        CharSequence charSequence;
        zo31 zo31Var2;
        ekn0 ekn0Var;
        ekn0 ekn0Var2;
        Object textFromTextSource2;
        CharSequence charSequence2;
        RobotoTextView robotoTextView;
        CharSequence charSequence3;
        bkn0 bkn0Var3;
        ikn0 ikn0Var;
        ButtonComponent buttonComponent;
        zo31 zo31Var3;
        bkn0 bkn0Var4;
        String str;
        String str2;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton;
        ikn0 ikn0Var2;
        ButtonComponent buttonComponent2;
        wjn0 wjn0Var2;
        bkn0 bkn0Var5;
        String str3;
        String str4;
        bkn0 bkn0Var6 = bkn0Var;
        if (continuation instanceof ScootersErrorDialogModalView$renderDoubleButtonErrorDialog$1) {
            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1 = (ScootersErrorDialogModalView$renderDoubleButtonErrorDialog$1) continuation;
            int i2 = scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label;
                ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton2 = null;
                if (i != 0) {
                    b.b(obj2);
                    zo31 binding = getBinding();
                    wjn0Var = (wjn0) binding;
                    ikn0 ikn0Var3 = bkn0Var6.c;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0 = bkn0Var6;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1 = binding;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2 = wjn0Var;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label = 1;
                    Object textFromTextSource3 = getTextFromTextSource(ikn0Var3, scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1);
                    if (textFromTextSource3 != obj) {
                        zo31Var = binding;
                        obj2 = textFromTextSource3;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        charSequence = (CharSequence) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$3;
                        wjn0Var = (wjn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2;
                        zo31Var2 = (zo31) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1;
                        bkn0Var2 = (bkn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0;
                        b.b(obj2);
                        CharSequence charSequence4 = (CharSequence) obj2;
                        boolean z = bkn0Var2.i;
                        ekn0Var = bkn0Var2.g;
                        ekn0Var2 = bkn0Var2.f;
                        bindCloseButton(z);
                        AppCompatImageView appCompatImageView = wjn0Var.l;
                        ImageView imageView = wjn0Var.c;
                        appCompatImageView.setVisibility(ekn0Var2 == null ? 0 : 8);
                        if (ekn0Var2 != null) {
                            setTitleIcon(wjn0Var.l, ekn0Var2);
                        }
                        imageView.setVisibility(ekn0Var == null ? 0 : 8);
                        if (ekn0Var != null) {
                            setDescriptionIcon(imageView, ekn0Var);
                        }
                        RobotoTextView robotoTextView2 = wjn0Var.n;
                        ikn0 ikn0Var4 = bkn0Var2.b;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0 = bkn0Var2;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1 = zo31Var2;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2 = wjn0Var;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$3 = charSequence;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$4 = charSequence4;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$5 = robotoTextView2;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label = 3;
                        textFromTextSource2 = getTextFromTextSource(ikn0Var4, scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1);
                        if (textFromTextSource2 != obj) {
                            charSequence2 = charSequence;
                            robotoTextView = robotoTextView2;
                            charSequence3 = charSequence4;
                            obj2 = textFromTextSource2;
                            bkn0Var3 = bkn0Var2;
                            robotoTextView.setText((CharSequence) obj2);
                            RobotoTextView robotoTextView3 = wjn0Var.j;
                            RobotoTextView robotoTextView4 = wjn0Var.f;
                            robotoTextView3.setVisibility(charSequence2.length() <= 0 ? 0 : 8);
                            wjn0Var.j.setText(charSequence2);
                            robotoTextView4.setVisibility(charSequence3.length() <= 0 ? 0 : 8);
                            robotoTextView4.setText(charSequence3);
                            ikn0Var = (ikn0) bkn0Var3.j.a;
                            if (ikn0Var != null) {
                            }
                            str = (String) bkn0Var3.j.b;
                            if (str != null) {
                            }
                            ButtonComponent buttonComponent3 = wjn0Var.b;
                            m2v m2vVar = bkn0Var3.j;
                            akn0 akn0Var = (akn0) m2vVar.w;
                            String str5 = bkn0Var3.e;
                            str2 = (String) m2vVar.c;
                            if (str2 != null) {
                            }
                            buttonComponent3.setDebounceClickListener(new fcl0(8, createOnDialogButtonClickListener(akn0Var, str5, scootersErrorDialogAnalytics$TappedButton)));
                            ikn0Var2 = (ikn0) bkn0Var3.k.a;
                            if (ikn0Var2 != null) {
                            }
                            str3 = (String) bkn0Var3.k.b;
                            if (str3 != null) {
                            }
                            ButtonComponent buttonComponent4 = wjn0Var.i;
                            m2v m2vVar2 = bkn0Var3.k;
                            akn0 akn0Var2 = (akn0) m2vVar2.w;
                            String str6 = bkn0Var3.e;
                            str4 = (String) m2vVar2.c;
                            if (str4 != null) {
                            }
                            buttonComponent4.setDebounceClickListener(new fcl0(9, createOnDialogButtonClickListener(akn0Var2, str6, scootersErrorDialogAnalytics$TappedButton2)));
                            wjn0Var.d.setVisibility(0);
                            return zy11.a;
                        }
                        return obj;
                    }
                    if (i == 3) {
                        robotoTextView = (RobotoTextView) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$5;
                        CharSequence charSequence5 = (CharSequence) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$4;
                        charSequence2 = (CharSequence) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$3;
                        wjn0 wjn0Var3 = (wjn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2;
                        zo31 zo31Var4 = (zo31) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1;
                        bkn0Var3 = (bkn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0;
                        b.b(obj2);
                        charSequence3 = charSequence5;
                        wjn0Var = wjn0Var3;
                        zo31Var2 = zo31Var4;
                        robotoTextView.setText((CharSequence) obj2);
                        RobotoTextView robotoTextView32 = wjn0Var.j;
                        RobotoTextView robotoTextView42 = wjn0Var.f;
                        robotoTextView32.setVisibility(charSequence2.length() <= 0 ? 0 : 8);
                        wjn0Var.j.setText(charSequence2);
                        robotoTextView42.setVisibility(charSequence3.length() <= 0 ? 0 : 8);
                        robotoTextView42.setText(charSequence3);
                        ikn0Var = (ikn0) bkn0Var3.j.a;
                        if (ikn0Var != null) {
                            ButtonComponent buttonComponent5 = wjn0Var.b;
                            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0 = bkn0Var3;
                            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1 = zo31Var2;
                            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2 = wjn0Var;
                            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$3 = null;
                            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$4 = null;
                            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$5 = null;
                            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$6 = buttonComponent5;
                            scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label = 4;
                            Object textFromTextSource4 = getTextFromTextSource(ikn0Var, scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1);
                            if (textFromTextSource4 != obj) {
                                obj2 = textFromTextSource4;
                                buttonComponent = buttonComponent5;
                                zo31Var3 = zo31Var2;
                                bkn0Var4 = bkn0Var3;
                                buttonComponent.setText((CharSequence) obj2);
                                zo31Var2 = zo31Var3;
                                bkn0Var3 = bkn0Var4;
                            }
                            return obj;
                        }
                        str = (String) bkn0Var3.j.b;
                        if (str != null) {
                        }
                        ButtonComponent buttonComponent32 = wjn0Var.b;
                        m2v m2vVar3 = bkn0Var3.j;
                        akn0 akn0Var3 = (akn0) m2vVar3.w;
                        String str52 = bkn0Var3.e;
                        str2 = (String) m2vVar3.c;
                        if (str2 != null) {
                        }
                        buttonComponent32.setDebounceClickListener(new fcl0(8, createOnDialogButtonClickListener(akn0Var3, str52, scootersErrorDialogAnalytics$TappedButton)));
                        ikn0Var2 = (ikn0) bkn0Var3.k.a;
                        if (ikn0Var2 != null) {
                        }
                        str3 = (String) bkn0Var3.k.b;
                        if (str3 != null) {
                        }
                        ButtonComponent buttonComponent42 = wjn0Var.i;
                        m2v m2vVar22 = bkn0Var3.k;
                        akn0 akn0Var22 = (akn0) m2vVar22.w;
                        String str62 = bkn0Var3.e;
                        str4 = (String) m2vVar22.c;
                        if (str4 != null) {
                        }
                        buttonComponent42.setDebounceClickListener(new fcl0(9, createOnDialogButtonClickListener(akn0Var22, str62, scootersErrorDialogAnalytics$TappedButton2)));
                        wjn0Var.d.setVisibility(0);
                        return zy11.a;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        buttonComponent2 = (ButtonComponent) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$6;
                        wjn0Var2 = (wjn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2;
                        bkn0Var5 = (bkn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0;
                        b.b(obj2);
                        buttonComponent2.setText((CharSequence) obj2);
                        bkn0Var3 = bkn0Var5;
                        wjn0Var = wjn0Var2;
                        str3 = (String) bkn0Var3.k.b;
                        if (str3 != null) {
                            wjn0Var.i.setButtonBackground(((ufu) this.colorConverter).e(str3));
                        }
                        ButtonComponent buttonComponent422 = wjn0Var.i;
                        m2v m2vVar222 = bkn0Var3.k;
                        akn0 akn0Var222 = (akn0) m2vVar222.w;
                        String str622 = bkn0Var3.e;
                        str4 = (String) m2vVar222.c;
                        if (str4 != null) {
                            ScootersErrorDialogAnalytics$TappedButton.Companion.getClass();
                            scootersErrorDialogAnalytics$TappedButton2 = qjn0.a(str4);
                        }
                        buttonComponent422.setDebounceClickListener(new fcl0(9, createOnDialogButtonClickListener(akn0Var222, str622, scootersErrorDialogAnalytics$TappedButton2)));
                        wjn0Var.d.setVisibility(0);
                        return zy11.a;
                    }
                    buttonComponent = (ButtonComponent) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$6;
                    wjn0Var = (wjn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2;
                    zo31Var3 = (zo31) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1;
                    bkn0Var4 = (bkn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0;
                    b.b(obj2);
                    buttonComponent.setText((CharSequence) obj2);
                    zo31Var2 = zo31Var3;
                    bkn0Var3 = bkn0Var4;
                    str = (String) bkn0Var3.j.b;
                    if (str != null) {
                        wjn0Var.b.setButtonBackground(((ufu) this.colorConverter).e(str));
                    }
                    ButtonComponent buttonComponent322 = wjn0Var.b;
                    m2v m2vVar32 = bkn0Var3.j;
                    akn0 akn0Var32 = (akn0) m2vVar32.w;
                    String str522 = bkn0Var3.e;
                    str2 = (String) m2vVar32.c;
                    if (str2 != null) {
                        ScootersErrorDialogAnalytics$TappedButton.Companion.getClass();
                        scootersErrorDialogAnalytics$TappedButton = qjn0.a(str2);
                    } else {
                        scootersErrorDialogAnalytics$TappedButton = null;
                    }
                    buttonComponent322.setDebounceClickListener(new fcl0(8, createOnDialogButtonClickListener(akn0Var32, str522, scootersErrorDialogAnalytics$TappedButton)));
                    ikn0Var2 = (ikn0) bkn0Var3.k.a;
                    if (ikn0Var2 != null) {
                        ButtonComponent buttonComponent6 = wjn0Var.i;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0 = bkn0Var3;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1 = zo31Var2;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2 = wjn0Var;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$3 = null;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$4 = null;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$5 = null;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$6 = buttonComponent6;
                        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label = 5;
                        Object textFromTextSource5 = getTextFromTextSource(ikn0Var2, scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1);
                        if (textFromTextSource5 != obj) {
                            obj2 = textFromTextSource5;
                            buttonComponent2 = buttonComponent6;
                            wjn0Var2 = wjn0Var;
                            bkn0Var5 = bkn0Var3;
                            buttonComponent2.setText((CharSequence) obj2);
                            bkn0Var3 = bkn0Var5;
                            wjn0Var = wjn0Var2;
                        }
                        return obj;
                    }
                    str3 = (String) bkn0Var3.k.b;
                    if (str3 != null) {
                    }
                    ButtonComponent buttonComponent4222 = wjn0Var.i;
                    m2v m2vVar2222 = bkn0Var3.k;
                    akn0 akn0Var2222 = (akn0) m2vVar2222.w;
                    String str6222 = bkn0Var3.e;
                    str4 = (String) m2vVar2222.c;
                    if (str4 != null) {
                    }
                    buttonComponent4222.setDebounceClickListener(new fcl0(9, createOnDialogButtonClickListener(akn0Var2222, str6222, scootersErrorDialogAnalytics$TappedButton2)));
                    wjn0Var.d.setVisibility(0);
                    return zy11.a;
                }
                wjn0 wjn0Var4 = (wjn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2;
                zo31 zo31Var5 = (zo31) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1;
                bkn0 bkn0Var7 = (bkn0) scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0;
                b.b(obj2);
                wjn0Var = wjn0Var4;
                bkn0Var6 = bkn0Var7;
                zo31Var = zo31Var5;
                CharSequence charSequence6 = (CharSequence) obj2;
                ikn0 ikn0Var5 = bkn0Var6.d;
                scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0 = bkn0Var6;
                scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1 = zo31Var;
                scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2 = wjn0Var;
                scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$3 = charSequence6;
                scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label = 2;
                textFromTextSource = getTextFromTextSource(ikn0Var5, scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1);
                if (textFromTextSource != obj) {
                    zo31 zo31Var6 = zo31Var;
                    bkn0Var2 = bkn0Var6;
                    charSequence = charSequence6;
                    obj2 = textFromTextSource;
                    zo31Var2 = zo31Var6;
                    CharSequence charSequence42 = (CharSequence) obj2;
                    boolean z2 = bkn0Var2.i;
                    ekn0Var = bkn0Var2.g;
                    ekn0Var2 = bkn0Var2.f;
                    bindCloseButton(z2);
                    AppCompatImageView appCompatImageView2 = wjn0Var.l;
                    ImageView imageView2 = wjn0Var.c;
                    appCompatImageView2.setVisibility(ekn0Var2 == null ? 0 : 8);
                    if (ekn0Var2 != null) {
                    }
                    imageView2.setVisibility(ekn0Var == null ? 0 : 8);
                    if (ekn0Var != null) {
                    }
                    RobotoTextView robotoTextView22 = wjn0Var.n;
                    ikn0 ikn0Var42 = bkn0Var2.b;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0 = bkn0Var2;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1 = zo31Var2;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2 = wjn0Var;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$3 = charSequence;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$4 = charSequence42;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$5 = robotoTextView22;
                    scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label = 3;
                    textFromTextSource2 = getTextFromTextSource(ikn0Var42, scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1);
                    if (textFromTextSource2 != obj) {
                    }
                }
                return obj;
            }
        }
        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1 = new ScootersErrorDialogModalView$renderDoubleButtonErrorDialog$1(this, continuation);
        Object obj22 = scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton22 = null;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj22;
        ikn0 ikn0Var52 = bkn0Var6.d;
        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$0 = bkn0Var6;
        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$1 = zo31Var;
        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$2 = wjn0Var;
        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.L$3 = charSequence62;
        scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1.label = 2;
        textFromTextSource = getTextFromTextSource(ikn0Var52, scootersErrorDialogModalView$renderDoubleButtonErrorDialog$1);
        if (textFromTextSource != obj) {
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object renderSingleButtonErrorDialog(fkn0 fkn0Var, Continuation<? super zy11> continuation) {
        ScootersErrorDialogModalView$renderSingleButtonErrorDialog$1 scootersErrorDialogModalView$renderSingleButtonErrorDialog$1;
        Object obj;
        int i;
        zo31 binding;
        wjn0 wjn0Var;
        Object textFromTextSource;
        fkn0 fkn0Var2;
        CharSequence charSequence;
        zo31 zo31Var;
        wjn0 wjn0Var2;
        ekn0 ekn0Var;
        ekn0 ekn0Var2;
        Object textFromTextSource2;
        CharSequence charSequence2;
        fkn0 fkn0Var3;
        zo31 zo31Var2;
        CharSequence charSequence3;
        RobotoTextView robotoTextView;
        ikn0 ikn0Var;
        ButtonComponent buttonComponent;
        wjn0 wjn0Var3;
        fkn0 fkn0Var4;
        String str;
        String str2;
        fkn0 fkn0Var5 = fkn0Var;
        if (continuation instanceof ScootersErrorDialogModalView$renderSingleButtonErrorDialog$1) {
            scootersErrorDialogModalView$renderSingleButtonErrorDialog$1 = (ScootersErrorDialogModalView$renderSingleButtonErrorDialog$1) continuation;
            int i2 = scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label;
                ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton = null;
                if (i != 0) {
                    b.b(obj2);
                    binding = getBinding();
                    wjn0 wjn0Var4 = (wjn0) binding;
                    ikn0 ikn0Var2 = fkn0Var5.c;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0 = fkn0Var5;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1 = binding;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2 = wjn0Var4;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label = 1;
                    Object textFromTextSource3 = getTextFromTextSource(ikn0Var2, scootersErrorDialogModalView$renderSingleButtonErrorDialog$1);
                    if (textFromTextSource3 != obj) {
                        wjn0Var = wjn0Var4;
                        obj2 = textFromTextSource3;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        charSequence = (CharSequence) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$3;
                        wjn0Var2 = (wjn0) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2;
                        zo31Var = (zo31) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1;
                        fkn0Var2 = (fkn0) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0;
                        b.b(obj2);
                        CharSequence charSequence4 = (CharSequence) obj2;
                        boolean z = fkn0Var2.i;
                        ekn0Var = fkn0Var2.g;
                        ekn0Var2 = fkn0Var2.f;
                        bindCloseButton(z);
                        AppCompatImageView appCompatImageView = wjn0Var2.m;
                        ImageView imageView = wjn0Var2.c;
                        appCompatImageView.setVisibility(ekn0Var2 == null ? 0 : 8);
                        if (ekn0Var2 != null) {
                            setTitleIcon(wjn0Var2.m, ekn0Var2);
                        }
                        imageView.setVisibility(ekn0Var == null ? 0 : 8);
                        if (ekn0Var != null) {
                            setDescriptionIcon(imageView, ekn0Var);
                        }
                        RobotoTextView robotoTextView2 = wjn0Var2.o;
                        ikn0 ikn0Var3 = fkn0Var2.b;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0 = fkn0Var2;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1 = zo31Var;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2 = wjn0Var2;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$3 = charSequence;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$4 = charSequence4;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$5 = robotoTextView2;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label = 3;
                        textFromTextSource2 = getTextFromTextSource(ikn0Var3, scootersErrorDialogModalView$renderSingleButtonErrorDialog$1);
                        if (textFromTextSource2 != obj) {
                            charSequence2 = charSequence4;
                            obj2 = textFromTextSource2;
                            fkn0Var3 = fkn0Var2;
                            zo31Var2 = zo31Var;
                            charSequence3 = charSequence;
                            robotoTextView = robotoTextView2;
                            robotoTextView.setText((CharSequence) obj2);
                            RobotoTextView robotoTextView3 = wjn0Var2.k;
                            RobotoTextView robotoTextView4 = wjn0Var2.g;
                            robotoTextView3.setVisibility(charSequence3.length() <= 0 ? 0 : 8);
                            wjn0Var2.k.setText(charSequence3);
                            robotoTextView4.setVisibility(charSequence2.length() <= 0 ? 0 : 8);
                            robotoTextView4.setText(charSequence2);
                            ikn0Var = (ikn0) fkn0Var3.j.a;
                            if (ikn0Var != null) {
                            }
                            str = (String) fkn0Var3.j.b;
                            if (str != null) {
                            }
                            ButtonComponent buttonComponent2 = wjn0Var2.h;
                            m2v m2vVar = fkn0Var3.j;
                            akn0 akn0Var = (akn0) m2vVar.w;
                            String str3 = fkn0Var3.e;
                            str2 = (String) m2vVar.c;
                            if (str2 != null) {
                            }
                            buttonComponent2.setDebounceClickListener(new fcl0(10, createOnDialogButtonClickListener(akn0Var, str3, scootersErrorDialogAnalytics$TappedButton)));
                            wjn0Var2.e.setVisibility(0);
                            return zy11.a;
                        }
                        return obj;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        buttonComponent = (ButtonComponent) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$6;
                        wjn0Var3 = (wjn0) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2;
                        fkn0Var4 = (fkn0) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0;
                        b.b(obj2);
                        buttonComponent.setText((CharSequence) obj2);
                        fkn0Var3 = fkn0Var4;
                        wjn0Var2 = wjn0Var3;
                        str = (String) fkn0Var3.j.b;
                        if (str != null) {
                            wjn0Var2.h.setButtonBackground(((ufu) this.colorConverter).e(str));
                        }
                        ButtonComponent buttonComponent22 = wjn0Var2.h;
                        m2v m2vVar2 = fkn0Var3.j;
                        akn0 akn0Var2 = (akn0) m2vVar2.w;
                        String str32 = fkn0Var3.e;
                        str2 = (String) m2vVar2.c;
                        if (str2 != null) {
                            ScootersErrorDialogAnalytics$TappedButton.Companion.getClass();
                            scootersErrorDialogAnalytics$TappedButton = qjn0.a(str2);
                        }
                        buttonComponent22.setDebounceClickListener(new fcl0(10, createOnDialogButtonClickListener(akn0Var2, str32, scootersErrorDialogAnalytics$TappedButton)));
                        wjn0Var2.e.setVisibility(0);
                        return zy11.a;
                    }
                    robotoTextView = (RobotoTextView) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$5;
                    CharSequence charSequence5 = (CharSequence) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$4;
                    CharSequence charSequence6 = (CharSequence) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$3;
                    wjn0 wjn0Var5 = (wjn0) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2;
                    zo31Var2 = (zo31) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1;
                    fkn0Var3 = (fkn0) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0;
                    b.b(obj2);
                    charSequence2 = charSequence5;
                    wjn0Var2 = wjn0Var5;
                    charSequence3 = charSequence6;
                    robotoTextView.setText((CharSequence) obj2);
                    RobotoTextView robotoTextView32 = wjn0Var2.k;
                    RobotoTextView robotoTextView42 = wjn0Var2.g;
                    robotoTextView32.setVisibility(charSequence3.length() <= 0 ? 0 : 8);
                    wjn0Var2.k.setText(charSequence3);
                    robotoTextView42.setVisibility(charSequence2.length() <= 0 ? 0 : 8);
                    robotoTextView42.setText(charSequence2);
                    ikn0Var = (ikn0) fkn0Var3.j.a;
                    if (ikn0Var != null) {
                        ButtonComponent buttonComponent3 = wjn0Var2.h;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0 = fkn0Var3;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1 = zo31Var2;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2 = wjn0Var2;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$3 = null;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$4 = null;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$5 = null;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$6 = buttonComponent3;
                        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label = 4;
                        Object textFromTextSource4 = getTextFromTextSource(ikn0Var, scootersErrorDialogModalView$renderSingleButtonErrorDialog$1);
                        if (textFromTextSource4 != obj) {
                            obj2 = textFromTextSource4;
                            buttonComponent = buttonComponent3;
                            wjn0Var3 = wjn0Var2;
                            fkn0Var4 = fkn0Var3;
                            buttonComponent.setText((CharSequence) obj2);
                            fkn0Var3 = fkn0Var4;
                            wjn0Var2 = wjn0Var3;
                        }
                        return obj;
                    }
                    str = (String) fkn0Var3.j.b;
                    if (str != null) {
                    }
                    ButtonComponent buttonComponent222 = wjn0Var2.h;
                    m2v m2vVar22 = fkn0Var3.j;
                    akn0 akn0Var22 = (akn0) m2vVar22.w;
                    String str322 = fkn0Var3.e;
                    str2 = (String) m2vVar22.c;
                    if (str2 != null) {
                    }
                    buttonComponent222.setDebounceClickListener(new fcl0(10, createOnDialogButtonClickListener(akn0Var22, str322, scootersErrorDialogAnalytics$TappedButton)));
                    wjn0Var2.e.setVisibility(0);
                    return zy11.a;
                }
                wjn0 wjn0Var6 = (wjn0) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2;
                binding = (zo31) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1;
                fkn0 fkn0Var6 = (fkn0) scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0;
                b.b(obj2);
                wjn0Var = wjn0Var6;
                fkn0Var5 = fkn0Var6;
                CharSequence charSequence7 = (CharSequence) obj2;
                ikn0 ikn0Var4 = fkn0Var5.d;
                scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0 = fkn0Var5;
                scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1 = binding;
                scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2 = wjn0Var;
                scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$3 = charSequence7;
                scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label = 2;
                textFromTextSource = getTextFromTextSource(ikn0Var4, scootersErrorDialogModalView$renderSingleButtonErrorDialog$1);
                if (textFromTextSource != obj) {
                    wjn0 wjn0Var7 = wjn0Var;
                    fkn0Var2 = fkn0Var5;
                    charSequence = charSequence7;
                    obj2 = textFromTextSource;
                    zo31Var = binding;
                    wjn0Var2 = wjn0Var7;
                    CharSequence charSequence42 = (CharSequence) obj2;
                    boolean z2 = fkn0Var2.i;
                    ekn0Var = fkn0Var2.g;
                    ekn0Var2 = fkn0Var2.f;
                    bindCloseButton(z2);
                    AppCompatImageView appCompatImageView2 = wjn0Var2.m;
                    ImageView imageView2 = wjn0Var2.c;
                    appCompatImageView2.setVisibility(ekn0Var2 == null ? 0 : 8);
                    if (ekn0Var2 != null) {
                    }
                    imageView2.setVisibility(ekn0Var == null ? 0 : 8);
                    if (ekn0Var != null) {
                    }
                    RobotoTextView robotoTextView22 = wjn0Var2.o;
                    ikn0 ikn0Var32 = fkn0Var2.b;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0 = fkn0Var2;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1 = zo31Var;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2 = wjn0Var2;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$3 = charSequence;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$4 = charSequence42;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$5 = robotoTextView22;
                    scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label = 3;
                    textFromTextSource2 = getTextFromTextSource(ikn0Var32, scootersErrorDialogModalView$renderSingleButtonErrorDialog$1);
                    if (textFromTextSource2 != obj) {
                    }
                }
                return obj;
            }
        }
        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1 = new ScootersErrorDialogModalView$renderSingleButtonErrorDialog$1(this, continuation);
        Object obj22 = scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label;
        ScootersErrorDialogAnalytics$TappedButton scootersErrorDialogAnalytics$TappedButton2 = null;
        if (i != 0) {
        }
        CharSequence charSequence72 = (CharSequence) obj22;
        ikn0 ikn0Var42 = fkn0Var5.d;
        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$0 = fkn0Var5;
        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$1 = binding;
        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$2 = wjn0Var;
        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.L$3 = charSequence72;
        scootersErrorDialogModalView$renderSingleButtonErrorDialog$1.label = 2;
        textFromTextSource = getTextFromTextSource(ikn0Var42, scootersErrorDialogModalView$renderSingleButtonErrorDialog$1);
        if (textFromTextSource != obj) {
        }
        return obj;
    }

    private final void setDescriptionIcon(ImageView view, ekn0 icon) {
        if (icon instanceof ckn0) {
            view.setImageResource(((ckn0) icon).a);
            return;
        }
        if (!(icon instanceof dkn0)) {
            w511.b();
            return;
        }
        g18 g18Var = this.loadDescriptionImageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadDescriptionImageCancellable = ((nac) this.imageLoader.a(view)).c(((dkn0) icon).a);
    }

    private final void setTitleIcon(ImageView view, ekn0 icon) {
        if (icon instanceof ckn0) {
            view.setImageResource(((ckn0) icon).a);
            return;
        }
        if (!(icon instanceof dkn0)) {
            w511.b();
            return;
        }
        g18 g18Var = this.loadTitleImageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        lbm a = this.imageLoader.a(view);
        nac nacVar = (nac) a;
        this.loadTitleImageCancellable = nacVar.c(((m7x0) this.tagUrlFormatter).a(((dkn0) icon).a));
    }

    private final void setupButtons() {
        Boolean bool = tp11.a;
        tp11.b(3, getBinding().h);
        getBinding().i.setAccent(true);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wjn0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(wjh0.scooters_error_dialog_modal_view, parent, false);
        int i = m7h0.back;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = m7h0.description_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = m7h0.error_variant_1;
                Group group = (Group) cma1.O(i, inflate);
                if (group != null) {
                    i = m7h0.error_variant_2;
                    Group group2 = (Group) cma1.O(i, inflate);
                    if (group2 != null) {
                        i = m7h0.message_variant_1;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView != null) {
                            i = m7h0.message_variant_2;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                            if (robotoTextView2 != null) {
                                i = m7h0.ok;
                                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                                if (buttonComponent2 != null) {
                                    i = m7h0.retry;
                                    ButtonComponent buttonComponent3 = (ButtonComponent) cma1.O(i, inflate);
                                    if (buttonComponent3 != null) {
                                        i = m7h0.subtitle_variant_1;
                                        RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, inflate);
                                        if (robotoTextView3 != null) {
                                            i = m7h0.subtitle_variant_2;
                                            RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, inflate);
                                            if (robotoTextView4 != null) {
                                                i = m7h0.title_icon_variant_1;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                                                if (appCompatImageView2 != null) {
                                                    i = m7h0.title_icon_variant_2;
                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) cma1.O(i, inflate);
                                                    if (appCompatImageView3 != null) {
                                                        i = m7h0.title_variant_1;
                                                        RobotoTextView robotoTextView5 = (RobotoTextView) cma1.O(i, inflate);
                                                        if (robotoTextView5 != null) {
                                                            i = m7h0.title_variant_2;
                                                            RobotoTextView robotoTextView6 = (RobotoTextView) cma1.O(i, inflate);
                                                            if (robotoTextView6 != null) {
                                                                return new wjn0((ConstraintLayout) inflate, buttonComponent, appCompatImageView, group, group2, robotoTextView, robotoTextView2, buttonComponent2, buttonComponent3, robotoTextView3, robotoTextView4, appCompatImageView2, appCompatImageView3, robotoTextView5, robotoTextView6);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        Pair pair = new Pair("scooter_numbers", this.scooterNumbers);
        Pair pair2 = new Pair("order_id", this.orderId);
        jkn0 jkn0Var = this.dialogPresentation;
        String str = jkn0Var.h;
        if (str == null) {
            str = jkn0Var.a.getState();
        }
        return kotlin.collections.b.l(pair, pair2, new Pair(ClidProvider.STATE, str));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupButtons();
        tje.N(ci91.c(this), null, null, new ScootersErrorDialogModalView$onAttachedToWindow$$inlined$collectIn$1(this.themeSwitcherProvider.a(), null, this), 3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g18 g18Var = this.loadTitleImageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.loadTitleImageCancellable = null;
        g18 g18Var2 = this.loadDescriptionImageCancellable;
        if (g18Var2 != null) {
            g18Var2.cancel();
        }
        this.loadDescriptionImageCancellable = null;
    }
}
