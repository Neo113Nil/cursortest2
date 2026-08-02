package defpackage;

/* loaded from: classes.dex */
public final class nx40 extends y8f {
    public nx40(y8f y8fVar) {
        this.a.putAll(y8fVar.a);
    }

    @Override // defpackage.y8f
    public final Object a(x8f x8fVar) {
        return this.a.get(x8fVar);
    }

    public final void b(x8f x8fVar, Object obj) {
        this.a.put(x8fVar, obj);
    }

    public nx40() {
        this(0);
    }

    public /* synthetic */ nx40(int i) {
        this(w8f.b);
    }
}
