package xsna;

import android.content.Intent;
import androidx.annotation.NonNull;
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
import kotlin.LazyThreadSafetyMode;

/* compiled from: MusicSectionTracker.kt */
/* loaded from: classes3.dex */
public final class l550 implements u750, w8i {
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new t210(this, 9));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u750
    public final void P() {
        ((nn40) this.b.getValue()).c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.u750
    public final void p0() {
        ((nn40) this.b.getValue()).b();
    }

    @Override // xsna.u750
    public final void B() {
    }

    @Override // xsna.u750
    public final void D0() {
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
    public final void i0(fv40 fv40Var) {
    }

    @Override // xsna.u750
    public final void l(en40 en40Var) {
    }

    @Override // xsna.u750
    public final void m0(String str) {
    }

    @Override // xsna.u750
    public final void n(boolean z) {
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
    public final void X(String str, @NonNull String str2) {
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
    public final void E(String str, String str2, t750 t750Var) {
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
