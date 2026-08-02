package xsna;

import com.vk.dto.common.id.UserId;
import xsna.b25;

/* compiled from: DialogThemeCache.kt */
/* loaded from: classes2.dex */
public final class lkm implements b25.a {
    public UserId b;

    @Override // xsna.b25.a
    public final void d(tbu0 tbu0Var) {
        UserId a = tbu0Var.a.a();
        if (epx.f(this.b, a)) {
            return;
        }
        this.b = a;
        mkm.a.evictAll();
    }
}
