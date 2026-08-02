package xsna;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ajr implements Runnable {
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ ajr(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.b = firebaseMessaging;
        this.c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TaskCompletionSource taskCompletionSource = this.c;
        com.google.firebase.messaging.a aVar = FirebaseMessaging.n;
        FirebaseMessaging firebaseMessaging = this.b;
        firebaseMessaging.getClass();
        try {
            taskCompletionSource.setResult(firebaseMessaging.a());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }
}
