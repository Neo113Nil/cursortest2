package defpackage;

import com.google.firebase.a;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes10.dex */
public final class c2g0 implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(a.d());
        }
        q5z.i(firebaseMessaging);
        return firebaseMessaging;
    }
}
