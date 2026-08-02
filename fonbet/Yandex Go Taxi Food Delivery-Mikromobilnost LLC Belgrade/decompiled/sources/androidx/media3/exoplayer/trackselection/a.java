package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import defpackage.d6z;
import defpackage.eg3;
import defpackage.rlf;
import defpackage.tw21;
import defpackage.vmh;

/* loaded from: classes10.dex */
public final class a {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final Spatializer$OnSpatializerStateChangedListener d;

    public a(Context context, final vmh vmhVar) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager i = context == null ? null : eg3.i(context);
        if (i != null) {
            context.getClass();
            if (!tw21.U(context)) {
                spatializer = i.getSpatializer();
                this.a = spatializer;
                immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
                this.b = immersiveAudioLevel != 0;
                Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = new Spatializer$OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$SpatializerWrapperV32$1
                    public void onSpatializerAvailableChanged(Spatializer spatializer2, boolean z) {
                        vmhVar.c();
                    }

                    public void onSpatializerEnabledChanged(Spatializer spatializer2, boolean z) {
                        vmhVar.c();
                    }
                };
                this.d = spatializer$OnSpatializerStateChangedListener;
                Looper myLooper = Looper.myLooper();
                d6z.z(myLooper);
                Handler handler = new Handler(myLooper);
                this.c = handler;
                spatializer.addOnSpatializerStateChangedListener(new rlf(0, handler), spatializer$OnSpatializerStateChangedListener);
                return;
            }
        }
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }
}
