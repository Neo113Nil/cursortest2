package xsna;

/* compiled from: ClickableItem.kt */
/* loaded from: classes15.dex */
public final class pzo0 implements njc {
    public final int a;

    public pzo0(int i) {
        this.a = i;
    }

    @Override // xsna.njc
    public final boolean a(njc njcVar) {
        if (njcVar instanceof pzo0) {
            return this.a == ((pzo0) njcVar).a;
        }
        return false;
    }

    @Override // xsna.njc
    public final boolean b(njc njcVar) {
        return (njcVar instanceof pzo0) && njcVar.equals(this);
    }
}
