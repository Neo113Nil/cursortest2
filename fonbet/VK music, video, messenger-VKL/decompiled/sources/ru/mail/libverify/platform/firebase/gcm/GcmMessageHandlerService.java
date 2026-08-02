package ru.mail.libverify.platform.firebase.gcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import ru.mail.libverify.platform.core.IInternalFactory;
import ru.mail.libverify.platform.firebase.FirebaseCoreService;
import ru.mail.libverify.platform.firebase.a;

/* loaded from: classes9.dex */
public final class GcmMessageHandlerService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        String j = remoteMessage.j();
        Map<String, String> i = remoteMessage.i();
        FirebaseCoreService.Companion.getClass();
        FirebaseCoreService.a.a().v("GcmMessageHandlerService", "message received from " + j + " with data " + i);
        IInternalFactory iInternalFactory = a.c;
        if (iInternalFactory == null) {
            iInternalFactory = a.d;
        }
        iInternalFactory.deliverGcmMessageIntent(this, j, i);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        FirebaseCoreService.Companion.getClass();
        FirebaseCoreService.a.a().v("GcmMessageHandlerService", "token refresh. onNewToken: ".concat(str));
        IInternalFactory iInternalFactory = a.c;
        if (iInternalFactory == null) {
            iInternalFactory = a.d;
        }
        iInternalFactory.refreshGcmToken(this);
    }
}
