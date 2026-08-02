package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;

/* compiled from: PhotosLinkProcessorDelegate.kt */
/* loaded from: classes11.dex */
public final class yca0 implements iaz {
    @Override // xsna.iaz
    public final boolean a(peq0 peq0Var) {
        return jh.h("/(tag)(\\d+)?", peq0Var, null, null, 14);
    }

    @Override // xsna.iaz
    public final boolean b(Context context, Uri uri, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var) {
        UserId c;
        try {
            c = new UserId(peq0Var.c(2));
        } catch (Throwable unused) {
            c = o25.a().c();
        }
        if (!fkq0.d(c)) {
            return true;
        }
        xg1 xg1Var = new xg1();
        xg1Var.B(c);
        xg1Var.z(-9000);
        xg1Var.k(context);
        return true;
    }
}
