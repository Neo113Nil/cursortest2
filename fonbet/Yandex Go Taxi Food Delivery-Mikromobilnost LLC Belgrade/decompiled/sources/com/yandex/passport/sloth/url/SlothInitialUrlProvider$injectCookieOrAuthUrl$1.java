package com.yandex.passport.sloth.url;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.sloth.url.SlothInitialUrlProvider", f = "SlothInitialUrlProvider.kt", l = {175, 175, 177}, m = "injectCookieOrAuthUrl-jH7o3nk")
/* loaded from: classes2.dex */
final class SlothInitialUrlProvider$injectCookieOrAuthUrl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothInitialUrlProvider$injectCookieOrAuthUrl$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m = this.this$0.m(null, null, false, null, this);
        if (m == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return m;
        }
        String str = (String) m;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}
