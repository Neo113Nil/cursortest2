package xsna;

/* compiled from: ExecutorBindingContext.kt */
/* loaded from: classes3.dex */
public final class h3q implements com.vk.mvi.binder.d {
    public static final h3q c;
    public final id2 b;

    static {
        jd2.a.getClass();
        c = new h3q(new id2());
    }

    public h3q(id2 id2Var) {
        this.b = id2Var;
    }

    @Override // com.vk.mvi.binder.d
    public final void a(gzs<s3q0> gzsVar) {
        this.b.execute(new oq4(1, gzsVar));
    }
}
