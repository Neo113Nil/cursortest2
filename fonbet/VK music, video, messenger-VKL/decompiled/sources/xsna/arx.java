package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: InviteFriendsSelectionInfo.kt */
/* loaded from: classes14.dex */
public final class arx {
    public final tlo0.f a;
    public final Integer b;
    public final boolean c;

    public arx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arx)) {
            return false;
        }
        arx arxVar = (arx) obj;
        return epx.f(this.a, arxVar.a) && epx.f(this.b, arxVar.b) && this.c == arxVar.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InviteFriendsButtonInfo(text=");
        sb.append(this.a);
        sb.append(", count=");
        sb.append(this.b);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public arx(tlo0.f fVar, Integer num, boolean z) {
        this.a = fVar;
        this.b = num;
        this.c = z;
    }

    public arx(int i) {
        this(tq.h(tlo0.Companion, R.string.invite_friends_button), null, false);
    }
}
