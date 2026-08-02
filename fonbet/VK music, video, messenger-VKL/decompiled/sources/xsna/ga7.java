package xsna;

import java.util.ArrayList;

/* compiled from: FriendsBirthdayModalPage.kt */
/* loaded from: classes6.dex */
public final class ga7 {
    public final String a;
    public final ArrayList b;

    public ga7(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga7)) {
            return false;
        }
        ga7 ga7Var = (ga7) obj;
        return epx.f(this.a, ga7Var.a) && this.b.equals(ga7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BirthdaysFriendsGroup(groupTitle=");
        sb.append(this.a);
        sb.append(", users=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
