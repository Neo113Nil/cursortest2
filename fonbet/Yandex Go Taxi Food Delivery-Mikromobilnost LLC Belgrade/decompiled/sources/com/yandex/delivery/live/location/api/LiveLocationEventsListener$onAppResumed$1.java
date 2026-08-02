package com.yandex.delivery.live.location.api;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.puh;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", ClidProvider.STATE, "", "Lquh;", "deliveries", "<anonymous>", "(ZLjava/util/List;)Z"}, k = 3, mv = {2, 3, 0})
@mvg(c = "com.yandex.delivery.live.location.api.LiveLocationEventsListener$onAppResumed$1", f = "LiveLocationEventsListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class LiveLocationEventsListener$onAppResumed$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LiveLocationEventsListener$onAppResumed$1 liveLocationEventsListener$onAppResumed$1 = new LiveLocationEventsListener$onAppResumed$1(3, (Continuation) obj3);
        liveLocationEventsListener$onAppResumed$1.L$0 = (Boolean) obj;
        liveLocationEventsListener$onAppResumed$1.L$1 = (List) obj2;
        return liveLocationEventsListener$onAppResumed$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Boolean bool = (Boolean) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof puh) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((puh) it.next()).c()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return Boolean.valueOf(jl40.l(bool, Boolean.TRUE) && z);
    }
}
