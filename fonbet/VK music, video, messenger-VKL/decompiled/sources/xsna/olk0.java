package xsna;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public abstract class olk0 {
    public static gtz0 b(int i, int i2, int i3, long j, long j2, List list, List list2) {
        if (i2 != 8) {
            return new gtz0(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static gtz0 m(Bundle bundle) {
        return new gtz0(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    public abstract int c();

    @NonNull
    public final ArrayList d() {
        return j() != null ? new ArrayList(j()) : new ArrayList();
    }

    @NonNull
    public final ArrayList e() {
        return k() != null ? new ArrayList(k()) : new ArrayList();
    }

    @Nullable
    @Deprecated
    public abstract PendingIntent f();

    public abstract int g();

    public abstract int h();

    public abstract long i();

    @Nullable
    public abstract List j();

    @Nullable
    public abstract List k();

    @Nullable
    public abstract List l();
}
