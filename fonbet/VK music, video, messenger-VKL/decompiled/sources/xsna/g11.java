package xsna;

import android.content.Context;
import com.vkontakte.android.attachments.DisclaimerData;
import java.util.Collection;
import java.util.List;
import xsna.s4e0;

/* compiled from: AdsNativeCarouselAdapter.kt */
/* loaded from: classes4.dex */
public final class g11 extends s4e0.a {
    public final Context f;
    public DisclaimerData g;
    public boolean h;

    public g11(Context context) {
        this.f = context;
    }

    public static boolean z0(List list) {
        if (!list.isEmpty()) {
            dw50 dw50Var = (dw50) j5g.Y(list);
            String str = dw50Var.f;
            boolean z = str == null || str.length() == 0;
            String str2 = dw50Var.a;
            boolean z2 = str2 == null || str2.length() == 0;
            String str3 = dw50Var.b;
            boolean z3 = str3 == null || str3.length() == 0;
            List<dw50> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (dw50 dw50Var2 : list2) {
                    String str4 = dw50Var2.f;
                    if ((str4 == null || str4.length() == 0) == z) {
                        String str5 = dw50Var2.a;
                        if ((str5 == null || str5.length() == 0) == z2) {
                            String str6 = dw50Var2.b;
                            if ((str6 == null || str6.length() == 0) == z3) {
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final void A0(List<? extends dw50> list, DisclaimerData disclaimerData) {
        this.g = disclaimerData;
        this.h = z0(list);
        super.y0(list);
    }

    @Override // xsna.s4e0.a
    public final h11 x0() {
        return new h11(this.f, new a1y(this, 1));
    }

    @Override // xsna.s4e0.a
    public final void y0(List<? extends dw50> list) {
        this.g = null;
        this.h = z0(list);
        super.y0(list);
    }
}
