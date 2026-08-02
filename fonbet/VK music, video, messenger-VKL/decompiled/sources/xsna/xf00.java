package xsna;

import android.content.Context;
import com.vk.dto.Push;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ru.mail.libverify.api.VerificationFactory;

/* compiled from: MainProcessPushCommandHandler.kt */
/* loaded from: classes6.dex */
public final class xf00 implements bhe0 {
    public final Context a;
    public final Executor b;
    public final xhe0 c;
    public final ui70 d;
    public final v801 e;

    public xf00(Context context, ExecutorService executorService, xhe0 xhe0Var, ui70 ui70Var, v801 v801Var) {
        this.a = context;
        this.b = executorService;
        this.c = xhe0Var;
        this.d = ui70Var;
        this.e = v801Var;
    }

    @Override // xsna.bhe0
    public final void a(String str) {
        L.e("[Push]: onNewToken");
        this.c.a(str);
        this.e.getClass();
        VerificationFactory.refreshGcmToken(this.a);
    }

    @Override // xsna.bhe0
    public final void b() {
        StringBuilder sb = new StringBuilder("[Push]: onDeletedMessages, longPollRunning=");
        ui70 ui70Var = this.d;
        sb.append(ui70Var.e());
        L.e(sb.toString());
        ui70Var.q();
        ui70Var.t(null);
    }

    @Override // xsna.bhe0
    public final void c(Push push, String str, String str2) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"[Push]: onMessageReceived " + str + ' ' + push.b.i() + ' ' + push.a()});
        }
        this.d.q();
        Map<String, String> map = push.a;
        this.e.getClass();
        VerificationFactory.deliverGcmMessageIntent(this.a, str, map);
        this.b.execute(new h9p(this, str2, push, 2));
    }
}
