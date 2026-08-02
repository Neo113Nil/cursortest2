package xsna;

import android.database.SQLException;
import android.util.Log;
import kotlin.jvm.internal.Lambda;

/* compiled from: VkpnsPushDatabase.kt */
/* loaded from: classes5.dex */
public final class w4w0 extends Lambda implements izs<sin0, s3q0> {
    public static final w4w0 i = new w4w0(1);

    @Override // xsna.izs
    public final s3q0 invoke(sin0 sin0Var) {
        try {
            sin0Var.execSQL("ALTER TABLE 'push_token' ADD COLUMN 'test_token' INTEGER DEFAULT 0 NOT NULL");
        } catch (SQLException e) {
            Log.e("VkpnsPushDatabase", "migration from 3 to 4 failed", e);
        }
        return s3q0.a;
    }
}
