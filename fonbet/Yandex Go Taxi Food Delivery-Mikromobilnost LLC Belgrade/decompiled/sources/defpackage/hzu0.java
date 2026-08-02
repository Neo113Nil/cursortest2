package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class hzu0 implements q2v0 {
    public static final Pattern w = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern x = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final ef90 c = new ef90();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        r0.i = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        if (r14.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        r0.g = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (r14.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        if (r14.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        if (r14.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
    
        r0.g = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (r14.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00aa, code lost:
    
        if (r14.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x003b, code lost:
    
        if (r14.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0065, code lost:
    
        r0.i = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0042, code lost:
    
        if (r14.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004e, code lost:
    
        if (r14.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0055, code lost:
    
        if (r14.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0063, code lost:
    
        if (r14.equals("{\\an1}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r14.equals("{\\an9}") != false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static odf a(Spanned spanned, String str) {
        float f;
        ndf ndfVar = new ndf();
        ndfVar.a = spanned;
        if (str == null) {
            return ndfVar.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                break;
            case -685620679:
                str.equals("{\\an2}");
                ndfVar.i = 1;
                break;
            case -685620648:
                break;
            case -685620617:
                break;
            case -685620586:
                str.equals("{\\an5}");
                ndfVar.i = 1;
                break;
            case -685620555:
                break;
            case -685620524:
                break;
            case -685620493:
                str.equals("{\\an8}");
                ndfVar.i = 1;
                break;
            case -685620462:
                break;
            default:
                ndfVar.i = 1;
                break;
        }
        switch (str.hashCode()) {
            case -685620710:
                break;
            case -685620679:
                break;
            case -685620648:
                break;
            case -685620617:
                str.equals("{\\an4}");
                ndfVar.g = 1;
                break;
            case -685620586:
                str.equals("{\\an5}");
                ndfVar.g = 1;
                break;
            case -685620555:
                str.equals("{\\an6}");
                ndfVar.g = 1;
                break;
            case -685620524:
                break;
            case -685620493:
                break;
            case -685620462:
                break;
            default:
                ndfVar.g = 1;
                break;
        }
        int i = ndfVar.i;
        float f2 = 0.08f;
        if (i == 0) {
            f = 0.08f;
        } else if (i == 1) {
            f = 0.5f;
        } else {
            if (i != 2) {
                w511.q();
                return null;
            }
            f = 0.92f;
        }
        ndfVar.h = f;
        int i2 = ndfVar.g;
        if (i2 != 0) {
            if (i2 == 1) {
                f2 = 0.5f;
            } else {
                if (i2 != 2) {
                    w511.q();
                    return null;
                }
                f2 = 0.92f;
            }
        }
        ndfVar.e = f2;
        ndfVar.f = 0;
        return ndfVar.a();
    }

    public static long c(Matcher matcher, int i) {
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

    @Override // defpackage.q2v0
    public final void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        String l;
        String str;
        hzu0 hzu0Var = this;
        long j = p2v0Var.b;
        ef90 ef90Var = hzu0Var.c;
        ef90Var.I(i + i2, bArr);
        ef90Var.K(i);
        Charset G = ef90Var.G();
        if (G == null) {
            G = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !p2v0Var.a) ? null : new ArrayList();
        while (true) {
            String l2 = ef90Var.l(G);
            if (l2 == null) {
                break;
            }
            if (l2.length() != 0) {
                try {
                    Integer.parseInt(l2);
                    l = ef90Var.l(G);
                } catch (NumberFormatException unused) {
                    lk91.j("Skipping invalid index: ".concat(l2));
                }
                if (l == null) {
                    lk91.j("Unexpected end");
                    break;
                }
                Matcher matcher = w.matcher(l);
                if (matcher.matches()) {
                    long c = c(matcher, 1);
                    long c2 = c(matcher, 6);
                    StringBuilder sb = hzu0Var.a;
                    sb.setLength(0);
                    long j3 = j2;
                    ArrayList arrayList2 = hzu0Var.b;
                    arrayList2.clear();
                    for (String l3 = ef90Var.l(G); !TextUtils.isEmpty(l3); l3 = ef90Var.l(G)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = l3.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = x.matcher(trim);
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
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || c >= j4) {
                        c9eVar.accept(new tdf(ImmutableList.r(a(fromHtml, str)), c, c2 - c));
                    } else if (arrayList != null) {
                        arrayList.add(new tdf(ImmutableList.r(a(fromHtml, str)), c, c2 - c));
                    }
                    hzu0Var = this;
                    j2 = j3;
                    j = j4;
                } else {
                    lk91.j("Skipping invalid timing: ".concat(l));
                    hzu0Var = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c9eVar.accept((tdf) it.next());
            }
        }
    }

    @Override // defpackage.q2v0
    public final int f() {
        return 1;
    }
}
