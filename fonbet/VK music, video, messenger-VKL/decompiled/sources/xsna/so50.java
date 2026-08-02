package xsna;

import android.content.Intent;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlayerMode;
import com.vk.stat.scheme.CommonAudioStat$AudioDomainTapEvent;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioModal;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSnippetItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSourceEnum;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapGotoEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTapPlayEventItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioTrackMenuUiClickItem;
import com.vk.stat.scheme.MobileOfficialAppsCorePushesStat$TypePushEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import io.appmetrica.analytics.impl.L2;

/* compiled from: MyMusicStatsTracker.kt */
/* loaded from: classes3.dex */
public final class so50 implements u750 {
    public final pr6 b;

    public so50(pr6 pr6Var) {
        this.b = pr6Var;
    }

    public static String b1(String str) {
        switch (str.hashCode()) {
            case -1332194002:
                if (str.equals(L2.g)) {
                    return "purchase_background";
                }
                return null;
            case 96432:
                if (str.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return "purchase_audio";
                }
                return null;
            case 102225:
                if (str.equals("geo")) {
                    return "purchase_restricted";
                }
                return null;
            case 3321850:
                if (str.equals("link")) {
                    return "purchase_link";
                }
                return null;
            case 3452698:
                if (str.equals("push")) {
                    return "purchase_background";
                }
                return null;
            case 188611519:
                if (str.equals("audiobook")) {
                    return "purchase_audio";
                }
                return null;
            case 664648013:
                if (str.equals("audio_download_library")) {
                    return "purchase_cache";
                }
                return null;
            case 1427818632:
                if (str.equals("download")) {
                    return "purchase_cache";
                }
                return null;
            case 1549094198:
                if (str.equals("audio_kids")) {
                    return "purchase_audio";
                }
                return null;
            default:
                return null;
        }
    }

