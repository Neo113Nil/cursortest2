package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;

/* compiled from: ClipsEditorFileDirsImpl.kt */
/* loaded from: classes16.dex */
public final class ayd implements zxd {
    @Override // xsna.zxd
    public final File a() {
        PrivateFiles.a b;
        b = e8r.a.b(r1, PrivateSubdir.CLIPS_VIDEO.h(), true);
        return b.a;
    }

    public final File b() {
        PrivateFiles.a b;
        b = e8r.a.b(r1, PrivateSubdir.CLIPS_AUDIO.h(), true);
        return b.a;
    }
}
