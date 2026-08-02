package defpackage;

import com.yandex.go.address.models.Address;
import kotlin.collections.a;
import ru.yandex.taxi.masstransit.router.i;

/* loaded from: classes6.dex */
public final class ly30 implements kc30 {
    public final /* synthetic */ lc30 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i c;

    public ly30(lc30 lc30Var, boolean z, i iVar) {
        this.a = lc30Var;
        this.b = z;
        this.c = iVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.c.Q();
    }

    @Override // defpackage.kc30
    public final void d(Address address) {
        int i = ky30.a[this.a.a.ordinal()];
        i iVar = this.c;
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            if (this.b) {
                wu30 wu30Var = iVar.P().a.G0;
                q5z.h(wu30Var);
                tu30 tu30Var = wu30Var.a;
                tu30Var.b(a.o0(tu30Var.a().b, address));
            } else {
                wu30 wu30Var2 = iVar.P().a.G0;
                q5z.h(wu30Var2);
                wu30Var2.d(address);
            }
        }
        iVar.Q();
    }
}
