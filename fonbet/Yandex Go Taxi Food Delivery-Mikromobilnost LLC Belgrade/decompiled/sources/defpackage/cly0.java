package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcly0;", "Lj530;", "Lely0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class cly0 extends j530 {
    public final wls a;

    public cly0(wls wlsVar) {
        this.a = wlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new ely0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cly0) {
            return this.a == ((cly0) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((ely0) e530Var).c = this.a;
    }

    public final int hashCode() {
        wls wlsVar = this.a;
        if (wlsVar != null) {
            return wlsVar.hashCode();
        }
        return 0;
    }
}
