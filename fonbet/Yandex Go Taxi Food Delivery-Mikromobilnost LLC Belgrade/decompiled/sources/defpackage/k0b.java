package defpackage;

import android.os.Handler;
import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class k0b {
    public final b00 a;
    public final ChatRequest b;

    public k0b(b00 b00Var, ChatRequest chatRequest) {
        this.a = b00Var;
        this.b = chatRequest;
    }

    public final void a() {
        tje.e();
        b00 b00Var = this.a;
        ((Handler) b00Var.a.get()).post(new qz(b00Var, this.b, 1));
    }
}
