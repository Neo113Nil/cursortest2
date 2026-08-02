package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;

/* compiled from: OneFileWritable.kt */
/* loaded from: classes3.dex */
public final class qi80 extends hbr {
    public FileOutputStream f;
    public File g;

    public qi80(m9r m9rVar) {
        super(m9rVar);
    }

    @Override // xsna.hbr
    public final boolean a() {
        return this.f != null;
    }

    @Override // xsna.hbr
    public final void b() {
        f();
    }

    @Override // xsna.hbr
    public final void c() {
        FileOutputStream fileOutputStream = this.f;
        if (fileOutputStream != null) {
            fileOutputStream.flush();
        }
        FileOutputStream fileOutputStream2 = this.f;
        if (fileOutputStream2 != null) {
            fileOutputStream2.close();
        }
    }

    @Override // xsna.hbr
    public final void e(String str, boolean z) {
        File file = this.g;
        if ((file != null && !file.exists()) || this.f == null) {
            f();
        }
        if (!z) {
            ExecutorService executorService = this.e;
            if (executorService == null) {
                executorService = null;
            }
            executorService.execute(new k0(7, this, str));
            return;
        }
        synchronized (this.b) {
            m9r m9rVar = this.a;
            FileOutputStream fileOutputStream = this.f;
            m9rVar.getClass();
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.write(str.getBytes(Charset.forName(C.UTF8_NAME)));
                } catch (Throwable unused) {
                }
            }
            if (fileOutputStream != null) {
                fileOutputStream.flush();
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:3|4|(4:6|(1:10)|11|12)|16|(1:18)|19|20|21|22|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        synchronized (this.b) {
            try {
                if (this.f != null) {
                    File file = this.g;
                    if (file != null && !file.exists()) {
                    }
                    s3q0 s3q0Var = s3q0.a;
                }
                File file2 = new File(this.c);
                this.g = file2;
                this.a.getClass();
                m9r.c(file2);
                FileOutputStream fileOutputStream = this.f;
                if (fileOutputStream != null) {
                    this.a.getClass();
                    m9r.b(fileOutputStream);
                }
                m9r m9rVar = this.a;
                File file3 = this.g;
                m9rVar.getClass();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file3, true);
                this.f = fileOutputStream2;
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
