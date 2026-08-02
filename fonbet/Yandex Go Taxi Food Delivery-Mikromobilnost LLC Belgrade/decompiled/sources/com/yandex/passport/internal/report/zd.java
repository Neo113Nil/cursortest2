package com.yandex.passport.internal.report;

import android.os.SystemClock;
import defpackage.gw00;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes2.dex */
public final class zd {
    public long a;
    public final List b = Collections.synchronizedList(new ArrayList());
    public final Map c = Collections.synchronizedMap(new LinkedHashMap());

    public final ArrayList a() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        long j = this.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList2.add(kotlin.collections.b.i(new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, pair.c()), new Pair(RemoteBioParameters.TIME, Long.valueOf(((Number) pair.f()).longValue() - j))));
        }
        return arrayList2;
    }

    public final LinkedHashMap b() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.b);
        }
        long j = this.a;
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put((String) pair.c(), Long.valueOf(((Number) pair.f()).longValue() - j));
        }
        return linkedHashMap;
    }

    public final Map c() {
        Map t;
        synchronized (this.c) {
            t = kotlin.collections.b.t(this.c);
        }
        return t;
    }

    public final void d() {
        this.a = 0L;
        this.b.clear();
        this.c.clear();
    }

    public final void e(String str) {
        this.b.add(new Pair(str, Long.valueOf(SystemClock.elapsedRealtime())));
    }
}
