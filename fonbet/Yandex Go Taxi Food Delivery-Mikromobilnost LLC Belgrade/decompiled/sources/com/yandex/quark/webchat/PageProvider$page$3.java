package com.yandex.quark.webchat;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s690;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls690;", Constants.KEY_PAGE, "", "canLoadPage", "<anonymous>", "(Ls690;Z)Ls690;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.PageProvider$page$3", f = "Page.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PageProvider$page$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PageProvider$page$3 pageProvider$page$3 = new PageProvider$page$3(3, (Continuation) obj3);
        pageProvider$page$3.L$0 = (s690) obj;
        pageProvider$page$3.Z$0 = booleanValue;
        return pageProvider$page$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s690 s690Var = (s690) this.L$0;
        if (this.Z$0) {
            return s690Var;
        }
        return null;
    }
}
