package xsna;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.models.offline.VideoScreenMode;

/* compiled from: VideoBottomSheetParams.kt */
/* loaded from: classes3.dex */
public final class s6s0 {
    public final VideoFile a;
    public final String b;
    public final boolean c;
    public final UserId d;
    public final k78 e;
    public final boolean f;
    public final boolean g;
    public final Integer h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Integer m;
    public final UserId n;
    public final s60 o;
    public final String p;
    public final UserId q;
    public final boolean r;
    public final rcg0 s;
    public final boolean t;
    public final VideoScreenMode u;
    public final boolean v;
    public final hfs0 w;
    public final com.vk.video.ui.share.api.b x;
    public final UserId y;
    public final boolean z;

    public s6s0(VideoFile videoFile, String str, boolean z, UserId userId, k78 k78Var, boolean z2, boolean z3, Integer num, String str2, boolean z4, boolean z5, boolean z6, Integer num2, UserId userId2, s60 s60Var, String str3, UserId userId3, boolean z7, rcg0 rcg0Var, boolean z8, VideoScreenMode videoScreenMode, boolean z9, hfs0 hfs0Var, com.vk.video.ui.share.api.b bVar, UserId userId4, boolean z10) {
        this.a = videoFile;
        this.b = str;
        this.c = z;
        this.d = userId;
        this.e = k78Var;
        this.f = z2;
        this.g = z3;
        this.h = num;
        this.i = str2;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = num2;
        this.n = userId2;
        this.o = s60Var;
        this.p = str3;
        this.q = userId3;
        this.r = z7;
        this.s = rcg0Var;
        this.t = z8;
        this.u = videoScreenMode;
        this.v = z9;
        this.w = hfs0Var;
        this.x = bVar;
        this.y = userId4;
        this.z = z10;
    }

    public static s6s0 a(s6s0 s6s0Var, UserId userId) {
        VideoFile videoFile = s6s0Var.a;
        String str = s6s0Var.b;
        boolean z = s6s0Var.c;
        UserId userId2 = s6s0Var.d;
        k78 k78Var = s6s0Var.e;
        boolean z2 = s6s0Var.f;
        boolean z3 = s6s0Var.g;
        Integer num = s6s0Var.h;
        s6s0Var.getClass();
        String str2 = s6s0Var.i;
        s6s0Var.getClass();
        boolean z4 = s6s0Var.j;
        boolean z5 = s6s0Var.k;
        boolean z6 = s6s0Var.l;
        Integer num2 = s6s0Var.m;
        UserId userId3 = s6s0Var.n;
        s6s0Var.getClass();
        s60 s60Var = s6s0Var.o;
        String str3 = s6s0Var.p;
        boolean z7 = s6s0Var.r;
        rcg0 rcg0Var = s6s0Var.s;
        boolean z8 = s6s0Var.t;
        VideoScreenMode videoScreenMode = s6s0Var.u;
        boolean z9 = s6s0Var.v;
        hfs0 hfs0Var = s6s0Var.w;
        com.vk.video.ui.share.api.b bVar = s6s0Var.x;
        UserId userId4 = s6s0Var.y;
        boolean z10 = s6s0Var.z;
        s6s0Var.getClass();
        return new s6s0(videoFile, str, z, userId2, k78Var, z2, z3, num, str2, z4, z5, z6, num2, userId3, s60Var, str3, userId, z7, rcg0Var, z8, videoScreenMode, z9, hfs0Var, bVar, userId4, z10);
    }

