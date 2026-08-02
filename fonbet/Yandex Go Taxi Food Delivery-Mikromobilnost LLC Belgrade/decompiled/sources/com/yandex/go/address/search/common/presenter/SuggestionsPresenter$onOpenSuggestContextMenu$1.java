package com.yandex.go.address.search.common.presenter;

import defpackage.d6v0;
import defpackage.hxx;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.tse;
import defpackage.v6v0;
import defpackage.wls;
import defpackage.x9v0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.SuggestionsPresenter$onOpenSuggestContextMenu$1", f = "SuggestionsPresenter.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestionsPresenter$onOpenSuggestContextMenu$1 extends SuspendLambda implements wls {
    final /* synthetic */ v6v0 $payload;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestionsPresenter$onOpenSuggestContextMenu$1(i iVar, v6v0 v6v0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$payload = v6v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestionsPresenter$onOpenSuggestContextMenu$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestionsPresenter$onOpenSuggestContextMenu$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        i iVar;
        v6v0 v6v0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar2 = this.this$0;
                v6v0 v6v0Var2 = this.$payload;
                d6v0 d6v0Var = iVar2.W;
                EntryPoint entryPoint = v6v0Var2.e;
                x9v0 x9v0Var = v6v0Var2.a;
                this.L$0 = iVar2;
                this.L$1 = v6v0Var2;
                this.label = 1;
                Object a = ((com.yandex.go.preorder.suggested.menu.a) d6v0Var).a(entryPoint, x9v0Var, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                iVar = iVar2;
                v6v0Var = v6v0Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v6v0Var = (v6v0) this.L$1;
                iVar = (i) this.L$0;
                kotlin.b.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                ((pep0) iVar.V).f((m950) iVar.U.get(), v6v0Var, hxx.a);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            com.yandex.go.coroutines.b.e();
        }
        return zy11.a;
    }
}