    public static String c1(t750 t750Var) {
        if (!(t750Var instanceof MusicPlaybackLaunchContext)) {
            return "other";
        }
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) t750Var;
        return musicPlaybackLaunchContext.b.getBoolean("__META_PLAYER_FULL_SCREEN") ? "full_player" : musicPlaybackLaunchContext.t() != null ? musicPlaybackLaunchContext.t() : "other";
    }

    public static void d1(Event event) {
        com.vk.metrics.eventtracking.b.a.k(event);
    }

    @Override // xsna.u750
    public final void E(String str, String str2, t750 t750Var) {
        String b1 = b1(str);
        if (b1 == null) {
            return;
        }
        if (b1.equals("purchase_cache")) {
            String c1 = c1(t750Var);
            Event.a a1 = a1("Cache");
            a1.c("from", c1);
            d1(a1.e());
            L.e("MusicStats", "myTracker", "Cache", "from:", c1);
            String c12 = c1(t750Var);
            Event.a a12 = a1("Purchase_cache");
            a12.c("from", c12);
            d1(a12.e());
            L.e("MusicStats", "myTracker", "Purchase_cache", "from:", c12);
            return;
        }
        if (!b1.equals("purchase_audio")) {
            Event.a a13 = a1("Offer");
            a13.c("from", b1);
            d1(a13.e());
            L.e("MusicStats", "myTracker", "Offer", "from:", b1);
            return;
        }
        String c13 = c1(t750Var);
        Event.a a14 = a1("Purchase_audio");
        a14.c("from", c13);
        d1(a14.e());
        L.e("MusicStats", "myTracker", "Purchase_audio ", "from:", c13);
    }

    @Override // xsna.u750
    public final void X(String str, String str2) {
        String b1 = b1(str);
        if (b1 != null && "buy".equals(str2)) {
            Event.a a1 = a1("Purchase_offer");
            a1.c("from", b1);
            d1(a1.e());
            L.e("MusicStats", "myTracker", "Purchase_offer", "from:", b1);
        }
    }

    public final Event.a a1(String str) {
        Event.a aVar = (Event.a) this.b.invoke();
        aVar.g(str);
        uc00 uc00Var = uc00.a;
        aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        return aVar;
    }

    @Override // xsna.u750
    public final void i0(fv40 fv40Var) {
        if (fv40Var.e > 1.0f) {
            String valueOf = String.valueOf(fv40Var.b);
            String c1 = c1(fv40Var.c);
            Event.a a1 = a1("Play_tracks");
            a1.c("method", eok.ONLINE_EXTRAS_KEY);
            a1.c("is_background", valueOf);
            a1.c("from", c1);
            d1(a1.e());
            L.e("MusicStats", "myTracker", "Play_tracks", "from:", c1, "method:", eok.ONLINE_EXTRAS_KEY, "is_background:", valueOf);
        }
    }

    @Override // xsna.u750
    public final void n(boolean z) {
        Event.a a1 = a1("Block_background");
        a1.c("variant", z ? "hard" : "light");
        d1(a1.e());
        L.e("MusicStats", "myTracker", "Block_background", "isHard:", Boolean.valueOf(z));
    }

    @Override // xsna.u750
    public final void B() {
    }

    @Override // xsna.u750
    public final void D0() {
    }

    @Override // xsna.u750
    public final void P() {
    }

    @Override // xsna.u750
    public final void R0() {
    }

    @Override // xsna.u750
    public final void T() {
    }

    @Override // xsna.u750
    public final void T0() {
    }

    @Override // xsna.u750
    public final void V0() {
    }

    @Override // xsna.u750
    public final void b() {
    }

    @Override // xsna.u750
    public final void c0() {
    }

    @Override // xsna.u750
    public final void h() {
    }

    @Override // xsna.u750
    public final void j() {
    }

    @Override // xsna.u750
    public final void p0() {
    }

    @Override // xsna.u750
    public final void q() {
    }

    @Override // xsna.u750
    public final void t() {
    }

    @Override // xsna.u750
    public final void v0() {
    }

    @Override // xsna.u750
    public final void w0() {
    }

    @Override // xsna.u750
    public final void x0() {
    }

    @Override // xsna.u750
    public final void A0(String str) {
    }

    @Override // xsna.u750
    public final void B0(boolean z) {
    }

    @Override // xsna.u750
    public final void C(String str) {
    }

    @Override // xsna.u750
    public final void C0(String str) {
    }

    @Override // xsna.u750
    public final void F(String str) {
    }

    @Override // xsna.u750
    public final void H0(CommonAudioStat$TypeAudioModal.ModalId modalId) {
    }

    @Override // xsna.u750
    public final void J(fv40 fv40Var) {
    }

    @Override // xsna.u750
    public final void J0(iab0 iab0Var) {
    }

    @Override // xsna.u750
    public final void K(int i) {
    }

    @Override // xsna.u750
    public final void K0(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void L0(c650 c650Var) {
    }

    @Override // xsna.u750
    public final void M0(o4b0 o4b0Var) {
    }

    @Override // xsna.u750
    public final void O(fv40 fv40Var) {
    }

    @Override // xsna.u750
    public final void O0(c650 c650Var) {
    }

    @Override // xsna.u750
    public final void Q(String str) {
    }

    @Override // xsna.u750
    public final void Q0(String str) {
    }

    @Override // xsna.u750
    public final void R(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void U(hg40 hg40Var) {
    }

    @Override // xsna.u750
    public final void W0(boolean z) {
    }

    @Override // xsna.u750
    public final void X0(fv40 fv40Var) {
    }

    @Override // xsna.u750
    public final void Y(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void Z(boolean z) {
    }

    @Override // xsna.u750
    public final void f0(String str) {
    }

    @Override // xsna.u750
    public final void g0(long j) {
    }

    @Override // xsna.u750
    public final void i(boolean z) {
    }

    @Override // xsna.u750
    public final void l(en40 en40Var) {
    }

    @Override // xsna.u750
    public final void m0(String str) {
    }

    @Override // xsna.u750
    public final void n0(long j) {
    }

    @Override // xsna.u750
    public final void o(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void onProgress(long j) {
    }

    @Override // xsna.u750
    public final void r(int i) {
    }

    @Override // xsna.u750
    public final void t0(String str) {
    }

    @Override // xsna.u750
    public final void w(boolean z) {
    }

    @Override // xsna.u750
    public final void z(String str) {
    }

    @Override // xsna.u750
    public final void z0(String str) {
    }

    @Override // xsna.u750
    public final void E0(String str, boolean z) {
    }

    @Override // xsna.u750
    public final void F0(int i, UserId userId) {
    }

    @Override // xsna.u750
    public final void H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action action, String str) {
    }

    @Override // xsna.u750
    public final void I0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
    }

    @Override // xsna.u750
    public final void L(hg40 hg40Var, boolean z) {
    }

    @Override // xsna.u750
    public final void N(MusicTrack musicTrack, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void N0(ajc ajcVar, CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent) {
    }

    @Override // xsna.u750
    public final void S(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void U0(c650 c650Var, int i) {
    }

    @Override // xsna.u750
    public final void W(String str, String str2) {
    }

    @Override // xsna.u750
    public final void Y0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void Z0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
    }

    @Override // xsna.u750
    public final void a(String str, String str2) {
    }

    @Override // xsna.u750
    public final void a0(int i, UserId userId) {
    }

    @Override // xsna.u750
    public final void c(iab0 iab0Var, boolean z) {
    }

    @Override // xsna.u750
    public final void d(int i, String str) {
    }

    @Override // xsna.u750
    public final void d0(String str, String str2) {
    }

    @Override // xsna.u750
    public final void e(String str, boolean z) {
    }

    @Override // xsna.u750
    public final void e0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void f(Intent intent, String str) {
    }

    @Override // xsna.u750
    public final void h0(iab0 iab0Var, int i) {
    }

    @Override // xsna.u750
    public final void j0(String str, boolean z) {
    }

    @Override // xsna.u750
    public final void k(ajc ajcVar, CommonAudioStat$TypeAudioTapPlayEventItem.Type type) {
    }

    @Override // xsna.u750
    public final void k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType, PlayerMode playerMode) {
    }

    @Override // xsna.u750
    public final void m(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
    }

    @Override // xsna.u750
    public final void o0(int i, UserId userId) {
    }

    @Override // xsna.u750
    public final void q0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
    }

    @Override // xsna.u750
    public final void r0(CommonAudioStat$TypeAudioSnippetItem.EventType eventType, c650 c650Var) {
    }

    @Override // xsna.u750
    public final void s(int i, UserId userId) {
    }

    @Override // xsna.u750
    public final void u(String str, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType eventType, PlayerMode playerMode) {
    }

    @Override // xsna.u750
    public final void v(iab0 iab0Var, int i) {
    }

    @Override // xsna.u750
    public final void x(CommonAudioStat$TypeAudioSnippetItem.EventType eventType, c650 c650Var) {
    }

    @Override // xsna.u750
    public final void y(int i, String str) {
    }

    @Override // xsna.u750
    public final void y0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void A(en40 en40Var, int i, int i2) {
    }

    @Override // xsna.u750
    public final void D(String str, boolean z, boolean z2) {
    }

    @Override // xsna.u750
    public final void G(String str, String str2, String str3) {
    }

    @Override // xsna.u750
    public final void G0(String str, Long l, MixSettingsEntity mixSettingsEntity) {
    }

    @Override // xsna.u750
    public final void M(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum, SchemeStat$EventItem schemeStat$EventItem, CommonAudioStat$TypeAudioTapGotoEventItem.MenuAction menuAction) {
    }

    @Override // xsna.u750
    public final void S0(en40 en40Var, int i, String str) {
    }

    @Override // xsna.u750
    public final void b0(iab0 iab0Var, boolean z, Integer num) {
    }

    @Override // xsna.u750
    public final void g(int i, int i2, String str) {
    }

    @Override // xsna.u750
    public final void l0(int i, int i2, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    @Override // xsna.u750
    public final void p(String str, String str2, String str3) {
    }

    @Override // xsna.u750
    public final void s0(int i, String str, boolean z) {
    }

    @Override // xsna.u750
    public final void I(String str, String str2, String str3, String str4) {
    }

    @Override // xsna.u750
    public final void P0(en40 en40Var, int i, int i2, String str) {
    }

    @Override // xsna.u750
    public final void V(String str, String str2, String str3, String str4) {
    }
}
