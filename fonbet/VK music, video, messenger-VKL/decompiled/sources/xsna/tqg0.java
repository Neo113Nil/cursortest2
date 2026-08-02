package xsna;

import com.vk.geo.impl.model.id.StringId;
import java.util.Collections;
import java.util.List;

/* compiled from: Rtree.kt */
/* loaded from: classes2.dex */
public final class tqg0 {
    public final s470<elb0> a;
    public final int b;
    public final xmj c;
    public final zk3<StringId, elb0> d;

    public tqg0(s470<elb0> s470Var, int i, xmj xmjVar, zk3<StringId, elb0> zk3Var) {
        this.a = s470Var;
        this.b = i;
        this.c = xmjVar;
        this.d = zk3Var;
    }

    public final tqg0 a(elb0 elb0Var) {
        String str = elb0Var.b;
        StringId stringId = new StringId(str);
        zk3<StringId, elb0> zk3Var = this.d;
        if (zk3Var.containsKey(stringId) && zk3Var.get(new StringId(str)) == elb0Var) {
            return this;
        }
        zk3 zk3Var2 = new zk3(zk3Var);
        zk3Var2.put(new StringId(str), elb0Var);
        int i = this.b;
        xmj xmjVar = this.c;
        s470<elb0> s470Var = this.a;
        if (s470Var == null) {
            return new tqg0(new xyy(Collections.singletonList(elb0Var), xmjVar), i + 1, xmjVar, zk3Var2);
        }
        List<s470<elb0>> a = s470Var.a(elb0Var);
        return new tqg0(a.size() == 1 ? (s470) j5g.Y(a) : new b670(a, xmjVar), i + 1, xmjVar, zk3Var2);
    }
}
