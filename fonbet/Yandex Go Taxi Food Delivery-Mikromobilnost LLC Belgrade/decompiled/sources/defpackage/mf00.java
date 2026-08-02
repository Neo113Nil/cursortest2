package defpackage;

/* loaded from: classes5.dex */
public final class mf00 {
    public final i6r a;

    public mf00(i6r i6rVar) {
        this.a = i6rVar;
    }

    public final void a(m950 m950Var, tls tlsVar) {
        if (!(m950Var instanceof pey)) {
            ny61.g("NavigationRouter must be LifecycleOwner!");
            return;
        }
        pey peyVar = (pey) m950Var;
        peyVar.getClass();
        i6r i6rVar = this.a;
        i6rVar.getClass();
        tlsVar.invoke(new lf00(new bc(i6rVar, peyVar)));
    }
}
