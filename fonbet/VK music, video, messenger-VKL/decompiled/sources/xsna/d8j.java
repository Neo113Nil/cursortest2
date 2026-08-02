package xsna;

import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;

/* compiled from: ContactCallAnalyticsDelegate.kt */
/* loaded from: classes7.dex */
public final class d8j {
    public final com.vk.voip.b a;
    public final c8j b;

    public d8j(com.vk.voip.b bVar, pvw0 pvw0Var) {
        this.a = bVar;
        this.b = pvw0Var;
    }

    public final void a() {
        ContactCallManager contactCallManager = this.a.getContactCallManager();
        if (contactCallManager == null || !contactCallManager.getIAmAnonymous()) {
            return;
        }
        this.b.q();
    }
}
