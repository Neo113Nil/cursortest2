package com.yandex.go.inapp_calls.navigation;

import android.content.Context;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.proxyprovision.j;
import defpackage.h55;
import defpackage.njv;
import defpackage.ny61;
import defpackage.tj60;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c extends h55 {
    public final Context D;
    public final com.yandex.go.inapp_calls.repository.c E;
    public final q F;
    public final tj60 G;
    public final njv H;
    public final j I;

    public c(Context context, com.yandex.go.inapp_calls.repository.c cVar, q qVar, tj60 tj60Var, njv njvVar, j jVar) {
        super(null);
        this.D = context;
        this.E = cVar;
        this.F = qVar;
        this.G = tj60Var;
        this.H = njvVar;
        this.I = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (defpackage.bb1.l0(r0) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r0) == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005c -> B:11:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(c cVar, ContinuationImpl continuationImpl) {
        InAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1 inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1;
        int i;
        int i2;
        int i3;
        cVar.getClass();
        if (continuationImpl instanceof InAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1) {
            inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1 = (InAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1) continuationImpl;
            int i4 = inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.label = i4 - Integer.MIN_VALUE;
                Object obj = inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.label = 1;
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.I$1;
                    i3 = inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.I$0;
                    kotlin.b.b(obj);
                    i2++;
                    if (i2 >= i3) {
                        return zy11.a;
                    }
                    inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.I$0 = i3;
                    inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.I$1 = i2;
                    inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.I$2 = i2;
                    inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.label = 2;
                }
                i2 = 0;
                i3 = 20;
                if (i2 >= i3) {
                }
            }
        }
        inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1 = new InAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1(cVar, continuationImpl);
        Object obj2 = inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallDownloadNotificationRouterImpl$waitUntilMainScreenReadyForShowAnything$1.label;
        if (i != 0) {
        }
        i2 = 0;
        i3 = 20;
        if (i2 >= i3) {
        }
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        this.G.c("DOWNLOADING_NOTIFICATION_ID");
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        com.yandex.go.coroutines.b.g(o(), null, null, new InAppCallDownloadNotificationRouterImpl$onLaunch$1(this, null), 3);
    }
}
