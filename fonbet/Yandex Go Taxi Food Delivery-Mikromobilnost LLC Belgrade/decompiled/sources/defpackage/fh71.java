package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.monetization.ads.mediation.base.initialize.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;
import yads.at2;
import yads.bs2;
import yads.bt2;
import yads.ct2;
import yads.df;
import yads.dt2;
import yads.et2;
import yads.f1;
import yads.f5;
import yads.ft2;
import yads.gt2;
import yads.ht2;
import yads.jk3;
import yads.ly;
import yads.mv0;
import yads.nc;
import yads.o11;
import yads.pf1;
import yads.q63;
import yads.rg1;
import yads.s41;
import yads.tp0;
import yads.x3;
import yads.xo1;
import yads.xz;
import yads.yo;
import yads.yo1;
import yads.zu0;

/* loaded from: classes7.dex */
public final class fh71 {
    public static final Object w = new Object();
    public static volatile boolean x;
    public final Context a;
    public final v981 b;
    public final tse c;
    public final e971 d;
    public final k471 e;
    public final p671 f;
    public final a081 g;
    public final Context h;
    public final lm71 i;
    public final hy71 j;
    public final my61 k;
    public final dp81 l;
    public final fu81 m;
    public final hn71 n;
    public final gl o;
    public final js71 p;
    public final e471 q;
    public final j071 r;
    public final a s;
    public final cx71 t;
    public final q881 u;
    public final cf71 v;

