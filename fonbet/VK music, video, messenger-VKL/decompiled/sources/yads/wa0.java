package yads;

import java.util.List;
import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class wa0 implements m0 {
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public wa0(String str, String str2, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }

    @Override // yads.m0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return epx.f(this.a, wa0Var.a) && epx.f(this.b, wa0Var.b) && epx.f(this.c, wa0Var.c) && epx.f(this.d, wa0Var.d);
    }

    public final int hashCode() {
        int a = k4.a(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return this.d.hashCode() + ((a + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return com.vk.movika.sdk.base.model.n.b(xe9.a("DeeplinkAction(actionType=", str, ", fallbackUrl=", str2, ", fallbackTrackingUrls="), this.c, ", preferredPackages=", this.d, ")");
    }
}
