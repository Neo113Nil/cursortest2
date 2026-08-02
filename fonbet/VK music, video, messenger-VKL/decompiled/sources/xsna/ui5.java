package xsna;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes12.dex */
public final class ui5 implements mp70<l1u> {
    public static final ui5 a = new ui5();
    public static final f7r b;

    static {
        com.google.firebase.encoders.proto.a b2 = com.google.firebase.encoders.proto.a.b();
        b2.a = 1;
        b = new f7r("storageMetrics", sq.a(rq.f(Protobuf.class, b2.a())));
    }

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        np70Var.add(b, ((l1u) obj).a);
    }
}
