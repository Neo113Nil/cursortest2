package defpackage;

import com.yandex.messaging.ChatRequest;

/* loaded from: classes15.dex */
public final class eb6 extends ky4 {
    public x08 A;
    public final Object y;
    public final String z;

    public eb6(ChatRequest chatRequest, Object obj, String str) {
        super(chatRequest);
        this.y = obj;
        this.z = str;
    }

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        super.b();
        x08 x08Var = this.A;
        if (x08Var != null) {
            x08Var.cancel();
            this.A = null;
        }
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        this.A = ((m8g) s020Var).c().a(this.y, this.z, new js4(13, this));
    }
}
