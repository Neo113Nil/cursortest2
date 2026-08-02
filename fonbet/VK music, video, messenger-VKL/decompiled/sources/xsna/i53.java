package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;

/* compiled from: AppHttpLinkProcessor.kt */
/* loaded from: classes11.dex */
public final class i53 implements iaz {
    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        return peq0.p(peq0Var, laz.b(), null, laz.d(), 10);
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        String a = peq0Var.a(1);
        Uri h = peq0Var.h();
        UserId.b bVar = UserId.c;
        com.vk.common.links.c.S(context, h, launchContext, a, yp80Var);
        return true;
    }
}
