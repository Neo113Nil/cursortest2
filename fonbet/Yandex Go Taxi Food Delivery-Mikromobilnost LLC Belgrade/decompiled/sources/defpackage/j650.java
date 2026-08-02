package defpackage;

import android.app.Application;
import android.content.Intent;
import com.yandex.go.navigator.notifications.NavigatorService;

/* loaded from: classes12.dex */
public final class j650 {
    public final Application a;
    public final ky2 b;
    public final md50 c;
    public final hit d;
    public final jgu0 e;
    public pzt0 f;

    public j650(Application application, ky2 ky2Var, md50 md50Var, hit hitVar, jgu0 jgu0Var) {
        this.a = application;
        this.b = ky2Var;
        this.c = md50Var;
        this.d = hitVar;
        this.e = jgu0Var;
    }

    public final void a(boolean z) {
        md50 md50Var = this.c;
        if (!z) {
            this.e.a(zy11.a);
            if (md50Var.c != null) {
                md50Var.a.c.i.a(172332, null);
            }
            md50Var.c = null;
            return;
        }
        if (md50Var.c == null) {
            md50Var.a();
            Application application = this.a;
            application.startForegroundService(new Intent(application, (Class<?>) NavigatorService.class).putExtra("NavigatorBackgroundServiceStateHolderNotificationId", 172332));
        }
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
    }
}
