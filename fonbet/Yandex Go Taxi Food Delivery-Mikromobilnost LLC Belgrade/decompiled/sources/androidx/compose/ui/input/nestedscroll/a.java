package androidx.compose.ui.input.nestedscroll;

import defpackage.e530;
import defpackage.gn50;
import defpackage.j530;
import defpackage.jl40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/a;", "Lj530;", "Landroidx/compose/ui/input/nestedscroll/c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class a extends j530 {
    public final gn50 a;
    public final NestedScrollDispatcher b;

    public a(gn50 gn50Var, NestedScrollDispatcher nestedScrollDispatcher) {
        this.a = gn50Var;
        this.b = nestedScrollDispatcher;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new c(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(aVar.a, this.a) && jl40.l(aVar.b, this.b);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        c cVar = (c) e530Var;
        cVar.a = this.a;
        NestedScrollDispatcher nestedScrollDispatcher = cVar.b;
        if (nestedScrollDispatcher.a == cVar) {
            nestedScrollDispatcher.a = null;
        }
        NestedScrollDispatcher nestedScrollDispatcher2 = this.b;
        if (nestedScrollDispatcher2 == null) {
            cVar.b = new NestedScrollDispatcher();
        } else if (nestedScrollDispatcher2 != nestedScrollDispatcher) {
            cVar.b = nestedScrollDispatcher2;
        }
        if (cVar.isAttached()) {
            NestedScrollDispatcher nestedScrollDispatcher3 = cVar.b;
            nestedScrollDispatcher3.a = cVar;
            nestedScrollDispatcher3.b = null;
            cVar.c = null;
            nestedScrollDispatcher3.c = new NestedScrollNode$updateDispatcherFields$1(cVar);
            nestedScrollDispatcher3.d = cVar.getCoroutineScope();
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.b;
        return hashCode + (nestedScrollDispatcher != null ? nestedScrollDispatcher.hashCode() : 0);
    }
}
