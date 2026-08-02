package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;

/* compiled from: MsgListBuilderContext.kt */
/* loaded from: classes2.dex */
public final class uk30 implements vk30 {
    public final boolean A;
    public final boolean B;
    public final ConversationCard C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final q9 G;
    public final pzv H;
    public final eew I;
    public final wvw J;
    public final kq4 K;
    public final g1l L;
    public final nmx0 M;
    public final w530 N;
    public final b9w O;
    public final g34 P;
    public final d2l0 Q;
    public final ev9 R;
    public final rxd0 S;
    public final f5v T;
    public final fmm U;
    public final abi0 V;
    public final n6p W;
    public final ipo0 X;
    public final hzm0 Y;
    public final io2 Z;
    public final /* synthetic */ vk30 a;
    public final kqb0 a0;
    public final List<e0l0> b;
    public final VkOnboardingComponent b0;
    public final ImBgSyncState c;
    public final pfj0 c0;
    public final DialogTheme d;
    public final v1o d0;
    public final ProfilesInfo e;
    public final qyd0 e0;
    public final ProfilesSimpleInfo f;
    public final DisplayNameFormatter f0;
    public final int g;
    public final com.vk.im.ui.formatters.a g0;
    public final Peer h;
    public final com.vk.movika.sdk.android.defaultplayer.layout.a h0;
    public final List<Integer> i;
    public final o040 i0;
    public final int j;
    public final wzs<DialogTheme, Boolean, vk30> j0;
    public final long k;
    public final Peer l;
    public final ChatSettings m;
    public final boolean n;
    public final h5q0 o;
    public final wz30 p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;
    public final List<Peer.Type> k0 = e43.l(Peer.Type.USER, Peer.Type.GROUP, Peer.Type.CHAT);
    public final StringBuilder l0 = new StringBuilder();

