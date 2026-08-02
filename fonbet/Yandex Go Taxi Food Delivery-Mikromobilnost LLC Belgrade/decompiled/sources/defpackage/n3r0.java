package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class n3r0 extends ky4 {
    public final abz0 y;
    public final boolean z;

    public n3r0(ChatRequest chatRequest, abz0 abz0Var, boolean z) {
        super(chatRequest);
        this.y = abz0Var;
        this.z = z;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        l020 C = ((k020) ((m8g) s020Var).c.H.get()).C();
        try {
            C.G(j3bVar.b, this.y.a, this.z);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
