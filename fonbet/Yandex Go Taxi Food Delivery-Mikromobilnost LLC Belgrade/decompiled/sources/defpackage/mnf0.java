package defpackage;

import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import com.yandex.go.shortcuts.dto.response.PositionOverMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mnf0 {
    public final String a;
    public final gqf0 b;
    public final llf0 c;
    public final ObjectOverMap.ShowPolicy d;
    public final CharSequence e;
    public final PositionOverMap f;
    public final String g;
    public final Map h;

    public mnf0(String str, gqf0 gqf0Var, llf0 llf0Var, ObjectOverMap.ShowPolicy showPolicy, CharSequence charSequence, PositionOverMap positionOverMap, String str2, Map map) {
        this.a = str;
        this.b = gqf0Var;
        this.c = llf0Var;
        this.d = showPolicy;
        this.e = charSequence;
        this.f = positionOverMap;
        this.g = str2;
        this.h = map;
    }

    public final Map a() {
        return this.h;
    }

    public final llf0 b() {
        return this.c;
    }

    public final CharSequence c() {
        return this.e;
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnf0)) {
            return false;
        }
        mnf0 mnf0Var = (mnf0) obj;
        return jl40.l(this.a, mnf0Var.a) && jl40.l(this.b, mnf0Var.b) && jl40.l(this.c, mnf0Var.c) && jl40.l(this.d, mnf0Var.d) && jl40.l(this.e, mnf0Var.e) && this.f == mnf0Var.f && jl40.l(this.g, mnf0Var.g) && jl40.l(this.h, mnf0Var.h);
    }

    public final PositionOverMap f() {
        return this.f;
    }

    public final ObjectOverMap.ShowPolicy g() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + smw0.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.h;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "PromoConfig(id=" + this.a + ", promoShortcutModel=" + this.b + ", animation=" + this.c + ", showPolicy=" + this.d + ", bubble=" + ((Object) this.e) + ", position=" + this.f + ", contentDescription=" + this.g + ", analyticsPayload=" + this.h + Extension.C_BRAKE;
    }
}
