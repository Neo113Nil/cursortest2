package defpackage;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.b;
import java.util.List;

/* loaded from: classes.dex */
public final class gdo extends jdo {
    public final umz0 d;
    public final jdo e;
    public final String f;
    public final List g;
    public final List h;

    public gdo(umz0 umz0Var, jdo jdoVar, String str) {
        super(str);
        this.d = umz0Var;
        this.e = jdoVar;
        this.f = str;
        this.g = jdoVar.c();
        this.h = jdoVar.b();
    }

    @Override // defpackage.jdo
    public final Object a(mdo mdoVar) {
        jdo jdoVar = this.e;
        Object b = mdoVar.b(jdoVar);
        d(jdoVar.b);
        umz0 umz0Var = this.d;
        if (umz0Var instanceof smz0) {
            if (b instanceof Long) {
                return Long.valueOf(((Number) b).longValue());
            }
            if (b instanceof Double) {
                return Double.valueOf(((Number) b).doubleValue());
            }
            b.d("+" + b, "A Number is expected after a unary plus.");
            throw null;
        }
        if (umz0Var instanceof qmz0) {
            if (b instanceof Long) {
                return Long.valueOf(-((Number) b).longValue());
            }
            if (b instanceof Double) {
                return Double.valueOf(-((Number) b).doubleValue());
            }
            b.d("-" + b, "A Number is expected after a unary minus.");
            throw null;
        }
        if (!umz0Var.equals(rmz0.a)) {
            throw new EvaluableException(umz0Var + " was incorrectly parsed as a unary operator.", null);
        }
        if (b instanceof Boolean) {
            return Boolean.valueOf(!((Boolean) b).booleanValue());
        }
        String str = b instanceof String ? "'" : "";
        b.d("!" + str + b + str, "A Boolean is expected after a unary not.");
        throw null;
    }

    @Override // defpackage.jdo
    public final List b() {
        return this.h;
    }

    @Override // defpackage.jdo
    public final List c() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdo)) {
            return false;
        }
        gdo gdoVar = (gdo) obj;
        return this.d.equals(gdoVar.d) && jl40.l(this.e, gdoVar.e) && jl40.l(this.f, gdoVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(this.e);
        return sb.toString();
    }
}
