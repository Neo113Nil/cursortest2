package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.f;

/* loaded from: classes15.dex */
public final class ozq extends ky4 {
    public final String y;
    public final String z;

    public ozq(ChatRequest chatRequest, String str, String str2) {
        super(chatRequest);
        this.y = str;
        this.z = str2;
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        f.g((f) ((m8g) s020Var).d.L0.get(), this.z, this.y);
        h();
    }
}
