package xsna;

import com.vk.contacts.ContactSyncState;
import com.vk.contacts.ContactsManager;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContactsSyncAndLoadCmd.kt */
/* loaded from: classes2.dex */
public final class ldj extends le6<ContactsList> {
    public final int b = -1;
    public final Source c;
    public final SortOrder d;

    public ldj(Source source, SortOrder sortOrder) {
        this.c = source;
        this.d = sortOrder;
    }

    @Override // xsna.le6
    public final ContactsList e(w2w w2wVar) {
        ContactSyncState contactSyncState;
        Source source = Source.CACHE;
        Source source2 = this.c;
        ContactsManager.b bVar = source2 != source ? (ContactsManager.b) w2wVar.L0(this, new z62()) : null;
        if (bVar == null || (contactSyncState = bVar.a) == null) {
            contactSyncState = !w2wVar.getConfig().l().H0() ? ContactSyncState.NOT_PERMITTED : ContactSyncState.HIDDEN;
        }
        ContactSyncState contactSyncState2 = contactSyncState;
        L.e("VkAppContacts##ContactsSyncAndLoadCmd", "syncState: " + contactSyncState2);
        ProfilesSimpleInfo Ob = ((y8j) k9q0.f(w2wVar, this, new zaj(source2, null, 12))).b.Ob();
        Object obj = nbj.a;
        List a = nbj.a(Ob, this.d);
        List b = nbj.b(w2wVar.f1(), a, Ob);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : b) {
            if (((qtd0) obj2).k5()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(a);
        arrayList2.removeAll(b);
        cew.b.getClass();
        long j = cew.h().getLong("contacts_request_time", -1L);
        if (j < 0) {
            cew.h().edit().putLong("contacts_request_time", System.currentTimeMillis()).apply();
            j = cew.h().getLong("contacts_request_time", -1L);
        }
        return new ContactsList(arrayList2, Ob, new sbj(contactSyncState2, j, w2wVar.getConfig().G, null, arrayList, b, null, null, w2wVar.getConfig().l().H0(), w2wVar.I0().w().p(), false, 0, 0, this.d, 29592), 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldj)) {
            return false;
        }
        ldj ldjVar = (ldj) obj;
        return this.b == ldjVar.b && this.c == ldjVar.c && this.d == ldjVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + io.reactivex.rxjava3.internal.operators.mixed.k.c(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ContactsSyncAndLoadCmd(limit=" + this.b + ", source=" + this.c + ", order=" + this.d + ')';
    }
}
