package xsna;

import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.ppy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kpy implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kpy(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                io.reactivex.rxjava3.internal.schedulers.d dVar = (io.reactivex.rxjava3.internal.schedulers.d) this.c;
                Pair pair = (Pair) obj;
                final bxc0 bxc0Var = (bxc0) pair.d();
                final ppy.c cVar = (ppy.c) pair.g();
                break;
            case 1:
                nx50 nx50Var = (nx50) this.c;
                b68 b68Var = b68.b;
                List O0 = j5g.O0(b68Var.g());
                b68.k(nx50Var.b, true);
                List O02 = j5g.O0(b68Var.g());
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : O0) {
                    if (!O02.contains(Integer.valueOf(((Number) obj2).intValue()))) {
                        arrayList.add(obj2);
                    }
                }
                BottomNavigationView bottomNavigationView = nx50Var.z;
                if (bottomNavigationView != null) {
                    bottomNavigationView.postDelayed(new hc3(8, nx50Var, arrayList), 1000L);
                }
                break;
            case 2:
                y0a0 y0a0Var = (y0a0) this.c;
                owi.a(y0a0Var.d, 10000L, new z56(y0a0Var, 7));
                break;
            default:
                gae0 gae0Var = (gae0) this.c;
                String str = (String) obj;
                if (gae0Var.h.getValue().booleanValue()) {
                    gae0Var.f.e("vk.ru");
                    a0a.d = "vk.ru";
                } else {
                    gae0Var.f.e(str);
                    a0a.d = str;
                }
                break;
        }
        return s3q0.a;
    }
}
