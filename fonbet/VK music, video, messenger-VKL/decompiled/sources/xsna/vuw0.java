package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: VoipPastCallsPatch.kt */
/* loaded from: classes7.dex */
public interface vuw0 extends b59 {

    /* compiled from: VoipPastCallsPatch.kt */
    public static final class a implements vuw0 {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: VoipPastCallsPatch.kt */
    public static final class b implements vuw0 {
        public final ArrayList b;
        public final LinkedHashMap c;
        public final LinkedHashMap d;
        public final LinkedHashMap e;
        public final LinkedHashMap f;
        public final long g;
        public final boolean h;
        public final boolean i;

        public b(ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, long j, boolean z, boolean z2) {
            this.b = arrayList;
            this.c = linkedHashMap;
            this.d = linkedHashMap2;
            this.e = linkedHashMap3;
            this.f = linkedHashMap4;
            this.g = j;
            this.h = z;
            this.i = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f.equals(bVar.f) && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + qoy.b(bh10.a(uf3.b(this.f, uf3.b(this.e, uf3.b(this.d, uf3.b(this.c, this.b.hashCode() * 31, 31), 31), 31), 31), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(pastCalls=");
            sb.append(this.b);
            sb.append(", pastCallsParticipants=");
            sb.append(this.c);
            sb.append(", pastCallsGroups=");
            sb.append(this.d);
            sb.append(", pastCallsFilterGroups=");
            sb.append(this.e);
            sb.append(", pastCallsContacts=");
            sb.append(this.f);
            sb.append(", nextFrom=");
            sb.append(this.g);
            sb.append(", hasMore=");
            sb.append(this.h);
            sb.append(", hasManagedGroups=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: VoipPastCallsPatch.kt */
    public static final class c implements vuw0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 967419623;
        }

        public final String toString() {
            return "Start";
        }
    }
}
