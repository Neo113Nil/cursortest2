package xsna;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: VoipPastCallsPatch.kt */
/* loaded from: classes7.dex */
public interface xuw0 extends b59 {

    /* compiled from: VoipPastCallsPatch.kt */
    public static final class a implements xuw0 {
        public final ArrayList b;
        public final LinkedHashMap c;
        public final LinkedHashMap d;
        public final LinkedHashMap e;
        public final long f;
        public final boolean g;

        public a(ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, long j, boolean z) {
            this.b = arrayList;
            this.c = linkedHashMap;
            this.d = linkedHashMap2;
            this.e = linkedHashMap3;
            this.f = j;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + bh10.a(uf3.b(this.e, uf3.b(this.d, uf3.b(this.c, this.b.hashCode() * 31, 31), 31), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(pastCalls=");
            sb.append(this.b);
            sb.append(", pastCallsParticipants=");
            sb.append(this.c);
            sb.append(", pastCallsGroups=");
            sb.append(this.d);
            sb.append(", pastCallsContacts=");
            sb.append(this.e);
            sb.append(", nextFrom=");
            sb.append(this.f);
            sb.append(", hasMore=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: VoipPastCallsPatch.kt */
    public static final class b implements xuw0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -527851670;
        }

        public final String toString() {
            return "Start";
        }
    }
}
