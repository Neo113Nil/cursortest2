package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.FontFeatureSpan;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import androidx.compose.ui.text.android.style.LineHeightSpan;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.android.style.ShadowSpan;
import androidx.compose.ui.text.android.style.SkewXSpan;
import androidx.compose.ui.text.android.style.TextDecorationSpan;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt$NoopSpan$1;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.CustomBulletSpan;
import androidx.compose.ui.text.platform.style.DrawStyleSpan;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.emoji2.text.EmojiSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class ib2 implements ec90 {
    public final CharSequence A;
    public final o0y B;
    public cjw0 C;
    public final boolean D;
    public final int E;
    public final String a;
    public final ety0 b;
    public final List c;
    public final List w;
    public final dyr x;
    public final fwi y;
    public final AndroidTextPaint z;

    /* JADX WARN: Code restructure failed: missing block: B:107:0x039c, code lost:
    
        if ((r4.b.c & 1095216660480L) != 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x008f, code lost:
    
        if (r5 == 1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [ib2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [td5] */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [bmt0] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30, types: [ht6] */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r8v115 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96, types: [mun] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ib2(String str, ety0 ety0Var, List list, List list2, dyr dyrVar, fwi fwiVar) {
        boolean booleanValue;
        Locale locale;
        int i;
        alb0 alb0Var;
        int i2;
        int size;
        int i3;
        Throwable th;
        Object obj;
        lzr lzrVar;
        hzr hzrVar;
        String str2;
        k5z k5zVar;
        soy0 soy0Var;
        long j;
        long b;
        eyr eyrVar;
        rp11 b2;
        Typeface typeface;
        Object bmt0Var;
        List list3;
        String str3;
        float textSize;
        fwi fwiVar2;
        boolean z;
        CharSequence charSequence;
        bmt0 bmt0Var2;
        gc90 gc90Var;
        float f;
        iwc0 iwc0Var;
        long j2;
        float c;
        int i4;
        apy0 apy0Var;
        gc90 gc90Var2;
        alb0 alb0Var2;
        ArrayList arrayList;
        int size2;
        int i5;
        List list4;
        ArrayList arrayList2;
        bmt0 bmt0Var3;
        int i6;
        int size3;
        boolean z2;
        int i7;
        apy0 apy0Var2;
        float f2;
        int size4;
        int i8;
        int size5;
        int i9;
        ib2 ib2Var;
        long j3;
        fwi fwiVar3;
        int i10;
        int i11;
        fwi fwiVar4;
        int i12;
        int i13;
        boolean z3;
        int i14;
        fwi fwiVar5;
        int i15;
        long j4;
        int i16;
        tvc0 tvc0Var;
        CharSequence charSequence2;
        tvc0 tvc0Var2;
        ?? obj2 = new Object();
        obj2.a = str;
        obj2.b = ety0Var;
        obj2.c = list;
        obj2.w = list2;
        obj2.x = dyrVar;
        obj2.y = fwiVar;
        int i17 = 1;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, fwiVar.getDensity());
        obj2.z = androidTextPaint;
        boolean a = cva1.a(ety0Var);
        bmt0 bmt0Var4 = ety0Var.a;
        gc90 gc90Var3 = ety0Var.b;
        if (a) {
            jdh jdhVar = itn.a;
            jdh jdhVar2 = itn.a;
            m3u0 m3u0Var = jdhVar2.a;
            if (m3u0Var == null) {
                if (ftn.e()) {
                    m3u0Var = jdhVar2.a();
                    jdhVar2.a = m3u0Var;
                } else {
                    m3u0Var = he91.a;
                }
            }
            booleanValue = ((Boolean) m3u0Var.getValue()).booleanValue();
        } else {
            booleanValue = false;
        }
        obj2.D = booleanValue;
        int i18 = gc90Var3.b;
        k5z k5zVar2 = bmt0Var4.k;
        int i19 = 2;
        if (i18 != 4) {
            if (i18 != 5) {
                if (i18 == 1) {
                    i = 0;
                } else if (i18 == 2) {
                    i = 1;
                } else {
                    if (i18 != 3 && i18 != 0) {
                        ny61.r("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((k5zVar2 == null || (locale = ((h5z) k5zVar2.a.get(0)).a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                obj2.E = i;
                alb0Var = new alb0(i19, (Object) obj2);
                try0 try0Var = gc90Var3.i;
                try0Var = try0Var == null ? try0.c : try0Var;
                androidTextPaint.setFlags(try0Var.b ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
                i2 = try0Var.a;
                if (i2 == 1) {
                    androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
                    androidTextPaint.setHinting(0);
                } else if (i2 == 2) {
                    androidTextPaint.getFlags();
                    androidTextPaint.setHinting(1);
                } else if (i2 == 3) {
                    androidTextPaint.getFlags();
                    androidTextPaint.setHinting(0);
                } else {
                    androidTextPaint.getFlags();
                }
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        th = null;
                        obj = null;
                        break;
                    } else {
                        obj = list.get(i3);
                        th = null;
                        if (((ik2) obj).a instanceof bmt0) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                boolean z4 = obj != null;
                long j5 = bmt0Var4.b;
                lzrVar = bmt0Var4.c;
                hzrVar = bmt0Var4.d;
                str2 = bmt0Var4.g;
                k5zVar = bmt0Var4.k;
                moy0 moy0Var = bmt0Var4.a;
                soy0Var = bmt0Var4.j;
                j = bmt0Var4.h;
                b = sty0.b(j5);
                boolean z5 = z4;
                if (tty0.a(b, 4294967296L)) {
                    androidTextPaint.setTextSize(fwiVar.i0(j5));
                } else if (tty0.a(b, 8589934592L)) {
                    androidTextPaint.setTextSize(sty0.c(j5) * androidTextPaint.getTextSize());
                }
                eyrVar = bmt0Var4.f;
                if (eyrVar == null || hzrVar != null || lzrVar != null) {
                    lzr lzrVar2 = lzrVar == null ? lzr.D : lzrVar;
                    int i20 = hzrVar != null ? hzrVar.a : 0;
                    izr izrVar = bmt0Var4.e;
                    int i21 = izrVar != null ? izrVar.a : 65535;
                    ib2 ib2Var2 = (ib2) alb0Var.b;
                    b2 = ((gyr) ib2Var2.x).b(eyrVar, lzrVar2, i20, i21);
                    if (b2 instanceof qp11) {
                        typeface = (Typeface) ((qp11) b2).a;
                    } else {
                        cjw0 cjw0Var = new cjw0(b2, ib2Var2.C);
                        ib2Var2.C = cjw0Var;
                        typeface = (Typeface) cjw0Var.c;
                    }
                    androidTextPaint.setTypeface(typeface);
                }
                if (k5zVar != null) {
                    k5z k5zVar3 = k5z.c;
                    if (!k5zVar.equals(qvc0.a().a())) {
                        ArrayList arrayList3 = new ArrayList(tcc.n(k5zVar, 10));
                        Iterator it = k5zVar.a.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((h5z) it.next()).a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        androidTextPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    androidTextPaint.setFontFeatureSettings(str2);
                }
                if (soy0Var != null && !soy0Var.equals(soy0.c)) {
                    androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * soy0Var.a);
                    androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + soy0Var.b);
                }
                androidTextPaint.m93setColor8_81llA(moy0Var.b());
                androidTextPaint.m91setBrush12SF9DM(moy0Var.c(), 9205357640488583168L, moy0Var.a());
                androidTextPaint.setShadow(bmt0Var4.n);
                androidTextPaint.setTextDecoration(bmt0Var4.m);
                androidTextPaint.setDrawStyle(bmt0Var4.p);
                if (!tty0.a(sty0.b(j), 4294967296L) && sty0.c(j) != 0.0f) {
                    float textScaleX = androidTextPaint.getTextScaleX() * androidTextPaint.getTextSize();
                    float i0 = fwiVar.i0(j);
                    if (textScaleX != 0.0f) {
                        androidTextPaint.setLetterSpacing(i0 / textScaleX);
                    }
                } else if (tty0.a(sty0.b(j), 8589934592L)) {
                    androidTextPaint.setLetterSpacing(sty0.c(j));
                }
                long j6 = bmt0Var4.l;
                td5 td5Var = bmt0Var4.i;
                boolean z6 = (z5 || !tty0.a(sty0.b(j), 4294967296L) || sty0.c(j) == 0.0f) ? false : true;
                long j7 = ldc.m;
                boolean z7 = ldc.c(j6, j7) && !ldc.c(j6, ldc.l);
                boolean z8 = td5Var == null && Float.compare(td5Var.a, 0.0f) != 0;
                bmt0Var = (!z6 || z7 || z8) ? new bmt0(0L, 0L, (lzr) null, (hzr) null, (izr) null, (eyr) null, (String) null, z6 ? j : sty0.c, (td5) (z8 ? td5Var : th), (soy0) null, (k5z) null, z7 ? j6 : j7, (rly0) null, (bgr0) null, 63103) : th;
                list3 = obj2.c;
                if (bmt0Var != null) {
                    int size6 = list3.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size6);
                    int i22 = 0;
                    while (i22 < size6) {
                        arrayList4.add(i22 == 0 ? new ik2(bmt0Var, 0, obj2.a.length()) : (ik2) obj2.c.get(i22 - 1));
                        i22++;
                    }
                    list3 = arrayList4;
                }
                str3 = obj2.a;
                textSize = obj2.z.getTextSize();
                ety0 ety0Var2 = obj2.b;
                List list5 = obj2.w;
                fwiVar2 = obj2.y;
                z = obj2.D;
                AndroidParagraphHelper_androidKt$NoopSpan$1 androidParagraphHelper_androidKt$NoopSpan$1 = hb2.a;
                if (z || !ftn.e()) {
                    charSequence = str3;
                } else {
                    iwc0 iwc0Var2 = ety0Var2.c;
                    ?? munVar = (iwc0Var2 == null || (tvc0Var2 = iwc0Var2.b) == null) ? th : new mun(tvc0Var2.b);
                    charSequence = ftn.a().i(0, str3.length(), str3, Integer.MAX_VALUE, munVar == 0 ? 0 : munVar.a == 2 ? 1 : 0);
                }
                if (list3.isEmpty() && list5.isEmpty() && jl40.l(ety0Var2.b.d, apy0.c)) {
                    ib2Var = obj2;
                    charSequence2 = charSequence;
                }
                SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                bmt0Var2 = ety0Var2.a;
                gc90Var = ety0Var2.b;
                if (jl40.l(bmt0Var2.m, rly0.c)) {
                    f = 0.0f;
                    spannableString.setSpan(hb2.a, 0, str3.length(), 33);
                } else {
                    f = 0.0f;
                }
                iwc0Var = ety0Var2.c;
                if (((iwc0Var != null || (tvc0Var = iwc0Var.b) == null) ? false : tvc0Var.a) || gc90Var.f != null) {
                    j2 = 0;
                    ehy ehyVar = gc90Var.f;
                    ehyVar = ehyVar == null ? ehy.d : ehyVar;
                    c = ueb1.c(gc90Var.c, textSize, fwiVar2);
                    if (!Float.isNaN(c)) {
                        int length = (spannableString.length() == 0 || gvu0.x0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                        int i23 = ehyVar.b;
                        i4 = 0;
                        spannableString.setSpan(new LineHeightStyleSpan(c, 0, length, (i23 & 1) > 0, (i23 & 16) > 0, ehyVar.a, ehyVar.c, null), 0, spannableString.length(), 33);
                        apy0Var = gc90Var.d;
                        if (apy0Var == null) {
                            long j8 = apy0Var.a;
                            long j9 = apy0Var.b;
                            if (!sty0.a(j8, uh6.E(i4)) || !sty0.a(j9, uh6.E(i4))) {
                                if ((j8 & 1095216660480L) == j2 || (j9 & 1095216660480L) == j2) {
                                    alb0Var2 = alb0Var;
                                    gc90Var2 = gc90Var;
                                } else {
                                    long b3 = sty0.b(j8);
                                    alb0Var2 = alb0Var;
                                    gc90Var2 = gc90Var;
                                    float i02 = tty0.a(b3, 4294967296L) ? fwiVar2.i0(j8) : tty0.a(b3, 8589934592L) ? sty0.c(j8) * textSize : f;
                                    long b4 = sty0.b(j9);
                                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(i02), (int) Math.ceil(tty0.a(b4, 4294967296L) ? fwiVar2.i0(j9) : tty0.a(b4, 8589934592L) ? sty0.c(j9) * textSize : f)), 0, spannableString.length(), 33);
                                }
                                arrayList = new ArrayList(list3.size());
                                List list6 = list3;
                                size2 = list6.size();
                                for (i5 = 0; i5 < size2; i5++) {
                                    ik2 ik2Var = (ik2) list3.get(i5);
                                    Object obj3 = ik2Var.a;
                                    if (obj3 instanceof bmt0) {
                                        bmt0 bmt0Var5 = (bmt0) obj3;
                                        if (bmt0Var5.f != null || bmt0Var5.d != null || bmt0Var5.c != null || ((bmt0) obj3).e != null) {
                                            arrayList.add(ik2Var);
                                        }
                                    }
                                }
                                bmt0 bmt0Var6 = ety0Var2.a;
                                eyr eyrVar2 = bmt0Var6.f;
                                ?? bmt0Var7 = (eyrVar2 != null && bmt0Var6.d == null && bmt0Var6.c == null && bmt0Var6.e == null) ? th : new bmt0(0L, 0L, bmt0Var6.c, bmt0Var6.d, bmt0Var6.e, eyrVar2, (String) null, 0L, (td5) null, (soy0) null, (k5z) null, 0L, (rly0) null, (bgr0) null, 65475);
                                ays0 ays0Var = new ays0(i17, spannableString, alb0Var2);
                                if (arrayList.size() > 1) {
                                    int size7 = arrayList.size();
                                    int i24 = size7 * 2;
                                    int[] iArr = new int[i24];
                                    int size8 = arrayList.size();
                                    for (int i25 = 0; i25 < size8; i25++) {
                                        ik2 ik2Var2 = (ik2) arrayList.get(i25);
                                        iArr[i25] = ik2Var2.b;
                                        iArr[i25 + size7] = ik2Var2.c;
                                    }
                                    if (i24 > 1) {
                                        Arrays.sort(iArr);
                                    }
                                    int B = j73.B(iArr);
                                    int i26 = 0;
                                    bmt0 bmt0Var8 = bmt0Var7;
                                    while (i26 < i24) {
                                        int i27 = iArr[i26];
                                        if (i27 == B) {
                                            arrayList2 = arrayList;
                                            list4 = list6;
                                            bmt0Var3 = bmt0Var8;
                                            i6 = i24;
                                        } else {
                                            int size9 = arrayList.size();
                                            list4 = list6;
                                            bmt0 bmt0Var9 = bmt0Var8;
                                            int i28 = 0;
                                            bmt0 bmt0Var10 = bmt0Var8;
                                            while (i28 < size9) {
                                                ArrayList arrayList5 = arrayList;
                                                ik2 ik2Var3 = (ik2) arrayList.get(i28);
                                                bmt0 bmt0Var11 = bmt0Var10;
                                                int i29 = ik2Var3.b;
                                                int i30 = i24;
                                                int i31 = ik2Var3.c;
                                                if (i29 != i31 && mk2.d(B, i27, i29, i31)) {
                                                    bmt0 bmt0Var12 = (bmt0) ik2Var3.a;
                                                    bmt0Var9 = bmt0Var9 != null ? bmt0Var9.d(bmt0Var12) : bmt0Var12;
                                                }
                                                i28++;
                                                bmt0Var10 = bmt0Var11;
                                                arrayList = arrayList5;
                                                i24 = i30;
                                            }
                                            arrayList2 = arrayList;
                                            bmt0Var3 = bmt0Var10;
                                            i6 = i24;
                                            if (bmt0Var9 != null) {
                                                ays0Var.invoke(bmt0Var9, Integer.valueOf(B), Integer.valueOf(i27));
                                            }
                                            B = i27;
                                        }
                                        i26++;
                                        list6 = list4;
                                        bmt0Var8 = bmt0Var3;
                                        arrayList = arrayList2;
                                        i24 = i6;
                                    }
                                } else if (!arrayList.isEmpty()) {
                                    bmt0 bmt0Var13 = (bmt0) ((ik2) arrayList.get(0)).a;
                                    ays0Var.invoke(bmt0Var7 != 0 ? bmt0Var7.d(bmt0Var13) : bmt0Var13, Integer.valueOf(((ik2) arrayList.get(0)).b), Integer.valueOf(((ik2) arrayList.get(0)).c));
                                }
                                List list7 = list6;
                                size3 = list7.size();
                                z2 = false;
                                i7 = 0;
                                while (i7 < size3) {
                                    ik2 ik2Var4 = (ik2) list3.get(i7);
                                    Object obj4 = ik2Var4.a;
                                    if (obj4 instanceof bmt0) {
                                        int i32 = ik2Var4.b;
                                        int i33 = ik2Var4.c;
                                        if (i32 >= 0 && i32 < spannableString.length() && i33 > i32 && i33 <= spannableString.length()) {
                                            bmt0 bmt0Var14 = (bmt0) obj4;
                                            long j10 = bmt0Var14.h;
                                            td5 td5Var2 = bmt0Var14.i;
                                            moy0 moy0Var2 = bmt0Var14.a;
                                            if (td5Var2 != null) {
                                                spannableString.setSpan(new BaselineShiftSpan(td5Var2.a), i32, i33, 33);
                                            }
                                            int i34 = size3;
                                            boolean z9 = z2;
                                            ueb1.d(spannableString, moy0Var2.b(), i32, i33);
                                            ml6 c2 = moy0Var2.c();
                                            float a2 = moy0Var2.a();
                                            if (c2 != null) {
                                                if (c2 instanceof a6t0) {
                                                    ueb1.d(spannableString, ((a6t0) c2).a, i32, i33);
                                                } else {
                                                    spannableString.setSpan(new ShaderBrushSpan((zfr0) c2, a2), i32, i33, 33);
                                                }
                                            }
                                            rly0 rly0Var = bmt0Var14.m;
                                            if (rly0Var != null) {
                                                int i35 = rly0Var.a;
                                                i13 = i34;
                                                spannableString.setSpan(new TextDecorationSpan((i35 | 1) == i35, (i35 | 2) == i35), i32, i33, 33);
                                            } else {
                                                i13 = i34;
                                            }
                                            fwi fwiVar6 = fwiVar2;
                                            ueb1.e(spannableString, bmt0Var14.b, fwiVar6, i32, i33);
                                            fwiVar5 = fwiVar6;
                                            String str4 = bmt0Var14.g;
                                            if (str4 != null) {
                                                FontFeatureSpan fontFeatureSpan = new FontFeatureSpan(str4);
                                                i15 = 33;
                                                spannableString.setSpan(fontFeatureSpan, i32, i33, 33);
                                            } else {
                                                i15 = 33;
                                            }
                                            soy0 soy0Var2 = bmt0Var14.j;
                                            if (soy0Var2 != null) {
                                                spannableString.setSpan(new ScaleXSpan(soy0Var2.a), i32, i33, i15);
                                                spannableString.setSpan(new SkewXSpan(soy0Var2.b), i32, i33, i15);
                                            }
                                            ueb1.f(spannableString, bmt0Var14.k, i32, i33);
                                            i14 = i7;
                                            long j11 = bmt0Var14.l;
                                            if (j11 != 16) {
                                                spannableString.setSpan(new BackgroundColorSpan(rzo.X(j11)), i32, i33, 33);
                                            }
                                            bgr0 bgr0Var = bmt0Var14.n;
                                            if (bgr0Var != null) {
                                                j4 = j10;
                                                long j12 = bgr0Var.b;
                                                int X = rzo.X(bgr0Var.a);
                                                z3 = z9;
                                                float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                                                float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                                                float f3 = bgr0Var.c;
                                                ShadowSpan shadowSpan = new ShadowSpan(X, intBitsToFloat, intBitsToFloat2, f3 == f ? Float.MIN_VALUE : f3);
                                                i16 = 33;
                                                spannableString.setSpan(shadowSpan, i32, i33, 33);
                                            } else {
                                                j4 = j10;
                                                z3 = z9;
                                                i16 = 33;
                                            }
                                            ram ramVar = bmt0Var14.p;
                                            if (ramVar != null) {
                                                spannableString.setSpan(new DrawStyleSpan(ramVar), i32, i33, i16);
                                            }
                                            if (tty0.a(sty0.b(j4), 4294967296L) || tty0.a(sty0.b(j4), 8589934592L)) {
                                                z2 = true;
                                                i7 = i14 + 1;
                                                fwiVar2 = fwiVar5;
                                                size3 = i13;
                                            }
                                            z2 = z3;
                                            i7 = i14 + 1;
                                            fwiVar2 = fwiVar5;
                                            size3 = i13;
                                        }
                                    }
                                    i13 = size3;
                                    z3 = z2;
                                    i14 = i7;
                                    fwiVar5 = fwiVar2;
                                    z2 = z3;
                                    i7 = i14 + 1;
                                    fwiVar2 = fwiVar5;
                                    size3 = i13;
                                }
                                fwi fwiVar7 = fwiVar2;
                                if (z2) {
                                    int size10 = list7.size();
                                    int i36 = 0;
                                    while (i36 < size10) {
                                        ik2 ik2Var5 = (ik2) list3.get(i36);
                                        fk2 fk2Var = (fk2) ik2Var5.a;
                                        if (fk2Var instanceof bmt0) {
                                            int i37 = ik2Var5.b;
                                            int i38 = ik2Var5.c;
                                            if (i37 >= 0 && i37 < spannableString.length() && i38 > i37 && i38 <= spannableString.length()) {
                                                long j13 = ((bmt0) fk2Var).h;
                                                long b5 = sty0.b(j13);
                                                i12 = i36;
                                                Object letterSpacingSpanPx = tty0.a(b5, 4294967296L) ? new LetterSpacingSpanPx(fwiVar7.i0(j13)) : tty0.a(b5, 8589934592L) ? new LetterSpacingSpanEm(sty0.c(j13)) : th;
                                                if (letterSpacingSpanPx != null) {
                                                    spannableString.setSpan(letterSpacingSpanPx, i37, i38, 33);
                                                }
                                                i36 = i12 + 1;
                                            }
                                        }
                                        i12 = i36;
                                        i36 = i12 + 1;
                                    }
                                }
                                apy0Var2 = gc90Var2.d;
                                if (apy0Var2 != null) {
                                    long j14 = apy0Var2.a;
                                    long b6 = sty0.b(j14);
                                    f2 = tty0.a(b6, 4294967296L) ? fwiVar7.i0(j14) : tty0.a(b6, 8589934592L) ? sty0.c(j14) * textSize : f;
                                } else {
                                    f2 = f;
                                }
                                size4 = list7.size();
                                i8 = 0;
                                while (i8 < size4) {
                                    ik2 ik2Var6 = (ik2) list3.get(i8);
                                    Object obj5 = ik2Var6.a;
                                    ?? r5 = obj5 instanceof ht6 ? (ht6) obj5 : th;
                                    if (r5 != 0) {
                                        float b7 = ueb1.b(r5.a, textSize, fwiVar7);
                                        float b8 = ueb1.b(r5.b, textSize, fwiVar7);
                                        float b9 = ueb1.b(r5.c, textSize, fwiVar7);
                                        if (!Float.isNaN(b7) && !Float.isNaN(b8) && !Float.isNaN(b9)) {
                                            fwi fwiVar8 = fwiVar7;
                                            CustomBulletSpan customBulletSpan = new CustomBulletSpan(yub.b, b7, b8, b9, null, Float.NaN, i3r.a, fwiVar8, f2);
                                            fwiVar4 = fwiVar8;
                                            spannableString.setSpan(customBulletSpan, ik2Var6.b, ik2Var6.c, 33);
                                            i8++;
                                            fwiVar7 = fwiVar4;
                                        }
                                    }
                                    fwiVar4 = fwiVar7;
                                    i8++;
                                    fwiVar7 = fwiVar4;
                                }
                                fwi fwiVar9 = fwiVar7;
                                size5 = list5.size();
                                for (i9 = 0; i9 < size5; i9++) {
                                    ik2 ik2Var7 = (ik2) list5.get(i9);
                                    r3c0 r3c0Var = (r3c0) ik2Var7.a;
                                    int i39 = ik2Var7.b;
                                    int i40 = ik2Var7.c;
                                    for (Object obj6 : spannableString.getSpans(i39, i40, EmojiSpan.class)) {
                                        spannableString.removeSpan((EmojiSpan) obj6);
                                    }
                                    long j15 = r3c0Var.a;
                                    long j16 = r3c0Var.b;
                                    float c3 = sty0.c(j15);
                                    long b10 = sty0.b(r3c0Var.a);
                                    if (tty0.a(b10, 4294967296L)) {
                                        fwiVar3 = fwiVar9;
                                        j3 = 8589934592L;
                                        i10 = 0;
                                    } else {
                                        j3 = 8589934592L;
                                        if (tty0.a(b10, 8589934592L)) {
                                            fwiVar3 = fwiVar9;
                                            i10 = 1;
                                        } else {
                                            fwiVar3 = fwiVar9;
                                            i10 = 2;
                                        }
                                    }
                                    float c4 = sty0.c(j16);
                                    long b11 = sty0.b(j16);
                                    int i41 = tty0.a(b11, 4294967296L) ? 0 : tty0.a(b11, j3) ? 1 : 2;
                                    int i42 = r3c0Var.c;
                                    if (i42 == 1) {
                                        i11 = 0;
                                    } else if (i42 == 2) {
                                        i11 = 1;
                                    } else if (i42 == 3) {
                                        i11 = 2;
                                    } else if (i42 == 4) {
                                        i11 = 3;
                                    } else if (i42 == 5) {
                                        i11 = 4;
                                    } else if (i42 == 6) {
                                        i11 = 5;
                                    } else {
                                        if (i42 != 7) {
                                            ny61.r("Invalid PlaceholderVerticalAlign");
                                            throw th;
                                        }
                                        i11 = 6;
                                    }
                                    PlaceholderSpan placeholderSpan = new PlaceholderSpan(c3, i10, c4, i41, fwiVar3, i11);
                                    fwiVar9 = fwiVar3;
                                    spannableString.setSpan(placeholderSpan, i39, i40, 33);
                                }
                                ib2Var = this;
                                charSequence2 = spannableString;
                                ib2Var.A = charSequence2;
                                ib2Var.B = new o0y(charSequence2, ib2Var.z, ib2Var.E);
                            }
                            gc90Var2 = gc90Var;
                        } else {
                            gc90Var2 = gc90Var;
                        }
                        alb0Var2 = alb0Var;
                        arrayList = new ArrayList(list3.size());
                        List list62 = list3;
                        size2 = list62.size();
                        while (i5 < size2) {
                        }
                        bmt0 bmt0Var62 = ety0Var2.a;
                        eyr eyrVar22 = bmt0Var62.f;
                        if (eyrVar22 != null) {
                        }
                        ays0 ays0Var2 = new ays0(i17, spannableString, alb0Var2);
                        if (arrayList.size() > 1) {
                        }
                        List list72 = list62;
                        size3 = list72.size();
                        z2 = false;
                        i7 = 0;
                        while (i7 < size3) {
                        }
                        fwi fwiVar72 = fwiVar2;
                        if (z2) {
                        }
                        apy0Var2 = gc90Var2.d;
                        if (apy0Var2 != null) {
                        }
                        size4 = list72.size();
                        i8 = 0;
                        while (i8 < size4) {
                        }
                        fwi fwiVar92 = fwiVar72;
                        size5 = list5.size();
                        while (i9 < size5) {
                        }
                        ib2Var = this;
                        charSequence2 = spannableString;
                        ib2Var.A = charSequence2;
                        ib2Var.B = new o0y(charSequence2, ib2Var.z, ib2Var.E);
                    }
                } else {
                    j2 = 0;
                    float c5 = ueb1.c(gc90Var.c, textSize, fwiVar2);
                    if (!Float.isNaN(c5)) {
                        spannableString.setSpan(new LineHeightSpan(c5), 0, spannableString.length(), 33);
                    }
                }
                i4 = 0;
                apy0Var = gc90Var.d;
                if (apy0Var == null) {
                }
                alb0Var2 = alb0Var;
                arrayList = new ArrayList(list3.size());
                List list622 = list3;
                size2 = list622.size();
                while (i5 < size2) {
                }
                bmt0 bmt0Var622 = ety0Var2.a;
                eyr eyrVar222 = bmt0Var622.f;
                if (eyrVar222 != null) {
                }
                ays0 ays0Var22 = new ays0(i17, spannableString, alb0Var2);
                if (arrayList.size() > 1) {
                }
                List list722 = list622;
                size3 = list722.size();
                z2 = false;
                i7 = 0;
                while (i7 < size3) {
                }
                fwi fwiVar722 = fwiVar2;
                if (z2) {
                }
                apy0Var2 = gc90Var2.d;
                if (apy0Var2 != null) {
                }
                size4 = list722.size();
                i8 = 0;
                while (i8 < size4) {
                }
                fwi fwiVar922 = fwiVar722;
                size5 = list5.size();
                while (i9 < size5) {
                }
                ib2Var = this;
                charSequence2 = spannableString;
                ib2Var.A = charSequence2;
                ib2Var.B = new o0y(charSequence2, ib2Var.z, ib2Var.E);
            }
            i = 3;
            obj2.E = i;
            alb0Var = new alb0(i19, (Object) obj2);
            try0 try0Var2 = gc90Var3.i;
            if (try0Var2 == null) {
            }
            androidTextPaint.setFlags(try0Var2.b ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
            i2 = try0Var2.a;
            if (i2 == 1) {
            }
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j52 = bmt0Var4.b;
            lzrVar = bmt0Var4.c;
            hzrVar = bmt0Var4.d;
            str2 = bmt0Var4.g;
            k5zVar = bmt0Var4.k;
            moy0 moy0Var3 = bmt0Var4.a;
            soy0Var = bmt0Var4.j;
            j = bmt0Var4.h;
            b = sty0.b(j52);
            boolean z52 = z4;
            if (tty0.a(b, 4294967296L)) {
            }
            eyrVar = bmt0Var4.f;
            if (eyrVar == null) {
            }
            if (lzrVar == null) {
            }
            if (hzrVar != null) {
            }
            izr izrVar2 = bmt0Var4.e;
            if (izrVar2 != null) {
            }
            ib2 ib2Var22 = (ib2) alb0Var.b;
            b2 = ((gyr) ib2Var22.x).b(eyrVar, lzrVar2, i20, i21);
            if (b2 instanceof qp11) {
            }
            androidTextPaint.setTypeface(typeface);
            if (k5zVar != null) {
            }
            if (str2 != null) {
                androidTextPaint.setFontFeatureSettings(str2);
            }
            if (soy0Var != null) {
                androidTextPaint.setTextScaleX(androidTextPaint.getTextScaleX() * soy0Var.a);
                androidTextPaint.setTextSkewX(androidTextPaint.getTextSkewX() + soy0Var.b);
            }
            androidTextPaint.m93setColor8_81llA(moy0Var3.b());
            androidTextPaint.m91setBrush12SF9DM(moy0Var3.c(), 9205357640488583168L, moy0Var3.a());
            androidTextPaint.setShadow(bmt0Var4.n);
            androidTextPaint.setTextDecoration(bmt0Var4.m);
            androidTextPaint.setDrawStyle(bmt0Var4.p);
            if (!tty0.a(sty0.b(j), 4294967296L)) {
            }
            if (tty0.a(sty0.b(j), 8589934592L)) {
            }
            long j62 = bmt0Var4.l;
            td5 td5Var3 = bmt0Var4.i;
            if (z52) {
            }
            long j72 = ldc.m;
            if (ldc.c(j62, j72)) {
            }
            if (td5Var3 == null) {
            }
            if (z6) {
            }
            list3 = obj2.c;
            if (bmt0Var != null) {
            }
            str3 = obj2.a;
            textSize = obj2.z.getTextSize();
            ety0 ety0Var22 = obj2.b;
            List list52 = obj2.w;
            fwiVar2 = obj2.y;
            z = obj2.D;
            AndroidParagraphHelper_androidKt$NoopSpan$1 androidParagraphHelper_androidKt$NoopSpan$12 = hb2.a;
            if (z) {
            }
            charSequence = str3;
            if (list3.isEmpty()) {
                ib2Var = obj2;
                charSequence2 = charSequence;
            }
            if (charSequence instanceof Spannable) {
            }
            bmt0Var2 = ety0Var22.a;
            gc90Var = ety0Var22.b;
            if (jl40.l(bmt0Var2.m, rly0.c)) {
            }
            iwc0Var = ety0Var22.c;
            if ((iwc0Var != null || (tvc0Var = iwc0Var.b) == null) ? false : tvc0Var.a) {
            }
            j2 = 0;
            ehy ehyVar2 = gc90Var.f;
            if (ehyVar2 == null) {
            }
            c = ueb1.c(gc90Var.c, textSize, fwiVar2);
            if (!Float.isNaN(c)) {
            }
            i4 = 0;
            apy0Var = gc90Var.d;
            if (apy0Var == null) {
            }
            alb0Var2 = alb0Var;
            arrayList = new ArrayList(list3.size());
            List list6222 = list3;
            size2 = list6222.size();
            while (i5 < size2) {
            }
            bmt0 bmt0Var6222 = ety0Var22.a;
            eyr eyrVar2222 = bmt0Var6222.f;
            if (eyrVar2222 != null) {
            }
            ays0 ays0Var222 = new ays0(i17, spannableString, alb0Var2);
            if (arrayList.size() > 1) {
            }
            List list7222 = list6222;
            size3 = list7222.size();
            z2 = false;
            i7 = 0;
            while (i7 < size3) {
            }
            fwi fwiVar7222 = fwiVar2;
            if (z2) {
            }
            apy0Var2 = gc90Var2.d;
            if (apy0Var2 != null) {
            }
            size4 = list7222.size();
            i8 = 0;
            while (i8 < size4) {
            }
            fwi fwiVar9222 = fwiVar7222;
            size5 = list52.size();
            while (i9 < size5) {
            }
            ib2Var = this;
            charSequence2 = spannableString;
            ib2Var.A = charSequence2;
            ib2Var.B = new o0y(charSequence2, ib2Var.z, ib2Var.E);
        }
        i = 2;
        obj2.E = i;
        alb0Var = new alb0(i19, (Object) obj2);
        try0 try0Var22 = gc90Var3.i;
        if (try0Var22 == null) {
        }
        androidTextPaint.setFlags(try0Var22.b ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        i2 = try0Var22.a;
        if (i2 == 1) {
        }
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j522 = bmt0Var4.b;
        lzrVar = bmt0Var4.c;
        hzrVar = bmt0Var4.d;
        str2 = bmt0Var4.g;
        k5zVar = bmt0Var4.k;
        moy0 moy0Var32 = bmt0Var4.a;
        soy0Var = bmt0Var4.j;
        j = bmt0Var4.h;
        b = sty0.b(j522);
        boolean z522 = z4;
        if (tty0.a(b, 4294967296L)) {
        }
        eyrVar = bmt0Var4.f;
        if (eyrVar == null) {
        }
        if (lzrVar == null) {
        }
        if (hzrVar != null) {
        }
        izr izrVar22 = bmt0Var4.e;
        if (izrVar22 != null) {
        }
        ib2 ib2Var222 = (ib2) alb0Var.b;
        b2 = ((gyr) ib2Var222.x).b(eyrVar, lzrVar2, i20, i21);
        if (b2 instanceof qp11) {
        }
        androidTextPaint.setTypeface(typeface);
        if (k5zVar != null) {
        }
        if (str2 != null) {
        }
        if (soy0Var != null) {
        }
        androidTextPaint.m93setColor8_81llA(moy0Var32.b());
        androidTextPaint.m91setBrush12SF9DM(moy0Var32.c(), 9205357640488583168L, moy0Var32.a());
        androidTextPaint.setShadow(bmt0Var4.n);
        androidTextPaint.setTextDecoration(bmt0Var4.m);
        androidTextPaint.setDrawStyle(bmt0Var4.p);
        if (!tty0.a(sty0.b(j), 4294967296L)) {
        }
        if (tty0.a(sty0.b(j), 8589934592L)) {
        }
        long j622 = bmt0Var4.l;
        td5 td5Var32 = bmt0Var4.i;
        if (z522) {
        }
        long j722 = ldc.m;
        if (ldc.c(j622, j722)) {
        }
        if (td5Var32 == null) {
        }
        if (z6) {
        }
        list3 = obj2.c;
        if (bmt0Var != null) {
        }
        str3 = obj2.a;
        textSize = obj2.z.getTextSize();
        ety0 ety0Var222 = obj2.b;
        List list522 = obj2.w;
        fwiVar2 = obj2.y;
        z = obj2.D;
        AndroidParagraphHelper_androidKt$NoopSpan$1 androidParagraphHelper_androidKt$NoopSpan$122 = hb2.a;
        if (z) {
        }
        charSequence = str3;
        if (list3.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        bmt0Var2 = ety0Var222.a;
        gc90Var = ety0Var222.b;
        if (jl40.l(bmt0Var2.m, rly0.c)) {
        }
        iwc0Var = ety0Var222.c;
        if ((iwc0Var != null || (tvc0Var = iwc0Var.b) == null) ? false : tvc0Var.a) {
        }
        j2 = 0;
        ehy ehyVar22 = gc90Var.f;
        if (ehyVar22 == null) {
        }
        c = ueb1.c(gc90Var.c, textSize, fwiVar2);
        if (!Float.isNaN(c)) {
        }
        i4 = 0;
        apy0Var = gc90Var.d;
        if (apy0Var == null) {
        }
        alb0Var2 = alb0Var;
        arrayList = new ArrayList(list3.size());
        List list62222 = list3;
        size2 = list62222.size();
        while (i5 < size2) {
        }
        bmt0 bmt0Var62222 = ety0Var222.a;
        eyr eyrVar22222 = bmt0Var62222.f;
        if (eyrVar22222 != null) {
        }
        ays0 ays0Var2222 = new ays0(i17, spannableString, alb0Var2);
        if (arrayList.size() > 1) {
        }
        List list72222 = list62222;
        size3 = list72222.size();
        z2 = false;
        i7 = 0;
        while (i7 < size3) {
        }
        fwi fwiVar72222 = fwiVar2;
        if (z2) {
        }
        apy0Var2 = gc90Var2.d;
        if (apy0Var2 != null) {
        }
        size4 = list72222.size();
        i8 = 0;
        while (i8 < size4) {
        }
        fwi fwiVar92222 = fwiVar72222;
        size5 = list522.size();
        while (i9 < size5) {
        }
        ib2Var = this;
        charSequence2 = spannableString;
        ib2Var.A = charSequence2;
        ib2Var.B = new o0y(charSequence2, ib2Var.z, ib2Var.E);
    }

    @Override // defpackage.ec90
    public final boolean a() {
        cjw0 cjw0Var = this.C;
        if (cjw0Var != null ? cjw0Var.o() : false) {
            return true;
        }
        if (!this.D && cva1.a(this.b)) {
            jdh jdhVar = itn.a;
            jdh jdhVar2 = itn.a;
            m3u0 m3u0Var = jdhVar2.a;
            if (m3u0Var == null) {
                if (ftn.e()) {
                    m3u0Var = jdhVar2.a();
                    jdhVar2.a = m3u0Var;
                } else {
                    m3u0Var = he91.a;
                }
            }
            if (((Boolean) m3u0Var.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ec90
    public final float b() {
        o0y o0yVar = this.B;
        float f = o0yVar.e;
        TextPaint textPaint = o0yVar.b;
        if (!Float.isNaN(f)) {
            return o0yVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = o0yVar.a;
        lineInstance.setText(new ej9(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, tj91.a);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new d6w(i, next, 1));
            } else {
                d6w d6wVar = (d6w) priorityQueue.peek();
                if (d6wVar != null && d6wVar.b - d6wVar.a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new d6w(i, next, 1));
                }
            }
            i = next;
        }
        float f2 = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                ny61.p();
                return 0.0f;
            }
            d6w d6wVar2 = (d6w) it.next();
            f2 = Layout.getDesiredWidth(o0yVar.b(), d6wVar2.a, d6wVar2.b, textPaint);
            while (it.hasNext()) {
                d6w d6wVar3 = (d6w) it.next();
                f2 = Math.max(f2, Layout.getDesiredWidth(o0yVar.b(), d6wVar3.a, d6wVar3.b, textPaint));
            }
        }
        o0yVar.e = f2;
        return f2;
    }

    @Override // defpackage.ec90
    public final float d() {
        return this.B.c();
    }
}
