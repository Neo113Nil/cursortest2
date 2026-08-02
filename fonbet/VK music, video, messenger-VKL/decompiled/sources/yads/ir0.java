package yads;

import android.content.Context;
import com.ironsource.C4641xe;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ir0 {
    public final sh1 a;
    public final gr0 b;

    public ir0(Context context) {
        this(vh1.a(context, "FalseClickDataStorage"));
    }

    public final void a(long j) {
        ((uh1) this.a).d(String.valueOf(j));
    }

    public /* synthetic */ ir0(sh1 sh1Var) {
        this(sh1Var, new gr0());
    }

    public final void a(fr0 fr0Var) {
        String str;
        String valueOf = String.valueOf(fr0Var.b);
        gr0 gr0Var = this.b;
        gr0Var.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ad_type", fr0Var.a.b);
        jSONObject.put("start_time", fr0Var.b);
        jSONObject.put("type", fr0Var.c.b);
        jr0 jr0Var = gr0Var.a;
        er0 er0Var = fr0Var.d;
        jr0Var.getClass();
        String str2 = null;
        if (er0Var != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interval", er0Var.c);
            jSONObject2.put("url", er0Var.b);
            str = jSONObject2.toString();
        } else {
            str = null;
        }
        jSONObject.put("false_click", str);
        jSONObject.put("report_data", new JSONObject(fr0Var.e));
        d dVar = gr0Var.b;
        c cVar = fr0Var.f;
        dVar.getClass();
        if (cVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(C4641xe.d, cVar.a);
            jSONObject3.put("test_ids", cVar.b);
            str2 = jSONObject3.toString();
        }
        jSONObject.put("ab_experiments", str2);
        ((uh1) this.a).a(valueOf, jSONObject.toString());
    }

    public ir0(sh1 sh1Var, gr0 gr0Var) {
        this.a = sh1Var;
        this.b = gr0Var;
    }
}
