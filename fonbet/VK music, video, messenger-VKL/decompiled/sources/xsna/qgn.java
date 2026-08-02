package xsna;

import java.util.List;
import java.util.Map;
import xsna.m1h0;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* loaded from: classes11.dex */
public final class qgn implements m1h0 {
    public final /* synthetic */ n1h0 b;
    public final sgn c;

    public qgn(n1h0 n1h0Var, sgn sgnVar) {
        this.b = n1h0Var;
        this.c = sgnVar;
    }

    @Override // xsna.m1h0
    public final boolean a(Object obj) {
        return this.b.a(obj);
    }

    @Override // xsna.m1h0
    public final m1h0.a b(String str, gzs<? extends Object> gzsVar) {
        return this.b.b(str, gzsVar);
    }

    @Override // xsna.m1h0
    public final Map<String, List<Object>> d() {
        return this.b.d();
    }

    @Override // xsna.m1h0
    public final Object e(String str) {
        return this.b.e(str);
    }
}
