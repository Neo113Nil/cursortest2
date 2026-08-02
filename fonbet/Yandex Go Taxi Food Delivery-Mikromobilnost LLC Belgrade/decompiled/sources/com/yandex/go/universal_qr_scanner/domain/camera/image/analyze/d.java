package com.yandex.go.universal_qr_scanner.domain.camera.image.analyze;

import defpackage.bvf0;
import defpackage.c021;
import defpackage.pzt0;
import defpackage.tt2;
import defpackage.wz11;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class d {
    public final tt2 a;
    public final com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.b b;
    public final c021 c;
    public final wz11 d;
    public final r0 e = bvf0.c(EmptyList.a);
    public volatile pzt0 f;

    public d(tt2 tt2Var, com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.b bVar, c021 c021Var, wz11 wz11Var) {
        this.a = tt2Var;
        this.b = bVar;
        this.c = c021Var;
        this.d = wz11Var;
    }

    public final Object a(Continuation continuation) {
        Object n;
        zy11 zy11Var = zy11.a;
        pzt0 pzt0Var = this.f;
        return ((pzt0Var == null || !pzt0Var.isActive()) && (n = bvf0.n(new UniversalQrScannerImageInteractor$startAnalyze$2(this, null), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? n : zy11Var;
    }
}
