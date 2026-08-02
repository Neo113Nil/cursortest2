package defpackage;

/* loaded from: classes2.dex */
public abstract class nw4 implements dw {
    public final vfr a;
    public final yfr b;

    public nw4(vfr vfrVar, yfr yfrVar) {
        this.a = vfrVar;
        this.b = yfrVar;
    }

    public abstract mgr a(kr krVar, n6u n6uVar);

    @Override // defpackage.dw
    public void handle(kr krVar, n6u n6uVar) {
        this.a.a(a(krVar, n6uVar), this.b);
    }
}
