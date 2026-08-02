package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.vk.im.engine.models.dialogs.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.text.Regex;

/* compiled from: DialogBackgroundSaveCustomCmd.kt */
/* loaded from: classes2.dex */
public final class qam extends le6<s3q0> {
    public final Uri b;

    public qam(Uri uri) {
        this.b = uri;
    }

    public static File f(File file) {
        int i;
        int d;
        int v = iah0.v();
        File p = com.vk.core.files.a.p();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        options.inSampleSize = kd7.a(v, v, options);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath(), options);
        try {
            d = new p4q(file.getAbsolutePath()).d(0, "Orientation");
        } catch (IOException unused) {
        }
        if (d == 3) {
            i = 180;
        } else if (d != 6) {
            if (d == 8) {
                i = atv0.b;
            }
            i = 0;
        } else {
            i = 90;
        }
        Bitmap k = kd7.k(decodeFile, i, false);
        if (k != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(p);
            try {
                k.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                k.recycle();
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
            } finally {
            }
        }
        return p;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        File file;
        File E;
        Uri uri = this.b;
        ram m = w2wVar.I0().m();
        File file2 = null;
        file2 = null;
        try {
            file = oeq0.e(uri) ? com.vk.core.files.a.i(w2wVar.getContext(), uri) : null;
            if (file == null) {
                try {
                    E = sv1.E(uri);
                } catch (Throwable th) {
                    th = th;
                    Regex regex = com.vk.core.files.a.a;
                    vhk0.b(file2);
                    vhk0.b(file);
                    throw th;
                }
            } else {
                E = file;
            }
            File f = f(E);
            try {
                c.h hVar = c.h.c;
                m.g(hVar.a, Uri.fromFile(f), iah0.f().widthPixels, iah0.f().heightPixels);
                rey a = w2wVar.V0().a();
                lam e = m.e(hVar.a);
                if (e != null) {
                    Uri d = hpo0.d(e, "light");
                    String uri2 = d != null ? d.toString() : null;
                    if (uri2 == null) {
                        uri2 = "";
                    }
                    a.k(uri2, fto0.w("sidepack_background_uri"));
                }
                vhk0.b(f);
                vhk0.b(file);
                return s3q0.a;
            } catch (Throwable th2) {
                th = th2;
                file2 = f;
                Regex regex2 = com.vk.core.files.a.a;
                vhk0.b(file2);
                vhk0.b(file);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            file = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qam) && epx.f(this.b, ((qam) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return alb0.b(new StringBuilder("DialogBackgroundSaveCustomCmd(uri="), this.b, ')');
    }
}