    public uk30(List list, ImBgSyncState imBgSyncState, DialogTheme dialogTheme, ProfilesInfo profilesInfo, ProfilesSimpleInfo profilesSimpleInfo, int i, Peer peer, List list2, int i2, long j, Peer peer2, ChatSettings chatSettings, boolean z, h5q0 h5q0Var, wz30 wz30Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, ConversationCard conversationCard, boolean z14, boolean z15, boolean z16, q9 q9Var, pzv pzvVar, eew eewVar, wvw wvwVar, kq4 kq4Var, g1l g1lVar, nmx0 nmx0Var, w530 w530Var, b9w b9wVar, g34 g34Var, d2l0 d2l0Var, ev9 ev9Var, rxd0 rxd0Var, f5v f5vVar, fmm fmmVar, abi0 abi0Var, n6p n6pVar, ipo0 ipo0Var, hzm0 hzm0Var, io2 io2Var, kqb0 kqb0Var, VkOnboardingComponent vkOnboardingComponent, pfj0 pfj0Var, v1o v1oVar, qyd0 qyd0Var, DisplayNameFormatter displayNameFormatter, com.vk.im.ui.formatters.a aVar, com.vk.movika.sdk.android.defaultplayer.layout.a aVar2, o040 o040Var, wzs wzsVar) {
        this.a = (vk30) wzsVar.invoke(dialogTheme, Boolean.valueOf(z2));
        this.b = list;
        this.c = imBgSyncState;
        this.d = dialogTheme;
        this.e = profilesInfo;
        this.f = profilesSimpleInfo;
        this.g = i;
        this.h = peer;
        this.i = list2;
        this.j = i2;
        this.k = j;
        this.l = peer2;
        this.m = chatSettings;
        this.n = z;
        this.o = h5q0Var;
        this.p = wz30Var;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = z5;
        this.u = z6;
        this.v = z7;
        this.w = z8;
        this.x = z9;
        this.y = z10;
        this.z = z11;
        this.A = z12;
        this.B = z13;
        this.C = conversationCard;
        this.D = z14;
        this.E = z15;
        this.F = z16;
        this.G = q9Var;
        this.H = pzvVar;
        this.I = eewVar;
        this.J = wvwVar;
        this.K = kq4Var;
        this.L = g1lVar;
        this.M = nmx0Var;
        this.N = w530Var;
        this.O = b9wVar;
        this.P = g34Var;
        this.Q = d2l0Var;
        this.R = ev9Var;
        this.S = rxd0Var;
        this.T = f5vVar;
        this.U = fmmVar;
        this.V = abi0Var;
        this.W = n6pVar;
        this.X = ipo0Var;
        this.Y = hzm0Var;
        this.Z = io2Var;
        this.a0 = kqb0Var;
        this.b0 = vkOnboardingComponent;
        this.c0 = pfj0Var;
        this.d0 = v1oVar;
        this.e0 = qyd0Var;
        this.f0 = displayNameFormatter;
        this.g0 = aVar;
        this.h0 = aVar2;
        this.i0 = o040Var;
        this.j0 = wzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [xsna.kqb0] */
    /* JADX WARN: Type inference failed for: r1v36, types: [xsna.io2] */
    /* JADX WARN: Type inference failed for: r1v37, types: [xsna.hzm0] */
    public static uk30 d(uk30 uk30Var, List list, ImBgSyncState imBgSyncState, DialogTheme dialogTheme, ProfilesInfo profilesInfo, ProfilesSimpleInfo profilesSimpleInfo, int i, Peer peer, List list2, int i2, long j, Peer peer2, ChatSettings chatSettings, boolean z, h5q0 h5q0Var, wz30 wz30Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, ConversationCard conversationCard, boolean z12, boolean z13, boolean z14, kq4 kq4Var, g1l g1lVar, nmx0 nmx0Var, w530 w530Var, b9w b9wVar, g34 g34Var, d2l0 d2l0Var, ev9 ev9Var, rxd0 rxd0Var, f5v f5vVar, fmm fmmVar, abi0 abi0Var, n6p n6pVar, ipo0 ipo0Var, izm0 izm0Var, bof bofVar, lqb0 lqb0Var, int i3, int i4) {
        List list3 = (i3 & 1) != 0 ? uk30Var.b : list;
        ImBgSyncState imBgSyncState2 = (i3 & 2) != 0 ? uk30Var.c : imBgSyncState;
        DialogTheme dialogTheme2 = (i3 & 4) != 0 ? uk30Var.d : dialogTheme;
        ProfilesInfo profilesInfo2 = (i3 & 8) != 0 ? uk30Var.e : profilesInfo;
        ProfilesSimpleInfo profilesSimpleInfo2 = (i3 & 16) != 0 ? uk30Var.f : profilesSimpleInfo;
        int i5 = (i3 & 32) != 0 ? uk30Var.g : i;
        Peer peer3 = (i3 & 64) != 0 ? uk30Var.h : peer;
        List list4 = (i3 & 128) != 0 ? uk30Var.i : list2;
        int i6 = (i3 & 256) != 0 ? uk30Var.j : i2;
        long j2 = (i3 & 512) != 0 ? uk30Var.k : j;
        Peer peer4 = (i3 & 1024) != 0 ? uk30Var.l : peer2;
        ChatSettings chatSettings2 = (i3 & 2048) != 0 ? uk30Var.m : chatSettings;
        boolean z15 = (i3 & 4096) != 0 ? uk30Var.n : z;
        h5q0 h5q0Var2 = (i3 & 8192) != 0 ? uk30Var.o : h5q0Var;
        wz30 wz30Var2 = (i3 & 16384) != 0 ? uk30Var.p : wz30Var;
        boolean z16 = (i3 & 32768) != 0 ? uk30Var.q : z2;
        boolean z17 = (i3 & 65536) != 0 ? uk30Var.r : z3;
        boolean z18 = (i3 & 131072) != 0 ? uk30Var.s : z4;
        boolean z19 = (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? uk30Var.t : z5;
        boolean z20 = (i3 & 524288) != 0 ? uk30Var.u : z6;
        boolean z21 = (i3 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? uk30Var.v : z7;
        boolean z22 = (2097152 & i3) != 0 ? uk30Var.w : z8;
        boolean z23 = (4194304 & i3) != 0 ? uk30Var.x : z9;
        boolean z24 = (8388608 & i3) != 0 ? uk30Var.y : z10;
        boolean z25 = (16777216 & i3) != 0 ? uk30Var.z : z11;
        boolean z26 = uk30Var.A;
        boolean z27 = uk30Var.B;
        uk30Var.getClass();
        ConversationCard conversationCard2 = (i3 & 268435456) != 0 ? uk30Var.C : conversationCard;
        boolean z28 = (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? uk30Var.D : z12;
        boolean z29 = (i3 & 1073741824) != 0 ? uk30Var.E : z13;
        boolean z30 = (i3 & Integer.MIN_VALUE) != 0 ? uk30Var.F : z14;
        q9 q9Var = uk30Var.G;
        pzv pzvVar = uk30Var.H;
        eew eewVar = uk30Var.I;
        wvw wvwVar = uk30Var.J;
        kq4 kq4Var2 = (i4 & 16) != 0 ? uk30Var.K : kq4Var;
        g1l g1lVar2 = (i4 & 32) != 0 ? uk30Var.L : g1lVar;
        nmx0 nmx0Var2 = (i4 & 64) != 0 ? uk30Var.M : nmx0Var;
        w530 w530Var2 = (i4 & 128) != 0 ? uk30Var.N : w530Var;
        b9w b9wVar2 = (i4 & 256) != 0 ? uk30Var.O : b9wVar;
        g34 g34Var2 = (i4 & 512) != 0 ? uk30Var.P : g34Var;
        d2l0 d2l0Var2 = (i4 & 1024) != 0 ? uk30Var.Q : d2l0Var;
        ev9 ev9Var2 = (i4 & 2048) != 0 ? uk30Var.R : ev9Var;
        rxd0 rxd0Var2 = (i4 & 4096) != 0 ? uk30Var.S : rxd0Var;
        f5v f5vVar2 = (i4 & 8192) != 0 ? uk30Var.T : f5vVar;
        fmm fmmVar2 = (i4 & 16384) != 0 ? uk30Var.U : fmmVar;
        abi0 abi0Var2 = (i4 & 32768) != 0 ? uk30Var.V : abi0Var;
        n6p n6pVar2 = (i4 & 65536) != 0 ? uk30Var.W : n6pVar;
        ipo0 ipo0Var2 = (i4 & 131072) != 0 ? uk30Var.X : ipo0Var;
        izm0 izm0Var2 = (i4 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? uk30Var.Y : izm0Var;
        bof bofVar2 = (i4 & 524288) != 0 ? uk30Var.Z : bofVar;
        lqb0 lqb0Var2 = (i4 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? uk30Var.a0 : lqb0Var;
        VkOnboardingComponent vkOnboardingComponent = uk30Var.b0;
        pfj0 pfj0Var = uk30Var.c0;
        v1o v1oVar = uk30Var.d0;
        qyd0 qyd0Var = uk30Var.e0;
        DisplayNameFormatter displayNameFormatter = uk30Var.f0;
        com.vk.im.ui.formatters.a aVar = uk30Var.g0;
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar2 = uk30Var.h0;
        o040 o040Var = uk30Var.i0;
        wzs<DialogTheme, Boolean, vk30> wzsVar = uk30Var.j0;
        uk30Var.getClass();
        return new uk30(list3, imBgSyncState2, dialogTheme2, profilesInfo2, profilesSimpleInfo2, i5, peer3, list4, i6, j2, peer4, chatSettings2, z15, h5q0Var2, wz30Var2, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, conversationCard2, z28, z29, z30, q9Var, pzvVar, eewVar, wvwVar, kq4Var2, g1lVar2, nmx0Var2, w530Var2, b9wVar2, g34Var2, d2l0Var2, ev9Var2, rxd0Var2, f5vVar2, fmmVar2, abi0Var2, n6pVar2, ipo0Var2, izm0Var2, bofVar2, lqb0Var2, vkOnboardingComponent, pfj0Var, v1oVar, qyd0Var, displayNameFormatter, aVar, aVar2, o040Var, wzsVar);
    }

    @Override // xsna.vk30
    public final boolean a() {
        return this.a.a();
    }

    @Override // xsna.vk30
    public final gl8 b(BubbleColors bubbleColors, int i, boolean z) {
        return this.a.b(bubbleColors, i, z);
    }

    @Override // xsna.vk30
    public final BubbleColors c(long j, boolean z, boolean z2) {
        return this.a.c(j, z, z2);
    }

    public final boolean e(boolean z, boolean z2) {
        return (!this.u || this.t) ? z2 : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk30)) {
            return false;
        }
        uk30 uk30Var = (uk30) obj;
        return epx.f(this.b, uk30Var.b) && this.c == uk30Var.c && epx.f(this.d, uk30Var.d) && epx.f(this.e, uk30Var.e) && epx.f(this.f, uk30Var.f) && this.g == uk30Var.g && epx.f(this.h, uk30Var.h) && epx.f(this.i, uk30Var.i) && this.j == uk30Var.j && this.k == uk30Var.k && epx.f(this.l, uk30Var.l) && epx.f(this.m, uk30Var.m) && this.n == uk30Var.n && epx.f(this.o, uk30Var.o) && epx.f(this.p, uk30Var.p) && this.q == uk30Var.q && this.r == uk30Var.r && this.s == uk30Var.s && this.t == uk30Var.t && this.u == uk30Var.u && this.v == uk30Var.v && this.w == uk30Var.w && this.x == uk30Var.x && this.y == uk30Var.y && this.z == uk30Var.z && this.A == uk30Var.A && this.B == uk30Var.B && epx.f(this.C, uk30Var.C) && this.D == uk30Var.D && this.E == uk30Var.E && this.F == uk30Var.F && epx.f(this.G, uk30Var.G) && epx.f(this.H, uk30Var.H) && epx.f(this.I, uk30Var.I) && epx.f(this.J, uk30Var.J) && epx.f(this.K, uk30Var.K) && epx.f(this.L, uk30Var.L) && epx.f(this.M, uk30Var.M) && epx.f(this.N, uk30Var.N) && epx.f(this.O, uk30Var.O) && epx.f(this.P, uk30Var.P) && epx.f(this.Q, uk30Var.Q) && epx.f(this.R, uk30Var.R) && epx.f(this.S, uk30Var.S) && epx.f(this.T, uk30Var.T) && epx.f(this.U, uk30Var.U) && epx.f(this.V, uk30Var.V) && epx.f(this.W, uk30Var.W) && epx.f(this.X, uk30Var.X) && epx.f(this.Y, uk30Var.Y) && epx.f(this.Z, uk30Var.Z) && epx.f(this.a0, uk30Var.a0) && epx.f(this.b0, uk30Var.b0) && epx.f(this.c0, uk30Var.c0) && epx.f(this.d0, uk30Var.d0) && epx.f(this.e0, uk30Var.e0) && epx.f(this.f0, uk30Var.f0) && epx.f(this.g0, uk30Var.g0) && epx.f(this.h0, uk30Var.h0) && epx.f(this.i0, uk30Var.i0) && epx.f(this.j0, uk30Var.j0);
    }

    public final boolean f(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        Boolean valueOf = gVar2 != null ? Boolean.valueOf(g(gVar2, gVar2, gVar2.K0())) : null;
        return (!gVar.H0() || valueOf == null) ? g(gVar, gVar2, gVar.K0()) : valueOf.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
    
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b2, code lost:
    
        if (r8 != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e9, code lost:
    
        if (r6.Q0(r7) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2, boolean z) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0;
        boolean z2;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        c.C1166c c1166c;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E03 = gVar.E0();
        boolean z8 = (E03 == null || (c1166c = E03.D) == null) ? false : c1166c.o;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E04 = gVar.E0();
        c.g gVar3 = E04 != null ? E04.E : null;
        boolean z9 = z8 && gVar3 != null && (gVar3.f > 1 || gVar3.a || gVar3.c);
        if (this.r && !z && ((!gVar.N() || gVar.l0() || gVar.O()) && (((E0 = gVar.E0()) == null || !E0.x) && (!z8 || z9)))) {
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E05 = gVar.E0();
            if (E05 != null) {
                c.C1166c c1166c2 = E05.D;
                if (c1166c2 != null ? c1166c2.p : false) {
                    z2 = true;
                    if (z2) {
                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E06 = gVar.E0();
                        if (E06 != null) {
                            c.C1166c c1166c3 = E06.D;
                            if (c1166c3 != null ? c1166c3.k : false) {
                                z7 = true;
                            }
                        }
                        z7 = false;
                    }
                    E02 = gVar.E0();
                    if (E02 != null) {
                        c.C1166c c1166c4 = E02.D;
                        if (c1166c4 != null ? c1166c4.q : false) {
                            z3 = true;
                            if (z3) {
                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E07 = gVar.E0();
                                if (E07 != null) {
                                    c.C1166c c1166c5 = E07.D;
                                    if (c1166c5 != null ? c1166c5.k : false) {
                                        z6 = true;
                                    }
                                }
                                z6 = false;
                            }
                            if (gVar.F0()) {
                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E08 = gVar.E0();
                                if (E08 != null) {
                                    c.C1166c c1166c6 = E08.D;
                                    if (c1166c6 != null ? c1166c6.k : false) {
                                        z4 = true;
                                        if (!z4) {
                                            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E09 = gVar.E0();
                                            if (E09 != null) {
                                                c.C1166c c1166c7 = E09.D;
                                                if (c1166c7 != null ? c1166c7.i : false) {
                                                    z5 = true;
                                                    if (!z5) {
                                                    }
                                                }
                                            }
                                            z5 = false;
                                            if (!z5) {
                                            }
                                        }
                                    }
                                }
                                z4 = false;
                                if (!z4) {
                                }
                            }
                            if (!gVar.u0() && !gVar.g0()) {
                                return true;
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                    }
                    if (gVar.F0()) {
                    }
                    if (!gVar.u0()) {
                        return true;
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
            E02 = gVar.E0();
            if (E02 != null) {
            }
            z3 = false;
            if (z3) {
            }
            if (gVar.F0()) {
            }
            if (!gVar.u0()) {
            }
        }
        return false;
    }

    public final boolean h(boolean z) {
        boolean z2;
        if (this.y && this.z) {
            if (this.k0.contains(this.h.c)) {
                z2 = true;
                return !z && z2;
            }
        }
        z2 = false;
        if (z) {
        }
    }

    public final int hashCode() {
        int a = bh10.a(bh10.a(shy.a(this.j, fw3.a(bh10.a(shy.a(this.g, io.reactivex.rxjava3.subjects.c.a(this.f, ur.b(this.e, (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31, this.h.b), 31, this.i), 31), 31, this.k), 31, this.l.b);
        ChatSettings chatSettings = this.m;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.p.hashCode() + shy.a(this.o.a, qoy.b((a + (chatSettings == null ? 0 : chatSettings.hashCode())) * 31, 31, this.n), 31)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, false);
        ConversationCard conversationCard = this.C;
        int hashCode = (this.H.hashCode() + ((this.G.hashCode() + qoy.b(qoy.b(qoy.b((b + (conversationCard == null ? 0 : conversationCard.hashCode())) * 31, 31, this.D), 31, this.E), 31, this.F)) * 31)) * 31;
        eew eewVar = this.I;
        int hashCode2 = (this.J.hashCode() + ((hashCode + (eewVar == null ? 0 : eewVar.hashCode())) * 31)) * 31;
        kq4 kq4Var = this.K;
        int hashCode3 = (hashCode2 + (kq4Var == null ? 0 : kq4Var.hashCode())) * 31;
        g1l g1lVar = this.L;
        int hashCode4 = (hashCode3 + (g1lVar == null ? 0 : g1lVar.hashCode())) * 31;
        nmx0 nmx0Var = this.M;
        int hashCode5 = (hashCode4 + (nmx0Var == null ? 0 : nmx0Var.hashCode())) * 31;
        w530 w530Var = this.N;
        int hashCode6 = (hashCode5 + (w530Var == null ? 0 : w530Var.hashCode())) * 31;
        b9w b9wVar = this.O;
        int hashCode7 = (hashCode6 + (b9wVar == null ? 0 : b9wVar.hashCode())) * 31;
        g34 g34Var = this.P;
        int hashCode8 = (hashCode7 + (g34Var == null ? 0 : g34Var.hashCode())) * 31;
        d2l0 d2l0Var = this.Q;
        int hashCode9 = (hashCode8 + (d2l0Var == null ? 0 : d2l0Var.hashCode())) * 31;
        ev9 ev9Var = this.R;
        int hashCode10 = (hashCode9 + (ev9Var == null ? 0 : ev9Var.hashCode())) * 31;
        rxd0 rxd0Var = this.S;
        int hashCode11 = (hashCode10 + (rxd0Var == null ? 0 : rxd0Var.hashCode())) * 31;
        f5v f5vVar = this.T;
        int hashCode12 = (hashCode11 + (f5vVar == null ? 0 : f5vVar.hashCode())) * 31;
        fmm fmmVar = this.U;
        int hashCode13 = (hashCode12 + (fmmVar == null ? 0 : fmmVar.hashCode())) * 31;
        abi0 abi0Var = this.V;
        int hashCode14 = (hashCode13 + (abi0Var == null ? 0 : abi0Var.hashCode())) * 31;
        n6p n6pVar = this.W;
        int hashCode15 = (hashCode14 + (n6pVar == null ? 0 : n6pVar.hashCode())) * 31;
        ipo0 ipo0Var = this.X;
        int hashCode16 = (hashCode15 + (ipo0Var == null ? 0 : ipo0Var.hashCode())) * 31;
        hzm0 hzm0Var = this.Y;
        int hashCode17 = (hashCode16 + (hzm0Var == null ? 0 : hzm0Var.hashCode())) * 31;
        io2 io2Var = this.Z;
        int hashCode18 = (hashCode17 + (io2Var == null ? 0 : io2Var.hashCode())) * 31;
        kqb0 kqb0Var = this.a0;
        int hashCode19 = (hashCode18 + (kqb0Var == null ? 0 : kqb0Var.hashCode())) * 31;
        VkOnboardingComponent vkOnboardingComponent = this.b0;
        int hashCode20 = (this.f0.hashCode() + ((this.e0.hashCode() + ((this.d0.hashCode() + ((this.c0.hashCode() + ((hashCode19 + (vkOnboardingComponent == null ? 0 : vkOnboardingComponent.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        com.vk.im.ui.formatters.a aVar = this.g0;
        int hashCode21 = (hashCode20 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        com.vk.movika.sdk.android.defaultplayer.layout.a aVar2 = this.h0;
        int hashCode22 = aVar2 != null ? aVar2.hashCode() : 0;
        return this.j0.hashCode() + ((this.i0.hashCode() + ((hashCode21 + hashCode22) * 31)) * 31);
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public final xsna.jr30 i(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public final String toString() {
        return "MsgListBuilderContext(videoMessagesStencils=" + this.b + ", bgSyncState=" + this.c + ", dialogTheme=" + this.d + ", profiles=" + this.e + ", profilesSimpleInfo=" + this.f + ", readTillOutMsgCnvId=" + this.g + ", dialogPeer=" + this.h + ", unreadReactions=" + this.i + ", pinnedMsgCnvId=" + this.j + ", hackMsgSendingStatusTimeout=" + this.k + ", currentMember=" + this.l + ", chatSettings=" + this.m + ", hasUnreadMsgs=" + this.n + ", unreadMessageConfig=" + this.o + ", shimmerSkeletonConfig=" + this.p + ", isBackgroundVisible=" + this.q + ", isDialogHasGradientBubble=" + this.r + ", canChangeTheme=" + this.s + ", isChannel=" + this.t + ", isChat=" + this.u + ", isCasperChat=" + this.v + ", isAvailableReactions=" + this.w + ", isPaidReactionAvailable=" + this.x + ", canWrite=" + this.y + ", msgRequestStatusIsSuccessful=" + this.z + ", isChangeStyleAvailable=" + this.A + ", isEduAccount=" + this.B + ", inWallPost=false, conversationCard=" + this.C + ", callsRestricted=" + this.D + ", isVideoTranscriptEnabled=" + this.E + ", isAudioTranscriptEnabled=" + this.F + ", experimentsProvider=" + this.G + ", config=" + this.H + ", uiReporters=" + this.I + ", infoBridge=" + this.J + ", audioMediator=" + this.K + ", dateStickyVisibilityMediator=" + this.L + ", widgetConstructor=" + this.M + ", moderationWrapperManager=" + this.N + ", mediaPlayer=" + this.O + ", attachProgressProvider=" + this.P + ", stickerAnimationStateMediator=" + this.Q + ", carouselPositionMediator=" + this.R + ", profilesSimpleInfoMediator=" + this.S + ", highlightMessageMediator=" + this.T + ", dialogUnreadMsgMediator=" + this.U + ", selectedMessagesMediator=" + this.V + ", eduOrganizationMediator=" + this.W + ", themeNamesMediator=" + this.X + ", subscriptionProgressMediator=" + this.Y + ", animationDialogCallback=" + this.Z + ", pollMediator=" + this.a0 + ", onboardingComponent=" + this.b0 + ", replyContentFormatter=" + this.c0 + ", donutPriceFormatter=" + this.d0 + ", profileNameSpannableFormatter=" + this.e0 + ", displayNameFormatter=" + this.f0 + ", msgAttachFormatter=" + this.g0 + ", resources=" + this.h0 + ", msgTextBuilder=" + this.i0 + ", themeProvider=" + this.j0 + ')';
    }
}
