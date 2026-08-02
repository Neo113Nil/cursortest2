package com.yandex.go.flex.main_screen.presentation.feed;

import defpackage.foq;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ra00;
import defpackage.sph;
import defpackage.v770;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class a extends foq {
    public final ra00 b;
    public final com.yandex.go.navigation.screen.c c;
    public final yvf0 d;
    public final com.yandex.go.lifecycle.a e;

    public a(ra00 ra00Var, com.yandex.go.navigation.screen.c cVar, yvf0 yvf0Var, com.yandex.go.lifecycle.a aVar) {
        this.b = ra00Var;
        this.c = cVar;
        this.d = yvf0Var;
        this.e = aVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        FeedDeeplinkHandler$handleDeeplink$1 feedDeeplinkHandler$handleDeeplink$1;
        int i;
        if (continuationImpl instanceof FeedDeeplinkHandler$handleDeeplink$1) {
            feedDeeplinkHandler$handleDeeplink$1 = (FeedDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = feedDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    feedDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    feedDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    feedDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    feedDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    feedDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.e.a(feedDeeplinkHandler$handleDeeplink$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b bVar = (com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b) this.d.get();
                if (!this.c.f()) {
                    boolean u = bVar.V().u();
                    sph sphVar = sph.a;
                    if (u) {
                        bVar.V().Q(sphVar);
                    } else {
                        this.b.c.e(bVar, sphVar);
                    }
                }
                return zy11.a;
            }
        }
        feedDeeplinkHandler$handleDeeplink$1 = new FeedDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = feedDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b bVar2 = (com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.b) this.d.get();
        if (!this.c.f()) {
        }
        return zy11.a;
    }
}
