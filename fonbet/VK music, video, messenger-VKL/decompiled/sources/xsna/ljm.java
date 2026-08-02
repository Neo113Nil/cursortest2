package xsna;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.BiFunction;

/* compiled from: DialogRemoveIncognitoLpTask.kt */
/* loaded from: classes2.dex */
public final class ljm extends e500 {
    public final w2w c;
    public final long d;
    public final int e;

    public ljm(w2w w2wVar, long j, int i) {
        super("DialogRemoveIncognitoLpTask");
        this.c = w2wVar;
        this.d = j;
        this.e = i;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        LinkedHashMap linkedHashMap = f400Var.n;
        Long valueOf = Long.valueOf(this.d);
        final d400 d400Var = new d400(this.e);
        linkedHashMap.computeIfPresent(valueOf, new BiFunction() { // from class: xsna.e400
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (Set) d400.this.invoke(obj, obj2);
            }
        });
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        new mjm(this.d, this.e).o(this.c);
    }
}
