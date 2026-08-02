package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.yandex.div.state.db.StateEntry;
import defpackage.a3z0;
import defpackage.an91;
import defpackage.aq5;
import defpackage.ays0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.dhj0;
import defpackage.did;
import defpackage.e2a1;
import defpackage.ed31;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.ger;
import defpackage.hk91;
import defpackage.k0v;
import defpackage.k3r;
import defpackage.k651;
import defpackage.kfd;
import defpackage.ldc;
import defpackage.lg6;
import defpackage.ljs0;
import defpackage.o341;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qab1;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.sls;
import defpackage.sm91;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tx40;
import defpackage.ubn;
import defpackage.up2;
import defpackage.vuz;
import defpackage.w8a1;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import io.flutter.plugins.camerax.CameraXError;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes11.dex */
public abstract class hk91 {
    public static final ohy a = new ohy(16.0f, 16.0f);
    public static final ohy b = new ohy(4.0f, 4.0f);

    public static final void a(final o341 o341Var, final tls tlsVar, final tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(621167154);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(o341Var) : btsVar.e(o341Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            rzo.b(null, "default", wwg.S(-1099495346, true, new wls() { // from class: com.yandex.go.walking.navigation.impl.guidance.f
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    float f;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                        fwi fwiVar = (fwi) btsVar2.m(j.h);
                        Object Q = btsVar2.Q();
                        Object obj3 = did.a;
                        if (Q == obj3) {
                            Q = zpn.j(EmptyCoroutineContext.a, btsVar2);
                            btsVar2.o0(Q);
                        }
                        final tse tseVar = (tse) Q;
                        btsVar2.e0(-53067017);
                        WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                        float w0 = fwiVar.w0(w8a1.f(vuz.o(btsVar2).e, btsVar2).a());
                        btsVar2.t(false);
                        Object obj4 = tls.this;
                        boolean k = btsVar2.k(obj4) | btsVar2.b(w0);
                        Object Q2 = btsVar2.Q();
                        if (k || Q2 == obj3) {
                            Q2 = new k0v(obj4, w0, 4);
                            btsVar2.o0(Q2);
                        }
                        zpn.i((sls) Q2, btsVar2);
                        float a2 = (((int) (((k651) btsVar2.m(j.u)).a() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - w0) - fwiVar.w0(72.0f);
                        Object Q3 = btsVar2.Q();
                        if (Q3 == obj3) {
                            Q3 = androidx.compose.runtime.f.f(a2);
                            btsVar2.o0(Q3);
                        }
                        tx40 tx40Var = (tx40) Q3;
                        Object Q4 = btsVar2.Q();
                        if (Q4 == obj3) {
                            Q4 = androidx.compose.runtime.f.j(Boolean.FALSE);
                            btsVar2.o0(Q4);
                        }
                        oz40 oz40Var = (oz40) Q4;
                        Object Q5 = btsVar2.Q();
                        if (Q5 == obj3) {
                            Q5 = androidx.compose.runtime.f.j(Boolean.TRUE);
                            btsVar2.o0(Q5);
                        }
                        oz40 oz40Var2 = (oz40) Q5;
                        final wg6 a3 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, sb2.K(300, 0, ubn.a, 2), false, null, null, null, null, btsVar2, 48, 0, 8157);
                        o341 o341Var2 = o341Var;
                        if (o341Var2.h) {
                            f = 72.0f;
                            btsVar2.e0(-1644217740);
                            btsVar2.t(false);
                        } else {
                            btsVar2.e0(-1644321528);
                            ger.a(a3, 72.0f, true, btsVar2, 432, 12);
                            f = 72.0f;
                            btsVar2.t(false);
                        }
                        lg6 c = qab1.c(a3, new up2(ldc.l), null, btsVar2, 432, 0);
                        int w02 = (int) fwiVar.w0(f);
                        boolean k2 = btsVar2.k(a3);
                        tls tlsVar3 = tlsVar;
                        boolean k3 = k2 | btsVar2.k(tlsVar3);
                        Object Q6 = btsVar2.Q();
                        if (k3 || Q6 == obj3) {
                            Q6 = new WalkNavGuidanceScreenKt$WalkNavGuidanceScreen$2$2$1(a3, tlsVar3, null);
                            btsVar2.o0(Q6);
                        }
                        zpn.e(btsVar2, (wls) Q6, a3);
                        boolean k4 = btsVar2.k(a3);
                        Object Q7 = btsVar2.Q();
                        if (k4 || Q7 == obj3) {
                            Q7 = new ed31(a3, 2);
                            btsVar2.o0(Q7);
                        }
                        sls slsVar = (sls) Q7;
                        boolean e = btsVar2.e(tseVar) | btsVar2.k(a3);
                        Object Q8 = btsVar2.Q();
                        if (e || Q8 == obj3) {
                            Q8 = new sls() { // from class: com.yandex.go.walking.navigation.impl.guidance.g
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    tje.N(tseVar, null, null, new WalkNavGuidanceScreenKt$WalkNavGuidanceScreen$2$4$1$1(a3, null), 3);
                                    return zy11.a;
                                }
                            };
                            btsVar2.o0(Q8);
                        }
                        hk91.b(w02, slsVar, (sls) Q8, btsVar2, 0);
                        k3r k3rVar = ljs0.c;
                        z910 d = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar2, k3rVar);
                        ohd.G1.getClass();
                        sls slsVar2 = androidx.compose.ui.node.d.b;
                        if (btsVar2.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar2);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
                        qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                        qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, androidx.compose.ui.node.d.h);
                        qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                        androidx.compose.runtime.internal.a S = wwg.S(1640752854, true, new a3z0(a2, oz40Var, tx40Var, oz40Var2, tlsVar3, o341Var2), btsVar2);
                        androidx.compose.runtime.internal.a S2 = wwg.S(954985236, true, new ays0(25, o341Var2, a3), btsVar2);
                        kfd.a.getClass();
                        com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a3, c, false, false, null, null, S, null, S2, kfd.b, wwg.S(1022478568, true, new dhj0(o341Var2, a3, tlsVar3, 20), btsVar2), btsVar2, 817889280, 54, 377);
                        if (((Boolean) oz40Var2.getValue()).booleanValue()) {
                            btsVar2.e0(-233901763);
                            f530 o2 = an91.o(cj6.a.a(c530.a, x4c.w), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                            Object Q9 = btsVar2.Q();
                            if (Q9 == obj3) {
                                Q9 = new aq5(tx40Var, 9);
                                btsVar2.o0(Q9);
                            }
                            e2a1.b(0, btsVar2, tlsVar3, sm91.d(o2, (tls) Q9));
                            btsVar2.t(false);
                        } else {
                            btsVar2.e0(-233597126);
                            btsVar2.t(false);
                        }
                        btsVar2.t(true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(o341Var, tlsVar, tlsVar2, i, 16);
        }
    }

    public static final void b(int i, sls slsVar, sls slsVar2, fid fidVar, int i2) {
        View view;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1434362877);
        int i3 = i2 | (btsVar.c(i) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            View view2 = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
            boolean e = ((i3 & 14) == 4) | ((i3 & 112) == 32) | btsVar.e(view2) | ((i3 & 896) == 256);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                view = view2;
                Q = new mt0(view, slsVar, i, slsVar2, 9);
                btsVar.o0(Q);
            } else {
                view = view2;
            }
            zpn.a(view, (tls) Q, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(i, slsVar, slsVar2, i2, 19);
        }
    }

    public static Bundle c(u1m u1mVar) {
        c cVar;
        Bundle bundle = new Bundle(3);
        bundle.putString(StateEntry.COLUMN_PATH, u1mVar.a);
        Map map = u1mVar.b;
        Bundle bundle2 = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            bundle2.putStringArray((String) entry.getKey(), (String[]) ((List) entry.getValue()).toArray(new String[0]));
        }
        bundle.putBundle("params", bundle2);
        Map map2 = u1mVar.c;
        String str = null;
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map2.size()));
            for (Map.Entry entry2 : map2.entrySet()) {
                linkedHashMap.put(entry2.getKey(), xw91.m(entry2.getValue()));
            }
            cVar = new c(linkedHashMap);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            rbx rbxVar = sbx.d;
            str = rbxVar.c(cVar, gtq0.H(rbxVar.b, qoi0.e(b.class)));
        }
        bundle.putString("body", str);
        return bundle;
    }

    public static void d(tt5 tt5Var, final n52 n52Var) {
        rs10 j = n52Var != null ? n52Var.a.j() : new bu7();
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.LiveData.observe", j, obj);
        if (n52Var != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: psb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    pey m;
                    List g2;
                    pbj pbjVar;
                    List g3;
                    int i2 = i;
                    n52 n52Var2 = n52Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj2;
                            fvy fvyVar = (fvy) list.get(0);
                            pq60 pq60Var = (pq60) list.get(1);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to observe a LiveData instance.");
                            }
                            fvyVar.a.f(m, pq60Var);
                            g = Collections.singletonList(null);
                            ce5Var.a(g);
                            return;
                        case 1:
                            fvy fvyVar2 = (fvy) ((List) obj2).get(0);
                            try {
                                pbjVar = n52Var2.a;
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (pbjVar.m() == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to remove LiveData observers.");
                            }
                            fvyVar2.a.k(pbjVar.m());
                            g2 = Collections.singletonList(null);
                            ce5Var.a(g2);
                            return;
                        default:
                            fvy fvyVar3 = (fvy) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(fvyVar3.a.d());
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.LiveData.removeObservers", j, obj);
        if (n52Var != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: psb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    pey m;
                    List g2;
                    pbj pbjVar;
                    List g3;
                    int i22 = i2;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            fvy fvyVar = (fvy) list.get(0);
                            pq60 pq60Var = (pq60) list.get(1);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to observe a LiveData instance.");
                            }
                            fvyVar.a.f(m, pq60Var);
                            g = Collections.singletonList(null);
                            ce5Var.a(g);
                            return;
                        case 1:
                            fvy fvyVar2 = (fvy) ((List) obj2).get(0);
                            try {
                                pbjVar = n52Var2.a;
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (pbjVar.m() == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to remove LiveData observers.");
                            }
                            fvyVar2.a.k(pbjVar.m());
                            g2 = Collections.singletonList(null);
                            ce5Var.a(g2);
                            return;
                        default:
                            fvy fvyVar3 = (fvy) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(fvyVar3.a.d());
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.camera_android_camerax.LiveData.getValue", j, obj);
        if (n52Var == null) {
            m2vVar3.G(null);
        } else {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: psb0
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    pey m;
                    List g2;
                    pbj pbjVar;
                    List g3;
                    int i22 = i3;
                    n52 n52Var2 = n52Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj2;
                            fvy fvyVar = (fvy) list.get(0);
                            pq60 pq60Var = (pq60) list.get(1);
                            try {
                                m = n52Var2.a.m();
                            } catch (Throwable th) {
                                if (th instanceof CameraXError) {
                                    CameraXError cameraXError = th;
                                    g = scc.g(cameraXError.getCode(), cameraXError.getMessage(), cameraXError.getDetails());
                                } else {
                                    g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            if (m == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to observe a LiveData instance.");
                            }
                            fvyVar.a.f(m, pq60Var);
                            g = Collections.singletonList(null);
                            ce5Var.a(g);
                            return;
                        case 1:
                            fvy fvyVar2 = (fvy) ((List) obj2).get(0);
                            try {
                                pbjVar = n52Var2.a;
                            } catch (Throwable th2) {
                                if (th2 instanceof CameraXError) {
                                    CameraXError cameraXError2 = th2;
                                    g2 = scc.g(cameraXError2.getCode(), cameraXError2.getMessage(), cameraXError2.getDetails());
                                } else {
                                    g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            if (pbjVar.m() == null) {
                                throw new IllegalStateException("LifecycleOwner must be set to remove LiveData observers.");
                            }
                            fvyVar2.a.k(pbjVar.m());
                            g2 = Collections.singletonList(null);
                            ce5Var.a(g2);
                            return;
                        default:
                            fvy fvyVar3 = (fvy) ((List) obj2).get(0);
                            try {
                                n52Var2.getClass();
                                g3 = Collections.singletonList(fvyVar3.a.d());
                            } catch (Throwable th3) {
                                if (th3 instanceof CameraXError) {
                                    CameraXError cameraXError3 = th3;
                                    g3 = scc.g(cameraXError3.getCode(), cameraXError3.getMessage(), cameraXError3.getDetails());
                                } else {
                                    g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            ce5Var.a(g3);
                            return;
                    }
                }
            });
        }
    }

    public static u1m e(Bundle bundle) {
        c cVar;
        String string = bundle.getString(StateEntry.COLUMN_PATH);
        if (string == null) {
            ny61.g("Path should not be null");
            return null;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            ny61.g("Params should not be null");
            return null;
        }
        String string2 = bundle.getString("body");
        if (string2 == null) {
            cVar = null;
        } else {
            rbx rbxVar = sbx.d;
            cVar = (c) rbxVar.b(gtq0.H(rbxVar.b, qoi0.c(c.class)), string2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle2.keySet()) {
            String[] stringArray = bundle2.getStringArray(str);
            linkedHashMap.put(str, stringArray != null ? j73.d0(stringArray) : EmptyList.a);
        }
        return new u1m(linkedHashMap, string, cVar != null ? kotlin.collections.b.r(kotlin.sequences.b.o(new h73(1, cVar.a.entrySet()), new wex())) : null);
    }
}
