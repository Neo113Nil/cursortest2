package xsna;

import android.credentials.PrepareGetCredentialResponse;
import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.StepsCadenceRecord;
import java.time.Instant;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class y92 {
    public static /* bridge */ /* synthetic */ PrepareGetCredentialResponse a(Object obj) {
        return (PrepareGetCredentialResponse) obj;
    }

    public static /* synthetic */ StepsCadenceRecord.Builder b(Metadata metadata, Instant instant, Instant instant2, ArrayList arrayList) {
        return new StepsCadenceRecord.Builder(metadata, instant, instant2, arrayList);
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return AggregateRecordsGroupedByDurationResponse.class;
    }

    public static /* bridge */ /* synthetic */ boolean h(Object obj) {
        return obj instanceof CyclingPedalingCadenceRecord;
    }
}
