package com.yandex.go.navigator.settings.voice_settings;

import com.yandex.go.navigator.driving.speaker.d;
import com.yandex.go.navigator.experiment.NavigatorLanguageSettingAvailabilityExperiment;
import defpackage.aa5;
import defpackage.avj0;
import defpackage.bf50;
import defpackage.hzw;
import defpackage.jz31;
import defpackage.kyh0;
import defpackage.pwy0;
import defpackage.qc50;
import defpackage.r6r0;
import defpackage.tje;
import defpackage.y95;
import defpackage.zuj0;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class c extends aa5 {
    public final bf50 B;
    public final qc50 C;
    public final avj0 D;
    public final hzw E;
    public final NavigatorLanguageSettingAvailabilityExperiment.Language F;
    public final pwy0 G;
    public final d H;
    public final r6r0 I;
    public final jz31 J;
    public ListBuilder K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(bf50 bf50Var, qc50 qc50Var, zuj0 zuj0Var, hzw hzwVar, NavigatorLanguageSettingAvailabilityExperiment.Language language, pwy0 pwy0Var, d dVar, r6r0 r6r0Var, jz31 jz31Var, ru.yandex.taxi.design.utils.b bVar) {
        super(r4.h(kyh0.navigator_settings_language_assistance_voice_title), bVar, pwy0Var, jz31Var);
        avj0 avj0Var = (avj0) zuj0Var;
        this.B = bf50Var;
        this.C = qc50Var;
        this.D = avj0Var;
        this.E = hzwVar;
        this.F = language;
        this.G = pwy0Var;
        this.H = dVar;
        this.I = r6r0Var;
        this.J = jz31Var;
    }

    @Override // defpackage.aa5
    public final void Kg(y95 y95Var) {
        super.Kg(y95Var);
        tje.N(Jg(), null, null, new VoiceSettingsPresenter$attachView$$inlined$safeCollectIn$1(e.n(new b(this.B.o, this), this.C.b, this.H.m, new VoiceSettingsPresenter$attachView$2(this, null)), null, y95Var), 3);
    }
}
