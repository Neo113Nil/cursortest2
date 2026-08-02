package ru.ok.android.webrtc.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.RTCLog;
import xsna.go9;
import xsna.zr;

/* loaded from: classes9.dex */
public class CodecPreferenceUtils {
    public static f a(boolean z, String[] strArr, RTCLog rTCLog) {
        int findMediaDescriptionLine = findMediaDescriptionLine(z, strArr);
        if (findMediaDescriptionLine == -1) {
            rTCLog.log("CodecPrefUtil", "parseMSection: didn't find section: ".concat(z ? "m=audio" : "m=video"));
            return null;
        }
        f a = f.a(strArr[findMediaDescriptionLine], findMediaDescriptionLine);
        if (a == null) {
            rTCLog.log("CodecPrefUtil", "parseMSection: failed to parse line: ".concat(z ? "m=audio" : "m=video"));
            return null;
        }
        while (true) {
            findMediaDescriptionLine++;
            if (findMediaDescriptionLine >= strArr.length || strArr[findMediaDescriptionLine].startsWith("m=")) {
                break;
            }
            a.b(strArr[findMediaDescriptionLine], findMediaDescriptionLine);
        }
        return a;
    }

    public static String addFmtpParam(String str, String str2, String str3, String str4, String str5, boolean z) {
        return addFmtpParam(str, str2, str3, str4, str5, z, RTCLog.NoOp.INSTANCE);
    }

    public static void dumpCodecs(String str, boolean z, RTCLog rTCLog) {
        String[] split = str.split("\r\n");
        f a = a(true, split, rTCLog);
        if (a == null) {
            rTCLog.log("CodecPrefUtil", "dumpCodecs: failed to parse m=audio line");
        } else {
            rTCLog.log("CodecPrefUtil", "dumpCodecs: m=audio section priority:");
            Iterator it = a.d.entrySet().iterator();
            while (it.hasNext()) {
                rTCLog.log("CodecPrefUtil", "dumpCodecs: " + ((e) ((Map.Entry) it.next()).getValue()).b);
            }
        }
        f a2 = a(false, split, rTCLog);
        if (a2 == null) {
            rTCLog.log("CodecPrefUtil", "dumpCodecs: failed to parse m=video line");
            return;
        }
        rTCLog.log("CodecPrefUtil", "dumpCodecs: m=video section priority:");
        Iterator it2 = a2.d.entrySet().iterator();
        while (it2.hasNext()) {
            rTCLog.log("CodecPrefUtil", "dumpCodecs: " + ((e) ((Map.Entry) it2.next()).getValue()).b);
        }
    }

    public static int findMediaDescriptionLine(boolean z, String[] strArr) {
        String str = z ? "m=audio " : "m=video ";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].startsWith(str)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean hasAnyCodec(@NonNull String str, @NonNull List<String> list, boolean z) {
        return hasAnyCodec(str, list, z, RTCLog.NoOp.INSTANCE);
    }

    @Nullable
    public static String movePayloadTypesToFront(List<String> list, String str) {
        List asList = Arrays.asList(str.split(" "));
        if (asList.size() <= 3) {
            return null;
        }
        List subList = asList.subList(0, 3);
        ArrayList arrayList = new ArrayList(asList.subList(3, asList.size()));
        arrayList.removeAll(list);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(subList);
        arrayList2.addAll(list);
        arrayList2.addAll(arrayList);
        return MiscHelper.joinString(arrayList2, " ", false);
    }

    public static String preferCodec(String str, String str2, boolean z, RTCLog rTCLog) {
        String[] split = str.split("\r\n");
        int findMediaDescriptionLine = findMediaDescriptionLine(z, split);
        if (findMediaDescriptionLine == -1) {
            String b = go9.b("no mediaDescription line, so can't prefer ", str2);
            rTCLog.reportException("CodecPrefUtil", b, new IllegalStateException(b));
            return str;
        }
        ArrayList arrayList = new ArrayList();
        Pattern compile = Pattern.compile("^a=rtpmap:(\\d+) " + str2 + "(/\\d+)+[\r]?$");
        for (String str3 : split) {
            Matcher matcher = compile.matcher(str3);
            if (matcher.matches()) {
                arrayList.add(matcher.group(1));
            }
        }
        if (arrayList.isEmpty()) {
            String b2 = go9.b("no payload types with name ", str2);
            rTCLog.reportException("CodecPrefUtil", b2, new IllegalStateException(b2));
            return str;
        }
        String movePayloadTypesToFront = movePayloadTypesToFront(arrayList, split[findMediaDescriptionLine]);
        if (movePayloadTypesToFront != null) {
            split[findMediaDescriptionLine] = movePayloadTypesToFront;
            return MiscHelper.joinString(Arrays.asList(split), "\r\n", true);
        }
        String str4 = "wrong SDP media description format=" + split[findMediaDescriptionLine];
        rTCLog.reportException("CodecPrefUtil", str4, new IllegalStateException(str4));
        return str;
    }

