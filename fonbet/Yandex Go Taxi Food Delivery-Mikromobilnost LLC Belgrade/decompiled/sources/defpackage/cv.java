package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import java.util.Iterator;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cv implements ga5 {
    public final String a;
    public final ea5 b;
    public final tbu c;
    public final boolean d;
    public final ProductMode$Taxi.SectionType e;
    public final ll4 f;
    public final fl4 g;

    public cv(String str, ea5 ea5Var, tbu tbuVar, boolean z, ProductMode$Taxi.SectionType sectionType) {
        Object obj;
        Object obj2;
        this.a = str;
        this.b = ea5Var;
        this.c = tbuVar;
        this.d = z;
        this.e = sectionType;
        Iterator it = ea5Var.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((xl4) obj) instanceof ll4) {
                    break;
                }
            }
        }
        xl4 xl4Var = (xl4) obj;
        this.f = xl4Var != null ? (ll4) xl4Var : null;
        Iterator it2 = this.b.l.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it2.next();
                if (((xl4) obj2) instanceof fl4) {
                    break;
                }
            }
        }
        xl4 xl4Var2 = (xl4) obj2;
        this.g = xl4Var2 != null ? (fl4) xl4Var2 : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv)) {
            return false;
        }
        cv cvVar = (cv) obj;
        return jl40.l(this.a, cvVar.a) && jl40.l(this.b, cvVar.b) && jl40.l(this.c, cvVar.c) && this.d == cvVar.d && this.e == cvVar.e;
    }

    @Override // defpackage.ga5
    public final ea5 getBase() {
        return this.b;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        ProductMode$Taxi.SectionType sectionType = this.e;
        return e + (sectionType == null ? 0 : sectionType.hashCode());
    }

    @Override // defpackage.ga5
    public final ga5 r(boolean z, ProductMode$Taxi.SectionType sectionType) {
        return new cv(this.a, this.b, this.c, z, sectionType);
    }

    @Override // defpackage.ga5
    public final boolean t() {
        return this.d;
    }

    public final String toString() {
        return "ActionDrivenThumbModel(id=" + this.a + ", base=" + this.b + ", service=" + this.c + ", useNavWidth=" + this.d + ", sectionType=" + this.e + Extension.C_BRAKE;
    }

    public final tbu v() {
        return this.c;
    }
}
