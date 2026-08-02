package com.yandex.quark.core.common.internal.supportedfeatures;

import defpackage.g050;
import defpackage.jlw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.core.common.internal.supportedfeatures.SupportedFeaturesManager$registerProvider$1$1", f = "SupportedFeaturesManager.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SupportedFeaturesManager$registerProvider$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Set<jlw0> $featuresAddedByThisProvider;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportedFeaturesManager$registerProvider$1$1(b bVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$featuresAddedByThisProvider = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SupportedFeaturesManager$registerProvider$1$1(this.this$0, this.$featuresAddedByThisProvider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SupportedFeaturesManager$registerProvider$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        g050 g050Var;
        Set<jlw0> set;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            kotlinx.coroutines.sync.a aVar = bVar2.c;
            Set<jlw0> set2 = this.$featuresAddedByThisProvider;
            this.L$0 = aVar;
            this.L$1 = set2;
            this.L$2 = bVar2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
            g050Var = aVar;
            set = set2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$2;
            set = (Set) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        try {
            for (jlw0 jlw0Var : set) {
                Integer num = (Integer) bVar.d.get(jlw0Var);
                int intValue = num != null ? num.intValue() : 0;
                if (intValue > 0) {
                    bVar.d.put(jlw0Var, new Integer(intValue - 1));
                    if (intValue == 1) {
                        bVar.a.a(jlw0Var);
                    }
                }
            }
            set.clear();
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
    }
}
