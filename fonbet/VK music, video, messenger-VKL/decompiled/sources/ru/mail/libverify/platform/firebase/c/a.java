package ru.mail.libverify.platform.firebase.c;

import android.content.Context;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import ru.mail.libverify.platform.core.ILog;
import ru.mail.libverify.platform.firebase.FirebaseCoreService;
import ru.mail.libverify.platform.sms.SmsRetrieverPlatformManager;
import xsna.izs;
import xsna.mmg;
import xsna.s3q0;
import xsna.vua0;

/* loaded from: classes11.dex */
public final class a implements SmsRetrieverPlatformManager {
    public Task<Void> a;

    public static final void a(Runnable runnable, Task task) {
        runnable.run();
    }

    @Override // ru.mail.libverify.platform.sms.SmsRetrieverPlatformManager
    public final void checkSmsRetrieverTask(Context context, final Runnable runnable, final izs<? super Exception, s3q0> izsVar) {
        Task<Void> addOnCompleteListener;
        FirebaseCoreService.Companion.getClass();
        ILog a = FirebaseCoreService.a.a();
        if (this.a != null) {
            a.d("FirebaseSmsRetrieverPlatformManager", "SmsRetrieverClient has been already subscribed");
            return;
        }
        try {
            zzab j = vua0.j(context);
            a.d("FirebaseSmsRetrieverPlatformManager", "SmsRetrieverClient started");
            Task<Void> startSmsRetriever = j.startSmsRetriever();
            this.a = startSmsRetriever;
            if (startSmsRetriever == null || (addOnCompleteListener = startSmsRetriever.addOnCompleteListener(new OnCompleteListener() { // from class: xsna.d8y0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ru.mail.libverify.platform.firebase.c.a.a(runnable, task);
                }
            })) == null) {
                return;
            }
            addOnCompleteListener.addOnFailureListener(new OnFailureListener() { // from class: xsna.m8y0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ru.mail.libverify.platform.firebase.c.a.a(ru.mail.libverify.platform.firebase.c.a.this, izsVar, exc);
                }
            });
        } catch (Throwable th) {
            a.e("FirebaseSmsRetrieverPlatformManager", "SmsRetrieverClient init error", th);
        }
    }

    @Override // ru.mail.libverify.platform.sms.SmsRetrieverPlatformManager
    public final void onSmsRetrieverSmsReceived(int i, String str, Runnable runnable, Runnable runnable2) {
        FirebaseCoreService.Companion.getClass();
        FirebaseCoreService.a.a().v("FirebaseSmsRetrieverPlatformManager", "received status: " + mmg.a(i) + " with sms text: " + str);
        this.a = null;
        if (i == 0) {
            runnable.run();
        } else {
            if (i != 15) {
                return;
            }
            runnable2.run();
        }
    }

    public static final void a(a aVar, izs izsVar, Exception exc) {
        aVar.a = null;
        izsVar.invoke(exc);
    }
}
