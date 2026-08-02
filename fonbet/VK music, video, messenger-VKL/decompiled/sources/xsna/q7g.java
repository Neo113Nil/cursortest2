package xsna;

/* compiled from: ColorProtection.java */
/* loaded from: classes12.dex */
public final class q7g extends androidx.core.view.insets.a {
    public boolean d;
    public int e;

    @Override // androidx.core.view.insets.a
    public final void a(int i) {
        if (this.d || this.e == i) {
            return;
        }
        this.e = i;
        throw null;
    }
}
