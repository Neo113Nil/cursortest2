package xsna;

import android.content.Context;
import com.vk.core.files.PrivateSubdir;
import com.vk.log.L;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* compiled from: PrivateFileHelper.kt */
/* loaded from: classes.dex */
public final class zfd0 {
    public final Context a;
    public final ConcurrentHashMap<String, Boolean> b = new ConcurrentHashMap<>();
    public final bpn0 c = new bpn0(new zg9(11));

    public zfd0(Context context) {
        this.a = context;
    }

    public static boolean a(File file) {
        boolean z;
        boolean z2;
        try {
            z = file.exists();
        } catch (SecurityException unused) {
            z = false;
        }
        if (!z) {
            return false;
        }
        try {
            z2 = file.canWrite();
        } catch (SecurityException unused2) {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        try {
            File file2 = new File(file, "test.tmp");
            boolean createNewFile = file2.createNewFile();
            asu0.a.getClass();
            asu0.n().execute(new j1q(file2, 2));
            return createNewFile;
        } catch (Throwable th) {
            L.i(th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.Result$Failure] */
    public static File c(File file, PrivateSubdir privateSubdir) {
        File failure;
        File t = nbr.t(file, privateSubdir.i());
        t.mkdirs();
        try {
            failure = t.getCanonicalFile();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) == null) {
            t = failure;
        }
        return t;
    }

    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
