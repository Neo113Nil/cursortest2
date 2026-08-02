package com.yandex.go.explorer.impl.geofencing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.SystemClock;
import defpackage.bvf0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wto;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/explorer/impl/geofencing/ExplorerGeofenceReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/location/Location;", "triggeringLocation", "Lcom/yandex/go/explorer/impl/geofencing/b;", "locationFetcher", "", "maxUsableAccuracyMeters", "maxUsableAgeMs", "resolveLocation", "(Landroid/location/Location;Lcom/yandex/go/explorer/impl/geofencing/b;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "location", "", "isGoodEnough", "(Landroid/location/Location;II)Z", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "wto", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExplorerGeofenceReceiver extends BroadcastReceiver {
    private static final wto Companion = new wto();
    private static final long FRESH_LOCATION_TIMEOUT_MS = 6000;
    private static final long NANOS_IN_MS = 1000000;

    private final boolean isGoodEnough(Location location, int maxUsableAccuracyMeters, int maxUsableAgeMs) {
        return location.hasAccuracy() && location.getAccuracy() <= ((float) maxUsableAccuracyMeters) && (SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / NANOS_IN_MS <= ((long) maxUsableAgeMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveLocation(Location location, b bVar, int i, int i2, Continuation<? super Location> continuation) {
        ExplorerGeofenceReceiver$resolveLocation$1 explorerGeofenceReceiver$resolveLocation$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i3;
        Location location2;
        Location location3;
        if (continuation instanceof ExplorerGeofenceReceiver$resolveLocation$1) {
            explorerGeofenceReceiver$resolveLocation$1 = (ExplorerGeofenceReceiver$resolveLocation$1) continuation;
            int i4 = explorerGeofenceReceiver$resolveLocation$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                explorerGeofenceReceiver$resolveLocation$1.label = i4 - Integer.MIN_VALUE;
                obj = explorerGeofenceReceiver$resolveLocation$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = explorerGeofenceReceiver$resolveLocation$1.label;
                if (i3 != 0) {
                    kotlin.b.b(obj);
                    if (location != null && isGoodEnough(location, i, i2)) {
                        return location;
                    }
                    explorerGeofenceReceiver$resolveLocation$1.L$0 = location;
                    explorerGeofenceReceiver$resolveLocation$1.L$1 = bVar;
                    explorerGeofenceReceiver$resolveLocation$1.I$0 = i;
                    explorerGeofenceReceiver$resolveLocation$1.I$1 = i2;
                    explorerGeofenceReceiver$resolveLocation$1.label = 1;
                    obj = bVar.b(explorerGeofenceReceiver$resolveLocation$1);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        location3 = (Location) explorerGeofenceReceiver$resolveLocation$1.L$0;
                        kotlin.b.b(obj);
                        Location location4 = (Location) obj;
                        return location4 != null ? location3 : location4;
                    }
                    i2 = explorerGeofenceReceiver$resolveLocation$1.I$1;
                    i = explorerGeofenceReceiver$resolveLocation$1.I$0;
                    bVar = (b) explorerGeofenceReceiver$resolveLocation$1.L$1;
                    location = (Location) explorerGeofenceReceiver$resolveLocation$1.L$0;
                    kotlin.b.b(obj);
                }
                location2 = (Location) obj;
                if (location2 == null && isGoodEnough(location2, i, i2)) {
                    return location2;
                }
                explorerGeofenceReceiver$resolveLocation$1.L$0 = location;
                explorerGeofenceReceiver$resolveLocation$1.L$1 = null;
                explorerGeofenceReceiver$resolveLocation$1.L$2 = null;
                explorerGeofenceReceiver$resolveLocation$1.I$0 = i;
                explorerGeofenceReceiver$resolveLocation$1.I$1 = i2;
                explorerGeofenceReceiver$resolveLocation$1.label = 2;
                obj = bVar.a(explorerGeofenceReceiver$resolveLocation$1);
                if (obj != coroutineSingletons) {
                    location3 = location;
                    Location location42 = (Location) obj;
                    if (location42 != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        explorerGeofenceReceiver$resolveLocation$1 = new ExplorerGeofenceReceiver$resolveLocation$1(this, continuation);
        obj = explorerGeofenceReceiver$resolveLocation$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = explorerGeofenceReceiver$resolveLocation$1.label;
        if (i3 != 0) {
        }
        location2 = (Location) obj;
        if (location2 == null) {
        }
        explorerGeofenceReceiver$resolveLocation$1.L$0 = location;
        explorerGeofenceReceiver$resolveLocation$1.L$1 = null;
        explorerGeofenceReceiver$resolveLocation$1.L$2 = null;
        explorerGeofenceReceiver$resolveLocation$1.I$0 = i;
        explorerGeofenceReceiver$resolveLocation$1.I$1 = i2;
        explorerGeofenceReceiver$resolveLocation$1.label = 2;
        obj = bVar.a(explorerGeofenceReceiver$resolveLocation$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        tje.N(bvf0.a(uyj.a), null, null, new ExplorerGeofenceReceiver$onReceive$1(intent, context, this, goAsync(), null), 3);
    }
}
