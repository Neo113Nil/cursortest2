package defpackage;

import com.yandex.go.agreement.router.d;
import com.yandex.go.chargers.map.combined.a;
import com.yandex.go.payments.mbank.navigation.b;
import java.util.HashMap;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;

/* loaded from: classes12.dex */
public final /* synthetic */ class bb0 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ bb0(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 9;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((fb0) h55Var).r(new qu(i2));
                break;
            case 1:
                b bVar = (b) h55Var;
                h4a0 h4a0Var = bVar.I;
                h4a0Var.getClass();
                h4a0Var.a.a("PaymentMethod.AddMBank.Close", new HashMap(), 1, new HashMap());
                bVar.r(new qu(i2));
                break;
            case 2:
                uva uvaVar = (uva) h55Var;
                uvaVar.r(new qu(i2));
                ((j0) uvaVar.F).invoke();
                break;
            case 3:
                c01 c01Var = (c01) h55Var;
                c01Var.r(new qu(i2));
                c01Var.E.run();
                break;
            case 4:
                ((n31) h55Var).r(new qu(i2));
                break;
            case 5:
                ((d) h55Var).r(new qu(9));
                break;
            case 6:
                ((com.yandex.go.quark.ai_assistant.impl.router.d) h55Var).r(new qu(9));
                break;
            case 7:
                h02 h02Var = (h02) h55Var;
                h02Var.r(new qu(i2));
                h02Var.E.invoke();
                break;
            case 8:
                ((ap9) h55Var).r(new qu(i2));
                break;
            case 9:
                qk5 qk5Var = (qk5) h55Var;
                qk5Var.E.b((m950) qk5Var.I.get(), zy11Var);
                break;
            case 10:
                ((com.yandex.go.benefits_center.benefits.router.d) h55Var).r(new qu(9));
                break;
            case 11:
                yn5 yn5Var = (yn5) h55Var;
                yn5Var.r(new qu(i2));
                ((sls) yn5Var.F).invoke();
                break;
            case 12:
                ((MapNotificationsMuteRepository) ((a46) h55Var).N).a();
                break;
            case 13:
                uva uvaVar2 = (uva) h55Var;
                uvaVar2.r(new qu(i2));
                ((kw6) uvaVar2.F).run();
                break;
            case 14:
                lj8 lj8Var = (lj8) h55Var;
                lj8Var.r(new cx7(13, lj8Var));
                break;
            case 15:
                ((zsa) h55Var).r(new qu(i2));
                break;
            case 16:
                a aVar = (a) h55Var;
                aVar.F.b(qoi0.a(aVar.H.getClass()));
                aVar.D.c();
                oj9 oj9Var = aVar.E;
                oj9Var.a.offer(aVar.J);
                break;
            case 17:
                ((y4c0) h55Var).i();
                break;
            case 18:
                ((y2a) h55Var).r(new qu(i2));
                break;
            case 19:
                ((yga) h55Var).L.h.g(zy11Var);
                break;
            case 20:
                ((ika) h55Var).H.d.g(zy11Var);
                break;
            case 21:
                xx70 xx70Var = (xx70) h55Var;
                xx70Var.r(new qu(i2));
                ((sls) xx70Var.E).invoke();
                break;
            case 22:
                npc npcVar = (npc) h55Var;
                npcVar.r(new qu(i2));
                npcVar.F.invoke();
                break;
            case 23:
                ((f28) h55Var).r(new qu(i2));
                break;
            case 24:
                ((com.yandex.go.places.complaint.impl.navigation.a) h55Var).i();
                break;
            case 25:
                ((fl5) h55Var).r(new qu(i2));
                break;
            case 26:
                ((com.yandex.go.logistics.cargo_flow.a) h55Var).r(new wth(4));
                break;
            case 27:
                ((gzm0) h55Var).r(new qu(i2));
                break;
            case 28:
                uva uvaVar3 = (uva) h55Var;
                uvaVar3.r(new qu(i2));
                ((bmh) uvaVar3.F).invoke();
                break;
            default:
                ((ru.yandex.taxi.delivery.router.primary.a) h55Var).r(new qu(i2));
                break;
        }
    }
}
