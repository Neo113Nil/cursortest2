package xsna;

import com.vk.contacts.ContactSyncState;

/* compiled from: ContactSyncEvents.kt */
/* loaded from: classes17.dex */
public final class jon0 extends daj {
    public final ContactSyncState a;

    public jon0(ContactSyncState contactSyncState) {
        this.a = contactSyncState;
    }

    public final ContactSyncState a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jon0) && this.a == ((jon0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SyncStateChanged(value=" + this.a + ')';
    }
}
