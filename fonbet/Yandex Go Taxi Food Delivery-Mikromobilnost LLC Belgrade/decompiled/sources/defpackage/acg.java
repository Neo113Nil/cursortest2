package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.domain.inviteLink.b;
import com.yandex.messaging.domain.privacy.a;
import com.yandex.messaging.internal.authorized.sync.d;
import com.yandex.messaging.internal.v;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class acg implements xvf0 {
    public final /* synthetic */ int a;
    public final vbb b;

    public /* synthetic */ acg(vbb vbbVar, int i) {
        this.a = i;
        this.b = vbbVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        vbb vbbVar = this.b;
        switch (i) {
            case 0:
                MessengerEnvironment M = vbbVar.M();
                q5z.h(M);
                return M;
            case 1:
                z8g z8gVar = (z8g) vbbVar.a;
                Context context = z8gVar.a.a;
                q5z.i(context);
                x22 x22Var = (x22) z8gVar.y.get();
                p8g p8gVar = (p8g) vbbVar.b;
                String str = p8gVar.a;
                ch60 ch60Var = (ch60) p8gVar.q1.get();
                h3y a = i5m.a(p8gVar.r1);
                z8g z8gVar2 = p8gVar.b;
                g420 g420Var = z8gVar2.a;
                Context context2 = g420Var.a;
                q5z.i(context2);
                Context context3 = g420Var.a;
                q5z.i(context3);
                l420 l420Var = new l420(context2, new hay(context3), (kse) z8gVar2.f.get());
                rz10 rz10Var = z8gVar2.a.k;
                q5z.i(rz10Var);
                return new w220(context, x22Var, str, ch60Var, a, l420Var, new ume(rz10Var));
            case 2:
                Context context4 = ((z8g) vbbVar.a).a.a;
                q5z.i(context4);
                return new j420(context4);
            case 3:
                pm50 pm50Var = (pm50) ((p8g) vbbVar.b).J1.get();
                q5z.h(pm50Var);
                return pm50Var;
            case 4:
                dh60 O = vbbVar.O();
                q5z.h(O);
                return O;
            case 5:
                w270 w270Var = (w270) ((p8g) vbbVar.b).g2.get();
                q5z.h(w270Var);
                return w270Var;
            case 6:
                ce80 ce80Var = (ce80) ((p8g) vbbVar.b).j2.get();
                q5z.h(ce80Var);
                return ce80Var;
            case 7:
                qj80 qj80Var = (qj80) ((p8g) vbbVar.b).O0.get();
                q5z.h(qj80Var);
                return qj80Var;
            case 8:
                ax80 ax80Var = (ax80) ((p8g) vbbVar.b).F.get();
                q5z.h(ax80Var);
                return ax80Var;
            case 9:
                return ((p8g) vbbVar.b).n();
            case 10:
                p8g p8gVar2 = (p8g) vbbVar.b;
                a aVar = new a((rcy0) p8gVar2.m.get(), p8gVar2.c(), vbbVar.D(), new com.yandex.messaging.internal.storage.privacy.a((SharedPreferences) p8gVar2.r.get(), (xdf0) p8gVar2.q.get()), (kse) ((z8g) vbbVar.a).f.get());
                g4f0 g4f0Var = new g4f0();
                tpr c = aVar.c();
                k5c a2 = ds31.a(g4f0Var);
                xsr0.a.getClass();
                e.R(c, a2, wsr0.b, Boolean.FALSE);
                return g4f0Var;
            case 11:
                twi0 twi0Var = (twi0) ((p8g) vbbVar.b).X2.get();
                q5z.h(twi0Var);
                return twi0Var;
            case 12:
                vzi0 vzi0Var = (vzi0) ((p8g) vbbVar.b).L2.get();
                q5z.h(vzi0Var);
                return vzi0Var;
            case 13:
                b bVar = (b) ((p8g) vbbVar.b).b3.get();
                q5z.h(bVar);
                return bVar;
            case 14:
                eyj0 eyj0Var = (eyj0) ((p8g) vbbVar.b).I.get();
                q5z.h(eyj0Var);
                return eyj0Var;
            case 15:
                SharedPreferences T = vbbVar.T();
                q5z.h(T);
                return T;
            case 16:
                tqq0 tqq0Var = (tqq0) ((p8g) vbbVar.b).G1.get();
                q5z.h(tqq0Var);
                return tqq0Var;
            case 17:
                a8u E = vbbVar.E();
                z8g z8gVar3 = (z8g) vbbVar.a;
                kse kseVar = (kse) z8gVar3.f.get();
                kse kseVar2 = (kse) z8gVar3.f.get();
                p8g p8gVar3 = (p8g) vbbVar.b;
                xyw xywVar = new xyw(kseVar2, (w5t) p8gVar3.L0.get());
                lqo lqoVar = z8gVar3.a.d;
                q5z.i(lqoVar);
                tft tftVar = new tft(kseVar, xywVar, lqoVar, i5m.a(p8gVar3.K2));
                lnr0 lnr0Var = new lnr0();
                zy11 zy11Var = zy11.a;
                tpr a3 = E.a(zy11Var);
                k5c a4 = ds31.a(lnr0Var);
                wsr0 wsr0Var = xsr0.a;
                o430 o430Var = e3n.b;
                DurationUnit durationUnit = DurationUnit.SECONDS;
                e.R(a3, a4, jx81.a(2, kp50.U(5, durationUnit)), null);
                e.R(tftVar.a(zy11Var), ds31.a(lnr0Var), jx81.a(2, kp50.U(5, durationUnit)), Boolean.FALSE);
                return lnr0Var;
            case 18:
                u9u0 u9u0Var = (u9u0) ((p8g) vbbVar.b).P.get();
                q5z.h(u9u0Var);
                return u9u0Var;
            case 19:
                rcy0 rcy0Var = (rcy0) ((p8g) vbbVar.b).m.get();
                q5z.h(rcy0Var);
                return rcy0Var;
            case 20:
                z8g z8gVar4 = (z8g) vbbVar.a;
                SharedPreferences sharedPreferences = (SharedPreferences) z8gVar4.T.get();
                return new xcy0(sharedPreferences);
            case 21:
                g420 g420Var2 = ((z8g) vbbVar.a).a;
                Context context5 = g420Var2.a;
                q5z.i(context5);
                p8g p8gVar4 = (p8g) vbbVar.b;
                b00 b00Var = (b00) p8gVar4.U.get();
                w5t w5tVar = (w5t) p8gVar4.L0.get();
                v c2 = p8gVar4.c();
                q0k q0kVar = (q0k) p8gVar4.G0.get();
                jn3 jn3Var = (jn3) p8gVar4.X.get();
                o150 o150Var = (o150) p8gVar4.Q.get();
                MessengerEnvironment messengerEnvironment = (MessengerEnvironment) p8gVar4.i.get();
                lqo lqoVar2 = g420Var2.d;
                q5z.i(lqoVar2);
                return new com.yandex.messaging.ui.banners.a(context5, b00Var, w5tVar, c2, q0kVar, jn3Var, o150Var, messengerEnvironment, lqoVar2, i5m.a(p8gVar4.m), (d) p8gVar4.W0.get());
            case 22:
                key0 key0Var = (key0) ((p8g) vbbVar.b).f2.get();
                q5z.h(key0Var);
                return key0Var;
            case 23:
                ney0 ney0Var = (ney0) ((p8g) vbbVar.b).u0.get();
                q5z.h(ney0Var);
                return ney0Var;
            case 24:
                SharedPreferences sharedPreferences2 = (SharedPreferences) ((p8g) vbbVar.b).i1.get();
                q5z.h(sharedPreferences2);
                return sharedPreferences2;
            case 25:
                dwy0 dwy0Var = (dwy0) ((z8g) vbbVar.a).R.get();
                q5z.h(dwy0Var);
                return dwy0Var;
            case 26:
                d721 d721Var = (d721) ((p8g) vbbVar.b).P2.get();
                q5z.h(d721Var);
                return d721Var;
            case 27:
                j721 j721Var = (j721) ((p8g) vbbVar.b).N2.get();
                q5z.h(j721Var);
                return j721Var;
            case 28:
                el21 el21Var = (el21) ((p8g) vbbVar.b).p.get();
                q5z.h(el21Var);
                return el21Var;
            default:
                return ((p8g) vbbVar.b).h();
        }
    }
}
