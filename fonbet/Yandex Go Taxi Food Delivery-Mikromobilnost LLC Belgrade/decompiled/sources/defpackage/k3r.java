package defpackage;

import androidx.compose.foundation.layout.Direction;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lk3r;", "Lj530;", "Lm3r;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k3r extends j530 {
    public final Direction a;
    public final float b;

    public k3r(Direction direction, float f) {
        this.a = direction;
        this.b = f;
    }

    @Override // defpackage.j530
    public final e530 a() {
        m3r m3rVar = new m3r();
        m3rVar.a = this.a;
        m3rVar.b = this.b;
        return m3rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3r)) {
            return false;
        }
        k3r k3rVar = (k3r) obj;
        return this.a == k3rVar.a && this.b == k3rVar.b;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        m3r m3rVar = (m3r) e530Var;
        m3rVar.a = this.a;
        m3rVar.b = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
