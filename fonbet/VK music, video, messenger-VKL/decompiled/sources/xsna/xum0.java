package xsna;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xsna.a1n0;
import xsna.rkk;

/* compiled from: SubripParser.java */
/* loaded from: classes12.dex */
public final class xum0 implements a1n0 {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList<String> b = new ArrayList<>();
    public final xi90 c = new xi90();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static rkk d(Spanned spanned, @Nullable String str) {
        char c;
        char c2;
        float f;
        rkk.a aVar = new rkk.a();
        aVar.a = spanned;
        aVar.b = null;
        if (str == null) {
            return aVar.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            aVar.i = 0;
        } else if (c == 3 || c == 4 || c == 5) {
            aVar.i = 2;
        } else {
            aVar.i = 1;
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            aVar.g = 2;
        } else if (c2 == 3 || c2 == 4 || c2 == 5) {
            aVar.g = 0;
        } else {
            aVar.g = 1;
        }
        int i = aVar.i;
        float f2 = 0.08f;
        if (i == 0) {
            f = 0.08f;
        } else if (i == 1) {
            f = 0.5f;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            f = 0.92f;
        }
        aVar.h = f;
        int i2 = aVar.g;
        if (i2 != 0) {
            if (i2 == 1) {
                f2 = 0.5f;
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException();
                }
                f2 = 0.92f;
            }
        }
        aVar.e = f2;
        aVar.f = 0;
        return aVar.a();
    }

    public static long e(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // xsna.a1n0
    public final void a(byte[] bArr, int i, int i2, a1n0.b bVar, j7j<wkk> j7jVar) {
        String q;
        String str;
        xum0 xum0Var = this;
        long j = bVar.a;
        xi90 xi90Var = xum0Var.c;
        xi90Var.N(bArr, i + i2);
        xi90Var.P(i);
        Charset L = xi90Var.L();
        if (L == null) {
            L = StandardCharsets.UTF_8;
        }
        long j2 = C.TIME_UNSET;
        ArrayList arrayList = (j == C.TIME_UNSET || !bVar.b) ? null : new ArrayList();
        while (true) {
            String q2 = xi90Var.q(L);
            if (q2 == null) {
                break;
            }
            if (!q2.isEmpty()) {
                try {
                    Integer.parseInt(q2);
                    q = xi90Var.q(L);
                } catch (NumberFormatException unused) {
                    ahn.F("Skipping invalid index: ".concat(q2));
                }
                if (q == null) {
                    ahn.F("Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(q);
                if (matcher.matches()) {
                    long e2 = e(matcher, 1);
                    long e3 = e(matcher, 6);
                    StringBuilder sb = xum0Var.a;
                    sb.setLength(0);
                    long j3 = j2;
                    ArrayList<String> arrayList2 = xum0Var.b;
                    arrayList2.clear();
                    for (String q3 = xi90Var.q(L); !TextUtils.isEmpty(q3); q3 = xi90Var.q(L)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = q3.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = e.matcher(trim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i3;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i3 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || e3 >= j4) {
                        j7jVar.accept(new wkk(ImmutableList.p(d(fromHtml, str)), e2, e3 - e2));
                    } else if (arrayList != null) {
                        arrayList.add(new wkk(ImmutableList.p(d(fromHtml, str)), e2, e3 - e2));
                    }
                    xum0Var = this;
                    j2 = j3;
                    j = j4;
                } else {
                    ahn.F("Skipping invalid timing: ".concat(q));
                    xum0Var = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j7jVar.accept((wkk) it.next());
            }
        }
    }

    @Override // xsna.a1n0
    public final int b() {
        return 1;
    }
}
