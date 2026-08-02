package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.api.exception.PlusPayApiException;
import com.yandex.plus.pay.api.exception.PlusPayNetworkException;
import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.api.exception.PlusPayPaymentException;
import com.yandex.plus.pay.api.exception.PlusPaySslException;
import com.yandex.plus.pay.api.exception.PlusPayUnauthorizedException;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.aod0;
import defpackage.bod0;
import defpackage.cod0;
import defpackage.ddd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pod0;
import defpackage.qod0;
import defpackage.qqx0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xnd0;
import defpackage.zio;
import defpackage.znd0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Luod0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.common.TarifficatorBaseInvoicePaymentSession$startPayment$1", f = "TarifficatorBaseInvoicePaymentSession.kt", l = {66, 67, 72, 74, HProv.PROV_GOST_2001_DH, HProv.PP_BIO_STATISTICA_LEN, 114}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorBaseInvoicePaymentSession$startPayment$1 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorBaseInvoicePaymentSession$startPayment$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TarifficatorBaseInvoicePaymentSession$startPayment$1 tarifficatorBaseInvoicePaymentSession$startPayment$1 = new TarifficatorBaseInvoicePaymentSession$startPayment$1(this.this$0, continuation);
        tarifficatorBaseInvoicePaymentSession$startPayment$1.L$0 = obj;
        return tarifficatorBaseInvoicePaymentSession$startPayment$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TarifficatorBaseInvoicePaymentSession$startPayment$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f0, code lost:
    
        if (r11.emit(r0, r16) != r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0106, code lost:
    
        if (r4.g(r16) == r3) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        if (r2.emit(defpackage.sod0.a, r16) == r3) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0084: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:82:0x0084 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0088: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:80:0x0088 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d A[Catch: all -> 0x0050, TimeoutCancellationException -> 0x0053, CancellationException -> 0x01fc, TryCatch #2 {CancellationException -> 0x01fc, blocks: (B:10:0x004b, B:42:0x0076, B:44:0x0183, B:46:0x018d, B:47:0x01d3, B:49:0x019e, B:51:0x00a7, B:53:0x0162, B:57:0x00cc, B:59:0x013d, B:64:0x011e), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019e A[Catch: all -> 0x0050, TimeoutCancellationException -> 0x0053, CancellationException -> 0x01fc, TryCatch #2 {CancellationException -> 0x01fc, blocks: (B:10:0x004b, B:42:0x0076, B:44:0x0183, B:46:0x018d, B:47:0x01d3, B:49:0x019e, B:51:0x00a7, B:53:0x0162, B:57:0x00cc, B:59:0x013d, B:64:0x011e), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Type inference failed for: r13v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object failure;
        Ref$ObjectRef ref$ObjectRef;
        Throwable a;
        cod0 bod0Var;
        cod0 cod0Var;
        Object c;
        vpr vprVar;
        int i;
        d dVar;
        int i2;
        Ref$ObjectRef ref$ObjectRef2;
        Object d;
        Ref$ObjectRef ref$ObjectRef3;
        Object e;
        Ref$ObjectRef ref$ObjectRef4;
        PlusPayInvoice plusPayInvoice;
        Object pod0Var;
        Ref$ObjectRef ref$ObjectRef5;
        vpr vprVar2 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r4 = this.label;
        zy11 zy11Var = zy11.a;
        try {
            try {
                try {
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (TimeoutCancellationException e3) {
                e = e3;
                failure = new Result.Failure(e);
                ref$ObjectRef = r4;
                d dVar2 = this.this$0;
                a = Result.a(failure);
                if (a != null) {
                }
                return zy11Var;
            } catch (Throwable th) {
                th = th;
                failure = new Result.Failure(th);
                ref$ObjectRef = r4;
                d dVar22 = this.this$0;
                a = Result.a(failure);
                if (a != null) {
                }
                return zy11Var;
            }
        } catch (TimeoutCancellationException e4) {
            e = e4;
            r4 = obj3;
            failure = new Result.Failure(e);
            ref$ObjectRef = r4;
            d dVar222 = this.this$0;
            a = Result.a(failure);
            if (a != null) {
            }
            return zy11Var;
        } catch (Throwable th2) {
            th = th2;
            r4 = obj2;
            failure = new Result.Failure(th);
            ref$ObjectRef = r4;
            d dVar2222 = this.this$0;
            a = Result.a(failure);
            if (a != null) {
            }
            return zy11Var;
        }
        switch (r4) {
            case 0:
                kotlin.b.b(obj);
                this.L$0 = vprVar2;
                this.label = 1;
                break;
            case 1:
                kotlin.b.b(obj);
                com.yandex.plus.experiments.impl.providers.a aVar = this.this$0.e;
                this.L$0 = vprVar2;
                this.label = 2;
                break;
            case 2:
                kotlin.b.b(obj);
                ((Result) obj).getClass();
                d dVar3 = this.this$0;
                ((zio) dVar3.d).g(dVar3.a, dVar3.i);
                Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
                d dVar4 = this.this$0;
                this.L$0 = vprVar2;
                this.L$1 = ref$ObjectRef6;
                this.L$2 = null;
                this.L$3 = dVar4;
                this.L$4 = null;
                this.L$5 = vprVar2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 3;
                c = dVar4.c(this);
                if (c != coroutineSingletons) {
                    vprVar = vprVar2;
                    i = 0;
                    dVar = dVar4;
                    i2 = 0;
                    ref$ObjectRef2 = ref$ObjectRef6;
                    PlusPayInvoice plusPayInvoice2 = (PlusPayInvoice) c;
                    ref$ObjectRef2.element = plusPayInvoice2.getId();
                    this.L$0 = vprVar2;
                    this.L$1 = ref$ObjectRef2;
                    this.L$2 = null;
                    this.L$3 = dVar;
                    this.L$4 = null;
                    this.L$5 = vprVar;
                    this.L$6 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 4;
                    d = dVar.d(plusPayInvoice2, this);
                    ref$ObjectRef3 = ref$ObjectRef2;
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.L$0 = vprVar2;
                    this.L$1 = ref$ObjectRef3;
                    this.L$2 = null;
                    this.L$3 = dVar;
                    this.L$4 = null;
                    this.L$5 = vprVar;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 5;
                    e = dVar.e((PlusPayInvoice) d, vprVar, this);
                    ref$ObjectRef4 = ref$ObjectRef3;
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    plusPayInvoice = (PlusPayInvoice) e;
                    if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.SUCCESS) {
                        d.b(dVar, plusPayInvoice);
                        pod0Var = new qod0(plusPayInvoice.getId(), plusPayInvoice.getPaymentMethodId());
                    } else {
                        qqx0 qqx0Var = dVar.d;
                        ((zio) qqx0Var).e(dVar.a, (String) ref$ObjectRef4.element, dVar.i, "invoice_status: " + plusPayInvoice.getInvoiceStatus());
                        pod0Var = new pod0(plusPayInvoice.getId(), new znd0(ddd0.a(plusPayInvoice.getPayment())));
                    }
                    this.L$0 = vprVar2;
                    this.L$1 = ref$ObjectRef4;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 6;
                    ref$ObjectRef5 = ref$ObjectRef4;
                    break;
                } else {
                    return coroutineSingletons;
                }
            case 3:
                int i3 = this.I$1;
                int i4 = this.I$0;
                vpr vprVar3 = (vpr) this.L$5;
                d dVar5 = (d) this.L$3;
                Ref$ObjectRef ref$ObjectRef7 = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                i = i3;
                ref$ObjectRef2 = ref$ObjectRef7;
                vprVar = vprVar3;
                dVar = dVar5;
                i2 = i4;
                c = obj;
                PlusPayInvoice plusPayInvoice22 = (PlusPayInvoice) c;
                ref$ObjectRef2.element = plusPayInvoice22.getId();
                this.L$0 = vprVar2;
                this.L$1 = ref$ObjectRef2;
                this.L$2 = null;
                this.L$3 = dVar;
                this.L$4 = null;
                this.L$5 = vprVar;
                this.L$6 = null;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 4;
                d = dVar.d(plusPayInvoice22, this);
                ref$ObjectRef3 = ref$ObjectRef2;
                if (d == coroutineSingletons) {
                }
                this.L$0 = vprVar2;
                this.L$1 = ref$ObjectRef3;
                this.L$2 = null;
                this.L$3 = dVar;
                this.L$4 = null;
                this.L$5 = vprVar;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 5;
                e = dVar.e((PlusPayInvoice) d, vprVar, this);
                ref$ObjectRef4 = ref$ObjectRef3;
                if (e == coroutineSingletons) {
                }
                plusPayInvoice = (PlusPayInvoice) e;
                if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.SUCCESS) {
                }
                this.L$0 = vprVar2;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 6;
                ref$ObjectRef5 = ref$ObjectRef4;
                break;
            case 4:
                int i5 = this.I$1;
                int i6 = this.I$0;
                vpr vprVar4 = (vpr) this.L$5;
                d dVar6 = (d) this.L$3;
                Ref$ObjectRef ref$ObjectRef8 = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                i = i5;
                ref$ObjectRef3 = ref$ObjectRef8;
                vprVar = vprVar4;
                dVar = dVar6;
                i2 = i6;
                d = obj;
                this.L$0 = vprVar2;
                this.L$1 = ref$ObjectRef3;
                this.L$2 = null;
                this.L$3 = dVar;
                this.L$4 = null;
                this.L$5 = vprVar;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 5;
                e = dVar.e((PlusPayInvoice) d, vprVar, this);
                ref$ObjectRef4 = ref$ObjectRef3;
                if (e == coroutineSingletons) {
                }
                plusPayInvoice = (PlusPayInvoice) e;
                if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.SUCCESS) {
                }
                this.L$0 = vprVar2;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 6;
                ref$ObjectRef5 = ref$ObjectRef4;
                break;
            case 5:
                int i7 = this.I$1;
                int i8 = this.I$0;
                vpr vprVar5 = (vpr) this.L$5;
                d dVar7 = (d) this.L$3;
                Ref$ObjectRef ref$ObjectRef9 = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                i = i7;
                ref$ObjectRef4 = ref$ObjectRef9;
                vprVar = vprVar5;
                dVar = dVar7;
                i2 = i8;
                e = obj;
                plusPayInvoice = (PlusPayInvoice) e;
                if (plusPayInvoice.getInvoiceStatus() != PlusPayInvoice.Status.SUCCESS) {
                }
                this.L$0 = vprVar2;
                this.L$1 = ref$ObjectRef4;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 6;
                ref$ObjectRef5 = ref$ObjectRef4;
                break;
            case 6:
                Ref$ObjectRef ref$ObjectRef10 = (Ref$ObjectRef) this.L$1;
                kotlin.b.b(obj);
                ref$ObjectRef5 = ref$ObjectRef10;
                failure = zy11Var;
                ref$ObjectRef = ref$ObjectRef5;
                d dVar22222 = this.this$0;
                a = Result.a(failure);
                if (a != null) {
                    if (a instanceof PlusPayUnauthorizedException) {
                        cod0Var = aod0.a;
                    } else {
                        if ((a instanceof PlusPayApiException) || (a instanceof PlusPayParseException)) {
                            String message = a.getMessage();
                            bod0Var = new bod0(message != null ? message : "");
                        } else if ((a instanceof PlusPaySslException) || (a instanceof PlusPayNetworkException)) {
                            cod0Var = xnd0.a;
                        } else if (a instanceof PlusPayPaymentException) {
                            bod0Var = new znd0(((PlusPayPaymentException) a).getKind());
                        } else {
                            String message2 = a.getMessage();
                            bod0Var = new bod0(message2 != null ? message2 : "");
                        }
                        cod0Var = bod0Var;
                    }
                    ((zio) dVar22222.d).e(dVar22222.a, (String) ref$ObjectRef.element, dVar22222.i, cod0Var.toString());
                    pod0 pod0Var2 = new pod0((String) ref$ObjectRef.element, cod0Var);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = failure;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.I$0 = 0;
                    this.label = 7;
                    if (vprVar2.emit(pod0Var2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            case 7:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
