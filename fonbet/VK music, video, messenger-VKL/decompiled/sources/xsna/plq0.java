package xsna;

import android.view.View;
import com.vk.catalog.mvi.block.BlockId;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import xsna.k840;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class plq0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ plq0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((rlq0) obj2).d((ExtendedUserProfile) obj);
                break;
            case 1:
                ((u3g0) obj2).r();
                mhy.d((View) obj);
                break;
            case 2:
                l8l l8lVar = (l8l) obj;
                fkn0 fkn0Var = ((hds0) obj2).g;
                if (fkn0Var == null) {
                    fkn0Var = null;
                }
                fkn0Var.e(l8lVar);
                break;
            case 3:
                ((izs) obj2).invoke(new wqs0.c((BlockId.CompositeId) obj));
                break;
            case 4:
                pcu0 pcu0Var = (pcu0) obj;
                ((CountDownLatch) obj2).countDown();
                u2b0 b = k840.a.g().b();
                if (b.m0().i()) {
                    ((com.vk.music.pref.a) pcu0Var.p.getValue()).T("none");
                    b.Y0();
                }
                break;
            default:
                e1l e1lVar = (e1l) obj2;
                com.vk.core.compose.component.datetime.g gVar = (com.vk.core.compose.component.datetime.g) obj;
                Long g = e1lVar.g();
                Long f = e1lVar.f();
                if (g != null && f != null) {
                    long longValue = g.longValue();
                    long longValue2 = f.longValue();
                    gVar.e(false);
                    Date a = com.vk.core.compose.component.datetime.c.a(longValue);
                    Date a2 = com.vk.core.compose.component.datetime.c.a(longValue2);
                    com.vk.core.compose.component.datetime.m mVar = gVar.a;
                    com.vk.core.compose.component.datetime.b a3 = mVar.a();
                    a3.g(com.vk.core.compose.component.datetime.f.a, com.vk.core.compose.component.datetime.c.b().format(a));
                    a3.g(com.vk.core.compose.component.datetime.f.c, com.vk.core.compose.component.datetime.c.b().format(a2));
                    s3q0 s3q0Var = s3q0.a;
                    ((zak0) mVar.a).setValue(mVar.a());
                }
                break;
        }
        return s3q0.a;
    }
}
