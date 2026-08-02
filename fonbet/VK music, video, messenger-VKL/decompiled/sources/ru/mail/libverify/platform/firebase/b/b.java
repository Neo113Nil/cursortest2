package ru.mail.libverify.platform.firebase.b;

import android.content.Context;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import ru.mail.libverify.platform.core.ILog;
import ru.mail.libverify.platform.firebase.FirebaseCoreService;
import ru.mail.libverify.platform.gcm.IdException;
import ru.mail.libverify.platform.gcm.IdProviderService;
import ru.mail.libverify.platform.utils.StringUtils;
import xsna.ajr;
import xsna.ejr;
import xsna.vhr;
import xsna.vir;

/* loaded from: classes11.dex */
public final class b implements IdProviderService {
    public final ILog a;

    public b(ILog iLog) {
        this.a = iLog;
    }

    public static final void a(IdProviderService.IdProviderCallback idProviderCallback, Task task) {
        if (task.isSuccessful()) {
            idProviderCallback.onIdProviderCallback((String) task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception();
        }
        idProviderCallback.onException(exception);
    }

    @Override // ru.mail.libverify.platform.gcm.IdProviderService
    public final void deleteId(Context context) {
        try {
            a(context);
            FirebaseMessaging.d().b();
        } catch (Throwable th) {
            throw new IdException(th);
        }
    }

    @Override // ru.mail.libverify.platform.gcm.IdProviderService
    public final void getId(Context context, String str, final IdProviderService.IdProviderCallback idProviderCallback) {
        Task<String> task;
        try {
            FirebaseMessaging firebaseMessaging = (FirebaseMessaging) a(context).b(FirebaseMessaging.class);
            vir virVar = firebaseMessaging.b;
            if (virVar != null) {
                task = virVar.c();
            } else {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                firebaseMessaging.h.execute(new ajr(firebaseMessaging, taskCompletionSource));
                task = taskCompletionSource.getTask();
            }
            task.addOnCompleteListener(new OnCompleteListener() { // from class: xsna.ney0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    ru.mail.libverify.platform.firebase.b.b.a(IdProviderService.IdProviderCallback.this, task2);
                }
            });
        } catch (Throwable th) {
            idProviderCallback.onException(th);
        }
    }

    public final vhr a(Context context) {
        try {
            return vhr.e();
        } catch (IllegalStateException e) {
            this.a.v("id provider", "get firebase app instance " + e.getMessage());
            ejr.a aVar = new ejr.a();
            StringUtils stringUtils = StringUtils.INSTANCE;
            aVar.d(stringUtils.decodeBase64(FirebaseCoreService.SENDER_ID));
            aVar.c(stringUtils.decodeBase64("MToyOTcxMDkwMzYzNDk6YW5kcm9pZDpiNzJlNGVkMGZmY2RkYTM5"));
            aVar.b(stringUtils.decodeBase64("QUl6YVN5QTUwclhhU0xZSWV3MWtidHlHX09MUnBVRlNpN2xWZEE0"));
            aVar.e(stringUtils.decodeBase64("Z2VuaWFsLXVuaW9uLTkxODA5"));
            return vhr.h(context, "libverify", aVar.a());
        }
    }
}
