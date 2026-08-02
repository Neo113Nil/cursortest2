package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import defpackage.fnx0;
import defpackage.g92;
import defpackage.igj;
import defpackage.kb5;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.ufx0;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1", f = "DialogueUiStateInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ igj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1(igj igjVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = igjVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1 dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1 = new DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fnx0 fnx0Var = (fnx0) obj2;
            vfx0 vfx0Var = this.this$0.f;
            mi31 mi31Var = fnx0Var.a;
            vfx0Var.getClass();
            ufx0 a = vfx0.a(mi31Var);
            kb5 kb5Var = fnx0Var.e;
            if (kb5Var.d == TariffOrderFlow.DELIVERY_FLOW) {
                igj igjVar = this.this$0;
                g92Var = new r(kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.m0(new kotlinx.coroutines.flow.j0(null, kotlinx.coroutines.flow.e.I(igjVar.b.d(kb5Var, new p(((com.yandex.go.taxi.tariffs.internal.repository.k) igjVar.a).j.b(), kb5Var)), new DialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$1(igjVar, null)), new DialogueUiStateInteractor$dialogueItemsFlow$dialogueFlow$2(3, null)), igjVar.e.j(), new DialogueUiStateInteractor$dialogueItemsFlow$1(igjVar, null))), a);
            } else {
                g92Var = new g92(2, ru.yandex.taxi.requirements.utils.c.b(EmptyList.a, a));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
