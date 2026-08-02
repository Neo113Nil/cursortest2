package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.techprofile.logout.LogoutToken;
import com.yandex.messaging.techprofile.logout.a;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes15.dex */
public final class h5g0 {
    public final Handler a;
    public final SharedPreferences b;
    public final a c;
    public final JsonAdapter d;
    public nci0 e;

    public h5g0(Context context, a aVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = handler;
        this.b = context.getSharedPreferences("messenger_logout_tokens", 0);
        this.c = aVar;
        this.d = new Moshi.Builder().build().adapter(LogoutToken.class);
        handler.post(new oxe0(14, this));
    }

    public final void a(String str, String str2) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.a;
        if (myLooper != handler.getLooper()) {
            handler.post(new ud30(23, this, str, str2));
            return;
        }
        SharedPreferences sharedPreferences = this.b;
        Set<String> stringSet = sharedPreferences.getStringSet("logout_tokens", null);
        HashSet hashSet = new HashSet();
        if (stringSet != null) {
            hashSet.addAll(stringSet);
        }
        LogoutToken logoutToken = new LogoutToken();
        logoutToken.host = str;
        logoutToken.token = str2;
        hashSet.add(this.d.toJson(logoutToken));
        sharedPreferences.edit().putStringSet("logout_tokens", hashSet).apply();
        b();
    }

    public final void b() {
        String str = null;
        z83.g(null, this.a.getLooper(), Looper.myLooper());
        if (this.e != null) {
            return;
        }
        Set<String> stringSet = this.b.getStringSet("logout_tokens", null);
        if (stringSet != null && !stringSet.isEmpty()) {
            Iterator<String> it = stringSet.iterator();
            if (it.hasNext()) {
                str = it.next();
            }
        }
        if (str == null) {
            return;
        }
        try {
            LogoutToken logoutToken = (LogoutToken) this.d.fromJson(str);
            Objects.requireNonNull(logoutToken);
            this.e = this.c.a(logoutToken.host, logoutToken.token, new yxf0(this, str, false));
        } catch (IOException unused) {
            w511.q();
        }
    }
}
