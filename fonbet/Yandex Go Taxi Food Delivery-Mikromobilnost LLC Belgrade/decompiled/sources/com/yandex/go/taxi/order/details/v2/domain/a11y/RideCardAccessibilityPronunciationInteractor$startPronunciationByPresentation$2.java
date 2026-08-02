package com.yandex.go.taxi.order.details.v2.domain.a11y;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;
import com.yandex.go.timer.api.TimerType;
import com.yandex.go.timer.k;
import com.yandex.go.timer.l;
import defpackage.cvu0;
import defpackage.dez0;
import defpackage.evu0;
import defpackage.fef;
import defpackage.jl40;
import defpackage.k8k0;
import defpackage.l8k0;
import defpackage.m8k0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qjk0;
import defpackage.qzo;
import defpackage.t8k0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lm8k0;", "announcements", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2", f = "RideCardAccessibilityPronunciationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardPresentationType $presentationType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2(c cVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$presentationType = rideCardPresentationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2 rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2 = new RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2(this.this$0, this.$presentationType, continuation);
        rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2.L$0 = obj;
        return rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2 rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2 = (RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fc, code lost:
    
        if (r3 < 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ff, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0115, code lost:
    
        r3 = r11.b(defpackage.t7s.d(r14, "%1$02d:%2$02d", "%1$d:%2$02d:%3$02d"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0113, code lost:
    
        if (r3 < 0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        String str;
        String a;
        RideCardTimerDto rideCardTimerDto;
        RideCardTimerDto.TimerType timerType;
        String str2;
        long a2;
        Object obj2;
        List<m8k0> list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        for (m8k0 m8k0Var : list) {
            t8k0 t8k0Var = cVar.b;
            if (m8k0Var instanceof l8k0) {
                a = t8k0Var.c.a((fef) t8k0Var.e.getValue(), ((l8k0) m8k0Var).a, false, true);
            } else {
                if (!(m8k0Var instanceof k8k0)) {
                    t8k0Var.getClass();
                    w511.b();
                    return null;
                }
                RideCardInfoResponse rideCardInfoResponse = t8k0Var.d.b().V().o0;
                List list2 = rideCardInfoResponse != null ? rideCardInfoResponse.a : null;
                k8k0 k8k0Var = (k8k0) m8k0Var;
                String str3 = k8k0Var.a;
                String str4 = k8k0Var.b;
                if (evu0.y(str3, "$TIMER$", false)) {
                    k kVar = t8k0Var.a;
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof qjk0) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            qjk0 qjk0Var = (qjk0) obj2;
                            if (jl40.l(qjk0Var.getId(), str4) && qjk0Var.getE() != null) {
                                break;
                            }
                        }
                        qjk0 qjk0Var2 = (qjk0) obj2;
                        if (qjk0Var2 != null) {
                            rideCardTimerDto = qjk0Var2.getE();
                            timerType = rideCardTimerDto == null ? rideCardTimerDto.a : null;
                            Date c = t8k0Var.b.c(rideCardTimerDto == null ? rideCardTimerDto.b : null);
                            Long valueOf = c == null ? Long.valueOf(c.getTime()) : null;
                            if (timerType != null || valueOf == null) {
                                str = null;
                                str2 = null;
                            } else {
                                TimerType a3 = qzo.a(timerType);
                                long longValue = valueOf.longValue();
                                l lVar = kVar.b;
                                int i = dez0.a[a3.ordinal()];
                                long j = 0;
                                if (i != 1) {
                                    str = null;
                                    if (i != 2) {
                                        w511.b();
                                        return null;
                                    }
                                    a2 = k.a(lVar.a.d(), longValue);
                                } else {
                                    str = null;
                                    a2 = k.a(longValue, lVar.a.d());
                                }
                            }
                            if (str2 != null || str2.length() == 0) {
                                str2 = str;
                            }
                            str3 = str2 == null ? cvu0.v(str3, "$TIMER$", str2, false) : str;
                        }
                    }
                    rideCardTimerDto = null;
                    if (rideCardTimerDto == null) {
                    }
                    Date c2 = t8k0Var.b.c(rideCardTimerDto == null ? rideCardTimerDto.b : null);
                    if (c2 == null) {
                    }
                    if (timerType != null) {
                    }
                    str = null;
                    str2 = null;
                    if (str2 != null) {
                    }
                    str2 = str;
                    if (str2 == null) {
                    }
                } else {
                    str = null;
                }
                a = str3 == null ? str : t8k0Var.c.a((fef) t8k0Var.e.getValue(), str3, false, true);
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            obtain.getText().add(a);
            AccessibilityManager accessibilityManager = cVar.c;
            if (accessibilityManager != null) {
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
        pz40 pz40Var = (pz40) this.this$0.a.a.get(this.$presentationType);
        if (pz40Var != null) {
            do {
                r0Var = (r0) pz40Var;
                value = r0Var.getValue();
            } while (!r0Var.k(value, EmptyList.a));
        }
        return zy11.a;
    }
}
