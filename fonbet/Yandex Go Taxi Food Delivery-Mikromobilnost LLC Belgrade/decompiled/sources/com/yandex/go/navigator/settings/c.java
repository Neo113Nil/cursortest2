package com.yandex.go.navigator.settings;

import com.adjust.sdk.Constants;
import com.yandex.go.navigator.domain.t;
import defpackage.aa5;
import defpackage.avj0;
import defpackage.bf50;
import defpackage.bsx;
import defpackage.hb50;
import defpackage.hdr0;
import defpackage.j5r0;
import defpackage.kyh0;
import defpackage.pwy0;
import defpackage.qc50;
import defpackage.scc;
import defpackage.v2h0;
import defpackage.y27;
import defpackage.y95;
import defpackage.zuj0;
import java.util.List;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class c extends aa5 {
    public final bf50 B;
    public final t C;
    public final hdr0 D;
    public final avj0 E;
    public final qc50 F;
    public final bsx G;
    public final com.yandex.go.navigator.user_placemark.c H;
    public final hb50 I;
    public final pwy0 J;
    public final List K;
    public final List L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(bf50 bf50Var, t tVar, hdr0 hdr0Var, zuj0 zuj0Var, qc50 qc50Var, bsx bsxVar, com.yandex.go.navigator.user_placemark.c cVar, hb50 hb50Var, pwy0 pwy0Var, ru.yandex.taxi.design.utils.b bVar) {
        super(r5.h(kyh0.navigator_settings_button_title), bVar, pwy0Var, hdr0Var);
        avj0 avj0Var = (avj0) zuj0Var;
        this.B = bf50Var;
        this.C = tVar;
        this.D = hdr0Var;
        this.E = avj0Var;
        this.F = qc50Var;
        this.G = bsxVar;
        this.H = cVar;
        this.I = hb50Var;
        this.J = pwy0Var;
        this.K = scc.g(new j5r0(kyh0.navigator_settings_voice_turn_off_button, Integer.valueOf(v2h0.ic_cross_fill), "turn_off"), new j5r0(kyh0.navigator_settings_voice_accidents_road_events_button, Integer.valueOf(v2h0.ic_car_accident), "accidents_only"), new j5r0(kyh0.navigator_settings_voice_all_sounds_button, Integer.valueOf(v2h0.ic_sound_fill), "all_sound"));
        this.L = scc.g(new j5r0(kyh0.navigator_settings_sound_low_button, null, Constants.LOW), new j5r0(kyh0.navigator_settings_sound_mid_button, null, "mid"), new j5r0(kyh0.navigator_settings_sound_high_button, null, Constants.HIGH));
    }

    @Override // defpackage.aa5
    public final void Kg(y95 y95Var) {
        super.Kg(y95Var);
        y95Var.Y3(y27.f, new y27(this.E.h(kyh0.common_back), new SettingsPresenter$attachView$1(0, this, c.class, "closeSettings", "closeSettings()V", 0), 12));
        com.yandex.go.coroutines.b.h(Jg(), e.X(this.J.a(), new SettingsPresenter$attachView$$inlined$flatMapLatest$1(null, this)));
    }
}
