package xsna;

import com.vk.core.compose.component.topbar.TopBar$Before;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.o9t;

/* compiled from: GameCatalogTopBarLego.kt */
@b6l(c = "com.vk.games.presentation.components.topbar.GameCatalogTopBarLegoKt$GamesCatalogTopBarLego$1$1", f = "GameCatalogTopBarLego.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class t6t extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Object $before;
    final /* synthetic */ izs<o9t, s3q0> $onAction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t6t(Object obj, izs<? super o9t, s3q0> izsVar, spj<? super t6t> spjVar) {
        super(2, spjVar);
        this.$before = obj;
        this.$onAction = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new t6t(this.$before, this.$onAction, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((t6t) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        Object obj2 = this.$before;
        if (obj2 instanceof TopBar$Before.a) {
            this.$onAction.invoke(new o9t.q.f(((TopBar$Before.a) obj2).d()));
        }
        return s3q0.a;
    }
}
