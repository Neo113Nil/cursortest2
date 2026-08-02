package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.music.player.LoopMode;
import com.vk.music.pref.CrossfadeOnboarding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.EmptySet;
import xsna.hn40;

/* compiled from: MusicPrefsImpl.kt */
/* loaded from: classes.dex */
public final class j250 implements com.vk.music.pref.a {
    public volatile long b;

    public static String e(UserId userId) {
        return "music_prefs_" + userId.b;
    }

    @Override // com.vk.music.pref.a
    public final void A(UserId userId) {
        Preference.I(e(userId), "old_moosic_podcasts_migrated", true);
    }

    @Override // com.vk.music.pref.a
    public final boolean A0() {
        return Preference.d(f(), "offline_old_moosic_synced", false);
    }

    @Override // com.vk.music.pref.a
    public final long B() {
        return Preference.m(0L, f(), "trial_bg_played_stat_last_date");
    }

    @Override // com.vk.music.pref.a
    public final void B0(boolean z) {
        Preference.I(f(), "paused_by_focus_lost", z);
    }

    @Override // com.vk.music.pref.a
    public final void C(long j) {
        Preference.F(j, f(), "music_vpn_snackbar_last_show_time");
    }

    @Override // com.vk.music.pref.a
    public final void C0(UserId userId, Set<String> set) {
        Preference.K(izi0.j(N0(), set), e(userId), "offline_old_moosic_client_playlists_planned_for_sync");
    }

    @Override // com.vk.music.pref.a
    public final void D(CrossfadeOnboarding crossfadeOnboarding) {
        Preference.G(f(), "crossfade_onboarding", CrossfadeOnboarding.class, crossfadeOnboarding);
    }

    @Override // com.vk.music.pref.a
    public final void D0(long j) {
        Preference.F(j, f(), "music_longtap_tooltip_last_show_time");
    }

    @Override // com.vk.music.pref.a
    public final boolean E() {
        return Preference.d(f(), "paused_by_system", false);
    }

    @Override // com.vk.music.pref.a
    public final void E0() {
        Preference.F(3L, f(), "music_longtap_tooltip_last_show_count");
    }

    @Override // com.vk.music.pref.a
    public final void F(boolean z) {
        Preference.I(f(), "music_is_new_app_session", z);
    }

    @Override // com.vk.music.pref.a
    public final void F0(long j) {
        Preference.F(j, f(), "key_last_player_state_time");
    }

    @Override // com.vk.music.pref.a
    public final long G() {
        return Preference.m(0L, f(), "music_longtap_tooltip_last_show_count");
    }

    @Override // com.vk.music.pref.a
    public final boolean G0() {
        return Preference.d(f(), "ping_start_standalone_migration", false);
    }

    @Override // com.vk.music.pref.a
    public final void H(long j) {
        Preference.F(j, f(), "played_time");
    }

    @Override // com.vk.music.pref.a
    public final long H0() {
        return Preference.m(0L, f(), "music_vpn_snackbar_last_show_time");
    }

