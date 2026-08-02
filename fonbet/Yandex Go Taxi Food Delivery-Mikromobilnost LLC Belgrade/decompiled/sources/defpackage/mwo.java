package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lmwo;", "Lj530;", "Lnwo;", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class mwo extends j530 {
    public final wxi0 a;
    public final wls b;

    public mwo(wxi0 wxi0Var, wls wlsVar) {
        this.a = wxi0Var;
        this.b = wlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        nwo nwoVar = new nwo();
        nwoVar.a = this.a;
        nwoVar.b = this.b;
        return nwoVar;
    }

    public final boolean equals(Object obj) {
        mwo mwoVar = obj instanceof mwo ? (mwo) obj : null;
        return mwoVar != null && jl40.l(this.a, mwoVar.a) && jl40.l(this.b, mwoVar.b);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        nwo nwoVar = (nwo) e530Var;
        nwoVar.a = this.a;
        nwoVar.b = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
