package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.f;

/* loaded from: classes15.dex */
public final class pyq extends ky4 {
    public final String y;

    public pyq(ChatRequest chatRequest, String str) {
        super(chatRequest);
        this.y = str;
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        if (!(hrVar instanceof nzq)) {
            return false;
        }
        nzq nzqVar = (nzq) hrVar;
        return nzqVar.w.equals(this.w) && this.y.equals(nzqVar.y);
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        ((f) ((m8g) s020Var).d.L0.get()).c(this.y);
        h();
    }
}
