package xsna;

/* compiled from: JobSupport.kt */
/* loaded from: classes11.dex */
public final class nep implements atw {
    public final boolean b;

    public nep(boolean z) {
        this.b = z;
    }

    @Override // xsna.atw
    public final b570 b() {
        return null;
    }

    @Override // xsna.atw
    public final boolean isActive() {
        return this.b;
    }

    public final String toString() {
        return ho8.a(new StringBuilder("Empty{"), this.b ? "Active" : "New", '}');
    }
}
