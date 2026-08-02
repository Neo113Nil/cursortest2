package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeMultiaccountsItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.api.dto.group.WebGroup;
import java.util.List;
import java.util.Map;
import xsna.pgn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class lxo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lxo(com.vk.superapp.multiaccount.api.f fVar, mxo mxoVar, UserId userId, com.vk.superapp.multiaccount.api.f fVar2) {
        this.b = 0;
        this.c = fVar;
        this.e = mxoVar;
        this.f = userId;
        this.d = fVar2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId userId;
        com.vk.superapp.multiaccount.api.g a;
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                com.vk.superapp.multiaccount.api.f fVar = (com.vk.superapp.multiaccount.api.f) obj5;
                mxo mxoVar = (mxo) obj3;
                UserId userId2 = (UserId) obj2;
                com.vk.superapp.multiaccount.api.f fVar2 = (com.vk.superapp.multiaccount.api.f) obj4;
                if (fVar == null || (a = fVar.a()) == null || (userId = a.b) == null) {
                    wdx0 wdx0Var = e370.f;
                    if (wdx0Var == null) {
                        wdx0Var = null;
                    }
                    int i2 = pgn0.a.a;
                    userId = wdx0Var.c().b;
                }
                UserId userId3 = userId;
                v140.b(mxoVar.j, SchemeStatSak$TypeMultiaccountsItem.EventType.SWITCH_FROM_SWITCHER, userId3);
                v140.c(mxoVar.j, SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_FROM_ACCOUNT, userId3, c8u0.b(fVar), null, 8);
                v140.c(mxoVar.j, SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_TO_ACCOUNT, userId2, null, c8u0.b(fVar2), 4);
                break;
            case 1:
                ((lnm) obj5).b((Map) obj4);
                ((d040) obj3).a((List) obj2);
                break;
            default:
                gah0 gah0Var = (gah0) obj5;
                WebApiApplication webApiApplication = (WebApiApplication) obj4;
                List<String> list = (List) obj3;
                l1w0 l1w0Var = (l1w0) obj2;
                WebGroup webGroup = (WebGroup) obj;
                fah0 fah0Var = gah0Var.c;
                if (fah0Var == null) {
                    gah0Var.c = new fah0(gah0Var.a, webApiApplication, new fmu(webGroup.c));
                } else {
                    ((fmu) fah0Var.c).c = webGroup.c;
                }
                fah0 fah0Var2 = gah0Var.c;
                if (fah0Var2 != null) {
                    gah0Var.a(fah0Var2, list, l1w0Var);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lxo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
