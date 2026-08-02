package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: ManagedGroupsFolderCounterProvider.kt */
/* loaded from: classes18.dex */
public final class mi00 implements fnk {
    public final uyr a;
    public final gi00 b;

    public mi00(uyr uyrVar, gi00 gi00Var) {
        this.a = uyrVar;
        this.b = gi00Var;
    }

    @Override // xsna.fnk
    public final io.reactivex.rxjava3.internal.operators.observable.l2 a() {
        return this.a.a(FolderType.MANAGED_GROUPS).s0(new mau(new srg(this, 26), 4)).r0(asu0.a.c());
    }
}
