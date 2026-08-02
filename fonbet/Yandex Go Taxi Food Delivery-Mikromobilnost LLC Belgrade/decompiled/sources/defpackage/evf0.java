package defpackage;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.m;
import com.google.protobuf.p;
import com.google.protobuf.q;
import com.google.protobuf.r;
import com.google.protobuf.s;
import com.google.protobuf.u;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class evf0 {
    public static final evf0 c = new evf0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ve00 a = new ve00();

    public final som0 a(Class cls) {
        syo syoVar;
        som0 A;
        rqw.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        som0 som0Var = (som0) concurrentHashMap.get(cls);
        if (som0Var != null) {
            return som0Var;
        }
        ve00 ve00Var = this.a;
        ve00Var.getClass();
        Class cls2 = r.a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            Class cls3 = g72.a;
            Class cls4 = r.a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                ny61.g("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        u9i0 a = ve00Var.a.a(cls);
        if ((a.d & 2) == 2) {
            Class cls5 = g72.a;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                A = q.k(r.c, wyo.a, a.a);
            } else {
                s sVar = r.b;
                syo syoVar2 = wyo.b;
                if (syoVar2 == null) {
                    ny61.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                A = q.k(sVar, syoVar2, a.a);
            }
        } else {
            Class cls6 = g72.a;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                s560 s560Var = v560.b;
                hry hryVar = jry.b;
                u uVar = r.c;
                m mVar = pe00.a[a.a().ordinal()] != 1 ? wyo.a : null;
                gi00 gi00Var = ji00.b;
                if (!(a instanceof u9i0)) {
                    int[] iArr = p.p;
                    ny61.u();
                    return null;
                }
                A = p.A(a, s560Var, hryVar, uVar, mVar, gi00Var);
            } else {
                s560 s560Var2 = v560.a;
                hry hryVar2 = jry.a;
                s sVar2 = r.b;
                if (pe00.a[a.a().ordinal()] != 1) {
                    syo syoVar3 = wyo.b;
                    if (syoVar3 == null) {
                        ny61.r("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    syoVar = syoVar3;
                } else {
                    syoVar = null;
                }
                gi00 gi00Var2 = ji00.a;
                if (!(a instanceof u9i0)) {
                    int[] iArr2 = p.p;
                    ny61.u();
                    return null;
                }
                A = p.A(a, s560Var2, hryVar2, sVar2, syoVar, gi00Var2);
            }
        }
        som0 som0Var2 = (som0) concurrentHashMap.putIfAbsent(cls, A);
        return som0Var2 != null ? som0Var2 : A;
    }
}
