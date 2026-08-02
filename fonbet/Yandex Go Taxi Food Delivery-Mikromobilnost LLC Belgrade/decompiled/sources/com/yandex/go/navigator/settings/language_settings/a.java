package com.yandex.go.navigator.settings.language_settings;

import com.yandex.go.navigator.driving.speaker.d;
import defpackage.aa5;
import defpackage.avj0;
import defpackage.bf50;
import defpackage.bsx;
import defpackage.kyh0;
import defpackage.pwy0;
import defpackage.qc50;
import defpackage.r6r0;
import defpackage.tje;
import defpackage.y95;
import defpackage.yrx;
import defpackage.zuj0;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class a extends aa5 {
    public final bf50 B;
    public final avj0 C;
    public final qc50 D;
    public final d E;
    public final yrx F;
    public final r6r0 G;
    public final bsx H;
    public final pwy0 I;
    public ListBuilder J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(bf50 bf50Var, zuj0 zuj0Var, qc50 qc50Var, d dVar, yrx yrxVar, r6r0 r6r0Var, bsx bsxVar, pwy0 pwy0Var, ru.yandex.taxi.design.utils.b bVar) {
        super(r3.h(kyh0.navigator_language), bVar, pwy0Var, yrxVar);
        avj0 avj0Var = (avj0) zuj0Var;
        this.B = bf50Var;
        this.C = avj0Var;
        this.D = qc50Var;
        this.E = dVar;
        this.F = yrxVar;
        this.G = r6r0Var;
        this.H = bsxVar;
        this.I = pwy0Var;
    }

    @Override // defpackage.aa5
    public final void Kg(y95 y95Var) {
        super.Kg(y95Var);
        tje.N(Jg(), null, null, new LanguageSettingsPresenter$attachView$$inlined$safeCollectIn$1(new m0(this.B.n, this.D.b, new LanguageSettingsPresenter$attachView$1(this, null)), null, y95Var), 3);
    }
}
