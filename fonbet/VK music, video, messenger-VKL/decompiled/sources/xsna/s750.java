package xsna;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: MusicStats.kt */
/* loaded from: classes.dex */
public final class s750 implements u750, w8i {
    public final bpn0 b;
    public boolean c;
    public final bpn0 d = new bpn0(new bia(this, 6));
    public final bpn0 e = new bpn0(new m15(this, 6));
    public final bpn0 f = new bpn0(new cia(this, 5));

    public s750(bpn0 bpn0Var) {
        this.b = bpn0Var;
    }

    @Override // xsna.u750
    public final void A(en40 en40Var, int i, int i2) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).A(en40Var, i, i2);
        }
    }

    @Override // xsna.u750
    public final void A0(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).A0(str);
        }
    }

    @Override // xsna.u750
    public final void B() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).B();
        }
    }

    @Override // xsna.u750
    public final void B0(boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).B0(z);
        }
    }

    @Override // xsna.u750
    public final void C(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).C(str);
        }
    }

    @Override // xsna.u750
    public final void C0(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).C0(str);
        }
    }

    @Override // xsna.u750
    public final void D(String str, boolean z, boolean z2) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).D(str, z, z2);
        }
    }

    @Override // xsna.u750
    public final void D0() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).D0();
        }
    }

    @Override // xsna.u750
    public final void E(String str, String str2, t750 t750Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).E(str, str2, t750Var);
        }
    }

    @Override // xsna.u750
    public final void E0(String str, boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).E0(str, z);
        }
    }

    @Override // xsna.u750
    public final void F(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).F(str);
        }
    }

    @Override // xsna.u750
    public final void F0(int i, UserId userId) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).F0(i, userId);
        }
    }

    @Override // xsna.u750
    public final void G(String str, String str2, String str3) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).G(str, str2, str3);
        }
    }

    @Override // xsna.u750
    public final void G0(String str, Long l, MixSettingsEntity mixSettingsEntity) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).G0(str, l, mixSettingsEntity);
        }
    }

    @Override // xsna.u750
    public final void H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action action, String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).H(action, str);
        }
    }

    @Override // xsna.u750
    public final void H0(CommonAudioStat$TypeAudioModal.ModalId modalId) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).H0(modalId);
        }
    }

    @Override // xsna.u750
    public final void I(String str, String str2, String str3, String str4) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).I(str, str2, str3, str4);
        }
    }

    @Override // xsna.u750
    public final void I0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).I0(eventSubtype, c650Var);
        }
    }

    @Override // xsna.u750
    public final void J(fv40 fv40Var) {
        com.vk.music.pref.a a1 = a1();
        a1.T("none");
        a1.F0(System.currentTimeMillis());
        if (fv40Var != null) {
            Iterator<T> it = c1().iterator();
            while (it.hasNext()) {
                ((u750) it.next()).X0(fv40Var);
            }
        }
    }

    @Override // xsna.u750
    public final void J0(iab0 iab0Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).J0(iab0Var);
        }
    }

    @Override // xsna.u750
    public final void K(int i) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).K(i);
        }
    }

    @Override // xsna.u750
    public final void K0(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).K0(commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void L(hg40 hg40Var, boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).L(hg40Var, z);
        }
    }

    @Override // xsna.u750
    public final void L0(c650 c650Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).L0(c650Var);
        }
    }

    @Override // xsna.u750
    public final void M(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum, SchemeStat$EventItem schemeStat$EventItem, CommonAudioStat$TypeAudioTapGotoEventItem.MenuAction menuAction) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).M(commonAudioStat$TypeAudioSourceEnum, schemeStat$EventItem, menuAction);
        }
    }

    @Override // xsna.u750
    public final void M0(o4b0 o4b0Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).M0(o4b0Var);
        }
    }

    @Override // xsna.u750
    public final void N(MusicTrack musicTrack, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).N(musicTrack, commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void N0(ajc ajcVar, CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).N0(ajcVar, commonAudioStat$AudioDomainTapEvent);
        }
    }

    @Override // xsna.u750
    public final void O(fv40 fv40Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).O(fv40Var);
        }
    }

    @Override // xsna.u750
    public final void O0(c650 c650Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).O0(c650Var);
        }
    }

    @Override // xsna.u750
    public final void P() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).P();
        }
    }

    @Override // xsna.u750
    public final void P0(en40 en40Var, int i, int i2, String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).P0(en40Var, i, i2, str);
        }
    }

    @Override // xsna.u750
    public final void Q(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).Q(str);
        }
    }

    @Override // xsna.u750
    public final void Q0(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).Q0(str);
        }
    }

    @Override // xsna.u750
    public final void R(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).R(commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void R0() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).R0();
        }
    }

    @Override // xsna.u750
    public final void S(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).S(i, commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void S0(en40 en40Var, int i, String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).S0(en40Var, i, str);
        }
    }

    @Override // xsna.u750
    public final void T() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).T();
        }
    }

    @Override // xsna.u750
    public final void T0() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).T0();
        }
    }

    @Override // xsna.u750
    public final void U(hg40 hg40Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).U(hg40Var);
        }
    }

    @Override // xsna.u750
    public final void U0(c650 c650Var, int i) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).U0(c650Var, i);
        }
    }

    @Override // xsna.u750
    public final void V(String str, String str2, String str3, String str4) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).V(str, str2, str3, str4);
        }
    }

    @Override // xsna.u750
    public final void V0() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).V0();
        }
    }

    @Override // xsna.u750
    public final void W(String str, String str2) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).W(str, str2);
        }
    }

    @Override // xsna.u750
    public final void W0(boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).W0(z);
        }
    }

    @Override // xsna.u750
    public final void X(String str, @NonNull String str2) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).X(str, str2);
        }
    }

    @Override // xsna.u750
    public final void X0(fv40 fv40Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).X0(fv40Var);
        }
    }

    @Override // xsna.u750
    public final void Y(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).Y(commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void Y0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).Y0(i, commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void Z(boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).Z(z);
        }
    }

    @Override // xsna.u750
    public final void Z0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).Z0(eventSubtype, c650Var);
        }
    }

    @Override // xsna.u750
    public final void a(String str, String str2) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).a(str, str2);
        }
    }

    @Override // xsna.u750
    public final void a0(int i, UserId userId) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).a0(i, userId);
        }
    }

    public final com.vk.music.pref.a a1() {
        return (com.vk.music.pref.a) this.f.getValue();
    }

    @Override // xsna.u750
    public final void b() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).b();
        }
    }

    @Override // xsna.u750
    public final void b0(iab0 iab0Var, boolean z, Integer num) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).b0(iab0Var, z, num);
        }
    }

    public final void b1(String str) {
        String U = a1().U();
        if (U.equals(str)) {
            return;
        }
        long v0 = a1().v0();
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - v0;
        if (j < 0 || v0 == 0) {
            j = 0;
        }
        o4b0 o4b0Var = new o4b0(str, U, j / 1000);
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).M0(o4b0Var);
        }
        com.vk.music.pref.a a1 = a1();
        a1.T(str);
        a1.F0(currentTimeMillis);
    }

    @Override // xsna.u750
    public final void c(iab0 iab0Var, boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).c(iab0Var, z);
        }
    }

    @Override // xsna.u750
    public final void c0() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).c0();
        }
    }

    public final List<u750> c1() {
        return (List) this.e.getValue();
    }

    @Override // xsna.u750
    public final void d(int i, String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).d(i, str);
        }
    }

    @Override // xsna.u750
    public final void d0(String str, String str2) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).d0(str, str2);
        }
    }

    @Override // xsna.u750
    public final void e(String str, boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).e(str, z);
        }
    }

    @Override // xsna.u750
    public final void e0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).e0(i, commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void f(Intent intent, String str) {
        String str2 = "player_widget";
        if (!intent.hasExtra("player_widget")) {
            str2 = "music_notification";
            if (!intent.hasExtra("music_notification")) {
                return;
            }
        }
        String stringExtra = intent.getStringExtra(str2);
        if (intent.hasExtra(str2)) {
            h3g0 h3g0Var = new h3g0(str2);
            h3g0Var.j(str);
            if (stringExtra.length() > 0) {
                h3g0Var.k(stringExtra);
            }
            h3g0Var.n();
            h3g0Var.m();
        }
    }

    @Override // xsna.u750
    public final void f0(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).f0(str);
        }
    }

    @Override // xsna.u750
    public final void g(int i, int i2, String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).g(i, i2, str);
        }
    }

    @Override // xsna.u750
    public final void g0(long j) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).g0(j);
        }
    }

    @Override // xsna.u750
    public final void h() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).h();
        }
    }

    @Override // xsna.u750
    public final void h0(iab0 iab0Var, int i) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).h0(iab0Var, i);
        }
    }

    @Override // xsna.u750
    public final void i(boolean z) {
        this.c = z;
        b1(z ? "fullscreen" : MBridgeConstans.DYNAMIC_VIEW_WX_APP);
    }

    @Override // xsna.u750
    public final void i0(fv40 fv40Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).i0(fv40Var);
        }
    }

    @Override // xsna.u750
    public final void j() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).j();
        }
    }

    @Override // xsna.u750
    public final void j0(String str, boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).j0(str, z);
        }
    }

    @Override // xsna.u750
    public final void k(ajc ajcVar, CommonAudioStat$TypeAudioTapPlayEventItem.Type type) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).k(ajcVar, type);
        }
    }

    @Override // xsna.u750
    public final void k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType, PlayerMode playerMode) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).k0(eventType, playerMode);
        }
    }

    @Override // xsna.u750
    public final void l(en40 en40Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).l(en40Var);
        }
    }

    @Override // xsna.u750
    public final void l0(int i, int i2, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).l0(i, i2, commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void m(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).m(eventSubtype, c650Var);
        }
    }

    @Override // xsna.u750
    public final void m0(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).m0(str);
        }
    }

    @Override // xsna.u750
    public final void n(boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).n(z);
        }
    }

    @Override // xsna.u750
    public final void n0(long j) {
        if (((Boolean) ((gzs) this.b.getValue()).invoke()).booleanValue() || j / 60 < 5) {
            return;
        }
        Date date = new Date();
        Date date2 = new Date(a1().B());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        if (epx.f(simpleDateFormat.format(date), simpleDateFormat.format(date2))) {
            return;
        }
        a1().y(date.getTime());
        h3g0 h3g0Var = new h3g0("audio_played_in_bg_more_than_5_minutes");
        h3g0Var.n();
        h3g0Var.m();
    }

    @Override // xsna.u750
    public final void o(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).o(commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void o0(int i, UserId userId) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).o0(i, userId);
        }
    }

    @Override // xsna.u750
    public final void onProgress(long j) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).onProgress(j);
        }
    }

    @Override // xsna.u750
    public final void p(String str, String str2, String str3) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).p(str, str2, str3);
        }
    }

    @Override // xsna.u750
    public final void p0() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).p0();
        }
    }

    @Override // xsna.u750
    public final void q() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).q();
        }
    }

    @Override // xsna.u750
    public final void q0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).q0(eventSubtype, c650Var);
        }
    }

    @Override // xsna.u750
    public final void r(int i) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).r(i);
        }
    }

    @Override // xsna.u750
    public final void r0(CommonAudioStat$TypeAudioSnippetItem.EventType eventType, c650 c650Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).r0(eventType, c650Var);
        }
    }

    @Override // xsna.u750
    public final void s(int i, UserId userId) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).s(i, userId);
        }
    }

    @Override // xsna.u750
    public final void s0(int i, String str, boolean z) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).s0(i, str, z);
        }
    }

    @Override // xsna.u750
    public final void t() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).t();
        }
    }

    @Override // xsna.u750
    public final void t0(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).t0(str);
        }
    }

    @Override // xsna.u750
    public final void u(String str, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).u(str, commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType eventType, PlayerMode playerMode) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).u0(eventType, playerMode);
        }
    }

    @Override // xsna.u750
    public final void v(iab0 iab0Var, int i) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).v(iab0Var, i);
        }
    }

    @Override // xsna.u750
    public final void v0() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).v0();
        }
    }

    @Override // xsna.u750
    public final void w(boolean z) {
        if (z) {
            b1(L2.g);
        } else {
            i(this.c);
        }
    }

    @Override // xsna.u750
    public final void w0() {
        b1("none");
    }

    @Override // xsna.u750
    public final void x(CommonAudioStat$TypeAudioSnippetItem.EventType eventType, c650 c650Var) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).x(eventType, c650Var);
        }
    }

    @Override // xsna.u750
    public final void x0() {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).x0();
        }
    }

    @Override // xsna.u750
    public final void y(int i, String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).y(i, str);
        }
    }

    @Override // xsna.u750
    public final void y0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).y0(i, commonAudioStat$TypeAudioSourceEnum);
        }
    }

    @Override // xsna.u750
    public final void z(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).z(str);
        }
    }

    @Override // xsna.u750
    public final void z0(String str) {
        Iterator<T> it = c1().iterator();
        while (it.hasNext()) {
            ((u750) it.next()).z0(str);
        }
    }
}
