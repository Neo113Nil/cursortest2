package defpackage;

import com.yandex.go.address.models.Address;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mi50 {
    public final r0 a;
    public final gci0 b;
    public Address c;

    public mi50() {
        r0 c = bvf0.c(a.d);
        this.a = c;
        this.b = e.d(c);
    }

    public final Address a() {
        return ((a) this.a.getValue()).a;
    }

    public final boolean b() {
        return ((a) this.a.getValue()).b;
    }

    public static final class a {
        public static final a d = new a(0);
        public final Address a;
        public final boolean b;
        public final Integer c;

        public a(Address address, boolean z, Integer num) {
            this.a = address;
            this.b = z;
            this.c = num;
        }

        public static a a(a aVar, Address address, boolean z, Integer num, int i) {
            if ((i & 1) != 0) {
                address = aVar.a;
            }
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            if ((i & 4) != 0) {
                num = aVar.c;
            }
            aVar.getClass();
            return new a(address, z, num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && jl40.l(this.c, aVar.c);
        }

        public final int hashCode() {
            Address address = this.a;
            int e = unr0.e((address == null ? 0 : address.hashCode()) * 31, 31, this.b);
            Integer num = this.c;
            return e + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NddPreselectedState(address=");
            sb.append(this.a);
            sb.append(", isSourcePoint=");
            sb.append(this.b);
            sb.append(", pointIndex=");
            return oo31.j(sb, this.c, Extension.C_BRAKE);
        }

        public /* synthetic */ a(int i) {
            this(null, false, null);
        }

        public a() {
            this(0);
        }
    }
}
