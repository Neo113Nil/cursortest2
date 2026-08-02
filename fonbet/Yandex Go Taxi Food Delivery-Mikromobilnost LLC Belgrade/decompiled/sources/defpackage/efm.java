package defpackage;

import android.location.Location;
import com.yandex.mobile.drive.drive_native_features.b;
import io.flutter.embedding.engine.FlutterEngine;

/* loaded from: classes15.dex */
public final class efm {
    public hdm a;
    public final mfm b;
    public final jfm c;
    public final shm d;
    public final a9z e;
    public final dfm f;

    public efm(FlutterEngine flutterEngine) {
        dfm dfmVar = new dfm();
        this.f = dfmVar;
        this.e = new a9z(flutterEngine.c);
        xrr xrrVar = flutterEngine.d;
        tsr l = xrrVar.l(mfm.class);
        mfm mfmVar = (mfm) (l instanceof mfm ? l : null);
        this.b = mfmVar;
        tsr l2 = xrrVar.l(jfm.class);
        this.c = (jfm) (l2 instanceof jfm ? l2 : null);
        tsr l3 = xrrVar.l(shm.class);
        this.d = (shm) (l3 instanceof shm ? l3 : null);
        if (mfmVar != null) {
            mfmVar.a();
        }
        if (((s6z) bfm.i.e.get()) == null) {
            bcz bczVar = b.A;
            bczVar.a.addIfAbsent(dfmVar);
            Location location = bczVar.b;
            if (location != null) {
                dfm.a(location);
            }
        }
    }
}
