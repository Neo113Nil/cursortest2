package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ru.yandex.taxi.payment_options.model.PaymentIconType;

/* loaded from: classes9.dex */
public interface bia0 {
    static Drawable a(bia0 bia0Var, Context context, lea0 lea0Var) {
        Bitmap a;
        qy90 qy90Var = (qy90) bia0Var;
        if (lea0Var == null) {
            qy90Var.getClass();
            return null;
        }
        uma0 uma0Var = (uma0) qy90Var.a;
        uma0Var.getClass();
        jq4 jq4Var = uma0Var.c;
        eq4 eq4Var = uma0Var.a;
        if (lea0Var instanceof fl8) {
            String str = ((fl8) lea0Var).i;
            if (str != null) {
                String a2 = eq4Var.a(str);
                jq4Var.getClass();
                a = jq4.a(context, a2, null, null, true);
            }
            a = null;
        } else if (lea0Var instanceof yy51) {
            String f = ((yy51) lea0Var).f();
            if (f != null) {
                String a3 = eq4Var.a(f);
                jq4Var.getClass();
                a = jq4.a(context, a3, null, null, true);
            }
            a = null;
        } else {
            if (lea0Var instanceof bjm0) {
                String c = eq4Var.c(((bjm0) lea0Var).f());
                jq4Var.getClass();
                a = jq4.a(context, c, null, null, false);
            }
            a = null;
        }
        BitmapDrawable bitmapDrawable = a != null ? new BitmapDrawable(context.getResources(), a) : null;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        PaymentIconType.Companion.getClass();
        return tje.y(qy90.b(b1a0.b(lea0Var)), context);
    }
}
