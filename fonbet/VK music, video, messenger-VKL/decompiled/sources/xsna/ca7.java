package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FriendsBirthdayModalPage.kt */
/* loaded from: classes6.dex */
public final class ca7 {
    public final String a;
    public final String b;
    public final List<ba7> c;
    public final List<ga7> d;

    public ca7() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca7)) {
            return false;
        }
        ca7 ca7Var = (ca7) obj;
        return epx.f(this.a, ca7Var.a) && epx.f(this.b, ca7Var.b) && epx.f(this.c, ca7Var.c) && epx.f(this.d, ca7Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + fw3.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdayModalFriendsInfo(modalTitle=");
        sb.append(this.a);
        sb.append(", modalSubtitle=");
        sb.append(this.b);
        sb.append(", usersWithoutGroup=");
        sb.append(this.c);
        sb.append(", birthdaysGroups=");
        return ms9.a(')', sb, this.d);
    }

    public ca7(String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        List list = (i & 4) != 0 ? EmptyList.b : arrayList;
        List list2 = (i & 8) != 0 ? EmptyList.b : arrayList2;
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }
}
