package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.Calendar;
import java.util.Date;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes11.dex */
public abstract class lg91 {
    public static final byte[] a = {-94, -31, PKIBody._KRP, 30, -93, -115, 20, -82};
    public static final byte[] b = {DerValue.TAG_PRIVATE, DerValue.TAG_CONTEXT, 101, 117, -4, -3, Alerts.alert_unrecognized_name, -56};

    public static final void a(sja0 sja0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-457163963);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(sja0Var) : btsVar.e(sja0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 d = ooc.d(ljs0.v(c530.a, null, 3), null, 3);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            cx20.a(null, null, null, null, null, false, false, wwg.S(-1959273111, true, new wg0(22, tlsVar), btsVar), wwg.S(-307460303, true, new y740(8, sja0Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(sja0Var, tlsVar, i, 3);
        }
    }

    public static final boolean b(Region region, View view, Rect rect) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                if (!c(view)) {
                    if (view.getGlobalVisibleRect(rect)) {
                        return region.op(rect, Region.Op.UNION);
                    }
                    return false;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                boolean z = false;
                for (int i = 0; i < childCount; i++) {
                    z = b(region, viewGroup.getChildAt(i), rect) || z;
                }
                return z;
            }
            if ((!view.getClass().equals(View.class) || !c(view)) && view.getGlobalVisibleRect(rect)) {
                return region.op(rect, Region.Op.UNION);
            }
        }
        return false;
    }

    public static final boolean c(View view) {
        if (view.getAlpha() == 0.0f || view.getBackground() == null) {
            return true;
        }
        Drawable background = view.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        return colorDrawable != null && colorDrawable.getAlpha() == 0;
    }

    public static final Calendar d(String str) {
        Date d = mpb1.d(str);
        if (d == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }
}
