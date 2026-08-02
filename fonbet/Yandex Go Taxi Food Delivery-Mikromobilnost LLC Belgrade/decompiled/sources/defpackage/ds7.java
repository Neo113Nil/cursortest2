package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes5.dex */
public final class ds7 {
    public final Context a;

    public ds7(Context context) {
        this.a = context;
    }

    public final Uri a() {
        Context context = this.a;
        if (!new File(context.getCacheDir(), "logistics").exists()) {
            new File(context.getCacheDir(), "logistics").mkdirs();
        }
        return FileProvider.getUriForFile(context, g8e.o("com.yandex.delivery.libs.localstorage.", context.getPackageName()), new File(new File(context.getCacheDir(), "logistics"), "photo_storage.jpg"));
    }
}
