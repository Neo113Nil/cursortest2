package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;

/* compiled from: PhotosLinkProcessorDelegate.kt */
/* loaded from: classes11.dex */
public final class yfa0 implements iaz {
    public final pga0 a;

    public yfa0(pga0 pga0Var) {
        this.a = pga0Var;
    }

    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        return jh.h("/(photos)([-\\d]+)?", peq0Var, null, null, 14);
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        UserId c;
        try {
            c = new UserId(peq0Var.c(2));
        } catch (Throwable unused) {
            c = o25.a().c();
        }
        if (epx.f(c, UserId.d)) {
            c = o25.a().c();
        }
        this.a.o(context, c);
        if (yp80Var == null) {
            return true;
        }
        yp80Var.onSuccess();
        return true;
    }
}
