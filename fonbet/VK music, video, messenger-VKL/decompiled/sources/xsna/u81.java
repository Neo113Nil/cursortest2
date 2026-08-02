package xsna;

import android.app.Activity;
import android.app.slice.Slice;
import android.health.connect.ReadRecordsRequestUsingFilters;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.CredentialEntry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class u81 {
    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback b(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static /* synthetic */ ReadRecordsRequestUsingFilters.Builder c(Class cls) {
        return new ReadRecordsRequestUsingFilters.Builder(cls);
    }

    public static /* bridge */ /* synthetic */ IntermenstrualBleedingRecord e(Object obj) {
        return (IntermenstrualBleedingRecord) obj;
    }

    public static /* synthetic */ CredentialEntry h(BeginGetCredentialOption beginGetCredentialOption, Slice slice) {
        return new CredentialEntry(beginGetCredentialOption, slice);
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return SpeedRecord.class;
    }
}
