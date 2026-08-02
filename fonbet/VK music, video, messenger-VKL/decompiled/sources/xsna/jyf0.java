package xsna;

import java.util.Iterator;
import java.util.List;
import xsna.fm50;

/* compiled from: RenderHolder.kt */
/* loaded from: classes3.dex */
public abstract class jyf0<R extends fm50<? extends km50>> {
    public final f5z a;
    public final List<n0u0<? extends R>> b;
    public izs<? super R, s3q0> c = new s6x(26);
    public R d;

    /* compiled from: RenderHolder.kt */
    public static final class a implements izs<?, s3q0> {
        public final /* synthetic */ jyf0<R> b;

        public a(jyf0<R> jyf0Var) {
            this.b = jyf0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(Object obj) {
            R r = (R) obj;
            jyf0<R> jyf0Var = this.b;
            jyf0Var.c.invoke(r);
            jyf0Var.d = r;
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jyf0(f5z f5zVar, List<? extends n0u0<? extends R>> list) {
        this.a = f5zVar;
        this.b = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((n0u0) it.next()).a(new a(this), this.a);
        }
    }
}
