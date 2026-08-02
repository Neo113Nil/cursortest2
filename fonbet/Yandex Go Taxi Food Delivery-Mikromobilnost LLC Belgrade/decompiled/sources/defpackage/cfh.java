package defpackage;

import android.content.Context;
import android.os.Build;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class cfh implements qm20 {
    public final Context a;
    public final String b;
    public final String c;

    public cfh(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.qm20
    public final pm20 a() {
        return new pm20(this.a.getPackageName(), this.b, this.c, b64.l("Android / ", Build.MANUFACTURER, Extension.SEMICOLON_SPACE, Build.MODEL));
    }
}
