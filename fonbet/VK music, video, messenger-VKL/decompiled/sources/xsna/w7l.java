package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.gz8;
import xsna.qva0;

/* compiled from: DecodedFramesCache.kt */
/* loaded from: classes3.dex */
public final class w7l {
    public final gz8 a;
    public final f100 b;
    public a c = a.b.a;

    /* compiled from: DecodedFramesCache.kt */
    public interface a {

        /* compiled from: DecodedFramesCache.kt */
        /* renamed from: xsna.w7l$a$a, reason: collision with other inner class name */
        public static final class C3915a implements a {
            public final long a;
            public final int b;

            public C3915a(long j, int i) {
                this.a = j;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3915a)) {
                    return false;
                }
                C3915a c3915a = (C3915a) obj;
                return this.a == c3915a.a && this.b == c3915a.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Caching(cachingTimestampStartMs=");
                sb.append(this.a);
                sb.append(", framesCached=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: DecodedFramesCache.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -480182696;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: DecodedFramesCache.kt */
        public static final class c implements a {
            public final long a;
            public final int b;

            public c(long j, int i) {
                this.a = j;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Prepared(cachedTimestampStartMs=");
                sb.append(this.a);
                sb.append(", cachedFramesDrawn=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    public w7l(gz8 gz8Var, f100 f100Var) {
        this.a = gz8Var;
        this.b = f100Var;
    }

    public final qva0.a a(int i) {
        gz8 gz8Var = this.a;
        try {
            return new qva0.a(gz8Var.m(), i);
        } catch (Throwable th) {
            f100 f100Var = this.b;
            if (f100Var != null) {
                f100Var.a("DecodedFramesCache", th);
            }
            this.c = a.b.a;
            gz8Var.r = 0;
            sk3<gz8.a> sk3Var = gz8Var.s;
            Iterator<gz8.a> it = sk3Var.iterator();
            while (it.hasNext()) {
                it.next().b.a();
            }
            sk3Var.clear();
            return null;
        }
    }

    public final void b(long j) {
        this.c = new a.C3915a(j, 1);
        gz8 gz8Var = this.a;
        gz8Var.r = 2;
        LinkedHashSet linkedHashSet = gz8Var.t;
        sk3<gz8.a> sk3Var = gz8Var.s;
        ArrayList arrayList = new ArrayList(c5g.u(sk3Var, 10));
        Iterator<gz8.a> it = sk3Var.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().b);
        }
        linkedHashSet.addAll(arrayList);
        sk3Var.clear();
    }
}
