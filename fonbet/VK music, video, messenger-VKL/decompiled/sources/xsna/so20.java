package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;

/* compiled from: MiniAppCallPiPOverlayLauncher.kt */
/* loaded from: classes7.dex */
public final class so20 {
    public final Context a;
    public final gvw0 b;

    /* compiled from: MiniAppCallPiPOverlayLauncher.kt */
    public static final class a {
        public final gzs<s3q0> a;
        public final drg b;

        public a(gzs gzsVar, drg drgVar) {
            this.a = gzsVar;
            this.b = drgVar;
        }
    }

    public so20(Context context) {
        this.a = context;
        this.b = new gvw0(context, null);
    }

    public final void a(a aVar) {
        int i = MiniAppCallPiPOverlayService.e;
        Context context = this.a;
        try {
            context.startService(new Intent(context, (Class<?>) MiniAppCallPiPOverlayService.class));
            gzs<s3q0> gzsVar = aVar.a;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
    }
}
