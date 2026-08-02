package defpackage;

import androidx.compose.ui.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcc61;", "Lj530;", "Landroidx/compose/ui/c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class cc61 extends j530 {
    public final float a;

    public cc61(float f) {
        this.a = f;
    }

    @Override // defpackage.j530
    public final e530 a() {
        c cVar = new c();
        cVar.a = this.a;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc61) && Float.compare(this.a, ((cc61) obj).a) == 0;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((c) e530Var).a = this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return n.n(new StringBuilder("ZIndexElement(zIndex="), this.a, ')');
    }
}
