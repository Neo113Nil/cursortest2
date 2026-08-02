package defpackage;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class l3z {
    public final Context a;

    public l3z(Context context) {
        this.a = context;
        new LinkedHashSet();
    }

    public final File a(String str) {
        Context context = this.a;
        if (!new File(context.getCacheDir(), "logistics").exists()) {
            new File(context.getCacheDir(), "logistics").mkdirs();
        }
        File file = new File(new File(context.getCacheDir(), "logistics"), str);
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }

    public final String b(String str) {
        File a = a(str);
        Context context = this.a;
        return FileProvider.getUriForFile(context, "com.yandex.delivery.libs.localstorage." + context.getPackageName(), a).toString();
    }
}
