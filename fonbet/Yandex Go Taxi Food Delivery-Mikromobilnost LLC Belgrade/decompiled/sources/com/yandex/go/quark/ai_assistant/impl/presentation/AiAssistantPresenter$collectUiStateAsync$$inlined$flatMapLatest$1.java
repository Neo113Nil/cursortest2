package com.yandex.go.quark.ai_assistant.impl.presentation;

import com.yandex.go.quark.dynamic.c;
import com.yandex.go.quark.dynamic.chat.a;
import com.yandex.go.quark.dynamic.h;
import defpackage.g92;
import defpackage.jqr;
import defpackage.lm1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8g0;
import defpackage.rdb;
import defpackage.tpr;
import defpackage.ul1;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wl1;
import defpackage.xig0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.ai_assistant.impl.presentation.AiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1", f = "AiAssistantPresenter.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class AiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ wl1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1(wl1 wl1Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = wl1Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1 aiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1 = new AiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        aiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        aiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1.L$1 = obj2;
        return aiAssistantPresenter$collectUiStateAsync$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o8g0 o8g0Var;
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            rdb rdbVar = (rdb) obj2;
            wl1 wl1Var = this.this$0;
            if (rdbVar != null) {
                c cVar = (c) rdbVar;
                o8g0Var = new o8g0(cVar.c, cVar.b);
            } else {
                o8g0Var = null;
            }
            wl1Var.D = o8g0Var;
            if (rdbVar != null) {
                c cVar2 = (c) rdbVar;
                h hVar = cVar2.c;
                jqr jqrVar = new jqr(cVar2.b(), new AiAssistantPresenter$collectUiStateAsync$1$chatViewStateFlow$1(this.this$0, null), 3);
                AiAssistantPresenter$collectUiStateAsync$1$1 aiAssistantPresenter$collectUiStateAsync$1$1 = new AiAssistantPresenter$collectUiStateAsync$1$1(0, (ul1) this.this$0.Dg(), ul1.class, "onBackPressed", "onBackPressed()V", 0);
                int i2 = xig0.a[hVar.d.b.ordinal()];
                if (i2 == 1) {
                    ((a) hVar.l.get()).c = aiAssistantPresenter$collectUiStateAsync$1$1;
                } else if (i2 != 2) {
                    w511.b();
                    return null;
                }
                g92Var = new m0(jqrVar, new com.yandex.go.quark.dynamic.b(cVar2.b.o.e, hVar), new AiAssistantPresenter$collectUiStateAsync$1$2(this.this$0, rdbVar, null));
            } else {
                g92Var = new g92(2, new lm1(null));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
