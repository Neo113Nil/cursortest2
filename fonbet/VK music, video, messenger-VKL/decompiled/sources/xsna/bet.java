package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o9t;

/* compiled from: GamesCatalogSectionHeader.kt */
@b6l(c = "com.vk.games.presentation.components.GamesCatalogSectionHeaderKt$GamesCatalogSectionHeader$1$1$1", f = "GamesCatalogSectionHeader.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class bet extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ xdt $infoModel;
    final /* synthetic */ izs<o9t, s3q0> $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bet(izs<? super o9t, s3q0> izsVar, xdt xdtVar, spj<? super bet> spjVar) {
        super(2, spjVar);
        this.$onAction = izsVar;
        this.$infoModel = xdtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new bet(this.$onAction, this.$infoModel, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((bet) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.label = 1;
            if (qsl.b(80L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$onAction.invoke(new o9t.m(ydt.b(this.$infoModel)));
        return s3q0.a;
    }
}
