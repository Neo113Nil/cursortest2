package xsna;

import com.vkontakte.android.VKApplication;
import java.io.File;

/* compiled from: ReportSerializerCacheDbSizeTask.kt */
/* loaded from: classes11.dex */
public final class t5g0 implements gzs<s3q0> {
    public final VKApplication b;

    public t5g0(VKApplication vKApplication) {
        this.b = vKApplication;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        File databasePath = this.b.getDatabasePath("SerializerDatabaseCache");
        if (databasePath != null && databasePath.exists()) {
            new bni0((int) databasePath.length()).q();
        }
        return s3q0.a;
    }
}
