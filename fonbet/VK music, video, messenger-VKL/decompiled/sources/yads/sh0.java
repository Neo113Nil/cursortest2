package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.vp;

/* loaded from: classes10.dex */
public final class sh0 implements m0 {
    public final String a;
    public final hi0 b;
    public final List c;

    public sh0(String str, hi0 hi0Var, ArrayList arrayList) {
        this.a = str;
        this.b = hi0Var;
        this.c = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh0)) {
            return false;
        }
        sh0 sh0Var = (sh0) obj;
        return epx.f(this.a, sh0Var.a) && epx.f(this.b, sh0Var.b) && epx.f(this.c, sh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.a;
        hi0 hi0Var = this.b;
        List list = this.c;
        StringBuilder sb = new StringBuilder("DivKitAdtuneAction(actionType=");
        sb.append(str);
        sb.append(", design=");
        sb.append(hi0Var);
        sb.append(", trackingUrls=");
        return vp.b(")", sb, list);
    }
}
