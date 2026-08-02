package xsna;

import com.vk.toggle.b;
import com.vkontakte.android.NetworkStateReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.random.Random;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pu2 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ pu2(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ExecutorService b;
        switch (this.b) {
            case 0:
                List<fn> a = ((gn) obj).a();
                ArrayList arrayList = new ArrayList(c5g.u(a, 10));
                for (fn fnVar : a) {
                    String b2 = fnVar.b();
                    boolean a2 = fnVar.a();
                    String c = fnVar.c();
                    if (c == null) {
                        c = "";
                    }
                    arrayList.add(new b.d(b2, c, a2));
                }
                Random.b.getClass();
                return new b.c(Random.c.j(), arrayList);
            case 1:
                b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, (String) obj);
                return b;
            default:
                NetworkStateReceiver networkStateReceiver = NetworkStateReceiver.d;
                r6m.a.getClass();
                if (r6m.j() && !NetworkStateReceiver.a().a) {
                    NetworkStateReceiver.a().a = true;
                    if (!NetworkStateReceiver.a().b) {
                        NetworkStateReceiver.d(false);
                    }
                }
                return s3q0.a;
        }
    }
}
