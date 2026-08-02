package defpackage;

import android.content.Context;
import android.os.StatFs;
import androidx.compose.ui.graphics.vector.b;
import androidx.compose.ui.platform.j;
import java.text.BreakIterator;
import java.util.Locale;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class gja1 {
    public static au2 a;

    public static long a(Context context, long j, long j2) {
        long j3;
        if (j > j2) {
            j = j2;
        }
        try {
            StatFs statFs = new StatFs(rl81.a(context, "").getAbsolutePath());
            j3 = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException unused) {
            j3 = j;
        }
        long j4 = (2 * j3) / 100;
        long j5 = (j3 * 50) / 100;
        if (j > j5) {
            j = j5;
        }
        if (j4 <= j2) {
            j2 = j4;
        }
        return j2 < j ? j : j2;
    }

    public static final au2 b() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("EyeOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.j(15.83f, 18.9f);
        uq90Var.h(18.0f, 22.0f);
        uq90Var.g(2.5f);
        uq90Var.h(6.5f, 2.0f);
        uq90Var.f(4.0f);
        uq90Var.i(2.6f, 3.72f);
        uq90Var.a(12.6f, 12.6f, false, false, 1.0f, 11.0f);
        uq90Var.p(2.0f);
        uq90Var.b(12.56f, 12.56f, false, false, 14.83f, 5.9f);
        uq90Var.k(-2.52f, -3.6f);
        uq90Var.i(-4.9f, -7.0f);
        uq90Var.b(4.5f, 4.5f, false, false, 4.9f, 7.01f);
        uq90Var.j(23.0f, 13.0f);
        uq90Var.e(-1.0f, 1.82f, -2.43f, 3.35f, -4.17f, 4.48f);
        uq90Var.i(-2.94f, -4.2f);
        uq90Var.m(0.6f, -1.02f, 0.61f, -2.28f);
        uq90Var.b(4.5f, 4.5f, false, false, -5.3f, -4.43f);
        uq90Var.h(9.86f, 4.68f);
        uq90Var.a(12.5f, 12.5f, false, true, 23.0f, 11.0f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static ah c(Locale locale) {
        if (ah.f == null) {
            ah ahVar = new ah(1);
            ahVar.d = BreakIterator.getWordInstance(locale);
            ah.f = ahVar;
        }
        return ah.f;
    }

    public static final aui0 d(mgv mgvVar, long j, long j2, float f, fid fidVar, int i, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(-1209810026);
        if ((i2 & 2) != 0) {
            qnm qnmVar = qnm.a;
            j = qnm.c(btsVar).E();
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            qnm qnmVar2 = qnm.a;
            j2 = qnm.c(btsVar).a();
        }
        if ((i2 & 8) != 0) {
            f = 48.0f;
        }
        float f2 = (i2 & 16) != 0 ? 0.5f : 0.4f;
        b c = ba91.c(mgvVar, btsVar);
        btsVar.e0(-1903018031);
        boolean d = btsVar.d(j2);
        Object Q = btsVar.Q();
        Object obj = did.a;
        if (d || Q == obj) {
            Q = new c36(j2, 5);
            btsVar.o0(Q);
        }
        wec wecVar = (wec) Q;
        btsVar.t(false);
        float w0 = ((fwi) btsVar.m(j.h)).w0(f);
        btsVar.e0(-1903011735);
        boolean k = btsVar.k(c) | btsVar.d(j3) | btsVar.k(wecVar) | btsVar.b(w0) | ((((57344 & i) ^ HProv.ALG_CLASS_DATA_ENCRYPT) > 16384 && btsVar.b(f2)) || (i & HProv.ALG_CLASS_DATA_ENCRYPT) == 16384);
        Object Q2 = btsVar.Q();
        if (k || Q2 == obj) {
            Object aui0Var = new aui0(w0, j3, f2, c, wecVar);
            btsVar.o0(aui0Var);
            Q2 = aui0Var;
        }
        aui0 aui0Var2 = (aui0) Q2;
        btsVar.t(false);
        btsVar.t(false);
        return aui0Var2;
    }
}
