package xsna;

import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.runtime.a;
import java.util.ArrayList;
import xsna.q8z;
import xsna.us2;

/* compiled from: AnnotatedStringExt.kt */
/* loaded from: classes17.dex */
public final class ws2 {
    public static final us2 a(CharSequence charSequence, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2076815446, i, -1, "com.vk.core.compose.ext.rememberAnnotatedString (AnnotatedStringExt.kt:38)");
        }
        boolean J = aVar.J(charSequence);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            x = d(charSequence, null);
            aVar.R(x);
        }
        us2 us2Var = (us2) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return us2Var;
    }

    public static final us2 b(String str, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1505391586, i, -1, "com.vk.core.compose.ext.rememberAsAnnotatedString (AnnotatedStringExt.kt:43)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && aVar.J(str)) || (i & 6) == 4;
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            x = e(str);
            aVar.R(x);
        }
        us2 us2Var = (us2) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return us2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final us2 c(Spanned spanned, final izs izsVar) {
        int i;
        Object[] objArr;
        Spanned spanned2 = spanned;
        us2.b bVar = new us2.b();
        bVar.f(spanned2);
        int i2 = 0;
        Object[] spans = spanned2.getSpans(0, spanned2.length(), CharacterStyle.class);
        int length = spans.length;
        int i3 = 0;
        Spanned spanned3 = spanned2;
        while (i3 < length) {
            final CharacterStyle characterStyle = (CharacterStyle) spans[i3];
            int spanStart = spanned3.getSpanStart(characterStyle);
            int spanEnd = spanned3.getSpanEnd(characterStyle);
            if (characterStyle instanceof StyleSpan) {
                StyleSpan styleSpan = (StyleSpan) characterStyle;
                int style = styleSpan.getStyle();
                int i4 = 1;
                b6s b6sVar = style != 0 ? (style == 1 || style == 3) ? b6s.k : null : b6s.h;
                int style2 = styleSpan.getStyle();
                if (style2 != 2 && style2 != 3) {
                    i4 = i2;
                }
                bVar.d(new hik0(0L, 0L, b6sVar, new u5s(i4), null, null, null, 0L, null, null, null, 0L, null, null, 65523), spanStart, spanEnd);
            } else if (characterStyle instanceof UnderlineSpan) {
                bVar.d(new hik0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, pdo0.c, null, 61439), spanStart, spanEnd);
            } else if (characterStyle instanceof ForegroundColorSpan) {
                bVar.d(new hik0(f870.c(((ForegroundColorSpan) characterStyle).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), spanStart, spanEnd);
            } else if (characterStyle instanceof URLSpan) {
                bVar.e(new seq0(((URLSpan) characterStyle).getURL()), spanStart, spanEnd);
            } else if (characterStyle instanceof l2v0) {
                l2v0 l2v0Var = (l2v0) characterStyle;
                String i5 = l2v0Var.i();
                if (i5 == null) {
                    i5 = "";
                }
                i = i3;
                objArr = spans;
                bVar.b(new q8z.b(i5, new tjo0(new hik0(f870.c(l2v0Var.getColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), new hik0(f870.c(l2v0Var.getColor()), 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, f870.c(l2v0Var.getColor()), 0.3f), null, null, 63486), new hik0(f870.c(l2v0Var.getColor()), 0L, null, null, null, null, null, 0L, null, null, null, l5g.c(14, f870.c(l2v0Var.getColor()), 0.3f), null, null, 63486), 4), new i9z() { // from class: xsna.vs2
                    @Override // xsna.i9z
                    public final void a(q8z q8zVar) {
                        izs izsVar2 = izs.this;
                        if (izsVar2 != null) {
                            izsVar2.invoke(characterStyle);
                        }
                    }
                }), spanStart, spanEnd);
                i3 = i + 1;
                spanned3 = spanned;
                spans = objArr;
                i2 = 0;
            }
            objArr = spans;
            i = i3;
            i3 = i + 1;
            spanned3 = spanned;
            spans = objArr;
            i2 = 0;
        }
        return bVar.n();
    }

    public static final us2 d(CharSequence charSequence, izs<? super l2v0, s3q0> izsVar) {
        if (charSequence instanceof Spanned) {
            return c((Spanned) charSequence, izsVar);
        }
        us2.b bVar = new us2.b();
        bVar.f(charSequence);
        return bVar.n();
    }

    public static final us2 e(String str) {
        StringBuilder sb = new StringBuilder(true & true ? 16 : 0);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(str);
        String sb2 = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((us2.b.a) arrayList.get(i)).a(sb.length()));
        }
        return new us2(sb2, arrayList2);
    }
}
