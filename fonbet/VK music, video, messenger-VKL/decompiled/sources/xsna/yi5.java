package xsna;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes13.dex */
public final class yi5 implements mp70<dh20> {
    public static final yi5 a = new yi5();
    public static final f7r b;

    static {
        com.google.firebase.encoders.proto.a b2 = com.google.firebase.encoders.proto.a.b();
        b2.a = 1;
        b = new f7r("messagingClientEvent", sq.a(rq.f(Protobuf.class, b2.a())));
    }

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        np70Var.add(b, ((dh20) obj).a);
    }
}
