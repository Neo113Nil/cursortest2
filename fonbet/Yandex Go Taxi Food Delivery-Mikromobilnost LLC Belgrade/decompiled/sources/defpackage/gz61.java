package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class gz61 extends zt71 {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final vxt0 n;
    public LinkedHashMap o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public gz61(List list) {
        if (list == null || list.isEmpty()) {
            this.m = false;
            this.n = null;
            return;
        }
        this.m = true;
        byte[] bArr = (byte[]) list.get(0);
        int i = rf71.a;
        String str = new String(bArr, md81.c);
        if (!str.startsWith("Format:")) {
            w511.q();
            throw null;
        }
        vxt0 a = vxt0.a(str);
        a.getClass();
        this.n = a;
        h(new dl81((byte[]) list.get(1)));
    }

    public static int f(long j, ArrayList arrayList, ArrayList arrayList2) {
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

    public static long g(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = rf71.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00e1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0290 A[LOOP:2: B:112:0x028e->B:113:0x0290, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[SYNTHETIC] */
    @Override // defpackage.zt71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fh81 c(int i, byte[] bArr, boolean z) {
        dl81 dl81Var;
        vxt0 vxt0Var;
        int i2;
        int i3;
        float f;
        Layout.Alignment alignment;
        int i4;
        float f2;
        float f3;
        int f4;
        int f5;
        boolean z2;
        int i5;
        int i6;
        int i7;
        float f6;
        float f7;
        int i8;
        int i9;
        Matcher matcher;
        int i10;
        int i11;
        gz61 gz61Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        dl81 dl81Var2 = new dl81(bArr, i);
        boolean z3 = gz61Var.m;
        if (!z3) {
            gz61Var.h(dl81Var2);
        }
        vxt0 vxt0Var2 = z3 ? gz61Var.n : null;
        while (true) {
            String f8 = dl81Var2.f();
            if (f8 == null) {
                return new rr41(22, arrayList, arrayList2);
            }
            if (f8.startsWith("Format:")) {
                vxt0Var2 = vxt0.a(f8);
            } else {
                if (f8.startsWith("Dialogue:")) {
                    if (vxt0Var2 == null) {
                        nba1.e();
                    } else {
                        int i12 = vxt0Var2.e;
                        if (!f8.startsWith("Dialogue:")) {
                            w511.q();
                            return null;
                        }
                        String[] split = f8.substring(9).split(",", i12);
                        if (split.length != i12) {
                            nba1.e();
                        } else {
                            long g = g(split[vxt0Var2.a]);
                            if (g == -9223372036854775807L) {
                                nba1.e();
                            } else {
                                long g2 = g(split[vxt0Var2.b]);
                                if (g2 == -9223372036854775807L) {
                                    nba1.e();
                                } else {
                                    LinkedHashMap linkedHashMap = gz61Var.o;
                                    sb71 sb71Var = (linkedHashMap == null || (i11 = vxt0Var2.c) == -1) ? null : (sb71) linkedHashMap.get(split[i11].trim());
                                    String str = split[vxt0Var2.d];
                                    Matcher matcher2 = m871.a.matcher(str);
                                    int i13 = -1;
                                    PointF pointF = null;
                                    while (matcher2.find()) {
                                        String group = matcher2.group(1);
                                        group.getClass();
                                        try {
                                            PointF a = m871.a(group);
                                            if (a != null) {
                                                pointF = a;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            matcher = m871.d.matcher(group);
                                        } catch (RuntimeException unused2) {
                                        }
                                        if (matcher.find()) {
                                            String group2 = matcher.group(1);
                                            group2.getClass();
                                            try {
                                                i10 = Integer.parseInt(group2.trim());
                                            } catch (NumberFormatException unused3) {
                                            }
                                            switch (i10) {
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                    break;
                                                default:
                                                    nba1.e();
                                                    break;
                                            }
                                            if (i10 == -1) {
                                                i13 = i10;
                                            }
                                        }
                                        i10 = -1;
                                        if (i10 == -1) {
                                        }
                                    }
                                    String replace = m871.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f9 = gz61Var.p;
                                    float f10 = gz61Var.q;
                                    SpannableString spannableString = new SpannableString(replace);
                                    float f11 = -3.4028235E38f;
                                    if (sb71Var != null) {
                                        boolean z4 = sb71Var.g;
                                        Integer num = sb71Var.d;
                                        Integer num2 = sb71Var.c;
                                        if (num2 != null) {
                                            dl81Var = dl81Var2;
                                            vxt0Var = vxt0Var2;
                                            z2 = z4;
                                            i5 = 33;
                                            i6 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            dl81Var = dl81Var2;
                                            vxt0Var = vxt0Var2;
                                            z2 = z4;
                                            i5 = 33;
                                            i6 = 0;
                                        }
                                        if (sb71Var.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i6, spannableString.length(), i5);
                                        }
                                        float f12 = sb71Var.e;
                                        if (f12 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                            i7 = Integer.MIN_VALUE;
                                            f6 = -3.4028235E38f;
                                        } else {
                                            f6 = f12 / f10;
                                            i7 = 1;
                                        }
                                        boolean z5 = sb71Var.f;
                                        if (z5 && z2) {
                                            f7 = f6;
                                            i8 = i7;
                                            i9 = 33;
                                            i2 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f7 = f6;
                                            i8 = i7;
                                            i9 = 33;
                                            i2 = 0;
                                            if (z5) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (sb71Var.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i2, spannableString.length(), i9);
                                        }
                                        if (sb71Var.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i2, spannableString.length(), i9);
                                        }
                                        i3 = i8;
                                        f = f7;
                                    } else {
                                        dl81Var = dl81Var2;
                                        vxt0Var = vxt0Var2;
                                        i2 = 0;
                                        i3 = Integer.MIN_VALUE;
                                        f = -3.4028235E38f;
                                    }
                                    int i14 = -1;
                                    if (i13 != -1) {
                                        i14 = i13;
                                    } else if (sb71Var != null) {
                                        i14 = sb71Var.b;
                                    }
                                    switch (i14) {
                                        case 0:
                                        default:
                                            nba1.e();
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
                                    switch (i14) {
                                        case 0:
                                        default:
                                            nba1.e();
                                        case -1:
                                            i4 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i4 = i2;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i4 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i4 = 2;
                                            break;
                                    }
                                    switch (i14) {
                                        case 0:
                                        default:
                                            nba1.e();
                                        case -1:
                                            i2 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i2 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i2 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            break;
                                    }
                                    if (pointF == null || f10 == -3.4028235E38f || f9 == -3.4028235E38f) {
                                        float f13 = i4 != 0 ? i4 != 1 ? i4 != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                        if (i2 == 0) {
                                            f2 = 0.05f;
                                        } else if (i2 == 1) {
                                            f2 = 0.5f;
                                        } else if (i2 != 2) {
                                            f3 = f13;
                                        } else {
                                            f2 = 0.95f;
                                        }
                                        f3 = f13;
                                        r871 r871Var = new r871(spannableString, alignment, null, null, f2, 0, i2, f3, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, ModalContentViewContainer.BASE_SHADOW_COLOR, Integer.MIN_VALUE, 0.0f);
                                        f5 = f(g2, arrayList2, arrayList);
                                        for (f4 = f(g, arrayList2, arrayList); f4 < f5; f4++) {
                                            ((List) arrayList.get(f4)).add(r871Var);
                                        }
                                        gz61Var = this;
                                        dl81Var2 = dl81Var;
                                        vxt0Var2 = vxt0Var;
                                    } else {
                                        float f14 = pointF.x / f9;
                                        f11 = pointF.y / f10;
                                        f3 = f14;
                                    }
                                    f2 = f11;
                                    r871 r871Var2 = new r871(spannableString, alignment, null, null, f2, 0, i2, f3, i4, i3, f, -3.4028235E38f, -3.4028235E38f, false, ModalContentViewContainer.BASE_SHADOW_COLOR, Integer.MIN_VALUE, 0.0f);
                                    f5 = f(g2, arrayList2, arrayList);
                                    while (f4 < f5) {
                                    }
                                    gz61Var = this;
                                    dl81Var2 = dl81Var;
                                    vxt0Var2 = vxt0Var;
                                }
                            }
                        }
                    }
                }
                dl81Var = dl81Var2;
                vxt0Var = vxt0Var2;
                gz61Var = this;
                dl81Var2 = dl81Var;
                vxt0Var2 = vxt0Var;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02da, code lost:
    
        r28.o = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de A[Catch: RuntimeException -> 0x01d1, TryCatch #1 {RuntimeException -> 0x01d1, blocks: (B:51:0x01ad, B:53:0x01bb, B:55:0x01c1, B:58:0x01da, B:60:0x01de, B:61:0x01ed, B:63:0x01f1, B:64:0x0204, B:66:0x0208, B:68:0x020e, B:69:0x022e, B:71:0x0232, B:74:0x0247, B:76:0x024b, B:79:0x025c, B:81:0x0260, B:84:0x0271, B:86:0x0275, B:89:0x0286, B:91:0x028a, B:93:0x0290, B:99:0x02ab, B:96:0x02a5, B:109:0x0214, B:113:0x01d4), top: B:50:0x01ad, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f1 A[Catch: RuntimeException -> 0x01d1, TryCatch #1 {RuntimeException -> 0x01d1, blocks: (B:51:0x01ad, B:53:0x01bb, B:55:0x01c1, B:58:0x01da, B:60:0x01de, B:61:0x01ed, B:63:0x01f1, B:64:0x0204, B:66:0x0208, B:68:0x020e, B:69:0x022e, B:71:0x0232, B:74:0x0247, B:76:0x024b, B:79:0x025c, B:81:0x0260, B:84:0x0271, B:86:0x0275, B:89:0x0286, B:91:0x028a, B:93:0x0290, B:99:0x02ab, B:96:0x02a5, B:109:0x0214, B:113:0x01d4), top: B:50:0x01ad, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0208 A[Catch: RuntimeException -> 0x01d1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01d1, blocks: (B:51:0x01ad, B:53:0x01bb, B:55:0x01c1, B:58:0x01da, B:60:0x01de, B:61:0x01ed, B:63:0x01f1, B:64:0x0204, B:66:0x0208, B:68:0x020e, B:69:0x022e, B:71:0x0232, B:74:0x0247, B:76:0x024b, B:79:0x025c, B:81:0x0260, B:84:0x0271, B:86:0x0275, B:89:0x0286, B:91:0x028a, B:93:0x0290, B:99:0x02ab, B:96:0x02a5, B:109:0x0214, B:113:0x01d4), top: B:50:0x01ad, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0232 A[Catch: RuntimeException -> 0x01d1, TryCatch #1 {RuntimeException -> 0x01d1, blocks: (B:51:0x01ad, B:53:0x01bb, B:55:0x01c1, B:58:0x01da, B:60:0x01de, B:61:0x01ed, B:63:0x01f1, B:64:0x0204, B:66:0x0208, B:68:0x020e, B:69:0x022e, B:71:0x0232, B:74:0x0247, B:76:0x024b, B:79:0x025c, B:81:0x0260, B:84:0x0271, B:86:0x0275, B:89:0x0286, B:91:0x028a, B:93:0x0290, B:99:0x02ab, B:96:0x02a5, B:109:0x0214, B:113:0x01d4), top: B:50:0x01ad, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024b A[Catch: RuntimeException -> 0x01d1, TryCatch #1 {RuntimeException -> 0x01d1, blocks: (B:51:0x01ad, B:53:0x01bb, B:55:0x01c1, B:58:0x01da, B:60:0x01de, B:61:0x01ed, B:63:0x01f1, B:64:0x0204, B:66:0x0208, B:68:0x020e, B:69:0x022e, B:71:0x0232, B:74:0x0247, B:76:0x024b, B:79:0x025c, B:81:0x0260, B:84:0x0271, B:86:0x0275, B:89:0x0286, B:91:0x028a, B:93:0x0290, B:99:0x02ab, B:96:0x02a5, B:109:0x0214, B:113:0x01d4), top: B:50:0x01ad, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260 A[Catch: RuntimeException -> 0x01d1, TryCatch #1 {RuntimeException -> 0x01d1, blocks: (B:51:0x01ad, B:53:0x01bb, B:55:0x01c1, B:58:0x01da, B:60:0x01de, B:61:0x01ed, B:63:0x01f1, B:64:0x0204, B:66:0x0208, B:68:0x020e, B:69:0x022e, B:71:0x0232, B:74:0x0247, B:76:0x024b, B:79:0x025c, B:81:0x0260, B:84:0x0271, B:86:0x0275, B:89:0x0286, B:91:0x028a, B:93:0x0290, B:99:0x02ab, B:96:0x02a5, B:109:0x0214, B:113:0x01d4), top: B:50:0x01ad, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0275 A[Catch: RuntimeException -> 0x01d1, TryCatch #1 {RuntimeException -> 0x01d1, blocks: (B:51:0x01ad, B:53:0x01bb, B:55:0x01c1, B:58:0x01da, B:60:0x01de, B:61:0x01ed, B:63:0x01f1, B:64:0x0204, B:66:0x0208, B:68:0x020e, B:69:0x022e, B:71:0x0232, B:74:0x0247, B:76:0x024b, B:79:0x025c, B:81:0x0260, B:84:0x0271, B:86:0x0275, B:89:0x0286, B:91:0x028a, B:93:0x0290, B:99:0x02ab, B:96:0x02a5, B:109:0x0214, B:113:0x01d4), top: B:50:0x01ad, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028a A[Catch: RuntimeException -> 0x01d1, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x01d1, blocks: (B:51:0x01ad, B:53:0x01bb, B:55:0x01c1, B:58:0x01da, B:60:0x01de, B:61:0x01ed, B:63:0x01f1, B:64:0x0204, B:66:0x0208, B:68:0x020e, B:69:0x022e, B:71:0x0232, B:74:0x0247, B:76:0x024b, B:79:0x025c, B:81:0x0260, B:84:0x0271, B:86:0x0275, B:89:0x0286, B:91:0x028a, B:93:0x0290, B:99:0x02ab, B:96:0x02a5, B:109:0x0214, B:113:0x01d4), top: B:50:0x01ad, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(dl81 dl81Var) {
        int i;
        sb71 sb71Var;
        String trim;
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        Integer num;
        int i5;
        float f;
        int i6;
        String str3;
        boolean z;
        int i7;
        int i8;
        int parseInt;
        int parseInt2;
        while (true) {
            String f2 = dl81Var.f();
            if (f2 == null) {
                return;
            }
            char c = '[';
            int i9 = 0;
            if ("[Script Info]".equalsIgnoreCase(f2)) {
                while (true) {
                    String f3 = dl81Var.f();
                    if (f3 != null) {
                        int i10 = dl81Var.c;
                        int i11 = dl81Var.b;
                        if (i10 - i11 == 0 || (dl81Var.a[i11] & 255) != 91) {
                            String[] split = f3.split(":");
                            if (split.length == 2) {
                                String a = tea1.a(split[0].trim());
                                a.getClass();
                                if (a.equals("playresx")) {
                                    this.p = Float.parseFloat(split[1].trim());
                                } else if (a.equals("playresy")) {
                                    try {
                                        this.q = Float.parseFloat(split[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(f2)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    xxt0 xxt0Var = null;
                    while (true) {
                        String f4 = dl81Var.f();
                        if (f4 != null) {
                            int i12 = dl81Var.c;
                            int i13 = dl81Var.b;
                            if (i12 - i13 == 0 || (dl81Var.a[i13] & 255) != c) {
                                if (f4.startsWith("Format:")) {
                                    String[] split2 = TextUtils.split(f4.substring(7), ",");
                                    int i14 = -1;
                                    int i15 = -1;
                                    int i16 = -1;
                                    int i17 = -1;
                                    int i18 = -1;
                                    int i19 = -1;
                                    int i20 = -1;
                                    int i21 = -1;
                                    int i22 = -1;
                                    int i23 = -1;
                                    for (int i24 = i9; i24 < split2.length; i24++) {
                                        String a2 = tea1.a(split2[i24].trim());
                                        a2.getClass();
                                        switch (a2.hashCode()) {
                                            case -1178781136:
                                                if (a2.equals("italic")) {
                                                    i = i9;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case -1026963764:
                                                if (a2.equals("underline")) {
                                                    i = 1;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case -192095652:
                                                if (a2.equals("strikeout")) {
                                                    i = 2;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case -70925746:
                                                if (a2.equals("primarycolour")) {
                                                    i = 3;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 3029637:
                                                if (a2.equals("bold")) {
                                                    i = 4;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 3373707:
                                                if (a2.equals("name")) {
                                                    i = 5;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 366554320:
                                                if (a2.equals("fontsize")) {
                                                    i = 6;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 767321349:
                                                if (a2.equals("borderstyle")) {
                                                    i = 7;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 1767875043:
                                                if (a2.equals("alignment")) {
                                                    i = 8;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case 1988365454:
                                                if (a2.equals("outlinecolour")) {
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
                                                i20 = i24;
                                                break;
                                            case 1:
                                                i21 = i24;
                                                break;
                                            case 2:
                                                i22 = i24;
                                                break;
                                            case 3:
                                                i16 = i24;
                                                break;
                                            case 4:
                                                i19 = i24;
                                                break;
                                            case 5:
                                                i14 = i24;
                                                break;
                                            case 6:
                                                i18 = i24;
                                                break;
                                            case 7:
                                                i23 = i24;
                                                break;
                                            case 8:
                                                i15 = i24;
                                                break;
                                            case 9:
                                                i17 = i24;
                                                break;
                                        }
                                    }
                                    if (i14 != -1) {
                                        xxt0Var = new xxt0(i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, split2.length);
                                    }
                                } else {
                                    if (f4.startsWith("Style:")) {
                                        if (xxt0Var == null) {
                                            nba1.e();
                                        } else {
                                            if (!f4.startsWith("Style:")) {
                                                w511.q();
                                                return;
                                            }
                                            String[] split3 = TextUtils.split(f4.substring(6), ",");
                                            if (split3.length != xxt0Var.k) {
                                                int i25 = rf71.a;
                                                Locale locale = Locale.US;
                                                nba1.e();
                                            } else {
                                                try {
                                                    trim = split3[xxt0Var.a].trim();
                                                    i2 = xxt0Var.b;
                                                } catch (RuntimeException e) {
                                                    nba1.b("Skipping malformed 'Style:' line: '" + f4 + "'", e);
                                                    nba1.e();
                                                }
                                                if (i2 != -1) {
                                                    try {
                                                        parseInt2 = Integer.parseInt(split3[i2].trim().trim());
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    switch (parseInt2) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                            str = trim;
                                                            i3 = parseInt2;
                                                            break;
                                                        default:
                                                            nba1.e();
                                                            break;
                                                    }
                                                    int i26 = xxt0Var.c;
                                                    Integer b = i26 == -1 ? sb71.b(split3[i26].trim()) : null;
                                                    i4 = xxt0Var.d;
                                                    if (i4 == -1) {
                                                        str2 = str;
                                                        num = sb71.b(split3[i4].trim());
                                                    } else {
                                                        str2 = str;
                                                        num = null;
                                                    }
                                                    i5 = xxt0Var.e;
                                                    if (i5 != -1) {
                                                        String trim2 = split3[i5].trim();
                                                        try {
                                                            f = Float.parseFloat(trim2);
                                                        } catch (NumberFormatException e2) {
                                                            nba1.b("Failed to parse font size: '" + trim2 + "'", e2);
                                                            nba1.e();
                                                        }
                                                        i6 = xxt0Var.f;
                                                        if (i6 == -1 && sb71.a(split3[i6].trim())) {
                                                            str3 = str2;
                                                            z = true;
                                                        } else {
                                                            str3 = str2;
                                                            z = false;
                                                        }
                                                        int i27 = xxt0Var.g;
                                                        boolean z2 = i27 == -1 && sb71.a(split3[i27].trim());
                                                        int i28 = xxt0Var.h;
                                                        boolean z3 = i28 == -1 && sb71.a(split3[i28].trim());
                                                        int i29 = xxt0Var.i;
                                                        boolean z4 = i29 == -1 && sb71.a(split3[i29].trim());
                                                        i7 = xxt0Var.j;
                                                        if (i7 != -1) {
                                                            try {
                                                                parseInt = Integer.parseInt(split3[i7].trim().trim());
                                                            } catch (NumberFormatException unused3) {
                                                            }
                                                            if (parseInt == 1 || parseInt == 3) {
                                                                i8 = parseInt;
                                                                sb71Var = new sb71(str3, i3, b, num, f, z, z2, z3, z4, i8);
                                                                if (sb71Var != null) {
                                                                    linkedHashMap.put(sb71Var.a, sb71Var);
                                                                }
                                                            }
                                                            nba1.e();
                                                        }
                                                        i8 = -1;
                                                        sb71Var = new sb71(str3, i3, b, num, f, z, z2, z3, z4, i8);
                                                        if (sb71Var != null) {
                                                        }
                                                    }
                                                    f = -3.4028235E38f;
                                                    i6 = xxt0Var.f;
                                                    if (i6 == -1) {
                                                    }
                                                    str3 = str2;
                                                    z = false;
                                                    int i272 = xxt0Var.g;
                                                    if (i272 == -1) {
                                                    }
                                                    int i282 = xxt0Var.h;
                                                    if (i282 == -1) {
                                                    }
                                                    int i292 = xxt0Var.i;
                                                    if (i292 == -1) {
                                                    }
                                                    i7 = xxt0Var.j;
                                                    if (i7 != -1) {
                                                    }
                                                    i8 = -1;
                                                    sb71Var = new sb71(str3, i3, b, num, f, z, z2, z3, z4, i8);
                                                    if (sb71Var != null) {
                                                    }
                                                }
                                                str = trim;
                                                i3 = -1;
                                                int i262 = xxt0Var.c;
                                                if (i262 == -1) {
                                                }
                                                i4 = xxt0Var.d;
                                                if (i4 == -1) {
                                                }
                                                i5 = xxt0Var.e;
                                                if (i5 != -1) {
                                                }
                                                f = -3.4028235E38f;
                                                i6 = xxt0Var.f;
                                                if (i6 == -1) {
                                                }
                                                str3 = str2;
                                                z = false;
                                                int i2722 = xxt0Var.g;
                                                if (i2722 == -1) {
                                                }
                                                int i2822 = xxt0Var.h;
                                                if (i2822 == -1) {
                                                }
                                                int i2922 = xxt0Var.i;
                                                if (i2922 == -1) {
                                                }
                                                i7 = xxt0Var.j;
                                                if (i7 != -1) {
                                                }
                                                i8 = -1;
                                                sb71Var = new sb71(str3, i3, b, num, f, z, z2, z3, z4, i8);
                                                if (sb71Var != null) {
                                                }
                                            }
                                            sb71Var = null;
                                            if (sb71Var != null) {
                                            }
                                        }
                                    }
                                    c = '[';
                                    i9 = 0;
                                }
                            }
                        }
                    }
                }
            } else if ("[V4 Styles]".equalsIgnoreCase(f2)) {
                nba1.d("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(f2)) {
                return;
            }
        }
    }
}
