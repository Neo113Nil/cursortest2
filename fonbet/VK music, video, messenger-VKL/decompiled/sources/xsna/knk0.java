package xsna;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.a1n0;
import xsna.lnk0;
import xsna.rkk;

/* compiled from: SsaParser.java */
/* loaded from: classes12.dex */
public final class knk0 implements a1n0 {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;

    @Nullable
    public final jnk0 b;
    public LinkedHashMap d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final xi90 c = new xi90();

    public knk0(@Nullable List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String r = y2r0.r(list.get(0));
        fxc0.p(r.startsWith("Format:"));
        jnk0 a = jnk0.a(r);
        a.getClass();
        this.b = a;
        e(new xi90(list.get(1)), StandardCharsets.UTF_8);
    }

    public static int d(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long f(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String group = matcher.group(1);
        String str2 = y2r0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    @Override // xsna.a1n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i, int i2, a1n0.b bVar, j7j<wkk> j7jVar) {
        Charset charset;
        long j;
        jnk0 jnk0Var;
        xi90 xi90Var;
        int parseInt;
        long f;
        float f2;
        float f3;
        float f4;
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        float f5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        knk0 knk0Var = this;
        long j2 = bVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xi90 xi90Var2 = knk0Var.c;
        xi90Var2.N(bArr, i + i2);
        xi90Var2.P(i);
        Charset L = xi90Var2.L();
        if (L == null) {
            L = StandardCharsets.UTF_8;
        }
        boolean z2 = knk0Var.a;
        if (!z2) {
            knk0Var.e(xi90Var2, L);
        }
        jnk0 jnk0Var2 = z2 ? knk0Var.b : null;
        while (true) {
            String q = xi90Var2.q(L);
            if (q == null) {
                long j3 = j2;
                ArrayList arrayList3 = (j3 == C.TIME_UNSET || !bVar.b) ? null : new ArrayList();
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    List list = (List) arrayList.get(i12);
                    if (!list.isEmpty() || i12 == 0) {
                        if (i12 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long longValue = ((Long) arrayList2.get(i12)).longValue();
                        long longValue2 = ((Long) arrayList2.get(i12 + 1)).longValue();
                        wkk wkkVar = new wkk(list, longValue, longValue2 - longValue);
                        if (j3 == C.TIME_UNSET || longValue2 >= j3) {
                            j7jVar.accept(wkkVar);
                        } else if (arrayList3 != null) {
                            arrayList3.add(wkkVar);
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        j7jVar.accept((wkk) it.next());
                    }
                    return;
                }
                return;
            }
            if (q.startsWith("Format:")) {
                jnk0Var2 = jnk0.a(q);
            } else {
                if (q.startsWith("Dialogue:")) {
                    if (jnk0Var2 == null) {
                        ahn.F("Skipping dialogue line before complete format: ".concat(q));
                    } else {
                        int i13 = jnk0Var2.f;
                        fxc0.p(q.startsWith("Dialogue:"));
                        String substring = q.substring(9);
                        int i14 = jnk0Var2.a;
                        String[] split = substring.split(StringUtils.COMMA, i13);
                        if (split.length != i13) {
                            ahn.F("Skipping dialogue line with fewer columns than format: ".concat(q));
                        } else {
                            if (i14 != -1) {
                                try {
                                    parseInt = Integer.parseInt(split[i14].trim());
                                } catch (RuntimeException unused) {
                                    ahn.F("Fail to parse layer: " + split[i14]);
                                }
                                f = f(split[jnk0Var2.b]);
                                if (f != C.TIME_UNSET) {
                                    ahn.F("Skipping invalid timing: ".concat(q));
                                } else {
                                    charset = L;
                                    j = j2;
                                    long f6 = f(split[jnk0Var2.c]);
                                    if (f6 == C.TIME_UNSET || f6 <= f) {
                                        jnk0Var = jnk0Var2;
                                        xi90Var = xi90Var2;
                                        ahn.F("Skipping invalid timing: ".concat(q));
                                    } else {
                                        LinkedHashMap linkedHashMap = knk0Var.d;
                                        lnk0 lnk0Var = (linkedHashMap == null || (i11 = jnk0Var2.d) == -1) ? null : (lnk0) linkedHashMap.get(split[i11].trim());
                                        String str = split[jnk0Var2.e];
                                        Matcher matcher = lnk0.b.a.matcher(str);
                                        jnk0Var = jnk0Var2;
                                        PointF pointF = null;
                                        int i15 = -1;
                                        while (matcher.find()) {
                                            xi90 xi90Var3 = xi90Var2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a = lnk0.b.a(group);
                                                if (a != null) {
                                                    pointF = a;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            try {
                                                Matcher matcher2 = lnk0.b.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i10 = lnk0.a(group2);
                                                } else {
                                                    i10 = -1;
                                                }
                                                if (i10 != -1) {
                                                    i15 = i10;
                                                }
                                            } catch (RuntimeException unused3) {
                                            }
                                            xi90Var2 = xi90Var3;
                                        }
                                        xi90Var = xi90Var2;
                                        String replace = lnk0.b.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f7 = knk0Var.e;
                                        float f8 = knk0Var.f;
                                        SpannableString spannableString = new SpannableString(replace);
                                        rkk.a aVar = new rkk.a();
                                        aVar.a = spannableString;
                                        aVar.b = null;
                                        aVar.r = parseInt;
                                        if (lnk0Var != null) {
                                            f4 = -3.4028235E38f;
                                            boolean z3 = lnk0Var.g;
                                            Integer num = lnk0Var.d;
                                            Integer num2 = lnk0Var.c;
                                            if (num2 != null) {
                                                f2 = f7;
                                                f3 = f8;
                                                z = z3;
                                                i6 = 0;
                                                i7 = 33;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                f2 = f7;
                                                f3 = f8;
                                                z = z3;
                                                i6 = 0;
                                                i7 = 33;
                                            }
                                            if (lnk0Var.j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i6, spannableString.length(), i7);
                                            }
                                            float f9 = lnk0Var.e;
                                            if (f9 != -3.4028235E38f && f3 != -3.4028235E38f) {
                                                aVar.k = f9 / f3;
                                                aVar.j = 1;
                                            }
                                            boolean z4 = lnk0Var.f;
                                            if (z4 && z) {
                                                i8 = 0;
                                                i9 = 33;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i8 = 0;
                                                i9 = 33;
                                                if (z4) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (lnk0Var.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i8, spannableString.length(), i9);
                                            }
                                            if (lnk0Var.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i8, spannableString.length(), i9);
                                            }
                                        } else {
                                            f2 = f7;
                                            f3 = f8;
                                            f4 = -3.4028235E38f;
                                        }
                                        if (i15 == -1) {
                                            i15 = lnk0Var != null ? lnk0Var.b : -1;
                                        }
                                        switch (i15) {
                                            case 0:
                                            default:
                                                sn.d(i15, "Unknown alignment: ");
                                            case -1:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        aVar.c = alignment;
                                        int i16 = Integer.MIN_VALUE;
                                        switch (i15) {
                                            case 0:
                                            default:
                                                sn.d(i15, "Unknown alignment: ");
                                            case -1:
                                                i3 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i3 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i3 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i3 = 2;
                                                break;
                                        }
                                        aVar.i = i3;
                                        switch (i15) {
                                            case -1:
                                                break;
                                            case 0:
                                            default:
                                                sn.d(i15, "Unknown alignment: ");
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i16 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i16 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i16 = 0;
                                                break;
                                        }
                                        aVar.g = i16;
                                        if (pointF == null || f3 == f4 || f2 == f4) {
                                            int i17 = aVar.i;
                                            if (i17 != 0) {
                                                i4 = 1;
                                                if (i17 != 1) {
                                                    i5 = 2;
                                                    f5 = i17 != 2 ? f4 : 0.95f;
                                                } else {
                                                    i5 = 2;
                                                    f5 = 0.5f;
                                                }
                                            } else {
                                                i4 = 1;
                                                i5 = 2;
                                                f5 = 0.05f;
                                            }
                                            aVar.h = f5;
                                            aVar.e = i16 != 0 ? i16 != i4 ? i16 != i5 ? f4 : 0.95f : 0.5f : 0.05f;
                                            aVar.f = 0;
                                        } else {
                                            aVar.h = pointF.x / f2;
                                            aVar.e = pointF.y / f3;
                                            aVar.f = 0;
                                        }
                                        rkk a2 = aVar.a();
                                        int d = d(f6, arrayList2, arrayList);
                                        for (int d2 = d(f, arrayList2, arrayList); d2 < d; d2++) {
                                            ((List) arrayList.get(d2)).add(a2);
                                        }
                                    }
                                    knk0Var = this;
                                    L = charset;
                                    j2 = j;
                                    jnk0Var2 = jnk0Var;
                                    xi90Var2 = xi90Var;
                                }
                            }
                            parseInt = 0;
                            f = f(split[jnk0Var2.b]);
                            if (f != C.TIME_UNSET) {
                            }
                        }
                    }
                }
                charset = L;
                j = j2;
                jnk0Var = jnk0Var2;
                xi90Var = xi90Var2;
                knk0Var = this;
                L = charset;
                j2 = j;
                jnk0Var2 = jnk0Var;
                xi90Var2 = xi90Var;
            }
        }
    }

    @Override // xsna.a1n0
    public final int b() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(xi90 xi90Var, Charset charset) {
        int i;
        lnk0 lnk0Var;
        while (true) {
            String q = xi90Var.q(charset);
            if (q == null) {
                return;
            }
            int i2 = 2;
            int i3 = 0;
            if ("[Script Info]".equalsIgnoreCase(q)) {
                while (true) {
                    String q2 = xi90Var.q(charset);
                    if (q2 == null) {
                        break;
                    }
                    if (xi90Var.a() != 0) {
                        if ((xi90Var.k(charset) != 0 ? ipx.s(r2 >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] split = q2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (split.length == 2) {
                        String u = o19.u(split[0].trim());
                        u.getClass();
                        if (u.equals("playresx")) {
                            this.e = Float.parseFloat(split[1].trim());
                        } else if (u.equals("playresy")) {
                            try {
                                this.f = Float.parseFloat(split[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(q)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    lnk0.a aVar = null;
                    while (true) {
                        String q3 = xi90Var.q(charset);
                        if (q3 != null) {
                            if (xi90Var.a() != 0) {
                                if ((xi90Var.k(charset) != 0 ? ipx.s(r0 >>> 8) : 1114112) == 91) {
                                }
                            }
                            int i4 = -1;
                            if (q3.startsWith("Format:")) {
                                String[] split2 = TextUtils.split(q3.substring(7), StringUtils.COMMA);
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = i3; i15 < split2.length; i15++) {
                                    String u2 = o19.u(split2[i15].trim());
                                    u2.getClass();
                                    switch (u2.hashCode()) {
                                        case -1178781136:
                                            if (u2.equals(TtmlNode.ITALIC)) {
                                                i = i3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -1026963764:
                                            if (u2.equals(TtmlNode.UNDERLINE)) {
                                                i = 1;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -192095652:
                                            if (u2.equals("strikeout")) {
                                                i = i2;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case -70925746:
                                            if (u2.equals("primarycolour")) {
                                                i = 3;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3029637:
                                            if (u2.equals(TtmlNode.BOLD)) {
                                                i = 4;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 3373707:
                                            if (u2.equals("name")) {
                                                i = 5;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 366554320:
                                            if (u2.equals("fontsize")) {
                                                i = 6;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 767321349:
                                            if (u2.equals("borderstyle")) {
                                                i = 7;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1767875043:
                                            if (u2.equals("alignment")) {
                                                i = 8;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        case 1988365454:
                                            if (u2.equals("outlinecolour")) {
                                                i = 9;
                                                break;
                                            }
                                            i = -1;
                                            break;
                                        default:
                                            i = -1;
                                            break;
                                    }
                                    switch (i) {
                                        case 0:
                                            i11 = i15;
                                            break;
                                        case 1:
                                            i12 = i15;
                                            break;
                                        case 2:
                                            i13 = i15;
                                            break;
                                        case 3:
                                            i7 = i15;
                                            break;
                                        case 4:
                                            i10 = i15;
                                            break;
                                        case 5:
                                            i5 = i15;
                                            break;
                                        case 6:
                                            i9 = i15;
                                            break;
                                        case 7:
                                            i14 = i15;
                                            break;
                                        case 8:
                                            i6 = i15;
                                            break;
                                        case 9:
                                            i8 = i15;
                                            break;
                                    }
                                }
                                if (i5 != -1) {
                                    aVar = new lnk0.a(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, split2.length);
                                }
                            } else {
                                if (q3.startsWith("Style:")) {
                                    if (aVar == null) {
                                        ahn.F("Skipping 'Style:' line before 'Format:' line: ".concat(q3));
                                    } else {
                                        fxc0.p(q3.startsWith("Style:"));
                                        String[] split3 = TextUtils.split(q3.substring(6), StringUtils.COMMA);
                                        int length = split3.length;
                                        int i16 = aVar.k;
                                        if (length != i16) {
                                            int length2 = split3.length;
                                            String str = y2r0.a;
                                            Locale locale = Locale.US;
                                            StringBuilder a = odj.a(i16, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                            a.append(q3);
                                            a.append("'");
                                            ahn.F(a.toString());
                                        } else {
                                            try {
                                                String trim = split3[aVar.a].trim();
                                                int i17 = aVar.b;
                                                int a2 = i17 != -1 ? lnk0.a(split3[i17].trim()) : -1;
                                                int i18 = aVar.c;
                                                Integer c = i18 != -1 ? lnk0.c(split3[i18].trim()) : null;
                                                int i19 = aVar.d;
                                                Integer c2 = i19 != -1 ? lnk0.c(split3[i19].trim()) : null;
                                                int i20 = aVar.e;
                                                float f = -3.4028235E38f;
                                                if (i20 != -1) {
                                                    String trim2 = split3[i20].trim();
                                                    try {
                                                        f = Float.parseFloat(trim2);
                                                    } catch (NumberFormatException e) {
                                                        ahn.G("Failed to parse font size: '" + trim2 + "'", e);
                                                    }
                                                }
                                                float f2 = f;
                                                int i21 = aVar.f;
                                                boolean z = i21 != -1 && lnk0.b(split3[i21].trim());
                                                int i22 = aVar.g;
                                                boolean z2 = i22 != -1 && lnk0.b(split3[i22].trim());
                                                int i23 = aVar.h;
                                                boolean z3 = i23 != -1 && lnk0.b(split3[i23].trim());
                                                int i24 = aVar.i;
                                                boolean z4 = i24 != -1 && lnk0.b(split3[i24].trim());
                                                int i25 = aVar.j;
                                                if (i25 != -1) {
                                                    String trim3 = split3[i25].trim();
                                                    try {
                                                        int parseInt = Integer.parseInt(trim3.trim());
                                                        if (parseInt == 1 || parseInt == 3) {
                                                            i4 = parseInt;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    ahn.F("Ignoring unknown BorderStyle: " + trim3);
                                                }
                                                lnk0Var = new lnk0(trim, a2, c, c2, f2, z, z2, z3, z4, i4);
                                            } catch (RuntimeException e2) {
                                                ahn.G("Skipping malformed 'Style:' line: '" + q3 + "'", e2);
                                            }
                                            if (lnk0Var != null) {
                                                linkedHashMap.put(lnk0Var.a, lnk0Var);
                                            }
                                        }
                                        lnk0Var = null;
                                        if (lnk0Var != null) {
                                        }
                                    }
                                }
                                i2 = 2;
                                i3 = 0;
                            }
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(q)) {
                ahn.u("[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(q)) {
                return;
            }
        }
    }
}
