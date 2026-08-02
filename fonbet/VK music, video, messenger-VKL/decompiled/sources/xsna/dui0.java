package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import com.google.firebase.sessions.SessionLifecycleService;
import xsna.zti0;

/* compiled from: SessionLifecycleServiceBinder.kt */
/* loaded from: classes.dex */
public final class dui0 implements cui0 {
    public final Context a;

    public dui0(Context context) {
        this.a = context;
    }

    @Override // xsna.cui0
    public final void a(Messenger messenger, zti0.b bVar) {
        boolean z;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) SessionLifecycleService.class);
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        intent.setPackage(context.getPackageName());
        try {
            z = context.bindService(intent, bVar, 65);
        } catch (SecurityException unused) {
            z = false;
        }
        if (z) {
            return;
        }
        try {
            context.unbindService(bVar);
            s3q0 s3q0Var = s3q0.a;
        } catch (IllegalArgumentException unused2) {
        }
    }
}
