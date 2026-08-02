package com.yandex.plus.home.feature.webviews.internal.stories;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import defpackage.mvg;
import defpackage.nnv;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.wls;
import defpackage.xk41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.stories.WebStoriesPresenter$checkStoryIsVisible$3", f = "WebStoriesPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebStoriesPresenter$checkStoryIsVisible$3 extends SuspendLambda implements wls {
    final /* synthetic */ InMessage$StoryIsVisibleEvent$MiniStoryControlType $controlType;
    final /* synthetic */ InMessage$StoryIsVisibleEvent$StoryNavigationType $type;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebStoriesPresenter$checkStoryIsVisible$3(e eVar, InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType, InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$controlType = inMessage$StoryIsVisibleEvent$MiniStoryControlType;
        this.$type = inMessage$StoryIsVisibleEvent$StoryNavigationType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebStoriesPresenter$checkStoryIsVisible$3(this.this$0, this.$controlType, this.$type, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        WebStoriesPresenter$checkStoryIsVisible$3 webStoriesPresenter$checkStoryIsVisible$3 = (WebStoriesPresenter$checkStoryIsVisible$3) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webStoriesPresenter$checkStoryIsVisible$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        InMessage$StoryIsVisibleEvent$MiniStoryControlType inMessage$StoryIsVisibleEvent$MiniStoryControlType = this.$controlType;
        InMessage$StoryIsVisibleEvent$StoryNavigationType inMessage$StoryIsVisibleEvent$StoryNavigationType = this.$type;
        eVar.getClass();
        eVar.p(new nnv(inMessage$StoryIsVisibleEvent$MiniStoryControlType, inMessage$StoryIsVisibleEvent$StoryNavigationType));
        ((xk41) eVar.b).onStoryVisible();
        pzt0 pzt0Var = this.this$0.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        return zy11.a;
    }
}
