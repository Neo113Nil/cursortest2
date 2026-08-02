package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.yandex.messaging.sdk.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final class c220 {
    public final /* synthetic */ a a;

    public c220(a aVar) {
        this.a = aVar;
    }

    public final boolean a(Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.setFlags(SelfTester_JCP.IMITA);
            this.a.a.getApplicationContext().startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
