package xsna;

import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.files.a;
import java.io.File;

/* compiled from: ClipsUploadFilesInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class mff implements lff {
    @Override // xsna.lff
    public final File a(File file) {
        return nbr.t(file, String.valueOf(System.currentTimeMillis()) + "mp4");
    }

    @Override // xsna.lff
    public final File b(PrivateSubdir privateSubdir) {
        PrivateFiles.a b;
        b = e8r.a.b(privateSubdir, privateSubdir.h(), true);
        return b.a;
    }

    @Override // xsna.lff
    public final boolean c(File file, File file2, kgf kgfVar) {
        return a.b.e(file, file2, kgfVar);
    }
}
