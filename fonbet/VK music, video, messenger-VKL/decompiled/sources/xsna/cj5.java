package xsna;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes12.dex */
public final class cj5 implements mp70<svo0> {
    public static final cj5 a = new cj5();
    public static final f7r b;
    public static final f7r c;

    static {
        com.google.firebase.encoders.proto.a b2 = com.google.firebase.encoders.proto.a.b();
        b2.a = 1;
        b = new f7r("startMs", sq.a(rq.f(Protobuf.class, b2.a())));
        com.google.firebase.encoders.proto.a b3 = com.google.firebase.encoders.proto.a.b();
        b3.a = 2;
        c = new f7r("endMs", sq.a(rq.f(Protobuf.class, b3.a())));
    }

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        svo0 svo0Var = (svo0) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, svo0Var.a);
        np70Var2.add(c, svo0Var.b);
    }
}
