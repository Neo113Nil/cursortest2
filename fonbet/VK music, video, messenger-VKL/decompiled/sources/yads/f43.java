package yads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.odj;

/* loaded from: classes10.dex */
public final class f43 extends j03 {
    public static final Pattern r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean m;
    public final g43 n;
    public LinkedHashMap o;
    public float p = -3.4028235E38f;
    public float q = -3.4028235E38f;

    public f43(List list) {
        if (list == null || list.isEmpty()) {
            this.m = false;
            this.n = null;
            return;
        }
        this.m = true;
        String a = mc3.a((byte[]) list.get(0));
        ni.a(a.startsWith("Format:"));
        this.n = (g43) ni.a(g43.a(a));
        a(new kc2((byte[]) list.get(1)));
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
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

    /* JADX WARN: Failed to find 'out' block for switch in B:48:0x00fd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d7 A[LOOP:2: B:130:0x02d5->B:131:0x02d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[SYNTHETIC] */
    @Override // yads.j03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v53 a(byte[] bArr, int i, boolean z) {
        kc2 kc2Var;
        g43 g43Var;
        float f;
        int i2;
        float f2;
        int i3;
        Layout.Alignment alignment;
        int i4;
        float f3;
        float f4;
        int a;
        int a2;
        float f5;
        int i5;
        float f6;
        int i6;
        int i7;
        g43 g43Var2;
        PointF pointF;
        Matcher matcher;
        int i8;
        int i9;
        f43 f43Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        kc2 kc2Var2 = new kc2(i, bArr);
        if (!f43Var.m) {
            f43Var.a(kc2Var2);
        }
        g43 g43Var3 = f43Var.m ? f43Var.n : null;
        while (true) {
            String c = kc2Var2.c();
            if (c != null) {
                if (c.startsWith("Format:")) {
                    g43Var3 = g43.a(c);
                } else {
                    if (c.startsWith("Dialogue:")) {
                        if (g43Var3 == null) {
                            ji1.d("SsaDecoder", "Skipping dialogue line before complete format: ".concat(c));
                        } else if (c.startsWith("Dialogue:")) {
                            String[] split = c.substring(9).split(StringUtils.COMMA, g43Var3.e);
                            if (split.length != g43Var3.e) {
                                ji1.d("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(c));
                            } else {
                                long a3 = a(split[g43Var3.a]);
                                if (a3 == C.TIME_UNSET) {
                                    ji1.d("SsaDecoder", "Skipping invalid timing: ".concat(c));
                                } else {
                                    long a4 = a(split[g43Var3.b]);
                                    if (a4 == C.TIME_UNSET) {
                                        ji1.d("SsaDecoder", "Skipping invalid timing: ".concat(c));
                                    } else {
                                        LinkedHashMap linkedHashMap = f43Var.o;
                                        j43 j43Var = (linkedHashMap == null || (i9 = g43Var3.c) == -1) ? null : (j43) linkedHashMap.get(split[i9].trim());
                                        String str = split[g43Var3.d];
                                        Matcher matcher2 = i43.a.matcher(str);
                                        int i10 = -1;
                                        PointF pointF2 = null;
                                        while (matcher2.find()) {
                                            kc2 kc2Var3 = kc2Var2;
                                            String group = matcher2.group(1);
                                            group.getClass();
                                            try {
                                                PointF a5 = i43.a(group);
                                                if (a5 != null) {
                                                    pointF2 = a5;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                matcher = i43.d.matcher(group);
                                            } catch (RuntimeException unused2) {
                                                g43Var2 = g43Var3;
                                            }
                                            if (matcher.find()) {
                                                String group2 = matcher.group(1);
                                                group2.getClass();
                                                try {
                                                    i8 = Integer.parseInt(group2.trim());
                                                } catch (NumberFormatException unused3) {
                                                }
                                                switch (i8) {
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                        g43Var2 = g43Var3;
                                                        pointF = pointF2;
                                                        if (i8 == -1) {
                                                            i10 = i8;
                                                            pointF2 = pointF;
                                                            g43Var3 = g43Var2;
                                                            kc2Var2 = kc2Var3;
                                                            break;
                                                        } else {
                                                            kc2Var2 = kc2Var3;
                                                            pointF2 = pointF;
                                                            g43Var3 = g43Var2;
                                                            break;
                                                        }
                                                    default:
                                                        g43Var2 = g43Var3;
                                                        try {
                                                            pointF = pointF2;
                                                            try {
                                                                ji1.d("SsaStyle", "Ignoring unknown alignment: " + group2);
                                                                break;
                                                            } catch (RuntimeException unused4) {
                                                            }
                                                        } catch (RuntimeException unused5) {
                                                            pointF = pointF2;
                                                            kc2Var2 = kc2Var3;
                                                            pointF2 = pointF;
                                                            g43Var3 = g43Var2;
                                                        }
                                                }
                                            } else {
                                                g43Var2 = g43Var3;
                                                pointF = pointF2;
                                            }
                                            i8 = -1;
                                            if (i8 == -1) {
                                            }
                                        }
                                        kc2Var = kc2Var2;
                                        g43Var = g43Var3;
                                        String replace = i43.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f7 = f43Var.p;
                                        float f8 = f43Var.q;
                                        SpannableString spannableString = new SpannableString(replace);
                                        float f9 = -3.4028235E38f;
                                        if (j43Var != null) {
                                            if (j43Var.c != null) {
                                                f = f7;
                                                spannableString.setSpan(new ForegroundColorSpan(j43Var.c.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                f = f7;
                                            }
                                            if (j43Var.j == 3 && j43Var.d != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(j43Var.d.intValue()), 0, spannableString.length(), 33);
                                            }
                                            float f10 = j43Var.e;
                                            if (f10 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                                f5 = -3.4028235E38f;
                                                i5 = Integer.MIN_VALUE;
                                            } else {
                                                f5 = f10 / f8;
                                                i5 = 1;
                                            }
                                            boolean z2 = j43Var.f;
                                            if (z2 && j43Var.g) {
                                                f6 = f5;
                                                i6 = i5;
                                                i7 = 33;
                                                i2 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f6 = f5;
                                                i6 = i5;
                                                i7 = 33;
                                                i2 = 0;
                                                if (z2) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (j43Var.g) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (j43Var.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i2, spannableString.length(), i7);
                                            }
                                            if (j43Var.i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i2, spannableString.length(), i7);
                                            }
                                            i3 = i6;
                                            f2 = f6;
                                        } else {
                                            f = f7;
                                            i2 = 0;
                                            f2 = -3.4028235E38f;
                                            i3 = Integer.MIN_VALUE;
                                        }
                                        int i11 = -1;
                                        if (i10 != -1) {
                                            i11 = i10;
                                        } else if (j43Var != null) {
                                            i11 = j43Var.b;
                                        }
                                        switch (i11) {
                                            case 0:
                                            default:
                                                lg1.a("Unknown alignment: ", i11, "SsaDecoder");
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
                                        switch (i11) {
                                            case 0:
                                            default:
                                                lg1.a("Unknown alignment: ", i11, "SsaDecoder");
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
                                        switch (i11) {
                                            case 0:
                                            default:
                                                lg1.a("Unknown alignment: ", i11, "SsaDecoder");
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
                                        if (pointF2 != null && f8 != -3.4028235E38f && f != -3.4028235E38f) {
                                            float f11 = pointF2.x / f;
                                            f9 = pointF2.y / f8;
                                            f4 = f11;
                                        } else {
                                            float f12 = i4 != 0 ? i4 != 1 ? i4 != 2 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                            if (i2 == 0) {
                                                f3 = 0.05f;
                                            } else if (i2 == 1) {
                                                f3 = 0.5f;
                                            } else if (i2 != 2) {
                                                f4 = f12;
                                            } else {
                                                f3 = 0.95f;
                                            }
                                            f4 = f12;
                                            o20 o20Var = new o20(spannableString, alignment, null, null, f3, 0, i2, f4, i4, i3, f2, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                            a2 = a(a4, arrayList2, arrayList);
                                            for (a = a(a3, arrayList2, arrayList); a < a2; a++) {
                                                ((List) arrayList.get(a)).add(o20Var);
                                            }
                                            f43Var = this;
                                            kc2Var2 = kc2Var;
                                            g43Var3 = g43Var;
                                        }
                                        f3 = f9;
                                        o20 o20Var2 = new o20(spannableString, alignment, null, null, f3, 0, i2, f4, i4, i3, f2, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        a2 = a(a4, arrayList2, arrayList);
                                        while (a < a2) {
                                        }
                                        f43Var = this;
                                        kc2Var2 = kc2Var;
                                        g43Var3 = g43Var;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    kc2Var = kc2Var2;
                    g43Var = g43Var3;
                    f43Var = this;
                    kc2Var2 = kc2Var;
                    g43Var3 = g43Var;
                }
            } else {
                return new k43(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x030e, code lost:
    
        r28.o = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0209 A[Catch: RuntimeException -> 0x01ef, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:51:0x01cc, B:53:0x01da, B:55:0x01e0, B:58:0x0205, B:60:0x0209, B:61:0x0218, B:63:0x021c, B:64:0x022b, B:66:0x022f, B:68:0x0235, B:70:0x0259, B:72:0x025d, B:75:0x026e, B:77:0x0272, B:80:0x0283, B:82:0x0287, B:85:0x0298, B:87:0x029c, B:90:0x02ad, B:92:0x02b1, B:94:0x02b7, B:99:0x02da, B:97:0x02c7, B:110:0x023d, B:114:0x01f2), top: B:50:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021c A[Catch: RuntimeException -> 0x01ef, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:51:0x01cc, B:53:0x01da, B:55:0x01e0, B:58:0x0205, B:60:0x0209, B:61:0x0218, B:63:0x021c, B:64:0x022b, B:66:0x022f, B:68:0x0235, B:70:0x0259, B:72:0x025d, B:75:0x026e, B:77:0x0272, B:80:0x0283, B:82:0x0287, B:85:0x0298, B:87:0x029c, B:90:0x02ad, B:92:0x02b1, B:94:0x02b7, B:99:0x02da, B:97:0x02c7, B:110:0x023d, B:114:0x01f2), top: B:50:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022f A[Catch: RuntimeException -> 0x01ef, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:51:0x01cc, B:53:0x01da, B:55:0x01e0, B:58:0x0205, B:60:0x0209, B:61:0x0218, B:63:0x021c, B:64:0x022b, B:66:0x022f, B:68:0x0235, B:70:0x0259, B:72:0x025d, B:75:0x026e, B:77:0x0272, B:80:0x0283, B:82:0x0287, B:85:0x0298, B:87:0x029c, B:90:0x02ad, B:92:0x02b1, B:94:0x02b7, B:99:0x02da, B:97:0x02c7, B:110:0x023d, B:114:0x01f2), top: B:50:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025d A[Catch: RuntimeException -> 0x01ef, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:51:0x01cc, B:53:0x01da, B:55:0x01e0, B:58:0x0205, B:60:0x0209, B:61:0x0218, B:63:0x021c, B:64:0x022b, B:66:0x022f, B:68:0x0235, B:70:0x0259, B:72:0x025d, B:75:0x026e, B:77:0x0272, B:80:0x0283, B:82:0x0287, B:85:0x0298, B:87:0x029c, B:90:0x02ad, B:92:0x02b1, B:94:0x02b7, B:99:0x02da, B:97:0x02c7, B:110:0x023d, B:114:0x01f2), top: B:50:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0272 A[Catch: RuntimeException -> 0x01ef, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:51:0x01cc, B:53:0x01da, B:55:0x01e0, B:58:0x0205, B:60:0x0209, B:61:0x0218, B:63:0x021c, B:64:0x022b, B:66:0x022f, B:68:0x0235, B:70:0x0259, B:72:0x025d, B:75:0x026e, B:77:0x0272, B:80:0x0283, B:82:0x0287, B:85:0x0298, B:87:0x029c, B:90:0x02ad, B:92:0x02b1, B:94:0x02b7, B:99:0x02da, B:97:0x02c7, B:110:0x023d, B:114:0x01f2), top: B:50:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0287 A[Catch: RuntimeException -> 0x01ef, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:51:0x01cc, B:53:0x01da, B:55:0x01e0, B:58:0x0205, B:60:0x0209, B:61:0x0218, B:63:0x021c, B:64:0x022b, B:66:0x022f, B:68:0x0235, B:70:0x0259, B:72:0x025d, B:75:0x026e, B:77:0x0272, B:80:0x0283, B:82:0x0287, B:85:0x0298, B:87:0x029c, B:90:0x02ad, B:92:0x02b1, B:94:0x02b7, B:99:0x02da, B:97:0x02c7, B:110:0x023d, B:114:0x01f2), top: B:50:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029c A[Catch: RuntimeException -> 0x01ef, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:51:0x01cc, B:53:0x01da, B:55:0x01e0, B:58:0x0205, B:60:0x0209, B:61:0x0218, B:63:0x021c, B:64:0x022b, B:66:0x022f, B:68:0x0235, B:70:0x0259, B:72:0x025d, B:75:0x026e, B:77:0x0272, B:80:0x0283, B:82:0x0287, B:85:0x0298, B:87:0x029c, B:90:0x02ad, B:92:0x02b1, B:94:0x02b7, B:99:0x02da, B:97:0x02c7, B:110:0x023d, B:114:0x01f2), top: B:50:0x01cc, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b1 A[Catch: RuntimeException -> 0x01ef, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x01ef, blocks: (B:51:0x01cc, B:53:0x01da, B:55:0x01e0, B:58:0x0205, B:60:0x0209, B:61:0x0218, B:63:0x021c, B:64:0x022b, B:66:0x022f, B:68:0x0235, B:70:0x0259, B:72:0x025d, B:75:0x026e, B:77:0x0272, B:80:0x0283, B:82:0x0287, B:85:0x0298, B:87:0x029c, B:90:0x02ad, B:92:0x02b1, B:94:0x02b7, B:99:0x02da, B:97:0x02c7, B:110:0x023d, B:114:0x01f2), top: B:50:0x01cc, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(kc2 kc2Var) {
        int i;
        String trim;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        j43 j43Var;
        int parseInt;
        int parseInt2;
        while (true) {
            String c = kc2Var.c();
            if (c == null) {
                return;
            }
            char c2 = '[';
            int i7 = 0;
            if ("[Script Info]".equalsIgnoreCase(c)) {
                while (true) {
                    String c3 = kc2Var.c();
                    if (c3 != null) {
                        int i8 = kc2Var.c;
                        int i9 = kc2Var.b;
                        if (i8 - i9 == 0 || (kc2Var.a[i9] & 255) != 91) {
                            String[] split = c3.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                            if (split.length == 2) {
                                String a = ki.a(split[0].trim());
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
            } else if ("[V4+ Styles]".equalsIgnoreCase(c)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    h43 h43Var = null;
                    while (true) {
                        String c4 = kc2Var.c();
                        if (c4 != null) {
                            int i10 = kc2Var.c;
                            int i11 = kc2Var.b;
                            if (i10 - i11 == 0 || (kc2Var.a[i11] & 255) != c2) {
                                if (c4.startsWith("Format:")) {
                                    String[] split2 = TextUtils.split(c4.substring(7), StringUtils.COMMA);
                                    int i12 = -1;
                                    int i13 = -1;
                                    int i14 = -1;
                                    int i15 = -1;
                                    int i16 = -1;
                                    int i17 = -1;
                                    int i18 = -1;
                                    int i19 = -1;
                                    int i20 = -1;
                                    int i21 = -1;
                                    for (int i22 = i7; i22 < split2.length; i22++) {
                                        String a2 = ki.a(split2[i22].trim());
                                        a2.getClass();
                                        switch (a2.hashCode()) {
                                            case -1178781136:
                                                if (a2.equals(TtmlNode.ITALIC)) {
                                                    i = i7;
                                                    break;
                                                }
                                                i = -1;
                                                break;
                                            case -1026963764:
                                                if (a2.equals(TtmlNode.UNDERLINE)) {
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
                                                if (a2.equals(TtmlNode.BOLD)) {
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
                                                i18 = i22;
                                                break;
                                            case 1:
                                                i19 = i22;
                                                break;
                                            case 2:
                                                i20 = i22;
                                                break;
                                            case 3:
                                                i14 = i22;
                                                break;
                                            case 4:
                                                i17 = i22;
                                                break;
                                            case 5:
                                                i12 = i22;
                                                break;
                                            case 6:
                                                i16 = i22;
                                                break;
                                            case 7:
                                                i21 = i22;
                                                break;
                                            case 8:
                                                i13 = i22;
                                                break;
                                            case 9:
                                                i15 = i22;
                                                break;
                                        }
                                    }
                                    if (i12 != -1) {
                                        h43Var = new h43(i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, split2.length);
                                    }
                                } else {
                                    if (c4.startsWith("Style:")) {
                                        if (h43Var == null) {
                                            ji1.d("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(c4));
                                        } else if (c4.startsWith("Style:")) {
                                            String[] split3 = TextUtils.split(c4.substring(6), StringUtils.COMMA);
                                            int length = split3.length;
                                            int i23 = h43Var.k;
                                            if (length != i23) {
                                                int length2 = split3.length;
                                                int i24 = mc3.a;
                                                Locale locale = Locale.US;
                                                StringBuilder a3 = odj.a(i23, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                                a3.append(c4);
                                                a3.append("'");
                                                ji1.d("SsaStyle", a3.toString());
                                            } else {
                                                try {
                                                    trim = split3[h43Var.a].trim();
                                                    i2 = h43Var.b;
                                                } catch (RuntimeException e) {
                                                    ji1.d("SsaStyle", ji1.a("Skipping malformed 'Style:' line: '" + c4 + "'", e));
                                                }
                                                if (i2 != -1) {
                                                    String trim2 = split3[i2].trim();
                                                    try {
                                                        parseInt2 = Integer.parseInt(trim2.trim());
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
                                                            i3 = parseInt2;
                                                            break;
                                                        default:
                                                            ji1.d("SsaStyle", "Ignoring unknown alignment: " + trim2);
                                                            break;
                                                    }
                                                    int i25 = h43Var.c;
                                                    Integer b = i25 == -1 ? j43.b(split3[i25].trim()) : null;
                                                    int i26 = h43Var.d;
                                                    Integer b2 = i26 == -1 ? j43.b(split3[i26].trim()) : null;
                                                    i4 = h43Var.e;
                                                    if (i4 != -1) {
                                                        String trim3 = split3[i4].trim();
                                                        try {
                                                            f = Float.parseFloat(trim3);
                                                        } catch (NumberFormatException e2) {
                                                            ji1.d("SsaStyle", ji1.a("Failed to parse font size: '" + trim3 + "'", e2));
                                                        }
                                                        float f2 = f;
                                                        int i27 = h43Var.f;
                                                        boolean z = i27 == -1 && j43.a(split3[i27].trim());
                                                        int i28 = h43Var.g;
                                                        boolean z2 = i28 == -1 && j43.a(split3[i28].trim());
                                                        int i29 = h43Var.h;
                                                        boolean z3 = i29 == -1 && j43.a(split3[i29].trim());
                                                        int i30 = h43Var.i;
                                                        boolean z4 = i30 == -1 && j43.a(split3[i30].trim());
                                                        i5 = h43Var.j;
                                                        if (i5 != -1) {
                                                            String trim4 = split3[i5].trim();
                                                            try {
                                                                parseInt = Integer.parseInt(trim4.trim());
                                                            } catch (NumberFormatException unused3) {
                                                            }
                                                            if (parseInt == 1 || parseInt == 3) {
                                                                i6 = parseInt;
                                                                j43Var = new j43(trim, i3, b, b2, f2, z, z2, z3, z4, i6);
                                                                if (j43Var != null) {
                                                                    linkedHashMap.put(j43Var.a, j43Var);
                                                                }
                                                            }
                                                            ji1.d("SsaStyle", "Ignoring unknown BorderStyle: " + trim4);
                                                        }
                                                        i6 = -1;
                                                        j43Var = new j43(trim, i3, b, b2, f2, z, z2, z3, z4, i6);
                                                        if (j43Var != null) {
                                                        }
                                                    }
                                                    f = -3.4028235E38f;
                                                    float f22 = f;
                                                    int i272 = h43Var.f;
                                                    if (i272 == -1) {
                                                    }
                                                    int i282 = h43Var.g;
                                                    if (i282 == -1) {
                                                    }
                                                    int i292 = h43Var.h;
                                                    if (i292 == -1) {
                                                    }
                                                    int i302 = h43Var.i;
                                                    if (i302 == -1) {
                                                    }
                                                    i5 = h43Var.j;
                                                    if (i5 != -1) {
                                                    }
                                                    i6 = -1;
                                                    j43Var = new j43(trim, i3, b, b2, f22, z, z2, z3, z4, i6);
                                                    if (j43Var != null) {
                                                    }
                                                }
                                                i3 = -1;
                                                int i252 = h43Var.c;
                                                if (i252 == -1) {
                                                }
                                                int i262 = h43Var.d;
                                                if (i262 == -1) {
                                                }
                                                i4 = h43Var.e;
                                                if (i4 != -1) {
                                                }
                                                f = -3.4028235E38f;
                                                float f222 = f;
                                                int i2722 = h43Var.f;
                                                if (i2722 == -1) {
                                                }
                                                int i2822 = h43Var.g;
                                                if (i2822 == -1) {
                                                }
                                                int i2922 = h43Var.h;
                                                if (i2922 == -1) {
                                                }
                                                int i3022 = h43Var.i;
                                                if (i3022 == -1) {
                                                }
                                                i5 = h43Var.j;
                                                if (i5 != -1) {
                                                }
                                                i6 = -1;
                                                j43Var = new j43(trim, i3, b, b2, f222, z, z2, z3, z4, i6);
                                                if (j43Var != null) {
                                                }
                                            }
                                            j43Var = null;
                                            if (j43Var != null) {
                                            }
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                    c2 = '[';
                                    i7 = 0;
                                }
                            }
                        }
                    }
                }
            } else if ("[V4 Styles]".equalsIgnoreCase(c)) {
                ji1.c("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(c)) {
                return;
            }
        }
    }

    public static long a(String str) {
        Matcher matcher = r.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String group = matcher.group(1);
        int i = mc3.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }
}
