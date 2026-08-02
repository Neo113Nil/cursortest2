package ru.mail.libverify.platform.sms;

/* compiled from: SmsRetrieverManager.kt */
/* loaded from: classes9.dex */
public interface SmsRetrieverManager {

    /* compiled from: SmsRetrieverManager.kt */
    public interface SmsRetrieverSmsCallback {
        void onIncomingSms(String str);
    }

    boolean canUseSmsRetriever();

    void onSmsRetrieverSmsReceived(int i, String str);

    void register(SmsRetrieverSmsCallback smsRetrieverSmsCallback);

    void unregister(SmsRetrieverSmsCallback smsRetrieverSmsCallback);
}
