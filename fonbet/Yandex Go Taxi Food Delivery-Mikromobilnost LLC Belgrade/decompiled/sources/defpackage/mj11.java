package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class mj11 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final qj11 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final mj11 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public mj11(String str, String str2, long j, long j2, qj11 qj11Var, String[] strArr, String str3, String str4, mj11 mj11Var) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = qj11Var;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = mj11Var;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static mj11 a(String str) {
        return new mj11(null, str.replaceAll(Constants.LINE_SEPARATOR, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            ndf ndfVar = new ndf();
            ndfVar.a = new SpannableStringBuilder();
            treeMap.put(str, ndfVar);
        }
        CharSequence charSequence = ((ndf) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final mj11 b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (mj11) arrayList.get(i);
        }
        ny61.s();
        return null;
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((mj11) this.m.get(i)).d(treeSet, z || equals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        mj11 mj11Var;
        int i2;
        qj11 c;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        Map map2 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap hashMap2 = this.k;
                int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    ndf ndfVar = (ndf) treeMap.get(str4);
                    ndfVar.getClass();
                    pj11 pj11Var = (pj11) hashMap.get(str3);
                    pj11Var.getClass();
                    int i7 = pj11Var.j;
                    qj11 c2 = uub1.c(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ndfVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        ndfVar.a = spannableStringBuilder;
                    }
                    if (c2 != null) {
                        int i8 = c2.h;
                        int i9 = 1;
                        if (((i8 == -1 && c2.i == -1) ? -1 : (i8 == 1 ? (char) 1 : (char) 0) | (c2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i10 = c2.h;
                            if (i10 == -1) {
                                if (c2.i == -1) {
                                    i6 = -1;
                                    i9 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i6);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i9 = 1;
                                }
                            }
                            i6 = (i10 == i9 ? i9 : 0) | (c2.i == i9 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i6);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (c2.f == i9) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (c2.g == i9) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (c2.c) {
                            if (!c2.c) {
                                ny61.r("Font color has not been defined.");
                                return;
                            }
                            peb1.c(spannableStringBuilder, new ForegroundColorSpan(c2.b), intValue, intValue2);
                        }
                        if (c2.e) {
                            if (!c2.e) {
                                ny61.r("Background color has not been defined.");
                                return;
                            }
                            peb1.c(spannableStringBuilder, new BackgroundColorSpan(c2.d), intValue, intValue2);
                        }
                        if (c2.a != null) {
                            peb1.c(spannableStringBuilder, new TypefaceSpan(c2.a), intValue, intValue2);
                        }
                        emy0 emy0Var = c2.r;
                        if (emy0Var != null) {
                            int i11 = emy0Var.a;
                            if (i11 == -1) {
                                i11 = (i7 == 2 || i7 == 1) ? 3 : 1;
                                i5 = 1;
                            } else {
                                i5 = emy0Var.b;
                            }
                            int i12 = emy0Var.c;
                            if (i12 == -2) {
                                i12 = 1;
                            }
                            peb1.c(spannableStringBuilder, new fmy0(i11, i5, i12), intValue, intValue2);
                        }
                        int i13 = c2.m;
                        if (i13 == 2) {
                            mj11 mj11Var2 = this.j;
                            while (true) {
                                if (mj11Var2 == null) {
                                    mj11Var2 = null;
                                    break;
                                }
                                qj11 c3 = uub1.c(mj11Var2.f, mj11Var2.g, map2);
                                if (c3 != null && c3.m == 1) {
                                    break;
                                } else {
                                    mj11Var2 = mj11Var2.j;
                                }
                            }
                            if (mj11Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(mj11Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        mj11Var = null;
                                        break;
                                    }
                                    mj11 mj11Var3 = (mj11) arrayDeque.pop();
                                    qj11 c4 = uub1.c(mj11Var3.f, mj11Var3.g, map2);
                                    if (c4 != null && c4.m == 3) {
                                        mj11Var = mj11Var3;
                                        break;
                                    }
                                    for (int c5 = mj11Var3.c() - 1; c5 >= 0; c5--) {
                                        arrayDeque.push(mj11Var3.b(c5));
                                    }
                                }
                                if (mj11Var != null) {
                                    if (mj11Var.c() == 1) {
                                        i2 = 0;
                                        if (mj11Var.b(0).b != null) {
                                            String str5 = mj11Var.b(0).b;
                                            int i14 = tw21.a;
                                            qj11 c6 = uub1.c(mj11Var.f, mj11Var.g, map2);
                                            int i15 = c6 != null ? c6.n : -1;
                                            if (i15 == -1 && (c = uub1.c(mj11Var2.f, mj11Var2.g, map2)) != null) {
                                                i15 = c.n;
                                            }
                                            spannableStringBuilder.setSpan(new sjl0(str5, i15), intValue, intValue2, 33);
                                            if (c2.q == 1) {
                                                peb1.c(spannableStringBuilder, new rru(), intValue, intValue2);
                                            }
                                            i3 = c2.j;
                                            float f2 = 100.0f;
                                            if (i3 == 1) {
                                                it = it2;
                                                f = 100.0f;
                                                peb1.c(spannableStringBuilder, new AbsoluteSizeSpan((int) c2.k, true), intValue, intValue2);
                                            } else if (i3 == 2) {
                                                it = it2;
                                                f = 100.0f;
                                                peb1.c(spannableStringBuilder, new RelativeSizeSpan(c2.k), intValue, intValue2);
                                            } else if (i3 != 3) {
                                                it = it2;
                                                f = 100.0f;
                                            } else {
                                                float f3 = c2.k / 100.0f;
                                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                int length = relativeSizeSpanArr.length;
                                                int i16 = i2;
                                                float f4 = f3;
                                                int i17 = i16;
                                                while (i17 < length) {
                                                    float f5 = f2;
                                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i17];
                                                    Iterator it3 = it2;
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                        f4 = relativeSizeSpan.getSizeChange() * f4;
                                                    }
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                        i4 = i17;
                                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                        }
                                                    } else {
                                                        i4 = i17;
                                                    }
                                                    i17 = i4 + 1;
                                                    f2 = f5;
                                                    it2 = it3;
                                                }
                                                it = it2;
                                                f = f2;
                                                spannableStringBuilder.setSpan(new RelativeSizeSpan(f4), intValue, intValue2, 33);
                                            }
                                            if ("p".equals(this.a)) {
                                                float f6 = c2.s;
                                                if (f6 != Float.MAX_VALUE) {
                                                    ndfVar.q = (f6 * (-90.0f)) / f;
                                                }
                                                Layout.Alignment alignment = c2.o;
                                                if (alignment != null) {
                                                    ndfVar.c = alignment;
                                                }
                                                Layout.Alignment alignment2 = c2.p;
                                                if (alignment2 != null) {
                                                    ndfVar.d = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    lk91.h("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    if (c2.q == 1) {
                                    }
                                    i3 = c2.j;
                                    float f22 = 100.0f;
                                    if (i3 == 1) {
                                    }
                                    if ("p".equals(this.a)) {
                                    }
                                    it2 = it;
                                }
                            }
                        } else if (i13 == 3 || i13 == 4) {
                            spannableStringBuilder.setSpan(new esh(), intValue, intValue2, 33);
                        }
                        i2 = 0;
                        if (c2.q == 1) {
                        }
                        i3 = c2.j;
                        float f222 = 100.0f;
                        if (i3 == 1) {
                        }
                        if ("p".equals(this.a)) {
                        }
                        it2 = it;
                    }
                }
                it = it2;
                it2 = it;
            }
            int i18 = 0;
            while (i18 < c()) {
                b(i18).h(j, map2, hashMap, str3, treeMap);
                i18++;
                map2 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str2 = this.a;
        if (kju0.j.equals(str2)) {
            return;
        }
        String str3 = this.h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.c && z) {
            SpannableStringBuilder e = e(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((ndf) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < c(); i++) {
                b(i).i(j, z || equals, str4, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e2 = e(str4, treeMap);
                int length = e2.length() - 1;
                while (length >= 0 && e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && e2.charAt(length) != '\n') {
                    e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((ndf) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
