package xsna;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.concurrent.ConcurrentHashMap;
import xsna.hj00;

/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class v8e0 {
    public static final v8e0 c = new v8e0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final hj00 a = new hj00();

    public final <T> m8h0<T> a(Class<T> cls) {
        androidx.datastore.preferences.protobuf.k<?> kVar;
        m8h0<T> x;
        Class<?> cls2;
        androidx.datastore.preferences.protobuf.p.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        m8h0<T> m8h0Var = (m8h0) concurrentHashMap.get(cls);
        if (m8h0Var != null) {
            return m8h0Var;
        }
        hj00 hj00Var = this.a;
        hj00Var.getClass();
        Class<?> cls3 = androidx.datastore.preferences.protobuf.b0.a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = androidx.datastore.preferences.protobuf.b0.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        ba20 b = hj00Var.a.b(cls);
        if (b.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                x = androidx.datastore.preferences.protobuf.y.j(androidx.datastore.preferences.protobuf.b0.c, edq.a, b.b());
            } else {
                androidx.datastore.preferences.protobuf.e0<?, ?> e0Var = androidx.datastore.preferences.protobuf.b0.b;
                androidx.datastore.preferences.protobuf.k<?> kVar2 = edq.b;
                if (kVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x = androidx.datastore.preferences.protobuf.y.j(e0Var, kVar2, b.b());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            t760 t760Var = x760.b;
            androidx.datastore.preferences.protobuf.r rVar = nez.b;
            androidx.datastore.preferences.protobuf.g0 g0Var = androidx.datastore.preferences.protobuf.b0.c;
            androidx.datastore.preferences.protobuf.l lVar = hj00.b.a[b.getSyntax().ordinal()] != 1 ? edq.a : null;
            androidx.datastore.preferences.protobuf.v vVar = nl00.b;
            int[] iArr = androidx.datastore.preferences.protobuf.x.p;
            if (!(b instanceof mye0)) {
                throw null;
            }
            x = androidx.datastore.preferences.protobuf.x.x((mye0) b, t760Var, rVar, g0Var, lVar, vVar);
        } else {
            q760 q760Var = x760.a;
            lez lezVar = nez.a;
            androidx.datastore.preferences.protobuf.e0<?, ?> e0Var2 = androidx.datastore.preferences.protobuf.b0.b;
            if (hj00.b.a[b.getSyntax().ordinal()] != 1) {
                androidx.datastore.preferences.protobuf.k<?> kVar3 = edq.b;
                if (kVar3 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                kVar = kVar3;
            } else {
                kVar = null;
            }
            androidx.datastore.preferences.protobuf.u uVar = nl00.a;
            int[] iArr2 = androidx.datastore.preferences.protobuf.x.p;
            if (!(b instanceof mye0)) {
                throw null;
            }
            x = androidx.datastore.preferences.protobuf.x.x((mye0) b, q760Var, lezVar, e0Var2, kVar, uVar);
        }
        m8h0<T> m8h0Var2 = (m8h0) concurrentHashMap.putIfAbsent(cls, x);
        return m8h0Var2 != null ? m8h0Var2 : x;
    }
}
