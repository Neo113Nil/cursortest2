package xsna;

import com.vk.auth.screendata.LibverifyScreenData;

/* compiled from: LibverifyOpenArgs.kt */
/* loaded from: classes15.dex */
public final class l3z {
    public final z5k0 a;
    public final LibverifyScreenData.MethodSelectorAuth b;

    /* compiled from: LibverifyOpenArgs.kt */
    public static final class a {
        public static l3z a(LibverifyScreenData.MethodSelectorAuth methodSelectorAuth) {
            return new l3z(new z5k0(null, methodSelectorAuth.i, methodSelectorAuth.g, methodSelectorAuth.b, null, false, false, 977), methodSelectorAuth);
        }
    }

    public l3z(z5k0 z5k0Var, LibverifyScreenData.MethodSelectorAuth methodSelectorAuth) {
        this.a = z5k0Var;
        this.b = methodSelectorAuth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3z)) {
            return false;
        }
        l3z l3zVar = (l3z) obj;
        return epx.f(this.a, l3zVar.a) && epx.f(this.b, l3zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LibverifyOpenArgs(baseArgs=" + this.a + ", libverifyScreenData=" + this.b + ')';
    }
}
