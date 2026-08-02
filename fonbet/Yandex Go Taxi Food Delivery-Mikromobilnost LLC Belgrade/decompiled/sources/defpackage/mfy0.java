package defpackage;

import com.yandex.div.json.ParsingException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class mfy0 implements ag90 {
    public final eg90 a;
    public final le7 b;
    public final le7 c;

    public mfy0(eg90 eg90Var, le7 le7Var) {
        this.a = eg90Var;
        this.b = le7Var;
        this.c = le7Var;
    }

    @Override // defpackage.yf90
    public final eg90 a() {
        return this.a;
    }

    @Override // defpackage.yf90
    public ofy0 b() {
        return this.c;
    }

    public abstract kfy0 d();

    public final void e(JSONObject jSONObject) {
        this.b.c(f(jSONObject).a);
    }

    public final lfy0 f(JSONObject jSONObject) {
        eg90 eg90Var = this.a;
        w53 w53Var = new w53();
        w53 w53Var2 = new w53();
        try {
            LinkedHashMap X = d6z.X(this, jSONObject);
            w53Var.putAll(this.b.a.a);
            va90 va90Var = new va90(w53Var);
            for (Map.Entry entry : X.entrySet()) {
                String str = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                try {
                    w53Var.put(str, d().a(new bg90(va90Var, new nfy0(eg90Var, str)), jSONObject.getJSONObject(str)));
                    if (!set.isEmpty()) {
                        w53Var2.put(str, set);
                    }
                } catch (ParsingException e) {
                    eg90Var.b(e, str);
                }
            }
        } catch (Exception e2) {
            eg90Var.a(e2);
        }
        return new lfy0(w53Var, w53Var2);
    }
}
