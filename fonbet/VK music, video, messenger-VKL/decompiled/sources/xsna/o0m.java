package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import kotlin.collections.EmptyList;

/* compiled from: DeprecatedCacheWrapper.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes.dex */
public final class o0m {
    public androidx.media3.datasource.cache.c a;
    public final kt70 b = new kt70();

    public o0m(Context context) {
        PrivateFiles.a b;
        PrivateFiles.a b2;
        b = e8r.a.b(r1, PrivateSubdir.VIDEO_DOWNLOADS.h(), false);
        File file = b.a;
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String str : list == null ? new String[0] : list) {
                if (!brm0.v(str, "uid", false) && !str.equals("test.tmp")) {
                    b2 = e8r.a.b(r3, PrivateSubdir.VIDEO_DOWNLOADS.h(), true);
                    this.a = new androidx.media3.datasource.cache.c(b2.a, new g370(), new aes0(context.getApplicationContext(), "video_downloads_database.db", null, 1), false);
                    return;
                }
            }
        }
    }

    public final void a() {
        PrivateFiles.a b;
        androidx.media3.datasource.cache.c cVar = this.a;
        for (String str : cVar != null ? cVar.getKeys() : EmptyList.b) {
            androidx.media3.datasource.cache.c cVar2 = this.a;
            if (cVar2 != null) {
                cVar2.c(str);
            }
        }
        this.a = null;
        b = e8r.a.b(r1, PrivateSubdir.VIDEO_DOWNLOADS.h(), true);
        nbr.l(b.a);
    }
}
