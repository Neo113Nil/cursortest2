package xsna;

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
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import xsna.oup0;
import xsna.us2;
import xsna.v4s;
import xsna.za2;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* loaded from: classes11.dex */
public final class bb2 implements ch90 {
    public final String a;
    public final nmo0 b;
    public final List<us2.d<? extends us2.a>> c;
    public final List<us2.d<esa0>> d;
    public final v4s.a e;
    public final azl f;
    public final fd2 g;
    public final CharSequence h;
    public final hoy i;
    public ras j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code restructure failed: missing block: B:501:0x0097, code lost:
    
        if (r7 == 1) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
    /* JADX WARN: Type inference failed for: r46v0, types: [java.util.List, java.util.List<? extends xsna.us2$d<? extends xsna.us2$a>>, java.util.List<xsna.us2$d<? extends xsna.us2$a>>] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List<xsna.us2$d<? extends xsna.us2$a>>] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bb2(String str, nmo0 nmo0Var, List<? extends us2.d<? extends us2.a>> list, List<us2.d<esa0>> list2, v4s.a aVar, azl azlVar) {
        boolean booleanValue;
        Locale locale;
        int i;
        int i2;
        int size;
        int i3;
        Object obj;
        b6s b6sVar;
        u5s u5sVar;
        String str2;
        lwz lwzVar;
        vho0 vho0Var;
        zho0 zho0Var;
        long j;
        long c;
        boolean z;
        v4s v4sVar;
        vho0 vho0Var2;
        boolean z2;
        oup0 a;
        Typeface typeface;
        hik0 hik0Var;
        Collection collection;
        String str3;
        float textSize;
        nmo0 nmo0Var2;
        List<us2.d<esa0>> list3;
        azl azlVar2;
        boolean z3;
        CharSequence charSequence;
        hik0 hik0Var2;
        fh90 fh90Var;
        rua0 rua0Var;
        long j2;
        float b;
        int i4;
        iio0 iio0Var;
        float f;
        nmo0 nmo0Var3;
        ArrayList arrayList;
        int size2;
        int i5;
        Collection collection2;
        int i6;
        ArrayList arrayList2;
        int i7;
        int size3;
        boolean z4;
        int i8;
        iio0 iio0Var2;
        float f2;
        int size4;
        int i9;
        int size5;
        int i10;
        long j3;
        azl azlVar3;
        int i11;
        int i12;
        azl azlVar4;
        int i13;
        int i14;
        int i15;
        boolean z5;
        int i16;
        Spannable spannable;
        vho0 vho0Var3;
        int i17;
        long j4;
        int i18;
        yta0 yta0Var;
        yta0 yta0Var2;
        this.a = str;
        this.b = nmo0Var;
        this.c = list;
        this.d = list2;
        this.e = aVar;
        this.f = azlVar;
        float density = azlVar.getDensity();
        fd2 fd2Var = new fd2(1);
        ((TextPaint) fd2Var).density = density;
        fd2Var.b = pdo0.b;
        fd2Var.c = 3;
        fd2Var.d = v4j0.d;
        this.g = fd2Var;
        boolean a2 = cb2.a(nmo0Var);
        hik0 hik0Var3 = nmo0Var.a;
        fh90 fh90Var2 = nmo0Var.b;
        if (a2) {
            kgl kglVar = bdp.a;
            kgl kglVar2 = bdp.a;
            mtk0<Boolean> mtk0Var = kglVar2.a;
            if (mtk0Var == null) {
                if (androidx.emoji2.text.c.d()) {
                    mtk0Var = kglVar2.a();
                    kglVar2.a = mtk0Var;
                } else {
                    mtk0Var = d02.q;
                }
            }
            booleanValue = mtk0Var.getValue().booleanValue();
        } else {
            booleanValue = false;
        }
        this.k = booleanValue;
        int i19 = fh90Var2.b;
        lwz lwzVar2 = hik0Var3.k;
        if (i19 != 4) {
            if (i19 != 5) {
                if (i19 == 1) {
                    i = 0;
                } else if (i19 == 2) {
                    i = 1;
                } else {
                    if (i19 != 3 && i19 != 0) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((lwzVar2 == null || (locale = lwzVar2.c().a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                }
                this.l = i;
                ab2 ab2Var = new ab2(this);
                zjo0 zjo0Var = fh90Var2.i;
                zjo0Var = zjo0Var == null ? zjo0.c : zjo0Var;
                fd2Var.setFlags(zjo0Var.b ? fd2Var.getFlags() | 128 : fd2Var.getFlags() & (-129));
                i2 = zjo0Var.a;
                if (i2 == 1) {
                    fd2Var.setFlags(fd2Var.getFlags() | 64);
                    fd2Var.setHinting(0);
                } else if (i2 == 2) {
                    fd2Var.getFlags();
                    fd2Var.setHinting(1);
                } else if (i2 == 3) {
                    fd2Var.getFlags();
                    fd2Var.setHinting(0);
                } else {
                    fd2Var.getFlags();
                }
                size = ((Collection) list).size();
                i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        obj = null;
                        break;
                    }
                    obj = list.get(i3);
                    if (((us2.d) obj).a instanceof hik0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                boolean z6 = obj != null;
                long j5 = hik0Var3.b;
                b6sVar = hik0Var3.c;
                u5sVar = hik0Var3.d;
                str2 = hik0Var3.g;
                lwzVar = hik0Var3.k;
                vho0Var = hik0Var3.a;
                zho0Var = hik0Var3.j;
                j = hik0Var3.h;
                c = fno0.c(j5);
                z = z6;
                if (gno0.a(c, 4294967296L)) {
                    fd2Var.setTextSize(azlVar.u0(j5));
                } else if (gno0.a(c, 8589934592L)) {
                    fd2Var.setTextSize(fno0.d(j5) * fd2Var.getTextSize());
                }
                v4sVar = hik0Var3.f;
                if (v4sVar != null && u5sVar == null && b6sVar == null) {
                    vho0Var2 = vho0Var;
                    z2 = z;
                } else {
                    b6s b6sVar2 = b6sVar == null ? b6s.h : b6sVar;
                    int i20 = u5sVar != null ? u5sVar.a : 0;
                    v5s v5sVar = hik0Var3.e;
                    int i21 = v5sVar != null ? v5sVar.a : MinElf.PN_XNUM;
                    vho0Var2 = vho0Var;
                    bb2 bb2Var = ab2Var.b;
                    z2 = z;
                    a = bb2Var.e.a(v4sVar, b6sVar2, i20, i21);
                    if (a instanceof oup0.b) {
                        typeface = (Typeface) ((oup0.b) a).b;
                    } else {
                        ras rasVar = new ras(a, bb2Var.j);
                        bb2Var.j = rasVar;
                        typeface = (Typeface) rasVar.b;
                    }
                    fd2Var.setTypeface(typeface);
                }
                if (lwzVar != null) {
                    lwz lwzVar3 = lwz.d;
                    if (!lwzVar.equals(sta0.a.b())) {
                        ArrayList arrayList3 = new ArrayList(c5g.u(lwzVar, 10));
                        Iterator<kwz> it = lwzVar.b.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(it.next().a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        fd2Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    fd2Var.setFontFeatureSettings(str2);
                }
                if (zho0Var != null && !zho0Var.equals(zho0.c)) {
                    fd2Var.setTextScaleX(fd2Var.getTextScaleX() * zho0Var.a);
                    fd2Var.setTextSkewX(fd2Var.getTextSkewX() + zho0Var.b);
                }
                fd2Var.d(vho0Var2.c());
                fd2Var.c(vho0Var2.e(), 9205357640488583168L, vho0Var2.a());
                fd2Var.f(hik0Var3.n);
                fd2Var.g(hik0Var3.m);
                fd2Var.e(hik0Var3.p);
                if (!gno0.a(fno0.c(j), 4294967296L) && fno0.d(j) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float textScaleX = fd2Var.getTextScaleX() * fd2Var.getTextSize();
                    float u0 = azlVar.u0(j);
                    if (textScaleX != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        fd2Var.setLetterSpacing(u0 / textScaleX);
                    }
                } else if (gno0.a(fno0.c(j), 8589934592L)) {
                    fd2Var.setLetterSpacing(fno0.d(j));
                }
                long j6 = hik0Var3.l;
                et6 et6Var = hik0Var3.i;
                boolean z7 = (z2 || !gno0.a(fno0.c(j), 4294967296L) || fno0.d(j) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
                long j7 = l5g.k;
                boolean z8 = l5g.d(j6, j7) && !l5g.d(j6, l5g.j);
                boolean z9 = et6Var == null && Float.compare(et6Var.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0;
                hik0Var = (!z7 || z8 || z9) ? new hik0(0L, 0L, null, null, null, null, null, z7 ? j : fno0.c, z9 ? et6Var : null, null, null, z8 ? j6 : j7, null, null, 63103) : null;
                if (hik0Var != null) {
                    int size6 = this.c.size() + 1;
                    collection = new ArrayList(size6);
                    int i22 = 0;
                    while (i22 < size6) {
                        collection.add(i22 == 0 ? new us2.d<>(hik0Var, 0, this.a.length()) : this.c.get(i22 - 1));
                        i22++;
                    }
                } else {
                    collection = this.c;
                }
                str3 = this.a;
                textSize = this.g.getTextSize();
                nmo0Var2 = this.b;
                list3 = this.d;
                azlVar2 = this.f;
                z3 = this.k;
                za2.a aVar2 = za2.a;
                if (z3 || !androidx.emoji2.text.c.d()) {
                    charSequence = str3;
                } else {
                    rua0 rua0Var2 = nmo0Var2.c;
                    ydp ydpVar = (rua0Var2 == null || (yta0Var2 = rua0Var2.b) == null) ? null : new ydp(yta0Var2.b);
                    charSequence = androidx.emoji2.text.c.a().g(0, str3.length(), (ydpVar != null && ydpVar.a == 2) ? 1 : 0, str3);
                }
                if (collection.isEmpty() || !list3.isEmpty() || !epx.f(nmo0Var2.b.d, iio0.c) || (nmo0Var2.b.c & 1095216660480L) != 0) {
                    Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
                    hik0Var2 = nmo0Var2.a;
                    fh90Var = nmo0Var2.b;
                    if (epx.f(hik0Var2.m, pdo0.c)) {
                        oik0.f(spannableString, za2.a, 0, str3.length());
                    }
                    rua0Var = nmo0Var2.c;
                    if (((rua0Var != null || (yta0Var = rua0Var.b) == null) ? false : yta0Var.a) || fh90Var.f != null) {
                        t7z t7zVar = fh90Var.f;
                        t7zVar = t7zVar == null ? t7z.d : t7zVar;
                        j2 = 0;
                        b = oik0.b(fh90Var.c, textSize, azlVar2);
                        if (!Float.isNaN(b)) {
                            int length = (spannableString.length() == 0 || erm0.A0(spannableString) == '\n') ? spannableString.length() + 1 : spannableString.length();
                            int i23 = t7zVar.b;
                            i4 = 0;
                            spannableString.setSpan(new u7z(b, length, (i23 & 1) > 0, (i23 & 16) > 0, t7zVar.a, t7zVar.c), 0, spannableString.length(), 33);
                            iio0Var = fh90Var.d;
                            if (iio0Var == null) {
                                long j8 = iio0Var.a;
                                long j9 = iio0Var.b;
                                f = 0.0f;
                                nmo0Var3 = nmo0Var2;
                                if ((!fno0.b(j8, l2l0.l(i4)) || !fno0.b(j9, l2l0.l(i4))) && (j8 & 1095216660480L) != j2 && (j9 & 1095216660480L) != j2) {
                                    long c2 = fno0.c(j8);
                                    float u02 = gno0.a(c2, 4294967296L) ? azlVar2.u0(j8) : gno0.a(c2, 8589934592L) ? fno0.d(j8) * textSize : 0.0f;
                                    long c3 = fno0.c(j9);
                                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(u02), (int) Math.ceil(gno0.a(c3, 4294967296L) ? azlVar2.u0(j9) : gno0.a(c3, 8589934592L) ? fno0.d(j9) * textSize : 0.0f)), 0, spannableString.length(), 33);
                                }
                            } else {
                                f = 0.0f;
                                nmo0Var3 = nmo0Var2;
                            }
                            arrayList = new ArrayList(collection.size());
                            Collection collection3 = collection;
                            size2 = collection3.size();
                            for (i5 = 0; i5 < size2; i5++) {
                                us2.d dVar = (us2.d) collection.get(i5);
                                Object obj2 = dVar.a;
                                if (obj2 instanceof hik0) {
                                    hik0 hik0Var4 = (hik0) obj2;
                                    if (((hik0Var4.f == null && hik0Var4.d == null && hik0Var4.c == null) ? false : true) || ((hik0) obj2).e != null) {
                                        arrayList.add(dVar);
                                    }
                                }
                            }
                            hik0 hik0Var5 = nmo0Var3.a;
                            v4s v4sVar2 = hik0Var5.f;
                            hik0 hik0Var6 = ((v4sVar2 == null || hik0Var5.d != null || hik0Var5.c != null) && hik0Var5.e == null) ? null : new hik0(0L, 0L, hik0Var5.c, hik0Var5.d, hik0Var5.e, v4sVar2, null, 0L, null, null, null, 0L, null, null, 65475);
                            ip7 ip7Var = new ip7(4, spannableString, ab2Var);
                            if (arrayList.size() > 1) {
                                if (!arrayList.isEmpty()) {
                                    hik0 hik0Var7 = (hik0) ((us2.d) arrayList.get(0)).a;
                                    ip7Var.invoke(hik0Var6 != null ? hik0Var6.d(hik0Var7) : hik0Var7, Integer.valueOf(((us2.d) arrayList.get(0)).b), Integer.valueOf(((us2.d) arrayList.get(0)).c));
                                }
                                collection2 = collection3;
                            } else {
                                int i24 = 0;
                                int size7 = arrayList.size();
                                int i25 = size7 * 2;
                                int[] iArr = new int[i25];
                                int size8 = arrayList.size();
                                while (i24 < size8) {
                                    Collection collection4 = collection3;
                                    us2.d dVar2 = (us2.d) arrayList.get(i24);
                                    iArr[i24] = dVar2.b;
                                    iArr[i24 + size7] = dVar2.c;
                                    i24++;
                                    hik0Var6 = hik0Var6;
                                    collection3 = collection4;
                                }
                                collection2 = collection3;
                                hik0 hik0Var8 = hik0Var6;
                                if (i25 > 1) {
                                    Arrays.sort(iArr);
                                }
                                int K = rl3.K(iArr);
                                int i26 = 0;
                                while (i26 < i25) {
                                    int i27 = iArr[i26];
                                    if (i27 == K) {
                                        arrayList2 = arrayList;
                                        i6 = i26;
                                        i7 = i25;
                                    } else {
                                        int size9 = arrayList.size();
                                        i6 = i26;
                                        hik0 hik0Var9 = hik0Var8;
                                        int i28 = 0;
                                        while (i28 < size9) {
                                            ArrayList arrayList4 = arrayList;
                                            us2.d dVar3 = (us2.d) arrayList.get(i28);
                                            int i29 = size9;
                                            int i30 = dVar3.b;
                                            int i31 = i25;
                                            int i32 = dVar3.c;
                                            if (i30 != i32 && zs2.c(K, i27, i30, i32)) {
                                                hik0 hik0Var10 = (hik0) dVar3.a;
                                                hik0Var9 = hik0Var9 != null ? hik0Var9.d(hik0Var10) : hik0Var10;
                                            }
                                            i28++;
                                            size9 = i29;
                                            arrayList = arrayList4;
                                            i25 = i31;
                                        }
                                        arrayList2 = arrayList;
                                        i7 = i25;
                                        if (hik0Var9 != null) {
                                            ip7Var.invoke(hik0Var9, Integer.valueOf(K), Integer.valueOf(i27));
                                        }
                                        K = i27;
                                    }
                                    i26 = i6 + 1;
                                    arrayList = arrayList2;
                                    i25 = i7;
                                }
                            }
                            size3 = collection2.size();
                            z4 = false;
                            i8 = 0;
                            while (i8 < size3) {
                                us2.d dVar4 = (us2.d) collection.get(i8);
                                Object obj3 = dVar4.a;
                                if (obj3 instanceof hik0) {
                                    int i33 = dVar4.b;
                                    int i34 = dVar4.c;
                                    if (i33 >= 0 && i33 < spannableString.length() && i34 > i33 && i34 <= spannableString.length()) {
                                        hik0 hik0Var11 = (hik0) obj3;
                                        et6 et6Var2 = hik0Var11.i;
                                        long j10 = hik0Var11.h;
                                        i15 = size3;
                                        vho0 vho0Var4 = hik0Var11.a;
                                        if (et6Var2 != null) {
                                            vho0Var3 = vho0Var4;
                                            spannableString.setSpan(new ft6(et6Var2.a), i33, i34, 33);
                                        } else {
                                            vho0Var3 = vho0Var4;
                                        }
                                        boolean z10 = z4;
                                        oik0.c(spannableString, vho0Var3.c(), i33, i34);
                                        yk8 e = vho0Var3.e();
                                        float a3 = vho0Var3.a();
                                        if (e != null) {
                                            z5 = z10;
                                            if (e instanceof rek0) {
                                                oik0.c(spannableString, ((rek0) e).b, i33, i34);
                                            } else {
                                                spannableString.setSpan(new o4j0((n4j0) e, a3), i33, i34, 33);
                                            }
                                        } else {
                                            z5 = z10;
                                        }
                                        pdo0 pdo0Var = hik0Var11.m;
                                        if (pdo0Var != null) {
                                            int i35 = pdo0Var.a;
                                            i16 = i8;
                                            i17 = 33;
                                            spannableString.setSpan(new qdo0((i35 | 1) == i35, (i35 | 2) == i35), i33, i34, 33);
                                        } else {
                                            i16 = i8;
                                            i17 = 33;
                                        }
                                        oik0.d(spannableString, hik0Var11.b, azlVar2, i33, i34);
                                        spannable = spannableString;
                                        String str4 = hik0Var11.g;
                                        if (str4 != null) {
                                            spannable.setSpan(new z4s(str4), i33, i34, i17);
                                        }
                                        zho0 zho0Var2 = hik0Var11.j;
                                        if (zho0Var2 != null) {
                                            spannable.setSpan(new ScaleXSpan(zho0Var2.a), i33, i34, i17);
                                            spannable.setSpan(new ezj0(zho0Var2.b), i33, i34, i17);
                                        }
                                        oik0.e(spannable, hik0Var11.k, i33, i34);
                                        long j11 = hik0Var11.l;
                                        if (j11 != 16) {
                                            spannable.setSpan(new BackgroundColorSpan(f870.H(j11)), i33, i34, i17);
                                        }
                                        v4j0 v4j0Var = hik0Var11.n;
                                        if (v4j0Var != null) {
                                            long j12 = v4j0Var.b;
                                            j4 = j10;
                                            int H = f870.H(v4j0Var.a);
                                            float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
                                            float f3 = v4j0Var.c;
                                            d5j0 d5j0Var = new d5j0(intBitsToFloat, intBitsToFloat2, f3 == f ? Float.MIN_VALUE : f3, H);
                                            i18 = 33;
                                            spannable.setSpan(d5j0Var, i33, i34, 33);
                                        } else {
                                            j4 = j10;
                                            i18 = i17;
                                        }
                                        qio qioVar = hik0Var11.p;
                                        if (qioVar != null) {
                                            spannable.setSpan(new rio(qioVar), i33, i34, i18);
                                        }
                                        if (gno0.a(fno0.c(j4), 4294967296L) || gno0.a(fno0.c(j4), 8589934592L)) {
                                            z4 = true;
                                            spannableString = spannable;
                                            i8 = i16 + 1;
                                            size3 = i15;
                                        }
                                        z4 = z5;
                                        spannableString = spannable;
                                        i8 = i16 + 1;
                                        size3 = i15;
                                    }
                                }
                                i15 = size3;
                                z5 = z4;
                                i16 = i8;
                                spannable = spannableString;
                                z4 = z5;
                                spannableString = spannable;
                                i8 = i16 + 1;
                                size3 = i15;
                            }
                            Spannable spannable2 = spannableString;
                            if (z4) {
                                int size10 = collection2.size();
                                int i36 = 0;
                                while (i36 < size10) {
                                    us2.d dVar5 = (us2.d) collection.get(i36);
                                    us2.a aVar3 = (us2.a) dVar5.a;
                                    if (aVar3 instanceof hik0) {
                                        int i37 = dVar5.b;
                                        int i38 = dVar5.c;
                                        if (i37 >= 0 && i37 < spannable2.length() && i38 > i37 && i38 <= spannable2.length()) {
                                            long j13 = ((hik0) aVar3).h;
                                            long c4 = fno0.c(j13);
                                            i13 = size10;
                                            i14 = i36;
                                            Object l2zVar = gno0.a(c4, 4294967296L) ? new l2z(azlVar2.u0(j13)) : gno0.a(c4, 8589934592L) ? new k2z(fno0.d(j13)) : null;
                                            if (l2zVar != null) {
                                                spannable2.setSpan(l2zVar, i37, i38, 33);
                                            }
                                            i36 = i14 + 1;
                                            size10 = i13;
                                        }
                                    }
                                    i13 = size10;
                                    i14 = i36;
                                    i36 = i14 + 1;
                                    size10 = i13;
                                }
                            }
                            iio0Var2 = fh90Var.d;
                            if (iio0Var2 == null) {
                                long j14 = iio0Var2.a;
                                long c5 = fno0.c(j14);
                                f2 = gno0.a(c5, 4294967296L) ? azlVar2.u0(j14) : gno0.a(c5, 8589934592L) ? fno0.d(j14) * textSize : f;
                            } else {
                                f2 = f;
                            }
                            size4 = collection2.size();
                            for (i9 = 0; i9 < size4; i9++) {
                                us2.d dVar6 = (us2.d) collection.get(i9);
                                Object obj4 = dVar6.a;
                                yn8 yn8Var = obj4 instanceof yn8 ? (yn8) obj4 : null;
                                if (yn8Var != null) {
                                    float a4 = oik0.a(yn8Var.b, textSize, azlVar2);
                                    float a5 = oik0.a(yn8Var.c, textSize, azlVar2);
                                    float a6 = oik0.a(yn8Var.d, textSize, azlVar2);
                                    if (!Float.isNaN(a4) && !Float.isNaN(a5) && !Float.isNaN(a6)) {
                                        oik0.f(spannable2, new pmk(yn8Var.a, a4, a5, a6, yn8Var.e, yn8Var.f, azlVar2, f2), dVar6.b, dVar6.c);
                                    }
                                }
                            }
                            size5 = list3.size();
                            i10 = 0;
                            while (i10 < size5) {
                                us2.d<esa0> dVar7 = list3.get(i10);
                                esa0 esa0Var = dVar7.a;
                                int i39 = dVar7.b;
                                int i40 = dVar7.c;
                                for (Object obj5 : spannable2.getSpans(i39, i40, xdp.class)) {
                                    spannable2.removeSpan((xdp) obj5);
                                }
                                long j15 = esa0Var.a;
                                long j16 = esa0Var.b;
                                float d = fno0.d(j15);
                                int i41 = size5;
                                int i42 = i10;
                                long c6 = fno0.c(esa0Var.a);
                                List<us2.d<esa0>> list4 = list3;
                                if (gno0.a(c6, 4294967296L)) {
                                    azlVar3 = azlVar2;
                                    j3 = 8589934592L;
                                    i11 = 0;
                                } else {
                                    j3 = 8589934592L;
                                    if (gno0.a(c6, 8589934592L)) {
                                        azlVar3 = azlVar2;
                                        i11 = 1;
                                    } else {
                                        azlVar3 = azlVar2;
                                        i11 = 2;
                                    }
                                }
                                float d2 = fno0.d(j16);
                                long c7 = fno0.c(j16);
                                int i43 = gno0.a(c7, 4294967296L) ? 0 : gno0.a(c7, j3) ? 1 : 2;
                                int i44 = esa0Var.c;
                                if (i44 == 1) {
                                    azlVar4 = azlVar3;
                                    i12 = 0;
                                } else if (i44 == 2) {
                                    i12 = 1;
                                    azlVar4 = azlVar3;
                                } else if (i44 == 3) {
                                    i12 = 2;
                                    azlVar4 = azlVar3;
                                } else {
                                    i12 = 4;
                                    if (i44 == 4) {
                                        i12 = 3;
                                    } else if (i44 != 5) {
                                        if (i44 == 6) {
                                            azlVar4 = azlVar3;
                                            i12 = 5;
                                        } else {
                                            if (i44 != 7) {
                                                throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                                            }
                                            azlVar4 = azlVar3;
                                            i12 = 6;
                                        }
                                        qsa0 qsa0Var = new qsa0(d, i11, d2, i43, azlVar4, i12);
                                        azlVar2 = azlVar4;
                                        spannable2.setSpan(qsa0Var, i39, i40, 33);
                                        size5 = i41;
                                        i10 = i42 + 1;
                                        list3 = list4;
                                    }
                                    azlVar4 = azlVar3;
                                    qsa0 qsa0Var2 = new qsa0(d, i11, d2, i43, azlVar4, i12);
                                    azlVar2 = azlVar4;
                                    spannable2.setSpan(qsa0Var2, i39, i40, 33);
                                    size5 = i41;
                                    i10 = i42 + 1;
                                    list3 = list4;
                                }
                                qsa0 qsa0Var22 = new qsa0(d, i11, d2, i43, azlVar4, i12);
                                azlVar2 = azlVar4;
                                spannable2.setSpan(qsa0Var22, i39, i40, 33);
                                size5 = i41;
                                i10 = i42 + 1;
                                list3 = list4;
                            }
                            charSequence = spannable2;
                        }
                    } else {
                        float b2 = oik0.b(fh90Var.c, textSize, azlVar2);
                        if (!Float.isNaN(b2)) {
                            spannableString.setSpan(new s7z(b2), 0, spannableString.length(), 33);
                        }
                        j2 = 0;
                    }
                    i4 = 0;
                    iio0Var = fh90Var.d;
                    if (iio0Var == null) {
                    }
                    arrayList = new ArrayList(collection.size());
                    Collection collection32 = collection;
                    size2 = collection32.size();
                    while (i5 < size2) {
                    }
                    hik0 hik0Var52 = nmo0Var3.a;
                    v4s v4sVar22 = hik0Var52.f;
                    if (v4sVar22 == null || hik0Var52.d != null || hik0Var52.c != null) {
                    }
                    ip7 ip7Var2 = new ip7(4, spannableString, ab2Var);
                    if (arrayList.size() > 1) {
                    }
                    size3 = collection2.size();
                    z4 = false;
                    i8 = 0;
                    while (i8 < size3) {
                    }
                    Spannable spannable22 = spannableString;
                    if (z4) {
                    }
                    iio0Var2 = fh90Var.d;
                    if (iio0Var2 == null) {
                    }
                    size4 = collection2.size();
                    while (i9 < size4) {
                    }
                    size5 = list3.size();
                    i10 = 0;
                    while (i10 < size5) {
                    }
                    charSequence = spannable22;
                }
                this.h = charSequence;
                this.i = new hoy(this.l, this.g, charSequence);
            }
            i = 3;
            this.l = i;
            ab2 ab2Var2 = new ab2(this);
            zjo0 zjo0Var2 = fh90Var2.i;
            if (zjo0Var2 == null) {
            }
            fd2Var.setFlags(zjo0Var2.b ? fd2Var.getFlags() | 128 : fd2Var.getFlags() & (-129));
            i2 = zjo0Var2.a;
            if (i2 == 1) {
            }
            size = ((Collection) list).size();
            i3 = 0;
            while (true) {
                if (i3 >= size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j52 = hik0Var3.b;
            b6sVar = hik0Var3.c;
            u5sVar = hik0Var3.d;
            str2 = hik0Var3.g;
            lwzVar = hik0Var3.k;
            vho0Var = hik0Var3.a;
            zho0Var = hik0Var3.j;
            j = hik0Var3.h;
            c = fno0.c(j52);
            z = z6;
            if (gno0.a(c, 4294967296L)) {
            }
            v4sVar = hik0Var3.f;
            if (v4sVar != null) {
            }
            if (b6sVar == null) {
            }
            if (u5sVar != null) {
            }
            v5s v5sVar2 = hik0Var3.e;
            if (v5sVar2 != null) {
            }
            vho0Var2 = vho0Var;
            bb2 bb2Var2 = ab2Var2.b;
            z2 = z;
            a = bb2Var2.e.a(v4sVar, b6sVar2, i20, i21);
            if (a instanceof oup0.b) {
            }
            fd2Var.setTypeface(typeface);
            if (lwzVar != null) {
            }
            if (str2 != null) {
                fd2Var.setFontFeatureSettings(str2);
            }
            if (zho0Var != null) {
                fd2Var.setTextScaleX(fd2Var.getTextScaleX() * zho0Var.a);
                fd2Var.setTextSkewX(fd2Var.getTextSkewX() + zho0Var.b);
            }
            fd2Var.d(vho0Var2.c());
            fd2Var.c(vho0Var2.e(), 9205357640488583168L, vho0Var2.a());
            fd2Var.f(hik0Var3.n);
            fd2Var.g(hik0Var3.m);
            fd2Var.e(hik0Var3.p);
            if (!gno0.a(fno0.c(j), 4294967296L)) {
            }
            if (gno0.a(fno0.c(j), 8589934592L)) {
            }
            long j62 = hik0Var3.l;
            et6 et6Var3 = hik0Var3.i;
            if (z2) {
            }
            long j72 = l5g.k;
            if (l5g.d(j62, j72)) {
            }
            if (et6Var3 == null) {
            }
            if (z7) {
            }
            if (hik0Var != null) {
            }
            str3 = this.a;
            textSize = this.g.getTextSize();
            nmo0Var2 = this.b;
            list3 = this.d;
            azlVar2 = this.f;
            z3 = this.k;
            za2.a aVar22 = za2.a;
            if (z3) {
            }
            charSequence = str3;
            if (collection.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            hik0Var2 = nmo0Var2.a;
            fh90Var = nmo0Var2.b;
            if (epx.f(hik0Var2.m, pdo0.c)) {
            }
            rua0Var = nmo0Var2.c;
            if ((rua0Var != null || (yta0Var = rua0Var.b) == null) ? false : yta0Var.a) {
            }
            t7z t7zVar2 = fh90Var.f;
            if (t7zVar2 == null) {
            }
            j2 = 0;
            b = oik0.b(fh90Var.c, textSize, azlVar2);
            if (!Float.isNaN(b)) {
            }
            i4 = 0;
            iio0Var = fh90Var.d;
            if (iio0Var == null) {
            }
            arrayList = new ArrayList(collection.size());
            Collection collection322 = collection;
            size2 = collection322.size();
            while (i5 < size2) {
            }
            hik0 hik0Var522 = nmo0Var3.a;
            v4s v4sVar222 = hik0Var522.f;
            if (v4sVar222 == null || hik0Var522.d != null || hik0Var522.c != null) {
            }
            ip7 ip7Var22 = new ip7(4, spannableString, ab2Var2);
            if (arrayList.size() > 1) {
            }
            size3 = collection2.size();
            z4 = false;
            i8 = 0;
            while (i8 < size3) {
            }
            Spannable spannable222 = spannableString;
            if (z4) {
            }
            iio0Var2 = fh90Var.d;
            if (iio0Var2 == null) {
            }
            size4 = collection2.size();
            while (i9 < size4) {
            }
            size5 = list3.size();
            i10 = 0;
            while (i10 < size5) {
            }
            charSequence = spannable222;
            this.h = charSequence;
            this.i = new hoy(this.l, this.g, charSequence);
        }
        i = 2;
        this.l = i;
        ab2 ab2Var22 = new ab2(this);
        zjo0 zjo0Var22 = fh90Var2.i;
        if (zjo0Var22 == null) {
        }
        fd2Var.setFlags(zjo0Var22.b ? fd2Var.getFlags() | 128 : fd2Var.getFlags() & (-129));
        i2 = zjo0Var22.a;
        if (i2 == 1) {
        }
        size = ((Collection) list).size();
        i3 = 0;
        while (true) {
            if (i3 >= size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j522 = hik0Var3.b;
        b6sVar = hik0Var3.c;
        u5sVar = hik0Var3.d;
        str2 = hik0Var3.g;
        lwzVar = hik0Var3.k;
        vho0Var = hik0Var3.a;
        zho0Var = hik0Var3.j;
        j = hik0Var3.h;
        c = fno0.c(j522);
        z = z6;
        if (gno0.a(c, 4294967296L)) {
        }
        v4sVar = hik0Var3.f;
        if (v4sVar != null) {
        }
        if (b6sVar == null) {
        }
        if (u5sVar != null) {
        }
        v5s v5sVar22 = hik0Var3.e;
        if (v5sVar22 != null) {
        }
        vho0Var2 = vho0Var;
        bb2 bb2Var22 = ab2Var22.b;
        z2 = z;
        a = bb2Var22.e.a(v4sVar, b6sVar2, i20, i21);
        if (a instanceof oup0.b) {
        }
        fd2Var.setTypeface(typeface);
        if (lwzVar != null) {
        }
        if (str2 != null) {
        }
        if (zho0Var != null) {
        }
        fd2Var.d(vho0Var2.c());
        fd2Var.c(vho0Var2.e(), 9205357640488583168L, vho0Var2.a());
        fd2Var.f(hik0Var3.n);
        fd2Var.g(hik0Var3.m);
        fd2Var.e(hik0Var3.p);
        if (!gno0.a(fno0.c(j), 4294967296L)) {
        }
        if (gno0.a(fno0.c(j), 8589934592L)) {
        }
        long j622 = hik0Var3.l;
        et6 et6Var32 = hik0Var3.i;
        if (z2) {
        }
        long j722 = l5g.k;
        if (l5g.d(j622, j722)) {
        }
        if (et6Var32 == null) {
        }
        if (z7) {
        }
        if (hik0Var != null) {
        }
        str3 = this.a;
        textSize = this.g.getTextSize();
        nmo0Var2 = this.b;
        list3 = this.d;
        azlVar2 = this.f;
        z3 = this.k;
        za2.a aVar222 = za2.a;
        if (z3) {
        }
        charSequence = str3;
        if (collection.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        hik0Var2 = nmo0Var2.a;
        fh90Var = nmo0Var2.b;
        if (epx.f(hik0Var2.m, pdo0.c)) {
        }
        rua0Var = nmo0Var2.c;
        if ((rua0Var != null || (yta0Var = rua0Var.b) == null) ? false : yta0Var.a) {
        }
        t7z t7zVar22 = fh90Var.f;
        if (t7zVar22 == null) {
        }
        j2 = 0;
        b = oik0.b(fh90Var.c, textSize, azlVar2);
        if (!Float.isNaN(b)) {
        }
        i4 = 0;
        iio0Var = fh90Var.d;
        if (iio0Var == null) {
        }
        arrayList = new ArrayList(collection.size());
        Collection collection3222 = collection;
        size2 = collection3222.size();
        while (i5 < size2) {
        }
        hik0 hik0Var5222 = nmo0Var3.a;
        v4s v4sVar2222 = hik0Var5222.f;
        if (v4sVar2222 == null || hik0Var5222.d != null || hik0Var5222.c != null) {
        }
        ip7 ip7Var222 = new ip7(4, spannableString, ab2Var22);
        if (arrayList.size() > 1) {
        }
        size3 = collection2.size();
        z4 = false;
        i8 = 0;
        while (i8 < size3) {
        }
        Spannable spannable2222 = spannableString;
        if (z4) {
        }
        iio0Var2 = fh90Var.d;
        if (iio0Var2 == null) {
        }
        size4 = collection2.size();
        while (i9 < size4) {
        }
        size5 = list3.size();
        i10 = 0;
        while (i10 < size5) {
        }
        charSequence = spannable2222;
        this.h = charSequence;
        this.i = new hoy(this.l, this.g, charSequence);
    }

    @Override // xsna.ch90
    public final float a() {
        return this.i.c();
    }

    @Override // xsna.ch90
    public final boolean b() {
        ras rasVar = this.j;
        if (rasVar != null ? rasVar.b() : false) {
            return true;
        }
        if (!this.k && cb2.a(this.b)) {
            kgl kglVar = bdp.a;
            kgl kglVar2 = bdp.a;
            mtk0<Boolean> mtk0Var = kglVar2.a;
            if (mtk0Var == null) {
                if (androidx.emoji2.text.c.d()) {
                    mtk0Var = kglVar2.a();
                    kglVar2.a = mtk0Var;
                } else {
                    mtk0Var = d02.q;
                }
            }
            if (mtk0Var.getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.ch90
    public final float c() {
        float f;
        hoy hoyVar = this.i;
        float f2 = hoyVar.e;
        TextPaint textPaint = hoyVar.b;
        if (!Float.isNaN(f2)) {
            return hoyVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = hoyVar.a;
        lineInstance.setText(new xlb(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, egi.e);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new k9x(i, next, 1));
            } else {
                k9x k9xVar = (k9x) priorityQueue.peek();
                if (k9xVar != null && k9xVar.c - k9xVar.b < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new k9x(i, next, 1));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            k9x k9xVar2 = (k9x) it.next();
            float desiredWidth = Layout.getDesiredWidth(hoyVar.b(), k9xVar2.b, k9xVar2.c, textPaint);
            while (it.hasNext()) {
                k9x k9xVar3 = (k9x) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(hoyVar.b(), k9xVar3.b, k9xVar3.c, textPaint));
            }
            f = desiredWidth;
        }
        hoyVar.e = f;
        return f;
    }
}
