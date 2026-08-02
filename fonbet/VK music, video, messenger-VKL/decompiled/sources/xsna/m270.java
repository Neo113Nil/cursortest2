package xsna;

import com.vk.contacts.ContactSyncState;

/* compiled from: NoContactsItem.kt */
/* loaded from: classes2.dex */
public final class m270 implements hfz {
    public final ContactSyncState b;

    public m270(ContactSyncState contactSyncState) {
        this.b = contactSyncState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m270) && this.b == ((m270) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NoContactsItem(state=" + this.b + ')';
    }
}
