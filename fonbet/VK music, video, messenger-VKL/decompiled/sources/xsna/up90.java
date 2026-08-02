package xsna;

import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PastCallsFilterPatch.kt */
/* loaded from: classes7.dex */
public abstract class up90 implements b59 {

    /* compiled from: PastCallsFilterPatch.kt */
    public static final class a extends up90 {
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

    /* compiled from: PastCallsFilterPatch.kt */
    public static final class b extends up90 {
        public final ArrayList b;
        public final LinkedHashMap c;
        public final long d;
        public final boolean e;

        public b(ArrayList arrayList, LinkedHashMap linkedHashMap, long j, boolean z) {
            this.b = arrayList;
            this.c = linkedHashMap;
            this.d = j;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + bh10.a(uf3.b(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(pastCalls=");
            sb.append(this.b);
            sb.append(", pastCallsParticipants=");
            sb.append(this.c);
            sb.append(", nextFrom=");
            sb.append(this.d);
            sb.append(", hasMore=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: PastCallsFilterPatch.kt */
    public static abstract class c extends up90 {

        /* compiled from: PastCallsFilterPatch.kt */
        public static final class a extends c {
            public static final a b = new a();
        }

        /* compiled from: PastCallsFilterPatch.kt */
        public static final class b extends c {
            public final CallsUserId b;

            public b(CallsUserId callsUserId) {
                this.b = callsUserId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "FromGroup(id=" + this.b + ')';
            }
        }

        /* compiled from: PastCallsFilterPatch.kt */
        /* renamed from: xsna.up90$c$c, reason: collision with other inner class name */
        public static final class C3815c extends c {
            public static final C3815c b = new C3815c();
        }

        /* compiled from: PastCallsFilterPatch.kt */
        public static final class d extends c {
            public static final d b = new d();
        }
    }
}
