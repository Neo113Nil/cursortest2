package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class bt11 {
    public static final Bitmap a(Context context, gdc gdcVar) {
        Paint f = unr0.f(true);
        int v = tje.v(context, 3.0f);
        Bitmap createBitmap = Bitmap.createBitmap(v, v, Bitmap.Config.ARGB_8888);
        float f2 = v / 2.0f;
        Canvas canvas = new Canvas(createBitmap);
        f.setColor(s8o.m(gdcVar, context));
        canvas.drawCircle(f2, f2, tje.x(context, 1.5f), f);
        return createBitmap;
    }

    public static final Bitmap b(kdc kdcVar, Context context) {
        Paint f = unr0.f(true);
        int u = tje.u(12, context);
        Bitmap createBitmap = Bitmap.createBitmap(u, u, Bitmap.Config.ARGB_8888);
        float f2 = u / 2.0f;
        Canvas canvas = new Canvas(createBitmap);
        f.setColor(qje.u(context.getTheme(), xng0.bgMain));
        canvas.drawCircle(f2, f2, tje.w(5, context), f);
        f.setColor(s8o.m(kdcVar, context));
        canvas.drawCircle(f2, f2, tje.w(4, context), f);
        return createBitmap;
    }

    public static final CharSequence c(int i, Context context) {
        if (i <= 0) {
            return null;
        }
        return fh4.j(context, context.getString(kyh0.mt_other_variants, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), new bdc(xng0.controlMinor), new bdc(xng0.textMinor), tje.w(48, context));
    }

    public static final SpannableStringBuilder d(Context context, String str) {
        if (str == null || evu0.J(str)) {
            return null;
        }
        gdc gdcVar = new gdc(mqg0.component_gray_550);
        gdc gdcVar2 = new gdc(mqg0.component_yellow_toxic);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(fh4.h(context, str, gdcVar, gdcVar2));
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) context.getString(kyh0.mt_exit));
        return spannableStringBuilder;
    }
}