    public static String preferCodec2(String str, List<String> list, String str2) {
        return preferCodec2(str, list, str2, RTCLog.NoOp.INSTANCE);
    }

    public static String preferCodec3(@NonNull String str, boolean z, @Nullable List<String> list, @Nullable List<String> list2) {
        return preferCodec3(str, z, list, list2, RTCLog.NoOp.INSTANCE);
    }

    public static String addFmtpParam(String str, String str2, String str3, String str4, RTCLog rTCLog) {
        return addFmtpParam(str, str2, str3, str4, null, false, rTCLog);
    }

    public static boolean hasAnyCodec(@NonNull String str, @NonNull List<String> list, boolean z, RTCLog rTCLog) {
        f a = a(z, str.split("\r\n"), rTCLog);
        return a != null && a.a(list);
    }

    public static String preferCodec2(String str, List<String> list, String str2, RTCLog rTCLog) {
        return preferCodec2(str, list, str2, true, rTCLog);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String preferCodec3(@NonNull String str, boolean z, @Nullable List<String> list, @Nullable List<String> list2, RTCLog rTCLog) {
        f fVar;
        boolean z2;
        String[] split = str.split("\r\n");
        f fVar2 = null;
        if (list != null) {
            fVar = a(true, split, rTCLog);
            if (fVar != null && (fVar.a(list) || z)) {
                z2 = true;
                boolean z3 = list2 == null && (fVar2 = a(false, split, rTCLog)) != null && (fVar2.a(list2) || z);
                if (z2 && !z3) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                boolean z4 = false;
                boolean z5 = false;
                for (int i = 0; i < split.length; i++) {
                    if (z2) {
                        int i2 = fVar.c;
                        if (i == i2) {
                            fVar.b(sb, list, z);
                        } else if (i == i2 || fVar.a.contains(Integer.valueOf(i))) {
                            if (!z4) {
                                fVar.a(sb, list, z);
                                z4 = true;
                            }
                        }
                    }
                    if (z3) {
                        int i3 = fVar2.c;
                        if (i == i3) {
                            fVar2.b(sb, list2, z);
                        } else if (i == i3 || fVar2.a.contains(Integer.valueOf(i))) {
                            if (!z5) {
                                fVar2.a(sb, list2, z);
                                z5 = true;
                            }
                        }
                    }
                    sb.append(split[i]);
                    sb.append("\r\n");
                }
                return sb.toString();
            }
        } else {
            fVar = null;
        }
        z2 = false;
        if (list2 == null) {
        }
        if (z2) {
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z42 = false;
        boolean z52 = false;
        while (i < split.length) {
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, ru.ok.android.webrtc.utils.d] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    public static String addFmtpParam(String str, String str2, String str3, String str4, String str5, boolean z, RTCLog rTCLog) {
        int i;
        String str6;
        ?? r9;
        d dVar;
        int indexOf;
        int i2;
        String substring;
        String[] split = str.split("\r\n");
        String b = go9.b("m=", str3);
        int i3 = 0;
        while (true) {
            if (i3 >= split.length) {
                i3 = -1;
                break;
            }
            if (split[i3].startsWith(b)) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            String a = zr.a("failed to find ", b, " line in sdp");
            rTCLog.reportException("CodecPrefUtil", a, new IllegalStateException(a));
            return str;
        }
        f a2 = f.a(split[i3], i3);
        if (a2 == null) {
            String a3 = zr.a("failed to parse ", b, " line");
            rTCLog.reportException("CodecPrefUtil", a3, new IllegalStateException(a3));
            return str;
        }
        for (int i4 = i3 + 1; i4 < split.length && !split[i4].startsWith(b); i4++) {
            a2.b(split[i4], i4);
        }
        if (a2.a(str2).isEmpty()) {
            String b2 = go9.b("failed to find desired codec: ", str2);
            rTCLog.reportException("CodecPrefUtil", b2, new IllegalStateException(b2));
            return str;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList a4 = a2.a(str2);
        int size = a4.size();
        int i5 = 1;
        int i6 = 0;
        String str7 = null;
        String str8 = null;
        while (i6 < size) {
            Object obj = a4.get(i6);
            i6++;
            e eVar = (e) obj;
            String str9 = eVar.a;
            ArrayList arrayList2 = eVar.c;
            int size2 = arrayList2.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                int i8 = i7 + 1;
                String str10 = (String) obj2;
                arrayList.add(str10);
                if (str10.startsWith("a=fmtp:")) {
                    str8 = str10;
                }
                i7 = i8;
            }
            str7 = str9;
        }
        if (str7 == null) {
            rTCLog.reportException("CodecPrefUtil", "failed to find desired lines", new IllegalStateException("failed to find desired lines"));
            return str;
        }
        if (str8 != null) {
            if (str8.startsWith("a=fmtp:") && (indexOf = str8.indexOf(32, 6)) >= 0) {
                String substring2 = str8.substring(0, indexOf);
                String substring3 = str8.substring(indexOf + 1);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String[] split2 = substring3.split(";");
                int length = split2.length;
                int i9 = 0;
                while (i9 < length) {
                    String trim = split2[i9].trim();
                    String[] strArr = split2;
                    int indexOf2 = trim.indexOf(61);
                    if (indexOf2 < 0) {
                        i2 = length;
                        substring = null;
                    } else {
                        i2 = length;
                        String substring4 = trim.substring(0, indexOf2);
                        substring = trim.substring(indexOf2 + 1);
                        trim = substring4;
                    }
                    linkedHashMap.put(trim, substring);
                    i9++;
                    split2 = strArr;
                    length = i2;
                }
                i = 0;
                dVar = new d(substring2, linkedHashMap);
            } else {
                dVar = null;
                i = 0;
            }
            if (dVar == null || !dVar.a(str4, str5, z, rTCLog)) {
                return str;
            }
            str6 = dVar.toString();
        } else {
            i = 0;
            str6 = null;
        }
        ?? sb = new StringBuilder();
        if (str6 == null) {
            int i10 = i;
            while (i10 < split.length) {
                String str11 = split[i10];
                sb.append(str11);
                sb.append("\r\n");
                i10++;
                int i11 = i10 < split.length ? i5 : i;
                if (!arrayList.contains(str11) || (i11 != 0 && arrayList.contains(split[i10]))) {
                    r9 = i5;
                } else {
                    ?? dVar2 = new d("a=fmtp:".concat(str7), null);
                    r9 = i5;
                    if (dVar2.a(str4, str5, r9, rTCLog)) {
                        sb.append(dVar2);
                        sb.append("\r\n");
                    }
                }
                i5 = r9;
            }
        } else {
            int length2 = split.length;
            for (int i12 = i; i12 < length2; i12++) {
                String str12 = split[i12];
                if (str12.equals(str8)) {
                    sb.append(str6);
                } else {
                    sb.append(str12);
                }
                sb.append("\r\n");
            }
        }
        return sb.toString();
    }

    public static String preferCodec2(String str, List<String> list, String str2, boolean z, RTCLog rTCLog) {
        String[] split = str.split("\r\n");
        String b = go9.b("m=", str2);
        int i = 0;
        while (true) {
            if (i >= split.length) {
                i = -1;
                break;
            }
            if (split[i].startsWith(b)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            String a = zr.a("failed to find ", b, " line in sdp");
            rTCLog.reportException("CodecPrefUtil", a, new IllegalStateException(a));
            return str;
        }
        f a2 = f.a(split[i], i);
        if (a2 == null) {
            String a3 = zr.a("failed to parse ", b, " line");
            rTCLog.reportException("CodecPrefUtil", a3, new IllegalStateException(a3));
            return str;
        }
        boolean z2 = true;
        for (int i2 = i + 1; i2 < split.length && !split[i2].startsWith(b); i2++) {
            a2.b(split[i2], i2);
        }
        if (a2.a(list)) {
            StringBuilder sb = new StringBuilder();
            int i3 = a2.c;
            boolean z3 = false;
            for (int i4 = 0; i4 < split.length; i4++) {
                if (i4 == i3) {
                    a2.b(sb, list, false);
                } else if (i4 != a2.c && !a2.a.contains(Integer.valueOf(i4))) {
                    sb.append(split[i4]);
                    sb.append("\r\n");
                } else if (!z3) {
                    a2.a(sb, list, false);
                    z3 = true;
                }
            }
            return sb.toString();
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder("failed to find any desired codecs: ");
            StringBuilder sb3 = new StringBuilder();
            for (String str3 : list) {
                if (z2) {
                    z2 = false;
                } else {
                    sb3.append(StringUtils.COMMA);
                }
                if (str3 == null) {
                    sb3.append("-");
                } else {
                    sb3.append(str3);
                }
            }
            sb2.append(sb3.toString());
            String sb4 = sb2.toString();
            rTCLog.reportException("CodecPrefUtil", sb4, new IllegalStateException(sb4));
        }
        return str;
    }
}
