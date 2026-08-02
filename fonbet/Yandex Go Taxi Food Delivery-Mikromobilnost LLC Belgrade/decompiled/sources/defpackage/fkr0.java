package defpackage;

import android.content.Context;
import com.yandex.go.safety.center.SafetyCenterApi;
import com.yandex.go.safety.center.analytics.a;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.share.notification.ShareNotificationView;
import ru.yandex.taxi.am.k;

/* loaded from: classes13.dex */
public final class fkr0 {
    public final sae a;

    public fkr0(sae saeVar) {
        this.a = saeVar;
    }

    public final void a(ShareRequestParam shareRequestParam) {
        sae saeVar = this.a;
        saeVar.getClass();
        shareRequestParam.getClass();
        d7g d7gVar = (d7g) saeVar.b;
        i6r i6rVar = d7gVar.a;
        Context n0 = ((c0g) i6rVar).n0();
        q5z.h(n0);
        j jVar = (j) d7gVar.k.get();
        fkr0 fkr0Var = new fkr0(new sae(18, d7gVar.b));
        c0g c0gVar = (c0g) i6rVar;
        ney d = c0gVar.d();
        q5z.h(d);
        pho T1 = c0gVar.T1();
        q5z.h(T1);
        ppl0 ppl0Var = new ppl0(T1);
        zzf zzfVar = c0gVar.z;
        SafetyCenterApi safetyCenterApi = (SafetyCenterApi) zzfVar.Jq.get();
        q5z.h(safetyCenterApi);
        k kVar = (k) zzfVar.L0.get();
        q5z.h(kVar);
        h3y a = i5m.a(d7gVar.g);
        tt2 k = c0gVar.k();
        q5z.h(k);
        a aVar = new a(ppl0Var, safetyCenterApi, kVar, a, k);
        tt2 k2 = c0gVar.k();
        q5z.h(k2);
        hkr0 hkr0Var = new hkr0(jVar, shareRequestParam, fkr0Var, d, aVar, k2);
        SafetyCenterExperiment safetyCenterExperiment = (SafetyCenterExperiment) d7gVar.d.get();
        tj60 tj60Var = (tj60) c0gVar.t7.get();
        q5z.h(tj60Var);
        new ShareNotificationView(n0, hkr0Var, safetyCenterExperiment, shareRequestParam, tj60Var).show();
    }
}
