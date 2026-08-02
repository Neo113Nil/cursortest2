package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.aa2;
import yads.w23;

/* loaded from: classes7.dex */
public final class cj81 extends zt71 {
    public final dl81 m = new dl81();
    public final ft71 n = new ft71();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0361, code lost:
    
        r3.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0109, code lost:
    
        if (ru.CryptoPro.JCP.tools.CertReader.Extension.C_BRAKE.equals(defpackage.ft71.c(r6, r11)) == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03b7  */
    @Override // defpackage.zt71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fh81 c(int i, byte[] bArr, boolean z) {
        oz71 oz71Var;
        oz71 b;
        String str;
        String sb;
        char c;
        int i2;
        int i3;
        cj81 cj81Var = this;
        dl81 dl81Var = cj81Var.m;
        dl81Var.a = bArr;
        dl81Var.c = i;
        int i4 = 0;
        dl81Var.b = 0;
        ArrayList arrayList = new ArrayList();
        try {
            im81.b(dl81Var);
            while (!TextUtils.isEmpty(dl81Var.f())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i5 = -1;
                int i6 = i4;
                int i7 = -1;
                while (true) {
                    int i8 = 1;
                    if (i7 == -1) {
                        i6 = dl81Var.b;
                        String f = dl81Var.f();
                        i7 = f == null ? i4 : "STYLE".equals(f) ? 2 : f.startsWith("NOTE") ? 1 : 3;
                    } else {
                        dl81Var.m(i6);
                        if (i7 == 0) {
                            return new rw41(arrayList2, 1);
                        }
                        if (i7 == 1) {
                            while (!TextUtils.isEmpty(dl81Var.f())) {
                            }
                        } else {
                            if (i7 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new w23("A style block was found after the first cue.");
                                }
                                dl81Var.f();
                                ft71 ft71Var = cj81Var.n;
                                StringBuilder sb2 = ft71Var.b;
                                dl81 dl81Var2 = ft71Var.a;
                                sb2.setLength(i4);
                                int i9 = dl81Var.b;
                                while (!TextUtils.isEmpty(dl81Var.f())) {
                                }
                                byte[] bArr2 = dl81Var.a;
                                int i10 = dl81Var.b;
                                dl81Var2.a = bArr2;
                                dl81Var2.c = i10;
                                dl81Var2.b = i4;
                                dl81Var2.m(i9);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    ft71.b(dl81Var2);
                                    if (dl81Var2.c - dl81Var2.b >= 5 && "::cue".equals(dl81Var2.b(5, md81.c))) {
                                        int i11 = dl81Var2.b;
                                        String c2 = ft71.c(dl81Var2, sb2);
                                        if (c2 != null) {
                                            if ("{".equals(c2)) {
                                                dl81Var2.m(i11);
                                                str = "";
                                            } else if (Extension.O_BRAKE.equals(c2)) {
                                                int i12 = dl81Var2.b;
                                                int i13 = dl81Var2.c;
                                                while (true) {
                                                    for (int i14 = i4; i12 < i13 && i14 == 0; i14 = i8) {
                                                        i3 = i12 + 1;
                                                        if (((char) dl81Var2.a[i12]) == ')') {
                                                            i12 = i3;
                                                        }
                                                    }
                                                    i12 = i3;
                                                }
                                                str = dl81Var2.b((i12 - 1) - dl81Var2.b, md81.c).trim();
                                            } else {
                                                str = null;
                                            }
                                            if (str == null && "{".equals(ft71.c(dl81Var2, sb2))) {
                                                kw71 kw71Var = new kw71();
                                                if (!"".equals(str)) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i5) {
                                                        Matcher matcher = ft71.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i8);
                                                            group.getClass();
                                                            kw71Var.d = group;
                                                        }
                                                        str = str.substring(i4, indexOf);
                                                    }
                                                    int i15 = rf71.a;
                                                    String[] split = str.split("\\.", i5);
                                                    String str2 = split[i4];
                                                    int indexOf2 = str2.indexOf(35);
                                                    if (indexOf2 != i5) {
                                                        kw71Var.b = str2.substring(i4, indexOf2);
                                                        kw71Var.a = str2.substring(indexOf2 + 1);
                                                    } else {
                                                        kw71Var.b = str2;
                                                    }
                                                    if (split.length > i8) {
                                                        int length = split.length;
                                                        if (length > split.length) {
                                                            w511.q();
                                                            return null;
                                                        }
                                                        kw71Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i8, length)));
                                                    }
                                                }
                                                String str3 = null;
                                                int i16 = i4;
                                                while (i16 == 0) {
                                                    int i17 = dl81Var2.b;
                                                    str3 = ft71.c(dl81Var2, sb2);
                                                    int i18 = (str3 == null || "}".equals(str3)) ? i8 : i4;
                                                    if (i18 == 0) {
                                                        dl81Var2.m(i17);
                                                        ft71.b(dl81Var2);
                                                        String a = ft71.a(dl81Var2, sb2);
                                                        if (!"".equals(a) && ":".equals(ft71.c(dl81Var2, sb2))) {
                                                            ft71.b(dl81Var2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z2 = false;
                                                            while (true) {
                                                                if (z2) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i19 = dl81Var2.b;
                                                                    boolean z3 = z2;
                                                                    String c3 = ft71.c(dl81Var2, sb2);
                                                                    if (c3 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(c3) || ";".equals(c3)) {
                                                                        dl81Var2.m(i19);
                                                                        z2 = true;
                                                                    } else {
                                                                        sb3.append(c3);
                                                                        z2 = z3;
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !"".equals(sb)) {
                                                                int i20 = dl81Var2.b;
                                                                String c4 = ft71.c(dl81Var2, sb2);
                                                                if (!";".equals(c4)) {
                                                                    if ("}".equals(c4)) {
                                                                        dl81Var2.m(i20);
                                                                    }
                                                                }
                                                                if ("color".equals(a)) {
                                                                    kw71Var.f = y291.a(sb, true);
                                                                    kw71Var.g = true;
                                                                } else if ("background-color".equals(a)) {
                                                                    kw71Var.h = y291.a(sb, true);
                                                                    kw71Var.i = true;
                                                                } else {
                                                                    if ("ruby-position".equals(a)) {
                                                                        if ("over".equals(sb)) {
                                                                            kw71Var.p = 1;
                                                                        } else if ("under".equals(sb)) {
                                                                            kw71Var.p = 2;
                                                                        }
                                                                    } else if ("text-combine-upright".equals(a)) {
                                                                        kw71Var.q = "all".equals(sb) || sb.startsWith("digits");
                                                                    } else if ("text-decoration".equals(a)) {
                                                                        if ("underline".equals(sb)) {
                                                                            kw71Var.k = 1;
                                                                        }
                                                                    } else if ("font-family".equals(a)) {
                                                                        kw71Var.e = tea1.a(sb);
                                                                    } else if ("font-weight".equals(a)) {
                                                                        if ("bold".equals(sb)) {
                                                                            kw71Var.l = 1;
                                                                        }
                                                                    } else if ("font-style".equals(a)) {
                                                                        if ("italic".equals(sb)) {
                                                                            kw71Var.m = 1;
                                                                        }
                                                                    } else if ("font-size".equals(a)) {
                                                                        Matcher matcher2 = ft71.d.matcher(tea1.a(sb));
                                                                        if (matcher2.matches()) {
                                                                            String group2 = matcher2.group(2);
                                                                            group2.getClass();
                                                                            switch (group2.hashCode()) {
                                                                                case 37:
                                                                                    if (group2.equals("%")) {
                                                                                        c = 0;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                case 3240:
                                                                                    if (group2.equals("em")) {
                                                                                        c = 1;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                case 3592:
                                                                                    if (group2.equals("px")) {
                                                                                        c = 2;
                                                                                        break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    break;
                                                                                default:
                                                                                    c = 65535;
                                                                                    break;
                                                                            }
                                                                            switch (c) {
                                                                                case 0:
                                                                                    i2 = 1;
                                                                                    kw71Var.n = 3;
                                                                                    break;
                                                                                case 1:
                                                                                    i2 = 1;
                                                                                    kw71Var.n = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    i2 = 1;
                                                                                    kw71Var.n = 1;
                                                                                    break;
                                                                                default:
                                                                                    ny61.k();
                                                                                    return null;
                                                                            }
                                                                            String group3 = matcher2.group(i2);
                                                                            group3.getClass();
                                                                            kw71Var.o = Float.parseFloat(group3);
                                                                        } else {
                                                                            nba1.e();
                                                                        }
                                                                    }
                                                                    i16 = i18;
                                                                    i4 = 0;
                                                                    i8 = 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i16 = i18;
                                                    i4 = 0;
                                                    i8 = 1;
                                                }
                                                if ("}".equals(str3)) {
                                                    arrayList3.add(kw71Var);
                                                }
                                                i4 = 0;
                                                i5 = -1;
                                                i8 = 1;
                                            }
                                        }
                                    }
                                    str = null;
                                    if (str == null) {
                                    }
                                }
                            } else if (i7 == 3) {
                                Pattern pattern = vf81.a;
                                String f2 = dl81Var.f();
                                if (f2 == null) {
                                    oz71Var = null;
                                } else {
                                    Pattern pattern2 = vf81.a;
                                    Matcher matcher3 = pattern2.matcher(f2);
                                    if (matcher3.matches()) {
                                        b = vf81.b(null, matcher3, dl81Var, arrayList);
                                    } else {
                                        oz71Var = null;
                                        String f3 = dl81Var.f();
                                        if (f3 != null) {
                                            Matcher matcher4 = pattern2.matcher(f3);
                                            if (matcher4.matches()) {
                                                b = vf81.b(f2.trim(), matcher4, dl81Var, arrayList);
                                            }
                                        }
                                    }
                                    if (b != null) {
                                        arrayList2.add(b);
                                    }
                                }
                                b = oz71Var;
                                if (b != null) {
                                }
                            }
                            cj81Var = this;
                            i4 = 0;
                        }
                    }
                }
            }
        } catch (aa2 e) {
            throw new w23(e);
        }
    }
}
