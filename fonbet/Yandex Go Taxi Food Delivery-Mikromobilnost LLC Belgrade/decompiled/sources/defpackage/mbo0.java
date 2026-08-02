package defpackage;

import android.content.Context;
import com.yandex.go.scooters.domain.polling.j;
import com.yandex.go.scooters.passes.domain.g;
import com.yandex.go.scooters.photocontrol.data.ScootersPhotocontrolVerifyApi;
import com.yandex.go.scooters.qr.unavailable_scooter.data.a;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes13.dex */
public final class mbo0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ mbo0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static mbo0 a(eqh eqhVar) {
        return new mbo0(eqhVar, 18);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ndl0(15, (qxm0) xvf0Var.get());
            case 1:
                return new nbo0((rqo) xvf0Var.get());
            case 2:
                return new u8w((pho) xvf0Var.get());
            case 3:
                return new jco0((rqo) xvf0Var.get());
            case 4:
                return new g((e2e0) xvf0Var.get());
            case 5:
                return new wco0((rqo) xvf0Var.get());
            case 6:
                return new ewn0(new ehn0(14, (dwn0) xvf0Var.get()));
            case 7:
                return new zgo0((rqo) xvf0Var.get());
            case 8:
                return new x770((pho) xvf0Var.get());
            case 9:
                return new jho0((pho) xvf0Var.get());
            case 10:
                return new aio0((rqo) xvf0Var.get());
            case 11:
                on2 on2Var = (on2) xvf0Var.get();
                on2Var.getClass();
                ScootersPhotocontrolVerifyApi scootersPhotocontrolVerifyApi = (ScootersPhotocontrolVerifyApi) on2Var.a(GoApiName.TaxiV4, ScootersPhotocontrolVerifyApi.class);
                q5z.i(scootersPhotocontrolVerifyApi);
                return scootersPhotocontrolVerifyApi;
            case 12:
                return new vr((Context) xvf0Var.get(), (char) 0);
            case 13:
                return new yjo0((e2e0) xvf0Var.get());
            case 14:
                j jVar = (j) xvf0Var.get();
                q5z.i(jVar);
                return jVar;
            case 15:
                j jVar2 = (j) xvf0Var.get();
                q5z.i(jVar2);
                return jVar2;
            case 16:
                return new ewn0(new l0b(i5m.a(xvf0Var), 8));
            case 17:
                return new a22((zuj0) xvf0Var.get());
            case 18:
                return new x770((pho) xvf0Var.get());
            case 19:
                return new x770((pho) xvf0Var.get());
            case 20:
                return new xpo0((n5o0) xvf0Var.get());
            case 21:
                return new s6k0((lx4) xvf0Var.get());
            case 22:
                return new a((rqo) xvf0Var.get());
            case 23:
                return new wro0((Context) xvf0Var.get());
            case 24:
                return new xro0((pho) xvf0Var.get());
            case 25:
                return new fll0((rqo) xvf0Var.get(), 1);
            case 26:
                return new nso0((pho) xvf0Var.get());
            case 27:
                return new x770((pho) xvf0Var.get());
            case 28:
                return new oso0((pho) xvf0Var.get());
            default:
                return new uto0((zuj0) xvf0Var.get());
        }
    }

    public /* synthetic */ mbo0(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
