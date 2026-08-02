package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.WallGetMode;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: UserProfileWallMviState.kt */
/* loaded from: classes4.dex */
public final class dwq0 implements tw60<dwq0> {
    public static final dwq0 r = new dwq0(UserId.d, WallGetMode.ALL, null, 0, false, 0, 0, Boolean.FALSE, null, null, null, null, null, null, true, ur60.h);
    public final UserId b;
    public final WallGetMode c;
    public final WallGetMode d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final Boolean i;
    public final Pair<String, String> j;
    public final Boolean k;
    public final Integer l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final ur60 q;

    public dwq0(UserId userId, WallGetMode wallGetMode, WallGetMode wallGetMode2, int i, boolean z, int i2, int i3, Boolean bool, Pair<String, String> pair, Boolean bool2, Integer num, String str, String str2, String str3, boolean z2, ur60 ur60Var) {
        this.b = userId;
        this.c = wallGetMode;
        this.d = wallGetMode2;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = bool;
        this.j = pair;
        this.k = bool2;
        this.l = num;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = z2;
        this.q = ur60Var;
    }

    public static dwq0 a(dwq0 dwq0Var, UserId userId, WallGetMode wallGetMode, WallGetMode wallGetMode2, int i, int i2, int i3, Boolean bool, Pair pair, Boolean bool2, Integer num, String str, String str2, String str3, boolean z, ur60 ur60Var, int i4) {
        UserId userId2 = (i4 & 1) != 0 ? dwq0Var.b : userId;
        WallGetMode wallGetMode3 = (i4 & 2) != 0 ? dwq0Var.c : wallGetMode;
        WallGetMode wallGetMode4 = (i4 & 4) != 0 ? dwq0Var.d : wallGetMode2;
        int i5 = (i4 & 8) != 0 ? dwq0Var.e : i;
        boolean z2 = (i4 & 16) != 0 ? dwq0Var.f : true;
        int i6 = (i4 & 32) != 0 ? dwq0Var.g : i2;
        int i7 = (i4 & 64) != 0 ? dwq0Var.h : i3;
        Boolean bool3 = (i4 & 128) != 0 ? dwq0Var.i : bool;
        Pair pair2 = (i4 & 256) != 0 ? dwq0Var.j : pair;
        Boolean bool4 = (i4 & 512) != 0 ? dwq0Var.k : bool2;
        Integer num2 = (i4 & 1024) != 0 ? dwq0Var.l : num;
        String str4 = (i4 & 2048) != 0 ? dwq0Var.m : str;
        String str5 = (i4 & 4096) != 0 ? dwq0Var.n : str2;
        String str6 = (i4 & 8192) != 0 ? dwq0Var.o : str3;
        UserId userId3 = userId2;
        boolean z3 = (i4 & 16384) != 0 ? dwq0Var.p : z;
        ur60 ur60Var2 = (i4 & 32768) != 0 ? dwq0Var.q : ur60Var;
        dwq0Var.getClass();
        return new dwq0(userId3, wallGetMode3, wallGetMode4, i5, z2, i6, i7, bool3, pair2, bool4, num2, str4, str5, str6, z3, ur60Var2);
    }

    @Override // xsna.tw60
    public final dwq0 b(ur60 ur60Var) {
        return a(this, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, false, ur60Var, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwq0)) {
            return false;
        }
        dwq0 dwq0Var = (dwq0) obj;
        return epx.f(this.b, dwq0Var.b) && this.c == dwq0Var.c && this.d == dwq0Var.d && this.e == dwq0Var.e && this.f == dwq0Var.f && this.g == dwq0Var.g && this.h == dwq0Var.h && epx.f(this.i, dwq0Var.i) && epx.f(this.j, dwq0Var.j) && epx.f(this.k, dwq0Var.k) && epx.f(this.l, dwq0Var.l) && epx.f(this.m, dwq0Var.m) && epx.f(this.n, dwq0Var.n) && epx.f(this.o, dwq0Var.o) && this.p == dwq0Var.p && epx.f(this.q, dwq0Var.q);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (Long.hashCode(this.b.b) * 31)) * 31;
        WallGetMode wallGetMode = this.d;
        int a = shy.a(this.h, shy.a(this.g, qoy.b(shy.a(this.e, (hashCode + (wallGetMode == null ? 0 : wallGetMode.hashCode())) * 31, 31), 31, this.f), 31), 31);
        Boolean bool = this.i;
        int hashCode2 = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Pair<String, String> pair = this.j;
        int hashCode3 = (hashCode2 + (pair == null ? 0 : pair.hashCode())) * 31;
        Boolean bool2 = this.k;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.l;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.m;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.n;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.o;
        return this.q.hashCode() + qoy.b((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.p);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.q;
    }

    public final String toString() {
        return "UserProfileWallMviState(ownerId=" + this.b + ", wallMode=" + this.c + ", pendingWallMode=" + this.d + ", totalPostsCount=" + this.e + ", countPostsIsKnown=" + this.f + ", postponedCount=" + this.g + ", draftsCount=" + this.h + ", isPromotable=" + this.i + ", adsEasyPromoteCampaigns=" + this.j + ", wallIsAvailable=" + this.k + ", pinnedPostId=" + this.l + ", accessKey=" + this.m + ", parentRef=" + this.n + ", trackCode=" + this.o + ", isLoadingWall=" + this.p + ", listState=" + this.q + ')';
    }
}
