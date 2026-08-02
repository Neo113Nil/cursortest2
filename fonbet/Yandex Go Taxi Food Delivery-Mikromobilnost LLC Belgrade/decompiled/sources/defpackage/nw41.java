package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public final class nw41 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    public static final class a {
        public CharSequence c;
        public long a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0070, code lost:
        
            if (r7 == 0) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ndf a() {
            Layout.Alignment alignment;
            float f;
            CharSequence charSequence;
            float f2 = this.h;
            float f3 = -3.4028235E38f;
            if (f2 == -3.4028235E38f) {
                int i = this.d;
                f2 = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
            }
            int i2 = this.i;
            if (i2 == Integer.MIN_VALUE) {
                int i3 = this.d;
                if (i3 != 1) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                i2 = 1;
                            }
                        }
                    }
                    i2 = 2;
                }
                i2 = 0;
            }
            ndf ndfVar = new ndf();
            int i4 = this.d;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                xvz.v(i4, "Unknown textAlignment: ");
                                alignment = null;
                            }
                        }
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                ndfVar.c = alignment;
                f = this.e;
                int i5 = this.f;
                if (f != -3.4028235E38f || i5 != 0 || (f >= 0.0f && f <= 1.0f)) {
                    if (f == -3.4028235E38f) {
                        f3 = f;
                    }
                    ndfVar.e = f3;
                    ndfVar.f = i5;
                    ndfVar.g = this.g;
                    ndfVar.h = f2;
                    ndfVar.i = i2;
                    float f4 = this.j;
                    if (i2 == 0) {
                        f2 = 1.0f - f2;
                    } else if (i2 == 1) {
                        f2 = f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
                    } else if (i2 != 2) {
                        ny61.r(String.valueOf(i2));
                        return null;
                    }
                    ndfVar.l = Math.min(f4, f2);
                    ndfVar.p = this.k;
                    charSequence = this.c;
                    if (charSequence != null) {
                        ndfVar.a = charSequence;
                    }
                    return ndfVar;
                }
                f3 = 1.0f;
                ndfVar.e = f3;
                ndfVar.f = i5;
                ndfVar.g = this.g;
                ndfVar.h = f2;
                ndfVar.i = i2;
                float f42 = this.j;
                if (i2 == 0) {
                }
                ndfVar.l = Math.min(f42, f2);
                ndfVar.p = this.k;
                charSequence = this.c;
                if (charSequence != null) {
                }
                return ndfVar;
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            ndfVar.c = alignment;
            f = this.e;
            int i52 = this.f;
            if (f != -3.4028235E38f) {
            }
            if (f == -3.4028235E38f) {
            }
            ndfVar.e = f3;
            ndfVar.f = i52;
            ndfVar.g = this.g;
            ndfVar.h = f2;
            ndfVar.i = i2;
            float f422 = this.j;
            if (i2 == 0) {
            }
            ndfVar.l = Math.min(f422, f2);
            ndfVar.p = this.k;
            charSequence = this.c;
            if (charSequence != null) {
            }
            return ndfVar;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        smw0.s(255, 255, 255, hashMap, "white");
        smw0.s(0, 255, 0, hashMap, "lime");
        smw0.s(0, 255, 255, hashMap, "cyan");
        smw0.s(255, 0, 0, hashMap, "red");
        smw0.s(255, 255, 0, hashMap, "yellow");
        smw0.s(255, 0, 255, hashMap, "magenta");
        smw0.s(0, 0, 255, hashMap, "blue");
        smw0.s(0, 0, 0, hashMap, "black");
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        smw0.s(255, 255, 255, hashMap2, "bg_white");
        smw0.s(0, 255, 0, hashMap2, "bg_lime");
        smw0.s(0, 255, 255, hashMap2, "bg_cyan");
        smw0.s(255, 0, 0, hashMap2, "bg_red");
        smw0.s(255, 255, 0, hashMap2, "bg_yellow");
        smw0.s(255, 0, 255, hashMap2, "bg_magenta");
        smw0.s(0, 0, 255, hashMap2, "bg_blue");
        smw0.s(0, 0, 0, hashMap2, "bg_black");
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, lw41 lw41Var, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i;
        int i2;
        int i3;
        int i4 = lw41Var.b;
        int length = spannableStringBuilder.length();
        String str2 = lw41Var.a;
        str2.getClass();
        int i5 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case HProv.PP_REBOOT /* 98 */:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 105:
                if (str2.equals(CoreConstants.PushMessage.SERVICE_TYPE)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case HProv.PP_NK_SYNC /* 117 */:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case HProv.PP_INFO /* 118 */:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case 2:
                for (String str3 : lw41Var.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new lz31(lw41Var.c), i4, length, 33);
                break;
            case 7:
                int c3 = c(list2, str, lw41Var);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, kw41.c);
                int i6 = lw41Var.b;
                int i7 = 0;
                int i8 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((kw41) arrayList.get(i7)).a.a)) {
                        kw41 kw41Var = (kw41) arrayList.get(i7);
                        int c4 = c(list2, str, kw41Var.a);
                        if (c4 == i5) {
                            c4 = c3 != i5 ? c3 : 1;
                        }
                        int i9 = kw41Var.a.b - i8;
                        int i10 = kw41Var.b - i8;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new sjl0(subSequence.toString(), c4), i6, i9, 33);
                        i8 = subSequence.length() + i8;
                        i6 = i9;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, lw41Var);
        for (int i11 = 0; i11 < b2.size(); i11++) {
            iw41 iw41Var = ((mw41) b2.get(i11)).b;
            int i12 = iw41Var.l;
            if (i12 == -1 && iw41Var.m == -1) {
                i = -1;
            } else {
                i = (iw41Var.m == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i13 = iw41Var.l;
                if (i13 == -1 && iw41Var.m == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i13 == 1 ? 1 : 0) | (iw41Var.m == 1 ? 2 : 0);
                }
                peb1.c(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (iw41Var.j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (iw41Var.k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (iw41Var.g) {
                if (!iw41Var.g) {
                    ny61.r("Font color not defined");
                    return;
                }
                peb1.c(spannableStringBuilder, new ForegroundColorSpan(iw41Var.f), i4, length);
            }
            if (iw41Var.i) {
                if (!iw41Var.i) {
                    ny61.r("Background color not defined.");
                    return;
                }
                peb1.c(spannableStringBuilder, new BackgroundColorSpan(iw41Var.h), i4, length);
            }
            if (iw41Var.e != null) {
                peb1.c(spannableStringBuilder, new TypefaceSpan(iw41Var.e), i4, length);
            }
            int i14 = iw41Var.n;
            if (i14 == 1) {
                peb1.c(spannableStringBuilder, new AbsoluteSizeSpan((int) iw41Var.o, true), i4, length);
            } else if (i14 == 2) {
                peb1.c(spannableStringBuilder, new RelativeSizeSpan(iw41Var.o), i4, length);
            } else if (i14 == 3) {
                peb1.c(spannableStringBuilder, new RelativeSizeSpan(iw41Var.o / 100.0f), i4, length);
            }
            if (iw41Var.q) {
                spannableStringBuilder.setSpan(new rru(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, lw41 lw41Var) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            iw41 iw41Var = (iw41) list.get(i);
            String str2 = lw41Var.a;
            Set set = lw41Var.d;
            String str3 = lw41Var.c;
            if (iw41Var.a.isEmpty() && iw41Var.b.isEmpty() && iw41Var.c.isEmpty() && iw41Var.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a2 = iw41.a(iw41.a(iw41.a(0, 1073741824, iw41Var.a, str), 2, iw41Var.b, str2), 4, iw41Var.d, str3);
                size = (a2 == -1 || !set.containsAll(iw41Var.c)) ? 0 : a2 + (iw41Var.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new mw41(size, iw41Var));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, lw41 lw41Var) {
        ArrayList b2 = b(list, str, lw41Var);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((mw41) b2.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static jw41 d(String str, Matcher matcher, ef90 ef90Var, ArrayList arrayList) {
        a aVar = new a();
        try {
            String group = matcher.group(1);
            group.getClass();
            aVar.a = qw41.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            aVar.b = qw41.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, aVar);
            StringBuilder sb = new StringBuilder();
            ef90Var.getClass();
            String l = ef90Var.l(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(l)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(l.trim());
                l = ef90Var.l(StandardCharsets.UTF_8);
            }
            aVar.c = f(str, sb.toString(), arrayList);
            return new jw41(aVar.a().a(), aVar.a, aVar.b);
        } catch (IllegalArgumentException unused) {
            lk91.j("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00be, code lost:
    
        if (r6.equals("start") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x007f, code lost:
    
        if (r5.equals("center") == false) goto L14;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, a aVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, aVar);
                } else {
                    char c2 = 5;
                    boolean z = false;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            case false:
                            case true:
                                i = 2;
                                break;
                            case true:
                                i = 3;
                                break;
                            case true:
                                i = 4;
                                break;
                            case true:
                                i = 5;
                                break;
                            case true:
                                break;
                            default:
                                lk91.j("Invalid alignment value: ".concat(group2));
                                i = 2;
                                break;
                        }
                        aVar.d = i;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                case 5:
                                    i = 0;
                                    break;
                                case 1:
                                case 3:
                                    break;
                                case 2:
                                case 4:
                                    i = 2;
                                    break;
                                default:
                                    lk91.j("Invalid anchor value: ".concat(substring));
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            aVar.i = i;
                            group2 = group2.substring(0, indexOf);
                        }
                        aVar.h = qw41.b(group2);
                    } else if ("size".equals(group)) {
                        aVar.j = qw41.b(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i = 2;
                        } else if (!group2.equals("rl")) {
                            lk91.j("Invalid 'vertical' value: ".concat(group2));
                            i = Integer.MIN_VALUE;
                        }
                        aVar.k = i;
                    } else {
                        lk91.j("Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                lk91.j("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List list) {
        char c2;
        char c3;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (lw41) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new lw41("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i, indexOf);
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(HexString.CHAR_SPACE);
                            break;
                        default:
                            lk91.j("ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i4, i3);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        d6z.l(!trim.isEmpty());
                        int i5 = tw21.a;
                        String str4 = trim.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case HProv.PP_REBOOT /* 98 */:
                                if (str4.equals("b")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 99:
                                if (str4.equals("c")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 105:
                                if (str4.equals(CoreConstants.PushMessage.SERVICE_TYPE)) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case HProv.PP_NK_SYNC /* 117 */:
                                if (str4.equals("u")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case HProv.PP_INFO /* 118 */:
                                if (str4.equals("v")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3650:
                                if (str4.equals("rt")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3314158:
                                if (str4.equals("lang")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3511770:
                                if (str4.equals("ruby")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        lw41 lw41Var = (lw41) arrayDeque.pop();
                                        a(str, lw41Var, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new kw41(lw41Var, spannableStringBuilder.length()));
                                        }
                                        if (lw41Var.a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z2) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    d6z.l(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c3 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c3 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str5 = split[c3];
                                    HashSet hashSet = new HashSet();
                                    for (int i6 = 1; i6 < split.length; i6++) {
                                        hashSet.add(split[i6]);
                                    }
                                    arrayDeque.push(new lw41(str5, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = i2;
            }
        }
    }

    public static void g(String str, a aVar) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            i = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    lk91.j("Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            aVar.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            aVar.e = qw41.b(str);
            aVar.f = 0;
        } else {
            aVar.e = Integer.parseInt(str);
            aVar.f = 1;
        }
    }
}
