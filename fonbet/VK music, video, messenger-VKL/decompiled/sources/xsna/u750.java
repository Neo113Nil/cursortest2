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

/* compiled from: MusicStatsTracker.kt */
/* loaded from: classes.dex */
public interface u750 {
    default void B() {
    }

    default void D0() {
    }

    default void P() {
    }

    default void R0() {
    }

    default void T() {
    }

    default void T0() {
    }

    default void V0() {
    }

    default void b() {
    }

    default void c0() {
    }

    default void h() {
    }

    default void j() {
    }

    default void p0() {
    }

    default void q() {
    }

    default void t() {
    }

    default void v0() {
    }

    default void w0() {
    }

    default void x0() {
    }

    default void A0(String str) {
    }

    default void B0(boolean z) {
    }

    default void C(String str) {
    }

    default void C0(String str) {
    }

    default void F(String str) {
    }

    default void H0(CommonAudioStat$TypeAudioModal.ModalId modalId) {
    }

    default void J(fv40 fv40Var) {
    }

    default void J0(iab0 iab0Var) {
    }

    default void K(int i) {
    }

    default void K0(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void L0(c650 c650Var) {
    }

    default void M0(o4b0 o4b0Var) {
    }

    default void O(fv40 fv40Var) {
    }

    default void O0(c650 c650Var) {
    }

    default void Q(String str) {
    }

    default void Q0(String str) {
    }

    default void R(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void U(hg40 hg40Var) {
    }

    default void W0(boolean z) {
    }

    default void X0(fv40 fv40Var) {
    }

    default void Y(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void Z(boolean z) {
    }

    default void f0(String str) {
    }

    default void g0(long j) {
    }

    default void i(boolean z) {
    }

    default void i0(fv40 fv40Var) {
    }

    default void l(en40 en40Var) {
    }

    default void m0(String str) {
    }

    default void n(boolean z) {
    }

    default void n0(long j) {
    }

    default void o(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void onProgress(long j) {
    }

    default void r(int i) {
    }

    default void t0(String str) {
    }

    default void w(boolean z) {
    }

    default void z(String str) {
    }

    default void z0(String str) {
    }

    default void E0(String str, boolean z) {
    }

    default void F0(int i, UserId userId) {
    }

    default void H(MobileOfficialAppsCorePushesStat$TypePushEventItem.Action action, String str) {
    }

    default void I0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
    }

    default void L(hg40 hg40Var, boolean z) {
    }

    default void N(MusicTrack musicTrack, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void N0(ajc ajcVar, CommonAudioStat$AudioDomainTapEvent commonAudioStat$AudioDomainTapEvent) {
    }

    default void S(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void U0(c650 c650Var, int i) {
    }

    default void W(String str, String str2) {
    }

    default void X(String str, @NonNull String str2) {
    }

    default void Y0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void Z0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
    }

    default void a(String str, String str2) {
    }

    default void a0(int i, UserId userId) {
    }

    default void c(iab0 iab0Var, boolean z) {
    }

    default void d(int i, String str) {
    }

    default void d0(String str, String str2) {
    }

    default void e(String str, boolean z) {
    }

    default void e0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void f(Intent intent, String str) {
    }

    default void h0(iab0 iab0Var, int i) {
    }

    default void j0(String str, boolean z) {
    }

    default void k(ajc ajcVar, CommonAudioStat$TypeAudioTapPlayEventItem.Type type) {
    }

    default void k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType eventType, PlayerMode playerMode) {
    }

    default void m(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
    }

    default void o0(int i, UserId userId) {
    }

    default void q0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype, c650 c650Var) {
    }

    default void r0(CommonAudioStat$TypeAudioSnippetItem.EventType eventType, c650 c650Var) {
    }

    default void s(int i, UserId userId) {
    }

    default void u(String str, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void u0(CommonAudioStat$TypeAudioTrackMenuUiClickItem.EventType eventType, PlayerMode playerMode) {
    }

    default void v(iab0 iab0Var, int i) {
    }

    default void x(CommonAudioStat$TypeAudioSnippetItem.EventType eventType, c650 c650Var) {
    }

    default void y(int i, String str) {
    }

    default void y0(int i, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void A(en40 en40Var, int i, int i2) {
    }

    default void D(String str, boolean z, boolean z2) {
    }

    default void E(String str, String str2, t750 t750Var) {
    }

    default void G(String str, String str2, String str3) {
    }

    default void G0(String str, Long l, MixSettingsEntity mixSettingsEntity) {
    }

    default void M(CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum, SchemeStat$EventItem schemeStat$EventItem, CommonAudioStat$TypeAudioTapGotoEventItem.MenuAction menuAction) {
    }

    default void S0(en40 en40Var, int i, String str) {
    }

    default void b0(iab0 iab0Var, boolean z, Integer num) {
    }

    default void g(int i, int i2, String str) {
    }

    default void l0(int i, int i2, CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum) {
    }

    default void p(String str, String str2, String str3) {
    }

    default void s0(int i, String str, boolean z) {
    }

    default void I(String str, String str2, String str3, String str4) {
    }

    default void P0(en40 en40Var, int i, int i2, String str) {
    }

    default void V(String str, String str2, String str3, String str4) {
    }
}
