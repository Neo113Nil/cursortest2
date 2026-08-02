package yads;

import java.util.List;
import xsna.epx;
import xsna.vp;

/* loaded from: classes10.dex */
public final class po1 {
    public final pk1 a;
    public final we3 b;
    public final List c;

    public po1(pk1 pk1Var, we3 we3Var, List list) {
        this.a = pk1Var;
        this.b = we3Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po1)) {
            return false;
        }
        po1 po1Var = (po1) obj;
        return epx.f(this.a, po1Var.a) && epx.f(this.b, po1Var.b) && epx.f(this.c, po1Var.c);
    }

    public final int hashCode() {
        pk1 pk1Var = this.a;
        int hashCode = (pk1Var == null ? 0 : pk1Var.hashCode()) * 31;
        we3 we3Var = this.b;
        int hashCode2 = (hashCode + (we3Var == null ? 0 : we3Var.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        pk1 pk1Var = this.a;
        we3 we3Var = this.b;
        List list = this.c;
        StringBuilder sb = new StringBuilder("MediaValue(media=");
        sb.append(pk1Var);
        sb.append(", video=");
        sb.append(we3Var);
        sb.append(", imageValues=");
        return vp.b(")", sb, list);
    }
}
