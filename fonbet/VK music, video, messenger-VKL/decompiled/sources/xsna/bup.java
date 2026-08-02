package xsna;

import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ztp;

/* compiled from: EqualizerPresetNames.kt */
/* loaded from: classes3.dex */
public final class bup {
    public static final Integer a(ztp ztpVar) {
        if (ztpVar.equals(ztp.j.d)) {
            return Integer.valueOf(R.string.equalizer_flat_preset_subtitle);
        }
        if (ztpVar instanceof ztp.g) {
            return Integer.valueOf(R.string.equalizer_custom_preset_subtitle);
        }
        if (ztpVar.equals(ztp.a.d) || ztpVar.equals(ztp.b.d) || ztpVar.equals(ztp.c.d) || ztpVar.equals(ztp.d.d) || ztpVar.equals(ztp.e.d) || ztpVar.equals(ztp.h.d) || ztpVar.equals(ztp.i.d) || ztpVar.equals(ztp.k.d) || ztpVar.equals(ztp.l.d) || ztpVar.equals(ztp.m.d) || ztpVar.equals(ztp.n.d) || ztpVar.equals(ztp.o.d) || ztpVar.equals(ztp.p.d) || ztpVar.equals(ztp.q.d) || ztpVar.equals(ztp.r.d) || ztpVar.equals(ztp.s.d) || ztpVar.equals(ztp.t.d) || ztpVar.equals(ztp.u.d)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(ztp ztpVar) {
        if (ztpVar.equals(ztp.j.d)) {
            return R.string.equalizer_flat_preset_name;
        }
        if (ztpVar.equals(ztp.a.d)) {
            return R.string.equalizer_acoustic_preset_name;
        }
        if (ztpVar.equals(ztp.b.d)) {
            return R.string.equalizer_auto_preset_name;
        }
        if (ztpVar.equals(ztp.c.d)) {
            return R.string.equalizer_bass_boost_preset_name;
        }
        if (ztpVar.equals(ztp.d.d)) {
            return R.string.equalizer_bass_cut_preset_name;
        }
        if (ztpVar.equals(ztp.e.d)) {
            return R.string.equalizer_classic_preset_name;
        }
        if (ztpVar.equals(ztp.h.d)) {
            return R.string.equalizer_dance_preset_name;
        }
        if (ztpVar.equals(ztp.i.d)) {
            return R.string.equalizer_deep_sound_preset_name;
        }
        if (ztpVar.equals(ztp.k.d)) {
            return R.string.equalizer_headphones_preset_name;
        }
        if (ztpVar.equals(ztp.l.d)) {
            return R.string.equalizer_hi_freq_minus_preset_name;
        }
        if (ztpVar.equals(ztp.m.d)) {
            return R.string.equalizer_hi_freq_plus_preset_name;
        }
        if (ztpVar.equals(ztp.n.d)) {
            return R.string.equalizer_hip_hop_preset_name;
        }
        if (ztpVar.equals(ztp.o.d)) {
            return R.string.equalizer_jazz_preset_name;
        }
        if (ztpVar.equals(ztp.p.d)) {
            return R.string.equalizer_latina_preset_name;
        }
        if (ztpVar.equals(ztp.q.d)) {
            return R.string.equalizer_lounge_preset_name;
        }
        if (ztpVar.equals(ztp.r.d)) {
            return R.string.equalizer_pop_preset_name;
        }
        if (ztpVar.equals(ztp.s.d)) {
            return R.string.equalizer_r_n_b_preset_name;
        }
        if (ztpVar.equals(ztp.t.d)) {
            return R.string.equalizer_rock_preset_name;
        }
        if (ztpVar.equals(ztp.u.d)) {
            return R.string.equalizer_vocal_preset_name;
        }
        if (ztpVar instanceof ztp.g) {
            return R.string.equalizer_custom_preset_name;
        }
        throw new NoWhenBranchMatchedException();
    }
}
