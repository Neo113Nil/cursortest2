package xsna;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.ProtoSyntax;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Protobuf.java */
/* loaded from: classes.dex */
public final class t8e0 {
    public static final t8e0 c = new t8e0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final jj00 a = new jj00();

    public final <T> com.google.crypto.tink.shaded.protobuf.a0<T> a(Class<T> cls) {
        Class<?> cls2;
        com.google.crypto.tink.shaded.protobuf.q.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        com.google.crypto.tink.shaded.protobuf.a0<T> a0Var = (com.google.crypto.tink.shaded.protobuf.a0) concurrentHashMap.get(cls);
        if (a0Var == null) {
            jj00 jj00Var = this.a;
            jj00Var.getClass();
            Class<?> cls3 = com.google.crypto.tink.shaded.protobuf.b0.a;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = com.google.crypto.tink.shaded.protobuf.b0.a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            z920 b = jj00Var.a.b(cls);
            a0Var = b.a() ? GeneratedMessageLite.class.isAssignableFrom(cls) ? com.google.crypto.tink.shaded.protobuf.x.k(com.google.crypto.tink.shaded.protobuf.b0.d, cdq.b(), b.b()) : com.google.crypto.tink.shaded.protobuf.x.k(com.google.crypto.tink.shaded.protobuf.b0.b, cdq.a(), b.b()) : GeneratedMessageLite.class.isAssignableFrom(cls) ? b.getSyntax() == ProtoSyntax.PROTO2 ? com.google.crypto.tink.shaded.protobuf.w.y(b, v760.b, com.google.crypto.tink.shaded.protobuf.t.b, com.google.crypto.tink.shaded.protobuf.b0.d, cdq.b(), ll00.b) : com.google.crypto.tink.shaded.protobuf.w.y(b, v760.b, com.google.crypto.tink.shaded.protobuf.t.b, com.google.crypto.tink.shaded.protobuf.b0.d, null, ll00.b) : b.getSyntax() == ProtoSyntax.PROTO2 ? com.google.crypto.tink.shaded.protobuf.w.y(b, v760.a, com.google.crypto.tink.shaded.protobuf.t.a, com.google.crypto.tink.shaded.protobuf.b0.b, cdq.a(), ll00.a) : com.google.crypto.tink.shaded.protobuf.w.y(b, v760.a, com.google.crypto.tink.shaded.protobuf.t.a, com.google.crypto.tink.shaded.protobuf.b0.c, null, ll00.a);
            com.google.crypto.tink.shaded.protobuf.a0<T> a0Var2 = (com.google.crypto.tink.shaded.protobuf.a0) concurrentHashMap.putIfAbsent(cls, a0Var);
            if (a0Var2 != null) {
                return a0Var2;
            }
        }
        return a0Var;
    }
}
