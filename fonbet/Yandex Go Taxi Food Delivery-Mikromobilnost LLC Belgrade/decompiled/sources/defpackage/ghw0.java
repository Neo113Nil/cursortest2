package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class ghw0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ hn70 b;

    public ghw0(vpr vprVar, hn70 hn70Var) {
        this.a = vprVar;
        this.b = hn70Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Pair pair = (Pair) obj;
        return this.a.emit(hn70.a(this.b, (String) pair.getFirst(), null, null, (String) pair.getSecond(), null, 2096894), continuation);
    }
}
