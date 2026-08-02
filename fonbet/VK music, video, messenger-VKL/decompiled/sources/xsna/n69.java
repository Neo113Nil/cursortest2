package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xsna.i330;
import xsna.t69;

/* compiled from: CallOnboardingModelWatcher.kt */
/* loaded from: classes7.dex */
public final class n69 {
    public final izs<List<? extends t69.a>, s3q0> a;
    public final izs<Boolean, s3q0> b;
    public final i330<t69> c;
    public final io.reactivex.rxjava3.disposables.c d;

    public n69(h69 h69Var, izs izsVar, com.vk.movika.sdk.base.observable.e eVar) {
        this.a = izsVar;
        this.b = eVar;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(k69.b, new g15(1, this, n69.class, "visibilityChanged", "visibilityChanged(Z)V", 0, 2), new pv7((byte) 0, 3)));
        arrayList.add(new i330.b(l69.b, new m69(1, this, n69.class, "itemsChanged", "itemsChanged(Ljava/util/List;)V", 0), new pv7((byte) 0, 3)));
        this.c = new i330<>(arrayList, hashMap);
        j69 j69Var = new j69();
        this.d = new io.reactivex.rxjava3.internal.operators.observable.y(h69Var.c.a0(asu0.a.d()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new z7(new e15(1, j69Var, j69.class, "transform", "transform(Lcom/vk/voip/ui/onboarding/CallOnboardingState;)Lcom/vk/voip/ui/onboarding/model/CallOnboardingViewModel;", 0, 2), 8)).subscribe(new h60(new a8(this, 11), 4));
    }
}
