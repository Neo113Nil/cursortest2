package xsna;

import java.util.Collection;

/* compiled from: BroadcastConfigFeatureState.kt */
/* loaded from: classes7.dex */
public abstract class rd8 {

    /* compiled from: BroadcastConfigFeatureState.kt */
    public static final class b extends rd8 {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: BroadcastConfigFeatureState.kt */
    public static final class c extends rd8 {
        public static final c a = new c();
    }

    /* compiled from: BroadcastConfigFeatureState.kt */
    public static final class d extends rd8 {
        public static final d a = new d();
    }

    /* compiled from: BroadcastConfigFeatureState.kt */
    public static final class a extends rd8 {
        public final qvw0 a;
        public final Collection<qvw0> b;
        public final Collection<dfw0> c;
        public final Collection<ffw0> d;
        public final String e;
        public final String f;
        public final String g;
        public final ffw0 h;
        public final boolean i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(qvw0 qvw0Var, Collection<? extends qvw0> collection, Collection<dfw0> collection2, Collection<? extends ffw0> collection3, String str, String str2, String str3, ffw0 ffw0Var, boolean z) {
            this.a = qvw0Var;
            this.b = collection;
            this.c = collection2;
            this.d = collection3;
            this.e = str;
            this.f = str2;
            this.g = str3;
            this.h = ffw0Var;
            this.i = z;
        }

        public static a a(a aVar, Collection collection, String str, String str2, String str3, ffw0 ffw0Var, boolean z, int i) {
            qvw0 qvw0Var = aVar.a;
            Collection<qvw0> collection2 = aVar.b;
            Collection<dfw0> collection3 = aVar.c;
            if ((i & 8) != 0) {
                collection = aVar.d;
            }
            Collection collection4 = collection;
            if ((i & 16) != 0) {
                str = aVar.e;
            }
            String str4 = str;
            if ((i & 32) != 0) {
                str2 = aVar.f;
            }
            String str5 = str2;
            if ((i & 64) != 0) {
                str3 = aVar.g;
            }
            String str6 = str3;
            ffw0 ffw0Var2 = (i & 128) != 0 ? aVar.h : ffw0Var;
            boolean z2 = (i & 256) != 0 ? aVar.i : z;
            aVar.getClass();
            return new a(qvw0Var, collection2, collection3, collection4, str4, str5, str6, ffw0Var2, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i;
        }

        public final int hashCode() {
            qvw0 qvw0Var = this.a;
            int a = urd0.a(s3j0.a(s3j0.a(s3j0.a((qvw0Var == null ? 0 : qvw0Var.hashCode()) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e);
            String str = this.f;
            return Boolean.hashCode(this.i) + ((this.h.hashCode() + urd0.a((a + (str != null ? str.hashCode() : 0)) * 31, 31, this.g)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Configuration(unchangeableOwner=");
            sb.append(this.a);
            sb.append(", possibleOwners=");
            sb.append(this.b);
            sb.append(", possibleBroadcasts=");
            sb.append(this.c);
            sb.append(", possiblePrivacy=");
            sb.append(this.d);
            sb.append(", selectedOwnerId=");
            sb.append(this.e);
            sb.append(", selectedBroadcastId=");
            sb.append(this.f);
            sb.append(", selectedTitle=");
            sb.append(this.g);
            sb.append(", selectedPrivacy=");
            sb.append(this.h);
            sb.append(", isCallRecord=");
            return defpackage.q0.a(sb, this.i, ')');
        }

        public /* synthetic */ a(qvw0 qvw0Var, Collection collection, Collection collection2, Collection collection3, String str, String str2, ffw0 ffw0Var) {
            this(qvw0Var, collection, collection2, collection3, str, null, str2, ffw0Var, false);
        }
    }
}
