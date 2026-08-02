package defpackage;

import android.os.SystemClock;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bcb {
    public final w3c a = w3c.a;
    public final rnz b = new rnz((Object) null);

    public final ecb a(long j) {
        rnz rnzVar = this.b;
        a aVar = (a) rnzVar.c(j);
        Long l = aVar != null ? aVar.a : null;
        w3c w3cVar = this.a;
        int i = 2;
        if (aVar == null) {
            w3cVar.getClass();
            rnzVar.h(j, new a(Long.valueOf(SystemClock.elapsedRealtime()), i));
            return new ccb(2000L);
        }
        boolean z = aVar.b;
        if (l != null) {
            long longValue = l.longValue() + 2000;
            w3cVar.getClass();
            long elapsedRealtime = longValue - SystemClock.elapsedRealtime();
            return elapsedRealtime <= 0 ? dcb.a : new ccb(elapsedRealtime);
        }
        if (z) {
            w3cVar.getClass();
            rnzVar.h(j, new a(Long.valueOf(SystemClock.elapsedRealtime()), z));
            return new ccb(2000L);
        }
        z83.i();
        w3cVar.getClass();
        rnzVar.h(j, new a(Long.valueOf(SystemClock.elapsedRealtime()), i));
        return new ccb(2000L);
    }

    public static final class a {
        public final Long a;
        public final boolean b;

        public /* synthetic */ a(Long l, int i) {
            this((i & 1) != 0 ? null : l, (i & 2) == 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            Long l = this.a;
            return Boolean.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
        }

        public final String toString() {
            return "ItemData(translationRequestedTime=" + this.a + ", isTranslationPending=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this((Long) null, 3);
        }

        public a(Long l, boolean z) {
            this.a = l;
            this.b = z;
        }
    }
}
