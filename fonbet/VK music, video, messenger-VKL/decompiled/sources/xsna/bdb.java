package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: ChannelStorageModel.kt */
/* loaded from: classes2.dex */
public final class bdb implements htx0 {
    public final String A;
    public final String B;
    public final String C;
    public final Boolean D;
    public final AdminLevel E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final vcb i;
    public final vcb j;
    public final aeb k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final ChannelNotificationsSettings p;
    public final ChannelNotificationsSettings q;
    public final int r;
    public final int s;
    public final ChannelActionInProgress t;
    public final Long u;
    public final ChannelType v;
    public final Long w;
    public final ChannelBanInfo x;
    public final Integer y;
    public final Boolean z;

    public bdb(long j, int i, int i2, int i3, int i4, int i5, int i6, vcb vcbVar, vcb vcbVar2, aeb aebVar, boolean z, boolean z2, boolean z3, boolean z4, ChannelNotificationsSettings channelNotificationsSettings, ChannelNotificationsSettings channelNotificationsSettings2, int i7, int i8, ChannelActionInProgress channelActionInProgress, Long l, ChannelType channelType, Long l2, ChannelBanInfo channelBanInfo, Integer num, Boolean bool, String str, String str2, String str3, Boolean bool2, AdminLevel adminLevel, boolean z5, boolean z6, boolean z7, boolean z8, int i9) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = vcbVar;
        this.j = vcbVar2;
        this.k = aebVar;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = channelNotificationsSettings;
        this.q = channelNotificationsSettings2;
        this.r = i7;
        this.s = i8;
        this.t = channelActionInProgress;
        this.u = l;
        this.v = channelType;
        this.w = l2;
        this.x = channelBanInfo;
        this.y = num;
        this.z = bool;
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = bool2;
        this.E = adminLevel;
        this.F = z5;
        this.G = z6;
        this.H = z7;
        this.I = z8;
        this.J = i9;
        if (!aebVar.b.equals(gkx0.d) && !aebVar.c() && j != aebVar.c) {
            throw new IllegalStateException("Wrong weight for channel");
        }
        if (!vcbVar.b.equals(vjm.l) && !vcbVar.b.equals(vjm.m) && j != vcbVar.c) {
            throw new IllegalStateException("Wrong sortId for channel");
        }
    }

    public static bdb a(bdb bdbVar, int i, int i2, int i3, int i4, int i5, int i6, vcb vcbVar, vcb vcbVar2, aeb aebVar, boolean z, boolean z2, ChannelNotificationsSettings channelNotificationsSettings, ChannelNotificationsSettings channelNotificationsSettings2, int i7, ChannelActionInProgress channelActionInProgress, Long l, ChannelBanInfo channelBanInfo, Integer num, Boolean bool, String str, String str2, Boolean bool2, AdminLevel adminLevel, boolean z3, boolean z4, int i8, int i9) {
        int i10;
        int i11;
        Long l2;
        ChannelBanInfo channelBanInfo2;
        String str3;
        String str4;
        boolean z5;
        boolean z6;
        long j = bdbVar.b;
        int i12 = (i8 & 2) != 0 ? bdbVar.c : i;
        int i13 = (i8 & 4) != 0 ? bdbVar.d : i2;
        int i14 = (i8 & 8) != 0 ? bdbVar.e : i3;
        int i15 = (i8 & 16) != 0 ? bdbVar.f : i4;
        int i16 = (i8 & 32) != 0 ? bdbVar.g : i5;
        int i17 = (i8 & 64) != 0 ? bdbVar.h : i6;
        vcb vcbVar3 = (i8 & 128) != 0 ? bdbVar.i : vcbVar;
        vcb vcbVar4 = (i8 & 256) != 0 ? bdbVar.j : vcbVar2;
        aeb aebVar2 = (i8 & 512) != 0 ? bdbVar.k : aebVar;
        boolean z7 = (i8 & 1024) != 0 ? bdbVar.l : z;
        boolean z8 = (i8 & 2048) != 0 ? bdbVar.m : z2;
        boolean z9 = (i8 & 4096) != 0 ? bdbVar.n : false;
        boolean z10 = bdbVar.o;
        ChannelNotificationsSettings channelNotificationsSettings3 = (i8 & 16384) != 0 ? bdbVar.p : channelNotificationsSettings;
        ChannelNotificationsSettings channelNotificationsSettings4 = (i8 & 32768) != 0 ? bdbVar.q : channelNotificationsSettings2;
        int i18 = bdbVar.r;
        if ((i8 & 131072) != 0) {
            i10 = i18;
            i11 = bdbVar.s;
        } else {
            i10 = i18;
            i11 = i7;
        }
        ChannelActionInProgress channelActionInProgress2 = (i8 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? bdbVar.t : channelActionInProgress;
        Long l3 = (i8 & 524288) != 0 ? bdbVar.u : l;
        ChannelType channelType = bdbVar.v;
        Long l4 = bdbVar.w;
        if ((i8 & 4194304) != 0) {
            l2 = l4;
            channelBanInfo2 = bdbVar.x;
        } else {
            l2 = l4;
            channelBanInfo2 = channelBanInfo;
        }
        Integer num2 = (i8 & 8388608) != 0 ? bdbVar.y : num;
        Boolean bool3 = (i8 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? bdbVar.z : bool;
        String str5 = bdbVar.A;
        if ((i8 & 67108864) != 0) {
            str3 = str5;
            str4 = bdbVar.B;
        } else {
            str3 = str5;
            str4 = str;
        }
        String str6 = (i8 & 134217728) != 0 ? bdbVar.C : str2;
        Boolean bool4 = (i8 & 268435456) != 0 ? bdbVar.D : bool2;
        AdminLevel adminLevel2 = (i8 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? bdbVar.E : adminLevel;
        boolean z11 = bdbVar.F;
        if ((i8 & Integer.MIN_VALUE) != 0) {
            z5 = z11;
            z6 = bdbVar.G;
        } else {
            z5 = z11;
            z6 = z3;
        }
        boolean z12 = (i9 & 1) != 0 ? bdbVar.H : z4;
        boolean z13 = bdbVar.I;
        int i19 = bdbVar.J;
        bdbVar.getClass();
        return new bdb(j, i12, i13, i14, i15, i16, i17, vcbVar3, vcbVar4, aebVar2, z7, z8, z9, z10, channelNotificationsSettings3, channelNotificationsSettings4, i10, i11, channelActionInProgress2, l3, channelType, l2, channelBanInfo2, num2, bool3, str3, str4, str6, bool4, adminLevel2, z5, z6, z12, z13, i19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdb)) {
            return false;
        }
        bdb bdbVar = (bdb) obj;
        return this.b == bdbVar.b && this.c == bdbVar.c && this.d == bdbVar.d && this.e == bdbVar.e && this.f == bdbVar.f && this.g == bdbVar.g && this.h == bdbVar.h && epx.f(this.i, bdbVar.i) && epx.f(this.j, bdbVar.j) && epx.f(this.k, bdbVar.k) && this.l == bdbVar.l && this.m == bdbVar.m && this.n == bdbVar.n && this.o == bdbVar.o && epx.f(this.p, bdbVar.p) && epx.f(this.q, bdbVar.q) && this.r == bdbVar.r && this.s == bdbVar.s && this.t == bdbVar.t && epx.f(this.u, bdbVar.u) && this.v == bdbVar.v && epx.f(this.w, bdbVar.w) && epx.f(this.x, bdbVar.x) && epx.f(this.y, bdbVar.y) && epx.f(this.z, bdbVar.z) && epx.f(this.A, bdbVar.A) && epx.f(this.B, bdbVar.B) && epx.f(this.C, bdbVar.C) && epx.f(this.D, bdbVar.D) && this.E == bdbVar.E && this.F == bdbVar.F && this.G == bdbVar.G && this.H == bdbVar.H && this.I == bdbVar.I && this.J == bdbVar.J;
    }

    @Override // xsna.htx0
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + shy.a(this.h, shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31)) * 31;
        vcb vcbVar = this.j;
        int hashCode2 = (this.p.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((this.k.hashCode() + ((hashCode + (vcbVar == null ? 0 : vcbVar.hashCode())) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o)) * 31;
        ChannelNotificationsSettings channelNotificationsSettings = this.q;
        int hashCode3 = (this.t.hashCode() + shy.a(this.s, shy.a(this.r, (hashCode2 + (channelNotificationsSettings == null ? 0 : channelNotificationsSettings.hashCode())) * 31, 31), 31)) * 31;
        Long l = this.u;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        ChannelType channelType = this.v;
        int hashCode5 = (hashCode4 + (channelType == null ? 0 : channelType.hashCode())) * 31;
        Long l2 = this.w;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        ChannelBanInfo channelBanInfo = this.x;
        int hashCode7 = (hashCode6 + (channelBanInfo == null ? 0 : channelBanInfo.hashCode())) * 31;
        Integer num = this.y;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.z;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A;
        int a = urd0.a(urd0.a((hashCode9 + (str == null ? 0 : str.hashCode())) * 31, 31, this.B), 31, this.C);
        Boolean bool2 = this.D;
        int hashCode10 = (a + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AdminLevel adminLevel = this.E;
        return Integer.hashCode(this.J) + qoy.b(qoy.b(qoy.b(qoy.b((hashCode10 + (adminLevel != null ? adminLevel.hashCode() : 0)) * 31, 31, this.F), 31, this.G), 31, this.H), 31, this.I);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelStorageModel(id=");
        sb.append(this.b);
        sb.append(", lastMsgCnvId=");
        sb.append(this.c);
        sb.append(", readTillInMsgCnvId=");
        sb.append(this.d);
        sb.append(", readTillInMsgCnvIdLocal=");
        sb.append(this.e);
        sb.append(", countUnread=");
        sb.append(this.f);
        sb.append(", countUnreadLocal=");
        sb.append(this.g);
        sb.append(", countPostponed=");
        sb.append(this.h);
        sb.append(", sortIdServer=");
        sb.append(this.i);
        sb.append(", sortIdLocal=");
        sb.append(this.j);
        sb.append(", weight=");
        sb.append(this.k);
        sb.append(", isArchived=");
        sb.append(this.l);
        sb.append(", isMember=");
        sb.append(this.m);
        sb.append(", isSuggested=");
        sb.append(this.n);
        sb.append(", isOwner=");
        sb.append(this.o);
        sb.append(", notificationsSettings=");
        sb.append(this.p);
        sb.append(", notificationsSettingsLocal=");
        sb.append(this.q);
        sb.append(", phase=");
        sb.append(this.r);
        sb.append(", pinnedMsgsPhase=");
        sb.append(this.s);
        sb.append(", actionInProgress=");
        sb.append(this.t);
        sb.append(", lastHistoryExpiredTime=");
        sb.append(this.u);
        sb.append(", type=");
        sb.append(this.v);
        sb.append(", parentId=");
        sb.append(this.w);
        sb.append(", banInfo=");
        sb.append(this.x);
        sb.append(", membersCount=");
        sb.append(this.y);
        sb.append(", canComment=");
        sb.append(this.z);
        sb.append(", trackCode=");
        sb.append(this.A);
        sb.append(", title=");
        sb.append(this.B);
        sb.append(", avatar=");
        sb.append(this.C);
        sb.append(", canPost=");
        sb.append(this.D);
        sb.append(", adminLevel=");
        sb.append(this.E);
        sb.append(", isAdult=");
        sb.append(this.F);
        sb.append(", isHiddenInAllFolder=");
        sb.append(this.G);
        sb.append(", canPostDonut=");
        sb.append(this.H);
        sb.append(", isPaidReactionsAvailable=");
        sb.append(this.I);
        sb.append(", paidReactionCost=");
        return vu5.b(sb, this.J, ')');
    }
}
