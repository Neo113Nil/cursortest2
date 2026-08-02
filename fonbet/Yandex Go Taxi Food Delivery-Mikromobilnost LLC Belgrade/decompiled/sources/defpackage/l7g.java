package defpackage;

import android.os.PowerManager;
import com.yandex.go.promocodes.d;
import com.yandex.go.shortcuts.impl.interactors.w;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.scooters.data.ScootersControlApi;
import ru.yandex.taxi.scooters.data.data_source.a;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.domain.e;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.ScootersCompletionPhotoVehicleDetectionModelDownloadApi;

/* loaded from: classes6.dex */
public final class l7g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ l7g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                ((c0g) i6rVar).getClass();
                return new jua0();
            case 1:
                fva0 F2 = ((c0g) i6rVar).F2();
                q5z.h(F2);
                return F2;
            case 2:
                return ((c0g) i6rVar).z.i1();
            case 3:
                return ((c0g) i6rVar).G2();
            case 4:
                return ((c0g) i6rVar).T5();
            case 5:
                ysd0 ysd0Var = (ysd0) ((c0g) i6rVar).wd.get();
                q5z.h(ysd0Var);
                return ysd0Var;
            case 6:
                atd0 H2 = ((c0g) i6rVar).H2();
                q5z.h(H2);
                return H2;
            case 7:
                PowerManager powerManager = (PowerManager) ((c0g) i6rVar).z.m4.get();
                q5z.h(powerManager);
                return powerManager;
            case 8:
                dne0 dne0Var = (dne0) ((c0g) i6rVar).z.d.get();
                q5z.h(dne0Var);
                return dne0Var;
            case 9:
                w wVar = (w) ((c0g) i6rVar).ec.get();
                q5z.h(wVar);
                return wVar;
            case 10:
                return (d) ((c0g) i6rVar).S9.get();
            case 11:
                return ((c0g) i6rVar).K2();
            case 12:
                dei0 dei0Var = (dei0) ((c0g) i6rVar).z.he.get();
                q5z.h(dei0Var);
                return dei0Var;
            case 13:
                return ((c0g) i6rVar).z.l1();
            case 14:
                return ((c0g) i6rVar).M2();
            case 15:
                zuj0 N2 = ((c0g) i6rVar).N2();
                q5z.h(N2);
                return N2;
            case 16:
                kqm0 kqm0Var = (kqm0) ((c0g) i6rVar).z.V3.get();
                q5z.h(kqm0Var);
                return kqm0Var;
            case 17:
                ywm0 ywm0Var = (ywm0) ((c0g) i6rVar).A.a.E4.get();
                q5z.h(ywm0Var);
                return ywm0Var;
            case 18:
                return ((c0g) i6rVar).z.o1();
            case 19:
                wxm0 wxm0Var = (wxm0) ((c0g) i6rVar).z.Qq.get();
                q5z.h(wxm0Var);
                return wxm0Var;
            case 20:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                return new c8n0(d0gVar.t4, d0gVar.u4, 0);
            case 21:
                r9n0 r9n0Var = (r9n0) ((c0g) i6rVar).A.a.F4.get();
                q5z.h(r9n0Var);
                return r9n0Var;
            case 22:
                on2 on2Var = (on2) ((c0g) i6rVar).A.a.a.w0.get();
                on2Var.getClass();
                ScootersCompletionPhotoVehicleDetectionModelDownloadApi scootersCompletionPhotoVehicleDetectionModelDownloadApi = (ScootersCompletionPhotoVehicleDetectionModelDownloadApi) on2Var.a(GoApiName.TaxiV4, ScootersCompletionPhotoVehicleDetectionModelDownloadApi.class);
                q5z.i(scootersCompletionPhotoVehicleDetectionModelDownloadApi);
                return scootersCompletionPhotoVehicleDetectionModelDownloadApi;
            case 23:
                bbn0 bbn0Var = (bbn0) ((c0g) i6rVar).z.Gg.get();
                q5z.h(bbn0Var);
                return bbn0Var;
            case 24:
                ScootersControlApi b = d1b1.b((on2) ((c0g) i6rVar).z.w0.get());
                q5z.i(b);
                return b;
            case 25:
                zzf zzfVar = ((c0g) i6rVar).z;
                return new e((a) zzfVar.oe.get(), new gko0(), (g) zzfVar.gb.get());
            case 26:
                g gVar = (g) ((c0g) i6rVar).z.gb.get();
                q5z.h(gVar);
                return gVar;
            case 27:
                com.yandex.go.scooters.payments.domain.a aVar = (com.yandex.go.scooters.payments.domain.a) ((c0g) i6rVar).r6.get();
                q5z.h(aVar);
                return aVar;
            case 28:
                h hVar = (h) ((c0g) i6rVar).z.U3.get();
                q5z.h(hVar);
                return hVar;
            default:
                return new tdn0((rqo) ((c0g) i6rVar).A.a.a.C.get());
        }
    }
}
