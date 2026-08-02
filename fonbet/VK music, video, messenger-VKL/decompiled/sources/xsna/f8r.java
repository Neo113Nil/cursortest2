package xsna;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: FileConverter.kt */
/* loaded from: classes2.dex */
public interface f8r {
    Uri a(Context context, Uri uri, File file, yjt yjtVar) throws InterruptedException, FileNotFoundException;

    boolean b(Context context, Uri uri);

    /* compiled from: FileConverter.kt */
    public static final class a {
        public static final C2852a a = new C2852a();

        /* compiled from: FileConverter.kt */
        /* renamed from: xsna.f8r$a$a, reason: collision with other inner class name */
        public static final class C2852a implements f8r {
            @Override // xsna.f8r
            public final boolean b(Context context, Uri uri) {
                return false;
            }

            @Override // xsna.f8r
            public final Uri a(Context context, Uri uri, File file, yjt yjtVar) {
                return uri;
            }
        }
    }
}
