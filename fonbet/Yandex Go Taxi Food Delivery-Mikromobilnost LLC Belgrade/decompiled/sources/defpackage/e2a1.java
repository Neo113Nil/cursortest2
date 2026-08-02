package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.walking.navigation.impl.guidance.ui.a;
import java.util.Iterator;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.yandex.taxi.eats_commons.EatsService;

/* loaded from: classes6.dex */
public abstract class e2a1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    public static final void a(int i, String str, sls slsVar, sls slsVar2, fid fidVar, int i2) {
        sls slsVar3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1430105080);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.k(str) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        int i4 = 1;
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            tse tseVar = (tse) Q;
            boolean e = ((i3 & 7168) == 2048) | btsVar.e(tseVar) | ((i3 & 896) == 256);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                Q2 = new a(tseVar, slsVar, slsVar2);
                btsVar.o0(Q2);
            }
            slsVar3 = slsVar;
            vpa1.a(exw0.a(c530.a, zy11.a, (PointerInputEventHandler) Q2), false, ButtonSize.M, slsVar3, wwg.S(-135251064, true, new p12(i, str, i4), btsVar), btsVar, ((i3 << 3) & 7168) | 24960, 2);
        } else {
            slsVar3 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(i, str, slsVar3, slsVar2, i2);
        }
    }

    public static final void b(int i, fid fidVar, tls tlsVar, f530 f530Var) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-287010521);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a2 = qic.a(new i43(12.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i4 = dzg0.ic_plus;
            String e = ohb1.e(btsVar, kyh0.mt_zoom_in_map_content_description);
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new fc01(27, tlsVar);
                btsVar.o0(Q);
            }
            sls slsVar2 = (sls) Q;
            boolean z2 = i5 == 32;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new fc01(28, tlsVar);
                btsVar.o0(Q2);
            }
            a(i4, e, slsVar2, (sls) Q2, btsVar, 0);
            int i6 = dzg0.ic_minus;
            String e2 = ohb1.e(btsVar, kyh0.mt_zoom_out_map_content_description);
            boolean z3 = i5 == 32;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new pe61(0, tlsVar);
                btsVar.o0(Q3);
            }
            sls slsVar3 = (sls) Q3;
            boolean z4 = i5 == 32;
            Object Q4 = btsVar.Q();
            if (z4 || Q4 == o430Var) {
                Q4 = new pe61(2, tlsVar);
                btsVar.o0(Q4);
            }
            a(i6, e2, slsVar3, (sls) Q4, btsVar, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new reg0(f530Var, tlsVar, i, i3);
        }
    }

    public static final boolean c(String str) {
        k4o f = EatsService.f();
        if (f != null && f.isEmpty()) {
            return false;
        }
        Iterator<E> it = f.iterator();
        while (it.hasNext()) {
            if (cvu0.t(((EatsService) it.next()).getValue(), str, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0038 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(Context context, PowerManager powerManager) {
        if (((String) qkf.a.getValue()).length() > 0) {
            return Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN", 0) == 1;
        }
        if (((String) qkf.b.getValue()).length() <= 0) {
            return powerManager.isPowerSaveMode();
        }
        if (Settings.System.getInt(context.getContentResolver(), "SmartModeStatus", 0) == 4) {
        }
    }
}
