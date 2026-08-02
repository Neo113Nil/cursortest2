package ru.ok.android.externcalls.sdk.contacts;

import ru.ok.android.externcalls.sdk.contacts.listener.ContactCallListener;

/* compiled from: ContactCallManager.kt */
/* loaded from: classes9.dex */
public interface ContactCallManager {
    void addContactCallListener(ContactCallListener contactCallListener);

    boolean getIAmAnonymous();

    boolean getIWasInitiallyAnonymous();

    void removeContactCallListener(ContactCallListener contactCallListener);
}
