package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;

/* compiled from: VkpnsPushDatabase.kt */
/* loaded from: classes5.dex */
public final class y4w0 extends Lambda implements izs<sin0, s3q0> {
    public static final y4w0 i = new y4w0(1);

    @Override // xsna.izs
    public final s3q0 invoke(sin0 sin0Var) {
        sin0 sin0Var2 = sin0Var;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long millis = timeUnit.toMillis(28L);
        long seconds = timeUnit.toSeconds(28L);
        long currentTimeMillis = System.currentTimeMillis() + millis;
        sin0Var2.execSQL("ALTER TABLE 'push_message' ADD COLUMN 'actual_ttl' INTEGER DEFAULT 0 NOT NULL");
        sin0Var2.execSQL("ALTER TABLE 'push_message' ADD COLUMN 'expiring_time' INTEGER");
        StringBuilder b = fp.b(seconds, "UPDATE 'push_message' SET 'actual_ttl' = ", ", 'expiring_time' = ");
        b.append(currentTimeMillis);
        sin0Var2.execSQL(b.toString());
        return s3q0.a;
    }
}
