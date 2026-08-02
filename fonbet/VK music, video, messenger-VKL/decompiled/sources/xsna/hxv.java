package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.exceptions.stacktrace.StopBgSyncAnrStackTraceInfoException;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.eventtracking.VkMainTracker;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: ImBgSyncReporterImpl.kt */
/* loaded from: classes5.dex */
public final class hxv implements gxv {
    public static final hxv a = new hxv();

    @Override // xsna.gxv
    public final void a(long j) {
        el3 el3Var = Event.b;
        Event.a b = h5s.b("vkm_stop_bg_sync_duration");
        b.b("duration", Long.valueOf(j));
        b.j(thp0.c);
        com.vk.metrics.eventtracking.b.a.k(b.e());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b2, code lost:
    
        r2.put(r3.getKey(), r3.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00be, code lost:
    
        r7 = (java.lang.StackTraceElement[]) xsna.j5g.Z(r2.values());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0023, code lost:
    
        if (r7.equals("MsgsSyncManager") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007e, code lost:
    
        if (r7.equals("UsersOnlineSyncManager") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r7.equals("DialogsSyncManager") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0082, code lost:
    
        r7 = java.lang.Thread.getAllStackTraces();
        r2 = new java.util.LinkedHashMap();
        r7 = r7.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0097, code lost:
    
        if (r7.hasNext() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0099, code lost:
    
        r3 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b0, code lost:
    
        if (xsna.epx.f(r3.getKey().getName(), "queue-sync-manager-worker") == false) goto L45;
     */
    @Override // xsna.gxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(String str) {
        StackTraceElement[] stackTraceElementArr;
        List singletonList = Collections.singletonList("LoggingTracker");
        String concat = "IM: stopBgSyncAnr: marker=".concat(str);
        switch (str.hashCode()) {
            case -1346537673:
                break;
            case -908985065:
                if (str.equals("LongPollSyncManager")) {
                    Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                        if (epx.f(entry.getKey().getName(), "im-long-poll-sync-thread")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    stackTraceElementArr = (StackTraceElement[]) j5g.Z(linkedHashMap.values());
                    break;
                }
                stackTraceElementArr = null;
                break;
            case 478121984:
                break;
            case 994801543:
                break;
            default:
                stackTraceElementArr = null;
                break;
        }
        StopBgSyncAnrStackTraceInfoException stopBgSyncAnrStackTraceInfoException = new StopBgSyncAnrStackTraceInfoException(concat, stackTraceElementArr);
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        List list = singletonList;
        bVar.getClass();
        if (BuildInfo.h()) {
            ((VkMainTracker) bVar.o(stopBgSyncAnrStackTraceInfoException)).s(list, stopBgSyncAnrStackTraceInfoException);
            return;
        }
        VkMainTracker vkMainTracker = com.vk.metrics.eventtracking.b.c;
        if (vkMainTracker != null) {
            vkMainTracker.s(list, stopBgSyncAnrStackTraceInfoException);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.vk.metrics.eventtracking.b.d.add(new Pair<>(stopBgSyncAnrStackTraceInfoException, (String) it.next()));
        }
    }
}
