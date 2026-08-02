package defpackage;

import android.os.Looper;
import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class psa0 implements e1k {
    public final ChatRequest a;
    public i7b b;
    public v1b c;
    public final boolean w;
    public final /* synthetic */ rsa0 x;

    public psa0(rsa0 rsa0Var, gta0 gta0Var, ChatRequest chatRequest) {
        this.x = rsa0Var;
        this.a = chatRequest;
        z83.g(null, gta0Var.a, Looper.myLooper());
        this.c = new v1b(gta0Var, chatRequest, this);
        this.w = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v1b v1bVar = this.c;
        if (v1bVar != null) {
            v1bVar.close();
        }
        this.c = null;
    }
}
