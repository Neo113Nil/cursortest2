package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class pw41 implements q2v0 {
    public final ef90 a = new ef90();
    public final hw41 b = new hw41();

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0381, code lost:
    
        r1.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0111, code lost:
    
        if (ru.CryptoPro.JCP.tools.CertReader.Extension.C_BRAKE.equals(defpackage.hw41.b(r11, r6)) == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q2v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        jw41 jw41Var;
        String str;
        int i3;
        String sb;
        int i4;
        char c;
        pw41 pw41Var = this;
        ef90 ef90Var = pw41Var.a;
        ef90Var.I(i + i2, bArr);
        ef90Var.K(i);
        ArrayList arrayList = new ArrayList();
        try {
            qw41.d(ef90Var);
            while (!TextUtils.isEmpty(ef90Var.l(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i5 = 0;
                int i6 = -1;
                int i7 = 0;
                char c2 = 65535;
                while (true) {
                    int i8 = 1;
                    if (c2 == 65535) {
                        i7 = ef90Var.b;
                        String l = ef90Var.l(StandardCharsets.UTF_8);
                        c2 = l == null ? (char) 0 : "STYLE".equals(l) ? (char) 2 : l.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        ef90Var.K(i7);
                        if (c2 == 0) {
                            ydb1.d(new rw41(arrayList2, 0), p2v0Var, c9eVar);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(ef90Var.l(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    ny61.g("A style block was found after the first cue.");
                                    return;
                                }
                                ef90Var.l(StandardCharsets.UTF_8);
                                hw41 hw41Var = pw41Var.b;
                                ef90 ef90Var2 = hw41Var.a;
                                StringBuilder sb2 = hw41Var.b;
                                sb2.setLength(0);
                                int i9 = ef90Var.b;
                                while (!TextUtils.isEmpty(ef90Var.l(StandardCharsets.UTF_8))) {
                                }
                                ef90Var2.I(ef90Var.b, ef90Var.a);
                                ef90Var2.K(i9);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    hw41.c(ef90Var2);
                                    if (ef90Var2.a() >= 5 && "::cue".equals(ef90Var2.w(5, StandardCharsets.UTF_8))) {
                                        int i10 = ef90Var2.b;
                                        String b = hw41.b(ef90Var2, sb2);
                                        if (b != null) {
                                            if ("{".equals(b)) {
                                                ef90Var2.K(i10);
                                                str = "";
                                            } else if (Extension.O_BRAKE.equals(b)) {
                                                int i11 = ef90Var2.b;
                                                int i12 = ef90Var2.c;
                                                int i13 = i5;
                                                while (i11 < i12 && i13 == 0) {
                                                    int i14 = i11 + 1;
                                                    i13 = ((char) ef90Var2.a[i11]) == ')' ? i8 : i5;
                                                    i11 = i14;
                                                }
                                                str = ef90Var2.w((i11 - 1) - ef90Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = null;
                                            }
                                            if (str == null && "{".equals(hw41.b(ef90Var2, sb2))) {
                                                iw41 iw41Var = new iw41();
                                                if (!"".equals(str)) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i6) {
                                                        Matcher matcher = hw41.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i8);
                                                            group.getClass();
                                                            iw41Var.d = group;
                                                        }
                                                        str = str.substring(i5, indexOf);
                                                    }
                                                    int i15 = tw21.a;
                                                    String[] split = str.split("\\.", i6);
                                                    String str2 = split[i5];
                                                    int indexOf2 = str2.indexOf(35);
                                                    if (indexOf2 != i6) {
                                                        iw41Var.b = str2.substring(i5, indexOf2);
                                                        iw41Var.a = str2.substring(indexOf2 + 1);
                                                    } else {
                                                        iw41Var.b = str2;
                                                    }
                                                    if (split.length > i8) {
                                                        int length = split.length;
                                                        d6z.l(length <= split.length ? i8 : i5);
                                                        iw41Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i8, length)));
                                                    }
                                                }
                                                int i16 = i5;
                                                String str3 = null;
                                                while (i16 == 0) {
                                                    int i17 = ef90Var2.b;
                                                    str3 = hw41.b(ef90Var2, sb2);
                                                    int i18 = (str3 == null || "}".equals(str3)) ? i8 : i5;
                                                    if (i18 == 0) {
                                                        ef90Var2.K(i17);
                                                        hw41.c(ef90Var2);
                                                        String a = hw41.a(ef90Var2, sb2);
                                                        if (!"".equals(a) && ":".equals(hw41.b(ef90Var2, sb2))) {
                                                            hw41.c(ef90Var2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z = false;
                                                            while (true) {
                                                                if (z) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i19 = ef90Var2.b;
                                                                    boolean z2 = z;
                                                                    String b2 = hw41.b(ef90Var2, sb2);
                                                                    if (b2 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b2) || ";".equals(b2)) {
                                                                        ef90Var2.K(i19);
                                                                        z = true;
                                                                    } else {
                                                                        sb3.append(b2);
                                                                        z = z2;
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !"".equals(sb)) {
                                                                int i20 = ef90Var2.b;
                                                                String b3 = hw41.b(ef90Var2, sb2);
                                                                if (!";".equals(b3)) {
                                                                    if ("}".equals(b3)) {
                                                                        ef90Var2.K(i20);
                                                                    }
                                                                }
                                                                if ("color".equals(a)) {
                                                                    i4 = 1;
                                                                    iw41Var.f = wfc.a(sb, true);
                                                                    iw41Var.g = true;
                                                                } else {
                                                                    i4 = 1;
                                                                    if ("background-color".equals(a)) {
                                                                        iw41Var.h = wfc.a(sb, true);
                                                                        iw41Var.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a)) {
                                                                            if ("over".equals(sb)) {
                                                                                iw41Var.p = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                iw41Var.p = 2;
                                                                                i3 = 1;
                                                                                i8 = i3;
                                                                                i16 = i18;
                                                                                i5 = 0;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a)) {
                                                                            iw41Var.q = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i4 = 1;
                                                                                iw41Var.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a)) {
                                                                            iw41Var.e = f0b1.g(sb);
                                                                        } else if (!"font-weight".equals(a)) {
                                                                            i4 = 1;
                                                                            if ("font-style".equals(a)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    iw41Var.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a)) {
                                                                                Matcher matcher2 = hw41.d.matcher(f0b1.g(sb));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    switch (c) {
                                                                                        case 0:
                                                                                            i3 = 1;
                                                                                            iw41Var.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i3 = 1;
                                                                                            iw41Var.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i3 = 1;
                                                                                            iw41Var.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            ny61.k();
                                                                                            return;
                                                                                    }
                                                                                    String group3 = matcher2.group(i3);
                                                                                    group3.getClass();
                                                                                    iw41Var.o = Float.parseFloat(group3);
                                                                                    i8 = i3;
                                                                                    i16 = i18;
                                                                                    i5 = 0;
                                                                                } else {
                                                                                    lk91.j("Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i4 = 1;
                                                                            iw41Var.l = 1;
                                                                        }
                                                                        i8 = i3;
                                                                        i16 = i18;
                                                                        i5 = 0;
                                                                    }
                                                                }
                                                                i3 = i4;
                                                                i8 = i3;
                                                                i16 = i18;
                                                                i5 = 0;
                                                            }
                                                            i3 = 1;
                                                            i8 = i3;
                                                            i16 = i18;
                                                            i5 = 0;
                                                        }
                                                    }
                                                    i3 = i8;
                                                    i8 = i3;
                                                    i16 = i18;
                                                    i5 = 0;
                                                }
                                                int i21 = i8;
                                                if ("}".equals(str3)) {
                                                    arrayList3.add(iw41Var);
                                                }
                                                i8 = i21;
                                                i5 = 0;
                                                i6 = -1;
                                            }
                                        }
                                    }
                                    str = null;
                                    if (str == null) {
                                    }
                                }
                            } else if (c2 == 3) {
                                Pattern pattern = nw41.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String l2 = ef90Var.l(charset);
                                if (l2 == null) {
                                    jw41Var = null;
                                } else {
                                    Pattern pattern2 = nw41.a;
                                    Matcher matcher3 = pattern2.matcher(l2);
                                    if (matcher3.matches()) {
                                        jw41Var = nw41.d(null, matcher3, ef90Var, arrayList);
                                    } else {
                                        jw41Var = null;
                                        String l3 = ef90Var.l(charset);
                                        if (l3 != null) {
                                            Matcher matcher4 = pattern2.matcher(l3);
                                            if (matcher4.matches()) {
                                                jw41Var = nw41.d(l2.trim(), matcher4, ef90Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (jw41Var != null) {
                                    arrayList2.add(jw41Var);
                                }
                            }
                            pw41Var = this;
                        }
                    }
                }
            }
        } catch (ParserException e) {
            yci0.r(e);
        }
    }

    @Override // defpackage.q2v0
    public final int f() {
        return 1;
    }
}
