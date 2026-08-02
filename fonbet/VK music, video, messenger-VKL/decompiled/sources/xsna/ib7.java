package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.OnlineInfo;
import java.util.List;

/* compiled from: BirthdaysListViewItem.kt */
/* loaded from: classes15.dex */
public final class ib7 implements hfz {
    public final UserId b;
    public final kr5 c;
    public final String d;
    public final String e;
    public final OnlineInfo f;
    public final VerifyInfo g;
    public final List<a> h;

    /* compiled from: BirthdaysListViewItem.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final ka7 c;

        public a(int i, int i2, ka7 ka7Var) {
            this.a = i;
            this.b = i2;
            this.c = ka7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "ActionButton(iconRes=" + this.a + ", contentDescriptionRes=" + this.b + ", clickActionType=" + this.c + ')';
        }
    }

    public ib7(UserId userId, kr5 kr5Var, String str, String str2, OnlineInfo onlineInfo, VerifyInfo verifyInfo, List<a> list) {
        this.b = userId;
        this.c = kr5Var;
        this.d = str;
        this.e = str2;
        this.f = onlineInfo;
        this.g = verifyInfo;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib7)) {
            return false;
        }
        ib7 ib7Var = (ib7) obj;
        return epx.f(this.b, ib7Var.b) && epx.f(this.c, ib7Var.c) && epx.f(this.d, ib7Var.d) && epx.f(this.e, ib7Var.e) && epx.f(this.f, ib7Var.f) && epx.f(this.g, ib7Var.g) && epx.f(this.h, ib7Var.h);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(Long.hashCode(this.b.b));
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + urd0.a(urd0.a((this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31, 31, this.d), 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profile(id=");
        sb.append(this.b);
        sb.append(", avatarImageConfig=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", onlineInfo=");
        sb.append(this.f);
        sb.append(", verifyInfo=");
        sb.append(this.g);
        sb.append(", actionButtons=");
        return ms9.a(')', sb, this.h);
    }
}