    @Override // com.vk.music.pref.a
    public final void I(long j) {
        this.b = j;
        F(true);
        String f = f();
        SharedPreferences f2 = Preference.f(f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Preference.b(f2, "loop_mode", LoopMode.LIST, LoopMode.class));
        Preference.Type type = Preference.Type.Number;
        Preference.a.getClass();
        arrayList.add(Preference.c(f2, type, f, "trial_bg_played_stat_last_date", 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Preference.f) it.next()).a();
        }
    }

    @Override // com.vk.music.pref.a
    public final void I0(boolean z) {
        Preference.I(f(), "crossfade_value", z);
    }

    @Override // com.vk.music.pref.a
    public final void J(UserId userId) {
        Preference.I(e(userId), "ping_start_standalone_migration", true);
    }

    @Override // com.vk.music.pref.a
    public final void J0(float f) {
        String f2 = f();
        ReentrantReadWriteLock.ReadLock readLock = Preference.o.readLock();
        readLock.lock();
        try {
            long b = Preference.b(Preference.a);
            Preference.z(f2, "key_playback_speed", Preference.Type.Float, null).set(Float.valueOf(f));
            Preference.a(b);
        } finally {
            readLock.unlock();
        }
    }

    @Override // com.vk.music.pref.a
    public final void K(UserId userId) {
        Preference.I(e(userId), "offline_old_moosic_synced_second_chance", true);
    }

    @Override // com.vk.music.pref.a
    public final boolean K0() {
        return Preference.d(f(), "shuffleGlobal", false);
    }

    @Override // com.vk.music.pref.a
    public final void L(UserId userId, String str) {
        Preference.K(p4g.f(N0(), str), e(userId), "offline_old_moosic_client_playlists_planned_for_sync");
    }

    @Override // com.vk.music.pref.a
    public final boolean L0() {
        return Preference.d(f(), "offline_old_moosic_synced_on_client", false);
    }

    @Override // com.vk.music.pref.a
    public final boolean M() {
        return Preference.d(f(), "shuffle", false);
    }

    @Override // com.vk.music.pref.a
    public final void M0(boolean z) {
        Preference.I(f(), "shuffleGlobal", z);
    }

    @Override // com.vk.music.pref.a
    public final void N() {
        Preference.F(1L, f(), "music_magic_wand_tooltip_last_show_count");
    }

    @Override // com.vk.music.pref.a
    public final Set<String> N0() {
        String f = f();
        Preference preference = Preference.a;
        return Preference.u(EmptySet.b, f, "offline_old_moosic_client_playlists_planned_for_sync");
    }

    @Override // com.vk.music.pref.a
    public final boolean O() {
        return Preference.d(f(), "offline_db_data_migrated", false);
    }

    @Override // com.vk.music.pref.a
    public final long O0() {
        return Preference.m(0L, f(), "played_time");
    }

    @Override // com.vk.music.pref.a
    public final void P(Long[] lArr) {
        Preference.J(f(), "music_background_restriction_dates", lArr);
    }

    @Override // com.vk.music.pref.a
    public final void P0(boolean z) {
        Preference.I(f(), "player_equalizer_enabled", z);
    }

    @Override // com.vk.music.pref.a
    public final boolean Q() {
        return Preference.d(f(), "offline_old_moosic_client_my_tracks_synced", false);
    }

    @Override // com.vk.music.pref.a
    public final void Q0(boolean z) {
        Preference.I(f(), "paused_by_transient_focus_lost", z);
    }

    @Override // com.vk.music.pref.a
    public final boolean R() {
        return Preference.d(f(), "music_is_new_app_session", false);
    }

    @Override // com.vk.music.pref.a
    public final String R0() {
        return Preference.s(f(), "player_equalizer_preset_id", "flat");
    }

    @Override // com.vk.music.pref.a
    public final boolean S() {
        return Preference.d(f(), "paused_by_transient_focus_lost", false);
    }

    @Override // com.vk.music.pref.a
    public final void T(String str) {
        Preference.H(f(), "key_last_player_state", str);
    }

    @Override // com.vk.music.pref.a
    public final String U() {
        return Preference.s(f(), "key_last_player_state", "none");
    }

    @Override // com.vk.music.pref.a
    public final void V() {
        Preference.F(G() + 1, f(), "music_longtap_tooltip_last_show_count");
    }

    @Override // com.vk.music.pref.a
    public final void W(boolean z) {
        Preference.I(f(), "loudness_normalization_enabled", z);
    }

    @Override // com.vk.music.pref.a
    public final long X() {
        return Preference.m(0L, f(), "music_migration_time");
    }

    @Override // com.vk.music.pref.a
    public final boolean Y() {
        return Preference.d(f(), "old_moosic_podcasts_migrated", false);
    }

    @Override // com.vk.music.pref.a
    public final Long[] Z() {
        return Preference.n(f(), "showed_paused_info");
    }

    @Override // com.vk.music.pref.a
    public final boolean a() {
        return Preference.d(f(), "player_equalizer_enabled", false);
    }

    @Override // com.vk.music.pref.a
    public final void a0(long j) {
        Preference.F(j, f(), "music_migration_time");
    }

    @Override // com.vk.music.pref.a
    public final void b(LoopMode loopMode) {
        Preference.G(f(), "loop_mode", LoopMode.class, loopMode);
    }

    @Override // com.vk.music.pref.a
    public final boolean b0() {
        return Preference.d(f(), "paused_by_focus_lost", false);
    }

    @Override // com.vk.music.pref.a
    public final boolean c() {
        hn40 o = com.vk.toggle.d.o();
        return Preference.d(f(), "loudness_normalization_enabled", (o instanceof hn40.b) && ((hn40.b) o).b());
    }

    @Override // com.vk.music.pref.a
    public final long c0() {
        return Preference.m(0L, f(), "music_last_headphones_push_time");
    }

    @Override // com.vk.music.pref.a
    public final void d(boolean z) {
        Preference.I(f(), "shuffle", z);
    }

    @Override // com.vk.music.pref.a
    public final void d0(UserId userId) {
        Preference.I(e(userId), "offline_old_moosic_synced_on_client", true);
    }

    @Override // com.vk.music.pref.a
    public final long e0() {
        return Preference.m(0L, f(), "music_magic_wand_tooltip_last_show_time");
    }

    public final String f() {
        return "music_prefs_" + this.b;
    }

    @Override // com.vk.music.pref.a
    public final void f0(long j) {
        Preference.F(j, f(), "music_magic_wand_tooltip_last_show_time");
    }

    @Override // com.vk.music.pref.a
    public final boolean g0() {
        return Preference.d(f(), "old_moosic_books_migrated", false);
    }

    @Override // com.vk.music.pref.a
    public final void h0(Set<String> set) {
        Preference.K(set, f(), "object_search_history");
    }

    @Override // com.vk.music.pref.a
    public final void i0(UserId userId) {
        Preference.I(e(userId), "old_moosic_books_migrated", true);
    }

    @Override // com.vk.music.pref.a
    public final boolean j0() {
        return Preference.d(f(), "offline_old_moosic_synced_second_chance", false);
    }

    @Override // com.vk.music.pref.a
    public final void k0() {
        Preference.I(f(), "offline_db_data_migrated", true);
    }

    @Override // com.vk.music.pref.a
    public final float l() {
        String f = f();
        Preference preference = Preference.a;
        Preference.Type type = Preference.Type.Float;
        Float valueOf = Float.valueOf(1.0f);
        preference.getClass();
        Float f2 = (Float) Preference.z(f, "key_playback_speed", type, valueOf).get();
        float floatValue = f2 != null ? f2.floatValue() : 1.0f;
        if (floatValue < 0.5f) {
            return 0.5f;
        }
        return floatValue;
    }

    @Override // com.vk.music.pref.a
    public final boolean l0() {
        return Preference.d(f(), "old_moosic_photos_cache_migrated", false);
    }

    @Override // com.vk.music.pref.a
    public final void m(UserId userId) {
        Preference.I(e(userId), "old_moosic_photos_cache_migrated", true);
    }

    @Override // com.vk.music.pref.a
    public final long m0() {
        return Preference.m(0L, f(), "music_magic_wand_tooltip_last_show_count");
    }

    @Override // com.vk.music.pref.a
    public final void n() {
        Preference.I(f(), "paused_by_system", false);
    }

    @Override // com.vk.music.pref.a
    public final LoopMode n0() {
        String f = f();
        Object obj = LoopMode.LIST;
        Preference.a.getClass();
        Object obj2 = Preference.y(LoopMode.class, f, "loop_mode").get();
        if (obj2 != null) {
            obj = obj2;
        }
        return (LoopMode) obj;
    }

    @Override // com.vk.music.pref.a
    public final boolean o() {
        return Preference.d(f(), "music_onboarding_was_shown", false);
    }

    @Override // com.vk.music.pref.a
    public final long o0() {
        return Preference.m(0L, f(), "played_last_date");
    }

    @Override // com.vk.music.pref.a
    public final void p(long j) {
        Preference.F(j, f(), "music_last_headphones_push_time");
    }

    @Override // com.vk.music.pref.a
    public final Long[] p0() {
        return Preference.n(f(), "music_background_restriction_dates");
    }

    @Override // com.vk.music.pref.a
    public final CrossfadeOnboarding q() {
        String f = f();
        Object obj = CrossfadeOnboarding.BothOnboardings;
        Preference.a.getClass();
        Object obj2 = Preference.y(CrossfadeOnboarding.class, f, "crossfade_onboarding").get();
        if (obj2 != null) {
            obj = obj2;
        }
        return (CrossfadeOnboarding) obj;
    }

    @Override // com.vk.music.pref.a
    public final void q0(UserId userId) {
        Preference.I(e(userId), "offline_old_moosic_synced", true);
    }

    @Override // com.vk.music.pref.a
    public final void r(UserId userId) {
        Preference.I(e(userId), "offline_old_moosic_client_my_tracks_synced", true);
    }

    @Override // com.vk.music.pref.a
    public final Set<Long> r0() {
        return rl3.y0(Preference.n(f(), "music_consumed_special_project_ids"));
    }

    @Override // com.vk.music.pref.a
    public final long s() {
        return Preference.m(1L, f(), "music_full_screen_player_openings_count");
    }

    @Override // com.vk.music.pref.a
    public final void s0() {
        Preference.F(s() + 1, f(), "music_full_screen_player_openings_count");
    }

    @Override // com.vk.music.pref.a
    public final Set<String> t() {
        String f = f();
        Preference preference = Preference.a;
        return Preference.u(EmptySet.b, f, "object_search_history");
    }

    @Override // com.vk.music.pref.a
    public final void t0(String str) {
        Preference.H(f(), "player_equalizer_custom_bands", str);
    }

    @Override // com.vk.music.pref.a
    public final void u() {
        Preference.I(f(), "music_onboarding_was_shown", true);
    }

    @Override // com.vk.music.pref.a
    public final void u0() {
        Preference.I(f(), "player_paused_by_network", false);
    }

    @Override // com.vk.music.pref.a
    public final void v(long j) {
        Preference.J(f(), "music_consumed_special_project_ids", (Long[]) p4g.e(r0(), Long.valueOf(j)).toArray(new Long[0]));
    }

    @Override // com.vk.music.pref.a
    public final long v0() {
        return Preference.m(0L, f(), "key_last_player_state_time");
    }

    @Override // com.vk.music.pref.a
    public final void w(Long[] lArr) {
        Preference.J(f(), "showed_paused_info", lArr);
    }

    @Override // com.vk.music.pref.a
    public final String w0() {
        return Preference.s(f(), "player_equalizer_custom_bands", "");
    }

    @Override // com.vk.music.pref.a
    public final void x() {
        Preference.F(m0() + 1, f(), "music_magic_wand_tooltip_last_show_count");
    }

    @Override // com.vk.music.pref.a
    public final void x0(long j) {
        Preference.F(j, f(), "played_last_date");
    }

    @Override // com.vk.music.pref.a
    public final void y(long j) {
        Preference.F(j, f(), "trial_bg_played_stat_last_date");
    }

    @Override // com.vk.music.pref.a
    public final void y0(String str) {
        Preference.H(f(), "player_equalizer_preset_id", str);
    }

    @Override // com.vk.music.pref.a
    public final long z() {
        return Preference.m(0L, f(), "music_longtap_tooltip_last_show_time");
    }

    @Override // com.vk.music.pref.a
    public final boolean z0() {
        return Preference.d(f(), "crossfade_value", true);
    }
}
