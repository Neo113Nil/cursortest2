package xsna;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.gik0;
import xsna.gjo0;

/* compiled from: TextLayoutFactory.kt */
/* loaded from: classes2.dex */
public final class hjo0 {
    public static final Regex a = new Regex("\\p{Cf}");

    public static Layout a(String str, float f, int i, int i2, int i3, int i4, Layout.Alignment alignment, Typeface typeface, int i5) {
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        if ((i5 & 4) != 0) {
            i = -16777216;
        }
        if ((i5 & 128) != 0) {
            alignment = null;
        }
        if ((i5 & 512) != 0) {
            typeface = null;
        }
        gjo0 gjo0Var = new gjo0();
        gjo0Var.b(str);
        gjo0.a aVar = gjo0Var.b;
        if (aVar.a.getTypeface() != typeface) {
            aVar.a();
            aVar.a.setTypeface(typeface);
            gjo0Var.c = null;
        }
        gjo0Var.c(f);
        gjo0Var.a = i2;
        if (aVar.h != i3) {
            aVar.h = i3;
            gjo0Var.c = null;
        }
        if (aVar.k != i4) {
            aVar.k = i4;
            gjo0Var.c = null;
        }
        if (aVar.g != truncateAt) {
            aVar.g = truncateAt;
            gjo0Var.c = null;
        }
        if (aVar.i != alignment) {
            aVar.i = alignment;
            gjo0Var.c = null;
        }
        aVar.a();
        aVar.a.setColor(i);
        gjo0Var.c = null;
        if (aVar.e) {
            aVar.e = false;
            gjo0Var.c = null;
        }
        gjo0Var.d = false;
        return gjo0Var.a();
    }

    public static void b(SpannableString spannableString, int i, int i2, float f) {
        ucp ucpVar = ucp.a;
        Spannable newSpannable = spannableString != null ? spannableString : Spannable.Factory.getInstance().newSpannable(spannableString);
        gik0 gik0Var = new gik0(newSpannable);
        ArrayList arrayList = new ArrayList();
        int length = spannableString.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            int c = gik0Var.c(i4);
            if (c == -1) {
                int a2 = gik0Var.a(i4);
                if (a2 == -1) {
                    a2 = length;
                }
                hep hepVar = ucp.d().a;
                gep a3 = hepVar != null ? hepVar.a(i4, a2, newSpannable) : null;
                if (a3 != null) {
                    arrayList.add(new gik0.a(i4, a3.a() + i4));
                    s3q0 s3q0Var = s3q0.a;
                    i4 += a3.a();
                } else {
                    i4++;
                }
            } else {
                i4 = c;
            }
        }
        List<gik0.a> C0 = j5g.C0(j5g.u0(arrayList, rl3.u0(gik0Var.a)));
        ArrayList arrayList2 = new ArrayList(c5g.u(C0, 10));
        for (gik0.a aVar : C0) {
            arrayList2.add(new Pair(Integer.valueOf(aVar.b), Integer.valueOf(aVar.c)));
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            int intValue = ((Number) pair.i()).intValue();
            while (i3 < intValue) {
                int i5 = i3 + 1;
                spannableString.setSpan(new x090(i, i2, f), i3, i5, 33);
                i3 = i5;
            }
            i3 = ((Number) pair.j()).intValue();
        }
        int length2 = spannableString.length();
        while (i3 < length2) {
            int i6 = i3 + 1;
            spannableString.setSpan(new x090(i, i2, f), i3, i6, 33);
            i3 = i6;
        }
    }
}
