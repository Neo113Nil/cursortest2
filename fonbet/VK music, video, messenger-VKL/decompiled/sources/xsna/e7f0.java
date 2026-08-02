package xsna;

import androidx.health.platform.client.proto.l;
import androidx.health.platform.client.proto.n;
import androidx.health.platform.client.proto.r0;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: ReadDataRangeRequestToProto.kt */
/* loaded from: classes12.dex */
public final class e7f0 {
    public static final <T extends zef0> androidx.health.platform.client.proto.r0 a(j7f0<T> j7f0Var) {
        r0.a z = androidx.health.platform.client.proto.r0.z();
        dcy<T> dcyVar = j7f0Var.a;
        n.a w = androidx.health.platform.client.proto.n.w();
        String str = (String) whf0.b.get(dcyVar);
        if (str == null) {
            throw new UnsupportedOperationException("Not supported yet: " + dcyVar);
        }
        w.j();
        androidx.health.platform.client.proto.n.t((androidx.health.platform.client.proto.n) w.c, str);
        androidx.health.platform.client.proto.n e = w.e();
        z.j();
        androidx.health.platform.client.proto.r0.u((androidx.health.platform.client.proto.r0) z.c, e);
        androidx.health.platform.client.proto.b1 a = evo0.a(j7f0Var.b);
        z.j();
        androidx.health.platform.client.proto.r0.t((androidx.health.platform.client.proto.r0) z.c, a);
        Set<luk> set = j7f0Var.c;
        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
        for (luk lukVar : set) {
            l.a w2 = androidx.health.platform.client.proto.l.w();
            String str2 = lukVar.a;
            w2.j();
            androidx.health.platform.client.proto.l.t((androidx.health.platform.client.proto.l) w2.c, str2);
            arrayList.add(w2.e());
        }
        z.j();
        androidx.health.platform.client.proto.r0.v((androidx.health.platform.client.proto.r0) z.c, arrayList);
        boolean z2 = j7f0Var.d;
        z.j();
        androidx.health.platform.client.proto.r0.w((androidx.health.platform.client.proto.r0) z.c, z2);
        int i = j7f0Var.e;
        z.j();
        androidx.health.platform.client.proto.r0.x((androidx.health.platform.client.proto.r0) z.c, i);
        String str3 = j7f0Var.f;
        if (str3 != null) {
            z.j();
            androidx.health.platform.client.proto.r0.y((androidx.health.platform.client.proto.r0) z.c, str3);
        }
        return z.e();
    }
}
