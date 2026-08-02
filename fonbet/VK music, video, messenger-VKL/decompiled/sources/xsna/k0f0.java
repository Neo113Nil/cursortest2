package xsna;

import com.vk.im.reactions.api.chips.ReactionChipStyle;
import java.util.List;

/* compiled from: ReactionChipModel.kt */
/* loaded from: classes2.dex */
public final class k0f0 {
    public final int a;
    public final List<Long> b;
    public final int c;
    public final boolean d;
    public final ReactionChipStyle e;
    public final int f;
    public final long g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public k0f0(int i, List<Long> list, int i2, boolean z, ReactionChipStyle reactionChipStyle, int i3, long j, int i4, int i5, boolean z2, boolean z3) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = z;
        this.e = reactionChipStyle;
        this.f = i3;
        this.g = j;
        this.h = i4;
        this.i = i5;
        this.j = z2;
        this.k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0f0)) {
            return false;
        }
        k0f0 k0f0Var = (k0f0) obj;
        return this.a == k0f0Var.a && epx.f(this.b, k0f0Var.b) && this.c == k0f0Var.c && this.d == k0f0Var.d && this.e == k0f0Var.e && this.f == k0f0Var.f && this.g == k0f0Var.g && this.h == k0f0Var.h && this.i == k0f0Var.i && this.j == k0f0Var.j && this.k == k0f0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + qoy.b(shy.a(this.i, shy.a(this.h, bh10.a(shy.a(this.f, (this.e.hashCode() + qoy.b(shy.a(this.c, fw3.a(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d)) * 31, 31), 31, this.g), 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionChipModel(reactionId=");
        sb.append(this.a);
        sb.append(", reactedUserIds=");
        sb.append(this.b);
        sb.append(", reactedUsersCount=");
        sb.append(this.c);
        sb.append(", isReactedByMe=");
        sb.append(this.d);
        sb.append(", style=");
        sb.append(this.e);
        sb.append(", colorAccent=");
        sb.append(this.f);
        sb.append(", dialogId=");
        sb.append(this.g);
        sb.append(", cnvMsgId=");
        sb.append(this.h);
        sb.append(", msgLocalId=");
        sb.append(this.i);
        sb.append(", isChannel=");
        sb.append(this.j);
        sb.append(", showCounter=");
        return defpackage.q0.a(sb, this.k, ')');
    }
}
