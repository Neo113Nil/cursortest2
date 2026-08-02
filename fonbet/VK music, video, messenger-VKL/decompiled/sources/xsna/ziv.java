package xsna;

import com.vk.core.concurrent.ThreadExecutorStuckException;
import com.vk.log.L;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.VKApplication;
import java.util.Collection;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ziv implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ziv(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                com.vk.metrics.eventtracking.b.a.a(new ThreadExecutorStuckException((Collection) obj));
                break;
            case 2:
                L.j((Throwable) obj, "NetworkManager handled exception. Current network state = " + com.vk.core.utils.newtork.b.c());
                break;
            case 3:
                Set b = oqo0.b();
                if (b != null) {
                    SchemeStat$TypeDevNullItem a = oqo0.a(30, b);
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = a;
                    l5mVar.q();
                }
                break;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VKApplication.a aVar = VKApplication.c;
                if (!booleanValue) {
                    mcr0.a();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ziv(oqo0 oqo0Var) {
        this.b = 3;
    }
}
