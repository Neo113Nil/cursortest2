package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import defpackage.bmt0;
import defpackage.dyr;
import defpackage.e731;
import defpackage.eyr;
import defpackage.fwi;
import defpackage.gyr;
import defpackage.hzr;
import defpackage.ik2;
import defpackage.izr;
import defpackage.jky;
import defpackage.kk2;
import defpackage.kky;
import defpackage.lzr;
import defpackage.mk2;
import defpackage.moy0;
import defpackage.nr11;
import defpackage.qys;
import defpackage.rly0;
import defpackage.rzo;
import defpackage.sg21;
import defpackage.soy0;
import defpackage.ueb1;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpannableString a(kk2 kk2Var, fwi fwiVar, dyr dyrVar, nr11 nr11Var) {
        ArrayList arrayList;
        int i;
        long j;
        String str = kk2Var.b;
        List list = kk2Var.a;
        SpannableString spannableString = new SpannableString(str);
        ArrayList arrayList2 = kk2Var.c;
        lzr lzrVar = null;
        int i2 = 33;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                ik2 ik2Var = (ik2) arrayList2.get(i3);
                bmt0 bmt0Var = (bmt0) ik2Var.a;
                int i4 = ik2Var.b;
                int i5 = ik2Var.c;
                int i6 = size;
                bmt0 a = bmt0.a(bmt0Var, 0L, lzrVar, 65503);
                moy0 moy0Var = a.a;
                soy0 soy0Var = a.j;
                rly0 rly0Var = a.m;
                eyr eyrVar = a.f;
                lzr lzrVar2 = lzrVar;
                hzr hzrVar = a.d;
                ueb1.d(spannableString, moy0Var.b(), i4, i5);
                ueb1.e(spannableString, a.b, fwiVar, i4, i5);
                lzr lzrVar3 = a.c;
                if (lzrVar3 != null || hzrVar != null) {
                    if (lzrVar3 == null) {
                        lzrVar3 = lzr.D;
                    }
                    int i7 = hzrVar != null ? hzrVar.a : 0;
                    boolean z = lzrVar3.compareTo(lzr.w) >= 0;
                    boolean z2 = i7 == 1;
                    spannableString.setSpan(new StyleSpan((z2 && z) ? 3 : z ? 1 : z2 ? 2 : 0), i4, i5, i2);
                }
                if (eyrVar != null) {
                    if (eyrVar instanceof qys) {
                        spannableString.setSpan(new TypefaceSpan(((qys) eyrVar).y), i4, i5, i2);
                    } else {
                        izr izrVar = a.e;
                        i = 33;
                        spannableString.setSpan(new TypefaceSpan((Typeface) ((gyr) dyrVar).b(eyrVar, lzr.D, 0, izrVar != null ? izrVar.a : 65535).getValue()), i4, i5, 33);
                        if (rly0Var != null) {
                            int i8 = rly0Var.a;
                            if ((i8 | 1) == i8) {
                                spannableString.setSpan(new UnderlineSpan(), i4, i5, i);
                            }
                            if ((i8 | 2) == i8) {
                                spannableString.setSpan(new StrikethroughSpan(), i4, i5, i);
                            }
                        }
                        if (soy0Var != null) {
                            spannableString.setSpan(new ScaleXSpan(soy0Var.a), i4, i5, i);
                        }
                        ueb1.f(spannableString, a.k, i4, i5);
                        j = a.l;
                        if (j == 16) {
                            spannableString.setSpan(new BackgroundColorSpan(rzo.X(j)), i4, i5, 33);
                        }
                        i3++;
                        size = i6;
                        lzrVar = lzrVar2;
                        i2 = 33;
                    }
                }
                i = i2;
                if (rly0Var != null) {
                }
                if (soy0Var != null) {
                }
                ueb1.f(spannableString, a.k, i4, i5);
                j = a.l;
                if (j == 16) {
                }
                i3++;
                size = i6;
                lzrVar = lzrVar2;
                i2 = 33;
            }
        }
        ?? r17 = lzrVar;
        int length = str.length();
        Collection collection = EmptyList.a;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                Object obj = list.get(i9);
                ik2 ik2Var2 = (ik2) obj;
                if ((ik2Var2.a instanceof e731) && mk2.d(0, length, ik2Var2.b, ik2Var2.c)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = collection;
        }
        int size3 = arrayList.size();
        for (int i10 = 0; i10 < size3; i10++) {
            ik2 ik2Var3 = (ik2) arrayList.get(i10);
            e731 e731Var = (e731) ik2Var3.a;
            int i11 = ik2Var3.b;
            int i12 = ik2Var3.c;
            if (!(e731Var instanceof e731)) {
                w511.b();
                return r17;
            }
            spannableString.setSpan(new TtsSpan.VerbatimBuilder(e731Var.a).build(), i11, i12, 33);
        }
        int length2 = str.length();
        if (list != null) {
            collection = new ArrayList(list.size());
            int size4 = list.size();
            for (int i13 = 0; i13 < size4; i13++) {
                Object obj2 = list.get(i13);
                ik2 ik2Var4 = (ik2) obj2;
                if ((ik2Var4.a instanceof sg21) && mk2.d(0, length2, ik2Var4.b, ik2Var4.c)) {
                    collection.add(obj2);
                }
            }
        }
        int size5 = collection.size();
        for (int i14 = 0; i14 < size5; i14++) {
            ik2 ik2Var5 = (ik2) collection.get(i14);
            sg21 sg21Var = (sg21) ik2Var5.a;
            int i15 = ik2Var5.b;
            int i16 = ik2Var5.c;
            WeakHashMap weakHashMap = nr11Var.a;
            Object obj3 = weakHashMap.get(sg21Var);
            if (obj3 == null) {
                obj3 = new URLSpan(sg21Var.a);
                weakHashMap.put(sg21Var, obj3);
            }
            spannableString.setSpan((URLSpan) obj3, i15, i16, 33);
        }
        List a2 = kk2Var.a(str.length());
        int size6 = a2.size();
        for (int i17 = 0; i17 < size6; i17++) {
            ik2 ik2Var6 = (ik2) a2.get(i17);
            int i18 = ik2Var6.b;
            Object obj4 = ik2Var6.a;
            int i19 = ik2Var6.c;
            if (i18 != i19) {
                if (((kky) obj4) instanceof jky) {
                    jky jkyVar = (jky) obj4;
                    ik2 ik2Var7 = new ik2(jkyVar, i18, i19);
                    WeakHashMap weakHashMap2 = nr11Var.b;
                    Object obj5 = weakHashMap2.get(ik2Var7);
                    if (obj5 == null) {
                        obj5 = new URLSpan(jkyVar.a);
                        weakHashMap2.put(ik2Var7, obj5);
                    }
                    spannableString.setSpan((URLSpan) obj5, i18, i19, 33);
                } else {
                    WeakHashMap weakHashMap3 = nr11Var.c;
                    Object obj6 = weakHashMap3.get(ik2Var6);
                    if (obj6 == null) {
                        obj6 = new ComposeClickableSpan((kky) obj4);
                        weakHashMap3.put(ik2Var6, obj6);
                    }
                    spannableString.setSpan((ClickableSpan) obj6, i18, i19, 33);
                }
            }
        }
        return spannableString;
    }
}
