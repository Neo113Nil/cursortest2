package xsna;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: SpannableExtensions.android.kt */
/* loaded from: classes11.dex */
public final class oik0 {
    public static final float a(long j, float f, azl azlVar) {
        if (fno0.b(j, fno0.c)) {
            return f;
        }
        long c = fno0.c(j);
        if (gno0.a(c, 4294967296L)) {
            return azlVar.u0(j);
        }
        if (gno0.a(c, 8589934592L)) {
            return fno0.d(j) * f;
        }
        return Float.NaN;
    }

    public static final float b(long j, float f, azl azlVar) {
        float d;
        long c = fno0.c(j);
        if (gno0.a(c, 4294967296L)) {
            if (azlVar.getFontScale() <= 1.05d) {
                return azlVar.u0(j);
            }
            d = fno0.d(j) / fno0.d(azlVar.J(f));
        } else {
            if (!gno0.a(c, 8589934592L)) {
                return Float.NaN;
            }
            d = fno0.d(j);
        }
        return d * f;
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(f870.H(j)), i, i2, 33);
        }
    }

    public static final void d(Spannable spannable, long j, azl azlVar, int i, int i2) {
        long c = fno0.c(j);
        if (gno0.a(c, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(an10.b(azlVar.u0(j)), false), i, i2, 33);
        } else if (gno0.a(c, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(fno0.d(j)), i, i2, 33);
        }
    }

    public static final void e(Spannable spannable, lwz lwzVar, int i, int i2) {
        if (lwzVar != null) {
            ArrayList arrayList = new ArrayList(c5g.u(lwzVar, 10));
            Iterator<kwz> it = lwzVar.b.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void f(Spannable spannable, Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }
}
