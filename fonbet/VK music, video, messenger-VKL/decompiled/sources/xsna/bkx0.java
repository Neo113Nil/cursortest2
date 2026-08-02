package xsna;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.a1n0;

/* compiled from: WebvttParser.java */
/* loaded from: classes12.dex */
public final class bkx0 implements a1n0 {
    public final xi90 a = new xi90();
    public final vjx0 b = new vjx0();

    /* JADX WARN: Code restructure failed: missing block: B:195:0x037e, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x010f, code lost:
    
        if (")".equals(xsna.vjx0.b(r11, r6)) == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a1n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i, int i2, a1n0.b bVar, j7j<wkk> j7jVar) {
        xjx0 xjx0Var;
        String str;
        int i3;
        char c;
        String sb;
        int i4;
        char c2;
        bkx0 bkx0Var = this;
        xi90 xi90Var = bkx0Var.a;
        xi90Var.N(bArr, i + i2);
        xi90Var.P(i);
        ArrayList arrayList = new ArrayList();
        try {
            ckx0.d(xi90Var);
            while (!TextUtils.isEmpty(xi90Var.q(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i5 = 0;
                int i6 = -1;
                int i7 = 0;
                char c3 = 65535;
                while (true) {
                    int i8 = 1;
                    char c4 = 2;
                    if (c3 == 65535) {
                        i7 = xi90Var.b;
                        String q = xi90Var.q(StandardCharsets.UTF_8);
                        c3 = q == null ? (char) 0 : "STYLE".equals(q) ? (char) 2 : q.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        xi90Var.P(i7);
                        if (c3 == 0) {
                            i1z.b(new ekx0(arrayList2), bVar, j7jVar);
                            return;
                        }
                        if (c3 == 1) {
                            while (!TextUtils.isEmpty(xi90Var.q(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            if (c3 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                xi90Var.q(StandardCharsets.UTF_8);
                                vjx0 vjx0Var = bkx0Var.b;
                                xi90 xi90Var2 = vjx0Var.a;
                                StringBuilder sb2 = vjx0Var.b;
                                sb2.setLength(0);
                                int i9 = xi90Var.b;
                                while (!TextUtils.isEmpty(xi90Var.q(StandardCharsets.UTF_8))) {
                                }
                                xi90Var2.N(xi90Var.a, xi90Var.b);
                                xi90Var2.P(i9);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    vjx0.c(xi90Var2);
                                    if (xi90Var2.a() >= 5 && "::cue".equals(xi90Var2.A(5, StandardCharsets.UTF_8))) {
                                        int i10 = xi90Var2.b;
                                        String b = vjx0.b(xi90Var2, sb2);
                                        if (b != null) {
                                            if ("{".equals(b)) {
                                                xi90Var2.P(i10);
                                                str = "";
                                            } else if ("(".equals(b)) {
                                                int i11 = xi90Var2.b;
                                                int i12 = xi90Var2.c;
                                                int i13 = i5;
                                                while (i11 < i12 && i13 == 0) {
                                                    int i14 = i11 + 1;
                                                    int i15 = ((char) xi90Var2.a[i11]) == ')' ? i8 : i5;
                                                    i11 = i14;
                                                    i13 = i15;
                                                }
                                                str = xi90Var2.A((i11 - 1) - xi90Var2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = null;
                                            }
                                            if (str == null && "{".equals(vjx0.b(xi90Var2, sb2))) {
                                                wjx0 wjx0Var = new wjx0();
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i6) {
                                                        Matcher matcher = vjx0.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i8);
                                                            group.getClass();
                                                            wjx0Var.d = group;
                                                        }
                                                        str = str.substring(i5, indexOf);
                                                    }
                                                    String str2 = y2r0.a;
                                                    String[] split = str.split("\\.", i6);
                                                    String str3 = split[i5];
                                                    int indexOf2 = str3.indexOf(35);
                                                    if (indexOf2 != i6) {
                                                        wjx0Var.b = str3.substring(i5, indexOf2);
                                                        wjx0Var.a = str3.substring(indexOf2 + 1);
                                                    } else {
                                                        wjx0Var.b = str3;
                                                    }
                                                    if (split.length > i8) {
                                                        int length = split.length;
                                                        fxc0.p(length <= split.length ? i8 : i5);
                                                        wjx0Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i8, length)));
                                                    }
                                                }
                                                int i16 = i5;
                                                String str4 = null;
                                                while (i16 == 0) {
                                                    int i17 = xi90Var2.b;
                                                    str4 = vjx0.b(xi90Var2, sb2);
                                                    int i18 = (str4 == null || "}".equals(str4)) ? i8 : i5;
                                                    if (i18 == 0) {
                                                        xi90Var2.P(i17);
                                                        vjx0.c(xi90Var2);
                                                        String a = vjx0.a(xi90Var2, sb2);
                                                        if (!a.isEmpty() && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(vjx0.b(xi90Var2, sb2))) {
                                                            vjx0.c(xi90Var2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z = false;
                                                            while (true) {
                                                                if (z) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i19 = xi90Var2.b;
                                                                    String b2 = vjx0.b(xi90Var2, sb2);
                                                                    if (b2 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b2) || ";".equals(b2)) {
                                                                        xi90Var2.P(i19);
                                                                        z = true;
                                                                    } else {
                                                                        sb3.append(b2);
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !sb.isEmpty()) {
                                                                int i20 = xi90Var2.b;
                                                                String b3 = vjx0.b(xi90Var2, sb2);
                                                                if (!";".equals(b3)) {
                                                                    if ("}".equals(b3)) {
                                                                        xi90Var2.P(i20);
                                                                    }
                                                                }
                                                                if ("color".equals(a)) {
                                                                    i4 = 1;
                                                                    wjx0Var.f = c7g.a(sb, true);
                                                                    wjx0Var.g = true;
                                                                } else {
                                                                    i4 = 1;
                                                                    if ("background-color".equals(a)) {
                                                                        wjx0Var.h = c7g.a(sb, true);
                                                                        wjx0Var.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a)) {
                                                                            if ("over".equals(sb)) {
                                                                                wjx0Var.p = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                wjx0Var.p = 2;
                                                                                c = 2;
                                                                                i3 = 1;
                                                                                i8 = i3;
                                                                                c4 = c;
                                                                                i16 = i18;
                                                                                i5 = 0;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a)) {
                                                                            wjx0Var.q = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a)) {
                                                                            if (TtmlNode.UNDERLINE.equals(sb)) {
                                                                                i4 = 1;
                                                                                wjx0Var.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a)) {
                                                                            wjx0Var.e = o19.u(sb);
                                                                        } else if (!"font-weight".equals(a)) {
                                                                            i4 = 1;
                                                                            if ("font-style".equals(a)) {
                                                                                if (TtmlNode.ITALIC.equals(sb)) {
                                                                                    wjx0Var.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a)) {
                                                                                Matcher matcher2 = vjx0.d.matcher(o19.u(sb));
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
                                                                                            i3 = 1;
                                                                                            c = 2;
                                                                                            wjx0Var.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            i3 = 1;
                                                                                            c = 2;
                                                                                            wjx0Var.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            i3 = 1;
                                                                                            wjx0Var.n = 1;
                                                                                            c = 2;
                                                                                            break;
                                                                                        default:
                                                                                            throw new IllegalStateException();
                                                                                    }
                                                                                    String group3 = matcher2.group(i3);
                                                                                    group3.getClass();
                                                                                    wjx0Var.o = Float.parseFloat(group3);
                                                                                    i8 = i3;
                                                                                    c4 = c;
                                                                                    i16 = i18;
                                                                                    i5 = 0;
                                                                                } else {
                                                                                    ahn.F("Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if (TtmlNode.BOLD.equals(sb)) {
                                                                            i4 = 1;
                                                                            wjx0Var.l = 1;
                                                                        }
                                                                        c = 2;
                                                                        i8 = i3;
                                                                        c4 = c;
                                                                        i16 = i18;
                                                                        i5 = 0;
                                                                    }
                                                                }
                                                                i3 = i4;
                                                                c = 2;
                                                                i8 = i3;
                                                                c4 = c;
                                                                i16 = i18;
                                                                i5 = 0;
                                                            }
                                                            i3 = 1;
                                                            c = 2;
                                                            i8 = i3;
                                                            c4 = c;
                                                            i16 = i18;
                                                            i5 = 0;
                                                        }
                                                    }
                                                    i3 = i8;
                                                    c = c4;
                                                    i8 = i3;
                                                    c4 = c;
                                                    i16 = i18;
                                                    i5 = 0;
                                                }
                                                int i21 = i8;
                                                char c5 = c4;
                                                if ("}".equals(str4)) {
                                                    arrayList3.add(wjx0Var);
                                                }
                                                i8 = i21;
                                                c4 = c5;
                                                i5 = 0;
                                                i6 = -1;
                                            }
                                        }
                                    }
                                    str = null;
                                    if (str == null) {
                                    }
                                }
                            } else if (c3 == 3) {
                                Pattern pattern = zjx0.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String q2 = xi90Var.q(charset);
                                if (q2 == null) {
                                    xjx0Var = null;
                                } else {
                                    Pattern pattern2 = zjx0.a;
                                    Matcher matcher3 = pattern2.matcher(q2);
                                    if (matcher3.matches()) {
                                        xjx0Var = zjx0.d(null, matcher3, xi90Var, arrayList);
                                    } else {
                                        xjx0Var = null;
                                        String q3 = xi90Var.q(charset);
                                        if (q3 != null) {
                                            Matcher matcher4 = pattern2.matcher(q3);
                                            if (matcher4.matches()) {
                                                xjx0Var = zjx0.d(q2.trim(), matcher4, xi90Var, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (xjx0Var != null) {
                                    arrayList2.add(xjx0Var);
                                }
                            }
                            bkx0Var = this;
                        }
                    }
                }
            }
        } catch (ParserException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // xsna.a1n0
    public final int b() {
        return 1;
    }
}
