package xsna;

import com.vk.contacts.ContactsManager;

/* compiled from: AndroidContactsSyncCmd.kt */
/* loaded from: classes2.dex */
public final class z62 extends le6<ContactsManager.b> {
    @Override // xsna.le6
    public final ContactsManager.b e(w2w w2wVar) {
        return w2wVar.getConfig().l().d();
    }

    public final boolean equals(Object obj) {
        return "AndroidContactsSyncCmd".equals((obj instanceof z62 ? (z62) obj : null) != null ? "AndroidContactsSyncCmd" : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 883133053;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AndroidContactsSyncCmd";
    }
}
