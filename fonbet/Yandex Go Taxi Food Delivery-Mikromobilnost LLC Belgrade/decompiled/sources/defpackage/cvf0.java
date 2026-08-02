package defpackage;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.ProtoSyntax;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.p;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class cvf0 {
    public static final cvf0 c = new cvf0();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ue00 a = new ue00();

    public final rom0 a(Class cls) {
        rom0 B;
        Class cls2;
        qqw.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        rom0 rom0Var = (rom0) concurrentHashMap.get(cls);
        if (rom0Var != null) {
            return rom0Var;
        }
        ue00 ue00Var = this.a;
        ue00Var.getClass();
        Class cls3 = p.a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = p.a) != null && !cls2.isAssignableFrom(cls)) {
            ny61.g("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        t9i0 a = ue00Var.a.a(cls);
        if ((a.d & 2) == 2) {
            B = GeneratedMessageLite.class.isAssignableFrom(cls) ? o.k(p.d, vyo.a, a.a) : o.k(p.b, vyo.a(), a.a);
        } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            B = ((a.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3) == ProtoSyntax.PROTO2 ? n.B(a, u560.b, gry.b, p.d, vyo.a, ii00.b) : n.B(a, u560.b, gry.b, p.d, null, ii00.b);
        } else {
            B = ((a.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3) == ProtoSyntax.PROTO2 ? n.B(a, u560.a, gry.a, p.b, vyo.a(), ii00.a) : n.B(a, u560.a, gry.a, p.c, null, ii00.a);
        }
        rom0 rom0Var2 = (rom0) concurrentHashMap.putIfAbsent(cls, B);
        return rom0Var2 != null ? rom0Var2 : B;
    }
}
