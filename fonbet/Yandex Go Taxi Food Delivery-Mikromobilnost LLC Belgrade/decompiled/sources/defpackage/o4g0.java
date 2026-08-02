package defpackage;

import android.app.Application;
import android.content.Intent;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes10.dex */
public final class o4g0 {
    public final Application a;

    public o4g0(Application application) {
        this.a = application;
    }

    public final void a() {
        Intent addFlags = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(SelfTester_JCP.IMITA);
        Application application = this.a;
        application.startActivity(addFlags.putExtra("android.provider.extra.APP_PACKAGE", application.getPackageName()));
    }
}
