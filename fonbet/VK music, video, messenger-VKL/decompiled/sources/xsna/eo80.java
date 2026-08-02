package xsna;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.a1n0;

/* compiled from: OneVideoWebvttParser.java */
/* loaded from: classes8.dex */
public final class eo80 implements a1n0 {
    public final xi90 a = new xi90();
    public final bo80 b = new bo80();

    /* JADX WARN: Code restructure failed: missing block: B:201:0x03a7, code lost:
    
        r0.addAll(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0120, code lost:
    
        if (")".equals(xsna.bo80.b(r13, r8)) == false) goto L39;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    @Override // xsna.a1n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(byte[] bArr, int i, int i2, a1n0.b bVar, j7j<wkk> j7jVar) {
        int nextEventTimeIndex;
        boolean z;
        int i3;
        ArrayList arrayList;
        String str;
        int i4;
        String str2;
        int i5;
        String sb;
        boolean z2;
        char c;
        int i6;
        eo80 eo80Var = this;
        xi90 xi90Var = eo80Var.a;
        xi90Var.N(bArr, i + i2);
        xi90Var.P(i);
        ArrayList arrayList2 = new ArrayList();
        try {
            ckx0.d(xi90Var);
            while (!TextUtils.isEmpty(xi90Var.q(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList3 = new ArrayList();
            while (true) {
                int i7 = 0;
                int i8 = -1;
                int i9 = 0;
                char c2 = 65535;
                while (true) {
                    int i10 = 1;
                    if (c2 == 65535) {
                        i9 = xi90Var.b;
                        String q = xi90Var.q(StandardCharsets.UTF_8);
                        c2 = q == null ? (char) 0 : "STYLE".equals(q) ? (char) 2 : q.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        xi90Var.P(i9);
                        if (c2 == 0) {
                            fo80 fo80Var = new fo80(arrayList3);
                            long j = bVar.a;
                            long[] jArr = fo80Var.d;
                            if (j == C.TIME_UNSET) {
                                nextEventTimeIndex = 0;
                            } else {
                                nextEventTimeIndex = fo80Var.getNextEventTimeIndex(j);
                                if (nextEventTimeIndex == -1) {
                                    nextEventTimeIndex = jArr.length;
                                } else if (nextEventTimeIndex > 0 && fo80Var.getEventTime(nextEventTimeIndex - 1) == j) {
                                    nextEventTimeIndex--;
                                }
                            }
                            if (j != C.TIME_UNSET) {
                                List<rkk> cues = fo80Var.getCues(j);
                                long eventTime = fo80Var.getEventTime(nextEventTimeIndex);
                                if (!((ArrayList) cues).isEmpty() && nextEventTimeIndex < jArr.length) {
                                    long j2 = bVar.a;
                                    if (j2 < eventTime) {
                                        j7jVar.accept(new wkk(cues, j2, eventTime - j2));
                                        z = true;
                                        for (i3 = nextEventTimeIndex; i3 < jArr.length; i3++) {
                                            if (Thread.currentThread().isInterrupted()) {
                                                return;
                                            }
                                            ll80.a(fo80Var, i3, j7jVar);
                                        }
                                        if (bVar.b) {
                                            return;
                                        }
                                        if (z) {
                                            nextEventTimeIndex--;
                                        }
                                        for (int i11 = 0; i11 < nextEventTimeIndex; i11++) {
                                            if (Thread.currentThread().isInterrupted()) {
                                                return;
                                            }
                                            ll80.a(fo80Var, i11, j7jVar);
                                        }
                                        if (z) {
                                            j7jVar.accept(new wkk(fo80Var.getCues(j), fo80Var.getEventTime(nextEventTimeIndex), j - fo80Var.getEventTime(nextEventTimeIndex)));
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            z = false;
                            while (i3 < jArr.length) {
                            }
                            if (bVar.b) {
                            }
                        } else {
                            if (Thread.currentThread().isInterrupted()) {
                                return;
                            }
                            if (c2 == 1) {
                                while (!TextUtils.isEmpty(xi90Var.q(StandardCharsets.UTF_8))) {
                                }
                            } else {
                                if (c2 == 2) {
                                    if (!arrayList3.isEmpty()) {
                                        throw new IllegalArgumentException("A style block was found after the first cue.");
                                    }
                                    xi90Var.q(StandardCharsets.UTF_8);
                                    bo80 bo80Var = eo80Var.b;
                                    xi90 xi90Var2 = bo80Var.a;
                                    StringBuilder sb2 = bo80Var.b;
                                    sb2.setLength(0);
                                    int i12 = xi90Var.b;
                                    while (!TextUtils.isEmpty(xi90Var.q(StandardCharsets.UTF_8))) {
                                    }
                                    xi90Var2.N(xi90Var.a, xi90Var.b);
                                    xi90Var2.P(i12);
                                    ArrayList arrayList4 = new ArrayList();
                                    while (true) {
                                        bo80.c(xi90Var2);
                                        if (xi90Var2.a() >= 5 && "::cue".equals(xi90Var2.A(5, StandardCharsets.UTF_8))) {
                                            int i13 = xi90Var2.b;
                                            String b = bo80.b(xi90Var2, sb2);
                                            if (b != null) {
                                                if ("{".equals(b)) {
                                                    xi90Var2.P(i13);
                                                    str = "";
                                                } else if ("(".equals(b)) {
                                                    int i14 = xi90Var2.b;
                                                    int i15 = xi90Var2.c;
                                                    int i16 = i7;
                                                    while (i14 < i15 && i16 == 0) {
                                                        int i17 = i14 + 1;
                                                        i16 = ((char) xi90Var2.a[i14]) == ')' ? i10 : 0;
                                                        i14 = i17;
                                                    }
                                                    str = xi90Var2.A((i14 - 1) - xi90Var2.b, StandardCharsets.UTF_8).trim();
                                                } else {
                                                    str = null;
                                                }
                                                if (str == null && "{".equals(bo80.b(xi90Var2, sb2))) {
                                                    wjx0 wjx0Var = new wjx0();
                                                    if ("".equals(str)) {
                                                        i4 = 0;
                                                    } else {
                                                        int indexOf = str.indexOf(91);
                                                        if (indexOf != i8) {
                                                            Matcher matcher = bo80.c.matcher(str.substring(indexOf));
                                                            if (matcher.matches()) {
                                                                String group = matcher.group(i10);
                                                                group.getClass();
                                                                wjx0Var.d = group;
                                                            }
                                                            i4 = 0;
                                                            str = str.substring(0, indexOf);
                                                        } else {
                                                            i4 = 0;
                                                        }
                                                        String str3 = y2r0.a;
                                                        String[] split = str.split("\\.", -1);
                                                        String str4 = split[i4];
                                                        int indexOf2 = str4.indexOf(35);
                                                        if (indexOf2 != -1) {
                                                            wjx0Var.b = str4.substring(i4, indexOf2);
                                                            wjx0Var.a = str4.substring(indexOf2 + 1);
                                                        } else {
                                                            wjx0Var.b = str4;
                                                        }
                                                        if (split.length > 1) {
                                                            int length = split.length;
                                                            fxc0.p(length <= split.length ? 1 : i4);
                                                            wjx0Var.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, 1, length)));
                                                        }
                                                    }
                                                    int i18 = i4;
                                                    String str5 = null;
                                                    while (i18 == 0) {
                                                        int i19 = xi90Var2.b;
                                                        String b2 = bo80.b(xi90Var2, sb2);
                                                        int i20 = (b2 == null || "}".equals(b2)) ? 1 : i4;
                                                        if (i20 == 0) {
                                                            xi90Var2.P(i19);
                                                            bo80.c(xi90Var2);
                                                            String a = bo80.a(xi90Var2, sb2);
                                                            if (!"".equals(a) && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(bo80.b(xi90Var2, sb2))) {
                                                                bo80.c(xi90Var2);
                                                                StringBuilder sb3 = new StringBuilder();
                                                                boolean z3 = false;
                                                                while (true) {
                                                                    if (z3) {
                                                                        str2 = b2;
                                                                        i5 = i20;
                                                                        sb = sb3.toString();
                                                                    } else {
                                                                        str2 = b2;
                                                                        int i21 = xi90Var2.b;
                                                                        i5 = i20;
                                                                        String b3 = bo80.b(xi90Var2, sb2);
                                                                        if (b3 == null) {
                                                                            sb = null;
                                                                        } else if ("}".equals(b3) || ";".equals(b3)) {
                                                                            xi90Var2.P(i21);
                                                                            b2 = str2;
                                                                            i20 = i5;
                                                                            z3 = true;
                                                                        } else {
                                                                            sb3.append(b3);
                                                                            b2 = str2;
                                                                            i20 = i5;
                                                                        }
                                                                    }
                                                                }
                                                                if (sb != null && !"".equals(sb)) {
                                                                    int i22 = xi90Var2.b;
                                                                    String b4 = bo80.b(xi90Var2, sb2);
                                                                    if (!";".equals(b4)) {
                                                                        if ("}".equals(b4)) {
                                                                            xi90Var2.P(i22);
                                                                        }
                                                                    }
                                                                    if ("color".equals(a)) {
                                                                        z2 = true;
                                                                        wjx0Var.f = c7g.a(sb, true);
                                                                        wjx0Var.g = true;
                                                                    } else {
                                                                        z2 = true;
                                                                        if ("background-color".equals(a)) {
                                                                            wjx0Var.h = c7g.a(sb, true);
                                                                            wjx0Var.i = true;
                                                                        } else {
                                                                            if ("ruby-position".equals(a)) {
                                                                                if ("over".equals(sb)) {
                                                                                    wjx0Var.p = 1;
                                                                                } else if ("under".equals(sb)) {
                                                                                    wjx0Var.p = 2;
                                                                                    str5 = str2;
                                                                                    i18 = i5;
                                                                                    i4 = 0;
                                                                                }
                                                                            } else if ("text-combine-upright".equals(a)) {
                                                                                wjx0Var.q = "all".equals(sb) || sb.startsWith("digits");
                                                                            } else if ("text-decoration".equals(a)) {
                                                                                if (TtmlNode.UNDERLINE.equals(sb)) {
                                                                                    z2 = true;
                                                                                    wjx0Var.k = 1;
                                                                                }
                                                                            } else if ("font-family".equals(a)) {
                                                                                wjx0Var.e = o19.u(sb);
                                                                            } else if (!"font-weight".equals(a)) {
                                                                                z2 = true;
                                                                                if ("font-style".equals(a)) {
                                                                                    if (TtmlNode.ITALIC.equals(sb)) {
                                                                                        wjx0Var.m = 1;
                                                                                    }
                                                                                } else if ("font-size".equals(a)) {
                                                                                    Matcher matcher2 = bo80.d.matcher(o19.u(sb));
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
                                                                                                i6 = 1;
                                                                                                wjx0Var.n = 3;
                                                                                                break;
                                                                                            case 1:
                                                                                                i6 = 1;
                                                                                                wjx0Var.n = 2;
                                                                                                break;
                                                                                            case 2:
                                                                                                i6 = 1;
                                                                                                wjx0Var.n = 1;
                                                                                                break;
                                                                                            default:
                                                                                                throw new IllegalStateException();
                                                                                        }
                                                                                        String group3 = matcher2.group(i6);
                                                                                        group3.getClass();
                                                                                        wjx0Var.o = Float.parseFloat(group3);
                                                                                        str5 = str2;
                                                                                        i18 = i5;
                                                                                        i4 = 0;
                                                                                    } else {
                                                                                        ahn.F("Invalid font-size: '" + sb + "'.");
                                                                                    }
                                                                                }
                                                                            } else if (TtmlNode.BOLD.equals(sb)) {
                                                                                z2 = true;
                                                                                wjx0Var.l = 1;
                                                                            }
                                                                            str5 = str2;
                                                                            i18 = i5;
                                                                            i4 = 0;
                                                                        }
                                                                    }
                                                                    str5 = str2;
                                                                    i18 = i5;
                                                                    i4 = 0;
                                                                }
                                                                str5 = str2;
                                                                i18 = i5;
                                                                i4 = 0;
                                                            }
                                                        }
                                                        str2 = b2;
                                                        i5 = i20;
                                                        str5 = str2;
                                                        i18 = i5;
                                                        i4 = 0;
                                                    }
                                                    if ("}".equals(str5)) {
                                                        arrayList4.add(wjx0Var);
                                                    }
                                                    i10 = 1;
                                                    i7 = 0;
                                                    i8 = -1;
                                                }
                                            }
                                        }
                                        str = null;
                                        if (str == null) {
                                        }
                                    }
                                } else if (c2 == 3) {
                                    Pattern pattern = do80.a;
                                    Charset charset = StandardCharsets.UTF_8;
                                    String q2 = xi90Var.q(charset);
                                    if (q2 == null) {
                                        arrayList = null;
                                    } else {
                                        Pattern pattern2 = do80.a;
                                        Matcher matcher3 = pattern2.matcher(q2);
                                        if (matcher3.matches()) {
                                            arrayList = do80.d(null, matcher3, xi90Var, arrayList2);
                                        } else {
                                            arrayList = null;
                                            String q3 = xi90Var.q(charset);
                                            if (q3 != null) {
                                                Matcher matcher4 = pattern2.matcher(q3);
                                                if (matcher4.matches()) {
                                                    arrayList = do80.d(q2.trim(), matcher4, xi90Var, arrayList2);
                                                }
                                            }
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList3.addAll(arrayList);
                                    }
                                }
                                eo80Var = this;
                            }
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
