package xsna;

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
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import xsna.rkk;

/* compiled from: TtmlNode.java */
/* loaded from: classes12.dex */
public final class usp0 {

    @Nullable
    public final String a;

    @Nullable
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;

    @Nullable
    public final xsp0 f;

    @Nullable
    public final String[] g;
    public final String h;

    @Nullable
    public final String i;

    @Nullable
    public final usp0 j;
    public final HashMap<String, Integer> k;
    public final HashMap<String, Integer> l;
    public ArrayList m;

    public usp0(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable xsp0 xsp0Var, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable usp0 usp0Var) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = xsp0Var;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = usp0Var;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    public static usp0 a(String str) {
        return new usp0(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            rkk.a aVar = new rkk.a();
            aVar.b(new SpannableStringBuilder());
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((rkk.a) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final usp0 b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (usp0) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet<Long> treeSet, boolean z) {
        String str = this.a;
        boolean equals = TtmlNode.TAG_P.equals(str);
        boolean equals2 = TtmlNode.TAG_DIV.equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((usp0) this.m.get(i)).d(treeSet, z || equals);
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 == C.TIME_UNSET && j3 == C.TIME_UNSET) {
            return true;
        }
        if (j2 <= j && j3 == C.TIME_UNSET) {
            return true;
        }
        if (j2 != C.TIME_UNSET || j >= j3) {
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
        if (f(j) && TtmlNode.TAG_DIV.equals(this.a) && (str2 = this.i) != null) {
            zy60.f(str, str2, arrayList);
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, Map map, HashMap hashMap, String str, TreeMap treeMap) {
        Iterator<Map.Entry<String, Integer>> it;
        int i;
        usp0 usp0Var;
        int i2;
        xsp0 J;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        Map map2 = map;
        if (f(j)) {
            String str2 = this.h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator<Map.Entry<String, Integer>> it2 = this.l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, Integer> next = it2.next();
                String key = next.getKey();
                HashMap<String, Integer> hashMap2 = this.k;
                int intValue = hashMap2.containsKey(key) ? hashMap2.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    rkk.a aVar = (rkk.a) treeMap.get(key);
                    aVar.getClass();
                    wsp0 wsp0Var = (wsp0) hashMap.get(str3);
                    wsp0Var.getClass();
                    int i7 = wsp0Var.j;
                    xsp0 J2 = cdi.J(this.f, this.g, map2);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.b(spannableStringBuilder);
                    }
                    if (J2 != null) {
                        int i8 = J2.h;
                        int i9 = 1;
                        if (((i8 == -1 && J2.i == -1) ? -1 : (i8 == 1 ? (char) 1 : (char) 0) | (J2.i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i10 = J2.h;
                            if (i10 == -1) {
                                if (J2.i == -1) {
                                    i6 = -1;
                                    i9 = 1;
                                    StyleSpan styleSpan = new StyleSpan(i6);
                                    i = 33;
                                    spannableStringBuilder.setSpan(styleSpan, intValue, intValue2, 33);
                                } else {
                                    i9 = 1;
                                }
                            }
                            i6 = (i10 == i9 ? i9 : 0) | (J2.i == i9 ? 2 : 0);
                            StyleSpan styleSpan2 = new StyleSpan(i6);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan2, intValue, intValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (J2.f == i9) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, i);
                        }
                        if (J2.g == i9) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, i);
                        }
                        if (J2.c) {
                            if (!J2.c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            we7.c(spannableStringBuilder, new ForegroundColorSpan(J2.b), intValue, intValue2);
                        }
                        if (J2.e) {
                            if (!J2.e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            we7.c(spannableStringBuilder, new BackgroundColorSpan(J2.d), intValue, intValue2);
                        }
                        if (J2.a != null) {
                            we7.c(spannableStringBuilder, new TypefaceSpan(J2.a), intValue, intValue2);
                        }
                        ifo0 ifo0Var = J2.r;
                        if (ifo0Var != null) {
                            int i11 = ifo0Var.a;
                            if (i11 == -1) {
                                i11 = (i7 == 2 || i7 == 1) ? 3 : 1;
                                i5 = 1;
                            } else {
                                i5 = ifo0Var.b;
                            }
                            int i12 = ifo0Var.c;
                            if (i12 == -2) {
                                i12 = 1;
                            }
                            we7.c(spannableStringBuilder, new jfo0(i11, i5, i12), intValue, intValue2);
                        }
                        int i13 = J2.m;
                        if (i13 == 2) {
                            usp0 usp0Var2 = this.j;
                            while (true) {
                                if (usp0Var2 == null) {
                                    usp0Var2 = null;
                                    break;
                                }
                                xsp0 J3 = cdi.J(usp0Var2.f, usp0Var2.g, map2);
                                if (J3 != null && J3.m == 1) {
                                    break;
                                } else {
                                    usp0Var2 = usp0Var2.j;
                                }
                            }
                            if (usp0Var2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(usp0Var2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        usp0Var = null;
                                        break;
                                    }
                                    usp0 usp0Var3 = (usp0) arrayDeque.pop();
                                    xsp0 J4 = cdi.J(usp0Var3.f, usp0Var3.g, map2);
                                    if (J4 != null && J4.m == 3) {
                                        usp0Var = usp0Var3;
                                        break;
                                    }
                                    for (int c = usp0Var3.c() - 1; c >= 0; c--) {
                                        arrayDeque.push(usp0Var3.b(c));
                                    }
                                }
                                if (usp0Var != null) {
                                    if (usp0Var.c() == 1) {
                                        i2 = 0;
                                        if (usp0Var.b(0).b != null) {
                                            String str4 = usp0Var.b(0).b;
                                            String str5 = y2r0.a;
                                            xsp0 J5 = cdi.J(usp0Var.f, usp0Var.g, map2);
                                            int i14 = J5 != null ? J5.n : -1;
                                            if (i14 == -1 && (J = cdi.J(usp0Var2.f, usp0Var2.g, map2)) != null) {
                                                i14 = J.n;
                                            }
                                            spannableStringBuilder.setSpan(new mrg0(str4, i14), intValue, intValue2, 33);
                                            if (J2.q == 1) {
                                                we7.c(spannableStringBuilder, new xfv(), intValue, intValue2);
                                            }
                                            i3 = J2.j;
                                            float f2 = 100.0f;
                                            if (i3 == 1) {
                                                it = it2;
                                                f = 100.0f;
                                                we7.c(spannableStringBuilder, new AbsoluteSizeSpan((int) J2.k, true), intValue, intValue2);
                                            } else if (i3 == 2) {
                                                it = it2;
                                                f = 100.0f;
                                                we7.c(spannableStringBuilder, new RelativeSizeSpan(J2.k), intValue, intValue2);
                                            } else if (i3 != 3) {
                                                it = it2;
                                                f = 100.0f;
                                            } else {
                                                float f3 = J2.k / 100.0f;
                                                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(intValue, intValue2, RelativeSizeSpan.class);
                                                int length = relativeSizeSpanArr.length;
                                                int i15 = i2;
                                                float f4 = f3;
                                                int i16 = i15;
                                                while (i16 < length) {
                                                    float f5 = f2;
                                                    RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i16];
                                                    Iterator<Map.Entry<String, Integer>> it3 = it2;
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= intValue2) {
                                                        f4 = relativeSizeSpan.getSizeChange() * f4;
                                                    }
                                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == intValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == intValue2) {
                                                        i4 = i16;
                                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                                        }
                                                    } else {
                                                        i4 = i16;
                                                    }
                                                    i16 = i4 + 1;
                                                    f2 = f5;
                                                    it2 = it3;
                                                }
                                                it = it2;
                                                f = f2;
                                                spannableStringBuilder.setSpan(new RelativeSizeSpan(f4), intValue, intValue2, 33);
                                            }
                                            if (TtmlNode.TAG_P.equals(this.a)) {
                                                float f6 = J2.s;
                                                if (f6 != Float.MAX_VALUE) {
                                                    aVar.q = (f6 * (-90.0f)) / f;
                                                }
                                                Layout.Alignment alignment = J2.o;
                                                if (alignment != null) {
                                                    aVar.c = alignment;
                                                }
                                                Layout.Alignment alignment2 = J2.p;
                                                if (alignment2 != null) {
                                                    aVar.d = alignment2;
                                                }
                                            }
                                            it2 = it;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    ahn.u("Skipping rubyText node without exactly one text child.");
                                    if (J2.q == 1) {
                                    }
                                    i3 = J2.j;
                                    float f22 = 100.0f;
                                    if (i3 == 1) {
                                    }
                                    if (TtmlNode.TAG_P.equals(this.a)) {
                                    }
                                    it2 = it;
                                }
                            }
                        } else if (i13 == 3 || i13 == 4) {
                            spannableStringBuilder.setSpan(new kvl(), intValue, intValue2, 33);
                        }
                        i2 = 0;
                        if (J2.q == 1) {
                        }
                        i3 = J2.j;
                        float f222 = 100.0f;
                        if (i3 == 1) {
                        }
                        if (TtmlNode.TAG_P.equals(this.a)) {
                        }
                        it2 = it;
                    }
                }
                it = it2;
                it2 = it;
            }
            int i17 = 0;
            while (i17 < c()) {
                b(i17).h(j, map2, hashMap, str3, treeMap);
                i17++;
                map2 = map;
            }
        }
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        boolean z2;
        TreeMap treeMap2;
        long j2;
        HashMap<String, Integer> hashMap = this.k;
        hashMap.clear();
        HashMap<String, Integer> hashMap2 = this.l;
        hashMap2.clear();
        String str2 = this.a;
        if ("metadata".equals(str2)) {
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
        if (TtmlNode.TAG_BR.equals(str2) && z) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((rkk.a) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = TtmlNode.TAG_P.equals(str2);
            for (int i = 0; i < c(); i++) {
                usp0 b = b(i);
                if (z || equals) {
                    z2 = true;
                    treeMap2 = treeMap;
                    j2 = j;
                } else {
                    z2 = false;
                    j2 = j;
                    treeMap2 = treeMap;
                }
                b.i(j2, z2, str4, treeMap2);
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
                CharSequence charSequence2 = ((rkk.a) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
