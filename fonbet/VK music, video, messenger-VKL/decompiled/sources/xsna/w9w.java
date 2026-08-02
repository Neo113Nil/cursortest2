package xsna;

import android.content.Context;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.log.L;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: ImNotificationHelper.kt */
/* loaded from: classes7.dex */
public final class w9w {
    public final a1w a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new t2l(this, 15));
    public final g9e0 c = new g9e0(new yce(this, 27));
    public final g9e0 d = new g9e0(new n7w(this, 1));
    public final g9e0 e = new g9e0(new z34(17));
    public final g9e0 f = new g9e0(new sfg(this, 24));
    public final g9e0 g = new g9e0(new m2j(this, 19));
    public static final /* synthetic */ qcy<Object>[] i = {new PropertyReference1Impl(w9w.class, "msgAddHandler", "getMsgAddHandler()Lcom/vkontakte/android/im/notifications/MsgAddHandler;", 0), b09.a(0, w9w.class, "msgFailedHandler", "getMsgFailedHandler()Lcom/vkontakte/android/im/notifications/MsgFailedHandler;", fpf0.a), new PropertyReference1Impl(w9w.class, "msgRemoveNotifyHandler", "getMsgRemoveNotifyHandler()Lcom/vkontakte/android/im/notifications/MsgRemoveNotifyHandler;", 0), new PropertyReference1Impl(w9w.class, "msgUpdateHandler", "getMsgUpdateHandler()Lcom/vkontakte/android/im/notifications/MsgUpdateHandler;", 0), new PropertyReference1Impl(w9w.class, "msgRequestHandler", "getMsgRequestHandler()Lcom/vkontakte/android/im/notifications/MsgRequestHandler;", 0)};
    public static final a h = new a();
    public static final bpn0 j = new bpn0(new re0(18));

    /* compiled from: ImNotificationHelper.kt */
    public static final class a {
    }

    public w9w(a1w a1wVar) {
        this.a = a1wVar;
    }

    public final synchronized void a(final int i2, Peer peer, Peer peer2) {
        g9e0 g9e0Var = this.f;
        qcy<Object> qcyVar = i[3];
        final h140 h140Var = (h140) g9e0Var.b();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        final Context context2 = context;
        final a1w a1wVar = this.a;
        final long j2 = peer.b;
        final long j3 = peer2.b;
        if (!h140Var.d) {
            h140Var.c.submit(new Runnable() { // from class: xsna.g140
                @Override // java.lang.Runnable
                public final void run() {
                    h140 h140Var2 = h140.this;
                    Context context3 = context2;
                    a1w a1wVar2 = a1wVar;
                    long j4 = j2;
                    long j5 = j3;
                    int i3 = i2;
                    if (h140Var2.d) {
                        return;
                    }
                    try {
                        h140Var2.a(context3, a1wVar2, j4, j5, i3);
                    } catch (Throwable th) {
                        L.E(th, new Object[0]);
                    }
                }
            });
        }
    }

    public final synchronized void b(long j2) {
        try {
            g9e0 g9e0Var = this.g;
            qcy<Object> qcyVar = i[4];
            wv30 wv30Var = (wv30) g9e0Var.b();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            wv30Var.b(context, j2, BuildInfo.t() && o25.b(o25.a()));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(long j2) {
        g9e0 g9e0Var = this.g;
        qcy<Object> qcyVar = i[4];
        wv30 wv30Var = (wv30) g9e0Var.b();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        io.reactivex.rxjava3.internal.operators.single.y c = wv30Var.c(j2);
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.b0 m = c.m(asu0.t());
        joc jocVar = new joc(1, wv30Var, context);
        int i2 = kwg0.a;
        wv30Var.c.b(m.subscribe(jocVar, new jwg0("[Push]")));
    }
}
