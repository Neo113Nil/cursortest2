package defpackage;

import android.content.Context;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.j72;
import yads.vl0;
import yads.xz;
import yads.yo;
import yads.z9;

/* loaded from: classes7.dex */
public final class pp81 {
    public final fe81 a;
    public final e171 b;
    public final rl61 c;
    public final to71 d;

    public pp81(fe81 fe81Var, v981 v981Var, yo yoVar) {
        e171 e171Var = new e171();
        rl61 rl61Var = new rl61(yoVar);
        to71 to71Var = new to71(new z581(fe81Var, v981Var, null));
        this.a = fe81Var;
        this.b = e171Var;
        this.c = rl61Var;
        this.d = to71Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        vl0 vl0Var;
        int i;
        Object obj;
        if (continuationImpl instanceof vl0) {
            vl0Var = (vl0) continuationImpl;
            int i2 = vl0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vl0Var.d = i2 - Integer.MIN_VALUE;
                Object obj2 = vl0Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vl0Var.d;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj2);
                        return b((JSONArray) obj2);
                    }
                    if (i == 2) {
                        b.b(obj2);
                        return b((JSONArray) obj2);
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj2);
                fe81 fe81Var = this.a;
                String str = fe81Var.c.a;
                Iterator it = this.c.a.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (jl40.l(((z9) obj).b, str)) {
                        break;
                    }
                }
                z9 z9Var = (z9) obj;
                if (z9Var != null) {
                    ArrayList arrayList = z9Var.c;
                    xz xzVar = fe81Var.a;
                    xz xzVar2 = xz.d;
                    to71 to71Var = this.d;
                    if (xzVar == xzVar2) {
                        a271 a271Var = fe81Var.d.a;
                        if (a271Var != null) {
                            vl0Var.d = 1;
                            to71Var.getClass();
                            sjh sjhVar = uyj.a;
                            obj2 = tje.k0(o400.a.x, new j72(to71Var, context, a271Var, arrayList, null), vl0Var);
                        }
                    } else {
                        vl0Var.d = 2;
                        to71Var.getClass();
                        sjh sjhVar2 = uyj.a;
                        obj2 = tje.k0(o400.a.x, new j72(to71Var, context, null, arrayList, null), vl0Var);
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        vl0Var = new vl0(this, continuationImpl);
        Object obj22 = vl0Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vl0Var.d;
        if (i == 0) {
        }
    }

    public final String b(JSONArray jSONArray) {
        Object failure;
        if (jSONArray != null && jSONArray.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("networks", jSONArray);
                e171 e171Var = this.b;
                String jSONObject2 = jSONObject.toString();
                e171Var.getClass();
                try {
                    failure = Base64.encodeToString(jSONObject2.getBytes(uza.a), 2);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                return (String) failure;
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
