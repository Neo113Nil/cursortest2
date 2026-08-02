package com.yandex.passport.sloth.url;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.sloth.url.SlothInitialUrlProvider", f = "SlothInitialUrlProvider.kt", l = {293}, m = "requireAuthCodeUrl-tGOB_vo")
/* loaded from: classes2.dex */
final class SlothInitialUrlProvider$requireAuthCodeUrl$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlothInitialUrlProvider$requireAuthCodeUrl$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = c.a(this.this$0, null, null, this);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        String str = (String) a;
        if (str != null) {
            return new com.yandex.passport.common.url.b(str);
        }
        return null;
    }
}
