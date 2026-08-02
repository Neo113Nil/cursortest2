package xsna;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.k;
import java.util.concurrent.ConcurrentHashMap;
import xsna.kj00;

/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class u8e0 {
    public static final u8e0 c = new u8e0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final kj00 a = new kj00();

    public final <T> com.google.protobuf.v<T> a(Class<T> cls) {
        Class<?> cls2;
        Internal.checkNotNull(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        com.google.protobuf.v<T> vVar = (com.google.protobuf.v) concurrentHashMap.get(cls);
        if (vVar == null) {
            kj00 kj00Var = this.a;
            kj00Var.getClass();
            Class<?> cls3 = com.google.protobuf.w.a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = com.google.protobuf.w.a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            aa20 b = kj00Var.a.b(cls);
            if (b.a()) {
                if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                    vVar = com.google.protobuf.q.k(com.google.protobuf.w.c, ddq.a, b.b());
                } else {
                    com.google.protobuf.z<?, ?> zVar = com.google.protobuf.w.b;
                    com.google.protobuf.g<?> gVar = ddq.b;
                    if (gVar == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    vVar = com.google.protobuf.q.k(zVar, gVar, b.b());
                }
            } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                vVar = kj00.b.a[b.getSyntax().ordinal()] != 1 ? com.google.protobuf.p.B(b, w760.b, com.google.protobuf.k.b, com.google.protobuf.w.c, ddq.a, ml00.b) : com.google.protobuf.p.B(b, w760.b, com.google.protobuf.k.b, com.google.protobuf.w.c, null, ml00.b);
            } else if (kj00.b.a[b.getSyntax().ordinal()] != 1) {
                p760 p760Var = w760.a;
                k.a aVar = com.google.protobuf.k.a;
                com.google.protobuf.z<?, ?> zVar2 = com.google.protobuf.w.b;
                com.google.protobuf.g<?> gVar2 = ddq.b;
                if (gVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                vVar = com.google.protobuf.p.B(b, p760Var, aVar, zVar2, gVar2, ml00.a);
            } else {
                vVar = com.google.protobuf.p.B(b, w760.a, com.google.protobuf.k.a, com.google.protobuf.w.b, null, ml00.a);
            }
            Internal.checkNotNull(cls, "messageType");
            Internal.checkNotNull(vVar, "schema");
            com.google.protobuf.v<T> vVar2 = (com.google.protobuf.v) concurrentHashMap.putIfAbsent(cls, vVar);
            if (vVar2 != null) {
                return vVar2;
            }
        }
        return vVar;
    }

    public final <T> com.google.protobuf.v<T> b(T t) {
        return a(t.getClass());
    }
}
