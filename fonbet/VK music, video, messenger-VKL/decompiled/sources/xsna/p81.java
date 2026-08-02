package xsna;

import android.credentials.ClearCredentialStateException;
import android.health.connect.HealthConnectManager;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.text.GraphemeClusterSegmentFinder;
import android.text.TextPaint;
import java.time.Instant;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class p81 {
    public static /* synthetic */ ClearCredentialStateException b(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    public static /* bridge */ /* synthetic */ HealthConnectManager c(Object obj) {
        return (HealthConnectManager) obj;
    }

    public static /* synthetic */ Vo2MaxRecord.Builder e(Metadata metadata, Instant instant, int i, double d) {
        return new Vo2MaxRecord.Builder(metadata, instant, i, d);
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder g(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return PowerRecord.class;
    }

    public static /* synthetic */ void j() {
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj) {
        return obj instanceof HeightRecord;
    }
}
