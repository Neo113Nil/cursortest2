package xsna;

import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes12.dex */
public final class ti5 implements mp70<nlc> {
    public static final ti5 a = new ti5();
    public static final f7r b;
    public static final f7r c;
    public static final f7r d;
    public static final f7r e;

    static {
        com.google.firebase.encoders.proto.a b2 = com.google.firebase.encoders.proto.a.b();
        b2.a = 1;
        b = new f7r("window", sq.a(rq.f(Protobuf.class, b2.a())));
        com.google.firebase.encoders.proto.a b3 = com.google.firebase.encoders.proto.a.b();
        b3.a = 2;
        c = new f7r("logSourceMetrics", sq.a(rq.f(Protobuf.class, b3.a())));
        com.google.firebase.encoders.proto.a b4 = com.google.firebase.encoders.proto.a.b();
        b4.a = 3;
        d = new f7r("globalMetrics", sq.a(rq.f(Protobuf.class, b4.a())));
        com.google.firebase.encoders.proto.a b5 = com.google.firebase.encoders.proto.a.b();
        b5.a = 4;
        e = new f7r("appNamespace", sq.a(rq.f(Protobuf.class, b5.a())));
    }

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        nlc nlcVar = (nlc) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, nlcVar.a);
        np70Var2.add(c, nlcVar.b);
        np70Var2.add(d, nlcVar.c);
        np70Var2.add(e, nlcVar.d);
    }
}
