package defpackage;

import android.content.Context;
import com.yandex.go.scooters.offers.v2.surge.widget.d;
import com.yandex.go.scooters.photocontrol.data.ScootersPhotocontrolVerifyApi;
import ru.yandex.taxi.scooters.data.a;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class mdo0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final e7g c;
    public final xvf0 d;
    public final xvf0 e;

    public mdo0(e7g e7gVar, e7g e7gVar2, l7g l7gVar, xvf0 xvf0Var) {
        this.a = 1;
        this.b = e7gVar;
        this.c = e7gVar2;
        this.d = l7gVar;
        this.e = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.b;
        e7g e7gVar = this.c;
        switch (i) {
            case 0:
                return new kdd0((tt2) e7gVar.get(), (k7x0) xvf0Var3.get(), (pwy0) xvf0Var2.get(), (c) xvf0Var.get());
            case 1:
                return new com.yandex.go.scooters.photocontrol.data.c((Context) xvf0Var3.get(), (tt2) e7gVar.get(), (a) xvf0Var2.get(), (ScootersPhotocontrolVerifyApi) xvf0Var.get());
            default:
                return new d((tt2) e7gVar.get(), (pwy0) xvf0Var3.get(), (y5p0) xvf0Var2.get(), (k7x0) xvf0Var.get());
        }
    }

    public /* synthetic */ mdo0(e7g e7gVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.c = e7gVar;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
    }
}
