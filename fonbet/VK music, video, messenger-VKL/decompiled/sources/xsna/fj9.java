package xsna;

import android.content.Context;
import android.os.Build;
import com.vk.camera.sdk.impl.CameraException;
import com.vk.log.L;
import xsna.ij9;

/* compiled from: CameraManagerImpl.kt */
/* loaded from: classes16.dex */
public final class fj9 {
    public final jhu0 a;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fj9(Context context, ij9.a aVar, ij9.b bVar, ij9.c cVar) {
        jhu0 jhu0Var;
        Context applicationContext = context.getApplicationContext();
        jhu0 jhu0Var2 = null;
        try {
        } catch (CameraException e) {
            L.f("CameraManagerImpl", "Can't open camera 2", e);
            bVar.a(e);
        } catch (Throwable th) {
            CameraException.Error error = new CameraException.Error(th);
            L.f("CameraManagerImpl", "Can't open camera 2", error);
            bVar.a(error);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            jhu0Var = new com.vk.camera.sdk.impl.b(applicationContext, aVar, bVar);
            if (jhu0Var == null) {
                try {
                    jhu0Var2 = new com.vk.camera.sdk.impl.a(aVar, bVar);
                } catch (Throwable th2) {
                    CameraException.Error error2 = new CameraException.Error(th2);
                    L.f("CameraManagerImpl", "Can't open camera 1", error2);
                    com.vk.metrics.eventtracking.b.a.q(error2);
                }
                jhu0Var = jhu0Var2;
            }
            this.a = jhu0Var;
        }
        jhu0Var = null;
        if (jhu0Var == null) {
        }
        this.a = jhu0Var;
    }
}
