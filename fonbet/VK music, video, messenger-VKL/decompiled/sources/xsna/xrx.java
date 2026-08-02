package xsna;

import com.vkontakte.android.R;

/* compiled from: InviteFriendsSelectionInfo.kt */
/* loaded from: classes14.dex */
public final class xrx {
    public final tlo0 a;
    public final boolean b;
    public final boolean c;

    public xrx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrx)) {
            return false;
        }
        xrx xrxVar = (xrx) obj;
        return epx.f(this.a, xrxVar.a) && this.b == xrxVar.b && this.c == xrxVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InviteFriendsSelectionInfo(text=");
        sb.append(this.a);
        sb.append(", isAllFriendsSelected=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public xrx(tlo0 tlo0Var, boolean z, boolean z2) {
        this.a = tlo0Var;
        this.b = z;
        this.c = z2;
    }

    public xrx(int i) {
        this(tq.h(tlo0.Companion, R.string.invite_friends_select_all), false, false);
    }
}
