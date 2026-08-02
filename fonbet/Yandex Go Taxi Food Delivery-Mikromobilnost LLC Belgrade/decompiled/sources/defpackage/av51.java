package defpackage;

import android.net.Uri;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class av51 {
    public final o7r0 a;

    public av51(o7r0 o7r0Var) {
        this.a = o7r0Var;
    }

    public final void a(Uri uri, boolean z) {
        String path;
        String host = uri.getHost();
        String str = null;
        if (jl40.l(host, "go.yandex") && (path = uri.getPath()) != null) {
            str = gvu0.r0(1, path);
        }
        if (host == null) {
            host = "";
        }
        o7r0 o7r0Var = this.a;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, host);
        hashMap.put("handled", Boolean.valueOf(z));
        if (str != null) {
            hashMap.put(Constants.KEY_SERVICE, str);
        }
        o7r0Var.a.a("YandexBankScanner.Qr.Scanned", hashMap, 1, new HashMap());
    }
}
