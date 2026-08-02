package yads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class t53 extends j03 {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern p = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder m = new StringBuilder();
    public final ArrayList n = new ArrayList();

    public static long a(Matcher matcher, int i) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yads.j03
    public final v53 a(byte[] bArr, int i, boolean z) {
        String c;
        String str;
        li1 li1Var;
        char c2;
        kc2 kc2Var;
        char c3;
        int i2;
        float f;
        float f2;
        o20 o20Var;
        t53 t53Var = this;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        li1 li1Var2 = new li1(0);
        kc2 kc2Var2 = new kc2(i, bArr);
        while (true) {
            String c4 = kc2Var2.c();
            if (c4 != null) {
                if (c4.length() != 0) {
                    try {
                        Integer.parseInt(c4);
                        c = kc2Var2.c();
                    } catch (NumberFormatException unused) {
                        ji1.d("SubripDecoder", "Skipping invalid index: ".concat(c4));
                    }
                    if (c == null) {
                        ji1.d("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = o.matcher(c);
                        if (!matcher.matches()) {
                            ji1.d("SubripDecoder", "Skipping invalid timing: ".concat(c));
                            t53Var = this;
                            i3 = 0;
                        } else {
                            li1Var2.a(a(matcher, 1));
                            li1Var2.a(a(matcher, 6));
                            t53Var.m.setLength(i3);
                            t53Var.n.clear();
                            for (String c5 = kc2Var2.c(); !TextUtils.isEmpty(c5); c5 = kc2Var2.c()) {
                                if (t53Var.m.length() > 0) {
                                    t53Var.m.append("<br>");
                                }
                                StringBuilder sb = t53Var.m;
                                ArrayList arrayList2 = t53Var.n;
                                String trim = c5.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = p.matcher(trim);
                                int i4 = i3;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i4;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i4 += length;
                                }
                                sb.append(sb2.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(t53Var.m.toString());
                            int i5 = i3;
                            while (true) {
                                if (i5 < t53Var.n.size()) {
                                    str = (String) t53Var.n.get(i5);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i5++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                o20Var = new o20(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                li1Var = li1Var2;
                                kc2Var = kc2Var2;
                            } else {
                                li1Var = li1Var2;
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
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c2 = 1;
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
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c2 = '\b';
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
                                kc2Var = kc2Var2;
                                int i6 = (c2 == 0 || c2 == 1 || c2 == 2) ? 0 : (c2 == 3 || c2 == 4 || c2 == 5) ? 2 : 1;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                int i7 = (c3 == 0 || c3 == 1 || c3 == 2) ? 2 : (c3 == 3 || c3 == 4 || c3 == 5) ? 0 : 1;
                                float f3 = 0.5f;
                                if (i6 != 0) {
                                    i2 = 1;
                                    if (i6 == 1) {
                                        f = 0.5f;
                                    } else {
                                        if (i6 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        f = 0.92f;
                                    }
                                } else {
                                    i2 = 1;
                                    f = 0.08f;
                                }
                                if (i7 == 0) {
                                    f3 = 0.08f;
                                } else if (i7 != i2) {
                                    if (i7 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    f2 = 0.92f;
                                    o20Var = new o20(fromHtml, null, null, null, f2, 0, i7, f, i6, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                f2 = f3;
                                o20Var = new o20(fromHtml, null, null, null, f2, 0, i7, f, i6, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            }
                            arrayList.add(o20Var);
                            arrayList.add(o20.s);
                            t53Var = this;
                            li1Var2 = li1Var;
                            kc2Var2 = kc2Var;
                            i3 = 0;
                        }
                    }
                }
            }
        }
        return new u53((o20[]) arrayList.toArray(new o20[i3]), li1Var2.a());
    }
}
