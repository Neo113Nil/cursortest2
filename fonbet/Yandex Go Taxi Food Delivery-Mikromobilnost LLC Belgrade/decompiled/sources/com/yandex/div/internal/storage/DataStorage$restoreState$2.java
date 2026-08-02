package com.yandex.div.internal.storage;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppg;
import defpackage.qpg;
import defpackage.rpg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.internal.storage.DataStorage$restoreState$2", f = "DataStorage.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class DataStorage$restoreState$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStorage$restoreState$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DataStorage$restoreState$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStorage$restoreState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar = bVar2.d;
            this.L$0 = aVar;
            this.L$1 = bVar2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
            g050Var = aVar;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            if (bVar.e.getValue() instanceof ppg) {
                try {
                    Object b = bVar.a.b(new FileInputStream(bVar.c));
                    r0 r0Var = bVar.e;
                    qpg qpgVar = new qpg(b);
                    r0Var.getClass();
                    r0Var.m(null, qpgVar);
                } catch (Exception unused) {
                    r0 r0Var2 = bVar.e;
                    rpg rpgVar = new rpg();
                    r0Var2.getClass();
                    r0Var2.m(null, rpgVar);
                }
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
