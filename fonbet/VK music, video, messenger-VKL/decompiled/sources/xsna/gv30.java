package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;

/* compiled from: MsgRangeArgs.kt */
/* loaded from: classes2.dex */
public final class gv30 {
    public final long a;
    public final Peer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final gkx0 f;
    public final Integer g;
    public final gkx0 h;

    /* compiled from: MsgRangeArgs.kt */
    public static final class a {
        public long a;
        public Integer b;
        public Integer c;
        public gkx0 d;
        public Integer e;
        public gkx0 f;
        public Integer g;

        public final void a() {
            this.b = null;
            this.c = null;
        }

        public final void b() {
            this.e = null;
            this.d = null;
        }

        public final void c() {
            this.g = null;
            this.f = null;
        }

        public final void d(int i) {
            a();
            c();
            this.g = Integer.valueOf(i);
        }
    }

    /* compiled from: MsgRangeArgs.kt */
    public static final class b {
        public static gv30 a(int i, long j) {
            a aVar = new a();
            aVar.a = j;
            aVar.a();
            aVar.b();
            aVar.c();
            aVar.b = Integer.valueOf(i);
            return new gv30(aVar);
        }
    }

    public gv30(a aVar) {
        int intValue;
        long j = aVar.a;
        this.a = j;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.b = Peer.a.b(j);
        Integer num = aVar.b;
        this.c = num;
        Integer num2 = aVar.c;
        this.d = num2;
        Integer num3 = aVar.e;
        this.e = num3;
        this.f = aVar.d;
        Integer num4 = aVar.g;
        this.g = num4;
        this.h = aVar.f;
        if (Long.valueOf(j).compareTo((Long) 0L) == 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "Illegal dialogId value: "));
        }
        if (num != null && (intValue = num.intValue()) <= 0) {
            throw new IllegalArgumentException(lhg.a(intValue, "Illegal itemLocalId value: "));
        }
        if (num2 != null) {
            a(num2.intValue(), "itemCnvId");
        }
        if (num3 != null) {
            a(num3.intValue(), "sinceCnvId");
        }
        if (num4 != null) {
            a(num4.intValue(), "tillCnvId");
        }
    }

    public static void a(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(zil0.a(i, "Illegal ", str, " value: "));
        }
    }
}
