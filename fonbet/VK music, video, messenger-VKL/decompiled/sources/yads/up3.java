package yads;

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
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.requery.android.database.sqlite.SQLiteStatementType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.android.api.json.JsonToken;
import xsna.dr;
import xsna.zzq0;

/* loaded from: classes10.dex */
public abstract class up3 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        zzq0.a(255, 255, 255, hashMap, "white");
        zzq0.a(0, 255, 0, hashMap, "lime");
        zzq0.a(0, 255, 255, hashMap, "cyan");
        zzq0.a(255, 0, 0, hashMap, "red");
        zzq0.a(255, 255, 0, hashMap, "yellow");
        zzq0.a(255, 0, 255, hashMap, "magenta");
        zzq0.a(0, 0, 255, hashMap, "blue");
        zzq0.a(0, 0, 0, hashMap, "black");
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        zzq0.a(255, 255, 255, hashMap2, "bg_white");
        zzq0.a(0, 255, 0, hashMap2, "bg_lime");
        zzq0.a(0, 255, 255, hashMap2, "bg_cyan");
        zzq0.a(255, 0, 0, hashMap2, "bg_red");
        zzq0.a(255, 255, 0, hashMap2, "bg_yellow");
        zzq0.a(255, 0, 255, hashMap2, "bg_magenta");
        zzq0.a(0, 0, 255, hashMap2, "bg_blue");
        zzq0.a(0, 0, 0, hashMap2, "bg_black");
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(SpannableStringBuilder spannableStringBuilder, rp3 rp3Var, String str, List list, List list2) {
        char c2;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5 = rp3Var.b;
        int length = spannableStringBuilder.length();
        String str2 = rp3Var.a;
        str2.getClass();
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case JsonToken.BOOLEAN /* 98 */:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case ASSET_FAILED_STATUS_CODE_VALUE:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
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
            case 5:
            case 6:
                break;
            case 1:
                dr.a(1, spannableStringBuilder, i5, length, 33);
                break;
            case 2:
                for (String str3 : rp3Var.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i5, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i5, length, 33);
                        }
                    }
                }
                break;
            case 3:
                dr.a(2, spannableStringBuilder, i5, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, 33);
                break;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    op3 op3Var = (op3) list2.get(i6);
                    int a2 = op3Var.a(str, rp3Var.a, rp3Var.d, rp3Var.c);
                    if (a2 > 0) {
                        arrayList2.add(new sp3(a2, op3Var));
                    }
                }
                Collections.sort(arrayList2);
                for (int i7 = 0; i7 < arrayList2.size() && ((sp3) arrayList2.get(i7)).c.p == -1; i7++) {
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                arrayList3.addAll(list);
                Collections.sort(arrayList3, qp3.c);
                int i8 = rp3Var.b;
                int i9 = 0;
                int i10 = 0;
                while (i9 < arrayList3.size()) {
                    if ("rt".equals(((qp3) arrayList3.get(i9)).a.a)) {
                        qp3 qp3Var = (qp3) arrayList3.get(i9);
                        rp3 rp3Var2 = qp3Var.a;
                        ArrayList arrayList4 = new ArrayList();
                        int i11 = 0;
                        while (i11 < list2.size()) {
                            op3 op3Var2 = (op3) list2.get(i11);
                            ArrayList arrayList5 = arrayList3;
                            int i12 = i11;
                            int a3 = op3Var2.a(str, rp3Var2.a, rp3Var2.d, rp3Var2.c);
                            if (a3 > 0) {
                                arrayList4.add(new sp3(a3, op3Var2));
                            }
                            i11 = i12 + 1;
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        Collections.sort(arrayList4);
                        for (int i13 = 0; i13 < arrayList4.size() && ((sp3) arrayList4.get(i13)).c.p == -1; i13++) {
                        }
                        int i14 = qp3Var.a.b - i10;
                        int i15 = qp3Var.b - i10;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i14, i15);
                        spannableStringBuilder.delete(i14, i15);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new at2(), i8, i14, 33);
                        i10 += subSequence.length();
                        i8 = i14;
                    } else {
                        arrayList = arrayList3;
                    }
                    i9++;
                    arrayList3 = arrayList;
                }
                break;
            default:
                return;
        }
        ArrayList arrayList6 = new ArrayList();
        for (int i16 = 0; i16 < list2.size(); i16++) {
            op3 op3Var3 = (op3) list2.get(i16);
            int a4 = op3Var3.a(str, rp3Var.a, rp3Var.d, rp3Var.c);
            if (a4 > 0) {
                arrayList6.add(new sp3(a4, op3Var3));
            }
        }
        Collections.sort(arrayList6);
        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
            op3 op3Var4 = ((sp3) arrayList6.get(i17)).c;
            if (op3Var4 != null) {
                int i18 = op3Var4.l;
                if (i18 != -1 || op3Var4.m != -1) {
                    if (((i18 == 1 ? (char) 1 : (char) 0) | (op3Var4.m == 1 ? (char) 2 : (char) 0)) != -1) {
                        int i19 = op3Var4.l;
                        if (i19 == -1 && op3Var4.m == -1) {
                            i2 = -1;
                            i = 1;
                        } else {
                            i = 1;
                            i2 = (i19 == 1 ? 1 : 0) | (op3Var4.m == 1 ? 2 : 0);
                        }
                        i33.a(spannableStringBuilder, new StyleSpan(i2), i5, length);
                        if (op3Var4.j != i) {
                            i3 = 33;
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), i5, length, 33);
                        } else {
                            i3 = 33;
                        }
                        if (op3Var4.k == i) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), i5, length, i3);
                        }
                        if (op3Var4.g) {
                            if (!op3Var4.g) {
                                throw new IllegalStateException("Font color not defined");
                            }
                            i33.a(spannableStringBuilder, new ForegroundColorSpan(op3Var4.f), i5, length);
                        }
                        if (op3Var4.i) {
                            if (!op3Var4.i) {
                                throw new IllegalStateException("Background color not defined.");
                            }
                            i33.a(spannableStringBuilder, new BackgroundColorSpan(op3Var4.h), i5, length);
                        }
                        if (op3Var4.e != null) {
                            i33.a(spannableStringBuilder, new TypefaceSpan(op3Var4.e), i5, length);
                        }
                        i4 = op3Var4.n;
                        if (i4 != 1) {
                            i33.a(spannableStringBuilder, new AbsoluteSizeSpan((int) op3Var4.o, true), i5, length);
                        } else if (i4 == 2) {
                            i33.a(spannableStringBuilder, new RelativeSizeSpan(op3Var4.o), i5, length);
                        } else if (i4 == 3) {
                            i33.a(spannableStringBuilder, new RelativeSizeSpan(op3Var4.o / 100.0f), i5, length);
                        }
                        if (!op3Var4.q) {
                            spannableStringBuilder.setSpan(new d11(), i5, length, 33);
                        }
                    }
                }
                i = 1;
                if (op3Var4.j != i) {
                }
                if (op3Var4.k == i) {
                }
                if (op3Var4.g) {
                }
                if (op3Var4.i) {
                }
                if (op3Var4.e != null) {
                }
                i4 = op3Var4.n;
                if (i4 != 1) {
                }
                if (!op3Var4.q) {
                }
            }
        }
    }

    public static void b(String str, tp3 tp3Var) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
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
                    ji1.d("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            tp3Var.g = i;
            str = str.substring(0, indexOf);
        }
        if (!str.endsWith("%")) {
            tp3Var.e = Integer.parseInt(str);
            tp3Var.f = 1;
            return;
        }
        int i2 = wp3.a;
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        tp3Var.e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        tp3Var.f = 0;
    }

    public static pp3 a(String str, Matcher matcher, kc2 kc2Var, ArrayList arrayList) {
        tp3 tp3Var = new tp3();
        try {
            String group = matcher.group(1);
            group.getClass();
            tp3Var.a = wp3.a(group);
            String group2 = matcher.group(2);
            group2.getClass();
            tp3Var.b = wp3.a(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            a(group3, tp3Var);
            StringBuilder sb = new StringBuilder();
            String c2 = kc2Var.c();
            while (!TextUtils.isEmpty(c2)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(c2.trim());
                c2 = kc2Var.c();
            }
            tp3Var.c = a(str, sb.toString(), arrayList);
            return new pp3(tp3Var.a().a(), tp3Var.a, tp3Var.b);
        } catch (NumberFormatException unused) {
            ji1.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString a(String str, String str2, List list) {
        char c2;
        char c3;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i < str2.length()) {
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
                        substring.getClass();
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
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                ji1.d("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
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
                            if (!trim.isEmpty()) {
                                int i5 = mc3.a;
                                String str4 = trim.split("[ \\.]", 2)[0];
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case JsonToken.BOOLEAN /* 98 */:
                                        if (str4.equals("b")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                                        if (str4.equals("c")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 105:
                                        if (str4.equals("i")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case ASSET_FAILED_STATUS_CODE_VALUE:
                                        if (str4.equals("u")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case PROTOBUF_SERIALIZATION_ERROR_VALUE:
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
                                                rp3 rp3Var = (rp3) arrayDeque.pop();
                                                a(spannableStringBuilder, rp3Var, str, arrayList, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new qp3(rp3Var, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (rp3Var.a.equals(str4)) {
                                                }
                                            }
                                        } else if (!z2) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring2.trim();
                                            if (!trim2.isEmpty()) {
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
                                                arrayDeque.push(new rp3(str5, length, str3, hashSet));
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                    default:
                                        i = i2;
                                        break;
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                    }
                    i = i2;
                }
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(spannableStringBuilder, (rp3) arrayDeque.pop(), str, arrayList, list);
                }
                a(spannableStringBuilder, new rp3("", 0, "", Collections.EMPTY_SET), str, Collections.EMPTY_LIST, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static void a(String str, tp3 tp3Var) {
        int i;
        int i2;
        int i3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    b(group2, tp3Var);
                } else {
                    if ("align".equals(group)) {
                        switch (group2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                ji1.d("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i = 2;
                                break;
                        }
                        tp3Var.d = i;
                    } else if (X3.i.L.equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            substring.getClass();
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        break;
                                    }
                                    break;
                                case -1364013995:
                                    if (substring.equals(TtmlNode.CENTER)) {
                                        break;
                                    }
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        break;
                                    }
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        break;
                                    }
                                    break;
                                case 100571:
                                    if (substring.equals(TtmlNode.END)) {
                                        break;
                                    }
                                    break;
                                case 109757538:
                                    if (substring.equals("start")) {
                                        break;
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                */
                            /*
                                Method dump skipped, instructions count: 546
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: yads.up3.a(java.lang.String, yads.tp3):void");
                        }
                    }
