package xsna;

import com.vk.voip.ui.sessionrooms.dialog.model.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class x1j implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ x1j(a2j a2jVar, int i, boolean z, int i2) {
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Integer V = a2j.V((a.b) obj, Integer.valueOf(i));
        Integer valueOf = this.c ? Integer.valueOf(this.d * 60) : null;
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.sessionrooms.d dVar = com.vk.voip.ui.c.B0;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.completable.e(new fwi0(dVar, V, i, valueOf));
    }
}
