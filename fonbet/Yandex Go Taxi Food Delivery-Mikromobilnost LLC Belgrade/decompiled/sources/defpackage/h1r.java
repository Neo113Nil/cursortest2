package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.f;

/* loaded from: classes15.dex */
public final class h1r extends ky4 {
    public final boolean A;
    public final String y;
    public final String z;

    public h1r(ChatRequest chatRequest, String str, String str2) {
        super(chatRequest);
        this.y = str;
        this.z = str2;
        this.A = true;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        ((f) ((m8g) s020Var).d.L0.get()).e(this.z, this.y, this.A);
        h();
    }
}
