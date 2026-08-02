package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import io.flutter.plugins.webviewflutter.AndroidWebKitError;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.divider.SeparateTitleModel$Align;

/* loaded from: classes11.dex */
public abstract class pj91 {
    public static final void a(drl drlVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(446835256);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(drlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            int i3 = brl.a[drlVar.c.ordinal()];
            c530 c530Var = c530.a;
            switch (i3) {
                case 1:
                    btsVar.e0(1565583985);
                    String str = drlVar.d;
                    if (str == null) {
                        btsVar.e0(1565583984);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1565583985);
                        d(str, btsVar, 0);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                    break;
                case 2:
                    btsVar.e0(1565680581);
                    dk91.a(0.0f, 0, 7, 0L, btsVar, null);
                    btsVar.t(false);
                    break;
                case 3:
                    btsVar.e0(1565756469);
                    dk91.a(0.0f, 6, 6, 0L, btsVar, an91.m(c530Var, 16.0f, 0.0f, 2));
                    btsVar.t(false);
                    break;
                case 4:
                    btsVar.e0(1565876160);
                    dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530Var, 56.0f, 0.0f, 0.0f, 0.0f, 14));
                    btsVar.t(false);
                    break;
                case 5:
                    btsVar.e0(1565992999);
                    dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530Var, 56.0f, 0.0f, 16.0f, 0.0f, 10));
                    btsVar.t(false);
                    break;
                case 6:
                    btsVar.e0(1566124284);
                    dk91.a(2.0f, 384, 1, ((el51) btsVar.m(gl51.a)).n(), btsVar, null);
                    btsVar.t(false);
                    break;
                case 7:
                    btsVar.e0(1566319367);
                    dk91.a(2.0f, 390, 0, ((el51) btsVar.m(gl51.a)).n(), btsVar, an91.m(c530Var, 16.0f, 0.0f, 2));
                    btsVar.t(false);
                    break;
                case 8:
                    btsVar.e0(1566579147);
                    y7m y7mVar = drlVar.e;
                    if (y7mVar == null) {
                        btsVar.e0(1566579146);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1566579147);
                        ly3.B(c530Var, y7mVar.a, btsVar, false);
                    }
                    btsVar.t(false);
                    break;
                case 9:
                    btsVar.e0(1566735046);
                    List list = drlVar.f;
                    if (list == null) {
                        btsVar.e0(1566735045);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1566735046);
                        c(list, btsVar, 0);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                    break;
                default:
                    throw unr0.y(-88046009, btsVar, false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(drlVar, i, 13);
        }
    }

    public static final void b(CharSequence charSequence, int i, fid fidVar, int i2) {
        CharSequence charSequence2;
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1110925673);
        int i4 = (btsVar.e(charSequence) ? 4 : 2) | i2 | (btsVar.c(i) ? 32 : 16);
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(m4m0.b(ljs0.b(ljs0.c(c530Var, 1.0f), 0.0f, 24.0f, 1), ((el51) btsVar.m(gl51.a)).d(), cyk0.c(6.0f)), 8.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            f530 a = cj6.a.a(ljs0.c(c530Var, 1.0f), x4c.x);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new lhj(24);
                btsVar.o0(Q);
            }
            charSequence2 = charSequence;
            i3 = i;
            zgb1.a(charSequence2, fnq0.b(a, false, (tls) Q), i3, false, null, null, false, null, btsVar, (i4 & 14) | ((i4 << 3) & 896), 248);
            btsVar.t(true);
        } else {
            charSequence2 = charSequence;
            i3 = i;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cn1(i3, i2, charSequence2);
        }
    }

    public static final void c(List list, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-679923358);
        int i2 = (btsVar.e(list) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            jrq0 jrq0Var = (jrq0) a.S(0, list);
            final jrq0 jrq0Var2 = (jrq0) a.S(1, list);
            final jrq0 jrq0Var3 = (jrq0) a.S(2, list);
            web1.a(wwg.S(-1061706221, true, new loj(i4, jrq0Var), btsVar), wwg.S(-588187278, true, new wls() { // from class: arl
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    jrq0 jrq0Var4 = jrq0Var2;
                    jrq0 jrq0Var5 = jrq0Var3;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else if (jrq0Var5 == null) {
                                btsVar2.e0(779560240);
                                btsVar2.t(false);
                                break;
                            } else {
                                btsVar2.e0(1687710953);
                                if (jrq0Var4 == null) {
                                    btsVar2.e0(779431992);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(779431993);
                                    pj91.b(jrq0Var4.a, pj91.e(jrq0Var4.b), btsVar2, 0);
                                    btsVar2.t(false);
                                }
                                btsVar2.t(false);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else if (jrq0Var5 != null && jrq0Var4 == null) {
                                btsVar3.e0(-1585312514);
                                pj91.b(jrq0Var5.a, pj91.e(jrq0Var5.b), btsVar3, 0);
                                btsVar3.t(false);
                                break;
                            } else {
                                btsVar3.e0(-1585166566);
                                if (jrq0Var4 == null) {
                                    btsVar3.e0(-1585166567);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(-1585166566);
                                    pj91.b(jrq0Var4.a, pj91.e(jrq0Var4.b), btsVar3, 0);
                                    btsVar3.t(false);
                                }
                                btsVar3.t(false);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(-114668335, true, new wls() { // from class: arl
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    jrq0 jrq0Var4 = jrq0Var3;
                    jrq0 jrq0Var5 = jrq0Var2;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar2.Y();
                                break;
                            } else if (jrq0Var5 == null) {
                                btsVar2.e0(779560240);
                                btsVar2.t(false);
                                break;
                            } else {
                                btsVar2.e0(1687710953);
                                if (jrq0Var4 == null) {
                                    btsVar2.e0(779431992);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(779431993);
                                    pj91.b(jrq0Var4.a, pj91.e(jrq0Var4.b), btsVar2, 0);
                                    btsVar2.t(false);
                                }
                                btsVar2.t(false);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                btsVar3.Y();
                                break;
                            } else if (jrq0Var5 != null && jrq0Var4 == null) {
                                btsVar3.e0(-1585312514);
                                pj91.b(jrq0Var5.a, pj91.e(jrq0Var5.b), btsVar3, 0);
                                btsVar3.t(false);
                                break;
                            } else {
                                btsVar3.e0(-1585166566);
                                if (jrq0Var4 == null) {
                                    btsVar3.e0(-1585166567);
                                    btsVar3.t(false);
                                } else {
                                    btsVar3.e0(-1585166566);
                                    pj91.b(jrq0Var4.a, pj91.e(jrq0Var4.b), btsVar3, 0);
                                    btsVar3.t(false);
                                }
                                btsVar3.t(false);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), an91.m(ljs0.c(c530.a, 1.0f), 4.0f, 0.0f, 2), btsVar, 3510);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sn1(i, 8, list);
        }
    }

    public static final void d(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(310775005);
        int i2 = i | (btsVar.k(str) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.e(ljs0.c(c530Var, 1.0f), 24.0f), 8.0f, 0.0f, 2);
            a7u0 a7u0Var = gl51.a;
            f530 m2 = an91.m(m4m0.b(m, ((el51) btsVar.m(a7u0Var)).d(), cyk0.c(6.0f)), 8.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m2);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            f530 a = cj6.a.a(c530Var, x4c.x);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new lhj(23);
                btsVar.o0(Q);
            }
            ymb1.f(str, fnq0.b(a, false, (tls) Q), ((el51) btsVar.m(a7u0Var)).o(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65512);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 19);
        }
    }

    public static final int e(SeparateTitleModel$Align separateTitleModel$Align) {
        int i = brl.b[separateTitleModel$Align.ordinal()];
        if (i == 1) {
            return 8388611;
        }
        if (i == 2) {
            return 17;
        }
        if (i == 3) {
            return 8388613;
        }
        w511.b();
        return 0;
    }

    public static final Activity f(View view) {
        Context context = view.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            yhl.d(context, "Unknown view context ");
            return null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        yhl.d(context, "Unknown view context ");
        return null;
    }

    public static final Object g(x910 x910Var) {
        Object a = x910Var.a();
        k0y k0yVar = a instanceof k0y ? (k0y) a : null;
        if (k0yVar != null) {
            return k0yVar.a;
        }
        return null;
    }

    public static final f530 h(f530 f530Var, Object obj) {
        return f530Var.k(new j0y(obj));
    }

    public static final void i(int i, View view) {
        view.setContentDescription(view.getResources().getString(i));
    }

    public static void j(tt5 tt5Var, final o2c o2cVar) {
        xv10 xv10Var;
        rs10 ld2Var = (o2cVar == null || (xv10Var = o2cVar.a) == null) ? new ld2() : xv10Var.f();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", ld2Var, obj);
        if (o2cVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: esb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i2 = i;
                    o2c o2cVar2 = o2cVar;
                    switch (i2) {
                        case 0:
                            ClientCertRequest clientCertRequest = (ClientCertRequest) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest.cancel();
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
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest2.ignore();
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
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) list.get(0);
                            PrivateKey privateKey = (PrivateKey) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", ld2Var, obj);
        if (o2cVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: esb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i2;
                    o2c o2cVar2 = o2cVar;
                    switch (i22) {
                        case 0:
                            ClientCertRequest clientCertRequest = (ClientCertRequest) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest.cancel();
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
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest2.ignore();
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
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) list.get(0);
                            PrivateKey privateKey = (PrivateKey) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", ld2Var, obj);
        if (o2cVar == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: esb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    int i22 = i3;
                    o2c o2cVar2 = o2cVar;
                    switch (i22) {
                        case 0:
                            ClientCertRequest clientCertRequest = (ClientCertRequest) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest.cancel();
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
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) ((List) obj2).get(0);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest2.ignore();
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
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) list.get(0);
                            PrivateKey privateKey = (PrivateKey) list.get(1);
                            List list2 = (List) list.get(2);
                            try {
                                o2cVar2.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
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
