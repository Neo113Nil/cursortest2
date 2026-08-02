package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: ClipUploadExternalNpsDelegate.kt */
/* loaded from: classes17.dex */
public final class fed implements se5 {
    public final bfq a;

    public fed(bfq bfqVar) {
        this.a = bfqVar;
    }

    @Override // xsna.se5
    public final io.reactivex.rxjava3.internal.operators.observable.b0 a() {
        io.reactivex.rxjava3.subjects.f a = this.a.a();
        n7 n7Var = new n7(new vt1(10), 11);
        a.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(a, n7Var);
        b60 b60Var = new b60(new a60(14), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return i0Var.E(b60Var, lVar, kVar, kVar);
    }

    @Override // xsna.se5
    public final void b(ExternalNpsCondition externalNpsCondition) {
        this.a.d(externalNpsCondition);
    }
}
