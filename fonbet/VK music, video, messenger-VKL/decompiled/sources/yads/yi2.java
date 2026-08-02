package yads;

import android.content.Context;
import com.ironsource.adapters.bigo.BigoConstants;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.bdn;
import xsna.drm0;
import xsna.e43;
import xsna.myc0;
import xsna.spj;
import xsna.wgl;
import xsna.zvj;

/* loaded from: classes10.dex */
public final class yi2 {
    public final nv a;
    public final mv b;
    public final sp1 c;
    public final ni2 d;
    public final oi2 e;

    public yi2(nv nvVar, mv mvVar, sp1 sp1Var, ni2 ni2Var, oi2 oi2Var) {
        this.a = nvVar;
        this.b = mvVar;
        this.c = sp1Var;
        this.d = ni2Var;
        this.e = oi2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (r0 != r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r0 == r11) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(long j, Context context, e00 e00Var, e13 e13Var, yi2 yi2Var, List list, spj spjVar) {
        vi2 vi2Var;
        yi2 yi2Var2;
        int i;
        yi2Var.getClass();
        if (spjVar instanceof vi2) {
            vi2Var = (vi2) spjVar;
            int i2 = vi2Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vi2Var.d = i2 - Integer.MIN_VALUE;
                yi2Var2 = yi2Var;
                Object obj = vi2Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vi2Var.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (list.isEmpty()) {
                        ai2 ai2Var = ai2.d;
                        return new ei2(Collections.singletonList(kr1.a()));
                    }
                    wi2 wi2Var = new wi2(j, context, e00Var, e13Var, yi2Var2, list, null);
                    vi2Var.d = 1;
                    obj = zvj.d(wi2Var, vi2Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        List list2 = (List) obj;
                        if (!list2.isEmpty()) {
                            return new ei2(list2);
                        }
                        ai2 ai2Var2 = ai2.d;
                        return new ei2(Collections.singletonList(kr1.a()));
                    }
                    kotlin.a.a(obj);
                }
                bdn bdnVar = bdn.a;
                wgl wglVar = wgl.c;
                xi2 xi2Var = new xi2((List) obj, null);
                vi2Var.d = 2;
                obj = myc0.k(wglVar, xi2Var, vi2Var);
            }
        }
        yi2Var2 = yi2Var;
        vi2Var = new vi2(yi2Var2, spjVar);
        Object obj2 = vi2Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vi2Var.d;
        if (i != 0) {
        }
        bdn bdnVar2 = bdn.a;
        wgl wglVar2 = wgl.c;
        xi2 xi2Var2 = new xi2((List) obj2, null);
        vi2Var.d = 2;
        obj2 = myc0.k(wglVar2, xi2Var2, vi2Var);
    }

    public /* synthetic */ yi2(yp1 yp1Var, nv nvVar) {
        this(nvVar, new mv(), new sp1(yp1Var), new ni2(), new oi2());
    }

    public static final void a(yi2 yi2Var, rr1 rr1Var) {
        yi2Var.getClass();
        if (drm0.D(rr1Var.b, BigoConstants.MEDIATION_NAME, true)) {
            List l = e43.l(MBridgeConstans.APP_KEY, "placement_name");
            ArrayList arrayList = new ArrayList();
            for (Object obj : l) {
                if (!rr1Var.c.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Required configuration parameters are missing");
            }
        }
    }
}
