package defpackage;

import com.yandex.messaging.activity.b;
import com.yandex.messaging.forceupdate.a;
import com.yandex.messaging.profile.d;

/* loaded from: classes15.dex */
public final class fcg implements lt11 {
    public final sae a;
    public final fcg b = this;
    public final ecg c;
    public final xvf0 d;
    public final xvf0 e;
    public final ecg f;
    public final ecg g;
    public final ecg h;
    public final ecg i;

    public fcg(sae saeVar) {
        this.a = saeVar;
        ecg ecgVar = new ecg(saeVar, 6);
        this.c = ecgVar;
        this.d = i5m.b(new zd51(ecgVar, 24));
        this.e = i5m.b(new d701(this.c, new ecg(saeVar, 3), 8));
        i5m.b(e020.a);
        ecg ecgVar2 = new ecg(saeVar, 0);
        this.f = ecgVar2;
        ecg ecgVar3 = new ecg(saeVar, 4);
        ecg ecgVar4 = new ecg(saeVar, 2);
        this.g = ecgVar4;
        i5m.b(new bhx(ecgVar2, ecgVar3, new cer(ecgVar4, 21), 23));
        new nwf(22, this);
        i5m.b(new a());
        this.h = new ecg(saeVar, 1);
        this.i = new ecg(saeVar, 5);
        i5m.b(new c4((xvf0) this.g, (xvf0) new ecg(saeVar, 7), (xvf0) this.f, 15, (byte) 0));
    }

    public final com.yandex.messaging.ui.profile.config.a a() {
        sae saeVar = this.a;
        vse v = saeVar.v();
        q5z.h(v);
        d z = saeVar.z();
        q5z.h(z);
        return new com.yandex.messaging.ui.profile.config.a(v, z, saeVar.u());
    }

    public final b b() {
        return (b) this.e.get();
    }

    public final dwy0 c() {
        dwy0 dwy0Var = (dwy0) ((z8g) this.a.b).R.get();
        q5z.h(dwy0Var);
        return dwy0Var;
    }
}
