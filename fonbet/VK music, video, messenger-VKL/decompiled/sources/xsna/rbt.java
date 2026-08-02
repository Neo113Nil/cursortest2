package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.model.GamesCatalogNotificationBadgeType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import xsna.ect;
import xsna.sct;

/* compiled from: GamesCatalogEventBusImpl.kt */
/* loaded from: classes17.dex */
public final class rbt implements lbt {
    public final kdt a;
    public final hpj b;
    public final caj0 c;
    public final LinkedHashSet d;

    public rbt(kdt kdtVar) {
        ovj a = hqu0.a();
        this.a = kdtVar;
        hpj a2 = zvj.a(d.a.a(whn0.a(), a));
        this.b = a2;
        this.c = lyd.b(0, 1, null, 5);
        this.d = new LinkedHashSet();
        myc0.h(a2, null, null, new mbt(this, null), 3);
    }

    @Override // xsna.lbt
    public final void a(ect ectVar) {
        Object obj;
        boolean z = ectVar instanceof ect.d;
        hpj hpjVar = this.b;
        if (!z) {
            if (ectVar instanceof ect.c) {
                this.c.e(new sct.d());
                return;
            } else if (ectVar instanceof ect.a) {
                myc0.h(hpjVar, null, null, new obt(this, ((ect.a) ectVar).a, null), 3);
                return;
            } else if (ectVar.equals(ect.e.a)) {
                myc0.h(hpjVar, null, null, new qbt(this, null), 3);
                return;
            } else {
                if (!(ectVar instanceof ect.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                myc0.h(hpjVar, null, null, new nbt(this, ((ect.b) ectVar).a, null), 3);
                return;
            }
        }
        WebApiApplication webApiApplication = ((ect.d) ectVar).a;
        if (!webApiApplication.t || webApiApplication.r) {
            Iterator<E> it = GamesCatalogNotificationBadgeType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (brm0.w(((GamesCatalogNotificationBadgeType) obj).i(), webApiApplication.o, true)) {
                        break;
                    }
                }
            }
            GamesCatalogNotificationBadgeType gamesCatalogNotificationBadgeType = (GamesCatalogNotificationBadgeType) obj;
            if (gamesCatalogNotificationBadgeType != null) {
                myc0.h(hpjVar, null, null, new pbt(this, webApiApplication, gamesCatalogNotificationBadgeType, null), 3);
            }
        }
    }

    @Override // xsna.lbt
    public final void b(izs<? super sct, s3q0> izsVar) {
        this.d.add(izsVar);
    }
}
