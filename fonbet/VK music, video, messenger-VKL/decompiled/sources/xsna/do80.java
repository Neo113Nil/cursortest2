package xsna;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteStatementType;
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
import ru.ok.android.api.json.JsonToken;
import xsna.rkk;

/* compiled from: OneVideoWebvttCueParser.java */
/* loaded from: classes8.dex */
public final class do80 {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Pattern c = Pattern.compile("<\\d{2}:\\d{2}:\\d{2}\\.\\d{3}>");
    public static final Map<String, Integer> d;
    public static final Map<String, Integer> e;

    /* compiled from: OneVideoWebvttCueParser.java */
    public static class a {
        public static final co80 c = new co80();
        public final b a;
        public final int b;

        public a(b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }
    }

    /* compiled from: OneVideoWebvttCueParser.java */
    public static final class b {
        public final String a;
        public final int b;
        public final String c;
        public final Set<String> d;

        public b(String str, int i, String str2, Set<String> set) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = set;
        }
    }

    /* compiled from: OneVideoWebvttCueParser.java */
    public static final class c implements Comparable<c> {
        public final int b;
        public final wjx0 c;

        public c(int i, wjx0 wjx0Var) {
            this.b = i;
            this.c = wjx0Var;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.b, cVar.b);
        }
    }

    /* compiled from: OneVideoWebvttCueParser.java */
    public static final class d {
        public long a;
        public long b;

        @NonNull
        public SpannedString c;
        public int d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public float j;
        public int k;

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0071, code lost:
        
            if (r8 == 0) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final xjx0 a() {
            Layout.Alignment alignment;
            float f;
            SpannedString spannedString;
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
            rkk.a aVar = new rkk.a();
            int i4 = this.d;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                sn.d(i4, "Unknown textAlignment: ");
                                alignment = null;
                            }
                        }
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                aVar.c = alignment;
                f = this.e;
                int i5 = this.f;
                if (f != -3.4028235E38f || i5 != 0 || (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= 1.0f)) {
                    if (f == -3.4028235E38f) {
                        f3 = f;
                    }
                    aVar.e = f3;
                    aVar.f = i5;
                    aVar.g = this.g;
                    aVar.h = f2;
                    aVar.i = i2;
                    float f4 = this.j;
                    if (i2 == 0) {
                        f2 = 1.0f - f2;
                    } else if (i2 == 1) {
                        f2 = f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
                    } else if (i2 != 2) {
                        throw new IllegalStateException(String.valueOf(i2));
                    }
                    aVar.l = Math.min(f4, f2);
                    aVar.p = this.k;
                    spannedString = this.c;
                    if (spannedString != null) {
                        aVar.b(spannedString);
                    }
                    return new xjx0(aVar.a(), this.a, this.b);
                }
                f3 = 1.0f;
                aVar.e = f3;
                aVar.f = i5;
                aVar.g = this.g;
                aVar.h = f2;
                aVar.i = i2;
                float f42 = this.j;
                if (i2 == 0) {
                }
                aVar.l = Math.min(f42, f2);
                aVar.p = this.k;
                spannedString = this.c;
                if (spannedString != null) {
                }
                return new xjx0(aVar.a(), this.a, this.b);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            aVar.c = alignment;
            f = this.e;
            int i52 = this.f;
            if (f != -3.4028235E38f) {
            }
            if (f == -3.4028235E38f) {
            }
            aVar.e = f3;
            aVar.f = i52;
            aVar.g = this.g;
            aVar.h = f2;
            aVar.i = i2;
            float f422 = this.j;
            if (i2 == 0) {
            }
            aVar.l = Math.min(f422, f2);
            aVar.p = this.k;
            spannedString = this.c;
            if (spannedString != null) {
            }
            return new xjx0(aVar.a(), this.a, this.b);
        }
    }

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
        d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        zzq0.a(255, 255, 255, hashMap2, "bg_white");
        zzq0.a(0, 255, 0, hashMap2, "bg_lime");
        zzq0.a(0, 255, 255, hashMap2, "bg_cyan");
        zzq0.a(255, 0, 0, hashMap2, "bg_red");
        zzq0.a(255, 255, 0, hashMap2, "bg_yellow");
        zzq0.a(255, 0, 255, hashMap2, "bg_magenta");
        zzq0.a(0, 0, 255, hashMap2, "bg_blue");
        zzq0.a(0, 0, 0, hashMap2, "bg_black");
        e = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(@Nullable String str, b bVar, List list, SpannableStringBuilder spannableStringBuilder, ArrayList arrayList) {
        char c2;
        int i = bVar.b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.a;
        str2.getClass();
        int i2 = -1;
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
                dr.a(1, spannableStringBuilder, i, length, 33);
                break;
            case 2:
                for (String str3 : bVar.d) {
                    Map<String, Integer> map = d;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i, length, 33);
                    } else {
                        Map<String, Integer> map2 = e;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 3:
                dr.a(2, spannableStringBuilder, i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                int c3 = c(arrayList, str, bVar);
                ArrayList arrayList2 = new ArrayList(list.size());
                arrayList2.addAll(list);
                Collections.sort(arrayList2, a.c);
                int i3 = bVar.b;
                int i4 = 0;
                int i5 = 0;
                while (i4 < arrayList2.size()) {
                    if ("rt".equals(((a) arrayList2.get(i4)).a.a)) {
                        a aVar = (a) arrayList2.get(i4);
                        int c4 = c(arrayList, str, aVar.a);
                        if (c4 == i2) {
                            c4 = c3 != i2 ? c3 : 1;
                        }
                        int i6 = aVar.a.b - i5;
                        int i7 = aVar.b - i5;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i6, i7);
                        spannableStringBuilder.delete(i6, i7);
                        spannableStringBuilder.setSpan(new mrg0(subSequence.toString(), c4), i3, i6, 33);
                        i5 = subSequence.length() + i5;
                        i3 = i6;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(arrayList, str, bVar);
        for (int i8 = 0; i8 < b2.size(); i8++) {
            wjx0 wjx0Var = ((c) b2.get(i8)).c;
            if (wjx0Var.b() != -1) {
                we7.c(spannableStringBuilder, new StyleSpan(wjx0Var.b()), i, length);
            }
            if (wjx0Var.j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (wjx0Var.k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (wjx0Var.g) {
                if (!wjx0Var.g) {
                    throw new IllegalStateException("Font color not defined");
                }
                we7.c(spannableStringBuilder, new ForegroundColorSpan(wjx0Var.f), i, length);
            }
            if (wjx0Var.i) {
                if (!wjx0Var.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                we7.c(spannableStringBuilder, new BackgroundColorSpan(wjx0Var.h), i, length);
            }
            if (wjx0Var.e != null) {
                we7.c(spannableStringBuilder, new TypefaceSpan(wjx0Var.e), i, length);
            }
            int i9 = wjx0Var.n;
            if (i9 == 1) {
                we7.c(spannableStringBuilder, new AbsoluteSizeSpan((int) wjx0Var.o, true), i, length);
            } else if (i9 == 2) {
                we7.c(spannableStringBuilder, new RelativeSizeSpan(wjx0Var.o), i, length);
            } else if (i9 == 3) {
                we7.c(spannableStringBuilder, new RelativeSizeSpan(wjx0Var.o / 100.0f), i, length);
            }
            if (wjx0Var.q) {
                spannableStringBuilder.setSpan(new xfv(), i, length, 33);
            }
        }
    }

    public static ArrayList b(ArrayList arrayList, @Nullable String str, b bVar) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            wjx0 wjx0Var = (wjx0) arrayList.get(i);
            int a2 = wjx0Var.a(str, bVar.a, bVar.d, bVar.c);
            if (a2 > 0) {
                arrayList2.add(new c(a2, wjx0Var));
            }
        }
        Collections.sort(arrayList2);
        return arrayList2;
    }

    public static int c(ArrayList arrayList, @Nullable String str, b bVar) {
        ArrayList b2 = b(arrayList, str, bVar);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((c) b2.get(i)).c.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0110, code lost:
    
        if (r12.equals("start") == false) goto L56;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(@Nullable String str, Matcher matcher, xi90 xi90Var, ArrayList arrayList) {
        int i;
        int i2;
        int i3;
        d dVar = new d();
        dVar.a = 0L;
        dVar.b = 0L;
        int i4 = 2;
        dVar.d = 2;
        dVar.e = -3.4028235E38f;
        dVar.f = 1;
        int i5 = 0;
        dVar.g = 0;
        dVar.h = -3.4028235E38f;
        dVar.i = Integer.MIN_VALUE;
        dVar.j = 1.0f;
        dVar.k = Integer.MIN_VALUE;
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.a = ckx0.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.b = ckx0.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            Matcher matcher2 = b.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                group4.getClass();
                String group5 = matcher2.group(i4);
                group5.getClass();
                try {
                    if ("line".equals(group4)) {
                        f(group5, dVar);
                    } else {
                        char c2 = 5;
                        if ("align".equals(group4)) {
                            switch (group5) {
                                case "center":
                                case "middle":
                                    i3 = 2;
                                    break;
                                case "end":
                                    i3 = 3;
                                    break;
                                case "left":
                                    i3 = 4;
                                    break;
                                case "right":
                                    i3 = 5;
                                    break;
                                case "start":
                                    i3 = 1;
                                    break;
                                default:
                                    ahn.F("Invalid alignment value: ".concat(group5));
                                    i3 = 2;
                                    break;
                            }
                            dVar.d = i3;
                        } else if (X3.i.L.equals(group4)) {
                            int indexOf = group5.indexOf(44);
                            if (indexOf != -1) {
                                String substring = group5.substring(indexOf + 1);
                                substring.getClass();
                                switch (substring.hashCode()) {
                                    case -1842484672:
                                        if (substring.equals("line-left")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -1364013995:
                                        if (substring.equals(TtmlNode.CENTER)) {
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
                                        if (substring.equals(TtmlNode.END)) {
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
                                        i2 = 0;
                                        break;
                                    case 1:
                                    case 3:
                                        i2 = 1;
                                        break;
                                    case 2:
                                    case 4:
                                        i2 = 2;
                                        break;
                                    default:
                                        ahn.F("Invalid anchor value: ".concat(substring));
                                        i2 = Integer.MIN_VALUE;
                                        break;
                                }
                                dVar.i = i2;
                                group5 = group5.substring(0, indexOf);
                            }
                            dVar.h = ckx0.b(group5);
                        } else if ("size".equals(group4)) {
                            dVar.j = ckx0.b(group5);
                        } else if ("vertical".equals(group4)) {
                            if (group5.equals("lr")) {
                                i = 2;
                            } else if (group5.equals("rl")) {
                                i = 1;
                            } else {
                                ahn.F("Invalid 'vertical' value: ".concat(group5));
                                i = Integer.MIN_VALUE;
                            }
                            dVar.k = i;
                        } else {
                            ahn.F("Unknown cue setting " + group4 + StringUtils.PROCESS_POSTFIX_DELIMITER + group5);
                        }
                    }
                } catch (NumberFormatException unused) {
                    ahn.F("Skipping bad cue setting: " + matcher2.group());
                }
                i4 = 2;
            }
            StringBuilder sb = new StringBuilder();
            xi90Var.getClass();
            String q = xi90Var.q(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(q)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(q.trim());
                q = xi90Var.q(StandardCharsets.UTF_8);
            }
            ArrayList arrayList2 = new ArrayList();
            long j = dVar.a;
            long j2 = dVar.b;
            String sb2 = sb.toString();
            Matcher matcher3 = c.matcher(sb2);
            StringBuilder sb3 = new StringBuilder();
            while (matcher3.find()) {
                long c3 = ckx0.c(sb2.substring(matcher3.start() + 1, matcher3.end() - 1));
                sb3.append(sb2.substring(i5, matcher3.start()));
                i5 = matcher3.end();
                dVar.a = j;
                dVar.b = c3;
                dVar.c = e(str, sb3.toString(), arrayList);
                arrayList2.add(dVar.a());
                j = c3;
            }
            sb3.append(sb2.substring(i5));
            dVar.a = j;
            dVar.b = j2;
            dVar.c = e(str, sb3.toString(), arrayList);
            arrayList2.add(dVar.a());
            return arrayList2;
        } catch (NumberFormatException unused2) {
            ahn.F("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString e(@Nullable String str, String str2, ArrayList arrayList) {
        char c2;
        char c3;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (b) arrayDeque.pop(), arrayList2, spannableStringBuilder, arrayList);
                }
                a(str, new b("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, arrayList);
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
                            ahn.F("ignoring unsupported entity: '&" + substring + ";'");
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
                        fxc0.p(!trim.isEmpty());
                        String str4 = y2r0.a;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case JsonToken.BOOLEAN /* 98 */:
                                if (str5.equals("b")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case SQLiteStatementType.STATEMENT_OTHER /* 99 */:
                                if (str5.equals("c")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 105:
                                if (str5.equals("i")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case ASSET_FAILED_STATUS_CODE_VALUE:
                                if (str5.equals("u")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                                if (str5.equals("v")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3650:
                                if (str5.equals("rt")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3314158:
                                if (str5.equals("lang")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3511770:
                                if (str5.equals("ruby")) {
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
                                        b bVar = (b) arrayDeque.pop();
                                        a(str, bVar, arrayList2, spannableStringBuilder, arrayList);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList2.clear();
                                        } else {
                                            arrayList2.add(new a(bVar, spannableStringBuilder.length()));
                                        }
                                        if (bVar.a.equals(str5)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z2) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    fxc0.p(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c3 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c3 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c3];
                                    HashSet hashSet = new HashSet();
                                    for (int i5 = 1; i5 < split.length; i5++) {
                                        hashSet.add(split[i5]);
                                    }
                                    arrayDeque.push(new b(str6, length, str3, hashSet));
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

    public static void f(String str, d dVar) {
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
                    ahn.F("Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            dVar.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.e = ckx0.b(str);
            dVar.f = 0;
        } else {
            dVar.e = Integer.parseInt(str);
            dVar.f = 1;
        }
    }
}
