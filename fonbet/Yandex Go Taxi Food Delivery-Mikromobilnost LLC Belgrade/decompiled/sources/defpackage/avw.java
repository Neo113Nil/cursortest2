package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lavw;", "Lj530;", "Lbvw;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class avw extends j530 {
    public final IntrinsicSize a;
    public final boolean b = true;
    public final tls c;

    public avw(IntrinsicSize intrinsicSize, tls tlsVar) {
        this.a = intrinsicSize;
        this.c = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        bvw bvwVar = new bvw();
        bvwVar.a = this.a;
        bvwVar.b = this.b;
        return bvwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        avw avwVar = obj instanceof avw ? (avw) obj : null;
        return avwVar != null && this.a == avwVar.a && this.b == avwVar.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        bvw bvwVar = (bvw) e530Var;
        bvwVar.a = this.a;
        bvwVar.b = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
