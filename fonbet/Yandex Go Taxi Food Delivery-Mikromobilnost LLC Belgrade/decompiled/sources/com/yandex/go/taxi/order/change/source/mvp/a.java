package com.yandex.go.taxi.order.change.source.mvp;

import defpackage.ac9;
import defpackage.mdh;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ud;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.yw0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.address.experiment.e;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ d a;
    public final /* synthetic */ ac9 b;

    public a(d dVar, ac9 ac9Var) {
        this.a = dVar;
        this.b = ac9Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        e eVar = (e) obj;
        yw0 yw0Var = eVar != null ? eVar.a : null;
        ac9 ac9Var = this.b;
        d dVar = this.a;
        if (yw0Var == null) {
            dVar.B.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(o400.a, new ChangeOrderSourceAddressPresenter$attachView$3$1$1(ac9Var, null), continuation);
            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return k0;
            }
        } else {
            tpr f = dVar.C.b().b(eVar.a.a).f();
            dVar.B.getClass();
            sjh sjhVar2 = uyj.a;
            Object collect = kotlinx.coroutines.flow.e.F(f, mdh.b).collect(new ud(8, ac9Var, eVar), continuation);
            if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return collect;
            }
        }
        return zy11.a;
    }
}
