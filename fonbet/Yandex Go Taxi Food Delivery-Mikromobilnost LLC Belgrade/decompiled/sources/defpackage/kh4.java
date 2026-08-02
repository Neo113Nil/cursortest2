package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import io.appmetrica.analytics.impl.C0553n3;

/* loaded from: classes.dex */
public final class kh4 {
    public hg4 a = gg4.a;

    public final void a(Context context, AttributeSet attributeSet, Drawable drawable) {
        String attributeValue;
        hg4 dg4Var;
        hg4 hg4Var = gg4.a;
        if (attributeSet != null && (attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", C0553n3.g)) != null) {
            String str = cvu0.x(attributeValue, "?", false) ? attributeValue : null;
            if (str != null) {
                dg4Var = new dg4(new bdc(Integer.valueOf(cvu0.v(str, "?", "", true)).intValue()));
            } else {
                String str2 = cvu0.x(attributeValue, ShimmerDivHandler.NUMBER_SING, false) ? attributeValue : null;
                if (str2 != null) {
                    Integer S = q5z.S(str2);
                    if (S != null) {
                        dg4Var = new dg4(new cdc(S.intValue()));
                    }
                } else {
                    String v = cvu0.v(attributeValue, "@", "", false);
                    String str3 = Integer.parseInt(v) != 0 ? v : null;
                    if (str3 != null) {
                        if (vng.t(Integer.parseInt(str3), context) != null) {
                            dg4Var = new fg4(Integer.parseInt(str3));
                        } else {
                            try {
                                dg4Var = new dg4(new cdc(context.getColor(Integer.parseInt(str3))));
                            } catch (Resources.NotFoundException e) {
                                xby.d.k(e, "Could not find color for background by id ".concat(str3));
                            }
                        }
                    }
                }
            }
            if (!(dg4Var instanceof dg4) || (dg4Var instanceof eg4) || (dg4Var instanceof fg4)) {
                hg4Var = dg4Var;
            } else if (!dg4Var.equals(hg4Var)) {
                w511.b();
                return;
            } else if (drawable != null) {
                hg4Var = new eg4(drawable);
            }
            this.a = hg4Var;
        }
        dg4Var = hg4Var;
        if (dg4Var instanceof dg4) {
        }
        hg4Var = dg4Var;
        this.a = hg4Var;
    }

    public final Drawable b(Context context) {
        hg4 hg4Var = this.a;
        if (hg4Var instanceof dg4) {
            return new ColorDrawable(s8o.m(((dg4) hg4Var).a, context));
        }
        if (hg4Var instanceof eg4) {
            return ((eg4) hg4Var).a;
        }
        if (hg4Var instanceof fg4) {
            return vng.t(((fg4) hg4Var).a, context);
        }
        if (jl40.l(hg4Var, gg4.a)) {
            return null;
        }
        w511.b();
        return null;
    }
}
