package com.yandex.messaging.internal.translator;

import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;
import defpackage.cn2;
import defpackage.cz01;
import defpackage.dvw;
import defpackage.j18;
import defpackage.lc3;
import defpackage.mvg;
import defpackage.n5t0;
import defpackage.ny61;
import defpackage.ry10;
import defpackage.tse;
import defpackage.wls;
import defpackage.x08;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1", f = "TranslationController.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $max$inlined;
    final /* synthetic */ long $min$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1(Continuation continuation, j jVar, long j, long j2) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$max$inlined = j;
        this.$min$inlined = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1 translationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1 = new TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1(continuation, this.this$0, this.$max$inlined, this.$min$inlined);
        translationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1.L$0 = obj;
        return translationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        this.L$0 = tseVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        j jVar = this.this$0;
        n5t0 n5t0Var = jVar.g;
        String str = jVar.f.b;
        ry10 ry10Var = new ry10(this.$max$inlined, this.$min$inlined, MessagesRange$LoadingType.FromNewest);
        j jVar2 = this.this$0;
        j jVar3 = this.this$0;
        x08 f = n5t0Var.f(new cz01(jVar3, j18Var, str, ry10Var, jVar2.e.b.z().a(jVar2.f.a), 2 * this.this$0.i.a, jVar3.h));
        j18Var.w(new lc3(tseVar, f != null ? new cn2(f, 1) : null, 4));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
