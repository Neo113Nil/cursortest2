package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n6i implements f6i {
    public final List a;
    public final doe b;
    public final String c;
    public final p1a0 d;
    public final List e;
    public final ArrayList f;
    public final l6i g;

    public n6i(List list, doe doeVar, String str, p1a0 p1a0Var, List list2, ArrayList arrayList, l6i l6iVar) {
        this.a = list;
        this.b = doeVar;
        this.c = str;
        this.d = p1a0Var;
        this.e = list2;
        this.f = arrayList;
        this.g = l6iVar;
    }

    @Override // defpackage.f6i
    public final List a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final List c() {
        return this.e;
    }

    public final String d() {
        String str = (String) a.R(this.a);
        return str == null ? "" : str;
    }

    public final p1a0 e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6i)) {
            return false;
        }
        n6i n6iVar = (n6i) obj;
        return this.a.equals(n6iVar.a) && this.b.equals(n6iVar.b) && jl40.l(this.c, n6iVar.c) && this.d.equals(n6iVar.d) && jl40.l(this.e, n6iVar.e) && this.f.equals(n6iVar.f) && jl40.l(this.g, n6iVar.g);
    }

    public final List f() {
        return this.f;
    }

    public final doe g() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        List list = this.e;
        int b = ly3.b((hashCode + (list == null ? 0 : list.hashCode())) * 31, 29791, this.f);
        l6i l6iVar = this.g;
        return b + (l6iVar != null ? l6iVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "DeliveryDraftV1(offers=" + this.a + ", userCurrentLocation=" + this.b + ", comment=" + this.c + ", paymentInfo=" + this.d + ", costCenters=" + this.e + ", routePoints=" + this.f + ", items=null, paymentPointId=null, fallbackData=" + this.g + Extension.C_BRAKE;
    }
}
