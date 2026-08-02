package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcam;", "T", "Lj530;", "Ldam;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class cam<T> extends j530 {
    public final e a;
    public final wls b;
    public final Orientation c;

    public cam(e eVar, wls wlsVar, Orientation orientation) {
        this.a = eVar;
        this.b = wlsVar;
        this.c = orientation;
    }

    @Override // defpackage.j530
    public final e530 a() {
        dam damVar = new dam();
        damVar.a = this.a;
        damVar.b = this.b;
        damVar.c = this.c;
        return damVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cam)) {
            return false;
        }
        cam camVar = (cam) obj;
        return jl40.l(this.a, camVar.a) && this.b == camVar.b && this.c == camVar.c;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        dam damVar = (dam) e530Var;
        damVar.a = this.a;
        damVar.b = this.b;
        damVar.c = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
