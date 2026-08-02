package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import xsna.uic;

/* compiled from: InitializerImpl.kt */
/* loaded from: classes3.dex */
public final class nzw<Instance extends uic> implements kzw<Instance> {
    public final String a;
    public final xyt0 b;
    public final gzs<Instance> c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new w8q(this, 13));

    /* compiled from: InitializerImpl.kt */
    public static final class a<Instance extends uic> extends nyt0 {
        public final LinkedHashMap b = new LinkedHashMap();

        @Override // xsna.nyt0
        public final void h() {
            Iterator it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                ((uic) ((Map.Entry) it.next()).getValue()).clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nzw(String str, xyt0 xyt0Var, gzs<? extends Instance> gzsVar) {
        this.a = str;
        this.b = xyt0Var;
        this.c = gzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kzw
    public final uic getValue() {
        return (uic) this.d.getValue();
    }
}
