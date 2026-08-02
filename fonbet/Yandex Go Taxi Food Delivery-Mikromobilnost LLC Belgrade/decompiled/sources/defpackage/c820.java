package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.base.rights.ClientSupportedFeatureFlag;
import com.yandex.messaging.core.net.entities.proto.ClientTransportId;
import com.yandex.messaging.core.net.entities.proto.ClientTransportMessage;
import com.yandex.messaging.core.net.entities.proto.PostMessage;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes15.dex */
public final class c820 implements n5t0, zi3 {
    public final je51 A;
    public final xi3 B;
    public wl3 C;
    public bn3 D;
    public boolean E;
    public boolean F;
    public final /* synthetic */ fn6 G;
    public final n420 a;
    public final String b;
    public final Object c = new Object();
    public final Handler w = new Handler();
    public final JsonAdapter x;
    public final JsonAdapter y;
    public String z;

    public c820(fn6 fn6Var, n420 n420Var, String str, String str2) {
        this.G = fn6Var;
        this.a = n420Var;
        this.b = str;
        this.x = ((Moshi) fn6Var.k).adapter(ServerMessage.class).indent("  ");
        this.y = ((Moshi) fn6Var.k).adapter(PostMessage.class).indent("  ");
        ke51 ke51Var = (ke51) fn6Var.b;
        pe51 pe51Var = (pe51) fn6Var.e;
        jwu jwuVar = (jwu) pe51Var.a.c(pe51Var);
        String p = g8e.p(str, ":", str2);
        String str3 = ((rz10) fn6Var.g).c;
        String concat = str3 != null ? "android_".concat(str3) : ConstantDeviceInfo.APP_PLATFORM;
        String str4 = (String) fn6Var.a;
        ke51Var.getClass();
        jwuVar.c("v2/subscribe/websocket", false);
        jwuVar.d(Constants.KEY_SERVICE, p);
        jwuVar.d("client", concat);
        jwuVar.d("session", str4);
        this.A = new je51(ke51Var, this, jwuVar.e());
        this.B = ((yi3) fn6Var.c).c(this);
    }

    public static final void g(c820 c820Var) {
        if (c820Var.a.g()) {
            c820Var.w.postDelayed(new b820(c820Var, 0), c820Var.c, 600000L);
            return;
        }
        je51 je51Var = c820Var.A;
        z83.g(null, je51Var.c.getLooper(), Looper.myLooper());
        z83.c(null, je51Var.i);
        zj41 zj41Var = je51Var.h;
        if (zj41Var != null) {
            ((ydi0) zj41Var).c(1000, "bye");
        }
    }

    @Override // defpackage.n5t0
    public final x08 a(o5t0 o5t0Var, t1k0 t1k0Var) {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        z83.c(null, this.F);
        je51 je51Var = this.A;
        lg lgVar = new lg(o5t0Var, this.G, this);
        z83.g(null, je51Var.c.getLooper(), Looper.myLooper());
        z83.c(null, je51Var.i);
        int i = je51Var.f;
        je51Var.f = i + 1;
        ie51 ie51Var = new ie51(je51Var, i, lgVar, t1k0Var);
        synchronized (je51Var.d) {
            je51Var.d.d(i, ie51Var);
        }
        zj41 zj41Var = je51Var.h;
        if (zj41Var != null) {
            z83.g(null, ie51Var.w.getLooper(), Looper.myLooper());
            ie51Var.x = 0;
            ie51Var.b(zj41Var);
        }
        return ie51Var;
    }

    @Override // defpackage.zi3
    public final void b(cn3 cn3Var, wl3 wl3Var, boolean z) {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        z83.c(null, this.F);
        bn3 b = cn3Var.e() ? cn3Var.b() : null;
        this.D = b;
        this.C = wl3Var;
        if (b != null) {
            je51 je51Var = this.A;
            je51Var.c("Authorization restart");
            if (this.a.g()) {
                je51Var.e();
            }
        }
    }

    @Override // defpackage.n5t0
    public final void c() {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        z83.c(null, this.F);
        if (ydz.a.a()) {
            ydz.a();
        }
        this.A.c("Connection seems stuck");
    }

    @Override // defpackage.n5t0
    public final void close() {
        Handler handler = this.w;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        handler.removeCallbacksAndMessages(this.c);
        xi3 xi3Var = this.B;
        if (xi3Var != null) {
            xi3Var.close();
        }
        this.F = true;
        je51 je51Var = this.A;
        z83.g(null, je51Var.c.getLooper(), Looper.myLooper());
        je51Var.i = true;
        xd51 xd51Var = je51Var.g;
        if (xd51Var != null) {
            xd51Var.cancel();
        }
        je51Var.g = null;
        this.z = null;
    }

    @Override // defpackage.n5t0
    public final void d(ClientMessage clientMessage) {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        z83.c(null, this.F);
        PostMessage postMessage = (PostMessage) i(new PostMessage(clientMessage, ((rz10) this.G.g).b));
        String str = this.z;
        if (str != null) {
            postMessage.setClientTransportId(new ClientTransportId(str));
        }
        if (ydz.a.a()) {
            this.y.toJson(postMessage);
            ydz.a();
        }
        byte[] encode = ((ouf0) this.G.j).a(PostMessage.class).encode(postMessage);
        long e = drb1.e(encode.length, encode);
        yp6 yp6Var = new yp6();
        yp6Var.n0(j.c(4));
        yp6Var.q0(j.d(e));
        yp6Var.m968write(encode);
        je51 je51Var = this.A;
        zj41 zj41Var = je51Var.h;
        if (zj41Var != null) {
            int i = je51Var.f;
            je51Var.f = i + 1;
            je51.d(zj41Var, i, com.adjust.sdk.Constants.PUSH, yp6Var);
        } else {
            synchronized (je51Var.e) {
                je51Var.e.add(new he51(yp6Var));
            }
        }
    }

    @Override // defpackage.n5t0
    public final void e() {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        z83.c(null, this.F);
        this.A.e();
    }

    @Override // defpackage.n5t0
    public final String getProviderName() {
        return "xiva";
    }

    public final ServerMessage h(String str, String str2, yp6 yp6Var) {
        if (str.equals(this.b) && str2.equals(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
            int d2 = yp6Var.d2();
            long X = yp6Var.X();
            byte[] v = yp6Var.W().v();
            long e = drb1.e(v.length, v);
            if (d2 != 4 || e == X) {
                return (ServerMessage) ((ouf0) this.G.j).a(ServerMessage.class).decode(yp6Var);
            }
            if (ydz.a.a()) {
                ydz.a();
                return null;
            }
        }
        return null;
    }

    public final Object i(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (((l5o) ((h3y) this.G.l).get()).c) {
            arrayList.add(ClientSupportedFeatureFlag.EphemeralMessages);
        }
        if (!(obj instanceof ClientTransportMessage)) {
            return obj;
        }
        ClientTransportMessage clientTransportMessage = (ClientTransportMessage) obj;
        int i = 0;
        for (by4 by4Var : (by4[]) arrayList.toArray(new ClientSupportedFeatureFlag[0])) {
            i |= 1 << by4Var.getBitPosition();
        }
        return clientTransportMessage.withClientSupportedFeatures(i);
    }
}
