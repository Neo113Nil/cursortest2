package xsna;

import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.domain.state.LyricsScrollMode;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import com.vk.music.stickyplayer.domain.lyrics.TabLyricsMode;
import com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.by40;

/* compiled from: MusicPlayerReducer.kt */
/* loaded from: classes3.dex */
public final class my40 extends dm50<dz40, by40, sy40> {
    public com.vk.music.stats.a d;
    public final bpn0 e;
    public final bpn0 f;
    public final djb0 g;
    public final oj4 h;
    public final jue0 i;

    /* compiled from: MusicPlayerReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerUiMode.values().length];
            try {
                iArr[PlayerUiMode.RADIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerUiMode.PODCAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerUiMode.AUDIOBOOK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public my40(sy40 sy40Var) {
        super(sy40Var);
        this.e = new bpn0(new gc(21));
        this.f = new bpn0(new pr0(22));
        this.g = new djb0();
        this.h = new oj4();
        this.i = new jue0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        r3 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        r4 = r3.S;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[Catch: Exception -> 0x00aa, TRY_LEAVE, TryCatch #0 {Exception -> 0x00aa, blocks: (B:39:0x008c, B:41:0x0090, B:43:0x0094, B:27:0x00a5, B:23:0x009d, B:25:0x00a1), top: B:38:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    @Override // xsna.dm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sy40 c(sy40 sy40Var, by40 by40Var) {
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        MusicTrack musicTrack3;
        AlbumLink albumLink;
        String str;
        int i;
        sy40 sy40Var2 = sy40Var;
        by40 by40Var2 = by40Var;
        if (by40Var2 instanceof by40.m) {
            by40.m mVar = (by40.m) by40Var2;
            return sy40.a(sy40Var2, mVar.b, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, mVar.c, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, mVar.d, false, null, 467664894);
        }
        r4 = null;
        String str2 = null;
        if (by40Var2 instanceof by40.g) {
            by40.g gVar = (by40.g) by40Var2;
            PlayerTrack playerTrack = gVar.c;
            if (playerTrack != null) {
                String t = playerTrack.c.b.t();
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = MusicPlaybackLaunchContext.o;
                if (epx.f(t, musicPlaybackLaunchContext.t()) && this.d == null) {
                    this.d = new com.vk.music.stats.a(null);
                } else if (!epx.f(t, musicPlaybackLaunchContext.t()) && this.d != null) {
                    this.d = null;
                }
            }
            PlayerTrack playerTrack2 = gVar.c;
            if (playerTrack2 != null) {
                try {
                    musicTrack3 = playerTrack2.b;
                } catch (Exception unused) {
                }
                if (musicTrack3 != null && (albumLink = musicTrack3.q) != null && (str = albumLink.g) != null) {
                    str2 = str;
                    if (str2 != null) {
                        i = Color.parseColor(str2);
                        return sy40.a(sy40Var2, gVar.b, f870.c(i), gVar.c, new dy40(gVar.e, gVar.f, gVar.g, gVar.i, gVar.j, gVar.k), null, null, gVar.h, gVar.o, gVar.p, gVar.l / 1000, gVar.q / 1000, gVar.r, gVar.m, null, null, null, false, gVar.n, gVar.d, epx.f(sy40Var2.t, gVar.d) ? sy40Var2.u : false, false, null, null, gVar.s, gVar.t, null, false, false, null, 510779440);
                    }
                    i = -1;
                    return sy40.a(sy40Var2, gVar.b, f870.c(i), gVar.c, new dy40(gVar.e, gVar.f, gVar.g, gVar.i, gVar.j, gVar.k), null, null, gVar.h, gVar.o, gVar.p, gVar.l / 1000, gVar.q / 1000, gVar.r, gVar.m, null, null, null, false, gVar.n, gVar.d, epx.f(sy40Var2.t, gVar.d) ? sy40Var2.u : false, false, null, null, gVar.s, gVar.t, null, false, false, null, 510779440);
                }
            }
            if (str2 != null) {
            }
            i = -1;
            return sy40.a(sy40Var2, gVar.b, f870.c(i), gVar.c, new dy40(gVar.e, gVar.f, gVar.g, gVar.i, gVar.j, gVar.k), null, null, gVar.h, gVar.o, gVar.p, gVar.l / 1000, gVar.q / 1000, gVar.r, gVar.m, null, null, null, false, gVar.n, gVar.d, epx.f(sy40Var2.t, gVar.d) ? sy40Var2.u : false, false, null, null, gVar.s, gVar.t, null, false, false, null, 510779440);
        }
        if (by40Var2 instanceof by40.b0) {
            by40.b0 b0Var = (by40.b0) by40Var2;
            PlayerTrack playerTrack3 = sy40Var2.d;
            if (epx.f(playerTrack3 != null ? playerTrack3.b : null, b0Var.c)) {
                return sy40.a(sy40Var2, null, 0L, PlayerTrack.zb(sy40Var2.d, b0Var.c, 30), dy40.a(sy40Var2.e, b0Var.d, b0Var.e, true, false, 56), null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870899);
            }
        } else if (by40Var2 instanceof by40.e0) {
            by40.e0 e0Var = (by40.e0) by40Var2;
            PlayerTrack playerTrack4 = sy40Var2.d;
            if (epx.f(playerTrack4 != null ? playerTrack4.b : null, e0Var.c)) {
                return sy40.a(sy40Var2, null, 0L, PlayerTrack.zb(sy40Var2.d, e0Var.c, 30), dy40.a(sy40Var2.e, e0Var.d, e0Var.e, false, false, 60), null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870899);
            }
        } else {
            if (by40Var2 instanceof by40.u) {
                by40.u uVar = (by40.u) by40Var2;
                sy40Var2.l = uVar.b / 1000;
                sy40Var2.q.a(uVar.b);
                return sy40Var2;
            }
            if (by40Var2 instanceof by40.c) {
                sy40Var2.m = ((by40.c) by40Var2).b;
                return sy40Var2;
            }
            if (by40Var2 instanceof by40.v) {
                by40.v vVar = (by40.v) by40Var2;
                return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, vVar.b, vVar.c, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870527);
            }
            if (!(by40Var2 instanceof by40.i)) {
                if (by40Var2 instanceof by40.k) {
                    by40.k kVar = (by40.k) by40Var2;
                    PlayerTrack playerTrack5 = sy40Var2.d;
                    MusicTrack musicTrack4 = playerTrack5 != null ? playerTrack5.b : null;
                    MusicTrack musicTrack5 = kVar.b;
                    if (epx.f(musicTrack4, musicTrack5)) {
                        PlayerTrack playerTrack6 = sy40Var2.d;
                        playerTrack6.b = MusicTrack.zb(playerTrack6.b, 0, null, 0, 0, null, false, null, musicTrack5.J, false, false, null, null, null, -1, 1048571);
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, musicTrack5.J, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536866815);
                    }
                } else if (by40Var2 instanceof by40.j) {
                    MusicTrack musicTrack6 = ((by40.j) by40Var2).c;
                    PlayerTrack playerTrack7 = sy40Var2.d;
                    if (epx.f(playerTrack7 != null ? playerTrack7.b : null, musicTrack6)) {
                        return sy40.a(sy40Var2, null, 0L, null, dy40.a(sy40Var2.e, false, false, !r2.b, false, 59), null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870903);
                    }
                } else {
                    if (by40Var2 instanceof by40.z) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(sy40Var2.A);
                        by40.z zVar = (by40.z) by40Var2;
                        if (epx.f(linkedHashMap.getOrDefault(zVar.c, null), zVar.b)) {
                        }
                        s3q0 s3q0Var = s3q0.a;
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, linkedHashMap, false, false, null, 503316479);
                    }
                    if (by40Var2 instanceof by40.h) {
                        by40.h hVar = (by40.h) by40Var2;
                        return sy40.a(sy40Var2, null, 0L, null, null, hVar.b, hVar.c, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870863);
                    }
                    if (by40Var2 instanceof by40.p) {
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, LyricsScrollMode.AUTO, TabLyricsMode.CONTENT, ((by40.p) by40Var2).b, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536813567);
                    }
                    if (by40Var2.equals(by40.o.b)) {
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, TabLyricsMode.ERROR, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536854527);
                    }
                    if (by40Var2.equals(by40.q.b)) {
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, TabLyricsMode.LOADING, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536854527);
                    }
                    if (by40Var2.equals(by40.r.b)) {
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, TabLyricsMode.PLACEHOLDER, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536854527);
                    }
                    if (by40Var2 instanceof by40.e) {
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, ((by40.e) by40Var2).b, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536862719);
                    }
                    if (by40Var2 instanceof by40.f0) {
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, ((by40.f0) by40Var2).b, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536805375);
                    }
                    if (by40Var2 instanceof by40.d0) {
                        by40.d0 d0Var = (by40.d0) by40Var2;
                        ArrayList arrayList = new ArrayList(sy40Var2.f);
                        arrayList.add(d0Var.c, arrayList.remove(d0Var.b));
                        s3q0 s3q0Var2 = s3q0.a;
                        return sy40.a(sy40Var2, null, 0L, null, null, arrayList, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870895);
                    }
                    if (by40Var2 instanceof by40.s) {
                        AdvertisementInfo advertisementInfo = ((by40.s) by40Var2).b;
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, advertisementInfo != null ? advertisementInfo.b / 1000 : sy40Var2.k, 0, 0, null, null, null, null, false, advertisementInfo, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536739327);
                    }
                    if (by40Var2 instanceof by40.f) {
                        return sy40.a(sy40Var2, null, 0L, null, dy40.a(sy40Var2.e, false, false, false, ((by40.f) by40Var2).b, 47), null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870903);
                    }
                    if (by40Var2 instanceof by40.t) {
                        boolean z = ((by40.t) by40Var2).b;
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, z, z ? sy40Var2.w : OnboardingStrategy.None, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 533725183);
                    }
                    if (by40Var2 instanceof by40.a) {
                        return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, ((by40.a) by40Var2).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 532676607);
                    }
                    if (by40Var2 instanceof by40.b) {
                        if (epx.f(sy40Var2.x, ((by40.b) by40Var2).b)) {
                            return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 532676607);
                        }
                    } else if (by40Var2 instanceof by40.x) {
                        by40.x xVar = (by40.x) by40Var2;
                        PlayerTrack playerTrack8 = sy40Var2.d;
                        if (playerTrack8 != null && (musicTrack2 = playerTrack8.b) != null) {
                            int i2 = musicTrack2.b;
                            MusicTrack musicTrack7 = xVar.b;
                            if (i2 == musicTrack7.b) {
                                musicTrack2.c = musicTrack7.c;
                                musicTrack2.l = musicTrack7.l;
                                return sy40.a(sy40Var2, null, 0L, null, dy40.a(sy40Var2.e, false, true, false, false, 60), null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870903);
                            }
                        }
                    } else {
                        if (!(by40Var2 instanceof by40.y)) {
                            if (by40Var2 instanceof by40.c0) {
                                return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, ((by40.c0) by40Var2).b, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536346623);
                            }
                            if (by40Var2 instanceof by40.w) {
                                return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, ((by40.w) by40Var2).b, false, null, false, false, null, 528482303);
                            }
                            if (by40Var2 instanceof by40.a0) {
                                return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((by40.a0) by40Var2).b, null, false, false, null, 520093695);
                            }
                            if (by40Var2 instanceof by40.n) {
                                return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 469762047);
                            }
                            if (by40Var2 instanceof by40.l) {
                                return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, ((by40.l) by40Var2).b, null, 402653183);
                            }
                            if (by40Var2 instanceof by40.g0) {
                                return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, ((by40.g0) by40Var2).b, 268435455);
                            }
                            if (!by40Var2.equals(by40.d.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            lac lacVar = sy40Var2.D;
                            return sy40.a(sy40Var2, null, 0L, null, null, null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, lacVar != null ? new lac(lacVar.a, lacVar.b, "", lacVar.d) : null, 268435455);
                        }
                        by40.y yVar = (by40.y) by40Var2;
                        PlayerTrack playerTrack9 = sy40Var2.d;
                        if (playerTrack9 != null && (musicTrack = playerTrack9.b) != null) {
                            int i3 = musicTrack.b;
                            MusicTrack musicTrack8 = yVar.b;
                            if (i3 == musicTrack8.b) {
                                musicTrack.c = musicTrack8.c;
                                musicTrack.l = musicTrack8.l;
                                return sy40.a(sy40Var2, null, 0L, null, dy40.a(sy40Var2.e, true, false, false, false, 60), null, null, false, false, null, 0, 0, 0, null, null, null, null, false, null, null, false, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, null, false, false, null, 536870903);
                            }
                        }
                    }
                }
            }
        }
        return sy40Var2;
    }

    @Override // xsna.dm50
    public final dz40 d() {
        return new dz40(e(new hb40(this, 2)), e(new nl30(this, 5)), e(new ayo(this, 24)), e(new bq00(this, 12)));
    }

    @Override // xsna.dm50
    public final void h(sy40 sy40Var, dz40 dz40Var) {
        sy40 sy40Var2 = sy40Var;
        dz40 dz40Var2 = dz40Var;
        int i = a.$EnumSwitchMapping$0[sy40Var2.b.ordinal()];
        if (i == 1) {
            f(dz40Var2.d, sy40Var2);
            return;
        }
        if (i == 2) {
            f(dz40Var2.b, sy40Var2);
        } else if (i != 3) {
            f(dz40Var2.a, sy40Var2);
        } else {
            f(dz40Var2.c, sy40Var2);
        }
    }
}
