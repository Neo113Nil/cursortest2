package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pi50 {
    public final r0 a;
    public final gci0 b;

    public pi50() {
        r0 c = bvf0.c(a.e);
        this.a = c;
        this.b = e.d(c);
    }

    public final void a(boolean z) {
        while (true) {
            r0 r0Var = this.a;
            Object value = r0Var.getValue();
            boolean z2 = z;
            if (r0Var.k(value, a.a((a) value, null, z2, null, false, 13))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    public static final class a {
        public static final a e = new a(0);
        public final zzs a;
        public final boolean b;
        public final zzs c;
        public final boolean d;

        public a(zzs zzsVar, boolean z, zzs zzsVar2, boolean z2) {
            this.a = zzsVar;
            this.b = z;
            this.c = zzsVar2;
            this.d = z2;
        }

        public static a a(a aVar, zzs zzsVar, boolean z, zzs zzsVar2, boolean z2, int i) {
            if ((i & 1) != 0) {
                zzsVar = aVar.a;
            }
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            if ((i & 4) != 0) {
                zzsVar2 = aVar.c;
            }
            if ((i & 8) != 0) {
                z2 = aVar.d;
            }
            aVar.getClass();
            return new a(zzsVar, z, zzsVar2, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && jl40.l(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            zzs zzsVar = this.a;
            int e2 = unr0.e((zzsVar == null ? 0 : zzsVar.hashCode()) * 31, 31, this.b);
            zzs zzsVar2 = this.c;
            return Boolean.hashCode(this.d) + ((e2 + (zzsVar2 != null ? zzsVar2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "LoadedPvzState(preselectedPoint=" + this.a + ", pvzNotCompatibleForSource=" + this.b + ", lastNotCompatiblePoint=" + this.c + ", preselectedPointIsSource=" + this.d + Extension.C_BRAKE;
        }

        public /* synthetic */ a(int i) {
            this(null, false, null, false);
        }

        public a() {
            this(0);
        }
    }
}
