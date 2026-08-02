package defpackage;

import android.content.Context;
import com.yandex.go.navigator.driving.speaker.d;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import com.yandex.go.navigator.settings.voice_settings.VoiceSettingsModalView;
import com.yandex.go.navigator.settings.voice_settings.c;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes12.dex */
public final class kz31 extends m230 {
    public final w030 E;
    public final ez31 F;
    public final fz31 G;
    public final boolean H;

    public kz31(w030 w030Var, ez31 ez31Var, fz31 fz31Var) {
        super(null);
        this.E = w030Var;
        this.F = ez31Var;
        this.G = fz31Var;
        this.H = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.H;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        NavigatorLanguageSettingAvailabilityExperiment.Language language = (NavigatorLanguageSettingAvailabilityExperiment.Language) obj;
        jz31 jz31Var = new jz31(this);
        hz31 hz31Var = ((gz31) this.G).a;
        c cVar = new c((bf50) hz31Var.a.get(), (qc50) hz31Var.b.get(), (zuj0) hz31Var.c.get(), (hzw) hz31Var.d.get(), language, (pwy0) hz31Var.e.get(), (d) hz31Var.f.get(), (r6r0) hz31Var.g.get(), jz31Var, (b) hz31Var.h.get());
        gus gusVar = this.F.a;
        return new VoiceSettingsModalView((Context) gusVar.a.get(), cVar, (ip11) gusVar.b.get());
    }
}
