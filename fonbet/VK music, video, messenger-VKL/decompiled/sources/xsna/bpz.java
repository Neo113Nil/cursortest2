package xsna;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LoadEventInfo.java */
/* loaded from: classes12.dex */
public final class bpz {
    public static final AtomicLong g = new AtomicLong();
    public final evk a;
    public final Uri b;
    public final Map<String, List<String>> c;
    public final long d;
    public final long e;
    public final long f;

    public bpz(long j, evk evkVar) {
        this(evkVar, evkVar.a, Collections.EMPTY_MAP, j, 0L, 0L);
    }

    public bpz(evk evkVar, Uri uri, Map map, long j, long j2, long j3) {
        this.a = evkVar;
        this.b = uri;
        this.c = map;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }
}
