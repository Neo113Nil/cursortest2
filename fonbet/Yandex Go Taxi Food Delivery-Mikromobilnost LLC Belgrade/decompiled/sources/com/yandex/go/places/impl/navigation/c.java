package com.yandex.go.places.impl.navigation;

import android.content.Intent;
import android.net.Uri;
import defpackage.bcc0;
import defpackage.dl80;
import defpackage.dm80;
import defpackage.gtq0;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.qu;
import defpackage.vje;
import defpackage.yl80;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c implements vje {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (com.yandex.go.places.impl.navigation.d.k0(r8, r9, true, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, Continuation continuation) {
        PlacesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1 placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1;
        int i;
        if (continuation instanceof PlacesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1) {
            placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1 = (PlacesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1) continuation;
            int i2 = placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Uri data = intent.getData();
                    if (data != null) {
                        boolean equalsIgnoreCase = "discovery".equalsIgnoreCase(data.getAuthority());
                        d dVar = this.a;
                        if (equalsIgnoreCase) {
                            dl80 dl80Var = dVar.j0;
                            boolean z = !gtq0.u(dVar);
                            dl80Var.getClass();
                            dm80 a = dl80.a(data, z, false);
                            placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.L$0 = null;
                            placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.L$1 = null;
                            placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.L$2 = null;
                            placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.label = 1;
                        } else if ("superapp_search".equalsIgnoreCase(data.getAuthority())) {
                            bcc0 bcc0Var = (bcc0) kotlin.collections.a.R((List) dVar.V.a.getValue());
                            if ((bcc0Var != null ? bcc0Var.a : null) instanceof yl80) {
                                dVar.r(new qu(9));
                                return new m5u(false, false);
                            }
                            com.yandex.go.places.impl.navigation.deeplink.helpers.a aVar = dVar.k0;
                            placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.L$0 = null;
                            placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.L$1 = null;
                            placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.label = 2;
                            Object a2 = aVar.a(intent, placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1);
                            if (a2 != coroutineSingletons) {
                                return a2;
                            }
                        }
                        return coroutineSingletons;
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                return new m5u(false, false);
            }
        }
        placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1 = new PlacesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1(this, (ContinuationImpl) continuation);
        Object obj2 = placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesInternalRouter$subscribeToDeeplinks$1$1$1$processIntent$1.label;
        if (i != 0) {
        }
        return new m5u(false, false);
    }
}
