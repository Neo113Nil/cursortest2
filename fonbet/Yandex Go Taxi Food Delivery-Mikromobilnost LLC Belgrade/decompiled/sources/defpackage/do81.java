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
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes7.dex */
public final class do81 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final ex81 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final do81 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public do81(String str, String str2, long j, long j2, ex81 ex81Var, String[] strArr, String str3, String str4, do81 do81Var) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = ex81Var;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = do81Var;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            r571 r571Var = new r571();
            r571Var.a = new SpannableStringBuilder();
            treeMap.put(str, r571Var);
        }
        CharSequence charSequence = ((r571) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public static do81 c(String str) {
        return new do81(null, str.replaceAll(Constants.LINE_SEPARATOR, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public final do81 b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (do81) arrayList.get(i);
        }
        ny61.s();
        return null;
    }

    public final void d(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (h(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.m;
            if (i >= (arrayList2 == null ? 0 : arrayList2.size())) {
                return;
            }
            b(i).d(j, str, arrayList);
            i++;
        }
    }

    public final void e(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        int i;
        int i2;
        do81 do81Var;
        Map map2 = map;
        if (!h(j)) {
            return;
        }
        String str2 = this.h;
        String str3 = "".equals(str2) ? str : str2;
        for (Map.Entry entry : this.l.entrySet()) {
            String str4 = (String) entry.getKey();
            HashMap hashMap2 = this.k;
            int intValue = hashMap2.containsKey(str4) ? ((Integer) hashMap2.get(str4)).intValue() : 0;
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if (intValue != intValue2) {
                r571 r571Var = (r571) treeMap.get(str4);
                r571Var.getClass();
                ((qr81) hashMap.get(str3)).getClass();
                ex81 g = ula1.g(this.f, this.g, map2);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) r571Var.a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    r571Var.a = spannableStringBuilder;
                }
                if (g != null) {
                    int i3 = g.h;
                    int i4 = 1;
                    if (((i3 == -1 && g.i == -1) ? -1 : (i3 == 1 ? (char) 1 : (char) 0) | (g.i == 1 ? (char) 2 : (char) 0)) != -1) {
                        int i5 = g.h;
                        StyleSpan styleSpan = new StyleSpan((i5 == -1 && g.i == -1) ? -1 : (i5 == 1 ? 1 : 0) | (g.i == 1 ? 2 : 0));
                        i = 33;
                        spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                    } else {
                        i = 33;
                    }
                    if (g.f == 1) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                    }
                    if (g.g == 1) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                    }
                    if (g.c) {
                        if (!g.c) {
                            ny61.r("Font color has not been defined.");
                            return;
                        }
                        vaa1.b(spannableStringBuilder, new ForegroundColorSpan(g.b), intValue, intValue2);
                    }
                    if (g.e) {
                        if (!g.e) {
                            ny61.r("Background color has not been defined.");
                            return;
                        }
                        vaa1.b(spannableStringBuilder, new BackgroundColorSpan(g.d), intValue, intValue2);
                    }
                    if (g.a != null) {
                        vaa1.b(spannableStringBuilder, new TypefaceSpan(g.a), intValue, intValue2);
                    }
                    if (g.r != null) {
                        vaa1.b(spannableStringBuilder, new tg61(), intValue, intValue2);
                    }
                    int i6 = g.m;
                    if (i6 == 2) {
                        do81 do81Var2 = this.j;
                        while (true) {
                            if (do81Var2 == null) {
                                do81Var2 = null;
                                break;
                            }
                            ex81 g2 = ula1.g(do81Var2.f, do81Var2.g, map2);
                            if (g2 != null && g2.m == 1) {
                                break;
                            } else {
                                do81Var2 = do81Var2.j;
                            }
                        }
                        if (do81Var2 != null) {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            arrayDeque.push(do81Var2);
                            while (true) {
                                if (arrayDeque.isEmpty()) {
                                    i2 = i4;
                                    do81Var = null;
                                    break;
                                }
                                do81 do81Var3 = (do81) arrayDeque.pop();
                                i2 = i4;
                                ex81 g3 = ula1.g(do81Var3.f, do81Var3.g, map2);
                                if (g3 != null && g3.m == 3) {
                                    do81Var = do81Var3;
                                    break;
                                }
                                ArrayList arrayList = do81Var3.m;
                                for (int size = (arrayList == null ? 0 : arrayList.size()) - 1; size >= 0; size--) {
                                    arrayDeque.push(do81Var3.b(size));
                                }
                                i4 = i2;
                            }
                            if (do81Var != null) {
                                ArrayList arrayList2 = do81Var.m;
                                if ((arrayList2 == null ? 0 : arrayList2.size()) != i2 || do81Var.b(0).b == null) {
                                    nba1.d("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                } else {
                                    String str5 = do81Var.b(0).b;
                                    int i7 = rf71.a;
                                    ex81 g4 = ula1.g(do81Var.f, do81Var.g, map2);
                                    if ((g4 != null ? g4.n : -1) == -1) {
                                        ula1.g(do81Var2.f, do81Var2.g, map2);
                                    }
                                    spannableStringBuilder.setSpan(new cb71(), intValue, intValue2, 33);
                                }
                            }
                        }
                    } else if (i6 == 3 || i6 == 4) {
                        spannableStringBuilder.setSpan(new li81(), intValue, intValue2, 33);
                    }
                    if (g.q == 1) {
                        vaa1.b(spannableStringBuilder, new j081(), intValue, intValue2);
                    }
                    int i8 = g.j;
                    if (i8 == 1) {
                        vaa1.b(spannableStringBuilder, new AbsoluteSizeSpan((int) g.k, true), intValue, intValue2);
                    } else if (i8 == 2) {
                        vaa1.b(spannableStringBuilder, new RelativeSizeSpan(g.k), intValue, intValue2);
                    } else if (i8 == 3) {
                        vaa1.b(spannableStringBuilder, new RelativeSizeSpan(g.k / 100.0f), intValue, intValue2);
                    }
                    if ("p".equals(this.a)) {
                        float f = g.s;
                        if (f != Float.MAX_VALUE) {
                            r571Var.m = (f * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = g.o;
                        if (alignment != null) {
                            r571Var.b = alignment;
                        }
                        Layout.Alignment alignment2 = g.p;
                        if (alignment2 != null) {
                            r571Var.c = alignment2;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList3 = this.m;
            if (i9 >= (arrayList3 == null ? 0 : arrayList3.size())) {
                return;
            }
            b(i9).e(j, map2, hashMap, str3, treeMap);
            i9++;
            map2 = map;
        }
    }

    public final void f(long j, boolean z, String str, TreeMap treeMap) {
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
            SpannableStringBuilder a = a(str4, treeMap);
            String str5 = this.b;
            str5.getClass();
            a.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            a(str4, treeMap).append('\n');
            return;
        }
        if (h(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((r571) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            int i = 0;
            while (true) {
                ArrayList arrayList = this.m;
                if (i >= (arrayList == null ? 0 : arrayList.size())) {
                    break;
                }
                b(i).f(j, z || equals, str4, treeMap);
                i++;
            }
            if (equals) {
                SpannableStringBuilder a2 = a(str4, treeMap);
                int length = a2.length() - 1;
                while (length >= 0 && a2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && a2.charAt(length) != '\n') {
                    a2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((r571) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public final void g(TreeSet treeSet, boolean z) {
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
            ((do81) this.m.get(i)).g(treeSet, z || equals);
        }
    }

    public final boolean h(long j) {
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
}
