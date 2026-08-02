package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes10.dex */
public final class jas0 {
    public final env0 a;
    public final HashSet b = new HashSet();
    public final HashSet c = new HashSet();
    public final n0 d = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public jas0(env0 env0Var) {
        this.a = env0Var;
    }

    public final Map a() {
        Map a = this.a.a();
        for (Map.Entry entry : a.entrySet()) {
            String str = (String) entry.getKey();
            fas0 fas0Var = (fas0) entry.getValue();
            if (this.b.contains(str)) {
                fas0Var.a--;
            }
        }
        return a;
    }

    public final void b(String str) {
        HashSet hashSet = this.b;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        env0 env0Var = this.a;
        env0Var.getClass();
        HashMap hashMap = new HashMap(env0Var.a());
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new fas0(0);
            hashMap.put(str, obj);
        }
        fas0 fas0Var = (fas0) obj;
        fas0Var.a++;
        hashMap.put(str, fas0Var);
        env0Var.b.setValue(env0Var, env0.c[0], ((xnt) env0Var.a).e(hashMap, env0.d));
    }

    public final void c(String str) {
        HashSet hashSet = this.c;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        env0 env0Var = this.a;
        env0Var.getClass();
        HashMap hashMap = new HashMap(env0Var.a());
        Object obj = hashMap.get(str);
        if (obj == null) {
            obj = new fas0(0);
            hashMap.put(str, obj);
        }
        fas0 fas0Var = (fas0) obj;
        fas0Var.b++;
        hashMap.put(str, fas0Var);
        env0Var.b.setValue(env0Var, env0.c[0], ((xnt) env0Var.a).e(hashMap, env0.d));
        this.d.g(zy11.a);
    }
}
