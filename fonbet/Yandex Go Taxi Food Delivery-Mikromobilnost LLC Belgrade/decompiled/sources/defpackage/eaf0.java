package defpackage;

import com.yandex.go.address.models.Address;
import java.util.List;
import kotlinx.serialization.json.b;

/* loaded from: classes5.dex */
public final class eaf0 {
    public final zzs a;
    public final Address b;
    public final List c;
    public final boolean d;
    public final uc4 e;
    public final Long f;
    public final b g;
    public final b h;

    public eaf0(zzs zzsVar, Address address, List list, boolean z, uc4 uc4Var, Long l, b bVar, b bVar2, int i) {
        z = (i & 8) != 0 ? false : z;
        uc4Var = (i & 16) != 0 ? null : uc4Var;
        l = (i & 32) != 0 ? null : l;
        bVar = (i & 64) != 0 ? null : bVar;
        bVar2 = (i & 128) != 0 ? null : bVar2;
        this.a = zzsVar;
        this.b = address;
        this.c = list;
        this.d = z;
        this.e = uc4Var;
        this.f = l;
        this.g = bVar;
        this.h = bVar2;
    }

    public final Address a() {
        return this.b;
    }

    public final uc4 b() {
        return this.e;
    }

    public final b c() {
        return this.h;
    }

    public final List d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eaf0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        eaf0 eaf0Var = (eaf0) obj;
        return jl40.l(this.a, eaf0Var.a) && z81.b(this.b, eaf0Var.b) && jl40.l(this.f, eaf0Var.f) && this.d == eaf0Var.d && jl40.l(this.g, eaf0Var.g) && jl40.l(this.h, eaf0Var.h);
    }

    public final b f() {
        return this.g;
    }

    public final zzs g() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        List list = this.c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Long l = this.f;
        int e = unr0.e((hashCode2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.d);
        b bVar = this.g;
        int hashCode3 = (e + (bVar != null ? bVar.hashCode() : 0)) * 31;
        b bVar2 = this.h;
        return hashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
