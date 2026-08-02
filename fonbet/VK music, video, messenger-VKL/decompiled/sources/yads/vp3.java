package yads;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class vp3 extends j03 {
    public final kc2 m = new kc2();
    public final np3 n = new np3();

    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a3, code lost:
    
        r0.addAll(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0116, code lost:
    
        if (")".equals(yads.np3.b(r11, r12)) == false) goto L61;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f0  */
    @Override // yads.j03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v53 a(byte[] bArr, int i, boolean z) {
        pp3 pp3Var;
        pp3 a;
        String str;
        np3 np3Var;
        String str2;
        char c;
        int i2;
        String sb;
        char c2;
        int i3;
        kc2 kc2Var = this.m;
        kc2Var.a = bArr;
        kc2Var.c = i;
        int i4 = 0;
        kc2Var.b = 0;
        ArrayList arrayList = new ArrayList();
        try {
            wp3.a(this.m);
            while (!TextUtils.isEmpty(this.m.c())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                kc2 kc2Var2 = this.m;
                int i5 = -1;
                int i6 = i4;
                int i7 = -1;
                while (true) {
                    char c3 = 2;
                    int i8 = 1;
                    if (i7 == -1) {
                        i6 = kc2Var2.b;
                        String c4 = kc2Var2.c();
                        i7 = c4 == null ? i4 : "STYLE".equals(c4) ? 2 : c4.startsWith("NOTE") ? 1 : 3;
                    } else {
                        kc2Var2.e(i6);
                        if (i7 == 0) {
                            return new xp3(arrayList2);
                        }
                        if (i7 == 1) {
                            while (!TextUtils.isEmpty(this.m.c())) {
                            }
                        } else {
                            if (i7 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new x53("A style block was found after the first cue.");
                                }
                                this.m.c();
                                np3 np3Var2 = this.n;
                                kc2 kc2Var3 = this.m;
                                np3Var2.b.setLength(i4);
                                int i9 = kc2Var3.b;
                                while (!TextUtils.isEmpty(kc2Var3.c())) {
                                }
                                kc2 kc2Var4 = np3Var2.a;
                                byte[] bArr2 = kc2Var3.a;
                                int i10 = kc2Var3.b;
                                kc2Var4.a = bArr2;
                                kc2Var4.c = i10;
                                kc2Var4.b = i4;
                                kc2Var4.e(i9);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    kc2 kc2Var5 = np3Var2.a;
                                    StringBuilder sb2 = np3Var2.b;
                                    np3.a(kc2Var5);
                                    if (kc2Var5.c - kc2Var5.b >= 5 && "::cue".equals(kc2Var5.a(5, bu.c))) {
                                        int i11 = kc2Var5.b;
                                        String b = np3.b(kc2Var5, sb2);
                                        if (b != null) {
                                            if ("{".equals(b)) {
                                                kc2Var5.e(i11);
                                                str = "";
                                            } else if ("(".equals(b)) {
                                                int i12 = kc2Var5.b;
                                                int i13 = kc2Var5.c;
                                                while (true) {
                                                    for (int i14 = i4; i12 < i13 && i14 == 0; i14 = i8) {
                                                        i3 = i12 + 1;
                                                        if (((char) kc2Var5.a[i12]) == ')') {
                                                            i12 = i3;
                                                        }
                                                    }
                                                    i12 = i3;
                                                }
                                                str = kc2Var5.a((i12 - 1) - kc2Var5.b, bu.c).trim();
                                            } else {
                                                str = null;
                                            }
                                            if (str == null && "{".equals(np3.b(np3Var2.a, np3Var2.b))) {
                                                op3 op3Var = new op3();
                                                if (!"".equals(str)) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i5) {
                                                        Matcher matcher = np3.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i8);
                                                            group.getClass();
                                                            op3Var.d = group;
                                                        }
                                                        str = str.substring(i4, indexOf);
                                                    }
                                                    int i15 = mc3.a;
                                                    String[] split = str.split("\\.", i5);
                                                    String str3 = split[i4];
                                                    int indexOf2 = str3.indexOf(35);
                                                    if (indexOf2 != i5) {
                                                        op3Var.b = str3.substring(i4, indexOf2);
                                                        op3Var.a = str3.substring(indexOf2 + 1);
                                                    } else {
                                                        op3Var.b = str3;
                                                    }
                                                    if (split.length > i8) {
                                                        op3Var.c = new HashSet(Arrays.asList((String[]) mc3.a(split, split.length)));
                                                    }
                                                }
                                                int i16 = i4;
                                                String str4 = null;
                                                while (i16 == 0) {
                                                    kc2 kc2Var6 = np3Var2.a;
                                                    int i17 = kc2Var6.b;
                                                    String b2 = np3.b(kc2Var6, np3Var2.b);
                                                    int i18 = (b2 == null || "}".equals(b2)) ? i8 : i4;
                                                    if (i18 == 0) {
                                                        np3Var2.a.e(i17);
                                                        kc2 kc2Var7 = np3Var2.a;
                                                        StringBuilder sb3 = np3Var2.b;
                                                        np3.a(kc2Var7);
                                                        String a2 = np3.a(kc2Var7, sb3);
                                                        if (!"".equals(a2)) {
                                                            if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(np3.b(kc2Var7, sb3))) {
                                                                np3.a(kc2Var7);
                                                                StringBuilder sb4 = new StringBuilder();
                                                                boolean z2 = false;
                                                                while (true) {
                                                                    if (z2) {
                                                                        np3Var = np3Var2;
                                                                        str2 = b2;
                                                                        sb = sb4.toString();
                                                                    } else {
                                                                        np3Var = np3Var2;
                                                                        int i19 = kc2Var7.b;
                                                                        str2 = b2;
                                                                        String b3 = np3.b(kc2Var7, sb3);
                                                                        if (b3 == null) {
                                                                            sb = null;
                                                                        } else if ("}".equals(b3) || ";".equals(b3)) {
                                                                            kc2Var7.e(i19);
                                                                            np3Var2 = np3Var;
                                                                            b2 = str2;
                                                                            z2 = true;
                                                                        } else {
                                                                            sb4.append(b3);
                                                                            np3Var2 = np3Var;
                                                                            b2 = str2;
                                                                        }
                                                                    }
                                                                }
                                                                if (sb != null && !"".equals(sb)) {
                                                                    int i20 = kc2Var7.b;
                                                                    String b4 = np3.b(kc2Var7, sb3);
                                                                    if (!";".equals(b4)) {
                                                                        if ("}".equals(b4)) {
                                                                            kc2Var7.e(i20);
                                                                        }
                                                                    }
                                                                    if ("color".equals(a2)) {
                                                                        i2 = 1;
                                                                        op3Var.f = nx.a(sb, true);
                                                                        op3Var.g = true;
                                                                    } else {
                                                                        i2 = 1;
                                                                        if ("background-color".equals(a2)) {
                                                                            op3Var.h = nx.a(sb, true);
                                                                            op3Var.i = true;
                                                                        } else {
                                                                            if ("ruby-position".equals(a2)) {
                                                                                if ("over".equals(sb)) {
                                                                                    op3Var.p = 1;
                                                                                } else if ("under".equals(sb)) {
                                                                                    op3Var.p = 2;
                                                                                    c = 2;
                                                                                    i2 = 1;
                                                                                }
                                                                            } else if ("text-combine-upright".equals(a2)) {
                                                                                op3Var.q = "all".equals(sb) || sb.startsWith("digits");
                                                                            } else if ("text-decoration".equals(a2)) {
                                                                                if (TtmlNode.UNDERLINE.equals(sb)) {
                                                                                    i2 = 1;
                                                                                    op3Var.k = 1;
                                                                                }
                                                                            } else if ("font-family".equals(a2)) {
                                                                                op3Var.e = ki.a(sb);
                                                                            } else if (!"font-weight".equals(a2)) {
                                                                                i2 = 1;
                                                                                if ("font-style".equals(a2)) {
                                                                                    if (TtmlNode.ITALIC.equals(sb)) {
                                                                                        op3Var.m = 1;
                                                                                    }
                                                                                } else if ("font-size".equals(a2)) {
                                                                                    Matcher matcher2 = np3.d.matcher(ki.a(sb));
                                                                                    if (matcher2.matches()) {
                                                                                        String group2 = matcher2.group(2);
                                                                                        group2.getClass();
                                                                                        switch (group2.hashCode()) {
                                                                                            case 37:
                                                                                                if (group2.equals("%")) {
                                                                                                    c2 = 0;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 3240:
                                                                                                if (group2.equals("em")) {
                                                                                                    c2 = 1;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            case 3592:
                                                                                                if (group2.equals("px")) {
                                                                                                    c2 = 2;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                        c2 = 65535;
                                                                                        switch (c2) {
                                                                                            case 0:
                                                                                                c = 2;
                                                                                                i2 = 1;
                                                                                                op3Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                c = 2;
                                                                                                i2 = 1;
                                                                                                op3Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i2 = 1;
                                                                                                op3Var.n = 1;
                                                                                                c = 2;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String group3 = matcher2.group(i2);
                                                                                        group3.getClass();
                                                                                        op3Var.o = Float.parseFloat(group3);
                                                                                    } else {
                                                                                        ji1.d("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                                    }
                                                                                }
                                                                            } else if (TtmlNode.BOLD.equals(sb)) {
                                                                                i2 = 1;
                                                                                op3Var.l = 1;
                                                                            }
                                                                            c3 = c;
                                                                            i8 = i2;
                                                                            i16 = i18;
                                                                            np3Var2 = np3Var;
                                                                            str4 = str2;
                                                                            i4 = 0;
                                                                        }
                                                                    }
                                                                }
                                                                c = 2;
                                                                i2 = 1;
                                                                c3 = c;
                                                                i8 = i2;
                                                                i16 = i18;
                                                                np3Var2 = np3Var;
                                                                str4 = str2;
                                                                i4 = 0;
                                                            } else {
                                                                np3Var = np3Var2;
                                                                str2 = b2;
                                                                i2 = i8;
                                                            }
                                                            c = 2;
                                                            c3 = c;
                                                            i8 = i2;
                                                            i16 = i18;
                                                            np3Var2 = np3Var;
                                                            str4 = str2;
                                                            i4 = 0;
                                                        }
                                                    }
                                                    np3Var = np3Var2;
                                                    str2 = b2;
                                                    c = c3;
                                                    i2 = i8;
                                                    c3 = c;
                                                    i8 = i2;
                                                    i16 = i18;
                                                    np3Var2 = np3Var;
                                                    str4 = str2;
                                                    i4 = 0;
                                                }
                                                np3 np3Var3 = np3Var2;
                                                char c5 = c3;
                                                int i21 = i8;
                                                if ("}".equals(str4)) {
                                                    arrayList3.add(op3Var);
                                                }
                                                c3 = c5;
                                                i8 = i21;
                                                np3Var2 = np3Var3;
                                                i4 = 0;
                                                i5 = -1;
                                            }
                                        }
                                    }
                                    str = null;
                                    if (str == null) {
                                    }
                                }
                            } else if (i7 == 3) {
                                kc2 kc2Var8 = this.m;
                                Pattern pattern = up3.a;
                                String c6 = kc2Var8.c();
                                if (c6 == null) {
                                    pp3Var = null;
                                } else {
                                    Pattern pattern2 = up3.a;
                                    Matcher matcher3 = pattern2.matcher(c6);
                                    if (matcher3.matches()) {
                                        a = up3.a(null, matcher3, kc2Var8, arrayList);
                                    } else {
                                        pp3Var = null;
                                        String c7 = kc2Var8.c();
                                        if (c7 != null) {
                                            Matcher matcher4 = pattern2.matcher(c7);
                                            if (matcher4.matches()) {
                                                a = up3.a(c6.trim(), matcher4, kc2Var8, arrayList);
                                            }
                                        }
                                    }
                                    if (a != null) {
                                        arrayList2.add(a);
                                    }
                                }
                                a = pp3Var;
                                if (a != null) {
                                }
                            }
                            i4 = 0;
                        }
                    }
                }
            }
        } catch (pc2 e) {
            throw new x53(e);
        }
    }
}
