package xsna;

import com.vk.dto.messages.MsgSyncState;
import kotlin.Pair;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class jr30 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final int k;
    public final MsgSyncState l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final Pair<String, Integer> p;
    public final boolean q;

    public jr30() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr30)) {
            return false;
        }
        jr30 jr30Var = (jr30) obj;
        return this.a == jr30Var.a && this.b == jr30Var.b && this.c == jr30Var.c && this.d == jr30Var.d && this.e == jr30Var.e && this.f == jr30Var.f && this.g == jr30Var.g && this.h == jr30Var.h && this.i == jr30Var.i && this.j == jr30Var.j && this.k == jr30Var.k && this.l == jr30Var.l && this.m == jr30Var.m && this.n == jr30Var.n && epx.f(this.o, jr30Var.o) && epx.f(this.p, jr30Var.p) && this.q == jr30Var.q;
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(qoy.b((this.l.hashCode() + shy.a(this.k, bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.d, qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31)) * 31, 31, this.m), 31, this.n), 31, this.o);
        Pair<String, Integer> pair = this.p;
        return Boolean.hashCode(this.q) + ((a + (pair == null ? 0 : pair.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartHolderTimeAndStatusData(showTime=");
        sb.append(this.a);
        sb.append(", showStatus=");
        sb.append(this.b);
        sb.append(", isEditTxtMarkEnabled=");
        sb.append(this.c);
        sb.append(", readTillOutMsgCnvId=");
        sb.append(this.d);
        sb.append(", showSendingAsUnread=");
        sb.append(this.e);
        sb.append(", isMsgToSelf=");
        sb.append(this.f);
        sb.append(", isGradientBubble=");
        sb.append(this.g);
        sb.append(", msgIsEdited=");
        sb.append(this.h);
        sb.append(", msgIsPinned=");
        sb.append(this.i);
        sb.append(", msgTime=");
        sb.append(this.j);
        sb.append(", msgCnvId=");
        sb.append(this.k);
        sb.append(", msgSyncState=");
        sb.append(this.l);
        sb.append(", isOutgoing=");
        sb.append(this.m);
        sb.append(", msgIsExists=");
        sb.append(this.n);
        sb.append(", viewsCount=");
        sb.append(this.o);
        sb.append(", debugInfo=");
        sb.append(this.p);
        sb.append(", showFloatingReaction=");
        return defpackage.q0.a(sb, this.q, ')');
    }

    public jr30(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j, int i2, MsgSyncState msgSyncState, boolean z9, boolean z10, String str, Pair<String, Integer> pair, boolean z11) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = j;
        this.k = i2;
        this.l = msgSyncState;
        this.m = z9;
        this.n = z10;
        this.o = str;
        this.p = pair;
        this.q = z11;
    }

    public /* synthetic */ jr30(int i) {
        this(false, false, false, 0, false, false, false, false, false, 0L, 0, MsgSyncState.DONE, false, false, "", null, false);
    }
}
