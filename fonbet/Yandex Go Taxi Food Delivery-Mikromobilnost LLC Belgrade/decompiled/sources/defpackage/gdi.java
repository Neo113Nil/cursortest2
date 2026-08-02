package defpackage;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class gdi {
    public final Context a;
    public final LinkedHashSet b = new LinkedHashSet();

    public gdi(Context context) {
        this.a = context;
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
        return FileProvider.getUriForFile(context, "ru.yandex.taxi.utils.fileprovider." + context.getPackageName(), a).toString();
    }
}
