package xsna;

import com.vk.newsfeed.api.data.NewsfeedList;
import xsna.ds60;
import xsna.r070;

/* compiled from: NewsfeedMainNotificationCenterListener.kt */
/* loaded from: classes4.dex */
public final class rt60 implements bd70<Object> {
    public final uv20 b;

    public rt60(uv20 uv20Var) {
        this.b = uv20Var;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        uv20 uv20Var = this.b;
        if (i == 106) {
            uv20Var.invoke(new r070.h.c(ds60.f.c.b));
        } else if (i == 108) {
            uv20Var.invoke(new r070.c(true, true));
        } else {
            if (i != 127) {
                return;
            }
            uv20Var.invoke(new r070.h.a((NewsfeedList) obj));
        }
    }
}
