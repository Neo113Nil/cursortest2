package xsna;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
@Deprecated
/* loaded from: classes12.dex */
public final class unv {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
