package defpackage;

import android.app.Activity;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class a3r0 {
    public final Activity a;
    public final noy0 b;
    public final x4k0 c;
    public final dmt0 d;
    public final lqo e;
    public final roy0 f = new roy0();
    public EditText g;
    public zls h;

    public a3r0(Activity activity, noy0 noy0Var, x4k0 x4k0Var, dmt0 dmt0Var, lqo lqoVar) {
        this.a = activity;
        this.b = noy0Var;
        this.c = x4k0Var;
        this.d = dmt0Var;
        this.e = lqoVar;
    }

    public static int a(int i, int i2, Editable editable) {
        int length = editable.length();
        if (i2 > length) {
            i2 = length;
        }
        if (i < 0) {
            i = 0;
        }
        while (i2 > i && rza.b(editable.charAt(i2 - 1))) {
            i2--;
        }
        return i2;
    }

    public static int b(int i, int i2, Editable editable) {
        if (i < 0) {
            i = 0;
        }
        int length = editable.length();
        if (i2 > length) {
            i2 = length;
        }
        while (i < i2 && rza.b(editable.charAt(i))) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d0  */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [android.text.SpannableStringBuilder, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpannableStringBuilder c(CharSequence charSequence, Editable editable, CharSequence charSequence2, p9s p9sVar, boolean z) {
        ?? r22;
        SpannableStringBuilder append;
        SpannableStringBuilder b;
        Object[] spans;
        int i;
        Iterator it;
        Iterator it2;
        int i2 = 0;
        if (!a.G(this.f.a, p9sVar)) {
            List M = evu0.M(editable);
            if (!(M instanceof Collection) || !M.isEmpty()) {
                Iterator it3 = M.iterator();
                while (it3.hasNext()) {
                    if (evu0.J((String) it3.next())) {
                        SpannableStringBuilder spannableStringBuilder = editable instanceof SpannableStringBuilder ? (SpannableStringBuilder) editable : new SpannableStringBuilder(editable);
                        ArrayList arrayList = new ArrayList();
                        int i3 = 0;
                        while (true) {
                            i = -1;
                            if (i3 > spannableStringBuilder.length()) {
                                break;
                            }
                            int G = evu0.G(spannableStringBuilder, '\n', i3, 4);
                            if (G == -1) {
                                G = spannableStringBuilder.length();
                            }
                            arrayList.add(spannableStringBuilder.subSequence(i3, G));
                            i3 = G + 1;
                        }
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            CharSequence charSequence3 = (CharSequence) it4.next();
                            if (evu0.J(charSequence3)) {
                                it = it4;
                            } else {
                                int length = charSequence3.length();
                                int i4 = i2;
                                while (true) {
                                    if (i4 >= length) {
                                        i4 = i;
                                        break;
                                    }
                                    if (!rza.b(charSequence3.charAt(i4))) {
                                        break;
                                    }
                                    i4++;
                                }
                                if (i4 == i) {
                                    i4 = charSequence3.length();
                                }
                                CharSequence subSequence = charSequence3.subSequence(i2, i4);
                                CharSequence subSequence2 = charSequence3.subSequence(i4, charSequence3.length());
                                int length2 = evu0.m0(subSequence2).length();
                                CharSequence subSequence3 = subSequence2.subSequence(i2, length2);
                                CharSequence subSequence4 = subSequence2.subSequence(length2, subSequence2.length());
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append(subSequence);
                                spannableStringBuilder2.append(charSequence);
                                spannableStringBuilder2.append(subSequence3);
                                spannableStringBuilder2.append(charSequence2);
                                spannableStringBuilder2.append(subSequence4);
                                if (charSequence3 instanceof Spanned) {
                                    Spanned spanned = (Spanned) charSequence3;
                                    Object[] spans2 = spanned.getSpans(i2, charSequence3.length(), Object.class);
                                    int i5 = i2;
                                    while (i5 < spans2.length) {
                                        int i6 = i5 + 1;
                                        try {
                                            Object obj = spans2[i5];
                                            int spanStart = spanned.getSpanStart(obj);
                                            int spanEnd = spanned.getSpanEnd(obj);
                                            int spanFlags = spanned.getSpanFlags(obj);
                                            if (spanStart < i4) {
                                                it2 = it4;
                                            } else {
                                                if (spanStart >= i4) {
                                                    it2 = it4;
                                                    if (spanStart < subSequence3.length() + i4) {
                                                        spanStart += charSequence.length();
                                                    }
                                                } else {
                                                    it2 = it4;
                                                }
                                                spanStart = charSequence2.length() + charSequence.length() + spanStart;
                                            }
                                            if (spanEnd > i4) {
                                                spanEnd = (spanEnd <= i4 || spanEnd > subSequence3.length() + i4) ? charSequence2.length() + charSequence.length() + spanEnd : spanEnd + charSequence.length();
                                            }
                                            spannableStringBuilder2.setSpan(obj, spanStart, spanEnd, spanFlags);
                                            i5 = i6;
                                            it4 = it2;
                                        } catch (ArrayIndexOutOfBoundsException e) {
                                            w511.i(e.getMessage());
                                            return null;
                                        }
                                    }
                                }
                                it = it4;
                                charSequence3 = spannableStringBuilder2;
                            }
                            arrayList2.add(charSequence3);
                            it4 = it;
                            i2 = 0;
                            i = -1;
                        }
                        r22 = 0;
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        Iterator it5 = arrayList2.iterator();
                        int i7 = 0;
                        while (it5.hasNext()) {
                            int i8 = i7 + 1;
                            CharSequence charSequence4 = (CharSequence) it5.next();
                            if (i7 > 0) {
                                spannableStringBuilder3.append((CharSequence) "\n");
                            }
                            spannableStringBuilder3.append(charSequence4);
                            i7 = i8;
                        }
                        append = new SpannableStringBuilder(spannableStringBuilder3);
                        b = ((v3k0) this.b).b(2, this.c.a(append));
                        if (!z && !this.e.a(tz10.D)) {
                            b = r22;
                        }
                        if (b != null) {
                            append = b;
                        }
                        spans = append.getSpans(0, append.length(), yhc.class);
                        if (spans.length > 0) {
                            return append;
                        }
                        if (spans[0] != null) {
                            ny61.u();
                            return r22;
                        }
                        fxa1.c(jng0.messagingOutgoingLinkColor, this.a);
                        throw r22;
                    }
                }
            }
        }
        r22 = 0;
        append = new SpannableStringBuilder().append(charSequence).append((CharSequence) editable).append(charSequence2);
        b = ((v3k0) this.b).b(2, this.c.a(append));
        if (!z) {
            b = r22;
        }
        if (b != null) {
        }
        spans = append.getSpans(0, append.length(), yhc.class);
        if (spans.length > 0) {
        }
    }
}
