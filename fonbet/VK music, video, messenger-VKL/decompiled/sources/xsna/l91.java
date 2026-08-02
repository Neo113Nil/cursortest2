package xsna;

import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.PowerRecord;
import android.net.http.HttpException;
import android.view.inputmethod.JoinOrSplitGesture;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class l91 {
    public static /* synthetic */ DataOrigin.Builder e() {
        return new DataOrigin.Builder();
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture g(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return CyclingPedalingCadenceRecord.class;
    }

    public static /* bridge */ /* synthetic */ boolean m(Exception exc) {
        return exc instanceof HttpException;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj) {
        return obj instanceof PowerRecord;
    }
}
