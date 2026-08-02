package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;

/* compiled from: VideoOfflineImagesFileStorage.kt */
/* loaded from: classes3.dex */
public final class zys0 {
    public static File a(String str) {
        PrivateFiles.a b;
        b = e8r.a.b(r1, PrivateSubdir.DOWNLOADED_VIDEO_IMAGES.h(), true);
        return new File(b.a, str + '/');
    }
}
