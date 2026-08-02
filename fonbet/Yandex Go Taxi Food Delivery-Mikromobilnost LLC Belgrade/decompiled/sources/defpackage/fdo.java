package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class fdo extends jdo {
    public final pmz0 d;
    public final jdo e;
    public final jdo f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public fdo(pmz0 pmz0Var, jdo jdoVar, jdo jdoVar2, String str) {
        super(str);
        this.d = pmz0Var;
        this.e = jdoVar;
        this.f = jdoVar2;
        this.g = str;
        this.h = a.m0(jdoVar2.c(), jdoVar.c());
        this.i = a.m0(jdoVar2.b(), jdoVar.b());
    }

    @Override // defpackage.jdo
    public final Object a(mdo mdoVar) {
        Object failure;
        jdo jdoVar = this.e;
        try {
            failure = mdoVar.b(jdoVar);
            d(jdoVar.b);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null) {
            return failure;
        }
        jdo jdoVar2 = this.f;
        Object b = mdoVar.b(jdoVar2);
        d(jdoVar2.b);
        return b;
    }

    @Override // defpackage.jdo
    public final List b() {
        return this.i;
    }

    @Override // defpackage.jdo
    public final List c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fdo) {
            fdo fdoVar = (fdo) obj;
            if (this.d == fdoVar.d && jl40.l(this.e, fdoVar.e) && jl40.l(this.f, fdoVar.f) && jl40.l(this.g, fdoVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return Extension.O_BRAKE + this.e + HexString.CHAR_SPACE + this.d + HexString.CHAR_SPACE + this.f + ')';
    }
}
