package xsna;

import com.vk.core.preference.Preference;

/* compiled from: VoipToolTipPreferenceRepeatPolicy.kt */
/* loaded from: classes7.dex */
public final class r2x0 implements t2x0 {
    public final long b;

    public r2x0(long j) {
        this.b = j;
    }

    @Override // xsna.t2x0
    public final boolean b(String str) {
        long m = Preference.m(0L, "voip_prefs_shared", "tool-tip-".concat(str));
        return m == 0 || System.currentTimeMillis() - m > this.b;
    }

    @Override // xsna.t2x0
    public final void c(String str) {
        Preference.F(System.currentTimeMillis(), "voip_prefs_shared", "tool-tip-".concat(str));
    }
}
