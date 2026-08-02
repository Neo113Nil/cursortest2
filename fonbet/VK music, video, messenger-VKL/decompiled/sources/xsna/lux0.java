package xsna;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;
import xsna.nux0;

/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes13.dex */
public final class lux0 extends Binder {
    public final EnhancedIntentService.a a;

    public lux0(EnhancedIntentService.a aVar) {
        this.a = aVar;
    }

    public final void a(final nux0.a aVar) {
        Task processIntent;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        processIntent = EnhancedIntentService.this.processIntent(aVar.a);
        processIntent.addOnCompleteListener(new ddk(), new OnCompleteListener() { // from class: xsna.kux0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                nux0.a.this.b.trySetResult(null);
            }
        });
    }
}
