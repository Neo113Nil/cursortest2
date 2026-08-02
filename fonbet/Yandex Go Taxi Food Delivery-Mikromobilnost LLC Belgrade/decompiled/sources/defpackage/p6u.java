package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.http.NetworkException;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectRangeGesture;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class p6u {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean D(Object obj) {
        return obj instanceof NetworkException;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager f(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ NetworkException k(Object obj) {
        return (NetworkException) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture l(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture m(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture n(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ Class o() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean y(Object obj) {
        return obj instanceof SelectRangeGesture;
    }
}
