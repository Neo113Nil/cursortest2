package xsna;

import com.vk.log.L;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: ClipPreviewFileUtil.kt */
/* loaded from: classes14.dex */
public final class iad {
    public static File a(File file, File file2) {
        Regex regex = com.vk.core.files.a.a;
        if (vhk0.g(file) && !brm0.B(file.getAbsolutePath(), file2.getAbsolutePath(), false)) {
            File file3 = new File(file2, file.getName());
            try {
                com.vk.core.files.a.a(file, file3);
                return file3;
            } catch (Exception e) {
                L.j(e, "Failed to copy file");
            }
        }
        return null;
    }
}
