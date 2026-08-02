package xsna;

import com.vk.api.internal.debug.FakeApiErrorTypes;
import java.util.EnumSet;
import java.util.List;

/* compiled from: DebugSettings.kt */
/* loaded from: classes.dex */
public final class v6l {
    public final boolean a;
    public final boolean b;
    public final EnumSet<FakeApiErrorTypes> c;
    public final int d;
    public final List<String> e;
    public final boolean f;
    public final bpn0 g;

    public v6l(boolean z, boolean z2, EnumSet enumSet, int i, List list, boolean z3, bpn0 bpn0Var) {
        this.a = z;
        this.b = z2;
        this.c = enumSet;
        this.d = i;
        this.e = list;
        this.f = z3;
        this.g = bpn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6l)) {
            return false;
        }
        v6l v6lVar = (v6l) obj;
        return this.a == v6lVar.a && this.b == v6lVar.b && epx.f(this.c, v6lVar.c) && this.d == v6lVar.d && epx.f(this.e, v6lVar.e) && this.f == v6lVar.f && this.g.equals(v6lVar.g);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        EnumSet<FakeApiErrorTypes> enumSet = this.c;
        int a = shy.a(this.d, (b + (enumSet == null ? 0 : enumSet.hashCode())) * 31, 31);
        List<String> list = this.e;
        return this.g.hashCode() + qoy.b((a + (list != null ? list.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        return "DebugSettings(useFakePushToken=" + this.a + ", useFakeSafetyNet=" + this.b + ", fakeNetworkErrors=" + this.c + ", sleepTimeoutMs=" + this.d + ", deprecatedPhotoParams=" + this.e + ", shouldValidateBaseUrlPhotoSizes=" + this.f + ", isOtelTracingEnabled=" + this.g + ')';
    }
}
