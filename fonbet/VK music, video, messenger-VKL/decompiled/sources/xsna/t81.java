package xsna;

import android.health.connect.TimeInstantRangeFilter;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.Record;
import android.health.connect.datatypes.SleepSessionRecord;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialOption;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class t81 {
    public static /* synthetic */ TimeInstantRangeFilter.Builder a() {
        return new TimeInstantRangeFilter.Builder();
    }

    public static /* bridge */ /* synthetic */ Record c(Object obj) {
        return (Record) obj;
    }

    public static /* synthetic */ BeginGetCredentialOption e(String str, String str2) {
        return new BeginGetCredentialOption(str, str2, Bundle.EMPTY);
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return SleepSessionRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof IntermenstrualBleedingRecord;
    }
}
