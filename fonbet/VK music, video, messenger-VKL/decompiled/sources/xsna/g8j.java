package xsna;

import ru.ok.android.externcalls.sdk.contacts.listener.ContactCallListener;

/* compiled from: ContactCallListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class g8j implements ContactCallListener {
    public final h8j a;

    public g8j(h8j h8jVar) {
        this.a = h8jVar;
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.listener.ContactCallListener
    public final void onContactCallMyAnonChanged() {
        this.a.onContactCallMyAnonChanged();
    }
}
