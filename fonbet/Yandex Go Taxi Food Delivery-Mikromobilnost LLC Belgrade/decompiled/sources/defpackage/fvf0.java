package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.s;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class fvf0 {
    public static final fvf0 c = new fvf0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final we00 a = new we00();

    public final tom0 a(Class cls) {
        tyo tyoVar;
        tom0 w;
        Class cls2;
        tqw.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        tom0 tom0Var = (tom0) concurrentHashMap.get(cls);
        if (tom0Var != null) {
            return tom0Var;
        }
        we00 we00Var = this.a;
        we00Var.getClass();
        Class cls3 = p.a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = p.a) != null && !cls2.isAssignableFrom(cls)) {
            ny61.g("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        v9i0 a = we00Var.a.a(cls);
        if ((a.d & 2) == 2) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                w = o.j(p.c, xyo.a, a.a);
            } else {
                q qVar = p.b;
                tyo tyoVar2 = xyo.b;
                if (tyoVar2 == null) {
                    ny61.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                w = o.j(qVar, tyoVar2, a.a);
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            t560 t560Var = w560.b;
            iry iryVar = kry.b;
            s sVar = p.c;
            j jVar = qe00.a[a.a().ordinal()] != 1 ? xyo.a : null;
            hi00 hi00Var = ki00.b;
            if (!(a instanceof v9i0)) {
                int[] iArr = n.p;
                ny61.u();
                return null;
            }
            w = n.w(a, t560Var, iryVar, sVar, jVar, hi00Var);
        } else {
            t560 t560Var2 = w560.a;
            iry iryVar2 = kry.a;
            q qVar2 = p.b;
            if (qe00.a[a.a().ordinal()] != 1) {
                tyo tyoVar3 = xyo.b;
                if (tyoVar3 == null) {
                    ny61.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                tyoVar = tyoVar3;
            } else {
                tyoVar = null;
            }
            hi00 hi00Var2 = ki00.a;
            if (!(a instanceof v9i0)) {
                int[] iArr2 = n.p;
                ny61.u();
                return null;
            }
            w = n.w(a, t560Var2, iryVar2, qVar2, tyoVar, hi00Var2);
        }
        tom0 tom0Var2 = (tom0) concurrentHashMap.putIfAbsent(cls, w);
        return tom0Var2 != null ? tom0Var2 : w;
    }
}
