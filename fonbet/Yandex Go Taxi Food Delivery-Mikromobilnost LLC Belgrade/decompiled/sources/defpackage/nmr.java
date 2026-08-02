package defpackage;

/* loaded from: classes14.dex */
public abstract class nmr implements i231 {
    public final String a;
    public final Object b;

    public nmr(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public abstract c231 a(Object obj);

    @Override // defpackage.i231
    public final c231 create() {
        return a(this.b);
    }
}
