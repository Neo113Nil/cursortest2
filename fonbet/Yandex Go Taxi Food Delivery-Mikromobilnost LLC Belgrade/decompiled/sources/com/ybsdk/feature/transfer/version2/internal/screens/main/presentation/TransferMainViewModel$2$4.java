package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferBindCardResultResult;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.ButtonTransferType;
import defpackage.ajq0;
import defpackage.ak1;
import defpackage.eh01;
import defpackage.hg6;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.n90;
import defpackage.ny61;
import defpackage.o90;
import defpackage.orp0;
import defpackage.p90;
import defpackage.pz40;
import defpackage.q90;
import defpackage.qj01;
import defpackage.r6q0;
import defpackage.tcc;
import defpackage.tfq0;
import defpackage.tls;
import defpackage.tse;
import defpackage.uc8;
import defpackage.w511;
import defpackage.wk01;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xk01;
import defpackage.yk01;
import defpackage.zk01;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainViewModel$2$4", f = "TransferMainViewModel.kt", l = {183}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMainViewModel$2$4 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainViewModel$2$4$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01b4  */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, orp0] */
        /* JADX WARN: Type inference failed for: r7v12, types: [ig6] */
        /* JADX WARN: Type inference failed for: r7v13, types: [ig6] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v18, types: [ig6] */
        @Override // defpackage.tls
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invoke(Object obj) {
            Throwable th;
            Object failure;
            Throwable th2;
            Throwable a;
            r0 r0Var;
            Object value;
            ?? a2;
            r6q0 r6q0Var;
            Object next;
            Object obj2;
            q90 q90Var = (q90) obj;
            a aVar = (a) this.receiver;
            qj01 qj01Var = aVar.V;
            ?? r3 = orp0.e;
            wk01 b = zk01.b((xk01) aVar.X());
            if (b == null) {
                x4c.g("Wrong state in handleAddCardResult", null, null, Collections.singletonList(r3), 6);
            } else if (!(q90Var instanceof n90)) {
                if (q90Var instanceof o90) {
                    qj01Var.a.q0.u(TransferEvents$TransferBindCardResultResult.ERROR, qj01Var.b, qj01Var.c, qj01Var.d);
                    aVar.i0(b, null);
                } else {
                    if (!(q90Var instanceof p90)) {
                        w511.b();
                        return null;
                    }
                    qj01Var.a.q0.u(TransferEvents$TransferBindCardResultResult.OK, qj01Var.b, qj01Var.c, qj01Var.d);
                    uc8 uc8Var = ((p90) q90Var).a;
                    try {
                        String str = b.g.a;
                        eh01 eh01Var = b.p;
                        String str2 = eh01Var != null ? eh01Var.a : null;
                        List list = b.m;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(zk01.i((ak1) it.next(), uc8Var));
                        }
                        Iterator it2 = arrayList.iterator();
                        do {
                            try {
                                if (!it2.hasNext()) {
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                next = it2.next();
                            } catch (Throwable th3) {
                                th = th3;
                                th = r3;
                                failure = new Result.Failure(th);
                                th2 = th;
                                if (!(failure instanceof Result.Failure)) {
                                }
                                a = Result.a(failure);
                                if (a != null) {
                                }
                                return zy11.a;
                            }
                        } while (!jl40.l(((ak1) next).a, str));
                        ak1 ak1Var = (ak1) next;
                        Iterator it3 = ak1Var.f.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            if (jl40.l(((eh01) obj2).a, str2)) {
                                break;
                            }
                        }
                        this = r3;
                        th2 = null;
                        failure = wk01.b(b, null, null, null, null, ak1Var, null, null, ak1Var.n, null, null, arrayList, (eh01) obj2, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -37601, 15);
                    } catch (Throwable th4) {
                        th = th4;
                        this = r3;
                        th = null;
                    }
                    if (!(failure instanceof Result.Failure)) {
                        wk01 wk01Var = (wk01) failure;
                        pz40 Y = aVar.Y();
                        do {
                            r0Var = (r0) Y;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, wk01Var));
                        eh01 eh01Var2 = wk01Var.p;
                        if (eh01Var2 != null) {
                            ButtonTransferType buttonTransferType = eh01Var2.q;
                            int i = buttonTransferType == null ? -1 : yk01.c[buttonTransferType.ordinal()];
                            if (i != 1) {
                                if (i == 2 && (r6q0Var = eh01Var2.i) != null) {
                                    a2 = zk01.a(r6q0Var.b(), uc8Var);
                                    if (a2 != null) {
                                        aVar.W0(new ajq0(eh01Var2, a2.a, new tfq0(uc8Var.b, uc8Var.c, uc8Var.d, uc8Var.e, false, com.ybsdk.feature.transfer.version2.api.mappers.a.a(uc8Var.f))));
                                    }
                                }
                                a2 = th2;
                                if (a2 != null) {
                                }
                            } else {
                                hg6 hg6Var = eh01Var2.h;
                                if (hg6Var != null) {
                                    a2 = zk01.a(hg6Var.d, uc8Var);
                                    if (a2 != null) {
                                    }
                                }
                                a2 = th2;
                                if (a2 != null) {
                                }
                            }
                        }
                    }
                    a = Result.a(failure);
                    if (a != null) {
                        x4c.g("Failed to insert new card into the state", th2, th2, Collections.singletonList(this), 6);
                        aVar.i0(b, a);
                    }
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMainViewModel$2$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferMainViewModel$2$4(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferMainViewModel$2$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj3 = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj3;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        com.ybsdk.feature.transfer.version2.internal.screens.main.domain.b bVar = this.this$0.I;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this.this$0, a.class, "handleAddCardResult", "handleAddCardResult(Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/AddCardInteractor$AddCardResult;)V", 0);
        this.label = 1;
        n0 n0Var = bVar.a.d;
        com.ybsdk.feature.transfer.version2.internal.screens.main.domain.a aVar = new com.ybsdk.feature.transfer.version2.internal.screens.main.domain.a(anonymousClass1, bVar);
        n0Var.getClass();
        Object m = n0.m(n0Var, aVar, this);
        if (m != obj2) {
            m = obj3;
        }
        return m == obj2 ? obj2 : obj3;
    }
}
