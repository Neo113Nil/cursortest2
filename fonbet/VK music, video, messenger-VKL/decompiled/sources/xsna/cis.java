package xsna;

import com.vk.toggle.data.FriendCellButtonType;
import com.vk.toggle.data.FriendCellLayout;

/* compiled from: FriendCellDesignConfig.kt */
/* loaded from: classes6.dex */
public final class cis {
    public static final cis k = new cis(0);
    public final boolean a;
    public final FriendCellLayout b;
    public final FriendCellButtonType c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public cis() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cis)) {
            return false;
        }
        cis cisVar = (cis) obj;
        return this.a == cisVar.a && this.b == cisVar.b && this.c == cisVar.c && this.d == cisVar.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        FriendCellLayout friendCellLayout = this.b;
        int hashCode2 = (hashCode + (friendCellLayout == null ? 0 : friendCellLayout.hashCode())) * 31;
        FriendCellButtonType friendCellButtonType = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (friendCellButtonType != null ? friendCellButtonType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendCellDesignConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", layout=");
        sb.append(this.b);
        sb.append(", buttonsType=");
        sb.append(this.c);
        sb.append(", canHide=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public /* synthetic */ cis(int i) {
        this(false, null, null, true);
    }

    public cis(boolean z, FriendCellLayout friendCellLayout, FriendCellButtonType friendCellButtonType, boolean z2) {
        this.a = z;
        this.b = friendCellLayout;
        this.c = friendCellButtonType;
        this.d = z2;
        this.e = !z;
        boolean z3 = false;
        this.f = z && friendCellLayout == FriendCellLayout.THREE_LINES_COMPACT;
        this.g = z && friendCellLayout == FriendCellLayout.THREE_LINES_LARGE;
        this.h = z && friendCellLayout == FriendCellLayout.TWO_LINES;
        if (z) {
            FriendCellButtonType friendCellButtonType2 = FriendCellButtonType.TEXTS;
        }
        this.i = z && friendCellButtonType == FriendCellButtonType.TEXTS_OUTLINE;
        if (z && friendCellButtonType == FriendCellButtonType.IMAGES) {
            z3 = true;
        }
        this.j = z3;
    }
}
