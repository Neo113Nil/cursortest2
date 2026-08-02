package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.vk.external.miniapp.net.app.WebApiApplication;
import kotlin.LazyThreadSafetyMode;
import xsna.ect;

/* compiled from: SuperAppMiniAppsImpl.kt */
/* loaded from: classes6.dex */
public final class ban0 implements aan0 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new jkg0(4));

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.aan0
    public final void a(WebApiApplication webApiApplication) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        Intent putExtra = new Intent("com.vkontakte.android.games.GAME_LOADED").putExtra("com.vkontakte.android.games.APPLICATION", chx0.b(webApiApplication));
        if (nax.a(putExtra) && !nax.c(putExtra) && Build.VERSION.SDK_INT >= 34) {
            putExtra.setPackage(context.getPackageName());
        }
        context.sendBroadcast(putExtra);
        ((lbt) this.a.getValue()).a(new ect.d(webApiApplication));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.aan0
    public final void b(long j) {
        ((lbt) this.a.getValue()).a(new ect.c());
    }
}
