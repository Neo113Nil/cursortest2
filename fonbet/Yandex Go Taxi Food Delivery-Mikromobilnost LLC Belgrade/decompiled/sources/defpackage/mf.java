package defpackage;

import com.yandex.go.agreement.api.Acceptance$Default$IconStyle;
import com.yandex.go.agreement.api.AcceptanceChangeSource;
import com.yandex.go.agreement.interactor.a;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.taxi.client.response.LaunchAcceptance;

/* loaded from: classes8.dex */
public final class mf implements hwx {
    public final h3y a;
    public final fyn b;

    public mf(h3y h3yVar, fyn fynVar) {
        this.a = h3yVar;
        this.b = fynVar;
    }

    @Override // defpackage.j35
    public final String getName() {
        return "ACCEPTANCE";
    }

    @Override // defpackage.hwx
    public final void k(owx owxVar) {
        this.b.getClass();
        kf kfVar = (kf) this.a.get();
        jd jdVar = kfVar.b;
        List list = owxVar.v;
        kd kdVar = (kd) jdVar;
        kdVar.getClass();
        List<LaunchAcceptance> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (LaunchAcceptance launchAcceptance : list2) {
            arrayList.add(new bd(launchAcceptance.getA(), kdVar.a.Lg(), launchAcceptance.getH(), launchAcceptance.getB(), launchAcceptance.getC(), launchAcceptance.getD(), launchAcceptance.getE(), launchAcceptance.getF(), launchAcceptance.getG(), launchAcceptance.getI(), launchAcceptance.getJ(), launchAcceptance.getK(), launchAcceptance.getH() ? Acceptance$Default$IconStyle.LEFT : launchAcceptance.getL() == LaunchAcceptance.IconStyle.LEFT ? Acceptance$Default$IconStyle.LEFT : Acceptance$Default$IconStyle.CENTER));
        }
        ((a) ((bk1) kfVar.a.get())).e(arrayList, AcceptanceChangeSource.LAUNCH);
    }
}