    public fh71(Context context, v981 v981Var, ike ikeVar, e971 e971Var, k471 k471Var, p671 p671Var, int i) {
        k471 k471Var2;
        k471 k471Var3;
        if ((i & 16) != 0) {
            k471 k471Var4 = k471.d;
            if (k471Var4 == null) {
                synchronized (k471.e) {
                    k471Var3 = k471.d;
                    if (k471Var3 == null) {
                        k471Var3 = new k471(context.getApplicationContext());
                        k471.d = k471Var3;
                    }
                }
                k471Var2 = k471Var3;
            } else {
                k471Var2 = k471Var4;
            }
        } else {
            k471Var2 = k471Var;
        }
        p671 p671Var2 = (i & 32) != 0 ? new p671() : p671Var;
        a081 f = dha1.f();
        Context applicationContext = context.getApplicationContext();
        lm71 lm71Var = new lm71(1, k471Var2);
        hy71 hy71Var = new hy71();
        n291 n291Var = (n291) v981Var;
        Context context2 = n291Var.a;
        my61 my61Var = new my61(applicationContext, e971Var, p671Var2, k471Var2, wha1.c(context2, context2));
        dp81 dp81Var = new dp81(applicationContext, v981Var);
        fu81 fu81Var = new fu81();
        hn71 hn71Var = new hn71(applicationContext, 24);
        Context context3 = n291Var.a;
        ge71 c = wha1.c(context3, context3);
        Boolean bool = (Boolean) l581.a(context, rg1.j.b);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        gf71 gf71Var = new gf71();
        kj81 kj81Var = new kj81();
        sk71 sk71Var = new sk71(e971Var, 0);
        gl glVar = new gl();
        glVar.b = c;
        glVar.a = booleanValue;
        glVar.c = gf71Var;
        glVar.w = kj81Var;
        glVar.x = sk71Var;
        js71 js71Var = new js71();
        e471 e471Var = new e471(context, e971Var);
        j071 j071Var = new j071(context);
        a aVar = new a(v981Var);
        cx71 cx71Var = new cx71(applicationContext);
        q881 q881Var = new q881(applicationContext);
        this.a = context;
        this.b = v981Var;
        this.c = ikeVar;
        this.d = e971Var;
        this.e = k471Var2;
        this.f = p671Var2;
        this.g = f;
        this.h = applicationContext;
        this.i = lm71Var;
        this.j = hy71Var;
        this.k = my61Var;
        this.l = dp81Var;
        this.m = fu81Var;
        this.n = hn71Var;
        this.o = glVar;
        this.p = js71Var;
        this.q = e471Var;
        this.r = j071Var;
        this.s = aVar;
        this.t = cx71Var;
        this.u = q881Var;
        this.v = new cf71((Object) k471Var2.a, (Object) new e181(), false, 6);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(fh71 fh71Var, gg81 gg81Var, ContinuationImpl continuationImpl) {
        gt2 gt2Var;
        int i;
        fh71Var.getClass();
        if (continuationImpl instanceof gt2) {
            gt2Var = (gt2) continuationImpl;
            int i2 = gt2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gt2Var.d = i2 - Integer.MIN_VALUE;
                Object obj = gt2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gt2Var.d;
                if (i != 0) {
                    b.b(obj);
                    wg81 wg81Var = new wg81(gg81Var, new ht2(new jp71(fh71Var.h, fh71Var.b, fh71Var.c)));
                    gt2Var.d = 1;
                    if (wg81Var.a(gt2Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        gt2Var = new gt2(fh71Var, continuationImpl);
        Object obj2 = gt2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gt2Var.d;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ft2 ft2Var;
        int i;
        f5 f5Var;
        e971 e971Var;
        dj71 dj71Var;
        if (continuationImpl instanceof ft2) {
            ft2Var = (ft2) continuationImpl;
            int i2 = ft2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ft2Var.f = i2 - Integer.MIN_VALUE;
                Object obj = ft2Var.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ft2Var.f;
                if (i != 0) {
                    b.b(obj);
                    f5 f5Var2 = f5.d;
                    e971 e971Var2 = this.d;
                    e971Var2.b(f5Var2, null);
                    ft2Var.b = e971Var2;
                    ft2Var.c = f5Var2;
                    ft2Var.f = 1;
                    this.j.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(mdh.b, new nc(this.h, null), ft2Var);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f5Var = f5Var2;
                    obj = k0;
                    e971Var = e971Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f5Var = ft2Var.c;
                    e971Var = ft2Var.b;
                    b.b(obj);
                }
                dj71Var = (dj71) obj;
                if (dj71Var != null) {
                    vc71 vc71Var = dj71Var.a;
                    p671 p671Var = this.f;
                    p671Var.a = vc71Var;
                    p671Var.b = dj71Var.b;
                    p671Var.c = dj71Var.c;
                    p671Var.d = dj71Var.d;
                    if (vc71Var != null) {
                        this.e.a.e = true;
                    }
                }
                e971Var.a(f5Var);
                return zy11.a;
            }
        }
        ft2Var = new ft2(this, continuationImpl);
        Object obj2 = ft2Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ft2Var.f;
        if (i != 0) {
        }
        dj71Var = (dj71) obj2;
        if (dj71Var != null) {
        }
        e971Var.a(f5Var);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0502, code lost:
    
        if (r2 == r3) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0237, code lost:
    
        if (r1 != r3) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0539 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x072b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x06c4 A[Catch: all -> 0x06d2, LOOP:2: B:76:0x06be->B:78:0x06c4, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x06d2, blocks: (B:75:0x06b4, B:76:0x06be, B:78:0x06c4), top: B:74:0x06b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0701 A[Catch: all -> 0x0725, TryCatch #2 {all -> 0x0725, blocks: (B:55:0x0669, B:64:0x066f, B:67:0x0685, B:69:0x0691, B:102:0x0696, B:73:0x06af, B:80:0x06d2, B:83:0x06f9, B:85:0x0701, B:92:0x071d, B:87:0x0714), top: B:54:0x0669 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x071d A[Catch: all -> 0x0725, TRY_LEAVE, TryCatch #2 {all -> 0x0725, blocks: (B:55:0x0669, B:64:0x066f, B:67:0x0685, B:69:0x0691, B:102:0x0696, B:73:0x06af, B:80:0x06d2, B:83:0x06f9, B:85:0x0701, B:92:0x071d, B:87:0x0714), top: B:54:0x0669 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0718 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r32v0, types: [fh71] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38, types: [fse, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [int] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(s41 s41Var, ContinuationImpl continuationImpl) {
        at2 at2Var;
        int i;
        s41 s41Var2;
        e971 e971Var;
        gg81 a;
        cm61 cm61Var;
        int ordinal;
        l8x l8xVar;
        String a2;
        f5 f5Var;
        s41 s41Var3;
        l8x l8xVar2;
        String str;
        String str2;
        ty61 ty61Var;
        wn71 wn71Var;
        f5 f5Var2;
        e971 e971Var2;
        s41 s41Var4;
        boolean z;
        Object rj81Var;
        vz71 vz71Var;
        boolean z2;
        Integer valueOf;
        String str3;
        dp81 dp81Var;
        gg81 a3;
        Iterator it;
        Iterator it2;
        jj81 jj81Var;
        tp0 tp0Var;
        String optString;
        no61 no61Var;
        int length;
        ?? r9;
        f1 f1Var;
        Iterator<String> keys;
        yo yoVar;
        boolean z3;
        ?? r8;
        int i2;
        if (continuationImpl instanceof at2) {
            at2Var = (at2) continuationImpl;
            int i3 = at2Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                at2Var.h = i3 - Integer.MIN_VALUE;
                Object obj = at2Var.f;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = at2Var.h;
                if (i != 0) {
                    b.b(obj);
                    mv71 mv71Var = this.p.a;
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    bt2 bt2Var = new bt2(this, null);
                    at2Var.b = s41Var;
                    at2Var.h = 1;
                    if (tje.k0(mdhVar, bt2Var, at2Var) != coroutineSingletons) {
                        s41Var2 = s41Var;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    s41Var2 = (s41) at2Var.b;
                    b.b(obj);
                } else {
                    if (i == 2) {
                        l8xVar2 = at2Var.e;
                        f5Var = at2Var.d;
                        e971Var = at2Var.c;
                        s41Var3 = (s41) at2Var.b;
                        b.b(obj);
                        l8xVar = null;
                        at2Var.b = s41Var3;
                        at2Var.c = e971Var;
                        at2Var.d = f5Var;
                        at2Var.e = l8xVar;
                        at2Var.h = 3;
                        if (l8xVar2.u0(at2Var) != coroutineSingletons) {
                            f5Var2 = f5Var;
                            e971Var2 = e971Var;
                            s41Var4 = s41Var3;
                            at2Var.b = s41Var4;
                            at2Var.c = e971Var2;
                            at2Var.d = f5Var2;
                            at2Var.h = 4;
                            obj = d(s41Var4, at2Var);
                        }
                        return coroutineSingletons;
                    }
                    if (i == 3) {
                        f5Var2 = at2Var.d;
                        e971Var2 = at2Var.c;
                        s41 s41Var5 = (s41) at2Var.b;
                        b.b(obj);
                        s41Var4 = s41Var5;
                        at2Var.b = s41Var4;
                        at2Var.c = e971Var2;
                        at2Var.d = f5Var2;
                        at2Var.h = 4;
                        obj = d(s41Var4, at2Var);
                    } else {
                        if (i != 4) {
                            if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vz71Var = (vz71) at2Var.b;
                            b.b(obj);
                            z = false;
                            Context context = this.a;
                            gg81 gg81Var = ((vw71) vz71Var).a;
                            a aVar = this.s;
                            tse tseVar = this.c;
                            aVar.getClass();
                            yoVar = gg81Var.d0;
                            if (yoVar != null) {
                                if (gg81Var.b0) {
                                    r8 = 0;
                                    i2 = 3;
                                    tje.N(tseVar, null, null, new xo1(aVar, context, yoVar, null), 3);
                                } else {
                                    r8 = 0;
                                    i2 = 3;
                                }
                                if (gg81Var.c0) {
                                    tje.N(tseVar, r8, r8, new yo1(aVar, context, yoVar, r8), i2);
                                }
                            }
                            synchronized (w) {
                                if (x) {
                                    z3 = z;
                                } else {
                                    x = true;
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                tje.N(this.c, null, null, new ct2(this, vz71Var, null), 3);
                            }
                            rj81Var = new wm81(this.f, this.e.a);
                            dp81Var = this.l;
                            a3 = dp81Var.c.a(dp81Var.a);
                            if ((a3 == null ? a3.J : z) && !dp81.f.getAndSet(true)) {
                                hn71 hn71Var = dp81Var.e;
                                Set<String> keySet = ((SharedPreferences) ((pf1) hn71Var.b).d.getValue()).getAll().keySet();
                                ArrayList arrayList = new ArrayList();
                                it = keySet.iterator();
                                while (it.hasNext()) {
                                    String c = ((pf1) hn71Var.b).c((String) it.next());
                                    if (c != null) {
                                        arrayList.add(c);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    String str4 = (String) it2.next();
                                    ((om81) hn71Var.c).getClass();
                                    if (str4 != null) {
                                        JSONObject jSONObject = new JSONObject(str4);
                                        tq81 tq81Var = xz.c;
                                        String string = jSONObject.getString("ad_type");
                                        tq81Var.getClass();
                                        xz a4 = tq81.a(string);
                                        if (a4 != null) {
                                            long j = jSONObject.getLong("start_time");
                                            String optString2 = jSONObject.optString("false_click");
                                            if (optString2 == null) {
                                                tp0Var = null;
                                                HashMap hashMap = new HashMap();
                                                try {
                                                    JSONObject jSONObject2 = jSONObject.getJSONObject("report_data");
                                                    keys = jSONObject2.keys();
                                                    while (keys.hasNext()) {
                                                        String next = keys.next();
                                                        hashMap.put(next, jSONObject2.get(next));
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                                optString = jSONObject.optString("ab_experiments");
                                                if (optString != null) {
                                                    try {
                                                        JSONObject jSONObject3 = new JSONObject(optString);
                                                        no61Var = new no61(jSONObject3.getString("experiments"), mz61.a(jSONObject3.getJSONArray("test_ids")));
                                                    } catch (Throwable unused2) {
                                                    }
                                                    f1[] values = f1.values();
                                                    length = values.length;
                                                    r9 = z;
                                                    while (true) {
                                                        if (r9 >= length) {
                                                            f1Var = null;
                                                            break;
                                                        }
                                                        f1 f1Var2 = values[r9];
                                                        if (jl40.l(f1Var2.b, jSONObject.getString("type"))) {
                                                            f1Var = f1Var2;
                                                            break;
                                                        }
                                                        r9++;
                                                    }
                                                    if (f1Var != null) {
                                                        jj81Var = new jj81(a4, j, f1Var, tp0Var, hashMap, no61Var);
                                                        if (jj81Var == null) {
                                                            arrayList2.add(jj81Var);
                                                        }
                                                        z = false;
                                                    }
                                                }
                                                no61Var = null;
                                                f1[] values2 = f1.values();
                                                length = values2.length;
                                                r9 = z;
                                                while (true) {
                                                    if (r9 >= length) {
                                                    }
                                                    r9++;
                                                }
                                                if (f1Var != null) {
                                                }
                                            } else {
                                                JSONObject jSONObject4 = new JSONObject(optString2);
                                                tp0Var = new tp0(jSONObject4.getString("url"), jSONObject4.getLong("interval"));
                                                HashMap hashMap2 = new HashMap();
                                                JSONObject jSONObject22 = jSONObject.getJSONObject("report_data");
                                                keys = jSONObject22.keys();
                                                while (keys.hasNext()) {
                                                }
                                                optString = jSONObject.optString("ab_experiments");
                                                if (optString != null) {
                                                }
                                                no61Var = null;
                                                f1[] values22 = f1.values();
                                                length = values22.length;
                                                r9 = z;
                                                while (true) {
                                                    if (r9 >= length) {
                                                    }
                                                    r9++;
                                                }
                                                if (f1Var != null) {
                                                }
                                            }
                                        }
                                    }
                                    jj81Var = null;
                                    if (jj81Var == null) {
                                    }
                                    z = false;
                                }
                                for (jj81 jj81Var2 : kotlin.collections.a.J0(arrayList2)) {
                                    tp0 tp0Var2 = jj81Var2.d;
                                    if (tp0Var2 != null) {
                                        pb81 pb81Var = new pb81(dp81Var.a, new fe81(jj81Var2.a), dp81Var.b);
                                        long j2 = tp0Var2.c;
                                        if (j2 <= j2) {
                                            pb81Var.a(tp0Var2.b, q63.d, kotlin.collections.b.f());
                                        }
                                    }
                                    ((pf1) dp81Var.e.b).d(String.valueOf(jj81Var2.b));
                                    long currentTimeMillis = System.currentTimeMillis() - jj81Var2.b;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(jj81Var2.e);
                                    linkedHashMap.put("interval", hja1.a(currentTimeMillis));
                                    dp81Var.d.c(new zj71("returned_to_app", new LinkedHashMap(linkedHashMap), jj81Var2.f));
                                }
                                ((pf1) dp81Var.e.b).a();
                            }
                            return rj81Var;
                        }
                        f5Var2 = at2Var.d;
                        e971Var2 = at2Var.c;
                        s41Var4 = (s41) at2Var.b;
                        b.b(obj);
                        vz71 vz71Var2 = (vz71) obj;
                        e971Var2.a(f5Var2);
                        if (!(vz71Var2 instanceof vw71)) {
                            z = false;
                            if (!(vz71Var2 instanceof nt71)) {
                                w511.b();
                                return null;
                            }
                            fu81 fu81Var = this.m;
                            nt71 nt71Var = (nt71) vz71Var2;
                            jk3 jk3Var = nt71Var.a;
                            fu81Var.getClass();
                            dl61 b = jk3Var instanceof x3 ? l8a1.b(null, ((x3) jk3Var).c) : so61.b;
                            gl glVar = this.o;
                            ly lyVar = nt71Var.b;
                            ((ge71) glVar.b).c(new zj71("sdk_configuration_failure", new LinkedHashMap(kotlin.collections.b.i(new Pair("failure_reason", b.b), new Pair("call_source", s41Var4.b), new Pair("configuration_source", lyVar != null ? lyVar.b : null), new Pair("durations", ((sk71) glVar.x).a.a(j73.f0(new f5[]{f5.h, f5.i, f5.k, f5.j, f5.l, f5.m, f5.E}))), new Pair("kotlin_stdlib_version", KotlinVersion.CURRENT.toString()))), (no61) null));
                            rj81Var = new rj81(b);
                            dp81Var = this.l;
                            a3 = dp81Var.c.a(dp81Var.a);
                            if (a3 == null ? a3.J : z) {
                                hn71 hn71Var2 = dp81Var.e;
                                Set<String> keySet2 = ((SharedPreferences) ((pf1) hn71Var2.b).d.getValue()).getAll().keySet();
                                ArrayList arrayList3 = new ArrayList();
                                it = keySet2.iterator();
                                while (it.hasNext()) {
                                }
                                ArrayList arrayList22 = new ArrayList();
                                it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                }
                                while (r2.hasNext()) {
                                }
                                ((pf1) dp81Var.e.b).a();
                            }
                            return rj81Var;
                        }
                        gl glVar2 = this.o;
                        vw71 vw71Var = (vw71) vz71Var2;
                        gg81 gg81Var2 = vw71Var.a;
                        ly lyVar2 = vw71Var.b;
                        ge71 ge71Var = (ge71) glVar2.b;
                        ((gf71) glVar2.c).getClass();
                        Pair pair = new Pair("creation_date", Long.valueOf(System.currentTimeMillis()));
                        Pair pair2 = new Pair("startup_version", gg81Var2.e0);
                        Pair pair3 = new Pair("user_consent", gg81Var2.N);
                        Pair pair4 = new Pair("ad_host", gg81Var2.X);
                        kj81 kj81Var = (kj81) glVar2.w;
                        boolean z4 = glVar2.a;
                        kj81Var.getClass();
                        String str5 = z4 ? "ads-mediation" : "single";
                        ArrayList a5 = kj81Var.a.a(tka1.b());
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = a5.iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = it3;
                            Object next2 = it4.next();
                            if (kt71.a((iq71) next2)) {
                                arrayList4.add(next2);
                            }
                            it3 = it4;
                        }
                        Pair pair5 = new Pair("integration_type", str5);
                        ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                        for (Iterator it5 = arrayList4.iterator(); it5.hasNext(); it5 = it5) {
                            arrayList5.add(gw00.e(new Pair("name", ((iq71) it5.next()).a)));
                        }
                        ge71Var.c(new zj71("sdk_configuration_success", new LinkedHashMap(kotlin.collections.b.i(pair, pair2, pair3, pair4, new Pair("integrated_mediation", kotlin.collections.b.i(pair5, new Pair("networks", arrayList5))), new Pair("call_source", s41Var4.b), new Pair("configuration_source", lyVar2 != null ? lyVar2.b : null), new Pair("durations", ((sk71) glVar2.x).a.a(j73.f0(new f5[]{f5.h, f5.i, f5.k, f5.j, f5.l, f5.m, f5.E}))), new Pair("kotlin_stdlib_version", KotlinVersion.CURRENT.toString()))), (no61) null));
                        hn71 hn71Var3 = this.n;
                        cr71 cr71Var = (cr71) hn71Var3.c;
                        bi81 bi81Var = (bi81) cr71Var.b;
                        Context context2 = (Context) cr71Var.x;
                        bi81Var.getClass();
                        if (xga1.c(context2)) {
                            gg81 a6 = ((xo71) cr71Var.c).a.a((Context) cr71Var.x);
                            if (a6 != null && a6.r) {
                                ((dv71) cr71Var.w).getClass();
                                ArrayList m0 = kotlin.collections.a.m0(Collections.singletonList("Changelog: https://yandex.ru/dev/mobile-ads/doc/intro/changelog-android.html"), kotlin.collections.a.m0(scc.g("Learn more about the latest version of the SDK here:", "https://yandex.ru/dev/mobile-ads/doc/android/quick-start/android-ads-component.html"), dv71.a));
                                Iterator it6 = m0.iterator();
                                if (it6.hasNext()) {
                                    valueOf = Integer.valueOf(((String) it6.next()).length());
                                    while (it6.hasNext()) {
                                        Integer valueOf2 = Integer.valueOf(((String) it6.next()).length());
                                        if (valueOf.compareTo(valueOf2) < 0) {
                                            valueOf = valueOf2;
                                        }
                                    }
                                } else {
                                    valueOf = null;
                                }
                                if (valueOf != null) {
                                    int intValue = valueOf.intValue();
                                    String u = cvu0.u(intValue + 4, "*");
                                    ArrayList arrayList6 = new ArrayList(tcc.n(m0, 10));
                                    Iterator it7 = m0.iterator();
                                    while (it7.hasNext()) {
                                        String str6 = (String) it7.next();
                                        arrayList6.add("* " + str6 + cvu0.u(intValue - str6.length(), " ") + " *");
                                    }
                                    str3 = kotlin.collections.a.X(kotlin.collections.a.o0(kotlin.collections.a.m0(arrayList6, Collections.singletonList(u)), u), "\n", null, null, null, 62);
                                } else {
                                    str3 = null;
                                }
                                Log.e("Yandex Mobile Ads", "Yandex Mobile Ads version validation\n" + str3 + "\n");
                            }
                        }
                        hlx0 hlx0Var = (hlx0) hn71Var3.b;
                        bi81 bi81Var2 = (bi81) hlx0Var.w;
                        Context context3 = (Context) hlx0Var.y;
                        bi81Var2.getClass();
                        if (xga1.c(context3)) {
                            a081 a081Var = (a081) hlx0Var.c;
                            a081Var.getClass();
                            synchronized (a081.f) {
                                z2 = a081Var.e;
                            }
                            if (z2) {
                                gg81 a7 = ((qi71) hlx0Var.x).a.a((Context) hlx0Var.y);
                                if (a7 != null && a7.q) {
                                    hn71 hn71Var4 = (hn71) hlx0Var.b;
                                    ((Handler) hn71Var4.b).post(new jy31(28, hn71Var4));
                                }
                            }
                        }
                        z = false;
                        if (jn61.a.compareAndSet(false, true)) {
                            qc71.b("Yandex Mobile Ads 8.0.0-beta.1 initialized successfully", new Object[0]);
                        }
                        if (vw71Var.a.A) {
                            q881 q881Var = this.u;
                            at2Var.b = vz71Var2;
                            at2Var.c = null;
                            at2Var.d = null;
                            at2Var.h = 5;
                            Object a8 = q881Var.a(at2Var);
                            coroutineSingletons = coroutineSingletons;
                        }
                        vz71Var = vz71Var2;
                        Context context4 = this.a;
                        gg81 gg81Var3 = ((vw71) vz71Var).a;
                        a aVar2 = this.s;
                        tse tseVar2 = this.c;
                        aVar2.getClass();
                        yoVar = gg81Var3.d0;
                        if (yoVar != null) {
                        }
                        synchronized (w) {
                        }
                    }
                }
                gg81 a9 = this.g.a(this.h);
                boolean z5 = a9 == null && a9.B0;
                e971Var = this.d;
                f5 f5Var3 = f5.i;
                e971Var.b(f5Var3, null);
                this.r.a(this.h);
                Context context5 = this.h;
                Context context6 = ((n291) this.b).a;
                bm71.a(context5, wfa1.b(context6, new m771(context6)));
                Context context7 = this.h;
                Context context8 = ((n291) this.b).a;
                yc71.a(context7, wfa1.b(context8, new m771(context8)));
                if (Build.VERSION.SDK_INT >= 30) {
                    AtomicBoolean atomicBoolean = mj71.a;
                    Context context9 = this.a;
                    Context context10 = ((n291) this.b).a;
                    mj71.a(context9, wfa1.b(context10, new m771(context10)));
                }
                a = this.g.a(this.h);
                if (a != null && (ty61Var = a.J0) != null && (wn71Var = ty61Var.a) != null) {
                    cx71 cx71Var = this.t;
                    cx71Var.getClass();
                    tje.N(cx71Var.b, null, null, new mv0(cx71Var, scc.g(new ud71(zu0.b, wn71Var.b), new ud71(zu0.c, wn71Var.c), new ud71(zu0.d, wn71Var.d), new ud71(zu0.e, wn71Var.a)), null), 3);
                }
                pzt0 N = tje.N(this.c, null, null, new dt2(z5, this, null), 3);
                e971 e971Var3 = this.d;
                f5 f5Var4 = f5.h;
                e971Var3.b(f5Var4, null);
                fp71 fp71Var = ((k471) this.i.b).c;
                cm61Var = ((v371) fp71Var.b).d;
                if (cm61Var == null) {
                    r191 r191Var = (r191) fp71Var.a;
                    r191Var.getClass();
                    try {
                        str = r191Var.b.getUuid();
                    } catch (Throwable unused3) {
                        str = null;
                    }
                    r191 r191Var2 = (r191) fp71Var.a;
                    r191Var2.getClass();
                    try {
                        str2 = r191Var2.b.getDeviceId();
                    } catch (Throwable unused4) {
                        str2 = null;
                    }
                    cm61 cm61Var2 = new cm61(null, str2, str);
                    v371 v371Var = (v371) fp71Var.b;
                    tje.N(v371Var.c, null, null, new df(v371Var, (Context) fp71Var.x, null), 3);
                    cm61Var = cm61Var2;
                }
                String str7 = (String) fp71Var.w;
                o11 o11Var = (o11) fp71Var.c;
                cf71 cf71Var = this.v;
                Context context11 = this.h;
                cf71Var.getClass();
                e181 e181Var = (e181) cf71Var.c;
                ordinal = o11Var.ordinal();
                if (ordinal == 0) {
                    l8xVar = null;
                    if (ordinal != 1) {
                        w511.b();
                        return null;
                    }
                    a2 = cm61Var.a;
                    if (a2 == null) {
                        a2 = e181Var.a(context11);
                    }
                } else {
                    l8xVar = null;
                    a2 = e181Var.a(context11);
                }
                c171 c171Var = (c171) cf71Var.b;
                c171Var.d = a2;
                c171Var.a = cm61Var.b;
                String str8 = cm61Var.c;
                synchronized (c171.g) {
                    if (str8 != null) {
                        if (str8.length() != 0) {
                            c171Var.f = str8;
                        }
                    }
                }
                ((c171) cf71Var.b).c = str7;
                e971Var3.a(f5Var4);
                at2Var.b = s41Var2;
                at2Var.c = e971Var;
                at2Var.d = f5Var3;
                at2Var.e = N;
                at2Var.h = 2;
                if (b(at2Var) != coroutineSingletons) {
                    f5Var = f5Var3;
                    s41Var3 = s41Var2;
                    l8xVar2 = N;
                    at2Var.b = s41Var3;
                    at2Var.c = e971Var;
                    at2Var.d = f5Var;
                    at2Var.e = l8xVar;
                    at2Var.h = 3;
                    if (l8xVar2.u0(at2Var) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        at2Var = new at2(this, continuationImpl);
        Object obj2 = at2Var.f;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = at2Var.h;
        if (i != 0) {
        }
        gg81 a92 = this.g.a(this.h);
        if (a92 == null) {
        }
        e971Var = this.d;
        f5 f5Var32 = f5.i;
        e971Var.b(f5Var32, null);
        this.r.a(this.h);
        Context context52 = this.h;
        Context context62 = ((n291) this.b).a;
        bm71.a(context52, wfa1.b(context62, new m771(context62)));
        Context context72 = this.h;
        Context context82 = ((n291) this.b).a;
        yc71.a(context72, wfa1.b(context82, new m771(context82)));
        if (Build.VERSION.SDK_INT >= 30) {
        }
        a = this.g.a(this.h);
        if (a != null) {
            cx71 cx71Var2 = this.t;
            cx71Var2.getClass();
            tje.N(cx71Var2.b, null, null, new mv0(cx71Var2, scc.g(new ud71(zu0.b, wn71Var.b), new ud71(zu0.c, wn71Var.c), new ud71(zu0.d, wn71Var.d), new ud71(zu0.e, wn71Var.a)), null), 3);
        }
        pzt0 N2 = tje.N(this.c, null, null, new dt2(z5, this, null), 3);
        e971 e971Var32 = this.d;
        f5 f5Var42 = f5.h;
        e971Var32.b(f5Var42, null);
        fp71 fp71Var2 = ((k471) this.i.b).c;
        cm61Var = ((v371) fp71Var2.b).d;
        if (cm61Var == null) {
        }
        String str72 = (String) fp71Var2.w;
        o11 o11Var2 = (o11) fp71Var2.c;
        cf71 cf71Var2 = this.v;
        Context context112 = this.h;
        cf71Var2.getClass();
        e181 e181Var2 = (e181) cf71Var2.c;
        ordinal = o11Var2.ordinal();
        if (ordinal == 0) {
        }
        c171 c171Var2 = (c171) cf71Var2.b;
        c171Var2.d = a2;
        c171Var2.a = cm61Var.b;
        String str82 = cm61Var.c;
        synchronized (c171.g) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(s41 s41Var, ContinuationImpl continuationImpl) {
        et2 et2Var;
        int i;
        f5 f5Var;
        e971 e971Var;
        if (continuationImpl instanceof et2) {
            et2Var = (et2) continuationImpl;
            int i2 = et2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                et2Var.f = i2 - Integer.MIN_VALUE;
                Object obj = et2Var.d;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = et2Var.f;
                if (i != 0) {
                    b.b(obj);
                    f5 f5Var2 = f5.k;
                    e971 e971Var2 = this.d;
                    e971Var2.b(f5Var2, null);
                    et2Var.b = e971Var2;
                    et2Var.c = f5Var2;
                    et2Var.f = 1;
                    my61 my61Var = this.k;
                    my61Var.getClass();
                    sjh sjhVar = uyj.a;
                    Object k0 = tje.k0(mdh.b, new bs2(my61Var, s41Var, null), et2Var);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = k0;
                    f5Var = f5Var2;
                    e971Var = e971Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f5Var = et2Var.c;
                    e971Var = et2Var.b;
                    b.b(obj);
                }
                vz71 vz71Var = (vz71) obj;
                e971Var.a(f5Var);
                return vz71Var;
            }
        }
        et2Var = new et2(this, continuationImpl);
        Object obj2 = et2Var.d;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = et2Var.f;
        if (i != 0) {
        }
        vz71 vz71Var2 = (vz71) obj2;
        e971Var.a(f5Var);
        return vz71Var2;
    }
}
