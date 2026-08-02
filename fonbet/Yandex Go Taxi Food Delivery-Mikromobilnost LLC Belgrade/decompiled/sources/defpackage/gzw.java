package defpackage;

import com.yandex.messaging.ChatRequest;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class gzw {
    public final p4t a;
    public final nz01 b;
    public final boolean c;

    public gzw(p4t p4tVar, nz01 nz01Var, q6b q6bVar) {
        this.a = p4tVar;
        this.b = nz01Var;
        this.c = q6bVar.w && nz01Var.b.a(tz10.s);
    }

    public final tpr a(ChatRequest chatRequest) {
        int i = 2;
        if (!this.c) {
            return new g92(i, Boolean.FALSE);
        }
        if (chatRequest == null) {
            return new g92(i, Boolean.TRUE);
        }
        return e.t(new fzw(0, this.a.a(chatRequest), this));
    }
}
