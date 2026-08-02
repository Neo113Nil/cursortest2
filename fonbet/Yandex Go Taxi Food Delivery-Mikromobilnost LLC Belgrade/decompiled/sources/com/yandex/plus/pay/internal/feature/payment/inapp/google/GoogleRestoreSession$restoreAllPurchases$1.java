package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.inapp.api.PlusPayInAppProductType;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.qv10;
import defpackage.rcd0;
import defpackage.vpr;
import defpackage.wcd0;
import defpackage.wls;
import defpackage.xca1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzcd0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.GoogleRestoreSession$restoreAllPurchases$1", f = "GoogleRestoreSession.kt", l = {58, HProv.PP_ENUM_LOG, CalendarDayView.DISABLED_DAY_ALPHA, 80, 81}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class GoogleRestoreSession$restoreAllPurchases$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleRestoreSession$restoreAllPurchases$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GoogleRestoreSession$restoreAllPurchases$1 googleRestoreSession$restoreAllPurchases$1 = new GoogleRestoreSession$restoreAllPurchases$1(this.this$0, continuation);
        googleRestoreSession$restoreAllPurchases$1.L$0 = obj;
        return googleRestoreSession$restoreAllPurchases$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleRestoreSession$restoreAllPurchases$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x014f, code lost:
    
        if (r4.emit(r1, r14) == r7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0164, code lost:
    
        if (r4.emit(defpackage.xcd0.a, r14) == r7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0126, code lost:
    
        if (r15.a(r14) == r7) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r15v8, types: [T, com.yandex.plus.pay.api.exception.PlusPayException] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        Object failure;
        Throwable a;
        Throwable a2;
        Ref$ObjectRef ref$ObjectRef2;
        Throwable th;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                Ref$ObjectRef z = qv10.z(obj);
                try {
                    ocd0 ocd0Var = this.this$0.a;
                    PlusPayInAppProductType plusPayInAppProductType = PlusPayInAppProductType.SUBSCRIPTION;
                    this.L$0 = vprVar;
                    this.L$1 = z;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    Object b = ocd0Var.b(plusPayInAppProductType, this);
                    if (b != coroutineSingletons) {
                        ref$ObjectRef = z;
                        obj = b;
                    }
                } catch (TimeoutCancellationException e) {
                    e = e;
                    ref$ObjectRef = z;
                    failure = new Result.Failure(e);
                    Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    a2 = Result.a(failure);
                    EmptyList emptyList = failure;
                    if (a2 != null) {
                    }
                    GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 = new GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1(emptyList, null, vprVar, this.this$0, ref$ObjectRef3);
                    this.L$0 = vprVar;
                    this.L$1 = ref$ObjectRef3;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = 0;
                    this.label = 2;
                    obj = bvf0.n(googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1, this);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    ref$ObjectRef = z;
                    failure = new Result.Failure(th);
                    Ref$ObjectRef ref$ObjectRef32 = ref$ObjectRef;
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    a2 = Result.a(failure);
                    EmptyList emptyList2 = failure;
                    if (a2 != null) {
                    }
                    GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$12 = new GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1(emptyList2, null, vprVar, this.this$0, ref$ObjectRef32);
                    this.L$0 = vprVar;
                    this.L$1 = ref$ObjectRef32;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = 0;
                    this.label = 2;
                    obj = bvf0.n(googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$12, this);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                try {
                    kotlin.b.b(obj);
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    failure = new Result.Failure(e);
                    Ref$ObjectRef ref$ObjectRef322 = ref$ObjectRef;
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    a2 = Result.a(failure);
                    EmptyList emptyList22 = failure;
                    if (a2 != null) {
                    }
                    GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$122 = new GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1(emptyList22, null, vprVar, this.this$0, ref$ObjectRef322);
                    this.L$0 = vprVar;
                    this.L$1 = ref$ObjectRef322;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = 0;
                    this.label = 2;
                    obj = bvf0.n(googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$122, this);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                } catch (Throwable th3) {
                    th = th3;
                    failure = new Result.Failure(th);
                    Ref$ObjectRef ref$ObjectRef3222 = ref$ObjectRef;
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    a2 = Result.a(failure);
                    EmptyList emptyList222 = failure;
                    if (a2 != null) {
                    }
                    GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1222 = new GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1(emptyList222, null, vprVar, this.this$0, ref$ObjectRef3222);
                    this.L$0 = vprVar;
                    this.L$1 = ref$ObjectRef3222;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = 0;
                    this.label = 2;
                    obj = bvf0.n(googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1222, this);
                    if (obj != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
            } else if (i == 2) {
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                if (!kotlin.collections.a.M((Iterable) obj).isEmpty()) {
                    com.yandex.plus.pay.internal.feature.cache.a aVar = this.this$0.d;
                    this.L$0 = vprVar;
                    this.L$1 = ref$ObjectRef2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                }
                th = (Throwable) ref$ObjectRef2.element;
                if (th != null) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                    } else if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                th = (Throwable) ref$ObjectRef2.element;
                if (th != null) {
                    this.this$0.getClass();
                    wcd0 wcd0Var = new wcd0(xca1.e(th));
                    this.L$0 = vprVar;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.I$0 = 0;
                    this.label = 4;
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                }
            }
            failure = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (!((rcd0) obj2).f) {
                    failure.add(obj2);
                }
            }
            Ref$ObjectRef ref$ObjectRef32222 = ref$ObjectRef;
            a = Result.a(failure);
            if (a != null) {
                ref$ObjectRef32222.element = xca1.e(a);
            }
            a2 = Result.a(failure);
            EmptyList emptyList2222 = failure;
            if (a2 != null) {
                emptyList2222 = EmptyList.a;
            }
            GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1 googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$12222 = new GoogleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$1(emptyList2222, null, vprVar, this.this$0, ref$ObjectRef32222);
            this.L$0 = vprVar;
            this.L$1 = ref$ObjectRef32222;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = 0;
            this.label = 2;
            obj = bvf0.n(googleRestoreSession$restoreAllPurchases$1$invokeSuspend$$inlined$asyncMap$12222, this);
            if (obj != coroutineSingletons) {
                ref$ObjectRef2 = ref$ObjectRef32222;
                if (!kotlin.collections.a.M((Iterable) obj).isEmpty()) {
                }
                th = (Throwable) ref$ObjectRef2.element;
                if (th != null) {
                }
            }
            return coroutineSingletons;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
