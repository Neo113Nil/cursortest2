package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes12.dex */
public final class j360 {

    @Nullable
    public final i260 a;

    /* compiled from: NetworkFetcher.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[FileExtension.values().length];
            a = iArr;
            try {
                iArr[FileExtension.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[FileExtension.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public j360(@Nullable i260 i260Var, @NonNull mnh0 mnh0Var) {
        this.a = i260Var;
    }

    @NonNull
    public final u800 a(Context context, @NonNull InputStream inputStream, @NonNull String str, @Nullable String str2, @Nullable String str3) throws IOException {
        u800<i700> k;
        FileExtension fileExtension;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        i260 i260Var = this.a;
        if (contains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            n100.a();
            FileExtension fileExtension2 = FileExtension.ZIP;
            k = str3 != null ? q700.k(context, new ZipInputStream(new FileInputStream(i260Var.d(str, inputStream, fileExtension2))), str) : q700.k(context, new ZipInputStream(inputStream), null);
            fileExtension = fileExtension2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            n100.a();
            fileExtension = FileExtension.GZIP;
            k = str3 != null ? q700.f(new GZIPInputStream(new FileInputStream(i260Var.d(str, inputStream, fileExtension))), str) : q700.f(new GZIPInputStream(inputStream), null);
        } else {
            n100.a();
            fileExtension = FileExtension.JSON;
            k = str3 != null ? q700.f(new FileInputStream(i260Var.d(str, inputStream, fileExtension).getAbsolutePath()), str) : q700.f(inputStream, null);
        }
        if (str3 != null && k.a != null) {
            File file = new File(i260Var.c(), i260.a(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            n100.a();
            if (!renameTo) {
                n100.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return k;
    }
}
