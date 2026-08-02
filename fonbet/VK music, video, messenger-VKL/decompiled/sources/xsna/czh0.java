package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.DialogsIdList;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.im.engine.utils.StringMatchStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* compiled from: SearchStorageManager.kt */
/* loaded from: classes2.dex */
public interface czh0 {

    /* compiled from: SearchStorageManager.kt */
    public static final class a {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            aVar.getClass();
            return this.a == aVar.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a) + (Boolean.hashCode(true) * 31);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("PeerSearchFilter(fromSearchOnly=true, onlyNonEmptyDialogs="), this.a, ')');
        }
    }

    HashMap a(Peer.Type type, int i);

    DialogsIdList b(int i);

    void c(DialogsIdList dialogsIdList);

    void d(Collection<UserStorageModel> collection);

    ArrayList e(ArrayList arrayList, ArrayList arrayList2, a aVar, int i);

    void f(ArrayList arrayList);

    boolean g();

    void h(long j);

    List i(ArrayList arrayList, ArrayList arrayList2, Long l, int i, int i2);

    void j(Collection<User> collection);

    void k(Collection<Contact> collection);

    long l();

    void m(ArrayList arrayList, ProfilesSimpleInfo profilesSimpleInfo);

    void n(Collection<Long> collection);

    void o(ArrayList arrayList);

    void p(ArrayList arrayList);

    DialogsIdList q();

    List<Peer> r(long j, String str, StringMatchStrategy stringMatchStrategy, Integer num);

    void s(Collection<Email> collection);
}
