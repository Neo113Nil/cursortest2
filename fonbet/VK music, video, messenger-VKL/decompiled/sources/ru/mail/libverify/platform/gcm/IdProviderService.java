package ru.mail.libverify.platform.gcm;

import android.content.Context;

/* compiled from: IdProviderService.kt */
/* loaded from: classes11.dex */
public interface IdProviderService {

    /* compiled from: IdProviderService.kt */
    /* loaded from: classes9.dex */
    public interface IdProviderCallback {
        void onException(Throwable th);

        void onIdProviderCallback(String str);
    }

    void deleteId(Context context) throws IdException;

    void getId(Context context, String str, IdProviderCallback idProviderCallback);
}
