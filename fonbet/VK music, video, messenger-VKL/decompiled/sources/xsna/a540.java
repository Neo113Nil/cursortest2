package xsna;

import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import xsna.g8i;

/* compiled from: CompletionMarkerUtils.kt */
/* loaded from: classes2.dex */
public final class a540 implements g8i {
    public final Collection<g8i> a;

    /* JADX WARN: Multi-variable type inference failed */
    public a540(Collection<? extends g8i> collection) {
        this.a = collection;
    }

    @Override // xsna.g8i
    public final g8i.a a(long j, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        long max = Math.max(0L, timeUnit.toMillis(j));
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList(arrayList);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime + max;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        Iterator it = arrayList.iterator();
        g8i g8iVar = null;
        while (it.hasNext()) {
            g8i g8iVar2 = (g8i) it.next();
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            Iterator it2 = it;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            boolean b = g8iVar2.b(j2 - elapsedRealtime);
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            if (b) {
                hashMap.put(g8iVar2, Long.valueOf(elapsedRealtime4 - elapsedRealtime3));
                arrayList2.remove(g8iVar2);
                elapsedRealtime = SystemClock.elapsedRealtime();
            } else {
                arrayList2.remove(g8iVar2);
                g8iVar = g8iVar2;
            }
            it = it2;
        }
        return new g8i.a(g8iVar == null, max, SystemClock.elapsedRealtime() - elapsedRealtime2, g8iVar, hashMap, arrayList2);
    }

    @Override // xsna.g8i
    public final void await() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((g8i) it.next()).await();
        }
    }

    @Override // xsna.g8i
    public final boolean b(long j) {
        return a(j, TimeUnit.MILLISECONDS).d == null;
    }

    public final void c(ArrayList arrayList) {
        for (g8i g8iVar : this.a) {
            if (g8iVar instanceof a540) {
                ((a540) g8iVar).c(arrayList);
            } else {
                arrayList.add(g8iVar);
            }
        }
    }

    @Override // xsna.g8i
    public final String id() {
        return air.b(']', "MarkersGroup[", j5g.g0(this.a, StringUtils.COMMA, null, null, 0, null, 62));
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        c(arrayList);
        return air.b(')', "MultiCompletionMarker(", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new nyq(15), 30));
    }
}
