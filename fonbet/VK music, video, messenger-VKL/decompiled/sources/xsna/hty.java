package xsna;

/* compiled from: LazyLayoutItemContentFactory.kt */
/* loaded from: classes11.dex */
public final class hty {
    public final j1h0 a;
    public final n8s b;
    public final ph50<Object, a> c = h5h0.b();

    /* compiled from: LazyLayoutItemContentFactory.kt */
    public final class a {
        public final Object a;
        public final Object b;
        public int c;
        public jai d;

        public a(int i, Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
        }
    }

    public hty(j1h0 j1h0Var, n8s n8sVar) {
        this.a = j1h0Var;
        this.b = n8sVar;
    }

    public final wzs<androidx.compose.runtime.a, Integer, s3q0> a(int i, Object obj, Object obj2) {
        ph50<Object, a> ph50Var = this.c;
        a d = ph50Var.d(obj);
        if (d != null && d.c == i && epx.f(d.b, obj2)) {
            jai jaiVar = d.d;
            if (jaiVar != null) {
                return jaiVar;
            }
            jai jaiVar2 = new jai(818252804, new ud6(8, hty.this, d), true);
            d.d = jaiVar2;
            return jaiVar2;
        }
        a aVar = new a(i, obj, obj2);
        ph50Var.p(obj, aVar);
        jai jaiVar3 = aVar.d;
        if (jaiVar3 != null) {
            return jaiVar3;
        }
        jai jaiVar4 = new jai(818252804, new ud6(8, this, aVar), true);
        aVar.d = jaiVar4;
        return jaiVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        a d = this.c.d(obj);
        if (d != null) {
            return d.b;
        }
        androidx.compose.foundation.lazy.layout.b bVar = (androidx.compose.foundation.lazy.layout.b) this.b.invoke();
        int b = bVar.b(obj);
        if (b != -1) {
            return bVar.g(b);
        }
        return null;
    }
}
