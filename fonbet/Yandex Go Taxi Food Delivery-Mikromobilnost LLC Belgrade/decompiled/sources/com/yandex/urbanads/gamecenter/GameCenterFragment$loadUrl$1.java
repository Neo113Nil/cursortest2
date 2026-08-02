package com.yandex.urbanads.gamecenter;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.urbanads.gamecenter.GameCenterFragment", f = "GameCenterFragment.kt", l = {188}, m = "loadUrl")
/* loaded from: classes2.dex */
public final class GameCenterFragment$loadUrl$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GameCenterFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCenterFragment$loadUrl$1(GameCenterFragment gameCenterFragment, Continuation continuation) {
        super(continuation);
        this.this$0 = gameCenterFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadUrl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadUrl = this.this$0.loadUrl(this);
        return loadUrl;
    }
}
