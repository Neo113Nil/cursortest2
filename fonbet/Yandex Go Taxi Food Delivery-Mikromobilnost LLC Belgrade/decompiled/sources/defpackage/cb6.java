package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.MessageContext;
import io.appmetrica.analytics.BuildConfig;

/* loaded from: classes15.dex */
public final class cb6 {
    public final o1b0 a;
    public final n5t0 b;
    public final x22 c;
    public final JsonAdapter d;
    public final az10 e;

    public cb6(o1b0 o1b0Var, n5t0 n5t0Var, Moshi moshi, x22 x22Var, at2 at2Var) {
        this.a = o1b0Var;
        this.b = n5t0Var;
        this.c = x22Var;
        this.e = at2Var.B();
        this.d = moshi.adapter(Object.class);
    }

    public final x08 a(Object obj, String str, Runnable runnable) {
        return this.b.f(new ab6(this, obj, str, runnable, 0));
    }

    public final ClientMessage b(Object obj, String str) {
        MessageContext messageContext;
        o1b0 o1b0Var = this.a;
        String str2 = o1b0Var.b;
        if (str != null) {
            Long F = this.e.F(o1b0Var.a, str);
            messageContext = new MessageContext(str, F != null ? F.longValue() : 0L, null, null, 12, null);
        } else {
            messageContext = null;
        }
        return new ClientMessage(null, null, null, null, null, null, new BotRequest(str2, obj, null, messageContext, null, null, null, BuildConfig.API_LEVEL, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435391, null);
    }
}
