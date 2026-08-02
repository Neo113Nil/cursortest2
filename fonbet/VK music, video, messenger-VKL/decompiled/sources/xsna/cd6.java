package xsna;

import com.vk.log.L;
import io.jsonwebtoken.JwtParser;
import xsna.rrk0;

/* compiled from: BaseEventBuilder.kt */
/* loaded from: classes11.dex */
public abstract class cd6<E extends rrk0> {
    public final irk0 b;
    public boolean c;
    public boolean d;
    public Long e;

    public cd6(boolean z, irk0 irk0Var, int i) {
        z = (i & 1) != 0 ? false : z;
        this.b = (i & 8) != 0 ? qsk0.a : irk0Var;
        this.c = z;
        this.d = false;
        this.e = null;
    }

    public abstract E p();

    public final E q() {
        E p;
        if (!t() || (p = p()) == null) {
            return null;
        }
        if (!t()) {
            return p;
        }
        this.b.a(p, this.c, this.d, this.e);
        return p;
    }

    public final <T> T r(T t) {
        if (t != null) {
            return t;
        }
        L.G("Incorrect event with null value in event " + fpf0.a(getClass()).l() + JwtParser.SEPARATOR_CHAR);
        return t;
    }

    public boolean s() {
        return true;
    }

    public final boolean t() {
        if (s()) {
            return true;
        }
        L.G("Event validation error for " + fpf0.a(getClass()).l() + JwtParser.SEPARATOR_CHAR);
        return false;
    }
}
