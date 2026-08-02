package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class lko implements ig5 {
    public static final kko Companion = new kko();
    public static final i3y[] e;
    public final vm50 a;
    public final String b;
    public final vm50 c;
    public final vm50 d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new cao(13)), null, a.b(lazyThreadSafetyMode, new cao(14)), a.b(lazyThreadSafetyMode, new cao(15))};
    }

    public /* synthetic */ lko(int i, vm50 vm50Var, String str, vm50 vm50Var2, vm50 vm50Var3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, jko.a.getDescriptor());
            throw null;
        }
        this.a = vm50Var;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vm50Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = vm50Var3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lko)) {
            return false;
        }
        lko lkoVar = (lko) obj;
        return jl40.l(this.a, lkoVar.a) && jl40.l(this.b, lkoVar.b) && jl40.l(this.c, lkoVar.c) && jl40.l(this.d, lkoVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        vm50 vm50Var = this.c;
        int hashCode = (b + (vm50Var == null ? 0 : vm50Var.hashCode())) * 31;
        vm50 vm50Var2 = this.d;
        return hashCode + (vm50Var2 != null ? vm50Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ExecuteFlexActionOnScreenAction(action=" + this.a + ", screenId=" + this.b + ", onFail=" + this.c + ", onScreenNotFound=" + this.d + Extension.C_BRAKE;
    }
}
