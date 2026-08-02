package yads;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.Ad;
import com.ironsource.O6;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.bdn;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.eyx;
import xsna.j5g;
import xsna.myc0;
import xsna.on00;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.yok0;
import xsna.yvj;

/* loaded from: classes10.dex */
public final class dw2 {
    public final Context a;
    public final ov2 b;
    public final yvj c;
    public final w5 d;
    public final mm0 e;
    public final rd f;
    public final hx2 g;
    public final Context h;
    public final d31 i;
    public final ae j;
    public final yu2 k;
    public final wh l;
    public final i4 m;
    public final rx2 n;
    public final fw2 o;
    public final df p;
    public final dj0 q;
    public final ue r;
    public final com.monetization.ads.mediation.base.initialize.a s;
    public final hx0 t;
    public final tf1 u;
    public final c31 v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ dw2(Context context, ov2 ov2Var, yvj yvjVar, w5 w5Var, mm0 mm0Var, rd rdVar, int i) {
        this(context, ov2Var, yvjVar, w5Var, r6, r7, r0, r8, new d31(r5), new ae(), new yu2(r8, r12.a(), r6, r7, w5Var), new wh(r8, ov2Var), new i4(), new rx2(r8), new fw2(r12.a(), ti1.c(context), w5Var), new df(), new dj0(context, w5Var), new ue(context), new com.monetization.ads.mediation.base.initialize.a(ov2Var), new hx0(r8), new qf1(r8));
        mm0 a = (i & 16) != 0 ? lm0.a(context) : mm0Var;
        rd rdVar2 = (i & 32) != 0 ? new rd() : rdVar;
        hx2 a2 = gx2.a();
        Context applicationContext = context.getApplicationContext();
        mv3 mv3Var = (mv3) ov2Var;
        rd rdVar3 = rdVar2;
        mm0 mm0Var2 = a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0352, code lost:
    
        if (r1 == r3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0201, code lost:
    
        if (r0 != r3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04d2 A[Catch: all -> 0x0471, TRY_LEAVE, TryCatch #1 {all -> 0x0471, blocks: (B:46:0x046d, B:55:0x0475, B:58:0x048a, B:60:0x049b, B:81:0x04a0, B:64:0x04b7, B:66:0x04d2), top: B:45:0x046d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04f1 A[Catch: all -> 0x04f7, TRY_LEAVE, TryCatch #5 {all -> 0x04f7, blocks: (B:69:0x04d8, B:76:0x04f1, B:71:0x04e6), top: B:68:0x04d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r15v12, types: [T, yads.tg] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [kotlin.coroutines.d, kotlinx.coroutines.CoroutineStart, xsna.spj] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t61 t61Var, spj spjVar) {
        yv2 yv2Var;
        int i;
        t61 t61Var2;
        dw2 dw2Var;
        qu2 a;
        int i2;
        CoroutineSingletons coroutineSingletons;
        ?? r15;
        eyx eyxVar;
        t61 t61Var3;
        dw2 dw2Var2;
        w5 w5Var;
        v5 v5Var;
        String str;
        String str2;
        ww0 ww0Var;
        ex0 ex0Var;
        v5 v5Var2;
        w5 w5Var2;
        t61 t61Var4;
        Object sv2Var;
        lv2 lv2Var;
        dw2 dw2Var3;
        qu2 a2;
        Object obj;
        fr0 fr0Var;
        er0 er0Var;
        int length;
        int i3;
        h1 h1Var;
        hp hpVar;
        ?? r7;
        int i4;
        if (spjVar instanceof yv2) {
            yv2Var = (yv2) spjVar;
            int i5 = yv2Var.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                yv2Var.i = i5 - Integer.MIN_VALUE;
                Object obj2 = yv2Var.g;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yv2Var.i;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    df dfVar = this.p;
                    dfVar.a.getClass();
                    int a3 = ef.a();
                    dfVar.a.getClass();
                    if (a3 < 21) {
                        h4 h4Var = new h4(m4.i, null);
                        this.m.getClass();
                        return new sv2(n4.a(null, h4Var.c));
                    }
                    bdn bdnVar = bdn.a;
                    wgl wglVar = wgl.c;
                    zv2 zv2Var = new zv2(this, null);
                    yv2Var.b = this;
                    yv2Var.c = t61Var;
                    yv2Var.i = 1;
                    if (myc0.k(wglVar, zv2Var, yv2Var) != coroutineSingletons2) {
                        t61Var2 = t61Var;
                        dw2Var = this;
                    }
                    return coroutineSingletons2;
                }
                if (i == 1) {
                    t61Var2 = (t61) yv2Var.c;
                    dw2Var = yv2Var.b;
                    kotlin.a.a(obj2);
                } else {
                    if (i == 2) {
                        eyxVar = yv2Var.f;
                        v5Var = yv2Var.e;
                        w5Var = yv2Var.d;
                        t61 t61Var5 = (t61) yv2Var.c;
                        dw2 dw2Var4 = yv2Var.b;
                        kotlin.a.a(obj2);
                        t61Var3 = t61Var5;
                        dw2Var2 = dw2Var4;
                        yv2Var.b = dw2Var2;
                        yv2Var.c = t61Var3;
                        yv2Var.d = w5Var;
                        yv2Var.e = v5Var;
                        yv2Var.f = null;
                        yv2Var.i = 3;
                        if (eyxVar.y(yv2Var) != coroutineSingletons2) {
                            v5Var2 = v5Var;
                            w5Var2 = w5Var;
                            t61Var4 = t61Var3;
                            yv2Var.b = dw2Var2;
                            yv2Var.c = t61Var4;
                            yv2Var.d = w5Var2;
                            yv2Var.e = v5Var2;
                            yv2Var.i = 4;
                            obj2 = dw2Var2.b(t61Var4, yv2Var);
                        }
                        return coroutineSingletons2;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            v5Var2 = yv2Var.e;
                            w5Var2 = yv2Var.d;
                            t61Var4 = (t61) yv2Var.c;
                            dw2 dw2Var5 = yv2Var.b;
                            kotlin.a.a(obj2);
                            dw2Var2 = dw2Var5;
                            lv2 lv2Var2 = (lv2) obj2;
                            w5Var2.a(v5Var2);
                            if (!(lv2Var2 instanceof kv2)) {
                                if (!(lv2Var2 instanceof jv2)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i4 i4Var = dw2Var2.m;
                                jv2 jv2Var = (jv2) lv2Var2;
                                mn3 mn3Var = jv2Var.a;
                                i4Var.getClass();
                                l4 a4 = mn3Var instanceof h4 ? n4.a(null, ((h4) mn3Var).c) : h9.b;
                                fw2 fw2Var = dw2Var2.o;
                                xy xyVar = jv2Var.b;
                                jp2 jp2Var = fw2Var.a;
                                dp2 dp2Var = dp2.c;
                                jp2Var.a(new fp2("sdk_configuration_failure", new LinkedHashMap(pn00.k(new Pair("failure_reason", a4.b), new Pair("call_source", t61Var4.b), new Pair("configuration_source", xyVar != null ? xyVar.b : null), new Pair("durations", fw2Var.e.a()))), null));
                                sv2Var = new sv2(a4);
                                wh whVar = dw2Var2.l;
                                a2 = whVar.c.a(whVar.a);
                                if (a2 != null) {
                                }
                                return sv2Var;
                            }
                            fw2 fw2Var2 = dw2Var2.o;
                            kv2 kv2Var = (kv2) lv2Var2;
                            qu2 qu2Var = kv2Var.a;
                            xy xyVar2 = kv2Var.b;
                            jp2 jp2Var2 = fw2Var2.a;
                            dp2 dp2Var2 = dp2.c;
                            fw2Var2.c.getClass();
                            Pair pair = new Pair("creation_date", Long.valueOf(System.currentTimeMillis()));
                            Pair pair2 = new Pair("startup_version", qu2Var.e0);
                            Pair pair3 = new Pair("user_consent", qu2Var.O);
                            Pair pair4 = new Pair("ad_host", qu2Var.X);
                            mr1 mr1Var = fw2Var2.d;
                            boolean z = fw2Var2.b;
                            mr1Var.getClass();
                            String str3 = z ? "ads-mediation" : Ad.d;
                            ArrayList a5 = mr1Var.b.a(nr1.a());
                            ArrayList arrayList = new ArrayList();
                            Iterator it = a5.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                Object next = it2.next();
                                Pair pair5 = pair3;
                                mr1Var.a.getClass();
                                if (ds1.a((cs1) next)) {
                                    arrayList.add(next);
                                }
                                it = it2;
                                pair3 = pair5;
                            }
                            Pair pair6 = pair3;
                            Pair pair7 = new Pair("integration_type", str3);
                            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(on00.f(new Pair("name", ((cs1) it3.next()).a)));
                                it3 = it3;
                                coroutineSingletons2 = coroutineSingletons2;
                            }
                            CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                            jp2Var2.a(new fp2("sdk_configuration_success", new LinkedHashMap(pn00.k(pair, pair2, pair6, pair4, new Pair("integrated_mediation", pn00.k(pair7, new Pair(O6.E1, arrayList2))), new Pair("call_source", t61Var4.b), new Pair("configuration_source", xyVar2 != null ? xyVar2.b : null), new Pair("durations", fw2Var2.e.a()))), null));
                            dw2Var2.n.a();
                            xv1.a();
                            if (kv2Var.a.B) {
                                tf1 tf1Var = dw2Var2.u;
                                yv2Var.b = dw2Var2;
                                yv2Var.c = lv2Var2;
                                yv2Var.d = null;
                                yv2Var.e = null;
                                yv2Var.i = 5;
                                Object a6 = ((qf1) tf1Var).a(yv2Var);
                                coroutineSingletons2 = coroutineSingletons3;
                            }
                            lv2Var = lv2Var2;
                            dw2Var3 = dw2Var2;
                            Context context = dw2Var3.a;
                            qu2 qu2Var2 = ((kv2) lv2Var).a;
                            com.monetization.ads.mediation.base.initialize.a aVar = dw2Var3.s;
                            yvj yvjVar = dw2Var3.c;
                            aVar.getClass();
                            hpVar = qu2Var2.d0;
                            if (hpVar != null) {
                            }
                            sv2Var = new tv2(dw2Var3.f, dw2Var3.e.a);
                            dw2Var2 = dw2Var3;
                            wh whVar2 = dw2Var2.l;
                            a2 = whVar2.c.a(whVar2.a);
                            if (a2 != null) {
                            }
                            return sv2Var;
                        }
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lv2Var = (lv2) yv2Var.c;
                        dw2Var3 = yv2Var.b;
                        kotlin.a.a(obj2);
                        Context context2 = dw2Var3.a;
                        qu2 qu2Var22 = ((kv2) lv2Var).a;
                        com.monetization.ads.mediation.base.initialize.a aVar2 = dw2Var3.s;
                        yvj yvjVar2 = dw2Var3.c;
                        aVar2.getClass();
                        hpVar = qu2Var22.d0;
                        if (hpVar != null) {
                            if (qu2Var22.b0) {
                                r7 = 0;
                                i4 = 3;
                                myc0.h(yvjVar2, null, null, new uq1(aVar2, context2, hpVar, null), 3);
                            } else {
                                r7 = 0;
                                i4 = 3;
                            }
                            if (qu2Var22.c0) {
                                myc0.h(yvjVar2, r7, r7, new vq1(aVar2, context2, hpVar, r7), i4);
                            }
                        }
                        sv2Var = new tv2(dw2Var3.f, dw2Var3.e.a);
                        dw2Var2 = dw2Var3;
                        wh whVar22 = dw2Var2.l;
                        a2 = whVar22.c.a(whVar22.a);
                        if (a2 != null || !a2.K || wh.f.getAndSet(true)) {
                            return sv2Var;
                        }
                        ir0 ir0Var = whVar22.e;
                        Set<String> keySet = ((SharedPreferences) ((uh1) ir0Var.a).d.getValue()).getAll().keySet();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator<T> it4 = keySet.iterator();
                        while (it4.hasNext()) {
                            String c = ((uh1) ir0Var.a).c((String) it4.next());
                            if (c != null) {
                                arrayList3.add(c);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it5 = arrayList3.iterator();
                        while (it5.hasNext()) {
                            String str4 = (String) it5.next();
                            gr0 gr0Var = ir0Var.b;
                            gr0Var.getClass();
                            if (str4 != null) {
                                JSONObject jSONObject = new JSONObject(str4);
                                d00 d00Var = e00.c;
                                String string = jSONObject.getString("ad_type");
                                d00Var.getClass();
                                e00 a7 = d00.a(string);
                                if (a7 != null) {
                                    long j = jSONObject.getLong("start_time");
                                    jr0 jr0Var = gr0Var.a;
                                    String optString = jSONObject.optString("false_click");
                                    jr0Var.getClass();
                                    if (optString == null) {
                                        er0Var = null;
                                        HashMap a8 = gr0.a(jSONObject);
                                        d dVar = gr0Var.b;
                                        String optString2 = jSONObject.optString("ab_experiments");
                                        dVar.getClass();
                                        c a9 = d.a(optString2);
                                        h1[] values = h1.values();
                                        length = values.length;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < length) {
                                                obj = sv2Var;
                                                h1Var = null;
                                                break;
                                            }
                                            h1 h1Var2 = values[i3];
                                            obj = sv2Var;
                                            try {
                                                if (epx.f(h1Var2.b, jSONObject.getString("type"))) {
                                                    h1Var = h1Var2;
                                                    break;
                                                }
                                                i3++;
                                                sv2Var = obj;
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        if (h1Var != null) {
                                            fr0Var = null;
                                            if (fr0Var != null) {
                                                arrayList4.add(fr0Var);
                                            }
                                            sv2Var = obj;
                                        } else {
                                            fr0Var = new fr0(a7, j, h1Var, er0Var, a8, a9);
                                            if (fr0Var != null) {
                                            }
                                            sv2Var = obj;
                                        }
                                    } else {
                                        JSONObject jSONObject2 = new JSONObject(optString);
                                        er0Var = new er0(jSONObject2.getString("url"), jSONObject2.getLong("interval"));
                                        HashMap a82 = gr0.a(jSONObject);
                                        d dVar2 = gr0Var.b;
                                        String optString22 = jSONObject.optString("ab_experiments");
                                        dVar2.getClass();
                                        c a92 = d.a(optString22);
                                        h1[] values2 = h1.values();
                                        length = values2.length;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < length) {
                                            }
                                            i3++;
                                            sv2Var = obj;
                                        }
                                        if (h1Var != null) {
                                        }
                                    }
                                }
                            }
                            obj = sv2Var;
                            fr0Var = null;
                            if (fr0Var != null) {
                            }
                            sv2Var = obj;
                        }
                        Object obj3 = sv2Var;
                        for (fr0 fr0Var2 : j5g.O0(arrayList4)) {
                            er0 er0Var2 = fr0Var2.d;
                            if (er0Var2 != null) {
                                za zaVar = new za(whVar22.a, whVar22.b, new d4(fr0Var2.a));
                                long j2 = er0Var2.c;
                                if (j2 <= j2) {
                                    za.a(zaVar, er0Var2.b, o93.e);
                                }
                            }
                            ((uh1) whVar22.e.a).d(String.valueOf(fr0Var2.b));
                            long currentTimeMillis = System.currentTimeMillis() - fr0Var2.b;
                            LinkedHashMap linkedHashMap = new LinkedHashMap(fr0Var2.e);
                            linkedHashMap.put("interval", ud1.a(currentTimeMillis));
                            dp2 dp2Var3 = dp2.c;
                            whVar22.d.a(new fp2("returned_to_app", new LinkedHashMap(linkedHashMap), fr0Var2.f));
                        }
                        ((uh1) whVar22.e.a).a();
                        return obj3;
                    }
                    v5Var2 = yv2Var.e;
                    w5 w5Var3 = yv2Var.d;
                    t61 t61Var6 = (t61) yv2Var.c;
                    dw2Var2 = yv2Var.b;
                    kotlin.a.a(obj2);
                    w5Var2 = w5Var3;
                    t61Var4 = t61Var6;
                    yv2Var.b = dw2Var2;
                    yv2Var.c = t61Var4;
                    yv2Var.d = w5Var2;
                    yv2Var.e = v5Var2;
                    yv2Var.i = 4;
                    obj2 = dw2Var2.b(t61Var4, yv2Var);
                }
                qu2 a10 = dw2Var.g.a(dw2Var.h);
                boolean z2 = a10 == null ? a10.B0 : false;
                w5 w5Var4 = dw2Var.d;
                v5 v5Var3 = v5.i;
                w5Var4.a(v5Var3, null);
                dw2Var.r.a(dw2Var.h);
                lb3.a(dw2Var.h, ((mv3) dw2Var.b).a());
                xf.a(dw2Var.h, ((mv3) dw2Var.b).a());
                AtomicBoolean atomicBoolean = ji.a;
                ji.a(dw2Var.a, ((mv3) dw2Var.b).a());
                a = dw2Var.g.a(dw2Var.h);
                if (a != null || (ww0Var = a.J0) == null || (ex0Var = ww0Var.a) == null) {
                    i2 = 3;
                } else {
                    hx0 hx0Var = dw2Var.t;
                    hx0Var.getClass();
                    List l = e43.l(new eo2(tw0.b, ex0Var.b), new eo2(tw0.c, ex0Var.c), new eo2(tw0.d, ex0Var.d), new eo2(tw0.e, ex0Var.a));
                    yvj yvjVar3 = hx0Var.b;
                    gx0 gx0Var = new gx0(hx0Var, l, null);
                    i2 = 3;
                    myc0.h(yvjVar3, null, null, gx0Var, 3);
                }
                yok0 h = myc0.h(dw2Var.c, null, null, new aw2(z2, dw2Var, null), i2);
                w5 w5Var5 = dw2Var.d;
                v5 v5Var4 = v5.h;
                w5Var5.a(v5Var4, null);
                e31 e31Var = (e31) dw2Var.i.a.b;
                e31Var.getClass();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                synchronized (e31.h) {
                    try {
                        tg tgVar = e31Var.e;
                        if (tgVar == null) {
                            fh fhVar = e31Var.a;
                            Context context3 = e31Var.d;
                            fhVar.getClass();
                            try {
                                str = AppMetrica.getUuid(context3);
                            } catch (Throwable unused2) {
                                str = null;
                            }
                            fh fhVar2 = e31Var.a;
                            Context context4 = e31Var.d;
                            fhVar2.getClass();
                            try {
                                str2 = AppMetrica.getDeviceId(context4);
                            } catch (Throwable unused3) {
                                str2 = null;
                            }
                            coroutineSingletons = coroutineSingletons2;
                            tg tgVar2 = new tg(null, str2, str);
                            e31Var.a();
                            r15 = tgVar2;
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            r15 = tgVar;
                        }
                        ref$ObjectRef.element = r15;
                        s3q0 s3q0Var = s3q0.a;
                    } finally {
                    }
                }
                dw2Var.v.a(dw2Var.h, new b31(r15, e31Var.g, e31Var.f));
                w5Var5.a(v5Var4);
                yv2Var.b = dw2Var;
                yv2Var.c = t61Var2;
                yv2Var.d = w5Var4;
                yv2Var.e = v5Var3;
                yv2Var.f = h;
                yv2Var.i = 2;
                coroutineSingletons2 = coroutineSingletons;
                if (dw2Var.a(yv2Var) != coroutineSingletons2) {
                    t61 t61Var7 = t61Var2;
                    eyxVar = h;
                    t61Var3 = t61Var7;
                    dw2Var2 = dw2Var;
                    w5Var = w5Var4;
                    v5Var = v5Var3;
                    yv2Var.b = dw2Var2;
                    yv2Var.c = t61Var3;
                    yv2Var.d = w5Var;
                    yv2Var.e = v5Var;
                    yv2Var.f = null;
                    yv2Var.i = 3;
                    if (eyxVar.y(yv2Var) != coroutineSingletons2) {
                    }
                }
                return coroutineSingletons2;
            }
        }
        yv2Var = new yv2(this, spjVar);
        Object obj22 = yv2Var.g;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yv2Var.i;
        if (i != 0) {
        }
        qu2 a102 = dw2Var.g.a(dw2Var.h);
        if (a102 == null) {
        }
        w5 w5Var42 = dw2Var.d;
        v5 v5Var32 = v5.i;
        w5Var42.a(v5Var32, null);
        dw2Var.r.a(dw2Var.h);
        lb3.a(dw2Var.h, ((mv3) dw2Var.b).a());
        xf.a(dw2Var.h, ((mv3) dw2Var.b).a());
        AtomicBoolean atomicBoolean2 = ji.a;
        ji.a(dw2Var.a, ((mv3) dw2Var.b).a());
        a = dw2Var.g.a(dw2Var.h);
        if (a != null) {
        }
        i2 = 3;
        yok0 h2 = myc0.h(dw2Var.c, null, null, new aw2(z2, dw2Var, null), i2);
        w5 w5Var52 = dw2Var.d;
        v5 v5Var42 = v5.h;
        w5Var52.a(v5Var42, null);
        e31 e31Var2 = (e31) dw2Var.i.a.b;
        e31Var2.getClass();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        synchronized (e31.h) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(t61 t61Var, spj spjVar) {
        bw2 bw2Var;
        int i;
        w5 w5Var;
        v5 v5Var;
        if (spjVar instanceof bw2) {
            bw2Var = (bw2) spjVar;
            int i2 = bw2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bw2Var.f = i2 - Integer.MIN_VALUE;
                Object obj = bw2Var.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bw2Var.f;
                if (i != 0) {
                    kotlin.a.a(obj);
                    w5 w5Var2 = this.d;
                    v5 v5Var2 = v5.k;
                    w5Var2.a(v5Var2, null);
                    yu2 yu2Var = this.k;
                    bw2Var.b = w5Var2;
                    bw2Var.c = v5Var2;
                    bw2Var.f = 1;
                    yu2Var.getClass();
                    bdn bdnVar = bdn.a;
                    Object k = myc0.k(wgl.c, new xu2(yu2Var, t61Var, null), bw2Var);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    w5Var = w5Var2;
                    obj = k;
                    v5Var = v5Var2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v5Var = bw2Var.c;
                    w5Var = bw2Var.b;
                    kotlin.a.a(obj);
                }
                lv2 lv2Var = (lv2) obj;
                w5Var.a(v5Var);
                return lv2Var;
            }
        }
        bw2Var = new bw2(this, spjVar);
        Object obj2 = bw2Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bw2Var.f;
        if (i != 0) {
        }
        lv2 lv2Var2 = (lv2) obj2;
        w5Var.a(v5Var);
        return lv2Var2;
    }

    public dw2(Context context, ov2 ov2Var, yvj yvjVar, w5 w5Var, mm0 mm0Var, rd rdVar, hx2 hx2Var, Context context2, d31 d31Var, ae aeVar, yu2 yu2Var, wh whVar, i4 i4Var, rx2 rx2Var, fw2 fw2Var, df dfVar, dj0 dj0Var, ue ueVar, com.monetization.ads.mediation.base.initialize.a aVar, hx0 hx0Var, tf1 tf1Var) {
        this.a = context;
        this.b = ov2Var;
        this.c = yvjVar;
        this.d = w5Var;
        this.e = mm0Var;
        this.f = rdVar;
        this.g = hx2Var;
        this.h = context2;
        this.i = d31Var;
        this.j = aeVar;
        this.k = yu2Var;
        this.l = whVar;
        this.m = i4Var;
        this.n = rx2Var;
        this.o = fw2Var;
        this.p = dfVar;
        this.q = dj0Var;
        this.r = ueVar;
        this.s = aVar;
        this.t = hx0Var;
        this.u = tf1Var;
        this.v = new c31(mm0Var.a(), new a5());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(spj spjVar) {
        cw2 cw2Var;
        int i;
        w5 w5Var;
        v5 v5Var;
        dw2 dw2Var;
        vd vdVar;
        if (spjVar instanceof cw2) {
            cw2Var = (cw2) spjVar;
            int i2 = cw2Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cw2Var.g = i2 - Integer.MIN_VALUE;
                Object obj = cw2Var.e;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cw2Var.g;
                if (i != 0) {
                    kotlin.a.a(obj);
                    w5Var = this.d;
                    v5 v5Var2 = v5.d;
                    w5Var.a(v5Var2, null);
                    ae aeVar = this.j;
                    Context context = this.h;
                    cw2Var.b = this;
                    cw2Var.c = w5Var;
                    cw2Var.d = v5Var2;
                    cw2Var.g = 1;
                    aeVar.getClass();
                    bdn bdnVar = bdn.a;
                    Object k = myc0.k(wgl.c, new zd(context, null), cw2Var);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    v5Var = v5Var2;
                    obj = k;
                    dw2Var = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v5Var = cw2Var.d;
                    w5Var = cw2Var.c;
                    dw2Var = cw2Var.b;
                    kotlin.a.a(obj);
                }
                vdVar = (vd) obj;
                if (vdVar != null) {
                    rd rdVar = dw2Var.f;
                    td tdVar = vdVar.a;
                    rdVar.a = tdVar;
                    rdVar.b = vdVar.b;
                    rdVar.c = vdVar.c;
                    rdVar.d = vdVar.d;
                    if (tdVar != null) {
                        dw2Var.e.a.f = true;
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                w5Var.a(v5Var);
                return s3q0Var;
            }
        }
        cw2Var = new cw2(this, spjVar);
        Object obj2 = cw2Var.e;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cw2Var.g;
        if (i != 0) {
        }
        vdVar = (vd) obj2;
        if (vdVar != null) {
        }
        s3q0 s3q0Var2 = s3q0.a;
        w5Var.a(v5Var);
        return s3q0Var2;
    }
}
