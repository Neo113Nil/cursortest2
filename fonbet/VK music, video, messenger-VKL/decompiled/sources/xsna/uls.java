package xsna;

import com.vk.dto.posting.FriendsListPrivacyType;
import com.vk.dto.privacy.ListFriends;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FriendsAndListsSelectorParams.kt */
/* loaded from: classes3.dex */
public final class uls {
    public final FriendsListPrivacyType a;
    public final List<ListFriends> b;
    public final ArrayList c;
    public final ArrayList d;

    public uls(FriendsListPrivacyType friendsListPrivacyType, List list, ArrayList arrayList, ArrayList arrayList2) {
        this.a = friendsListPrivacyType;
        this.b = list;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uls)) {
            return false;
        }
        uls ulsVar = (uls) obj;
        return this.a == ulsVar.a && epx.f(this.b, ulsVar.b) && this.c.equals(ulsVar.c) && this.d.equals(ulsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qr.a(this.c, fw3.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsAndListsSelectorParams(friendsListPrivacyType=");
        sb.append(this.a);
        sb.append(", friendLists=");
        sb.append(this.b);
        sb.append(", presetFriendsIds=");
        sb.append(this.c);
        sb.append(", presetFriendsListsIds=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
