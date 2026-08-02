package xsna;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes12.dex */
public final class vi5 implements mp70<LogEventDropped> {
    public static final vi5 a = new vi5();
    public static final f7r b;
    public static final f7r c;

    static {
        com.google.firebase.encoders.proto.a b2 = com.google.firebase.encoders.proto.a.b();
        b2.a = 1;
        b = new f7r("eventsDroppedCount", sq.a(rq.f(Protobuf.class, b2.a())));
        com.google.firebase.encoders.proto.a b3 = com.google.firebase.encoders.proto.a.b();
        b3.a = 3;
        c = new f7r("reason", sq.a(rq.f(Protobuf.class, b3.a())));
    }

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, logEventDropped.a);
        np70Var2.add(c, logEventDropped.b);
    }
}
