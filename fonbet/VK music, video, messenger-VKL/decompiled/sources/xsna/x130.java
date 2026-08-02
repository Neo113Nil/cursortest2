package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.newsfeed.Counters;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ReactionUserProfile;
import java.util.List;

/* compiled from: ModalPostReactionsTabState.kt */
/* loaded from: classes4.dex */
public final class x130 implements km50 {
    public final List<ReactionUserProfile> b;
    public final Counters c;
    public final int d;
    public final ReactionMeta e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final q030 j;

    public x130(List<ReactionUserProfile> list, Counters counters, int i, ReactionMeta reactionMeta, int i2, boolean z, boolean z2, boolean z3, q030 q030Var) {
        this.b = list;
        this.c = counters;
        this.d = i;
        this.e = reactionMeta;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = q030Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static x130 a(x130 x130Var, VKList vKList, int i, boolean z, boolean z2, boolean z3, q030 q030Var, int i2) {
        List list = vKList;
        if ((i2 & 1) != 0) {
            list = x130Var.b;
        }
        List list2 = list;
        Counters counters = x130Var.c;
        if ((i2 & 4) != 0) {
            i = x130Var.d;
        }
        int i3 = i;
        ReactionMeta reactionMeta = x130Var.e;
        int i4 = x130Var.f;
        if ((i2 & 32) != 0) {
            z = x130Var.g;
        }
        boolean z4 = z;
        boolean z5 = (i2 & 64) != 0 ? x130Var.h : z2;
        boolean z6 = (i2 & 128) != 0 ? x130Var.i : z3;
        q030 q030Var2 = (i2 & 256) != 0 ? x130Var.j : q030Var;
        x130Var.getClass();
        return new x130(list2, counters, i3, reactionMeta, i4, z4, z5, z6, q030Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x130)) {
            return false;
        }
        x130 x130Var = (x130) obj;
        return epx.f(this.b, x130Var.b) && epx.f(this.c, x130Var.c) && this.d == x130Var.d && epx.f(this.e, x130Var.e) && this.f == x130Var.f && this.g == x130Var.g && this.h == x130Var.h && this.i == x130Var.i && epx.f(this.j, x130Var.j);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Counters counters = this.c;
        int a = shy.a(this.d, (hashCode + (counters == null ? 0 : counters.hashCode())) * 31, 31);
        ReactionMeta reactionMeta = this.e;
        int b = qoy.b(qoy.b(qoy.b(shy.a(this.f, (a + (reactionMeta == null ? 0 : reactionMeta.hashCode())) * 31, 31), 31, this.g), 31, this.h), 31, this.i);
        q030 q030Var = this.j;
        return b + (q030Var != null ? q030Var.hashCode() : 0);
    }

    public final String toString() {
        return "ModalPostReactionsTabState(reactedUsers=" + this.b + ", counters=" + this.c + ", total=" + this.d + ", reaction=" + this.e + ", tabsCount=" + this.f + ", isFirstPage=" + this.g + ", isLoading=" + this.h + ", isError=" + this.i + ", analytics=" + this.j + ')';
    }
}
