package com.yandex.go.navigator.share.experiment;

import com.yandex.go.address.models.Address;
import com.yandex.go.navigator.experiment.NavigatorShareRouteExperiment;
import com.yandex.go.navigator.experiment.f;
import defpackage.avj0;
import defpackage.cf50;
import defpackage.jbh;
import defpackage.kyh0;
import defpackage.ne50;
import defpackage.ny61;
import defpackage.pe50;
import defpackage.re50;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.zuj0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c {
    public final zuj0 a;
    public final re50 b;
    public final t1b0 c;
    public final tpr d;

    public c(zuj0 zuj0Var, re50 re50Var, rqo rqoVar) {
        this.a = zuj0Var;
        this.b = re50Var;
        f fVar = NavigatorShareRouteExperiment.Companion;
        fVar.getClass();
        NavigatorShareRouteExperiment navigatorShareRouteExperiment = NavigatorShareRouteExperiment.g;
        t1b0 e = ((jbh) rqoVar).e(navigatorShareRouteExperiment);
        this.c = e;
        tpr a = e.a();
        fVar.getClass();
        this.d = com.yandex.go.coroutines.b.d(a, new ShareRouteExperimentRepository$special$$inlined$start$1(navigatorShareRouteExperiment, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ShareRouteExperimentRepository$configSuspend$1 shareRouteExperimentRepository$configSuspend$1;
        int i;
        if (continuationImpl instanceof ShareRouteExperimentRepository$configSuspend$1) {
            shareRouteExperimentRepository$configSuspend$1 = (ShareRouteExperimentRepository$configSuspend$1) continuationImpl;
            int i2 = shareRouteExperimentRepository$configSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shareRouteExperimentRepository$configSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shareRouteExperimentRepository$configSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shareRouteExperimentRepository$configSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    shareRouteExperimentRepository$configSuspend$1.L$0 = this;
                    shareRouteExperimentRepository$configSuspend$1.label = 1;
                    obj = this.c.b(shareRouteExperimentRepository$configSuspend$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) shareRouteExperimentRepository$configSuspend$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.b((NavigatorShareRouteExperiment) obj);
            }
        }
        shareRouteExperimentRepository$configSuspend$1 = new ShareRouteExperimentRepository$configSuspend$1(this, continuationImpl);
        Object obj2 = shareRouteExperimentRepository$configSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shareRouteExperimentRepository$configSuspend$1.label;
        if (i != 0) {
        }
        return this.b((NavigatorShareRouteExperiment) obj2);
    }

    public final cf50 b(NavigatorShareRouteExperiment navigatorShareRouteExperiment) {
        List list;
        ne50 ne50Var;
        Address address;
        boolean z = navigatorShareRouteExperiment.b;
        Map map = navigatorShareRouteExperiment.c;
        Object obj = map.get(navigatorShareRouteExperiment.d);
        zuj0 zuj0Var = this.a;
        if (obj == null) {
            obj = ((avj0) zuj0Var).h(kyh0.navigator_share_route_text);
        }
        String str = (String) obj;
        pe50 c = this.b.c();
        String format = String.format(str, Arrays.copyOf(new Object[]{(c == null || (list = c.b) == null || (ne50Var = (ne50) kotlin.collections.a.b0(list)) == null || (address = ne50Var.c) == null) ? null : address.d(), "yango.com/link/[TODO ORDER_ID]"}, 2));
        Object obj2 = map.get(navigatorShareRouteExperiment.e);
        if (obj2 == null) {
            obj2 = ((avj0) zuj0Var).h(kyh0.navigator_share_route_title);
        }
        return new cf50(z, format, (String) obj2);
    }
}