    public final boolean b() {
        return epx.f(this.p, "VIDEO_DISCOVERY");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6s0)) {
            return false;
        }
        s6s0 s6s0Var = (s6s0) obj;
        return epx.f(this.a, s6s0Var.a) && epx.f(this.b, s6s0Var.b) && this.c == s6s0Var.c && epx.f(this.d, s6s0Var.d) && epx.f(this.e, s6s0Var.e) && this.f == s6s0Var.f && this.g == s6s0Var.g && epx.f(this.h, s6s0Var.h) && epx.f(this.i, s6s0Var.i) && this.j == s6s0Var.j && this.k == s6s0Var.k && this.l == s6s0Var.l && epx.f(this.m, s6s0Var.m) && epx.f(this.n, s6s0Var.n) && epx.f(this.o, s6s0Var.o) && epx.f(this.p, s6s0Var.p) && epx.f(this.q, s6s0Var.q) && this.r == s6s0Var.r && epx.f(this.s, s6s0Var.s) && this.t == s6s0Var.t && this.u == s6s0Var.u && this.v == s6s0Var.v && epx.f(this.w, s6s0Var.w) && epx.f(this.x, s6s0Var.x) && epx.f(this.y, s6s0Var.y) && this.z == s6s0Var.z;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int a = bh10.a(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d.b);
        k78 k78Var = this.e;
        int b = qoy.b(qoy.b((a + (k78Var == null ? 0 : k78Var.hashCode())) * 31, 31, this.f), 31, this.g);
        Integer num = this.h;
        int b2 = qoy.b((b + (num == null ? 0 : num.hashCode())) * 31, 31, false);
        String str2 = this.i;
        int b3 = qoy.b(qoy.b(qoy.b(qoy.b((b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false), 31, this.j), 31, this.k), 31, this.l);
        Integer num2 = this.m;
        int hashCode2 = (b3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.n;
        int b4 = qoy.b((hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, false);
        s60 s60Var = this.o;
        int a2 = urd0.a((b4 + (s60Var == null ? 0 : s60Var.hashCode())) * 31, 31, this.p);
        UserId userId2 = this.q;
        int b5 = qoy.b((a2 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31, 31, this.r);
        rcg0 rcg0Var = this.s;
        int b6 = qoy.b((b5 + (rcg0Var == null ? 0 : rcg0Var.hashCode())) * 31, 31, this.t);
        VideoScreenMode videoScreenMode = this.u;
        int b7 = qoy.b((b6 + (videoScreenMode == null ? 0 : videoScreenMode.hashCode())) * 31, 31, this.v);
        hfs0 hfs0Var = this.w;
        int hashCode3 = (b7 + (hfs0Var == null ? 0 : hfs0Var.hashCode())) * 31;
        com.vk.video.ui.share.api.b bVar = this.x;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        UserId userId3 = this.y;
        return Boolean.hashCode(this.z) + ((hashCode4 + (userId3 != null ? Long.hashCode(userId3.b) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoBottomSheetParams(video=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", shouldNotifyVideoUpdates=");
        sb.append(this.c);
        sb.append(", targetId=");
        sb.append(this.d);
        sb.append(", stateCallback=");
        sb.append(this.e);
        sb.append(", forceDarkTheme=");
        sb.append(this.f);
        sb.append(", isUserAlbum=");
        sb.append(this.g);
        sb.append(", iconTint=");
        sb.append(this.h);
        sb.append(", isTopClip=false, trackCode=");
        sb.append(this.i);
        sb.append(", isFromProfile=false, isFromViewHistory=");
        sb.append(this.j);
        sb.append(", isForMediaViewer=");
        sb.append(this.k);
        sb.append(", needToShowDeleteFromLikedItem=");
        sb.append(this.l);
        sb.append(", albumId=");
        sb.append(this.m);
        sb.append(", albumOwnerId=");
        sb.append(this.n);
        sb.append(", isAnonymous=false, actionTracker=");
        sb.append(this.o);
        sb.append(", fromScreen=");
        sb.append(this.p);
        sb.append(", pinOwnerId=");
        sb.append(this.q);
        sb.append(", fromFullscreen=");
        sb.append(this.r);
        sb.append(", restrictedUserActions=");
        sb.append(this.s);
        sb.append(", shareWithTime=");
        sb.append(this.t);
        sb.append(", screenMode=");
        sb.append(this.u);
        sb.append(", shouldShowNotInterestedButton=");
        sb.append(this.v);
        sb.append(", discoveryActionsTracker=");
        sb.append(this.w);
        sb.append(", videoShareLinkModifier=");
        sb.append(this.x);
        sb.append(", currentUserId=");
        sb.append(this.y);
        sb.append(", isSharingEnabled=");
        return defpackage.q0.a(sb, this.z, ')');
    }

    public /* synthetic */ s6s0(VideoFile videoFile, String str, UserId userId, nz20 nz20Var, boolean z, String str2, boolean z2, boolean z3, boolean z4, Integer num, UserId userId2, s60 s60Var, String str3, boolean z5, rcg0 rcg0Var, boolean z6, VideoScreenMode videoScreenMode, boolean z7, hfs0 hfs0Var, com.vk.video.ui.share.api.b bVar, UserId userId3, boolean z8, int i) {
        this(videoFile, (i & 2) != 0 ? null : str, (i & 4) == 0, (i & 8) != 0 ? UserId.d : userId, (i & 16) != 0 ? null : nz20Var, (i & 32) == 0, (i & 64) != 0 ? false : z, null, (i & 512) != 0 ? null : str2, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? false : z3, (i & 8192) != 0 ? false : z4, (i & 16384) != 0 ? null : num, (32768 & i) != 0 ? null : userId2, (131072 & i) != 0 ? null : s60Var, (262144 & i) != 0 ? NativeAdContent.ViewTag.OTHER : str3, null, (1048576 & i) != 0 ? false : z5, (2097152 & i) != 0 ? null : rcg0Var, (4194304 & i) != 0 ? false : z6, (8388608 & i) != 0 ? null : videoScreenMode, (16777216 & i) != 0 ? true : z7, (33554432 & i) != 0 ? null : hfs0Var, (67108864 & i) != 0 ? null : bVar, (134217728 & i) != 0 ? null : userId3, (i & 268435456) != 0 ? true : z8);
    }
}
