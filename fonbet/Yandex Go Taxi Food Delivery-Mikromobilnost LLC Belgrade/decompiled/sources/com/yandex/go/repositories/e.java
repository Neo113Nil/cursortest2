package com.yandex.go.repositories;

import com.yandex.go.experiment.f;
import defpackage.b2k;
import defpackage.bgv;
import defpackage.bvf0;
import defpackage.cgv;
import defpackage.eci0;
import defpackage.egv;
import defpackage.jl40;
import defpackage.r2u0;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wq21;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class e {
    public final ru.yandex.taxi.startup.launch.response.e a;
    public final h b;
    public final g c;
    public final r0 d = bvf0.c(null);
    public final r0 e;
    public final eci0 f;
    public final eci0 g;

    public e(ru.yandex.taxi.startup.launch.response.e eVar, h hVar, g gVar, tse tseVar, tt2 tt2Var, wq21 wq21Var) {
        this.a = eVar;
        this.b = hVar;
        this.c = gVar;
        r0 c = bvf0.c(null);
        this.e = c;
        b2k s = kotlinx.coroutines.flow.e.s(new rol0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new tpr[]{new f(ru.yandex.taxi.experiments.d.a(wq21Var.a())), c}, null, new UserPhotoStateRepository$photoUrlFlow$1(this, null))), new UserPhotoStateRepository$photoUrlFlow$2(2, this, e.class, "areImageUrlEquivalent", "areImageUrlEquivalent(Lcom/yandex/go/repositories/ImageUrl;Lcom/yandex/go/repositories/ImageUrl;)Z", 0));
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        tpr F = kotlinx.coroutines.flow.e.F(s, sjhVar);
        xsr0.a.getClass();
        r2u0 r2u0Var = wsr0.c;
        this.f = kotlinx.coroutines.flow.e.O(F, tseVar, r2u0Var, 1);
        this.g = kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.s(kotlinx.coroutines.flow.e.X(c, new UserPhotoStateRepository$special$$inlined$flatMapLatest$1(this, null)), new UserPhotoStateRepository$photoUrlFlowIgnoreExperiment$2(2, this, e.class, "areImageUrlEquivalent", "areImageUrlEquivalent(Lcom/yandex/go/repositories/ImageUrl;Lcom/yandex/go/repositories/ImageUrl;)Z", 0)), sjhVar), tseVar, r2u0Var, 1);
    }

    public static final boolean a(e eVar, egv egvVar, egv egvVar2) {
        eVar.getClass();
        if ((egvVar instanceof cgv) && (egvVar2 instanceof cgv)) {
            return jl40.l(((cgv) egvVar).a, ((cgv) egvVar2).a);
        }
        if ((egvVar instanceof bgv) && (egvVar2 instanceof bgv)) {
            return jl40.l(((bgv) egvVar).b(), ((bgv) egvVar2).b());
        }
        return false;
    }

    public static final m0 b(e eVar, String str) {
        return new m0(com.yandex.go.coroutines.b.d(new b(new ru.yandex.taxi.startup.launch.response.d(new ru.yandex.taxi.startup.launch.response.b(eVar.a.f))), new UserPhotoStateRepository$photoUrlFlowInternal$$inlined$start$1(eVar, null)), new d(eVar.d, eVar), new UserPhotoStateRepository$photoUrlFlowInternal$4(str, null));
    }
}
