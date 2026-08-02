package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class k7g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ k7g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                tyx tyxVar = (tyx) ((c0g) i6rVar).z.nm.get();
                q5z.h(tyxVar);
                return tyxVar;
            case 1:
                return (gzx) ((c0g) i6rVar).ne.get();
            case 2:
                ney y2 = ((c0g) i6rVar).y2();
                q5z.h(y2);
                return y2;
            case 3:
                Lifecycle lifecycle = (Lifecycle) ((c0g) i6rVar).P.get();
                q5z.h(lifecycle);
                return lifecycle;
            case 4:
                wuy wuyVar = (wuy) ((c0g) i6rVar).z.Pq.get();
                q5z.h(wuyVar);
                return wuyVar;
            case 5:
                zuy zuyVar = (zuy) ((c0g) i6rVar).z.Lq.get();
                q5z.h(zuyVar);
                return zuyVar;
            case 6:
                j5z j5zVar = (j5z) ((c0g) i6rVar).z.f0.get();
                q5z.h(j5zVar);
                return j5zVar;
            case 7:
                return ((c0g) i6rVar).A.a.F();
            case 8:
                n nVar = (n) ((c0g) i6rVar).z.Q2.get();
                q5z.h(nVar);
                return nVar;
            case 9:
                return ((c0g) i6rVar).z.U0();
            case 10:
                ah00 z2 = ((c0g) i6rVar).z2();
                q5z.h(z2);
                return z2;
            case 11:
                el00 el00Var = (el00) ((c0g) i6rVar).z.Dc.get();
                q5z.h(el00Var);
                return el00Var;
            case 12:
                MapNotificationsMuteRepository mapNotificationsMuteRepository = (MapNotificationsMuteRepository) ((c0g) i6rVar).Fu.get();
                q5z.h(mapNotificationsMuteRepository);
                return mapNotificationsMuteRepository;
            case 13:
                e A2 = ((c0g) i6rVar).A2();
                q5z.h(A2);
                return A2;
            case 14:
                w030 C2 = ((c0g) i6rVar).C2();
                q5z.h(C2);
                return C2;
            case 15:
                return (cg30) ((c0g) i6rVar).ey.get();
            case 16:
                return ((c0g) i6rVar).D5();
            case 17:
                return new mr40(new es40((pho) ((c0g) i6rVar).A.a.b.z.d0.get()));
            case 18:
                qr40 qr40Var = (qr40) ((c0g) i6rVar).qd.get();
                q5z.h(qr40Var);
                return qr40Var;
            case 19:
                a850 a850Var = (a850) ((c0g) i6rVar).z.C8.get();
                q5z.h(a850Var);
                return a850Var;
            case 20:
                ru.yandex.taxi.am.e eVar = (ru.yandex.taxi.am.e) ((c0g) i6rVar).F7.get();
                q5z.h(eVar);
                return eVar;
            case 21:
                tj60 tj60Var = (tj60) ((c0g) i6rVar).t7.get();
                q5z.h(tj60Var);
                return tj60Var;
            case 22:
                a aVar = (a) ((c0g) i6rVar).z.C3.get();
                q5z.h(aVar);
                return aVar;
            case 23:
                Context context = (Context) ((hcg) ((ku11) ((c0g) i6rVar).A.a.b.G0.get()).a.getValue()).a.a;
                q5z.h(context);
                return new gp60(new ru.yandex.taxi.vendor_api.google.object_detection.a(context));
            case 24:
                e270 e270Var = (e270) ((c0g) i6rVar).z.Zd.get();
                q5z.h(e270Var);
                return e270Var;
            case 25:
                ru.yandex.taxi.design.utils.a aVar2 = (ru.yandex.taxi.design.utils.a) ((c0g) i6rVar).g9.get();
                q5z.h(aVar2);
                return aVar2;
            case 26:
                return (z0a0) ((c0g) i6rVar).z.fi.get();
            case 27:
                ((c0g) i6rVar).getClass();
                return new n6a0();
            case 28:
                return ((c0g) i6rVar).O5();
            default:
                return new qy90(((c0g) i6rVar).z.h1());
        }
    }
}
