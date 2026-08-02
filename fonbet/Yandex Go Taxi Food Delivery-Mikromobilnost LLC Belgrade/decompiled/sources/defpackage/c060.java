package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes8.dex */
public final class c060 {
    public static final b060 Companion = new b060();
    public static final i3y[] h;
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final int e;
    public final int f;
    public final String g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{a.b(lazyThreadSafetyMode, new ic50(23)), a.b(lazyThreadSafetyMode, new ic50(24)), a.b(lazyThreadSafetyMode, new ic50(25)), a.b(lazyThreadSafetyMode, new ic50(26)), null, null, null};
    }

    public /* synthetic */ c060(int i, List list, List list2, List list3, List list4, int i2, int i3, String str) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, a060.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = i2;
        this.f = i3;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c060)) {
            return false;
        }
        c060 c060Var = (c060) obj;
        return jl40.l(this.a, c060Var.a) && jl40.l(this.b, c060Var.b) && jl40.l(this.c, c060Var.c) && jl40.l(this.d, c060Var.d) && this.e == c060Var.e && this.f == c060Var.f && jl40.l(this.g, c060Var.g);
    }

    public final int hashCode() {
        int b = oyr.b(this.f, oyr.b(this.e, unr0.c(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
        String str = this.g;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkSdkConfigurationModel(hostsForOpenInSystem=");
        sb.append(this.a);
        sb.append(", allowedDomains=");
        sb.append(this.b);
        sb.append(", jsBridgeAllowedDomains=");
        sb.append(this.c);
        sb.append(", forbiddenDomains=");
        sb.append(this.d);
        sb.append(", webViewHideThreshold=");
        sb.append(this.e);
        sb.append(", webViewDownwardScrollFriction=");
        sb.append(this.f);
        sb.append(", plusHomeBaseUrl=");
        return b64.p(sb, this.g, ')');
    }
}
