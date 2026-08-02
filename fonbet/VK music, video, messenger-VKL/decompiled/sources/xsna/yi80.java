package xsna;

import java.util.LinkedHashMap;
import one.video.stat.transport.Param;

/* compiled from: OneLogEvent.kt */
/* loaded from: classes8.dex */
public final class yi80 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final Long f;
    public final long g;
    public final String h;
    public final LinkedHashMap i;
    public final long j;

    /* compiled from: OneLogEvent.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final long c;
        public final Long d;
        public final long e;
        public final String f;
        public String g;
        public int h = -1;
        public final LinkedHashMap i = new LinkedHashMap();

        public a(long j, long j2, Long l, String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = l;
            this.e = j2;
            this.f = str3;
        }

        public final void a(long j) {
            this.i.put(Param.BUFFER_TIME, Long.valueOf(j));
        }

        public final void b(String str) {
            LinkedHashMap linkedHashMap = this.i;
            if (str != null) {
                linkedHashMap.put(Param.CONTENT_TYPE, str);
            } else {
                linkedHashMap.remove(Param.CONTENT_TYPE);
            }
        }

        public final void c(String str) {
            this.i.put(Param.PLAYBACK_QUALITY, str);
        }
    }

    public yi80(a aVar) {
        String str = aVar.a;
        String str2 = aVar.b;
        String str3 = aVar.g;
        long j = aVar.c;
        int i = aVar.h;
        Long l = aVar.d;
        long j2 = aVar.e;
        String str4 = aVar.f;
        LinkedHashMap linkedHashMap = aVar.i;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = i;
        this.f = l;
        this.g = j2;
        this.h = str4;
        this.i = linkedHashMap;
        this.j = System.currentTimeMillis();
    }
}
