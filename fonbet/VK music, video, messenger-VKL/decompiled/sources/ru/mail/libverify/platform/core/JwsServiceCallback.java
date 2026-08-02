package ru.mail.libverify.platform.core;

/* compiled from: JwsServiceCallback.kt */
/* loaded from: classes9.dex */
public interface JwsServiceCallback {
    void onFailure(Exception exc);

    void onSuccess(String str);
}
