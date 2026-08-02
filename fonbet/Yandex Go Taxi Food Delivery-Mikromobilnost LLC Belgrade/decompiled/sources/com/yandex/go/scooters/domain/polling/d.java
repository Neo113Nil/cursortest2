package com.yandex.go.scooters.domain.polling;

import defpackage.ny61;
import defpackage.rsn;
import defpackage.v4r0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar, j jVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1 scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1) {
            scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1 = (ScootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1) continuation;
            int i2 = scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    Set set = (Set) rsnVar.a;
                    Set set2 = (Set) rsnVar.b;
                    EmptySet emptySet = EmptySet.a;
                    Set g = v4r0.g(set2, set == null ? emptySet : set);
                    if (set == null) {
                        set = emptySet;
                    }
                    Pair pair = new Pair(g, v4r0.g(set, set2));
                    scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.L$0 = null;
                    scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.L$1 = null;
                    scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.L$2 = null;
                    scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.L$3 = null;
                    scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1 = new ScootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPollingInteractorImpl$listenLaunchedPolls$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
