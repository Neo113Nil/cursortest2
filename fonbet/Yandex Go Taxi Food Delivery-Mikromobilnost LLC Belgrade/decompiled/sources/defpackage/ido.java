package defpackage;

import com.yandex.div.evaluable.MissingVariableException;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class ido extends jdo {
    public final String d;
    public final String e;
    public final List f;
    public final EmptyList g;

    public ido(String str, String str2) {
        super(str2);
        this.d = str;
        this.e = str2;
        this.f = Collections.singletonList(str);
        this.g = EmptyList.a;
    }

    @Override // defpackage.jdo
    public final Object a(mdo mdoVar) {
        o231 o231Var = (o231) mdoVar.a.b;
        String str = this.d;
        Object obj = o231Var.get(str);
        if (obj != null) {
            return obj;
        }
        throw new MissingVariableException(str);
    }

    @Override // defpackage.jdo
    public final List b() {
        return this.g;
    }

    @Override // defpackage.jdo
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ido)) {
            return false;
        }
        ido idoVar = (ido) obj;
        return this.d.equals(idoVar.d) && jl40.l(this.e, idoVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return this.d;
    }
}
