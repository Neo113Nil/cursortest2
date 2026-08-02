package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes11.dex */
public abstract class mvt0 {
    public static k391 b(int i, int i2, int i3, long j, long j2, List list, List list2) {
        if (i2 != 8) {
            return new k391(i, i2, i3, j, j2, list, list2, null, null);
        }
        ny61.g("REQUIRES_USER_CONFIRMATION state not supported.");
        return null;
    }

    public static k391 m(Bundle bundle) {
        return new k391(bundle.getInt("session_id"), bundle.getInt(ACSPConstants.STATUS), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    public abstract int c();

    public final ArrayList d() {
        return j() != null ? new ArrayList(j()) : new ArrayList();
    }

    public final ArrayList e() {
        return k() != null ? new ArrayList(k()) : new ArrayList();
    }

    public abstract PendingIntent f();

    public abstract int g();

    public abstract int h();

    public abstract long i();

    public abstract List j();

    public abstract List k();

    public abstract List l();
}
