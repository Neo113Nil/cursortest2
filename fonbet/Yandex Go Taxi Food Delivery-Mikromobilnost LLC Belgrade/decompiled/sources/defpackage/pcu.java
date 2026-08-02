package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pcu implements yyr0, e6v {
    public final String a;
    public final String b;
    public final q1 c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final BaseShortcutModel$Source h;

    public /* synthetic */ pcu(int i, q1 q1Var, String str, String str2, String str3, String str4) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : q1Var, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, false);
    }

    @Override // defpackage.yyr0
    public final String d() {
        return null;
    }

    @Override // defpackage.yyr0
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcu)) {
            return false;
        }
        pcu pcuVar = (pcu) obj;
        return jl40.l(this.a, pcuVar.a) && jl40.l(this.b, pcuVar.b) && jl40.l(this.c, pcuVar.c) && jl40.l(this.d, pcuVar.d) && jl40.l(this.e, pcuVar.e) && this.f == pcuVar.f;
    }

    @Override // defpackage.yyr0
    public final String f() {
        return this.b;
    }

    @Override // defpackage.yyr0
    /* renamed from: getAction */
    public final q1 getC() {
        return this.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.g;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return this.h;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        q1 q1Var = this.c;
        return Boolean.hashCode(this.f) + unr0.b(unr0.b((b + (q1Var == null ? 0 : q1Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("HeaderTrailModel(shortcutId=", this.a, ", gridId=", this.b, ", action=");
        v.append(this.c);
        v.append(", altText=");
        v.append(this.d);
        v.append(", iconTag=");
        return nnm.i(this.e, ", isSeparatorHidden=", Extension.C_BRAKE, v, this.f);
    }

    public pcu() {
        this(63, (q1) null, (String) null, (String) null, (String) null, (String) null);
    }

    public pcu(String str, String str2, q1 q1Var, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = q1Var;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = "";
        this.h = BaseShortcutModel$Source.LOCAL;
    }
}
