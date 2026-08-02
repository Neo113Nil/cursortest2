package xsna;

import com.vk.companion.core.CompanionAppImpl;
import com.vkontakte.android.ui.bottomnavigation.BottomNavigationView;
import xsna.oap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class n58 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n58(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                y58 y58Var = ((BottomNavigationView) this.c).d;
                y58Var.d = false;
                y58Var.c(true);
                hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
                return s3q0.a;
            case 1:
                return Boolean.valueOf(!((CompanionAppImpl) obj).equals(((nig) this.c).e()));
            default:
                pb60 pb60Var = (pb60) this.c;
                awd0 awd0Var = (awd0) obj;
                buz c = awd0Var.a() == 0 ? pb60Var.c(new oap.a(awd0Var)) : null;
                if (c != null) {
                    pb60Var.b.b(c, false);
                }
                return s3q0.a;
        }
    }
}
