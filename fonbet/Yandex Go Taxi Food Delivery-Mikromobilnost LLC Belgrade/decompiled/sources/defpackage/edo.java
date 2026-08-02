package defpackage;

import com.yandex.div.evaluable.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class edo extends jdo {
    public final jdo d;
    public final jdo e;
    public final jdo f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public edo(jdo jdoVar, jdo jdoVar2, jdo jdoVar3, String str) {
        super(str);
        this.d = jdoVar;
        this.e = jdoVar2;
        this.f = jdoVar3;
        this.g = str;
        this.h = a.m0(jdoVar3.c(), a.m0(jdoVar2.c(), jdoVar.c()));
        this.i = a.m0(jdoVar3.b(), a.m0(jdoVar2.b(), jdoVar.b()));
    }

    @Override // defpackage.jdo
    public final Object a(mdo mdoVar) {
        jdo jdoVar = this.d;
        Object b = mdoVar.b(jdoVar);
        d(jdoVar.b);
        boolean z = b instanceof Boolean;
        jdo jdoVar2 = this.f;
        jdo jdoVar3 = this.e;
        if (z) {
            if (((Boolean) b).booleanValue()) {
                Object b2 = mdoVar.b(jdoVar3);
                d(jdoVar3.b);
                return b2;
            }
            Object b3 = mdoVar.b(jdoVar2);
            d(jdoVar2.b);
            return b3;
        }
        b.d(jdoVar + " ? " + jdoVar3 + " : " + jdoVar2, "Ternary must be called with a Boolean value as a condition.");
        throw null;
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
        if (!(obj instanceof edo)) {
            return false;
        }
        edo edoVar = (edo) obj;
        return jl40.l(this.d, edoVar.d) && jl40.l(this.e, edoVar.e) && jl40.l(this.f, edoVar.f) && jl40.l(this.g, edoVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (omz0.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return Extension.O_BRAKE + this.d + HexString.CHAR_SPACE + nmz0.a + HexString.CHAR_SPACE + this.e + HexString.CHAR_SPACE + mmz0.a + HexString.CHAR_SPACE + this.f + ')';
    }
}
