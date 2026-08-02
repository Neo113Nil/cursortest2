package xsna;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: FileChunk.kt */
/* loaded from: classes3.dex */
public final class c8r {
    public final int a;
    public final m9r b;
    public final File c;
    public FileOutputStream d;

    public c8r(String str, int i, m9r m9rVar) {
        this.a = i;
        this.b = m9rVar;
        this.c = new File(str);
        a();
    }

    public final void a() {
        File file = this.c;
        boolean exists = file.exists();
        FileOutputStream fileOutputStream = null;
        m9r m9rVar = this.b;
        if (exists) {
            if (this.d == null) {
                m9rVar.getClass();
                try {
                    fileOutputStream = new FileOutputStream(file, true);
                } catch (Throwable unused) {
                }
                this.d = fileOutputStream;
                return;
            }
            return;
        }
        m9rVar.getClass();
        m9r.c(file);
        FileOutputStream fileOutputStream2 = this.d;
        if (fileOutputStream2 != null) {
            m9r.b(fileOutputStream2);
        }
        try {
            fileOutputStream = new FileOutputStream(file, true);
        } catch (Throwable unused2) {
        }
        this.d = fileOutputStream;
    }
}
