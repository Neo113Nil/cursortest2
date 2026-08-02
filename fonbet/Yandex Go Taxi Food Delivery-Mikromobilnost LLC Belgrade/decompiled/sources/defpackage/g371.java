package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes7.dex */
public final class g371 {
    public final xz61 a = new xz61();

    public final boolean a(Context context, String str) {
        try {
            this.a.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(SelfTester_JCP.IMITA);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
