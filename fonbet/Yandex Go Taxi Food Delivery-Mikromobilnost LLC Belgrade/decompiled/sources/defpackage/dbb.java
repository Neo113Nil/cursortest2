package defpackage;

import android.os.SystemClock;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.analytics.b;

/* loaded from: classes15.dex */
public final class dbb {
    public final b a;
    public final ChatRequest b;

    public dbb(b bVar, ChatRequest chatRequest) {
        this.a = bVar;
        this.b = chatRequest;
    }

    public final void a(String str) {
        long elapsedRealtime;
        String uniqueRequestId = this.b.uniqueRequestId();
        b bVar = this.a;
        rcz0 rcz0Var = bVar.e;
        if (rcz0Var != null) {
            if (!rcz0Var.a.equals(uniqueRequestId) || !str.equals(l620.d.a)) {
                rcz0Var = null;
            }
            if (rcz0Var != null) {
                elapsedRealtime = rcz0Var.b;
                bVar.e = null;
                bVar.d = new tcz0(uniqueRequestId, str, elapsedRealtime);
            }
        }
        bVar.c.getClass();
        elapsedRealtime = SystemClock.elapsedRealtime();
        bVar.e = null;
        bVar.d = new tcz0(uniqueRequestId, str, elapsedRealtime);
    }
}
