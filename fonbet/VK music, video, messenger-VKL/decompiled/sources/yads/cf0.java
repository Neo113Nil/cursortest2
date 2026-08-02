package yads;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes10.dex */
public final class cf0 implements Spatializer$OnSpatializerStateChangedListener {
    public final /* synthetic */ if0 a;

    public cf0(if0 if0Var) {
        this.a = if0Var;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.a.b();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.a.b();
    }
}
