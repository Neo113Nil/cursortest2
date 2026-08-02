package xsna;

import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.PowerRecord;
import android.net.http.DnsOptions;
import android.view.inputmethod.RemoveSpaceGesture;
import java.time.Instant;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class sa1 {
    public static /* synthetic */ PowerRecord.Builder d(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new PowerRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* synthetic */ DnsOptions.StaleDnsOptions.Builder f() {
        return new DnsOptions.StaleDnsOptions.Builder();
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return RemoveSpaceGesture.class;
    }
}
