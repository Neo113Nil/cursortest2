package defpackage;

@gsq0
/* loaded from: classes9.dex */
public final class ptl {
    public static final otl Companion = new otl();
    public final jtl a;
    public final ntl b;

    public /* synthetic */ ptl(int i, jtl jtlVar, ntl ntlVar) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, ktl.a.getDescriptor());
            throw null;
        }
        this.a = jtlVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ntlVar;
        }
    }
}
