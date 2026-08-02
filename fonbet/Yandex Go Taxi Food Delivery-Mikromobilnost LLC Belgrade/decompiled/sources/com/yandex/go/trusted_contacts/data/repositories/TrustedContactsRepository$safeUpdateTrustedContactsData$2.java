package com.yandex.go.trusted_contacts.data.repositories;

import defpackage.mh11;
import defpackage.mvg;
import defpackage.nh11;
import defpackage.ny61;
import defpackage.og11;
import defpackage.tls;
import defpackage.tse;
import defpackage.uh11;
import defpackage.wg11;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.trusted_contacts.data.repositories.TrustedContactsRepository$safeUpdateTrustedContactsData$2", f = "TrustedContactsRepository.kt", l = {307, 314, 318}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TrustedContactsRepository$safeUpdateTrustedContactsData$2 extends SuspendLambda implements wls {
    final /* synthetic */ tls $dataProducer;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedContactsRepository$safeUpdateTrustedContactsData$2(tls tlsVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$dataProducer = tlsVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrustedContactsRepository$safeUpdateTrustedContactsData$2(this.$dataProducer, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrustedContactsRepository$safeUpdateTrustedContactsData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r4.emit(r9, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r1.emit(r3, r8) != r0) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.trusted_contacts.data.repositories.a, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            wg11 s = r1.f.s(th);
            n0 n0Var = r1.l;
            mh11 mh11Var = new mh11(s);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
        }
        if (r1 == 0) {
            b.b(obj);
            tls tlsVar = this.$dataProducer;
            aVar = this.this$0;
            this.L$0 = aVar;
            this.L$1 = aVar;
            this.label = 1;
            obj = tlsVar.invoke(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar2 = aVar;
        } else {
            if (r1 != 1) {
                if (r1 == 2) {
                    b.b(obj);
                } else {
                    if (r1 != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
            aVar = (a) this.L$1;
            aVar2 = (a) this.L$0;
            b.b(obj);
        }
        og11 og11Var = (og11) obj;
        aVar2.i = og11Var;
        Pair a = aVar2.a.a(og11Var);
        uh11 uh11Var = (uh11) a.getFirst();
        nh11 nh11Var = (nh11) a.getSecond();
        aVar2.j.l(uh11Var);
        n0 n0Var2 = aVar2.l;
        this.L$0 = aVar;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }
}
