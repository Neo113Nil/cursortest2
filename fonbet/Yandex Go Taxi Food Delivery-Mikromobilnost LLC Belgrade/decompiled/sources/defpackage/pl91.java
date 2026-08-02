package defpackage;

import android.util.Log;
import android.webkit.WebSettings;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import io.flutter.plugins.webviewflutter.MixedContentMode;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class pl91 {
    public static final void a(final l8v l8vVar, final String str, final String str2, final ldc ldcVar, final ldc ldcVar2, final float f, final sls slsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1757817492);
        int i2 = i | (btsVar2.k(l8vVar) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(str2) ? 256 : 128) | (btsVar2.k(ldcVar) ? 2048 : 1024) | (btsVar2.k(ldcVar2) ? 16384 : 8192) | (btsVar2.b(f) ? 131072 : 65536) | (btsVar2.e(slsVar) ? 1048576 : 524288);
        if (btsVar2.V(i2 & 1, (599187 & i2) != 599186)) {
            float f2 = ((y7m) y6i0.a(new y7m(cjb1.d(78.0f, 88.0f, f) - cjb1.d((str == null || str.length() == 0) ? 0.0f : 36.0f, 0.0f, f)), new y7m(0.0f))).a;
            float d = cjb1.d(0.0f, 88.0f, f);
            final float d2 = cjb1.d(16.0f, 12.0f, f);
            final float d3 = cjb1.d(14.0f, 10.5f, f);
            final float d4 = cjb1.d(14.0f, 10.0f, f);
            final float d5 = cjb1.d(1.0f, 0.32f, f);
            btsVar = btsVar2;
            xab1.a(an91.o(ljs0.c, 0.0f, f2, 0.0f, d, 5), x4c.c, wwg.S(-846671658, true, new zls() { // from class: e740
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    dj6 dj6Var = (dj6) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(dj6Var) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    boolean V = btsVar3.V(intValue & 1, (intValue & 19) != 18);
                    dmw0 dmw0Var = btsVar3.a;
                    if (V) {
                        float d6 = dj6Var.d() - 40.0f;
                        float f3 = f;
                        float d7 = cjb1.d(d6, 210.0f, f3);
                        float d8 = cjb1.d(126.0f, 94.0f, f3);
                        c530 c530Var = c530.a;
                        f530 c = ljs0.c(c530Var, 1.0f);
                        sic a = qic.a(lr20.c, x4c.H, btsVar3, 48);
                        int hashCode = Long.hashCode(btsVar3.T);
                        r1b0 o = btsVar3.o();
                        f530 d9 = b.d(btsVar3, c);
                        ohd.G1.getClass();
                        sls slsVar2 = d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar3.i0();
                        if (btsVar3.S) {
                            btsVar3.n(slsVar2);
                        } else {
                            btsVar3.r0();
                        }
                        wls wlsVar = d.f;
                        qje.W(btsVar3, wlsVar, a);
                        wls wlsVar2 = d.e;
                        qje.W(btsVar3, wlsVar2, o);
                        Integer valueOf = Integer.valueOf(hashCode);
                        wls wlsVar3 = d.g;
                        qje.W(btsVar3, wlsVar3, valueOf);
                        tls tlsVar = d.h;
                        qje.M(btsVar3, tlsVar);
                        wls wlsVar4 = d.d;
                        qje.W(btsVar3, wlsVar4, d9);
                        h740.b(str, str2, f3, true, btsVar3, HProv.ALG_TYPE_SECURECHANNEL, 0);
                        long n = tje.n(AppColor$Palette.EverFront, btsVar3);
                        f530 n2 = ljs0.n(q791.b(c530Var, null, null, f3 < 1.0f, null, new awk0(0), slsVar, 8), d7, d8);
                        float f4 = d5;
                        boolean b = btsVar3.b(f4);
                        Object Q = btsVar3.Q();
                        if (b || Q == did.a) {
                            Q = new yo1(f4, 4);
                            btsVar3.o0(Q);
                        }
                        f530 l = an91.l(m4m0.b(ymb1.l(androidx.compose.ui.graphics.d.a(n2, (tls) Q), cyk0.c(d2)), n, qke.q), d3, d4);
                        z910 d10 = pi6.d(x4c.y, false);
                        int hashCode2 = Long.hashCode(btsVar3.T);
                        r1b0 o2 = btsVar3.o();
                        f530 d11 = b.d(btsVar3, l);
                        btsVar3.i0();
                        if (btsVar3.S) {
                            btsVar3.n(slsVar2);
                        } else {
                            btsVar3.r0();
                        }
                        qje.W(btsVar3, wlsVar, d10);
                        qje.W(btsVar3, wlsVar2, o2);
                        vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar);
                        qje.W(btsVar3, wlsVar4, d11);
                        l8v l8vVar2 = l8vVar;
                        if (l8vVar2 != null) {
                            btsVar3.e0(760920858);
                            h740.a(l8vVar2, ldcVar, ldcVar2, f3, mhe.g, btsVar3, HProv.ALG_CLASS_DATA_ENCRYPT);
                            btsVar3 = btsVar3;
                            btsVar3.t(false);
                        } else {
                            btsVar3.e0(761211080);
                            btsVar3.t(false);
                        }
                        btsVar3.t(true);
                        btsVar3.t(true);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), btsVar, 3120, 4);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new f740(l8vVar, str, str2, ldcVar, ldcVar2, f, slsVar, i, 0);
        }
    }

    public static zxa0 b(String str) {
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            return zxa0.a;
        }
        return null;
    }

    public static final long c(g8m g8mVar) {
        float x = g8mVar.a.getX();
        float y = g8mVar.a.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static void d(tt5 tt5Var, final kne kneVar) {
        xv10 xv10Var;
        rs10 ld2Var = (kneVar == null || (xv10Var = kneVar.a) == null) ? new ld2() : xv10Var.f();
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", ld2Var, null);
        if (kneVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i2 = i;
                    kne kneVar2 = kneVar;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i3 = xj41.a[mixedContentMode.ordinal()];
                                if (i3 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i3 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i3 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", ld2Var, null);
        if (kneVar != null) {
            final int i2 = 15;
            m2vVar2.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i2;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i3 = xj41.a[mixedContentMode.ordinal()];
                                if (i3 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i3 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i3 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", ld2Var, null);
        if (kneVar != null) {
            final int i3 = 16;
            m2vVar3.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i3;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", ld2Var, null);
        if (kneVar != null) {
            final int i4 = 1;
            m2vVar4.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i4;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", ld2Var, null);
        if (kneVar != null) {
            final int i5 = 2;
            m2vVar5.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i5;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", ld2Var, null);
        if (kneVar != null) {
            final int i6 = 3;
            m2vVar6.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i6;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar6.G(null);
        }
        m2v m2vVar7 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", ld2Var, null);
        if (kneVar != null) {
            final int i7 = 4;
            m2vVar7.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i7;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar7.G(null);
        }
        m2v m2vVar8 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", ld2Var, null);
        if (kneVar != null) {
            final int i8 = 5;
            m2vVar8.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i8;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar8.G(null);
        }
        m2v m2vVar9 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", ld2Var, null);
        if (kneVar != null) {
            final int i9 = 6;
            m2vVar9.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i9;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar9.G(null);
        }
        m2v m2vVar10 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", ld2Var, null);
        if (kneVar != null) {
            final int i10 = 7;
            m2vVar10.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i10;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar10.G(null);
        }
        m2v m2vVar11 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", ld2Var, null);
        if (kneVar != null) {
            final int i11 = 8;
            m2vVar11.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i11;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar11.G(null);
        }
        m2v m2vVar12 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", ld2Var, null);
        if (kneVar != null) {
            final int i12 = 9;
            m2vVar12.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i12;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar12.G(null);
        }
        m2v m2vVar13 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", ld2Var, null);
        if (kneVar != null) {
            final int i13 = 10;
            m2vVar13.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i13;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar13.G(null);
        }
        m2v m2vVar14 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", ld2Var, null);
        if (kneVar != null) {
            final int i14 = 11;
            m2vVar14.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i14;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar14.G(null);
        }
        m2v m2vVar15 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", ld2Var, null);
        if (kneVar != null) {
            final int i15 = 12;
            m2vVar15.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i15;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar15.G(null);
        }
        m2v m2vVar16 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", ld2Var, null);
        if (kneVar != null) {
            final int i16 = 13;
            m2vVar16.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i16;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        } else {
            m2vVar16.G(null);
        }
        m2v m2vVar17 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", ld2Var, null);
        if (kneVar == null) {
            m2vVar17.G(null);
        } else {
            final int i17 = 14;
            m2vVar17.G(new ee5() { // from class: ftb0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    List g16;
                    List g17;
                    int i22 = i17;
                    kne kneVar2 = kneVar;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            WebSettings webSettings = (WebSettings) list.get(0);
                            boolean booleanValue = ((Boolean) list.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
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
                            List list2 = (List) obj;
                            WebSettings webSettings2 = (WebSettings) list2.get(0);
                            boolean booleanValue2 = ((Boolean) list2.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
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
                            List list3 = (List) obj;
                            WebSettings webSettings3 = (WebSettings) list3.get(0);
                            String str = (String) list3.get(1);
                            try {
                                kneVar2.getClass();
                                webSettings3.setUserAgentString(str);
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
                            List list4 = (List) obj;
                            WebSettings webSettings4 = (WebSettings) list4.get(0);
                            boolean booleanValue3 = ((Boolean) list4.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
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
                            List list5 = (List) obj;
                            WebSettings webSettings5 = (WebSettings) list5.get(0);
                            boolean booleanValue4 = ((Boolean) list5.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
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
                        case 5:
                            List list6 = (List) obj;
                            WebSettings webSettings6 = (WebSettings) list6.get(0);
                            boolean booleanValue5 = ((Boolean) list6.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
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
                        case 6:
                            List list7 = (List) obj;
                            WebSettings webSettings7 = (WebSettings) list7.get(0);
                            boolean booleanValue6 = ((Boolean) list7.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                if (th7 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError7 = th7;
                                    g7 = scc.g(androidWebKitError7.getCode(), androidWebKitError7.getMessage(), androidWebKitError7.getDetails());
                                } else {
                                    g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                                }
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            WebSettings webSettings8 = (WebSettings) list8.get(0);
                            boolean booleanValue7 = ((Boolean) list8.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                g8 = Collections.singletonList(null);
                            } catch (Throwable th8) {
                                if (th8 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError8 = th8;
                                    g8 = scc.g(androidWebKitError8.getCode(), androidWebKitError8.getMessage(), androidWebKitError8.getDetails());
                                } else {
                                    g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                                }
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            WebSettings webSettings9 = (WebSettings) list9.get(0);
                            boolean booleanValue8 = ((Boolean) list9.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                g9 = Collections.singletonList(null);
                            } catch (Throwable th9) {
                                if (th9 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError9 = th9;
                                    g9 = scc.g(androidWebKitError9.getCode(), androidWebKitError9.getMessage(), androidWebKitError9.getDetails());
                                } else {
                                    g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                                }
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            WebSettings webSettings10 = (WebSettings) list10.get(0);
                            boolean booleanValue9 = ((Boolean) list10.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                if (th10 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError10 = th10;
                                    g10 = scc.g(androidWebKitError10.getCode(), androidWebKitError10.getMessage(), androidWebKitError10.getDetails());
                                } else {
                                    g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                                }
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            WebSettings webSettings11 = (WebSettings) list11.get(0);
                            boolean booleanValue10 = ((Boolean) list11.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                g11 = Collections.singletonList(null);
                            } catch (Throwable th11) {
                                if (th11 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError11 = th11;
                                    g11 = scc.g(androidWebKitError11.getCode(), androidWebKitError11.getMessage(), androidWebKitError11.getDetails());
                                } else {
                                    g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                                }
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            WebSettings webSettings12 = (WebSettings) list12.get(0);
                            boolean booleanValue11 = ((Boolean) list12.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                g12 = Collections.singletonList(null);
                            } catch (Throwable th12) {
                                if (th12 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError12 = th12;
                                    g12 = scc.g(androidWebKitError12.getCode(), androidWebKitError12.getMessage(), androidWebKitError12.getDetails());
                                } else {
                                    g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                                }
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            WebSettings webSettings13 = (WebSettings) list13.get(0);
                            long longValue = ((Long) list13.get(1)).longValue();
                            try {
                                kneVar2.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                if (th13 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError13 = th13;
                                    g13 = scc.g(androidWebKitError13.getCode(), androidWebKitError13.getMessage(), androidWebKitError13.getDetails());
                                } else {
                                    g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                                }
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            WebSettings webSettings14 = (WebSettings) ((List) obj).get(0);
                            try {
                                kneVar2.getClass();
                                g14 = Collections.singletonList(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                if (th14 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError14 = th14;
                                    g14 = scc.g(androidWebKitError14.getCode(), androidWebKitError14.getMessage(), androidWebKitError14.getDetails());
                                } else {
                                    g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                                }
                            }
                            ce5Var.a(g14);
                            break;
                        case 14:
                            List list14 = (List) obj;
                            WebSettings webSettings15 = (WebSettings) list14.get(0);
                            MixedContentMode mixedContentMode = (MixedContentMode) list14.get(1);
                            try {
                                kneVar2.getClass();
                                int i32 = xj41.a[mixedContentMode.ordinal()];
                                if (i32 == 1) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (i32 == 2) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (i32 == 3) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                if (th15 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError15 = th15;
                                    g15 = scc.g(androidWebKitError15.getCode(), androidWebKitError15.getMessage(), androidWebKitError15.getDetails());
                                } else {
                                    g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                                }
                            }
                            ce5Var.a(g15);
                            break;
                        case 15:
                            List list15 = (List) obj;
                            WebSettings webSettings16 = (WebSettings) list15.get(0);
                            boolean booleanValue12 = ((Boolean) list15.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                g16 = Collections.singletonList(null);
                            } catch (Throwable th16) {
                                if (th16 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError16 = th16;
                                    g16 = scc.g(androidWebKitError16.getCode(), androidWebKitError16.getMessage(), androidWebKitError16.getDetails());
                                } else {
                                    g16 = scc.g(th16.getClass().getSimpleName(), th16.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th16), th16.getCause()));
                                }
                            }
                            ce5Var.a(g16);
                            break;
                        default:
                            List list16 = (List) obj;
                            WebSettings webSettings17 = (WebSettings) list16.get(0);
                            boolean booleanValue13 = ((Boolean) list16.get(1)).booleanValue();
                            try {
                                kneVar2.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                g17 = Collections.singletonList(null);
                            } catch (Throwable th17) {
                                if (th17 instanceof AndroidWebKitError) {
                                    AndroidWebKitError androidWebKitError17 = th17;
                                    g17 = scc.g(androidWebKitError17.getCode(), androidWebKitError17.getMessage(), androidWebKitError17.getDetails());
                                } else {
                                    g17 = scc.g(th17.getClass().getSimpleName(), th17.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th17), th17.getCause()));
                                }
                            }
                            ce5Var.a(g17);
                            break;
                    }
                }
            });
        }
    }
}
