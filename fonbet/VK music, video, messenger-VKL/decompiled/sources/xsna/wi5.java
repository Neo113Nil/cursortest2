package xsna;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes12.dex */
public final class wi5 implements mp70<t000> {
    public static final wi5 a = new wi5();
    public static final f7r b;
    public static final f7r c;

    static {
        com.google.firebase.encoders.proto.a b2 = com.google.firebase.encoders.proto.a.b();
        b2.a = 1;
        b = new f7r("logSource", sq.a(rq.f(Protobuf.class, b2.a())));
        com.google.firebase.encoders.proto.a b3 = com.google.firebase.encoders.proto.a.b();
        b3.a = 2;
        c = new f7r("logEventDropped", sq.a(rq.f(Protobuf.class, b3.a())));
    }

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        t000 t000Var = (t000) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, t000Var.a);
        np70Var2.add(c, t000Var.b);
    }
}
