package defpackage;

/* loaded from: classes11.dex */
public final class hll implements ill {
    public final cxk a;
    public boolean b;

    public hll(cxk cxkVar) {
        this.a = cxkVar;
    }

    @Override // defpackage.ill
    public final cxk getItem() {
        return this.a;
    }

    @Override // defpackage.ill
    public final cxk q() {
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }
}
