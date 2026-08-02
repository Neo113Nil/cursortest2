package defpackage;

import com.yandex.go.navigator.repository.SoundMode;
import com.yandex.go.navigator.repository.VoiceMode;
import com.yandex.go.navigator.repository.h;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class bf50 {
    public final r6r0 a;
    public final j5z b;
    public final cne0 c;
    public final r0 d;
    public final r0 e;
    public final r0 f;
    public final r0 g;
    public final r0 h;
    public final r0 i;
    public final r0 j;
    public final r0 k;
    public final r0 l;
    public final r0 m;
    public final h n;
    public final r0 o;

    public bf50(dne0 dne0Var, r6r0 r6r0Var, j5z j5zVar) {
        this.a = r6r0Var;
        this.b = j5zVar;
        cne0 a = dne0Var.a("com.yandex.go.navigator.settings");
        this.c = a;
        cz31 cz31Var = VoiceMode.Companion;
        String l = a.l("navigator.voice_setting_key", null);
        l = l == null ? "all_sound" : l;
        cz31Var.getClass();
        r0 c = bvf0.c(jl40.l(l, "turn_off") ? VoiceMode.TURN_OFF : jl40.l(l, "accidents_only") ? VoiceMode.ACCIDENTS_ONLY : VoiceMode.ALL_SOUND);
        this.d = c;
        r0 c2 = bvf0.c(b());
        this.e = c2;
        r0 c3 = bvf0.c(Boolean.valueOf(a.f("navigator.avoid_toll_roads")));
        this.f = c3;
        r0 c4 = bvf0.c(Boolean.valueOf(a.f("navigator.avoid_unpaved_roads")));
        this.g = c4;
        r0 c5 = bvf0.c(a.l("navigator.language_assistance_key", null));
        this.h = c5;
        r0 c6 = bvf0.c(a.l("navigator.selected_voice_key", null));
        this.i = c6;
        this.j = c;
        this.k = c2;
        this.l = c3;
        this.m = c4;
        this.n = new h(c5, this);
        this.o = c6;
    }

    public final String a() {
        String language = this.b.c().getLanguage();
        String str = (String) this.h.getValue();
        return str == null ? language : str;
    }

    public final SoundMode b() {
        q9t0 q9t0Var = SoundMode.Companion;
        String l = this.c.l("navigator.sound_setting_key", null);
        if (l == null) {
            l = "mid";
        }
        q9t0Var.getClass();
        return q9t0.a(l);
    }
}
