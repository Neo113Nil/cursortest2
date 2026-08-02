package xsna;

import android.content.Context;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: ExternalFileRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class req {
    public final Context a;

    public req(Context context) {
        this.a = context;
    }

    public static File a(String str) {
        PrivateFiles.a b;
        Regex regex = com.vk.core.files.a.a;
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.LARGE_TEMP_UPLOADS;
        privateFiles.getClass();
        b = privateFiles.b(privateSubdir, privateSubdir.h(), true);
        File file = new File(b.a, str);
        return (!file.exists() || file.length() <= 0) ? file : a(eqm0.b(str));
    }
}
