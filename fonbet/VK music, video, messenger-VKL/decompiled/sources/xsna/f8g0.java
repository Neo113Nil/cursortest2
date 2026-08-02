package xsna;

import com.vk.contacts.ContactSyncState;

/* compiled from: RequestPermissionItem.kt */
/* loaded from: classes2.dex */
public final class f8g0 implements hfz {
    public final ContactSyncState b;

    public f8g0(ContactSyncState contactSyncState) {
        this.b = contactSyncState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8g0) && this.b == ((f8g0) obj).b;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "RequestPermissionItem(state=" + this.b + ')';
    }
}
