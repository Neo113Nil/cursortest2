package yads;

import android.content.Context;
import com.ironsource.O6;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bdn;
import xsna.epx;
import xsna.ie00;
import xsna.myc0;
import xsna.spj;

/* loaded from: classes10.dex */
public final class dm0 {
    public final d4 a;
    public final jn b;
    public final ib c;
    public final aa2 d;

    public dm0(d4 d4Var, jn jnVar, ib ibVar, aa2 aa2Var) {
        this.a = d4Var;
        this.b = jnVar;
        this.c = ibVar;
        this.d = aa2Var;
    }

    public final String a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(O6.E1, jSONArray);
            jn jnVar = this.b;
            String jSONObject2 = jSONObject.toString();
            jnVar.getClass();
            return jn.a(jSONObject2);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, spj spjVar) {
        cm0 cm0Var;
        int i;
        Object obj;
        dm0 dm0Var;
        dm0 dm0Var2;
        if (spjVar instanceof cm0) {
            cm0Var = (cm0) spjVar;
            int i2 = cm0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cm0Var.e = i2 - Integer.MIN_VALUE;
                Object obj2 = cm0Var.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cm0Var.e;
                if (i == 0) {
                    if (i == 1) {
                        dm0Var2 = cm0Var.b;
                        kotlin.a.a(obj2);
                        return dm0Var2.a((JSONArray) obj2);
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dm0Var = cm0Var.b;
                    kotlin.a.a(obj2);
                    return dm0Var.a((JSONArray) obj2);
                }
                kotlin.a.a(obj2);
                String str = this.a.c.a;
                Iterator it = this.c.a.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((gb) obj).b, str)) {
                        break;
                    }
                }
                gb gbVar = (gb) obj;
                if (gbVar != null) {
                    List list = gbVar.c;
                    d4 d4Var = this.a;
                    if (d4Var.a == e00.d) {
                        e13 e13Var = d4Var.d.a;
                        if (e13Var != null) {
                            aa2 aa2Var = this.d;
                            cm0Var.b = this;
                            cm0Var.e = 1;
                            aa2Var.getClass();
                            bdn bdnVar = bdn.a;
                            obj2 = myc0.k(ie00.a.U(), new y92(aa2Var, context, e13Var, list, null), cm0Var);
                            if (obj2 != coroutineSingletons) {
                                dm0Var2 = this;
                                return dm0Var2.a((JSONArray) obj2);
                            }
                        }
                    } else {
                        aa2 aa2Var2 = this.d;
                        cm0Var.b = this;
                        cm0Var.e = 2;
                        aa2Var2.getClass();
                        bdn bdnVar2 = bdn.a;
                        obj2 = myc0.k(ie00.a.U(), new y92(aa2Var2, context, null, list, null), cm0Var);
                        if (obj2 != coroutineSingletons) {
                            dm0Var = this;
                            return dm0Var.a((JSONArray) obj2);
                        }
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        cm0Var = new cm0(this, spjVar);
        Object obj22 = cm0Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cm0Var.e;
        if (i == 0) {
        }
    }
}
