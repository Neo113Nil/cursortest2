package defpackage;

import androidx.compose.runtime.InvalidationResult;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class kid implements bii0 {
    public final /* synthetic */ bud a;
    public final /* synthetic */ kb30 b;

    public kid(bud budVar, kb30 kb30Var) {
        this.a = budVar;
        this.b = kb30Var;
    }

    @Override // defpackage.bii0
    public final InvalidationResult a(aii0 aii0Var, Object obj) {
        InvalidationResult invalidationResult;
        bud budVar = this.a;
        bud budVar2 = budVar instanceof bii0 ? budVar : null;
        if (budVar2 == null || (invalidationResult = budVar2.a(aii0Var, obj)) == null) {
            invalidationResult = InvalidationResult.IGNORED;
        }
        if (invalidationResult != InvalidationResult.IGNORED) {
            return invalidationResult;
        }
        kb30 kb30Var = this.b;
        kb30Var.f = a.o0(kb30Var.f, new Pair(aii0Var, obj));
        return InvalidationResult.SCHEDULED;
    }

    @Override // defpackage.bii0
    public final void b() {
    }

    @Override // defpackage.bii0
    public final void c(Object obj) {
    }
}
