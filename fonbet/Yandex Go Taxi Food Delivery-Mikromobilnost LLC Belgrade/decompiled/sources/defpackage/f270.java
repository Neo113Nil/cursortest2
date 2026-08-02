package defpackage;

/* loaded from: classes10.dex */
public final class f270 implements g1k {
    public final qoh a;

    public f270(qoh qohVar) {
        this.a = qohVar;
    }

    @Override // defpackage.g1k
    public final void dispose() {
        qoh qohVar = this.a;
        if (qohVar.isActive()) {
            qohVar.a(null);
        }
    }
}
