package defpackage;

import android.os.Parcel;
import android.os.Process;
import android.view.View;
import android.widget.EditText;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.datastore.core.DirectBootUsageException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class kh91 {
    public static final void a(f530 f530Var, q6o q6oVar, sls slsVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z;
        q6o q6oVar2 = q6oVar;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1710866919);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(q6oVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 k = f530Var.k(ljs0.c);
            so5 so5Var = x4c.H;
            sic a = qic.a(lr20.c, so5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            int i3 = i2;
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            crb1.c(null, wwg.S(-397427170, true, new us4(6, slsVar), btsVar), null, wwg.S(1226792668, true, new txk(11, q6oVar2), btsVar), null, null, null, btsVar, 3120, HProv.PP_NK_SYNC);
            x2y x2yVar = new x2y(1.0f, true);
            sic a2 = qic.a(lr20.e, so5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, x2yVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            pa90 k2 = vfc.k(q6oVar.a, 0, -1411607277, btsVar, false);
            c530 c530Var = c530.a;
            q6oVar2 = q6oVar;
            o4b1.b(k2, null, c530Var, null, null, 0.0f, null, btsVar, 392, 56);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            jeb1.f(q6oVar2.b, null, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 0, 0, 16254);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            jeb1.f(q6oVar2.c, null, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 0, 0, 16254);
            btsVar = btsVar;
            btsVar.t(true);
            zrm zrmVar = q6oVar2.d;
            if (zrmVar == null) {
                btsVar.e0(-714213783);
                btsVar.t(false);
                tlsVar2 = tlsVar;
                z = true;
            } else {
                btsVar.e0(-714213782);
                f530 k3 = an91.k(c530Var, 8.0f);
                boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (b || Q == o430Var) {
                    Q = new jg0(16);
                    btsVar.o0(Q);
                }
                z910 z910Var = (z910) Q;
                int hashCode3 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d3 = b.d(btsVar, k3);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, z910Var);
                qje.W(btsVar, wlsVar2, o3);
                vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar3);
                qje.W(btsVar, wlsVar4, d3);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new l0o(1);
                    btsVar.o0(Q2);
                }
                f530 b2 = fnq0.b(c530Var, false, (tls) Q2);
                boolean k4 = btsVar.k(zrmVar) | ((i3 & 7168) == 2048);
                Object Q3 = btsVar.Q();
                if (k4 || Q3 == o430Var) {
                    tlsVar2 = tlsVar;
                    Q3 = new ymj(25, tlsVar2, zrmVar);
                    btsVar.o0(Q3);
                } else {
                    tlsVar2 = tlsVar;
                }
                z = true;
                ohb1.b(b2, false, null, (sls) Q3, wwg.S(498471636, true, new ota(28, zrmVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                btsVar = btsVar;
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0(f530Var, q6oVar2, slsVar, tlsVar2, i, 24);
        }
    }

    public static final void b(uwa0 uwa0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1103468151);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(uwa0Var) : btsVar.e(uwa0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.k(uwa0Var))) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                if (uwa0Var != null) {
                    tlsVar.invoke(uwa0Var);
                }
                btsVar.o0(zy11.a);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(uwa0Var, tlsVar, i, i3);
        }
    }

    public static final void c(View view, boolean z) {
        view.setClickable(!z);
        view.setEnabled(!z);
        if (view instanceof EditText) {
            return;
        }
        view.setAlpha(z ? 0.4f : 1.0f);
    }

    public static final Exception d(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean z = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            try {
                Parcel obtain = Parcel.obtain();
                Process.myUserHandle().writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                i = obtain.readInt();
            } catch (Throwable unused) {
                i = 0;
            }
            z = ((String) method.invoke(null, "sys.user." + i + ".ce_available", "false")).equals("true");
        } catch (Throwable th) {
            ljo.a(fileNotFoundException, th);
        }
        if (z || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new DirectBootUsageException(fileNotFoundException);
        } finally {
            file.delete();
        }
    }
}
