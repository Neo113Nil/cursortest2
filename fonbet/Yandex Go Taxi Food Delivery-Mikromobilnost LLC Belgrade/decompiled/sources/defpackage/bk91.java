package defpackage;

import android.util.Log;
import android.webkit.HttpAuthHandler;
import androidx.compose.foundation.text.selection.j;
import com.yandex.messaging.ChatRequest;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$Style;
import com.yx360.design.compose.atoms.modal.a;
import defpackage.ds31;
import defpackage.tje;
import defpackage.xz31;
import defpackage.zy11;
import defpackage.zz31;
import flex.core.loader.network.e;
import flex.logger.FlexLogLevel;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes4.dex */
public abstract class bk91 {
    public static final void a(int i, sls slsVar, DsButton$Style dsButton$Style, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(732916834);
        int i3 = i2 | (btsVar.c(i) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | HProv.ALG_TYPE_SECURECHANNEL;
        if ((i3 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
        } else {
            String e = ohb1.e(btsVar, i);
            DsButton$Size dsButton$Size = DsButton$Size.Md;
            qnm.d.getClass();
            mo91.e(e, slsVar, dsButton$Style, an91.m(c530.a, 8.0f, 0.0f, 2), dsButton$Size, null, null, false, null, false, btsVar, (i3 & 112) | 101147008, 0, MSException.RPC_S_PROTOCOL_ERROR);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(i, slsVar, dsButton$Style, i2, 17);
        }
    }

    public static final void b(f530 f530Var, sls slsVar, qrm qrmVar, sls slsVar2, int i, int i2, fid fidVar, int i3) {
        int i4;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1481356532);
        if ((i3 & 6) == 0) {
            i4 = (btsVar2.k(f530Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar2.k(qrmVar) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.e(slsVar2) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.c(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= btsVar2.c(i2) ? 131072 : 65536;
        }
        if ((74899 & i4) == 74898 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            a.a(slsVar, f530Var, srm.a, null, null, null, null, qrmVar, wwg.S(-2117367848, true, new yz31(i2, i, slsVar2), btsVar2), btsVar, ((i4 >> 3) & 14) | 805306368 | ((i4 << 3) & 112) | ((i4 << 18) & 234881024), 248);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hxm(f530Var, slsVar, qrmVar, slsVar2, i, i2, i3);
        }
    }

    public static final void c(xz31 xz31Var, f530 f530Var, zz31 zz31Var, sls slsVar, int i, fid fidVar, int i2) {
        final zz31 zz31Var2;
        int i3;
        int i4;
        f530 f530Var2;
        f530 f530Var3;
        int i5;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-525695892);
        int i6 = 2;
        int i7 = i2 | (btsVar.e(xz31Var) ? 4 : 2) | 176 | (btsVar.e(slsVar) ? 2048 : 1024) | 8192;
        if ((i7 & 9363) == 9362 && btsVar.E()) {
            btsVar.Y();
            f530Var3 = f530Var;
            zz31Var2 = zz31Var;
            i5 = i;
        } else {
            btsVar.a0();
            int i8 = i2 & 1;
            o430 o430Var = did.a;
            if (i8 == 0 || btsVar.C()) {
                btsVar.e0(-897180073);
                rs31 b = jjo.b(btsVar);
                hs31 a = jjo.a(btsVar);
                btsVar.e0(544794079);
                boolean e = btsVar.e(a);
                Object Q = btsVar.Q();
                if (e || Q == o430Var) {
                    Q = new w4(a, 29);
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                yr31 G = ooc.G(qoi0.a(zz31.class), b, null, vfc.h(zz31.class, new zwv(), (tls) Q), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
                btsVar.t(false);
                zz31Var2 = (zz31) G;
                i3 = i7 & (-58241);
                i4 = jl40.l(xz31Var.a, c720.d) ? oyh0.msg_vpn_blocked_message_dialog_title : oyh0.msg_vpn_blocked_dialog_title;
                f530Var2 = c530.a;
            } else {
                btsVar.Y();
                i3 = i7 & (-58241);
                f530Var2 = f530Var;
                zz31Var2 = zz31Var;
                i4 = i;
            }
            btsVar.u();
            int i9 = wwg0.msg_vpn_blocked_dlg;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q2);
            }
            tse tseVar = (tse) Q2;
            qrm f = yrm.f(btsVar);
            btsVar.e0(-498914041);
            boolean e2 = ((i3 & 7168) == 2048) | btsVar.e(tseVar) | btsVar.k(f);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                Q3 = new yl50(tseVar, f, slsVar, i6);
                btsVar.o0(Q3);
            }
            final sls slsVar2 = (sls) Q3;
            btsVar.t(false);
            btsVar.e0(-498906742);
            boolean e3 = btsVar.e(zz31Var2) | btsVar.k(slsVar2);
            Object Q4 = btsVar.Q();
            if (e3 || Q4 == o430Var) {
                Q4 = new sls() { // from class: com.yandex.messaging.ui.vpn.a
                    @Override // defpackage.sls
                    public final Object invoke() {
                        String str;
                        zz31 zz31Var3 = zz31.this;
                        xz31 xz31Var2 = zz31Var3.w;
                        ChatRequest chatRequest = xz31Var2.c;
                        if (chatRequest != null && (str = xz31Var2.b) != null) {
                            tje.N(ds31.a(zz31Var3), null, null, new VpnBlockedViewModel$onRetry$1(zz31Var3, chatRequest, str, null), 3);
                        }
                        slsVar2.invoke();
                        return zy11.a;
                    }
                };
                btsVar.o0(Q4);
            }
            btsVar.t(false);
            b(f530Var2, slsVar2, f, (sls) Q4, i4, i9, btsVar, 6);
            btsVar = btsVar;
            f530Var3 = f530Var2;
            i5 = i4;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(xz31Var, f530Var3, zz31Var2, slsVar, i5, i2);
        }
    }

    public static final flex.engine.a d(tls tlsVar) {
        jyl jylVar = new jyl();
        tlsVar.invoke(jylVar);
        g0c a = qoi0.a(kwg.class);
        mwg mwgVar = new mwg(new acj(jylVar));
        LinkedHashMap linkedHashMap = jylVar.n;
        linkedHashMap.put(a, mwgVar);
        g0c a2 = qoi0.a(yug.class);
        bvg bvgVar = new bvg(new acj(jylVar));
        LinkedHashMap linkedHashMap2 = jylVar.q;
        linkedHashMap2.put(a2, bvgVar);
        trd trdVar = new trd();
        jylVar.e = kotlin.collections.a.o0(jylVar.e, trdVar);
        jylVar.f = kotlin.collections.a.o0(jylVar.f, trdVar);
        e eVar = jylVar.a;
        if (eVar == null) {
            ny61.g("DocumentLoader is required for engine see https://docs.yandex-team.ru/bdui/flexbook/");
            return null;
        }
        ew ewVar = new ew(0, jylVar.l);
        qir qirVar = jylVar.b;
        if (qirVar == null) {
            ny61.g("ActionDispatcherErrorHandler is required for engine see https://docs.yandex-team.ru/bdui/flexbook/");
            return null;
        }
        yu yuVar = new yu(ewVar, qirVar, jylVar.h);
        i7x0 i7x0Var = jylVar.d;
        if (i7x0Var == null) {
            ny61.g("TagRegistry is required for engine see https://docs.yandex-team.ru/bdui/flexbook/");
            return null;
        }
        ujm0 ujm0Var = jylVar.i;
        if (ujm0Var == null) {
            ujm0Var = new sjm0(linkedHashMap, jylVar.p, jylVar.o);
        }
        lfe lfeVar = jylVar.j;
        if (lfeVar == null) {
            lfeVar = new jfe(linkedHashMap2, jylVar.s, jylVar.r);
        }
        lfe lfeVar2 = lfeVar;
        u6o u6oVar = jylVar.c;
        if (u6oVar != null) {
            return new flex.engine.a(eVar, yuVar, ujm0Var, lfeVar2, i7x0Var, u6oVar, jylVar.u, null, null, jylVar.f, kotlin.collections.a.I(kotlin.collections.a.m0(scc.g(new cti0(), new q1o()), jylVar.e)), null, jylVar.k, new v8e(22, jylVar), new ow50(), jylVar.t, jylVar.v, null, 75008);
        }
        ny61.g("ErrorControllerProvider is required for engine see https://docs.yandex-team.ru/bdui/flexbook/");
        return null;
    }

    public static final flex.engine.a e(u1m u1mVar, tls tlsVar) {
        StackTraceElement stackTraceElement;
        String num;
        StackTraceElement stackTraceElement2;
        String num2;
        i3y i3yVar = ryl.c;
        ryl b = ck91.b();
        if (u1mVar == null) {
            return d(tlsVar);
        }
        zjr zjrVar = b.a;
        b.a();
        uyl uylVar = (uyl) b.b.remove(u1mVar);
        String str = "No line info";
        EmptyList emptyList = EmptyList.a;
        tjr tjrVar = tjr.d;
        flex.engine.a aVar = null;
        if (uylVar != null) {
            flex.engine.a aVar2 = uylVar.c;
            i3y b2 = ryl.b(b, u1mVar, null, 2);
            s7s0 s7s0Var = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement2.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement2.getMethodName();
                int lineNumber = stackTraceElement2.getLineNumber();
                Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                if (valueOf != null && (num2 = valueOf.toString()) != null) {
                    str = num2;
                }
                tjrVar = new tjr(fileName, methodName, str);
            }
            tjr tjrVar2 = tjrVar;
            zjrVar.d(FlexLogLevel.DEBUG, "Engine retrieved and removed from storage", b2, emptyList, tjrVar.a, tjrVar2.b, tjrVar2.c);
            aVar = aVar2;
        } else {
            i3y b3 = ryl.b(b, u1mVar, null, 2);
            s7s0 s7s0Var2 = zjrVar.c.a;
            if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName2 = stackTraceElement.getFileName();
                if (fileName2 == null) {
                    fileName2 = "No file info";
                }
                String methodName2 = stackTraceElement.getMethodName();
                int lineNumber2 = stackTraceElement.getLineNumber();
                Integer valueOf2 = Integer.valueOf(lineNumber2);
                if (lineNumber2 <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 != null && (num = valueOf2.toString()) != null) {
                    str = num;
                }
                tjrVar = new tjr(fileName2, methodName2, str);
            }
            tjr tjrVar3 = tjrVar;
            zjrVar.d(FlexLogLevel.DEBUG, "Engine is not found in storage", b3, emptyList, tjrVar.a, tjrVar3.b, tjrVar3.c);
        }
        return aVar == null ? d(tlsVar) : aVar;
    }

