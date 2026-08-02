package defpackage;

import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class lfb1 {
    public static au2 a;

    public static ec8 a(long j, long j2, long j3, fid fidVar, int i) {
        long j4;
        long b = (i & 2) != 0 ? dgc.b(j, fidVar) : j2;
        long j5 = (i & 4) != 0 ? ldc.m : j3;
        long b2 = ldc.b(b, 0.38f, 0.0f, 0.0f, 0.0f, 14);
        agc agcVar = (agc) ((bts) fidVar).m(dgc.a);
        ec8 ec8Var = agcVar.Y;
        if (ec8Var == null) {
            ColorSchemeKeyTokens colorSchemeKeyTokens = x3r.a;
            j4 = j5;
            ec8 ec8Var2 = new ec8(dgc.c(agcVar, colorSchemeKeyTokens), dgc.a(agcVar, dgc.c(agcVar, colorSchemeKeyTokens)), rzo.k(ldc.b(dgc.c(agcVar, x3r.b), x3r.c, 0.0f, 0.0f, 0.0f, 14), dgc.c(agcVar, colorSchemeKeyTokens)), ldc.b(dgc.a(agcVar, dgc.c(agcVar, colorSchemeKeyTokens)), 0.38f, 0.0f, 0.0f, 0.0f, 14));
            agcVar.Y = ec8Var2;
            ec8Var = ec8Var2;
        } else {
            j4 = j5;
        }
        long j6 = j != 16 ? j : ec8Var.a;
        if (b == 16) {
            b = ec8Var.b;
        }
        long j7 = b;
        long j8 = j4 != 16 ? j4 : ec8Var.c;
        if (b2 == 16) {
            b2 = ec8Var.d;
        }
        return new ec8(j6, j7, j8, b2);
    }

    public static qyi0 b(pyt0 pyt0Var) {
        ArrayList arrayList = pyt0Var.b;
        if (arrayList != null) {
            return new qyi0(ooc.u(arrayList));
        }
        ny61.g("Required value was null.");
        return null;
    }
}
