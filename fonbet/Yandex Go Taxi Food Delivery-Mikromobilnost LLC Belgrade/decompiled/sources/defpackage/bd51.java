package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class bd51 extends xe1 {
    public static bd51 a(ag1 ag1Var, va90 va90Var, Integer num) {
        u77 u77Var = (u77) va90Var.a;
        ag1 ag1Var2 = ag1.t;
        if (ag1Var != ag1Var2 && num == null) {
            yci0.u("For given Variant ", ag1Var, " the value of idRequirement must be non-null");
            return null;
        }
        if (ag1Var == ag1Var2 && num != null) {
            kbs.v("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (u77Var.a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + u77Var.a.length);
        }
        ag1 ag1Var3 = new fd51(ag1Var).a;
        if (ag1Var3 == ag1Var2) {
            u77.a(new byte[0]);
        } else if (ag1Var3 == ag1.s) {
            u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (ag1Var3 != ag1.r) {
                yci0.k(ag1Var3, "Unknown Variant: ");
                return null;
            }
            u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new bd51();
    }
}
