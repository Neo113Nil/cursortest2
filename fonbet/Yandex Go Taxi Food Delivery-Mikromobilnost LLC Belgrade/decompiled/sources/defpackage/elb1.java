package defpackage;

import android.content.Context;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.masstransit.sdk.checkout.api.analytics.CheckoutButtonAction;
import com.yx360.design.BrandTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class elb1 {
    public static final void a(boolean z, BrandTheme brandTheme, wls wlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(184209977);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(brandTheme) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm.a.a(z, brandTheme, wlsVar, btsVar, (i2 & 14) | 384 | (i2 & 112) | ((i2 << 3) & 7168), 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(z, brandTheme, wlsVar, i, 16);
        }
    }

    public static ArrayList b(String str) {
        List list = p220.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(str + ((String) it.next()));
        }
        return arrayList;
    }

    public static nib c() {
        return new nib(new nnb(CheckoutButtonAction.Back, null, null, null));
    }

    public static final boolean d(fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1566783964);
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        int i = kng0.messagingIsLightTheme;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        boolean z = !(typedValue.data != 0);
        btsVar.t(false);
        return z;
    }
}
