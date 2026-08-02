package xsna;

import android.content.Context;
import com.vk.media.MediaUtils;
import java.io.File;

/* compiled from: ClipEncodingTask.kt */
/* loaded from: classes16.dex */
public final class sds0 extends ivc {
    public final File g;

    public sds0(Context context, File file, File file2) {
        super(file2, file);
        this.g = file;
    }

    @Override // xsna.ivc
    public final long b() {
        return 8L;
    }

    @Override // xsna.ivc
    public final void c() {
        b920 lipVar;
        File file = this.g;
        if (!file.exists()) {
            lipVar = new lip(new IllegalStateException("VideoCopyTask failed: file doesn't exit. " + file.getPath()));
        } else if (file.length() <= 0) {
            lipVar = new lip(new IllegalStateException("VideoCopyTask failed: file is empty. " + file.getPath()));
        } else if (MediaUtils.a.d(file.getAbsolutePath()) == null) {
            lipVar = new lip(new IllegalStateException("VideoCopyTask failed: can't extract video config. " + file.getPath()));
        } else {
            try {
                cbr cbrVar = cbr.a;
                File file2 = this.b;
                cbrVar.getClass();
                cbr.c(file, file2);
                lipVar = nip.c;
            } catch (Throwable th) {
                lipVar = new lip(th);
            }
        }
        this.d = lipVar;
    }
}
