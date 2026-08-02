package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.dto.fave.MarketFavable;
import xsna.b78;
import xsna.dg70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wbi implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wbi(int i, Object obj, Object obj2) {
        this.b = i;
        this.d = obj;
        this.c = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                et7 et7Var = (et7) this.d;
                z37 z37Var = (z37) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1140660446, intValue, -1, "com.vk.ecomm.onlinebooking.impl.preloader.ui.compose.ComposableSingletons$BookingPreloaderScreenKt.lambda$-687683584.<anonymous>.<anonymous> (BookingPreloaderScreen.kt:46)");
                    }
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new p4f(z37Var, 7);
                        aVar.R(x);
                    }
                    rs7.b(et7Var, (izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                sx80 sx80Var = (sx80) this.d;
                z37 z37Var2 = (z37) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1901715882, intValue2, -1, "com.vk.ecomm.orders.impl.order.presentation.compose.ComposableSingletons$OrderScreenKt.lambda$-2093604808.<anonymous>.<anonymous> (OrderScreen.kt:53)");
                    }
                    boolean J2 = aVar2.J(z37Var2);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == a.C0011a.a) {
                        x2 = new oce(z37Var2, 10);
                        aVar2.R(x2);
                    }
                    cx80.b(sx80Var, (izs) x2, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((v1m) this.d).a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                lro.a((us2) this.d, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                bgr.d((SnapshotStateList) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                t8s.j((v1z) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                n750.b((b78.a) this.d, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                fg70.j((dg70.i) this.d, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                izs izsVar = (izs) this.d;
                qg80 qg80Var = (qg80) this.c;
                ((Integer) obj2).getClass();
                izsVar.invoke(new se80(qg80Var, ((yg5) obj).A().getDuration()));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((zxe0) this.d).a((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                h1j0 h1j0Var = (h1j0) this.d;
                jai jaiVar = (jai) this.c;
                ((Integer) obj2).getClass();
                h1j0Var.a(ne7.I(7), (androidx.compose.runtime.a) obj, jaiVar);
                return s3q0.a;
            case 11:
                MarketFavable marketFavable = (MarketFavable) this.d;
                ud0 ud0Var = (ud0) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                gmq gmqVar = (gmq) obj2;
                if (!gmqVar.equals(marketFavable)) {
                    throw new IllegalStateException();
                }
                ud0Var.invoke(bool, (MarketFavable) gmqVar);
                return s3q0.a;
            case 12:
                krt0 krt0Var = (krt0) this.d;
                jai jaiVar2 = (jai) this.c;
                ((Integer) obj2).getClass();
                krt0Var.a(ne7.I(7), (androidx.compose.runtime.a) obj, jaiVar2);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                o7v0.b((g7v0) this.d, (VkOnboarding$TintColor) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ wbi(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = obj2;
    }
}
