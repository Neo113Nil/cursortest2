package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import com.yandex.mob.network.MobNetworkErrorType;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class lub1 {
    public static final void a(CharSequence charSequence, bpl0 bpl0Var, j690 j690Var, b bVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        b bVar2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1294559079);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(bpl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(j690Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            bVar2 = bVar;
            i2 |= btsVar.k(bVar2) ? 2048 : 1024;
        } else {
            bVar2 = bVar;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar.e(tlsVar2) ? 16384 : 8192;
        } else {
            tlsVar2 = tlsVar;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            e(charSequence, btsVar, i2 & 14);
            d(j690Var, bVar2, bpl0Var, tlsVar2, btsVar, ((i2 >> 3) & 7168) | ((i2 >> 6) & HProv.PP_DELETE_SAVED_PASSWD) | ((i2 << 3) & 896));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(charSequence, bpl0Var, j690Var, bVar, tlsVar, i, 10);
        }
    }

    public static final void b(flq0 flq0Var, b bVar, tls tlsVar, bpl0 bpl0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1447097865);
        int i2 = i | (btsVar.k(flq0Var) ? 4 : 2) | (btsVar.k(bVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.k(bpl0Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            ocb1.a(null, false, afb1.d(bVar, btsVar), false, false, null, 0.0f, 0, wwg.S(1723693844, true, new nvs0(23, tlsVar, flq0Var, bpl0Var), btsVar), btsVar, 805306368, 507);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(flq0Var, bVar, tlsVar, bpl0Var, i, 29);
        }
    }

    public static final void c(int i, qa11 qa11Var, tls tlsVar, fid fidVar, int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1432803648);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.c(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(qa11Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(c530Var, 56.0f);
            int i4 = i3 & 112;
            boolean z = ((i3 & 896) == 256) | (i4 == 32);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new zr01(9, tlsVar, qa11Var);
                btsVar.o0(Q);
            }
            f530 m = an91.m(q791.d(e, false, null, null, (sls) Q, 15), 16.0f, 0.0f, 2);
            boolean z2 = ((i3 & 14) == 4) | (i4 == 32);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new is8(qa11Var, i, 17);
                btsVar.o0(Q2);
            }
            f530 b = fnq0.b(m, false, (tls) Q2);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, b);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            v0b1.a(qa11Var.c, ljs0.m(c530Var, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 48, 1020);
            oeb1.c(btsVar, ljs0.q(c530Var, 16.0f));
            qgy.b(qa11Var.b, null, new x2y(1.0f, true), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, 0, 0, 16378);
            btsVar = btsVar;
            oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
            xkb1.b(qa11Var.d, null, null, false, btsVar, 0, 30);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q12(i, qa11Var, tlsVar, i2);
        }
    }

    public static final void d(j690 j690Var, b bVar, bpl0 bpl0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        b bVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(573061820);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(j690Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bVar2 = bVar;
            i2 |= btsVar.k(bVar2) ? 32 : 16;
        } else {
            bVar2 = bVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(bpl0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 c = bzk0.c(c530.a, AppColor$Palette.Background, qke.q);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new uzr(2, bpl0Var);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(c, false, (tls) Q);
            boolean z2 = (i3 == 256) | ((i2 & 7168) == 2048);
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new kej0(1, tlsVar, bpl0Var);
                btsVar.o0(Q2);
            }
            adb1.a(b, bVar2, j690Var, null, null, null, false, null, (tls) Q2, btsVar, (i2 & 112) | ((i2 << 6) & 896), 504);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(j690Var, bVar, bpl0Var, tlsVar, i, 22);
        }
    }

    public static final void e(CharSequence charSequence, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(676552925);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            f530 n = an91.n(c530.a, 16.0f, 20.0f, 16.0f, 16.0f);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new zp01(28);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            qgy.b(charSequence, null, fnq0.b(n, false, (tls) Q), null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, i2 & 14, 0, 16378);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(charSequence, i, 9, (byte) 0);
        }
    }

    public static final void f(ab11 ab11Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(720081519);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ab11Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-1490225781, true, new hex0(24, tlsVar, ab11Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(ab11Var, tlsVar, i, 12);
        }
    }

    public static final MobNetworkErrorType g(Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th instanceof CancellationException ? MobNetworkErrorType.Cancelled : ((th instanceof SocketTimeoutException) || (th instanceof InterruptedIOException)) ? MobNetworkErrorType.Timeout : th instanceof UnknownHostException ? MobNetworkErrorType.Dns : ((th instanceof SSLPeerUnverifiedException) || (th instanceof SSLHandshakeException) || (th instanceof SSLException)) ? MobNetworkErrorType.Ssl : ((th instanceof ConnectException) || (th instanceof NoRouteToHostException) || (th instanceof ProtocolException) || (th instanceof EOFException) || (th instanceof SocketException) || (th instanceof IOException)) ? MobNetworkErrorType.Connection : MobNetworkErrorType.Unknown;
    }

    public static final ief h(CurrencyRulesDto currencyRulesDto) {
        return new ief(currencyRulesDto.a, currencyRulesDto.b, currencyRulesDto.c, currencyRulesDto.d);
    }
}
