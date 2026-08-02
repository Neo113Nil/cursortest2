package xsna;

import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ExerciseSegment;
import android.health.connect.datatypes.PowerRecord;
import android.net.http.HttpException;
import android.view.inputmethod.HandwritingGesture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class m91 {
    public static /* synthetic */ Device.Builder f() {
        return new Device.Builder();
    }

    public static /* bridge */ /* synthetic */ ExerciseSegment g(Object obj) {
        return (ExerciseSegment) obj;
    }

    public static /* bridge */ /* synthetic */ PowerRecord h(Object obj) {
        return (PowerRecord) obj;
    }

    public static /* bridge */ /* synthetic */ HttpException i(Exception exc) {
        return (HttpException) exc;
    }

    public static /* bridge */ /* synthetic */ HandwritingGesture j(Object obj) {
        return (HandwritingGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return DistanceRecord.class;
    }
}
