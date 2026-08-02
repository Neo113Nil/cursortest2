package xsna;

import android.app.Activity;
import android.content.ServiceConnection;
import android.os.Looper;
import androidx.annotation.NonNull;
import xsna.c63;

/* compiled from: BoundServiceConnection.java */
/* loaded from: classes17.dex */
public final class r98 extends c63.b {
    public final /* synthetic */ ServiceConnection b;
    public final /* synthetic */ com.vk.core.service.a c;

    public r98(com.vk.core.service.a aVar, ServiceConnection serviceConnection) {
        this.c = aVar;
        this.b = serviceConnection;
    }

    @Override // xsna.c63.b
    public final void x(@NonNull Activity activity) {
        com.vk.core.service.a aVar = this.c;
        if (!aVar.g) {
            ServiceConnection serviceConnection = this.b;
            aVar.e = Thread.currentThread() == Looper.getMainLooper().getThread();
            aVar.g = e43.a.bindService(aVar.b(), serviceConnection, 1);
        }
        c63 c63Var = c63.a;
        c63.c(this);
    }
}