    public static final f530 f(f530 f530Var, w9y w9yVar, oay oayVar, j jVar) {
        return f530Var.k(new f9y(w9yVar, oayVar, jVar));
    }

    public static void g(tt5 tt5Var, final prr prrVar) {
        xv10 xv10Var;
        rs10 ld2Var = (prrVar == null || (xv10Var = prrVar.a) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", ld2Var, obj);
        if (prrVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: lsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    prr prrVar2 = prrVar;
                    switch (i2) {
                        case 0:
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g = Collections.singletonList(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                httpAuthHandler2.cancel();
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            List list = (List) obj2;
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) list.get(0);
                            String str = (String) list.get(1);
                            String str2 = (String) list.get(2);
                            try {
                                prrVar2.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", ld2Var, obj);
        if (prrVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: lsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g = Collections.singletonList(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                httpAuthHandler2.cancel();
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            List list = (List) obj2;
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) list.get(0);
                            String str = (String) list.get(1);
                            String str2 = (String) list.get(2);
                            try {
                                prrVar2.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", ld2Var, obj);
        if (prrVar == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: lsb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    prr prrVar2 = prrVar;
                    switch (i22) {
                        case 0:
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                g = Collections.singletonList(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                if (th instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError = th;
                                    g = scc.g(androidWebKitError.getCode(), androidWebKitError.getMessage(), androidWebKitError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) ((List) obj2).get(0);
                            try {
                                prrVar2.getClass();
                                httpAuthHandler2.cancel();
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError2 = th2;
                                    g2 = scc.g(androidWebKitError2.getCode(), androidWebKitError2.getMessage(), androidWebKitError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            ce5Var.a(g2);
                            break;
                        default:
                            List list = (List) obj2;
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) list.get(0);
                            String str = (String) list.get(1);
                            String str2 = (String) list.get(2);
                            try {
                                prrVar2.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                g3 = Collections.singletonList(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError3 = th3;
                                    g3 = scc.g(androidWebKitError3.getCode(), androidWebKitError3.getMessage(), androidWebKitError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            break;
                    }
                }
            });
        }
    }
}
