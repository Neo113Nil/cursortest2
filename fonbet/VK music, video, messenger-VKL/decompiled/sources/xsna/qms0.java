package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import kotlin.Lazy;
import kotlin.Pair;

/* compiled from: VideoFromPlaylistLink.kt */
/* loaded from: classes14.dex */
public final class qms0 implements kss0 {
    public final Object a;

    public qms0(Lazy<? extends com.vk.video.ui.share.api.b> lazy) {
        this.a = lazy;
    }

    @Override // xsna.kss0
    public final boolean a(peq0 peq0Var) {
        return jh.h("/playlist/([-0-9]+)_([-0-9]+)/video([-0-9]+)_([-0-9]+)", peq0Var, null, null, 14);
    }

    @Override // xsna.kss0
    public final Boolean b(peq0 peq0Var, ydt0 ydt0Var, Context context, LaunchContext launchContext, yp80 yp80Var) {
        long c = peq0Var.c(1);
        gzs<s3q0> gzsVar = fkq0.a;
        UserId userId = new UserId(c);
        int b = peq0Var.b(2);
        UserId userId2 = new UserId(peq0Var.c(3));
        int b2 = peq0Var.b(4);
        Activity h = e3m.h(context);
        if (h != null && fkq0.c(userId) && fkq0.c(userId2)) {
            Pair pair = new Pair(userId2, Integer.valueOf(b2));
            w1s0.g(h, (UserId) pair.i(), ((Number) pair.j()).intValue(), null, false, false, false, new sub(h, new Pair(userId, Integer.valueOf(b)), yp80Var, 6), 224);
        } else if (yp80Var != null) {
            yp80Var.U();
        }
        return Boolean.TRUE;
    }
}
