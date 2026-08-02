package xsna;

import java.util.Collection;

/* compiled from: BroadcastConfigViewModel.kt */
/* loaded from: classes7.dex */
public abstract class me8 {

    /* compiled from: BroadcastConfigViewModel.kt */
    public static final class a extends me8 {
        public final Collection<qvw0> a;
        public final Collection<dfw0> b;
        public final Collection<ffw0> c;
        public final String d;
        public final String e;
        public final String f;
        public final ffw0 g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends qvw0> collection, Collection<dfw0> collection2, Collection<? extends ffw0> collection3, String str, String str2, String str3, ffw0 ffw0Var) {
            this.a = collection;
            this.b = collection2;
            this.c = collection3;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = ffw0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int a = urd0.a(s3j0.a(s3j0.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
            String str = this.e;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ffw0 ffw0Var = this.g;
            return hashCode2 + (ffw0Var != null ? ffw0Var.hashCode() : 0);
        }

        public final String toString() {
            return "Configuration(possibleOwners=" + this.a + ", possibleBroadcasts=" + this.b + ", possiblePrivacy=" + this.c + ", selectedOwnerId=" + this.d + ", selectedBroadcastId=" + this.e + ", selectedTitle=" + this.f + ", selectedPrivacy=" + this.g + ')';
        }
    }

    /* compiled from: BroadcastConfigViewModel.kt */
    public static final class b extends me8 {
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

    /* compiled from: BroadcastConfigViewModel.kt */
    public static final class c extends me8 {
        public static final c a = new c();
    }
}
