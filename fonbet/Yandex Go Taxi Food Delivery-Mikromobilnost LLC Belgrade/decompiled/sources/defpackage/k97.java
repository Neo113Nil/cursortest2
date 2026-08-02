package defpackage;

import java.util.Hashtable;
import ru.CryptoPro.reprov.x509.ReasonFlags;

/* loaded from: classes4.dex */
public final class k97 extends o2 {
    public static final String[] b = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", ReasonFlags.SUPERSEDED, "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public static final Hashtable c = new Hashtable();
    public e2 a;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a;
    }

    public final String toString() {
        int intValue = this.a.y().intValue();
        return g8e.o("CRLReason: ", (intValue < 0 || intValue > 10) ? "invalid" : b[intValue]);
    }
}
