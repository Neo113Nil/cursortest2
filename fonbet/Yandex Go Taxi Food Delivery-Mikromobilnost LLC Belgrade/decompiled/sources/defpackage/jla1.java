package defpackage;

import androidx.compose.animation.a;
import androidx.compose.animation.m;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.semantics.f;
import coil3.network.HttpException;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.feed_common.analytics.image_loading.FeedImageLoadErrorType;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class jla1 {
    public static final void a(jej0 jej0Var, f530 f530Var, final tls tlsVar, fid fidVar, int i) {
        Object udj0Var;
        fgd fgdVar;
        int i2;
        aej0 aej0Var;
        boolean z;
        final sls slsVar;
        final aej0 aej0Var2;
        f530 f530Var2;
        final zdj0 zdj0Var;
        boolean z2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1959562632);
        int i3 = i | (btsVar.k(jej0Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            final String str = jej0Var.f;
            final String str2 = jej0Var.g;
            zdj0 zdj0Var2 = jej0Var.b;
            rdj0 rdj0Var = jej0Var.c;
            aej0 aej0Var3 = jej0Var.d;
            iej0 iej0Var = jej0Var.e;
            boolean z3 = iej0Var != null;
            fgd fgdVar2 = (fgd) btsVar.m(g3z.a);
            int i4 = i3 & 896;
            boolean a = btsVar.a(z3) | btsVar.k(iej0Var) | (i4 == 256) | btsVar.k(fgdVar2);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (a || Q == o430Var) {
                boolean z4 = z3;
                fgdVar = fgdVar2;
                i2 = i4;
                aej0Var = aej0Var3;
                z = z4;
                udj0Var = new udj0(z, tlsVar, iej0Var, fgdVar, 0);
                btsVar.o0(udj0Var);
            } else {
                i2 = i4;
                z = z3;
                fgdVar = fgdVar2;
                udj0Var = Q;
                aej0Var = aej0Var3;
            }
            sls slsVar2 = (sls) udj0Var;
            AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
            byk0 byk0Var = cyk0.a;
            f530 l = ymb1.l(bzk0.c(f530Var, appColor$Palette, byk0Var), byk0Var);
            boolean k = btsVar.k(str) | btsVar.a(z) | btsVar.k(str2) | btsVar.k(slsVar2) | btsVar.e(zdj0Var2) | (i2 == 256) | btsVar.e(fgdVar) | btsVar.e(aej0Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                slsVar = slsVar2;
                final boolean z5 = z;
                aej0Var2 = aej0Var;
                f530Var2 = l;
                final fgd fgdVar3 = fgdVar;
                zdj0Var = zdj0Var2;
                tls tlsVar3 = new tls() { // from class: wdj0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        nif nifVar;
                        sdj0 sdj0Var;
                        final iej0 iej0Var2;
                        sdj0 sdj0Var2;
                        final iej0 iej0Var3;
                        mnq0 mnq0Var = (mnq0) obj;
                        f.l(mnq0Var, str);
                        final int i5 = 0;
                        if (z5) {
                            f.p(mnq0Var, 0);
                            f.f(mnq0Var, str2, new zvr(25, slsVar));
                        }
                        zdj0 zdj0Var3 = zdj0Var;
                        boolean z6 = zdj0Var3 instanceof xdj0;
                        final tls tlsVar4 = tlsVar;
                        final fgd fgdVar4 = fgdVar3;
                        nif nifVar2 = null;
                        if (!z6 || (iej0Var3 = (sdj0Var2 = ((xdj0) zdj0Var3).a).c) == null) {
                            nifVar = null;
                        } else {
                            String str3 = sdj0Var2.e;
                            if (str3 == null) {
                                str3 = "";
                            }
                            nifVar = new nif(new sls() { // from class: vdj0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i6 = i5;
                                    fgd fgdVar5 = fgdVar4;
                                    iej0 iej0Var4 = iej0Var3;
                                    tls tlsVar5 = tlsVar4;
                                    switch (i6) {
                                        case 0:
                                            tlsVar5.invoke(iej0Var4);
                                            fgdVar5.a(iej0Var4.a());
                                            break;
                                        default:
                                            tlsVar5.invoke(iej0Var4);
                                            fgdVar5.a(iej0Var4.a());
                                            break;
                                    }
                                    return Boolean.TRUE;
                                }
                            }, str3);
                        }
                        aej0 aej0Var4 = aej0Var2;
                        if (aej0Var4 != null && (iej0Var2 = (sdj0Var = aej0Var4.a).c) != null) {
                            String str4 = sdj0Var.e;
                            final int i6 = 1;
                            nifVar2 = new nif(new sls() { // from class: vdj0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i62 = i6;
                                    fgd fgdVar5 = fgdVar4;
                                    iej0 iej0Var4 = iej0Var2;
                                    tls tlsVar5 = tlsVar4;
                                    switch (i62) {
                                        case 0:
                                            tlsVar5.invoke(iej0Var4);
                                            fgdVar5.a(iej0Var4.a());
                                            break;
                                        default:
                                            tlsVar5.invoke(iej0Var4);
                                            fgdVar5.a(iej0Var4.a());
                                            break;
                                    }
                                    return Boolean.TRUE;
                                }
                            }, str4 != null ? str4 : "");
                        }
                        f.m(mnq0Var, j73.A(new nif[]{nifVar, nifVar2}));
                        return zy11.a;
                    }
                };
                z2 = z5;
                tlsVar2 = tlsVar;
                btsVar.o0(tlsVar3);
                Q2 = tlsVar3;
            } else {
                slsVar = slsVar2;
                z2 = z;
                aej0Var2 = aej0Var;
                zdj0Var = zdj0Var2;
                f530Var2 = l;
                tlsVar2 = tlsVar;
            }
            f530 l2 = an91.l(q791.d(fnq0.a(f530Var2, (tls) Q2), z2, null, null, slsVar, 14), 8.0f, 4.0f);
            lhl0 a2 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l2);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            e(zdj0Var, null, tlsVar2, btsVar, i2);
            b(rdj0Var, null, btsVar, 0);
            f(aej0Var2, null, tlsVar2, btsVar, i2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0((Object) jej0Var, (Object) f530Var, tlsVar, i, 3);
        }
    }

    public static final void b(rdj0 rdj0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-2086847986);
        int i2 = (btsVar2.k(rdj0Var) ? 4 : 2) | i | 48;
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            m3u0 a = m.a(tje.n(rdj0Var.b, btsVar2), null, null, btsVar2, 0, 14);
            CharSequence charSequence = rdj0Var.a;
            boolean k = btsVar2.k(a);
            Object Q = btsVar2.Q();
            if (k || Q == did.a) {
                Q = new w9d(a, 5);
                btsVar2.o0(Q);
            }
            xfc xfcVar = (xfc) Q;
            ety0 ety0Var = xya1.e(btsVar2).h.a;
            sjy0 sjy0Var = new sjy0(5);
            f530Var2 = c530.a;
            btsVar = btsVar2;
            qgy.a(charSequence, xfcVar, null, f530Var2, 0L, 0L, sjy0Var, 0L, 0, 0, 0, ety0Var, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12148);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o990(rdj0Var, f530Var2, i, 14);
        }
    }

    public static final void c(sdj0 sdj0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(404940417);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(sdj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            iej0 iej0Var = sdj0Var.c;
            boolean z = iej0Var != null;
            fgd fgdVar = (fgd) btsVar.m(g3z.a);
            f530 l = ymb1.l(ljs0.m(f530Var, 24.0f), cyk0.a);
            boolean a = ((i2 & 896) == 256) | btsVar.a(z) | btsVar.e(iej0Var) | btsVar.e(fgdVar);
            Object Q = btsVar.Q();
            if (a || Q == did.a) {
                udj0 udj0Var = new udj0(z, tlsVar, iej0Var, fgdVar, 1);
                btsVar.o0(udj0Var);
                Q = udj0Var;
            }
            f530 d = q791.d(l, z, null, null, (sls) Q, 14);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, d);
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
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            sya1.a(sdj0Var.a, ljs0.m(c530.a, 16.0f), null, sdj0Var.b, btsVar, 48, 4);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0((Object) sdj0Var, f530Var, tlsVar, i, 6);
        }
    }

    public static final void d(tdj0 tdj0Var, fid fidVar, int i) {
        int i2;
        tdj0 tdj0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1162018662);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(tdj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        c530 c530Var = c530.a;
        if (i3 == 0) {
            i2 |= btsVar.k(c530Var) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = new nqi0(9);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = new nqi0(8);
                btsVar.o0(Q2);
            }
            uad.a.getClass();
            tdj0Var2 = tdj0Var;
            a.b(tdj0Var2, c530Var, tlsVar, null, null, (tls) Q2, uad.b, btsVar, (i2 & 14) | 1769856 | (i2 & 112), 24);
        } else {
            tdj0Var2 = tdj0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(tdj0Var2, i);
        }
    }

    public static final void e(zdj0 zdj0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(487978797);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(zdj0Var) : btsVar.e(zdj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z = zdj0Var instanceof xdj0;
            c530 c530Var = c530.a;
            if (z) {
                btsVar.e0(-1087687908);
                c(((xdj0) zdj0Var).a, c530Var, tlsVar, btsVar, i3 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                btsVar.t(false);
            } else {
                if (!(zdj0Var instanceof ydj0)) {
                    throw unr0.y(796194968, btsVar, false);
                }
                btsVar.e0(-1087449487);
                d(((ydj0) zdj0Var).a, btsVar, i3 & 112);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0((Object) zdj0Var, f530Var2, tlsVar, i, 4);
        }
    }

    public static final void f(aej0 aej0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1261491993);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(aej0Var) : btsVar.e(aej0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (!btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            if (aej0Var == null) {
                throw unr0.y(1113034063, btsVar, false);
            }
            btsVar.e0(144396079);
            sdj0 sdj0Var = aej0Var.a;
            int i4 = i3 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND;
            c530 c530Var = c530.a;
            c(sdj0Var, c530Var, tlsVar, btsVar, i4);
            btsVar.t(false);
            f530Var2 = c530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vnf0((Object) aej0Var, f530Var2, tlsVar, i, 5);
        }
    }

    public static Object g(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return b64.c(1, list);
        }
        ny61.p();
        return null;
    }

    public static FeedImageLoadErrorType h(Throwable th) {
        if (th instanceof CancellationException) {
            return FeedImageLoadErrorType.CANCELLED;
        }
        boolean z = th instanceof HttpException;
        HttpException httpException = z ? (HttpException) th : null;
        if ((httpException == null || httpException.getResponse().a != 408) && !(th instanceof SocketTimeoutException)) {
            HttpException httpException2 = z ? (HttpException) th : null;
            return (httpException2 == null || httpException2.getResponse().a < 400 || httpException2.getResponse().a == 408) ? th instanceof IOException ? FeedImageLoadErrorType.NETWORK : FeedImageLoadErrorType.UNKNOWN : FeedImageLoadErrorType.SERVER_ERROR;
        }
        return FeedImageLoadErrorType.TIMEOUT;
    }

    public static final void i(m50 m50Var, Object obj) {
        try {
            m50Var.a(obj);
        } catch (Exception e) {
            x4c.g("Exception during launch() in ActivityResultLauncherExt", e, null, null, 12);
        }
    }
}
