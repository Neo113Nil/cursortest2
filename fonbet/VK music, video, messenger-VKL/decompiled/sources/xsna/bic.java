package xsna;

import android.content.Context;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: ClearEditorImagesCacheJob.kt */
/* loaded from: classes15.dex */
public final class bic extends tsl {
    @Override // xsna.tsl
    public final void a(Context context) {
        PrivateFiles.a b;
        b = e8r.a.b(r0, PrivateSubdir.PHOTO_EDITOR.h(), true);
        File[] listFiles = b.a.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                Regex regex = com.vk.core.files.a.a;
                vhk0.b(file);
            }
        }
    }
}
