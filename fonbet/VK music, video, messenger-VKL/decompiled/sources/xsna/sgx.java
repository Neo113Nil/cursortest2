package xsna;

/* compiled from: InternalDropdown.kt */
/* loaded from: classes17.dex */
public final class sgx {
    public final boolean a;
    public final gzs<s3q0> b;
    public final q630 c;
    public final dt1 d;
    public final long e;
    public final gxb0 f;
    public final r5j0 g;
    public final boolean h;
    public final bi50<Boolean> i;
    public final gzs<agw> j;

    public sgx() {
        throw null;
    }

    public sgx(boolean z, gzs gzsVar, q630 q630Var, dt1 dt1Var, long j, gxb0 gxb0Var, r5j0 r5j0Var, boolean z2, bi50 bi50Var, gzs gzsVar2) {
        this.a = z;
        this.b = gzsVar;
        this.c = q630Var;
        this.d = dt1Var;
        this.e = j;
        this.f = gxb0Var;
        this.g = r5j0Var;
        this.h = z2;
        this.i = bi50Var;
        this.j = gzsVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgx)) {
            return false;
        }
        sgx sgxVar = (sgx) obj;
        return this.a == sgxVar.a && epx.f(this.b, sgxVar.b) && epx.f(this.c, sgxVar.c) && epx.f(this.d, sgxVar.d) && h9x.b(this.e, sgxVar.e) && epx.f(this.f, sgxVar.f) && epx.f(this.g, sgxVar.g) && this.h == sgxVar.h && epx.f(this.i, sgxVar.i) && epx.f(this.j, sgxVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + qoy.b((this.g.hashCode() + ((this.f.hashCode() + qoy.b(bh10.a((this.d.hashCode() + ((this.c.hashCode() + sf3.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 961, this.e), 31, false)) * 31)) * 31, 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalDropdownPopupState(expanded=");
        sb.append(this.a);
        sb.append(", onDismissRequest=");
        sb.append(this.b);
        sb.append(", modifier=");
        sb.append(this.c);
        sb.append(", alignment=");
        sb.append(this.d);
        sb.append(", offset=");
        sb.append((Object) h9x.e(this.e));
        sb.append(", isPopupWindowAboveAnchor=null, withoutTranslation=false, properties=");
        sb.append(this.f);
        sb.append(", popupShape=");
        sb.append(this.g);
        sb.append(", isOverlayContentAbove=");
        sb.append(this.h);
        sb.append(", expandedStates=");
        sb.append(this.i);
        sb.append(", backgroundImageBitmap=");
        return uf3.d(sb, this.j, ')');
    }
}
