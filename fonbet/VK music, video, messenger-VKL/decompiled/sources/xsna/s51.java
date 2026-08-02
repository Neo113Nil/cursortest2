package xsna;

import java.security.GeneralSecurityException;

/* compiled from: AesCtrKeyManager.java */
/* loaded from: classes13.dex */
public final class s51 extends hey<p51> {
    public static void g(p51 p51Var) throws GeneralSecurityException {
        jjr0.c(p51Var.w());
        jjr0.a(p51Var.u().size());
        t51 v = p51Var.v();
        if (v.q() < 12 || v.q() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
