package com.yandex.go.quark.ai_assistant.impl.presentation;

import android.view.View;
import com.yandex.go.quark.ai_assistant.api.chat.ChatViewNavigationEntry$Type;
import com.yandex.go.quark.dynamic.c;
import defpackage.im1;
import defpackage.km1;
import defpackage.lm1;
import defpackage.mvg;
import defpackage.ndb;
import defpackage.nl1;
import defpackage.ny61;
import defpackage.odb;
import defpackage.pdb;
import defpackage.qdb;
import defpackage.rdb;
import defpackage.vdb;
import defpackage.w511;
import defpackage.wl1;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqdb;", "viewState", "Lvdb;", "navigationEntry", "Lmm1;", "<anonymous>", "(Lqdb;Lvdb;)Lmm1;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.quark.ai_assistant.impl.presentation.AiAssistantPresenter$collectUiStateAsync$1$2", f = "AiAssistantPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AiAssistantPresenter$collectUiStateAsync$1$2 extends SuspendLambda implements zls {
    final /* synthetic */ rdb $chatViewController;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ wl1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiAssistantPresenter$collectUiStateAsync$1$2(wl1 wl1Var, rdb rdbVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = wl1Var;
        this.$chatViewController = rdbVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AiAssistantPresenter$collectUiStateAsync$1$2 aiAssistantPresenter$collectUiStateAsync$1$2 = new AiAssistantPresenter$collectUiStateAsync$1$2(this.this$0, this.$chatViewController, (Continuation) obj3);
        aiAssistantPresenter$collectUiStateAsync$1$2.L$0 = (qdb) obj;
        aiAssistantPresenter$collectUiStateAsync$1$2.L$1 = (vdb) obj2;
        return aiAssistantPresenter$collectUiStateAsync$1$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qdb qdbVar = (qdb) this.L$0;
        vdb vdbVar = (vdb) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        wl1 wl1Var = this.this$0;
        View view = ((c) this.$chatViewController).a;
        wl1Var.getClass();
        if (qdbVar == null || qdbVar.equals(pdb.a)) {
            return new lm1(view);
        }
        if (qdbVar.equals(odb.a)) {
            return new km1(view, vdbVar != null ? vdbVar.c : null, (vdbVar != null ? vdbVar.b : null) == ChatViewNavigationEntry$Type.CHAT);
        }
        if (qdbVar.equals(ndb.a)) {
            nl1 nl1Var = wl1Var.A;
            return new im1(view, nl1Var.a, nl1Var.b, nl1Var.c);
        }
        w511.b();
        return null;
    }
}
