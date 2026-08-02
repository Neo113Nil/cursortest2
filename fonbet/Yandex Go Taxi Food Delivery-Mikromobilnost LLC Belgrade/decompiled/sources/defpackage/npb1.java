package defpackage;

import androidx.compose.runtime.h;
import com.yandex.mapkit.Time;
import java.text.DateFormat;
import java.util.List;
import java.util.TimeZone;
import kotlin.collections.a;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.masstransit.tickets.c;

/* loaded from: classes11.dex */
public abstract class npb1 {
    public static final void a(f530 f530Var, yte0 yte0Var, c cVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-653646660);
        int i2 = i | 6 | (btsVar.k(yte0Var) ? 32 : 16) | (btsVar.k(cVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            cVar.a(ljs0.c(c530Var, 1.0f), yte0Var, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(f530Var2, (Object) yte0Var, (Object) cVar, i, 2);
        }
    }

    public static final void b(int i, fid fidVar, tls tlsVar, t510 t510Var, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(313800194);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= btsVar.k(t510Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            boolean z = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new adp(21, tlsVar);
                btsVar.o0(Q);
            }
            uib1.b(((i2 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL, btsVar, (tls) Q, t510Var, c);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s410(f530Var, t510Var, tlsVar, i);
        }
    }

    public static final Object c(fud fudVar, h hVar) {
        if (!fudVar.getNode().isAttached()) {
            ixv.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        r1b0 r1b0Var = (r1b0) qje.P(fudVar).U;
        r1b0Var.getClass();
        return uh6.L(r1b0Var, hVar);
    }

    public static final String d(List list) {
        return a.X(list, Extension.FIX_SPACE, null, null, new f0z0(6), 30);
    }

    public static final String e(Time time, DateFormat dateFormat, long j) {
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        o430 o430Var = e3n.b;
        long value = time.getValue();
        DurationUnit durationUnit = DurationUnit.SECONDS;
        return dateFormat.format(Long.valueOf(e3n.e(kp50.U(time.getTzOffset(), durationUnit)) + e3n.e(kp50.V(value, durationUnit)) + j));
    }
}
