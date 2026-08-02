package xsna;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes13.dex */
public final class xi5 implements mp70<MessagingClientEvent> {
    public static final xi5 a = new xi5();
    public static final f7r b;
    public static final f7r c;
    public static final f7r d;
    public static final f7r e;
    public static final f7r f;
    public static final f7r g;
    public static final f7r h;
    public static final f7r i;
    public static final f7r j;
    public static final f7r k;
    public static final f7r l;
    public static final f7r m;
    public static final f7r n;
    public static final f7r o;
    public static final f7r p;

    static {
        com.google.firebase.encoders.proto.a b2 = com.google.firebase.encoders.proto.a.b();
        b2.a = 1;
        b = new f7r("projectNumber", sq.a(rq.f(Protobuf.class, b2.a())));
        com.google.firebase.encoders.proto.a b3 = com.google.firebase.encoders.proto.a.b();
        b3.a = 2;
        c = new f7r("messageId", sq.a(rq.f(Protobuf.class, b3.a())));
        com.google.firebase.encoders.proto.a b4 = com.google.firebase.encoders.proto.a.b();
        b4.a = 3;
        d = new f7r("instanceId", sq.a(rq.f(Protobuf.class, b4.a())));
        com.google.firebase.encoders.proto.a b5 = com.google.firebase.encoders.proto.a.b();
        b5.a = 4;
        e = new f7r("messageType", sq.a(rq.f(Protobuf.class, b5.a())));
        com.google.firebase.encoders.proto.a b6 = com.google.firebase.encoders.proto.a.b();
        b6.a = 5;
        f = new f7r("sdkPlatform", sq.a(rq.f(Protobuf.class, b6.a())));
        com.google.firebase.encoders.proto.a b7 = com.google.firebase.encoders.proto.a.b();
        b7.a = 6;
        g = new f7r("packageName", sq.a(rq.f(Protobuf.class, b7.a())));
        com.google.firebase.encoders.proto.a b8 = com.google.firebase.encoders.proto.a.b();
        b8.a = 7;
        h = new f7r("collapseKey", sq.a(rq.f(Protobuf.class, b8.a())));
        com.google.firebase.encoders.proto.a b9 = com.google.firebase.encoders.proto.a.b();
        b9.a = 8;
        i = new f7r(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, sq.a(rq.f(Protobuf.class, b9.a())));
        com.google.firebase.encoders.proto.a b10 = com.google.firebase.encoders.proto.a.b();
        b10.a = 9;
        j = new f7r("ttl", sq.a(rq.f(Protobuf.class, b10.a())));
        com.google.firebase.encoders.proto.a b11 = com.google.firebase.encoders.proto.a.b();
        b11.a = 10;
        k = new f7r("topic", sq.a(rq.f(Protobuf.class, b11.a())));
        com.google.firebase.encoders.proto.a b12 = com.google.firebase.encoders.proto.a.b();
        b12.a = 11;
        l = new f7r("bulkId", sq.a(rq.f(Protobuf.class, b12.a())));
        com.google.firebase.encoders.proto.a b13 = com.google.firebase.encoders.proto.a.b();
        b13.a = 12;
        m = new f7r(NotificationCompat.CATEGORY_EVENT, sq.a(rq.f(Protobuf.class, b13.a())));
        com.google.firebase.encoders.proto.a b14 = com.google.firebase.encoders.proto.a.b();
        b14.a = 13;
        n = new f7r("analyticsLabel", sq.a(rq.f(Protobuf.class, b14.a())));
        com.google.firebase.encoders.proto.a b15 = com.google.firebase.encoders.proto.a.b();
        b15.a = 14;
        o = new f7r("campaignId", sq.a(rq.f(Protobuf.class, b15.a())));
        com.google.firebase.encoders.proto.a b16 = com.google.firebase.encoders.proto.a.b();
        b16.a = 15;
        p = new f7r("composerLabel", sq.a(rq.f(Protobuf.class, b16.a())));
    }

    @Override // xsna.wip
    public final void encode(Object obj, np70 np70Var) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        np70 np70Var2 = np70Var;
        np70Var2.add(b, messagingClientEvent.a);
        np70Var2.add(c, messagingClientEvent.b);
        np70Var2.add(d, messagingClientEvent.c);
        np70Var2.add(e, messagingClientEvent.d);
        np70Var2.add(f, messagingClientEvent.e);
        np70Var2.add(g, messagingClientEvent.f);
        np70Var2.add(h, messagingClientEvent.g);
        np70Var2.add(i, 0);
        np70Var2.add(j, messagingClientEvent.h);
        np70Var2.add(k, messagingClientEvent.i);
        np70Var2.add(l, 0L);
        np70Var2.add(m, messagingClientEvent.j);
        np70Var2.add(n, messagingClientEvent.k);
        np70Var2.add(o, 0L);
        np70Var2.add(p, messagingClientEvent.l);
    }
}
