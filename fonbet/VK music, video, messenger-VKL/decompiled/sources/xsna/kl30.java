package xsna;

import com.vk.dto.common.Peer;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: MsgListDialogMeta.kt */
/* loaded from: classes2.dex */
public final class kl30 {
    public final List<Integer> a;
    public final boolean b;
    public final List<Integer> c;
    public final int d;
    public final int e;
    public final int f;
    public final Peer g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final JSONObject l;
    public final boolean m;

    public kl30() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl30)) {
            return false;
        }
        kl30 kl30Var = (kl30) obj;
        return epx.f(this.a, kl30Var.a) && this.b == kl30Var.b && epx.f(this.c, kl30Var.c) && this.d == kl30Var.d && this.e == kl30Var.e && this.f == kl30Var.f && epx.f(this.g, kl30Var.g) && this.h == kl30Var.h && this.i == kl30Var.i && this.j == kl30Var.j && this.k == kl30Var.k && epx.f(this.l, kl30Var.l) && this.m == kl30Var.m;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(shy.a(this.f, shy.a(this.e, shy.a(this.d, fw3.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31, this.g.b), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        JSONObject jSONObject = this.l;
        return Boolean.hashCode(this.m) + ((b + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgListDialogMeta(unreadReactions=");
        sb.append(this.a);
        sb.append(", isReactionsAvailable=");
        sb.append(this.b);
        sb.append(", unreadMentionMsgCnvIds=");
        sb.append(this.c);
        sb.append(", countUnread=");
        sb.append(this.d);
        sb.append(", readTillInMsgCnvId=");
        sb.append(this.e);
        sb.append(", readTillOutMsgCnvId=");
        sb.append(this.f);
        sb.append(", peer=");
        sb.append(this.g);
        sb.append(", isWithSelf=");
        sb.append(this.h);
        sb.append(", canSeeInviteLink=");
        sb.append(this.i);
        sb.append(", isIncognito=");
        sb.append(this.j);
        sb.append(", shortPollReactions=");
        sb.append(this.k);
        sb.append(", payload=");
        sb.append(this.l);
        sb.append(", isMessagesForwardEnabled=");
        return defpackage.q0.a(sb, this.m, ')');
    }

    public kl30(List<Integer> list, boolean z, List<Integer> list2, int i, int i2, int i3, Peer peer, boolean z2, boolean z3, boolean z4, boolean z5, JSONObject jSONObject, boolean z6) {
        this.a = list;
        this.b = z;
        this.c = list2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = peer;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = jSONObject;
        this.m = z6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kl30(int i) {
        this(r1, false, r1, 0, -1, -1, Peer.Unknown.e, false, false, false, false, null, true);
        EmptyList emptyList = EmptyList.b;
    }
}
