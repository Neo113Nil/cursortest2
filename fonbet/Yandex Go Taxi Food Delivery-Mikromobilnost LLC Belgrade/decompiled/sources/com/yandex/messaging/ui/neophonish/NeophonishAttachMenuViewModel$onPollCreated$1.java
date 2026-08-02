package com.yandex.messaging.ui.neophonish;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.cm50;
import defpackage.evu0;
import defpackage.fm50;
import defpackage.g720;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w7b;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.neophonish.NeophonishAttachMenuViewModel$onPollCreated$1", f = "NeophonishAttachMenuViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NeophonishAttachMenuViewModel$onPollCreated$1 extends SuspendLambda implements wls {
    final /* synthetic */ PollMessageDraft $draft;
    int label;
    final /* synthetic */ fm50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeophonishAttachMenuViewModel$onPollCreated$1(fm50 fm50Var, PollMessageDraft pollMessageDraft, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fm50Var;
        this.$draft = pollMessageDraft;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NeophonishAttachMenuViewModel$onPollCreated$1(this.this$0, this.$draft, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NeophonishAttachMenuViewModel$onPollCreated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fm50 fm50Var = this.this$0;
            w7b w7bVar = fm50Var.x;
            g720 g720Var = fm50Var.w.a;
            String title = this.$draft.getTitle();
            List<String> answers = this.$draft.getAnswers();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : answers) {
                if (!evu0.J((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            w7bVar.a(g720Var, title, arrayList, this.$draft.isAnonymous(), this.$draft.isMultiselect(), false, false, null);
            fm50 fm50Var2 = this.this$0;
            this.label = 1;
            if (fm50Var2.W(cm50.a, this) == coroutineSingletons) {
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
