package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes10.dex */
public final class wa3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final za3 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final wa3 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public wa3(String str, String str2, long j, long j2, za3 za3Var, String[] strArr, String str3, String str4, wa3 wa3Var) {
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = za3Var;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.h = (String) ni.a((Object) str3);
        this.j = wa3Var;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public final wa3 a(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (wa3) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void a(TreeSet treeSet, boolean z) {
        boolean equals = TtmlNode.TAG_P.equals(this.a);
        boolean equals2 = TtmlNode.TAG_DIV.equals(this.a);
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
            ((wa3) this.m.get(i)).a(treeSet, z || equals);
        }
    }

    public static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            n20 n20Var = new n20();
            n20Var.a = new SpannableStringBuilder();
            treeMap.put(str, n20Var);
        }
        CharSequence charSequence = ((n20) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final boolean a(long j) {
        long j2 = this.d;
        if (j2 == C.TIME_UNSET && this.e == C.TIME_UNSET) {
            return true;
        }
        if (j2 <= j && this.e == C.TIME_UNSET) {
            return true;
        }
        if (j2 != C.TIME_UNSET || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }

    public final void a(long j, String str, ArrayList arrayList) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (a(j) && TtmlNode.TAG_DIV.equals(this.a) && this.i != null) {
            arrayList.add(new Pair(str, this.i));
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.m;
            if (i >= (arrayList2 == null ? 0 : arrayList2.size())) {
                return;
            }
            a(i).a(j, str, arrayList);
            i++;
        }
    }

    public final void a(long j, Map map, Map map2, String str, TreeMap treeMap) {
        if (!a(j)) {
            return;
        }
        String str2 = "".equals(this.h) ? str : this.h;
        Iterator it = this.l.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            int intValue = this.k.containsKey(str3) ? ((Integer) this.k.get(str3)).intValue() : 0;
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if (intValue != intValue2) {
                n20 n20Var = (n20) treeMap.get(str3);
                n20Var.getClass();
                xa3 xa3Var = (xa3) map2.get(str2);
                xa3Var.getClass();
                int i = xa3Var.j;
                za3 a = ya3.a(this.f, this.g, map);
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) n20Var.a;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    n20Var.a = spannableStringBuilder;
                }
                SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                if (a != null) {
                    ya3.a(spannableStringBuilder2, intValue, intValue2, a, this.j, map, i);
                    if (TtmlNode.TAG_P.equals(this.a)) {
                        float f = a.s;
                        if (f != Float.MAX_VALUE) {
                            n20Var.q = (f * (-90.0f)) / 100.0f;
                        }
                        Layout.Alignment alignment = a.o;
                        if (alignment != null) {
                            n20Var.c = alignment;
                        }
                        Layout.Alignment alignment2 = a.p;
                        if (alignment2 != null) {
                            n20Var.d = alignment2;
                        }
                    }
                }
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= (arrayList == null ? 0 : arrayList.size())) {
                return;
            }
            a(i2).a(j, map, map2, str2, treeMap);
            i2++;
        }
    }

    public final void a(long j, boolean z, String str, TreeMap treeMap) {
        boolean z2;
        TreeMap treeMap2;
        long j2;
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        String str2 = str;
        if (this.c && z) {
            SpannableStringBuilder a = a(str2, treeMap);
            String str3 = this.b;
            str3.getClass();
            a.append((CharSequence) str3);
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.a) && z) {
            a(str2, treeMap).append('\n');
            return;
        }
        if (a(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap hashMap = this.k;
                String str4 = (String) entry.getKey();
                CharSequence charSequence = ((n20) entry.getValue()).a;
                charSequence.getClass();
                hashMap.put(str4, Integer.valueOf(charSequence.length()));
            }
            boolean equals = TtmlNode.TAG_P.equals(this.a);
            int i = 0;
            while (true) {
                ArrayList arrayList = this.m;
                if (i >= (arrayList == null ? 0 : arrayList.size())) {
                    break;
                }
                wa3 a2 = a(i);
                if (z || equals) {
                    z2 = true;
                    treeMap2 = treeMap;
                    j2 = j;
                } else {
                    z2 = false;
                    j2 = j;
                    treeMap2 = treeMap;
                }
                a2.a(j2, z2, str2, treeMap2);
                j = j2;
                i++;
                treeMap = treeMap2;
            }
            TreeMap treeMap3 = treeMap;
            if (equals) {
                SpannableStringBuilder a3 = a(str2, treeMap3);
                int length = a3.length() - 1;
                while (length >= 0 && a3.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && a3.charAt(length) != '\n') {
                    a3.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap3.entrySet()) {
                HashMap hashMap2 = this.l;
                String str5 = (String) entry2.getKey();
                CharSequence charSequence2 = ((n20) entry2.getValue()).a;
                charSequence2.getClass();
                hashMap2.put(str5, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public static wa3 a(String str) {
        return new wa3(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public final long[] a() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public final ArrayList a(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j, false, this.h, treeMap);
        a(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                xa3 xa3Var = (xa3) map2.get(pair.first);
                xa3Var.getClass();
                arrayList2.add(new o20(null, null, null, decodeByteArray, xa3Var.c, 0, xa3Var.e, xa3Var.b, 0, Integer.MIN_VALUE, -3.4028235E38f, xa3Var.f, xa3Var.g, false, -16777216, xa3Var.j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            xa3 xa3Var2 = (xa3) map2.get(entry.getKey());
            xa3Var2.getClass();
            n20 n20Var = (n20) entry.getValue();
            CharSequence charSequence = n20Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (vf0 vf0Var : (vf0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vf0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(vf0Var), spannableStringBuilder.getSpanEnd(vf0Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = xa3Var2.c;
            int i9 = xa3Var2.d;
            n20Var.e = f;
            n20Var.f = i9;
            n20Var.g = xa3Var2.e;
            n20Var.h = xa3Var2.b;
            n20Var.l = xa3Var2.f;
            float f2 = xa3Var2.i;
            int i10 = xa3Var2.h;
            n20Var.k = f2;
            n20Var.j = i10;
            n20Var.p = xa3Var2.j;
            arrayList2.add(n20Var.a());
        }
        return arrayList2;
    }
}
