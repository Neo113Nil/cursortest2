package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class q0b0 extends rz4 {
    public final Context b;

    public q0b0(Context context) {
        super("permissions-settings");
        this.b = context;
    }

    @Override // defpackage.rz4
    public final syj0 c(Uri uri) {
        String queryParameter = uri.getQueryParameter("settings");
        if (queryParameter == null) {
            return new jyj0(new e1h("Missing settings parameter!"));
        }
        if (!queryParameter.equals("APP_NOTIFICATION_SETTINGS")) {
            return new jyj0(new e1h("Unknown settings parameter ".concat(queryParameter)));
        }
        Intent d = d("android.settings.APP_NOTIFICATION_SETTINGS");
        Context context = this.b;
        return doa1.f(yqb1.g(context, d) instanceof lyj0 ? q5z.N() : yqb1.g(context, d("android.settings.APPLICATION_DETAILS_SETTINGS")), uri);
    }

    public final Intent d(String str) {
        Intent intent = new Intent(str, Uri.parse("package:" + this.b.getPackageName()));
        intent.setFlags(SelfTester_JCP.IMITA);
        return intent;
    }
}
