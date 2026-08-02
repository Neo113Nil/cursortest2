package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class hdo extends jdo {
    public final olz0 d;
    public final String e;

    public hdo(olz0 olz0Var, String str) {
        super(str);
        this.d = olz0Var;
        this.e = str;
    }

    @Override // defpackage.jdo
    public final Object a(mdo mdoVar) {
        olz0 olz0Var = this.d;
        if (olz0Var instanceof mlz0) {
            return ((mlz0) olz0Var).a;
        }
        if (olz0Var instanceof llz0) {
            return Boolean.valueOf(((llz0) olz0Var).a);
        }
        if (olz0Var instanceof nlz0) {
            return ((nlz0) olz0Var).a;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.jdo
    public final List b() {
        return EmptyList.a;
    }

    @Override // defpackage.jdo
    public final List c() {
        return EmptyList.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdo)) {
            return false;
        }
        hdo hdoVar = (hdo) obj;
        return this.d.equals(hdoVar.d) && jl40.l(this.e, hdoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        olz0 olz0Var = this.d;
        if (olz0Var instanceof nlz0) {
            return b64.p(new StringBuilder("'"), ((nlz0) olz0Var).a, '\'');
        }
        if (olz0Var instanceof mlz0) {
            return ((mlz0) olz0Var).a.toString();
        }
        if (olz0Var instanceof llz0) {
            return String.valueOf(((llz0) olz0Var).a);
        }
        w511.b();
        return null;
    }
}
