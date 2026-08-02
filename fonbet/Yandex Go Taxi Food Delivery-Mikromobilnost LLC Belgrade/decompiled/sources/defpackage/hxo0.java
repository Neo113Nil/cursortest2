package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hxo0 extends r8 {
    public final r0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hxo0() {
        super(new a(r1, r2));
        wwo0 wwo0Var = null;
        int i = 3;
        this.c = bvf0.c(new a(wwo0Var, i));
    }

    public static final class a {
        public final wwo0 a;
        public final boolean b;

        public /* synthetic */ a(wwo0 wwo0Var, int i) {
            this((i & 1) != 0 ? null : wwo0Var, false);
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
            wwo0 wwo0Var = this.a;
            return Boolean.hashCode(this.b) + ((wwo0Var == null ? 0 : wwo0Var.hashCode()) * 31);
        }

        public final String toString() {
            return "State(deeplink=" + this.a + ", isEnabled=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this((wwo0) null, 3);
        }

        public a(wwo0 wwo0Var, boolean z) {
            this.a = wwo0Var;
            this.b = z;
        }
    }
}
