package xsna;

import androidx.health.platform.client.proto.GeneratedMessageLite;
import java.util.concurrent.ConcurrentHashMap;
import xsna.ij00;

/* compiled from: Protobuf.java */
/* loaded from: classes12.dex */
public final class s8e0 {
    public static final s8e0 c = new s8e0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ij00 a = new ij00();

    public final <T> androidx.health.platform.client.proto.w0<T> a(Class<T> cls) {
        androidx.health.platform.client.proto.w<?> wVar;
        androidx.health.platform.client.proto.w0<T> y;
        Class<?> cls2;
        androidx.health.platform.client.proto.b0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        androidx.health.platform.client.proto.w0<T> w0Var = (androidx.health.platform.client.proto.w0) concurrentHashMap.get(cls);
        if (w0Var != null) {
            return w0Var;
        }
        ij00 ij00Var = this.a;
        ij00Var.getClass();
        Class<?> cls3 = androidx.health.platform.client.proto.x0.a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = androidx.health.platform.client.proto.x0.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        y920 b = ij00Var.a.b(cls);
        if (b.a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                y = new androidx.health.platform.client.proto.k0<>(androidx.health.platform.client.proto.x0.c, bdq.a, b.b());
            } else {
                androidx.health.platform.client.proto.c1<?, ?> c1Var = androidx.health.platform.client.proto.x0.b;
                androidx.health.platform.client.proto.w<?> wVar2 = bdq.b;
                if (wVar2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                y = new androidx.health.platform.client.proto.k0<>(c1Var, wVar2, b.b());
            }
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            r760 r760Var = u760.b;
            androidx.health.platform.client.proto.d0 d0Var = mez.b;
            androidx.health.platform.client.proto.e1 e1Var = androidx.health.platform.client.proto.x0.c;
            androidx.health.platform.client.proto.x xVar = ij00.b.a[b.getSyntax().ordinal()] != 1 ? bdq.a : null;
            androidx.health.platform.client.proto.h0 h0Var = kl00.b;
            int[] iArr = androidx.health.platform.client.proto.j0.o;
            if (!(b instanceof jye0)) {
                throw null;
            }
            y = androidx.health.platform.client.proto.j0.y((jye0) b, r760Var, d0Var, e1Var, xVar, h0Var);
        } else {
            n760 n760Var = u760.a;
            kez kezVar = mez.a;
            androidx.health.platform.client.proto.c1<?, ?> c1Var2 = androidx.health.platform.client.proto.x0.b;
            if (ij00.b.a[b.getSyntax().ordinal()] != 1) {
                androidx.health.platform.client.proto.w<?> wVar3 = bdq.b;
                if (wVar3 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                wVar = wVar3;
            } else {
                wVar = null;
            }
            androidx.health.platform.client.proto.g0 g0Var = kl00.a;
            int[] iArr2 = androidx.health.platform.client.proto.j0.o;
            if (!(b instanceof jye0)) {
                throw null;
            }
            y = androidx.health.platform.client.proto.j0.y((jye0) b, n760Var, kezVar, c1Var2, wVar, g0Var);
        }
        androidx.health.platform.client.proto.w0<T> w0Var2 = (androidx.health.platform.client.proto.w0) concurrentHashMap.putIfAbsent(cls, y);
        return w0Var2 != null ? w0Var2 : y;
    }
}
