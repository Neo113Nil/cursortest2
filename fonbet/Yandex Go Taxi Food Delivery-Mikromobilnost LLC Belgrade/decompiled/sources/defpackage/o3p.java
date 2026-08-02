package defpackage;

import com.yandex.go.superapp.model.Action;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o3p {
    public static final o3p f = new o3p(Action.NONE, null, null, null, null, 30);
    public final Action a;
    public final v770 b;
    public final eh70 c;
    public final String d;
    public final List e;

    public o3p(Action action, v770 v770Var, eh70 eh70Var, String str, List list, int i) {
        v770Var = (i & 2) != 0 ? null : v770Var;
        eh70Var = (i & 4) != 0 ? null : eh70Var;
        str = (i & 8) != 0 ? null : str;
        list = (i & 16) != 0 ? EmptyList.a : list;
        this.a = action;
        this.b = v770Var;
        this.c = eh70Var;
        this.d = str;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3p)) {
            return false;
        }
        o3p o3pVar = (o3p) obj;
        return this.a == o3pVar.a && jl40.l(this.b, o3pVar.b) && jl40.l(this.c, o3pVar.c) && jl40.l(this.d, o3pVar.d) && jl40.l(this.e, o3pVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v770 v770Var = this.b;
        int hashCode2 = (hashCode + (v770Var == null ? 0 : v770Var.a.hashCode())) * 31;
        eh70 eh70Var = this.c;
        int hashCode3 = (hashCode2 + (eh70Var == null ? 0 : eh70Var.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalServiceParams(action=");
        sb.append(this.a);
        sb.append(", openReason=");
        sb.append(this.b);
        sb.append(", order=");
        sb.append(this.c);
        sb.append(", relativePath=");
        sb.append(this.d);
        sb.append(", additionalActions=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
