package xsna;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import kotlin.text.Regex;
import xsna.faw;

/* compiled from: UploadCompressStrategy.kt */
/* loaded from: classes6.dex */
public class bwi extends kaq0 {
    public static final /* synthetic */ int g = 0;
    public final Context c;
    public final boolean d;
    public final faw.b e;
    public String f;

    /* compiled from: UploadCompressStrategy.kt */
    public static final class a {
        public static Uri a(Uri uri) {
            String scheme;
            return (!oeq0.e(uri) && ((scheme = uri.getScheme()) == null || scheme.length() == 0)) ? uri.buildUpon().scheme(X3.i.b).build() : uri;
        }
    }

    public bwi(Context context, boolean z) {
        this(context, z, new faw.a());
    }

    public final String a(Uri uri) {
        File e = PrivateFiles.e(e8r.a, PrivateSubdir.TEMP_UPLOADS, "temp_upload_" + this.a, "jpg", 24);
        this.f = e.getAbsolutePath();
        try {
            b(uri, e);
            if (e.exists()) {
                return e.getAbsolutePath();
            }
            return null;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
            String str = this.f;
            if (str == null) {
                return null;
            }
            Regex regex = com.vk.core.files.a.a;
            vhk0.c(str);
            return null;
        }
    }

    public void b(Uri uri, File file) {
        new faw(new obh(this, 2), this.e).a(this.c, a.a(uri), file, null);
    }

    public bwi(Context context, boolean z, faw.b bVar) {
        this.c = context;
        this.d = z;
        this.e = bVar;
    }
}
