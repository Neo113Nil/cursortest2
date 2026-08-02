package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.yandex.alicekit.core.permissions.b;

/* loaded from: classes15.dex */
public final class q0r {
    public final Context a;
    public final b b;
    public final k0b c;
    public final String d;
    public String e;
    public String f;

    public q0r(Context context, b bVar, k0b k0bVar, String str) {
        this.a = context;
        this.b = bVar;
        this.c = k0bVar;
        this.d = str;
    }

    public final void a(String str, String str2, yls ylsVar) {
        this.e = str;
        this.f = str2;
        Uri.Builder scheme = new Uri.Builder().scheme("content");
        Context context = this.a;
        Intent intent = (Intent) ylsVar.apply(scheme.authority(context.getPackageName() + context.getString(nyh0.file_provider_authority_suffix)).appendEncodedPath("shared_media").appendPath(this.d).appendPath(str).appendPath(str2).build());
        if (intent != null) {
            context.startActivity(intent);
        }
    }
}
