package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.dialogs.BusinessNotifyInfo;

/* compiled from: Notify.kt */
/* loaded from: classes7.dex */
public final class uk70 {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final long h;
    public final al70 i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final BusinessNotifyInfo n;
    public final boolean o;
    public final boolean p;
    public final al70 q;

    public uk70(long j, long j2, int i, String str, String str2, long j3, String str3, long j4, al70 al70Var, String str4, boolean z, boolean z2, boolean z3, BusinessNotifyInfo businessNotifyInfo, boolean z4, boolean z5, al70 al70Var2) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = j3;
        this.g = str3;
        this.h = j4;
        this.i = al70Var;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = businessNotifyInfo;
        this.o = z4;
        this.p = z5;
        this.q = al70Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk70)) {
            return false;
        }
        uk70 uk70Var = (uk70) obj;
        return this.a == uk70Var.a && this.b == uk70Var.b && this.c == uk70Var.c && epx.f(this.d, uk70Var.d) && epx.f(this.e, uk70Var.e) && this.f == uk70Var.f && epx.f(this.g, uk70Var.g) && this.h == uk70Var.h && epx.f(this.i, uk70Var.i) && epx.f(this.j, uk70Var.j) && this.k == uk70Var.k && this.l == uk70Var.l && this.m == uk70Var.m && epx.f(this.n, uk70Var.n) && this.o == uk70Var.o && this.p == uk70Var.p && epx.f(this.q, uk70Var.q);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + bh10.a(urd0.a(bh10.a(urd0.a(urd0.a(shy.a(this.c, bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
        String str = this.j;
        int b = qoy.b(qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m);
        BusinessNotifyInfo businessNotifyInfo = this.n;
        return this.q.hashCode() + qoy.b(qoy.b((b + (businessNotifyInfo != null ? businessNotifyInfo.hashCode() : 0)) * 31, 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Notify(ownerId=");
        sb.append(this.a);
        sb.append(", dialogId=");
        sb.append(this.b);
        sb.append(", msgCnvId=");
        sb.append(this.c);
        sb.append(", title='");
        BuildInfo.Client client = BuildInfo.a;
        sb.append(BuildInfo.d(this.d));
        sb.append("', body='");
        sb.append(BuildInfo.d(this.e));
        sb.append("', timeMs=");
        sb.append(this.f);
        sb.append(", senderName='");
        sb.append(this.g);
        sb.append("', senderPeerDialogId=");
        sb.append(this.h);
        sb.append(", senderAvatarInfo=");
        sb.append(this.i);
        sb.append(", previewImageUrl=");
        sb.append(this.j);
        sb.append(", isChat=");
        sb.append(this.k);
        sb.append(", isChannel=");
        sb.append(this.l);
        sb.append(", isBusinessNotify=");
        sb.append(this.m);
        sb.append(", businessNotifyInfo=");
        sb.append(this.n);
        sb.append(", useSound=");
        sb.append(this.o);
        sb.append(", failed=");
        sb.append(this.p);
        sb.append(", chatImageInfo=");
        sb.append(this.q);
        sb.append(')');
        return sb.toString();
    }
}
