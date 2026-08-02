package defpackage;

import android.content.Context;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.PushToken;
import java.util.UUID;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class e5g0 {
    public final o6v a;
    public final ew2 b;
    public final t6f0 c;
    public final r5j0 d;
    public final String e;
    public PushToken f;
    public final OkHttpClient g;
    public nci0 h;

    public e5g0(qh41 qh41Var) {
        Context context = qh41Var.a;
        MessengerParams messengerParams = qh41Var.g;
        this.a = (o6v) qh41Var.q.getValue();
        this.b = qh41Var.r;
        this.c = qh41Var.l;
        this.d = (r5j0) qh41Var.E.getValue();
        this.e = context.getPackageName();
        this.g = (OkHttpClient) qh41Var.j.getValue();
        t4j0 t4j0Var = new t4j0();
        t4j0Var.c.a("X-Request-Id", UUID.randomUUID().toString());
        t4j0Var.c.a("X-Application-Id", messengerParams.a());
        t4j0Var.h(messengerParams.e.c());
    }
}
