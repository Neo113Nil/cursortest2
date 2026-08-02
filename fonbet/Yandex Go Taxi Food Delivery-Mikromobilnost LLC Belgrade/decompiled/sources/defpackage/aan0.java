package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class aan0 {
    public final Context a;

    public aan0(Context context) {
        this.a = context;
    }

    public final File a(String str) {
        File b = b(str);
        return new File(b.getParentFile(), b64.j(b.getName(), ".etag"));
    }

    public final File b(String str) {
        File file = new File(this.a.getCacheDir(), "scooters_completion_vehicle_detection");
        String path = Uri.parse(str).getPath();
        if (path == null) {
            path = "";
        }
        String e0 = evu0.e0('/', path, path);
        if (evu0.J(e0)) {
            e0 = "vehicle_detection_model.tflite";
        }
        return new File(file, g8e.p(Integer.toHexString(path.hashCode()), "_", e0));
    }

    public final File c(String str) {
        File b = b(str);
        return new File(b.getParentFile(), b64.j(b.getName(), ".size"));
    }

    public final boolean d(String str) {
        File b = b(str);
        if (b.isFile()) {
            File c = c(str);
            if (c.isFile()) {
                try {
                    Long m = bvu0.m(10, evu0.k0(g3r.e(c)).toString());
                    if (m != null) {
                        long longValue = m.longValue();
                        if (longValue > 0) {
                            if (b.length() == longValue) {
                                return true;
                            }
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    zgz.a("Failed to validate completion photo vehicle detection model file", th);
                    return false;
                }
            }
        }
        return false;
    }
}
