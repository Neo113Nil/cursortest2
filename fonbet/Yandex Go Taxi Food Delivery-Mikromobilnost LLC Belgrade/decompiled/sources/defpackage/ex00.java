package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ex00 implements e6v, yyr0 {
    public final String a;
    public final String b;
    public final String c;
    public final BaseShortcutModel$Source d;
    public final q1 e;
    public final String f;
    public final tbu g;
    public final kdc h;
    public final ArrayList i;
    public final ArrayList j;

    public ex00(String str, String str2, String str3, BaseShortcutModel$Source baseShortcutModel$Source, q1 q1Var, String str4, tbu tbuVar, kdc kdcVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = baseShortcutModel$Source;
        this.e = q1Var;
        this.f = str4;
        this.g = tbuVar;
        this.h = kdcVar;
        this.i = arrayList;
        this.j = arrayList2;
    }

    @Override // defpackage.yyr0
    public final String d() {
        return this.f;
    }

    @Override // defpackage.yyr0
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex00)) {
            return false;
        }
        ex00 ex00Var = (ex00) obj;
        return jl40.l(this.a, ex00Var.a) && jl40.l(this.b, ex00Var.b) && jl40.l(this.c, ex00Var.c) && this.d == ex00Var.d && jl40.l(this.e, ex00Var.e) && jl40.l(this.f, ex00Var.f) && this.g.equals(ex00Var.g) && jl40.l(this.h, ex00Var.h) && this.i.equals(ex00Var.i) && this.j.equals(ex00Var.j);
    }

    @Override // defpackage.yyr0
    public final String f() {
        return this.c;
    }

    @Override // defpackage.yyr0
    /* renamed from: getAction */
    public final q1 getC() {
        return this.e;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + unr0.b((this.e.hashCode() + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f)) * 31;
        kdc kdcVar = this.h;
        return this.j.hashCode() + ly3.b((hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder v = b64.v("MarketRecommendationVerticalStackModel(id=", this.a, ", shortcutId=", this.b, ", gridId=");
        v.append(this.c);
        v.append(", source=");
        v.append(this.d);
        v.append(", action=");
        v.append(this.e);
        v.append(", eventPayload=");
        v.append(this.f);
        v.append(", service=");
        v.append(this.g);
        v.append(", backgroundColor=");
        v.append(this.h);
        v.append(", topItems=");
        v.append(this.i);
        v.append(", bottomItems=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public final tbu v() {
        return this.g;
    }
}
