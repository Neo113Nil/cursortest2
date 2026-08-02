package xsna;

import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContactFieldExt.kt */
/* loaded from: classes5.dex */
public final class m8j {
    public static final ArrayList a(List list, CommunityAddContactsState.ContactField contactField) {
        List<CommunityAddContactsState.ContactField> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (CommunityAddContactsState.ContactField contactField2 : list2) {
            if (contactField2.d == contactField.d) {
                contactField2 = contactField;
            }
            arrayList.add(contactField2);
        }
        return arrayList;
    }
}
