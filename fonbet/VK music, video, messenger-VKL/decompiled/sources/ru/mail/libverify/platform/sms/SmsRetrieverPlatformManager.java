package ru.mail.libverify.platform.sms;

import android.content.Context;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SmsRetrieverPlatformManager.kt */
/* loaded from: classes11.dex */
public interface SmsRetrieverPlatformManager {
    void checkSmsRetrieverTask(Context context, Runnable runnable, izs<? super Exception, s3q0> izsVar);

    void onSmsRetrieverSmsReceived(int i, String str, Runnable runnable, Runnable runnable2);
}
