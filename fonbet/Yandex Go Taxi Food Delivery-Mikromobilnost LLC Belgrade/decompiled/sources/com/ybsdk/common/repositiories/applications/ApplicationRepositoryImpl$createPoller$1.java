package com.ybsdk.common.repositiories.applications;

import com.ybsdk.common.repositiories.applications.poller.ApplicationStatusFailedException;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.network.dto.ApplicationStatusResponse;
import defpackage.b13;
import defpackage.c13;
import defpackage.mvg;
import defpackage.n13;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.o2e0;
import defpackage.p2e0;
import defpackage.q2e0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationStatusResponse;", "it", "Ls2e0;", "", "<anonymous>", "(Lcom/ybsdk/network/dto/ApplicationStatusResponse;)Ls2e0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.repositiories.applications.ApplicationRepositoryImpl$createPoller$1", f = "ApplicationRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApplicationRepositoryImpl$createPoller$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApplicationRepositoryImpl$createPoller$1 applicationRepositoryImpl$createPoller$1 = new ApplicationRepositoryImpl$createPoller$1(2, continuation);
        applicationRepositoryImpl$createPoller$1.L$0 = obj;
        return applicationRepositoryImpl$createPoller$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ApplicationRepositoryImpl$createPoller$1) create((ApplicationStatusResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b13 c = n13.c((ApplicationStatusResponse) this.L$0);
        int i = c13.a[c.a.ordinal()];
        if (i == 1) {
            return o2e0.a;
        }
        if (i == 2) {
            return new p2e0(c.d, 8, c.b, c.c);
        }
        if (i == 3) {
            return new n2e0(new ApplicationStatusFailedException(c.b, c.c, c.d, (Themes) null, (List) null, 32));
        }
        if (i == 4) {
            return new q2e0(null, true);
        }
        w511.b();
        return null;
    }
}
