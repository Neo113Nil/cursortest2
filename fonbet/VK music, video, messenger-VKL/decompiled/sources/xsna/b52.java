package xsna;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.SpeedRecord;
import android.net.http.DnsOptions;
import java.time.Instant;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class b52 {
    public static /* synthetic */ SpeedRecord.Builder d(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new SpeedRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ DnsOptions.Builder f() {
        return new DnsOptions.Builder();
    }
}
