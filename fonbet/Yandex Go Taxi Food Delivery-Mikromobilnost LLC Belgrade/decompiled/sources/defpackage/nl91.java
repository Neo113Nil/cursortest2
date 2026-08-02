package defpackage;

import android.util.Log;
import androidx.compose.ui.b;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.f;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl;
import io.flutter.plugins.webviewflutter.a;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class nl91 {
    public static final void a(q740 q740Var, sls slsVar, sls slsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1666910168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(q740Var) : btsVar.e(q740Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar2) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            gpb1.c(an91.o(c530.a, 0.0f, y311.a.equals(a411.a) ? 40.0f : 85.0f, 0.0f, 0.0f, 13), false, 0.0f, wwg.S(-555739512, true, new x640(q740Var, slsVar, i3), btsVar), wwg.S(-1040684761, true, new x640(q740Var, slsVar2, i4), btsVar), btsVar, 27648, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ivy(q740Var, slsVar, slsVar2, i, 8);
        }
    }

    public static final void b(f530 f530Var, String str, ovi0 ovi0Var, sls slsVar, fid fidVar, int i) {
        f530 f530Var2;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1883942766);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | 6 | (btsVar.k(str) ? 32 : 16) | (btsVar.k(ovi0Var) ? 256 : 128) | (btsVar.e(slsVar) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new zvr(11, slsVar);
                btsVar.o0(Q);
            }
            awk0 awk0Var = new awk0(0);
            c530 c530Var2 = c530.a;
            f530 b = q791.b(c530Var2, null, null, false, null, awk0Var, (sls) Q, 12);
            k3r k3rVar = ljs0.c;
            f530 k = b.k(k3rVar);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
            ohd.G1.getClass();
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            sic a = qic.a(lr20.e, x4c.H, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, k3rVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            if (ovi0Var != null) {
                btsVar.e0(536712685);
                c530Var = c530Var2;
                v0b1.a(ovi0Var, ljs0.m(c530Var2, 24.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, ((i2 >> 6) & 14) | 48, 1020);
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                btsVar.e0(536811668);
                btsVar.t(false);
            }
            f530 e = n.e(c530Var, 6.0f, btsVar, c530Var, 1.0f);
            jeb1.f(str == null ? "" : str, e, AppColor$Palette.Text, 0L, 0L, null, new sjy0(3), 0L, 2, false, 2, 0, null, xya1.d(btsVar).i.c, btsVar, 805306800, 48, 13688);
            btsVar = btsVar;
            btsVar.t(true);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wzr(f530Var2, (Object) str, (Object) ovi0Var, slsVar, i, 18);
        }
    }

    public static final boolean c(l8m l8mVar, long j) {
        if (!l8mVar.getNode().isAttached()) {
            return false;
        }
        f fVar = (f) qje.P(l8mVar).a0.d;
        if (!fVar.d()) {
            return false;
        }
        long v = fVar.v(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (v >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (v & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long j2 = l8mVar.w;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static final void d(u8m u8mVar, g8m g8mVar) {
        l8m l8mVar = (l8m) u8mVar;
        l8mVar.F0(g8mVar);
        l8mVar.H0(g8mVar);
    }

    public static final void e(dd11 dd11Var, tls tlsVar) {
        if (tlsVar.invoke(dd11Var) != TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        dai0.O(dd11Var, tlsVar);
    }

    public static void f(tt5 tt5Var, final a aVar) {
        xv10 xv10Var;
        rs10 ld2Var = (aVar == null || (xv10Var = (xv10) aVar.b) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", ld2Var, obj);
        if (aVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: etb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i2 = i;
                    x3 x3Var = aVar;
                    switch (i2) {
                        case 0:
                            try {
                                ((w4u) ((xv10) ((a) x3Var).b).b).j(((Long) ((List) obj2).get(0)).longValue(), new WebChromeClientProxyApi$WebChromeClientImpl((a) x3Var));
                                g = Collections.singletonList(null);
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
                            List list = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl.setReturnValueForOnShowFileChooser(booleanValue);
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
                        case 2:
                            List list2 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl2 = (WebChromeClientProxyApi$WebChromeClientImpl) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl2.setReturnValueForOnConsoleMessage(booleanValue2);
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
                        case 3:
                            List list3 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl3 = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(0);
                            boolean booleanValue3 = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl3.setReturnValueForOnJsAlert(booleanValue3);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl4 = (WebChromeClientProxyApi$WebChromeClientImpl) list4.get(0);
                            boolean booleanValue4 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl4.setReturnValueForOnJsConfirm(booleanValue4);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list5 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl5 = (WebChromeClientProxyApi$WebChromeClientImpl) list5.get(0);
                            boolean booleanValue5 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl5.setReturnValueForOnJsPrompt(booleanValue5);
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", ld2Var, obj);
        if (aVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: etb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i2;
                    x3 x3Var = aVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) ((xv10) ((a) x3Var).b).b).j(((Long) ((List) obj2).get(0)).longValue(), new WebChromeClientProxyApi$WebChromeClientImpl((a) x3Var));
                                g = Collections.singletonList(null);
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
                            List list = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl.setReturnValueForOnShowFileChooser(booleanValue);
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
                        case 2:
                            List list2 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl2 = (WebChromeClientProxyApi$WebChromeClientImpl) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl2.setReturnValueForOnConsoleMessage(booleanValue2);
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
                        case 3:
                            List list3 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl3 = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(0);
                            boolean booleanValue3 = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl3.setReturnValueForOnJsAlert(booleanValue3);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl4 = (WebChromeClientProxyApi$WebChromeClientImpl) list4.get(0);
                            boolean booleanValue4 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl4.setReturnValueForOnJsConfirm(booleanValue4);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list5 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl5 = (WebChromeClientProxyApi$WebChromeClientImpl) list5.get(0);
                            boolean booleanValue5 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl5.setReturnValueForOnJsPrompt(booleanValue5);
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", ld2Var, obj);
        if (aVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: etb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i3;
                    x3 x3Var = aVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) ((xv10) ((a) x3Var).b).b).j(((Long) ((List) obj2).get(0)).longValue(), new WebChromeClientProxyApi$WebChromeClientImpl((a) x3Var));
                                g = Collections.singletonList(null);
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
                            List list = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl.setReturnValueForOnShowFileChooser(booleanValue);
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
                        case 2:
                            List list2 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl2 = (WebChromeClientProxyApi$WebChromeClientImpl) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl2.setReturnValueForOnConsoleMessage(booleanValue2);
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
                        case 3:
                            List list3 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl3 = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(0);
                            boolean booleanValue3 = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl3.setReturnValueForOnJsAlert(booleanValue3);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl4 = (WebChromeClientProxyApi$WebChromeClientImpl) list4.get(0);
                            boolean booleanValue4 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl4.setReturnValueForOnJsConfirm(booleanValue4);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list5 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl5 = (WebChromeClientProxyApi$WebChromeClientImpl) list5.get(0);
                            boolean booleanValue5 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl5.setReturnValueForOnJsPrompt(booleanValue5);
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", ld2Var, obj);
        if (aVar != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: etb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i4;
                    x3 x3Var = aVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) ((xv10) ((a) x3Var).b).b).j(((Long) ((List) obj2).get(0)).longValue(), new WebChromeClientProxyApi$WebChromeClientImpl((a) x3Var));
                                g = Collections.singletonList(null);
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
                            List list = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl.setReturnValueForOnShowFileChooser(booleanValue);
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
                        case 2:
                            List list2 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl2 = (WebChromeClientProxyApi$WebChromeClientImpl) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl2.setReturnValueForOnConsoleMessage(booleanValue2);
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
                        case 3:
                            List list3 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl3 = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(0);
                            boolean booleanValue3 = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl3.setReturnValueForOnJsAlert(booleanValue3);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl4 = (WebChromeClientProxyApi$WebChromeClientImpl) list4.get(0);
                            boolean booleanValue4 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl4.setReturnValueForOnJsConfirm(booleanValue4);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list5 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl5 = (WebChromeClientProxyApi$WebChromeClientImpl) list5.get(0);
                            boolean booleanValue5 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl5.setReturnValueForOnJsPrompt(booleanValue5);
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", ld2Var, obj);
        if (aVar != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: etb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i5;
                    x3 x3Var = aVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) ((xv10) ((a) x3Var).b).b).j(((Long) ((List) obj2).get(0)).longValue(), new WebChromeClientProxyApi$WebChromeClientImpl((a) x3Var));
                                g = Collections.singletonList(null);
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
                            List list = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl.setReturnValueForOnShowFileChooser(booleanValue);
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
                        case 2:
                            List list2 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl2 = (WebChromeClientProxyApi$WebChromeClientImpl) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl2.setReturnValueForOnConsoleMessage(booleanValue2);
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
                        case 3:
                            List list3 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl3 = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(0);
                            boolean booleanValue3 = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl3.setReturnValueForOnJsAlert(booleanValue3);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl4 = (WebChromeClientProxyApi$WebChromeClientImpl) list4.get(0);
                            boolean booleanValue4 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl4.setReturnValueForOnJsConfirm(booleanValue4);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list5 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl5 = (WebChromeClientProxyApi$WebChromeClientImpl) list5.get(0);
                            boolean booleanValue5 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl5.setReturnValueForOnJsPrompt(booleanValue5);
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", ld2Var, obj);
        if (aVar == null) {
            m2vVar6.G(null);
        } else {
            final int i6 = 5;
            m2vVar6.G(new ee5() { // from class: etb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i6;
                    x3 x3Var = aVar;
                    switch (i22) {
                        case 0:
                            try {
                                ((w4u) ((xv10) ((a) x3Var).b).b).j(((Long) ((List) obj2).get(0)).longValue(), new WebChromeClientProxyApi$WebChromeClientImpl((a) x3Var));
                                g = Collections.singletonList(null);
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
                            List list = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl = (WebChromeClientProxyApi$WebChromeClientImpl) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl.setReturnValueForOnShowFileChooser(booleanValue);
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
                        case 2:
                            List list2 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl2 = (WebChromeClientProxyApi$WebChromeClientImpl) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl2.setReturnValueForOnConsoleMessage(booleanValue2);
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
                        case 3:
                            List list3 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl3 = (WebChromeClientProxyApi$WebChromeClientImpl) list3.get(0);
                            boolean booleanValue3 = ((Boolean) list3.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl3.setReturnValueForOnJsAlert(booleanValue3);
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError4 = th4;
                                    g4 = scc.g(androidWebKitError4.getCode(), androidWebKitError4.getMessage(), androidWebKitError4.getDetails());
                                } else {
                                    g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                                }
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list4 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl4 = (WebChromeClientProxyApi$WebChromeClientImpl) list4.get(0);
                            boolean booleanValue4 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl4.setReturnValueForOnJsConfirm(booleanValue4);
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError5 = th5;
                                    g5 = scc.g(androidWebKitError5.getCode(), androidWebKitError5.getMessage(), androidWebKitError5.getDetails());
                                } else {
                                    g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                                }
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list5 = (List) obj2;
                            WebChromeClientProxyApi$WebChromeClientImpl webChromeClientProxyApi$WebChromeClientImpl5 = (WebChromeClientProxyApi$WebChromeClientImpl) list5.get(0);
                            boolean booleanValue5 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                ((a) x3Var).getClass();
                                webChromeClientProxyApi$WebChromeClientImpl5.setReturnValueForOnJsPrompt(booleanValue5);
                                g6 = Collections.singletonList(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError6 = th6;
                                    g6 = scc.g(androidWebKitError6.getCode(), androidWebKitError6.getMessage(), androidWebKitError6.getDetails());
                                } else {
                                    g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                                }
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        }
    }

    public static void g(String str, Integer num, String str2, String str3, Throwable th, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            th = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            bool2 = null;
        }
        if ((i & 256) != 0) {
            bool3 = null;
        }
        if ((i & 512) != 0) {
            bool4 = null;
        }
        Boolean bool5 = Boolean.TRUE;
        String str5 = jl40.l(bool, bool5) ? "ConnectionError" : jl40.l(bool2, bool5) ? "SslError" : jl40.l(bool3, bool5) ? "ServerError" : jl40.l(bool4, bool5) ? "ClientError" : "";
        trp0 trp0Var = trp0.a;
        trp0.e(new brp0(str, th, num, str2, str3, str4, str5));
    }
}
