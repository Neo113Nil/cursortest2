package sg.bigo.ads.an;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class e implements f {

    @NonNull
    public final Context d;
    private final Runnable a = new Runnable() { // from class: sg.bigo.ads.an.e.1
        @Override // java.lang.Runnable
        public final void run() {
            e eVar = e.this;
            eVar.c(eVar.d);
        }
    };
    public boolean e = false;
    protected boolean f = false;

    public e(@NonNull Context context) {
        this.d = context;
    }

    private void C() {
        this.e = true;
        b();
        toString();
    }

    public abstract String a();

    public final void a(long j) {
        sg.bigo.ads.bh.d.a(this.a);
        if (j <= 0) {
            sg.bigo.ads.bh.d.a(1, this.a);
        } else {
            sg.bigo.ads.bh.d.a(1, this.a, j);
        }
    }

    public abstract String b();

    public final synchronized void b(Context context) {
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            try {
                File file = new File(o.a(context), a());
                this.f = file.exists();
                byte[] b = sg.bigo.ads.common.utils.h.b(file);
                if (b == null) {
                    b();
                    a(context);
                    return;
                }
                byte[] b2 = sg.bigo.ads.common.utils.p.b(b);
                if (b2 == null) {
                    sg.bigo.ads.bn.a.a(0, b(), "data decrypt failed length=" + b.length);
                    file.delete();
                    a(context);
                    return;
                }
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(b2);
                try {
                    int available = byteArrayInputStream2.available();
                    byte[] bArr = new byte[available];
                    byteArrayInputStream2.read(bArr);
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(bArr, 0, available);
                    obtain.setDataPosition(0);
                    b(obtain);
                    try {
                        byteArrayInputStream2.close();
                    } catch (IOException unused) {
                        sg.bigo.ads.bn.a.a(0, 5, b(), "close data input stream failed");
                    }
                    a(context);
                } catch (Exception unused2) {
                    byteArrayInputStream = byteArrayInputStream2;
                    sg.bigo.ads.bn.a.a(0, 5, b(), "DataFile load failed");
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                            sg.bigo.ads.bn.a.a(0, 5, b(), "close data input stream failed");
                        }
                    }
                    a(context);
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream = byteArrayInputStream2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused4) {
                            sg.bigo.ads.bn.a.a(0, 5, b(), "close data input stream failed");
                        }
                    }
                    a(context);
                    throw th;
                }
            } catch (Exception unused5) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:20|(2:22|(2:24|(2:26|27))(2:28|(2:30|27)))|(2:31|32)|(4:34|35|(1:39)|41)|42|43|44|45|46|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        sg.bigo.ads.bn.a.a(0, 5, b(), "close output stream failed");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void c(Context context) {
        Parcel obtain;
        ByteArrayOutputStream byteArrayOutputStream;
        FileOutputStream fileOutputStream;
        String str;
        String str2;
        sg.bigo.ads.bh.d.a(this.a);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        r0 = null;
        FileOutputStream fileOutputStream2 = null;
        byteArrayOutputStream2 = null;
        try {
            try {
                obtain = Parcel.obtain();
                a(obtain);
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byteArrayOutputStream.write(obtain.marshall());
            byteArrayOutputStream.flush();
            byte[] a = sg.bigo.ads.common.utils.p.a(byteArrayOutputStream.toByteArray());
            if (a == null) {
                sg.bigo.ads.bn.a.a(0, b(), "## data encrypt failed.");
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                    sg.bigo.ads.bn.a.a(0, 5, b(), "close output stream failed");
                }
                this.f = true;
                C();
                return;
            }
            File file = new File(o.a(context), a());
            File a2 = sg.bigo.ads.common.utils.h.a(file);
            if (file.exists()) {
                if (a2.exists()) {
                    if (!file.delete()) {
                        str = "IOUtils";
                        str2 = "delete locked file failed: " + file.getName();
                        sg.bigo.ads.bn.a.a(0, str, str2);
                    }
                } else if (!file.renameTo(a2)) {
                    str = "IOUtils";
                    str2 = "rename locked file failed: " + file.getName();
                    sg.bigo.ads.bn.a.a(0, str, str2);
                }
            }
            try {
                try {
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException unused3) {
                }
            } catch (Exception unused4) {
            }
            try {
                fileOutputStream.write(a);
                fileOutputStream.getFD().sync();
                if (a2.exists() && !a2.delete()) {
                    sg.bigo.ads.bn.a.a(0, "IOUtils", "delete backup file failed: " + a2.getName());
                }
                fileOutputStream.close();
            } catch (Exception unused5) {
                fileOutputStream2 = fileOutputStream;
                sg.bigo.ads.bn.a.a(0, "IOUtils", "write file " + file.getPath() + " failed");
                if (file.exists() && !file.delete()) {
                    sg.bigo.ads.bn.a.a(0, "IOUtils", "delete locked file with exception failed: " + file.getName());
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                b();
                toString();
                byteArrayOutputStream.close();
                this.f = true;
                C();
                return;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
            b();
            toString();
            byteArrayOutputStream.close();
            this.f = true;
            C();
            return;
        } catch (Exception unused7) {
            byteArrayOutputStream2 = byteArrayOutputStream;
            sg.bigo.ads.bn.a.a(0, 5, b(), "data save failed");
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused8) {
                    sg.bigo.ads.bn.a.a(0, 5, b(), "close output stream failed");
                }
            }
            this.f = true;
            C();
            return;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused9) {
                    sg.bigo.ads.bn.a.a(0, 5, b(), "close output stream failed");
                }
            }
            this.f = true;
            C();
            throw th;
        }
    }

    public void a(Context context) {
        this.e = true;
        b();
        toString();
    }
}
