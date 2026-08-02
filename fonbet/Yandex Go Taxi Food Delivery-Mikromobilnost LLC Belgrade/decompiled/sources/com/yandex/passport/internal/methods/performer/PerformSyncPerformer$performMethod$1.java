package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportSyncLimitExceededException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.e2;
import com.yandex.passport.internal.report.ac;
import com.yandex.passport.internal.report.yd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.PerformSyncPerformer$performMethod$1", f = "PerformSyncPerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PerformSyncPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ e2 $method;
    int label;
    final /* synthetic */ b1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformSyncPerformer$performMethod$1(e2 e2Var, b1 b1Var, Continuation continuation) {
        super(2, continuation);
        this.$method = e2Var;
        this.this$0 = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PerformSyncPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PerformSyncPerformer$performMethod$1 performSyncPerformer$performMethod$1 = (PerformSyncPerformer$performMethod$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        performSyncPerformer$performMethod$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c);
        com.yandex.passport.internal.helper.h hVar = this.this$0.a;
        hVar.e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        com.yandex.passport.internal.storage.i iVar = hVar.d;
        iVar.getClass();
        com.yandex.passport.internal.storage.b bVar = new com.yandex.passport.internal.storage.b(iVar, B);
        List list = (List) bVar.c.getValue(bVar, com.yandex.passport.internal.storage.b.d[2]);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (currentTimeMillis - ((Number) obj2).longValue() < com.yandex.passport.internal.helper.h.i) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() >= 10) {
            com.yandex.passport.internal.report.reporters.f1 f1Var = hVar.g;
            f1Var.getClass();
            f1Var.f(ac.w, new yd(B));
            throw new PassportSyncLimitExceededException();
        }
        ArrayList o0 = kotlin.collections.a.o0(arrayList, Long.valueOf(currentTimeMillis));
        com.yandex.passport.internal.storage.b bVar2 = new com.yandex.passport.internal.storage.b(iVar, B);
        bVar2.c.setValue(bVar2, com.yandex.passport.internal.storage.b.d[2], o0);
        ModernAccount e = hVar.a.a().e(B);
        if (e == null) {
            throw new PassportAccountNotFoundException(B);
        }
        hVar.c.a(e.getAccount(), true);
        return zy11.a;
    }
}
