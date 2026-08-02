package xsna;

/* compiled from: ClickableItem.kt */
/* loaded from: classes15.dex */
public final class swu implements njc {
    public final boolean a;

    public swu(boolean z) {
        this.a = z;
    }

    @Override // xsna.njc
    public final boolean a(njc njcVar) {
        return (njcVar instanceof swu) && equals(njcVar);
    }

    @Override // xsna.njc
    public final boolean b(njc njcVar) {
        if (njcVar instanceof swu) {
            return this.a == ((swu) njcVar).a;
        }
        return false;
    }
}
