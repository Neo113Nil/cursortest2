package defpackage;

import com.yandex.plus.metrica.utils.e;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.UserInfo;

/* loaded from: classes8.dex */
public final class l721 implements ol {
    public final hl21 a;

    public l721(hl21 hl21Var) {
        this.a = hl21Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        lj ljVar = (lj) obj2;
        wa20 j = ((e) this.a).j();
        if ((ljVar instanceof ij) || (ljVar instanceof hj)) {
            if (j != null) {
                String valueOf = String.valueOf(ljVar.getId());
                IReporterYandex iReporterYandex = j.b;
                iReporterYandex.reportUserInfoEvent(new UserInfo(valueOf));
                iReporterYandex.setUserProfileID(valueOf);
                j.a.a(valueOf);
            }
        } else {
            if (!(ljVar instanceof gj) && !(ljVar instanceof jj)) {
                w511.b();
                return null;
            }
            if (j != null) {
                IReporterYandex iReporterYandex2 = j.b;
                iReporterYandex2.reportUserInfoEvent(new UserInfo(null));
                iReporterYandex2.setUserProfileID(null);
                j.a.a(null);
            }
        }
        return zy11.a;
    }
}
