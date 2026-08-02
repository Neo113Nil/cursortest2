package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;
import org.webrtc.WebrtcBuildVersion;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public class ggg extends DefaultHandler implements gg90 {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    public ggg() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            ny61.n("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    public static int parseCea608AccessibilityChannel(List<eyi> list) {
        for (int i = 0; i < list.size(); i++) {
            eyi eyiVar = list.get(i);
            String str = eyiVar.a;
            String str2 = eyiVar.b;
            if ("urn:scte:dash:cc:cea-608:2015".equals(str) && str2 != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str2);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                lk91.j("Unable to parse CEA-608 channel number from: ".concat(str2));
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<eyi> list) {
        for (int i = 0; i < list.size(); i++) {
            eyi eyiVar = list.get(i);
            String str = eyiVar.a;
            String str2 = eyiVar.b;
            if ("urn:scte:dash:cc:cea-708:2015".equals(str) && str2 != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str2);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                lk91.j("Unable to parse CEA-708 service block number from: ".concat(str2));
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : tw21.Z(attributeValue);
    }

    public static eyi parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", null);
        String parseString3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!hq91.d(xmlPullParser, str));
        return new eyi(parseString, parseString2, parseString3);
    }

    public static int parseDolbyAC4ChannelConfiguration(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int parseInt = Integer.parseInt(attributeValue, 16);
        int i = 0;
        if ((8388608 & parseInt) == 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = DOLBY_AC4_CHANNEL_CONFIGURATION_MAPPING;
                if (i >= iArr.length) {
                    break;
                }
                i2 += ((parseInt >> i) & 1) * iArr[i];
                i++;
            }
            if (i2 == 0) {
                return -1;
            }
            return i2;
        }
        String[] h0 = tw21.h0(str);
        if (h0.length == 0) {
            return -1;
        }
        List v = new qgn0(28, new ykn0(18, new bj9('.'))).v(f0b1.g(h0[0].trim()));
        if (v.size() != 4 || !((String) v.get(0)).equals("ac-4")) {
            return -1;
        }
        String str2 = (String) v.get(3);
        str2.getClass();
        if (str2.equals(WebrtcBuildVersion.webrtc_commit)) {
            return 18;
        }
        return !str2.equals("04") ? -1 : 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        char c;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String g = f0b1.g(attributeValue);
        g.getClass();
        switch (g.hashCode()) {
            case 1596796:
                if (g.equals("4000")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2937391:
                if (g.equals("a000")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3094034:
                if (g.equals("f800")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3094035:
                if (g.equals("f801")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3133436:
                if (g.equals("fa01")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return -1;
    }

    public static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt <= 0 || parseInt >= 33) {
            return -1;
        }
        return parseInt;
    }

    public static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = tw21.f.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static String parseEac3SupplementalProperties(List<eyi> list) {
        for (int i = 0; i < list.size(); i++) {
            eyi eyiVar = list.get(i);
            String str = eyiVar.a;
            String str2 = eyiVar.b;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(str2)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(str2)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float parseFloat(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    public static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f;
    }

    public static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<eyi> list) {
        for (int i = 0; i < list.size(); i++) {
            eyi eyiVar = list.get(i);
            if (f0b1.f("http://dashif.org/guidelines/last-segment-number", eyiVar.a)) {
                return Long.parseLong(eyiVar.b);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt >= 0) {
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (parseInt < iArr.length) {
                return iArr[parseInt];
            }
        }
        return -1;
    }

    public static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!hq91.d(xmlPullParser, str));
        return str2;
    }

    public final long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = tw21.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    public a70 buildAdaptationSet(long j, int i, List<s4j0> list, List<eyi> list2, List<eyi> list3, List<eyi> list4) {
        return new a70(j, i, list, list2, list3, list4);
    }

    public mgo buildEvent(String str, String str2, long j, long j2, byte[] bArr) {
        return new mgo(str, str2, j2, j, bArr);
    }

    public bho buildEventStream(String str, String str2, long j, long[] jArr, mgo[] mgoVarArr) {
        return new bho(str, str2, jArr, mgoVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a buildFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List list, List list2, String str4, String str5, String str6, List list3, List list4) {
        String str7;
        String str8;
        String str9 = str5;
        if (eh20.l(str2)) {
            str7 = eh20.b(str4);
        } else if (eh20.p(str2)) {
            str7 = eh20.k(str4);
        } else if (eh20.o(str2) || eh20.n(str2)) {
            str7 = str2;
        } else if ("application/mp4".equals(str2)) {
            str7 = eh20.e(str4);
            if ("text/vtt".equals(str7)) {
                str7 = "application/x-mp4-vtt";
            }
        } else {
            str7 = null;
        }
        if ("audio/eac3".equals(str7)) {
            str7 = parseEac3SupplementalProperties(list4);
            if ("audio/eac3-joc".equals(str7)) {
                str8 = "ec+3";
                if (eh20.m(str8, str9)) {
                    if (str9 == null) {
                        str9 = str8;
                    }
                    str7 = "video/dolby-vision";
                    str8 = str9;
                }
                int parseSelectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
                int parseRoleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
                Pair<Integer, Integer> parseTileCountFromProperties = parseTileCountFromProperties(list3);
                f7s f7sVar = new f7s();
                f7sVar.a = str;
                f7sVar.l = eh20.q(str2);
                f7sVar.m = eh20.q(str7);
                f7sVar.j = str8;
                f7sVar.i = i5;
                f7sVar.e = parseSelectionFlagsFromRoleDescriptors;
                f7sVar.f = parseRoleFlagsFromRoleDescriptors;
                f7sVar.d = str3;
                int i6 = -1;
                f7sVar.J = parseTileCountFromProperties == null ? ((Integer) parseTileCountFromProperties.first).intValue() : -1;
                f7sVar.K = parseTileCountFromProperties == null ? ((Integer) parseTileCountFromProperties.second).intValue() : -1;
                if (!eh20.p(str7)) {
                    f7sVar.t = i;
                    f7sVar.u = i2;
                    f7sVar.v = f;
                } else if (eh20.l(str7)) {
                    f7sVar.C = i3;
                    f7sVar.D = i4;
                } else if (eh20.o(str7)) {
                    if ("application/cea-608".equals(str7)) {
                        i6 = parseCea608AccessibilityChannel(list2);
                    } else if ("application/cea-708".equals(str7)) {
                        i6 = parseCea708AccessibilityChannel(list2);
                    }
                    f7sVar.H = i6;
                } else if (eh20.n(str7)) {
                    f7sVar.t = i;
                    f7sVar.u = i2;
                }
                return new a(f7sVar);
            }
        }
        str8 = str4;
        if (eh20.m(str8, str9)) {
        }
        int parseSelectionFlagsFromRoleDescriptors2 = parseSelectionFlagsFromRoleDescriptors(list);
        int parseRoleFlagsFromRoleDescriptors2 = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> parseTileCountFromProperties2 = parseTileCountFromProperties(list3);
        f7s f7sVar2 = new f7s();
        f7sVar2.a = str;
        f7sVar2.l = eh20.q(str2);
        f7sVar2.m = eh20.q(str7);
        f7sVar2.j = str8;
        f7sVar2.i = i5;
        f7sVar2.e = parseSelectionFlagsFromRoleDescriptors2;
        f7sVar2.f = parseRoleFlagsFromRoleDescriptors2;
        f7sVar2.d = str3;
        int i62 = -1;
        f7sVar2.J = parseTileCountFromProperties2 == null ? ((Integer) parseTileCountFromProperties2.first).intValue() : -1;
        f7sVar2.K = parseTileCountFromProperties2 == null ? ((Integer) parseTileCountFromProperties2.second).intValue() : -1;
        if (!eh20.p(str7)) {
        }
        return new a(f7sVar2);
    }

    public egg buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lhf0 lhf0Var, kw21 kw21Var, kvq0 kvq0Var, Uri uri, List list) {
        return new egg(j, j2, j3, z, j4, j5, j6, j7, lhf0Var, kw21Var, kvq0Var, uri, list);
    }

    public pxa0 buildPeriod(String str, long j, List<a70> list, List<bho> list2, eyi eyiVar) {
        return new pxa0(str, j, list, list2);
    }

    public w6i0 buildRangedUri(String str, long j, long j2) {
        return new w6i0(str, j, j2);
    }

    public s4j0 buildRepresentation(fgg fggVar, String str, List list, String str2, ArrayList arrayList, ArrayList arrayList2) {
        String str3;
        f7s a = fggVar.a.a();
        if (str == null || !list.isEmpty()) {
            a.c = ImmutableList.l(list);
        } else {
            a.b = str;
        }
        String str4 = fggVar.d;
        if (str4 != null) {
            str2 = str4;
        }
        ArrayList arrayList3 = fggVar.e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= arrayList3.size()) {
                    str3 = null;
                    break;
                }
                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList3.get(i);
                if (b87.c.equals(schemeData.uuid) && (str3 = schemeData.licenseServerUrl) != null) {
                    arrayList3.remove(i);
                    break;
                }
                i++;
            }
            if (str3 != null) {
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList3.get(i2);
                    if (b87.b.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                        arrayList3.set(i2, new DrmInitData.SchemeData(b87.c, str3, schemeData2.mimeType, schemeData2.data));
                    }
                }
            }
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) arrayList3.get(size);
                if (!schemeData3.hasData()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList3.size()) {
                            break;
                        }
                        if (((DrmInitData.SchemeData) arrayList3.get(i3)).canReplace(schemeData3)) {
                            arrayList3.remove(size);
                            break;
                        }
                        i3++;
                    }
                }
            }
            a.q = new DrmInitData(str2, arrayList3);
        }
        ArrayList arrayList4 = fggVar.f;
        arrayList4.addAll(arrayList2);
        a aVar = new a(a);
        ImmutableList immutableList = fggVar.b;
        c8q0 c8q0Var = fggVar.c;
        if (c8q0Var instanceof b8q0) {
            return new r4j0(aVar, immutableList, (b8q0) c8q0Var, arrayList4);
        }
        if (c8q0Var instanceof x7q0) {
            return new q4j0(aVar, immutableList, (x7q0) c8q0Var, arrayList4);
        }
        ny61.g("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        return null;
    }

    public y7q0 buildSegmentList(w6i0 w6i0Var, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        return new y7q0(w6i0Var, j, j2, j3, j4, list, j5, list2, tw21.W(j6), tw21.W(j7));
    }

    public z7q0 buildSegmentTemplate(w6i0 w6i0Var, long j, long j2, long j3, long j4, long j5, List list, long j6, xh21 xh21Var, xh21 xh21Var2, long j7, long j8) {
        return new z7q0(w6i0Var, j, j2, j3, j4, j5, list, j6, xh21Var, xh21Var2, tw21.W(j7), tw21.W(j8));
    }

    public a8q0 buildSegmentTimelineElement(long j, long j2) {
        return new a8q0(j, j2);
    }

    public b8q0 buildSingleSegmentBase(w6i0 w6i0Var, long j, long j2, long j3, long j4) {
        return new b8q0(w6i0Var, j, j2, j3, j4);
    }

    public kw21 buildUtcTimingElement(String str, String str2) {
        return new kw21(str, str2);
    }

    @Override // defpackage.gg90
    public egg parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return parseMediaPresentationDescription(newPullParser, uri);
            }
            throw ParserException.b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw ParserException.b(e, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x03c8 A[LOOP:0: B:2:0x00a2->B:10:0x03c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0378 A[EDGE_INSN: B:11:0x0378->B:12:0x0378 BREAK  A[LOOP:0: B:2:0x00a2->B:10:0x03c8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a70 parseAdaptationSet(XmlPullParser xmlPullParser, List<ic5> list, c8q0 c8q0Var, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        c8q0 c8q0Var2;
        String str;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        ArrayList arrayList4;
        String str3;
        int i2;
        long j6;
        long j7;
        ArrayList arrayList5;
        int i3;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        c8q0 parseSegmentTemplate;
        List<ic5> list2;
        ArrayList arrayList9;
        ArrayList arrayList10;
        c8q0 c8q0Var3;
        String str4;
        ArrayList arrayList11;
        ArrayList arrayList12;
        String str5;
        long j8;
        int i4;
        ggg gggVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long parseLong = parseLong(xmlPullParser2, "id", -1L);
        int parseContentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
        int parseInt = parseInt(xmlPullParser2, "width", -1);
        int parseInt2 = parseInt(xmlPullParser2, "height", -1);
        float parseFrameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int parseInt3 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str6 = "lang";
        String attributeValue5 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue6 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = arrayList13;
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        String str7 = attributeValue;
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = arrayList15;
        ArrayList arrayList22 = new ArrayList();
        ArrayList arrayList23 = new ArrayList();
        long j9 = j3;
        String str8 = attributeValue4;
        int i5 = parseInt;
        int i6 = parseInt2;
        float f = parseFrameRate;
        String str9 = attributeValue5;
        int i7 = parseContentType;
        boolean z2 = false;
        int i8 = -1;
        String str10 = null;
        c8q0 c8q0Var4 = c8q0Var;
        String str11 = attributeValue3;
        long j10 = j2;
        while (true) {
            xmlPullParser2.next();
            int i9 = i8;
            if (hq91.e(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    j10 = gggVar.parseAvailabilityTimeOffsetUs(xmlPullParser2, j10);
                    z2 = true;
                }
                arrayList23.addAll(gggVar.parseBaseUrl(xmlPullParser2, list, z));
                i8 = i9;
                j10 = j10;
                arrayList = arrayList23;
                arrayList5 = arrayList14;
                str2 = str6;
                arrayList2 = arrayList18;
                arrayList3 = arrayList17;
                arrayList8 = arrayList16;
                arrayList6 = arrayList22;
                arrayList4 = arrayList19;
                str3 = attributeValue2;
                i2 = parseInt3;
            } else {
                long j11 = j10;
                if (hq91.e(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                    arrayList = arrayList23;
                    Object obj = parseContentProtection.first;
                    if (obj != null) {
                        str10 = (String) obj;
                    }
                    Object obj2 = parseContentProtection.second;
                    if (obj2 != null) {
                        arrayList14.add((DrmInitData.SchemeData) obj2);
                    }
                    i8 = i9;
                    str2 = str6;
                    arrayList2 = arrayList18;
                    arrayList3 = arrayList17;
                    arrayList6 = arrayList22;
                    j10 = j11;
                } else {
                    arrayList = arrayList23;
                    if (hq91.e(xmlPullParser2, "ContentComponent")) {
                        String attributeValue7 = xmlPullParser2.getAttributeValue(null, str6);
                        if (str9 == null) {
                            str9 = attributeValue7;
                        } else if (attributeValue7 != null) {
                            d6z.x(str9.equals(attributeValue7));
                        }
                        int parseContentType2 = parseContentType(xmlPullParser);
                        if (i7 == -1) {
                            i7 = parseContentType2;
                        } else if (parseContentType2 != -1) {
                            d6z.x(i7 == parseContentType2);
                        }
                        i8 = i9;
                    } else {
                        if (hq91.e(xmlPullParser2, "Role")) {
                            arrayList18.add(parseDescriptor(xmlPullParser2, "Role"));
                        } else if (hq91.e(xmlPullParser2, "AudioChannelConfiguration")) {
                            i8 = gggVar.parseAudioChannelConfiguration(xmlPullParser2, attributeValue2);
                        } else if (hq91.e(xmlPullParser2, "Accessibility")) {
                            arrayList17.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (hq91.e(xmlPullParser2, "EssentialProperty")) {
                            arrayList19.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (hq91.e(xmlPullParser2, "SupplementalProperty")) {
                            arrayList20.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else if (hq91.e(xmlPullParser2, "Representation")) {
                            ArrayList arrayList24 = arrayList20;
                            if (arrayList.isEmpty()) {
                                list2 = list;
                                arrayList9 = arrayList19;
                                str2 = str6;
                                arrayList10 = arrayList16;
                                c8q0Var3 = c8q0Var4;
                                str4 = str7;
                                arrayList11 = arrayList21;
                                arrayList12 = arrayList22;
                                str5 = str8;
                                j8 = j11;
                                i4 = i9;
                            } else {
                                list2 = arrayList;
                                i4 = i9;
                                arrayList9 = arrayList19;
                                str2 = str6;
                                arrayList10 = arrayList16;
                                c8q0Var3 = c8q0Var4;
                                str4 = str7;
                                arrayList11 = arrayList21;
                                arrayList12 = arrayList22;
                                str5 = str8;
                                j8 = j11;
                            }
                            XmlPullParser xmlPullParser3 = xmlPullParser2;
                            arrayList5 = arrayList14;
                            String str12 = str9;
                            int i10 = i6;
                            float f2 = f;
                            ggg gggVar2 = gggVar;
                            int i11 = i7;
                            String str13 = str11;
                            int i12 = i5;
                            fgg parseRepresentation = gggVar2.parseRepresentation(xmlPullParser3, list2, str4, attributeValue2, str13, str5, i12, i10, f2, i4, parseInt3, str12, arrayList18, arrayList17, arrayList9, arrayList24, c8q0Var3, j4, j, j8, j9, j5, z);
                            str7 = str4;
                            str11 = str13;
                            i5 = i12;
                            i6 = i10;
                            f = f2;
                            int i13 = i4;
                            c8q0Var2 = c8q0Var3;
                            arrayList2 = arrayList18;
                            arrayList4 = arrayList9;
                            str3 = attributeValue2;
                            arrayList3 = arrayList17;
                            long j12 = j9;
                            i2 = parseInt3;
                            long j13 = j8;
                            str8 = str5;
                            int i14 = eh20.i(parseRepresentation.a.n);
                            if (i11 == -1) {
                                i11 = i14;
                            } else if (i14 != -1) {
                                d6z.x(i11 == i14);
                            }
                            ArrayList arrayList25 = arrayList12;
                            arrayList25.add(parseRepresentation);
                            xmlPullParser2 = xmlPullParser3;
                            j9 = j12;
                            j10 = j13;
                            arrayList6 = arrayList25;
                            arrayList20 = arrayList24;
                            str9 = str12;
                            i8 = i13;
                            arrayList8 = arrayList10;
                            arrayList7 = arrayList11;
                            i7 = i11;
                            c8q0Var4 = c8q0Var2;
                            if (!hq91.d(xmlPullParser2, "AdaptationSet")) {
                                break;
                            }
                            gggVar = this;
                            arrayList21 = arrayList7;
                            attributeValue2 = str3;
                            parseInt3 = i2;
                            arrayList17 = arrayList3;
                            arrayList18 = arrayList2;
                            arrayList19 = arrayList4;
                            arrayList23 = arrayList;
                            arrayList22 = arrayList6;
                            str6 = str2;
                            arrayList16 = arrayList8;
                            arrayList14 = arrayList5;
                        } else {
                            c8q0Var2 = c8q0Var4;
                            str = str9;
                            str2 = str6;
                            arrayList2 = arrayList18;
                            arrayList3 = arrayList17;
                            ArrayList arrayList26 = arrayList16;
                            ArrayList arrayList27 = arrayList21;
                            i = i9;
                            arrayList4 = arrayList19;
                            ArrayList arrayList28 = arrayList20;
                            str3 = attributeValue2;
                            i2 = parseInt3;
                            j6 = j9;
                            XmlPullParser xmlPullParser4 = xmlPullParser2;
                            ggg gggVar3 = gggVar;
                            int i15 = i7;
                            j7 = j11;
                            arrayList5 = arrayList14;
                            ArrayList arrayList29 = arrayList22;
                            if (hq91.e(xmlPullParser4, "SegmentBase")) {
                                b8q0 parseSegmentBase = gggVar3.parseSegmentBase(xmlPullParser4, (b8q0) c8q0Var2);
                                xmlPullParser2 = xmlPullParser4;
                                j9 = j6;
                                j10 = j7;
                                arrayList6 = arrayList29;
                                str9 = str;
                                i8 = i;
                                arrayList8 = arrayList26;
                                arrayList7 = arrayList27;
                                i7 = i15;
                                c8q0Var4 = parseSegmentBase;
                                arrayList20 = arrayList28;
                            } else {
                                if (hq91.e(xmlPullParser4, "SegmentList")) {
                                    long parseAvailabilityTimeOffsetUs = gggVar3.parseAvailabilityTimeOffsetUs(xmlPullParser4, j6);
                                    arrayList6 = arrayList29;
                                    i3 = i15;
                                    xmlPullParser2 = xmlPullParser;
                                    parseSegmentTemplate = gggVar3.parseSegmentList(xmlPullParser2, (y7q0) c8q0Var2, j4, j, j7, parseAvailabilityTimeOffsetUs, j5);
                                    j10 = j7;
                                    j9 = parseAvailabilityTimeOffsetUs;
                                    arrayList20 = arrayList28;
                                } else {
                                    i3 = i15;
                                    xmlPullParser2 = xmlPullParser4;
                                    arrayList6 = arrayList29;
                                    if (hq91.e(xmlPullParser2, "SegmentTemplate")) {
                                        long parseAvailabilityTimeOffsetUs2 = gggVar3.parseAvailabilityTimeOffsetUs(xmlPullParser2, j6);
                                        arrayList20 = arrayList28;
                                        parseSegmentTemplate = gggVar3.parseSegmentTemplate(xmlPullParser2, (z7q0) c8q0Var2, arrayList20, j4, j, j7, parseAvailabilityTimeOffsetUs2, j5);
                                        j10 = j7;
                                        j9 = parseAvailabilityTimeOffsetUs2;
                                    } else {
                                        arrayList20 = arrayList28;
                                        if (hq91.e(xmlPullParser2, "InbandEventStream")) {
                                            arrayList7 = arrayList27;
                                            arrayList7.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                            arrayList8 = arrayList26;
                                        } else {
                                            arrayList7 = arrayList27;
                                            if (hq91.e(xmlPullParser2, "Label")) {
                                                arrayList8 = arrayList26;
                                                arrayList8.add(parseLabel(xmlPullParser));
                                            } else {
                                                arrayList8 = arrayList26;
                                                if (xmlPullParser2.getEventType() == 2) {
                                                    parseAdaptationSetChild(xmlPullParser);
                                                }
                                            }
                                        }
                                        j9 = j6;
                                        j10 = j7;
                                        str9 = str;
                                        i8 = i;
                                        i7 = i3;
                                        c8q0Var4 = c8q0Var2;
                                    }
                                }
                                str9 = str;
                                i8 = i;
                                i7 = i3;
                                arrayList8 = arrayList26;
                                c8q0Var4 = parseSegmentTemplate;
                                arrayList7 = arrayList27;
                            }
                            if (!hq91.d(xmlPullParser2, "AdaptationSet")) {
                            }
                        }
                        str2 = str6;
                        arrayList2 = arrayList18;
                        arrayList3 = arrayList17;
                        c8q0Var2 = c8q0Var4;
                        arrayList6 = arrayList22;
                        str3 = attributeValue2;
                        i3 = i7;
                        str = str9;
                        i2 = parseInt3;
                        j6 = j9;
                        j7 = j11;
                        arrayList5 = arrayList14;
                        arrayList8 = arrayList16;
                        arrayList4 = arrayList19;
                        arrayList7 = arrayList21;
                        i = i9;
                        j9 = j6;
                        j10 = j7;
                        str9 = str;
                        i8 = i;
                        i7 = i3;
                        c8q0Var4 = c8q0Var2;
                        if (!hq91.d(xmlPullParser2, "AdaptationSet")) {
                        }
                    }
                    str2 = str6;
                    arrayList2 = arrayList18;
                    arrayList3 = arrayList17;
                    arrayList6 = arrayList22;
                    j10 = j11;
                }
                str3 = attributeValue2;
                arrayList5 = arrayList14;
                i2 = parseInt3;
                arrayList8 = arrayList16;
                arrayList4 = arrayList19;
            }
            arrayList7 = arrayList21;
            if (!hq91.d(xmlPullParser2, "AdaptationSet")) {
            }
        }
        ArrayList arrayList30 = new ArrayList(arrayList6.size());
        int i16 = 0;
        while (i16 < arrayList6.size()) {
            ArrayList arrayList31 = arrayList7;
            ArrayList arrayList32 = arrayList8;
            String str14 = attributeValue6;
            arrayList30.add(buildRepresentation((fgg) arrayList6.get(i16), str14, arrayList32, str10, arrayList5, arrayList31));
            i16++;
            attributeValue6 = str14;
            arrayList7 = arrayList31;
            arrayList8 = arrayList32;
        }
        return buildAdaptationSet(parseLong, i7, arrayList30, arrayList3, arrayList4, arrayList20);
    }

    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        char c;
        String parseString = parseString(xmlPullParser, "schemeIdUri", null);
        parseString.getClass();
        int i = -1;
        switch (parseString.hashCode()) {
            case -2128649360:
                if (parseString.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2060825028:
                if (parseString.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1352850286:
                if (parseString.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1138141449:
                if (parseString.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -986633423:
                if (parseString.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -79006963:
                if (parseString.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 312179081:
                if (parseString.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2036691300:
                if (parseString.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c = 7;
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
            case 5:
                i = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case 1:
                i = parseDolbyAC4ChannelConfiguration(xmlPullParser, str);
                break;
            case 2:
                i = parseInt(xmlPullParser, "value", -1);
                break;
            case 3:
            case 7:
                i = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case 4:
                i = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case 6:
                i = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!hq91.d(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        return attributeValue == null ? j : "INF".equals(attributeValue) ? ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED : (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List parseBaseUrl(XmlPullParser xmlPullParser, List list, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String parseText = parseText(xmlPullParser, "BaseURL");
        if (parseText != null && m4m0.f(parseText)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = parseText;
            }
            return u.a(new ic5(parseText, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ic5 ic5Var = (ic5) list.get(i);
            String i2 = m4m0.i(ic5Var.a, parseText);
            String str = attributeValue3 == null ? i2 : attributeValue3;
            if (z) {
                parseInt = ic5Var.c;
                parseInt2 = ic5Var.d;
                str = ic5Var.b;
            }
            arrayList.add(new ic5(i2, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        ?? r5;
        String str2;
        String str3;
        ?? r6;
        char c;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String g = f0b1.g(attributeValue);
            g.getClass();
            switch (g.hashCode()) {
                case -1980789791:
                    if (g.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 489446379:
                    if (g.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 755418770:
                    if (g.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1812765994:
                    if (g.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c = 3;
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
                    r5 = b87.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r6 = str2;
                    break;
                case 1:
                    r5 = b87.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r6 = str2;
                    break;
                case 2:
                    r5 = b87.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r6 = str2;
                    break;
                case 3:
                    str = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            str4 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int indexOf = attributeName.indexOf(58);
                            if (indexOf != -1) {
                                attributeName = attributeName.substring(indexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                str4 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str4) && !"00000000-0000-0000-0000-000000000000".equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i2 = 0; i2 < split.length; i2++) {
                            uuidArr[i2] = UUID.fromString(split[i2]);
                        }
                        r5 = b87.b;
                        str3 = null;
                        r6 = vaa1.c(r5, uuidArr, null);
                        break;
                    } else {
                        lk91.j("Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r5 = null;
                        str2 = r5;
                        str3 = str2;
                        r6 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if ((!hq91.e(xmlPullParser, "clearkey:Laurl") || hq91.e(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r6 = r6;
                } else if (hq91.e(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r6 = r6;
                } else {
                    if (r6 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals("pssh") && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            lg e = vaa1.e(decode);
                            UUID uuid = e == null ? null : (UUID) e.b;
                            if (uuid == null) {
                                lk91.j("Skipping malformed cenc:pssh data");
                                r5 = uuid;
                                r6 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r6 = decode;
                                r5 = uuid2;
                            }
                        }
                    }
                    if (r6 == 0) {
                        ?? r8 = b87.e;
                        if (r8.equals(r5) && hq91.e(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r6 = vaa1.c(r8, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    maybeSkipTag(xmlPullParser);
                    r6 = r6;
                }
            } while (!hq91.d(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r5 != null ? new DrmInitData.SchemeData(r5, str3, "video/mp4", r6) : null);
        }
        str = null;
        r5 = null;
        str2 = r5;
        str3 = str2;
        r6 = str2;
        do {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r6 = r6;
        } while (!hq91.d(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r5 != null ? new DrmInitData.SchemeData(r5, str3, "video/mp4", r6) : null);
    }

    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair<Long, mgo> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        long parseLong = parseLong(xmlPullParser, "id", 0L);
        long parseLong2 = parseLong(xmlPullParser, "duration", -9223372036854775807L);
        long parseLong3 = parseLong(xmlPullParser, "presentationTime", 0L);
        int i = tw21.a;
        RoundingMode roundingMode = RoundingMode.DOWN;
        long e0 = tw21.e0(parseLong2, 1000L, j, roundingMode);
        long e02 = tw21.e0(parseLong3 - j2, 1000000L, j, roundingMode);
        String parseString = parseString(xmlPullParser, "messageData", null);
        byte[] parseEventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(e02);
        if (parseString != null) {
            parseEventObject = parseString.getBytes(StandardCharsets.UTF_8);
        }
        return Pair.create(valueOf, buildEvent(str, str2, parseLong, e0, parseEventObject));
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!hq91.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public bho parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ggg gggVar;
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", "");
        long parseLong = parseLong(xmlPullParser, "timescale", 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "Event")) {
                gggVar = this;
                j = parseLong;
                str = parseString2;
                str2 = parseString;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(gggVar.parseEvent(xmlPullParser2, str2, str, j, parseLong2, byteArrayOutputStream));
            } else {
                gggVar = this;
                j = parseLong;
                str = parseString2;
                str2 = parseString;
                xmlPullParser2 = xmlPullParser;
                maybeSkipTag(xmlPullParser2);
            }
            if (hq91.d(xmlPullParser2, "EventStream")) {
                break;
            }
            this = gggVar;
            xmlPullParser = xmlPullParser2;
            parseString = str2;
            parseString2 = str;
            parseLong = j;
        }
        long[] jArr = new long[arrayList.size()];
        mgo[] mgoVarArr = new mgo[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            mgoVarArr[i] = (mgo) pair.second;
        }
        return gggVar.buildEventStream(str2, str, j, jArr, mgoVarArr);
    }

    public w6i0 parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }

    public kqx parseLabel(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return new kqx(xmlPullParser.getAttributeValue(null, "lang"), parseText(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01d6 A[LOOP:1: B:26:0x00b4->B:34:0x01d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public egg parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j;
        long j2;
        Exception exc;
        long j3;
        ggg gggVar = this;
        String[] parseProfiles = gggVar.parseProfiles(xmlPullParser, "profiles", new String[0]);
        int length = parseProfiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (parseProfiles[i].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z = true;
                break;
            }
            i++;
        }
        long parseDateTime = parseDateTime(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long parseDuration = parseDuration(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long parseDuration2 = parseDuration(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long parseDuration3 = equals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration4 = equals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration5 = equals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long parseDateTime2 = parseDateTime(xmlPullParser, "publishTime", -9223372036854775807L);
        long j4 = equals ? 0L : -9223372036854775807L;
        ArrayList a = u.a(new ic5(uri.toString(), uri.toString(), z ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j5 = equals ? -9223372036854775807L : 0L;
        long j6 = j4;
        lhf0 lhf0Var = null;
        boolean z2 = false;
        boolean z3 = false;
        kw21 kw21Var = null;
        Uri uri2 = null;
        kvq0 kvq0Var = null;
        while (true) {
            xmlPullParser.next();
            ArrayList arrayList6 = arrayList4;
            if (hq91.e(xmlPullParser, "BaseURL")) {
                if (!z3) {
                    j6 = gggVar.parseAvailabilityTimeOffsetUs(xmlPullParser, j6);
                    z3 = true;
                }
                arrayList5.addAll(gggVar.parseBaseUrl(xmlPullParser, a, z));
            } else if (hq91.e(xmlPullParser, "ProgramInformation")) {
                lhf0Var = parseProgramInformation(xmlPullParser);
            } else if (hq91.e(xmlPullParser, "UTCTiming")) {
                kw21Var = parseUtcTiming(xmlPullParser);
            } else if (hq91.e(xmlPullParser, "Location")) {
                uri2 = m4m0.j(uri.toString(), xmlPullParser.nextText());
            } else if (hq91.e(xmlPullParser, "ServiceDescription")) {
                kvq0Var = parseServiceDescription(xmlPullParser);
            } else {
                if (!hq91.e(xmlPullParser, "Period") || z2) {
                    arrayList = a;
                    arrayList2 = arrayList6;
                    arrayList3 = arrayList5;
                    j = j5;
                    j2 = j6;
                    maybeSkipTag(xmlPullParser);
                } else {
                    arrayList3 = arrayList5;
                    j = j5;
                    j2 = j6;
                    arrayList = a;
                    if (!arrayList5.isEmpty()) {
                        a = arrayList3;
                    }
                    Pair<pxa0, Long> parsePeriod = parsePeriod(xmlPullParser, a, j, j2, parseDateTime, parseDuration4, z);
                    pxa0 pxa0Var = (pxa0) parsePeriod.first;
                    if (pxa0Var.b != -9223372036854775807L) {
                        long longValue = ((Long) parsePeriod.second).longValue();
                        long j7 = longValue == -9223372036854775807L ? -9223372036854775807L : pxa0Var.b + longValue;
                        arrayList2 = arrayList6;
                        arrayList2.add(pxa0Var);
                        j = j7;
                    } else {
                        if (!equals) {
                            throw ParserException.b(null, "Unable to determine start of period " + arrayList6.size());
                        }
                        arrayList2 = arrayList6;
                        z2 = true;
                    }
                }
                j6 = j2;
                j5 = j;
                if (hq91.d(xmlPullParser, "MPD")) {
                    ArrayList arrayList7 = arrayList2;
                    uri2 = uri2;
                    parseDuration3 = parseDuration3;
                    parseDuration4 = parseDuration4;
                    parseDuration5 = parseDuration5;
                    parseDateTime2 = parseDateTime2;
                    gggVar = this;
                    kw21Var = kw21Var;
                    parseDuration2 = parseDuration2;
                    equals = equals;
                    arrayList5 = arrayList3;
                    a = arrayList;
                    arrayList4 = arrayList7;
                } else {
                    if (parseDuration == -9223372036854775807L) {
                        if (j5 != -9223372036854775807L) {
                            j3 = j5;
                            exc = null;
                            if (arrayList2.isEmpty()) {
                                return buildMediaPresentationDescription(parseDateTime, j3, parseDuration2, equals, parseDuration3, parseDuration4, parseDuration5, parseDateTime2, lhf0Var, kw21Var, kvq0Var, uri2, arrayList2);
                            }
                            throw ParserException.b(exc, "No periods found.");
                        }
                        if (!equals) {
                            throw ParserException.b(null, "Unable to determine duration of static manifest.");
                        }
                    }
                    exc = null;
                    j3 = parseDuration;
                    if (arrayList2.isEmpty()) {
                    }
                }
            }
            arrayList = a;
            arrayList2 = arrayList6;
            arrayList3 = arrayList5;
            if (hq91.d(xmlPullParser, "MPD")) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    public Pair<pxa0, Long> parsePeriod(XmlPullParser xmlPullParser, List<ic5> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        List<ic5> list2;
        long j5;
        c8q0 c8q0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j6;
        Object obj;
        long j7;
        XmlPullParser xmlPullParser2;
        long j8;
        long j9;
        c8q0 parseSegmentTemplate;
        long j10;
        eyi eyiVar;
        long j11;
        c8q0 c8q0Var2;
        boolean z2;
        long j12;
        List<ic5> list3;
        ggg gggVar = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long parseDuration = parseDuration(xmlPullParser3, "start", j);
        long j13 = j3 != -9223372036854775807L ? j3 + parseDuration : -9223372036854775807L;
        long parseDuration2 = parseDuration(xmlPullParser3, "duration", -9223372036854775807L);
        ArrayList arrayList3 = new ArrayList();
        long j14 = -9223372036854775807L;
        ArrayList arrayList4 = new ArrayList();
        boolean z3 = false;
        eyi eyiVar2 = null;
        long j15 = j2;
        ArrayList arrayList5 = arrayList3;
        c8q0 c8q0Var3 = null;
        long j16 = -9223372036854775807L;
        ?? r10 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            if (hq91.e(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j15 = gggVar.parseAvailabilityTimeOffsetUs(xmlPullParser3, j15);
                    z3 = true;
                }
                r10.addAll(gggVar.parseBaseUrl(xmlPullParser3, list, z));
                arrayList2 = arrayList5;
                j10 = j15;
                arrayList = arrayList4;
                z2 = z3;
                j6 = j14;
                obj = null;
                j7 = parseDuration2;
                list2 = r10;
                eyiVar = eyiVar2;
                xmlPullParser2 = xmlPullParser3;
                c8q0Var2 = c8q0Var3;
                j12 = j16;
                j9 = j13;
            } else {
                ArrayList arrayList6 = arrayList5;
                if (hq91.e(xmlPullParser3, "AdaptationSet")) {
                    if (r10.isEmpty()) {
                        list2 = r10;
                        list3 = list;
                    } else {
                        list3 = r10;
                        list2 = list3;
                    }
                    ArrayList arrayList7 = arrayList4;
                    long j17 = j15;
                    long j18 = j13;
                    long j19 = parseDuration2;
                    a70 parseAdaptationSet = gggVar.parseAdaptationSet(xmlPullParser3, list3, c8q0Var3, j19, j17, j16, j18, j4, z);
                    j13 = j18;
                    j5 = j16;
                    arrayList6.add(parseAdaptationSet);
                    c8q0Var = c8q0Var3;
                    j7 = j19;
                    arrayList = arrayList7;
                    obj = null;
                    xmlPullParser2 = xmlPullParser3;
                    j8 = j17;
                    arrayList2 = arrayList6;
                    j6 = -9223372036854775807L;
                } else {
                    list2 = r10;
                    ArrayList arrayList8 = arrayList4;
                    long j20 = j15;
                    j5 = j16;
                    if (hq91.e(xmlPullParser3, "EventStream")) {
                        arrayList8.add(parseEventStream(xmlPullParser));
                        c8q0Var = c8q0Var3;
                        j7 = parseDuration2;
                        arrayList = arrayList8;
                        arrayList2 = arrayList6;
                        j6 = -9223372036854775807L;
                        obj = null;
                        xmlPullParser2 = xmlPullParser3;
                        j8 = j20;
                    } else {
                        if (hq91.e(xmlPullParser3, "SegmentBase")) {
                            parseSegmentTemplate = gggVar.parseSegmentBase(xmlPullParser3, null);
                            j10 = j20;
                            obj = null;
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j6 = -9223372036854775807L;
                            j9 = j13;
                            j7 = parseDuration2;
                            eyiVar = eyiVar2;
                            xmlPullParser2 = xmlPullParser3;
                        } else if (hq91.e(xmlPullParser3, "SegmentList")) {
                            long j21 = j13;
                            long j22 = parseDuration2;
                            long parseAvailabilityTimeOffsetUs = gggVar.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j6 = -9223372036854775807L;
                            c8q0 parseSegmentList = gggVar.parseSegmentList(xmlPullParser3, null, j21, j22, j20, parseAvailabilityTimeOffsetUs, j4);
                            j10 = j20;
                            obj = null;
                            j9 = j21;
                            j7 = j22;
                            eyiVar = eyiVar2;
                            xmlPullParser2 = xmlPullParser3;
                            j11 = parseAvailabilityTimeOffsetUs;
                            c8q0Var2 = parseSegmentList;
                            z2 = z3;
                            j12 = j11;
                        } else {
                            c8q0Var = c8q0Var3;
                            arrayList = arrayList8;
                            arrayList2 = arrayList6;
                            j6 = -9223372036854775807L;
                            if (hq91.e(xmlPullParser3, "SegmentTemplate")) {
                                j5 = gggVar.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                                obj = null;
                                parseSegmentTemplate = gggVar.parseSegmentTemplate(xmlPullParser3, null, ImmutableList.p(), j13, parseDuration2, j20, j5, j4);
                                j7 = parseDuration2;
                                xmlPullParser2 = xmlPullParser3;
                                j9 = j13;
                                j10 = j20;
                                eyiVar = eyiVar2;
                            } else {
                                obj = null;
                                j7 = parseDuration2;
                                xmlPullParser2 = xmlPullParser3;
                                j8 = j20;
                                j9 = j13;
                                if (hq91.e(xmlPullParser2, "AssetIdentifier")) {
                                    eyiVar2 = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser2);
                                }
                                j10 = j8;
                                eyiVar = eyiVar2;
                                j11 = j5;
                                c8q0Var2 = c8q0Var;
                                z2 = z3;
                                j12 = j11;
                            }
                        }
                        j11 = j5;
                        c8q0Var2 = parseSegmentTemplate;
                        z2 = z3;
                        j12 = j11;
                    }
                }
                j9 = j13;
                j10 = j8;
                eyiVar = eyiVar2;
                j11 = j5;
                c8q0Var2 = c8q0Var;
                z2 = z3;
                j12 = j11;
            }
            if (hq91.d(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, parseDuration, arrayList2, arrayList, eyiVar), Long.valueOf(j7));
            }
            gggVar = this;
            xmlPullParser3 = xmlPullParser2;
            j13 = j9;
            c8q0Var3 = c8q0Var2;
            j16 = j12;
            r10 = list2;
            arrayList5 = arrayList2;
            eyiVar2 = eyiVar;
            z3 = z2;
            parseDuration2 = j7;
            j14 = j6;
            j15 = j10;
            arrayList4 = arrayList;
        }
    }

    public String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public lhf0 parseProgramInformation(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String parseString = parseString(xmlPullParser, "moreInformationURL", null);
        String parseString2 = parseString(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (hq91.e(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (hq91.e(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str4 = str2;
            String str5 = str;
            String str6 = str3;
            if (hq91.d(xmlPullParser, "ProgramInformation")) {
                return new lhf0(str5, str4, str6, parseString, parseString2);
            }
            str = str5;
            str2 = str4;
            str3 = str6;
        }
    }

    public w6i0 parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j2 = -1;
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return buildRangedUri(attributeValue, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0258 A[LOOP:0: B:2:0x007a->B:11:0x0258, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0204 A[EDGE_INSN: B:12:0x0204->B:13:0x0204 BREAK  A[LOOP:0: B:2:0x007a->B:11:0x0258], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fgg parseRepresentation(XmlPullParser xmlPullParser, List<ic5> list, String str, String str2, String str3, String str4, int i, int i2, float f, int i3, int i4, String str5, List<eyi> list2, List<eyi> list3, List<eyi> list4, List<eyi> list5, c8q0 c8q0Var, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        String str6;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i5;
        ArrayList arrayList3;
        XmlPullParser xmlPullParser2;
        String str7;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j6;
        String str8;
        boolean z2;
        long j7;
        int i6;
        c8q0 c8q0Var2;
        ggg gggVar = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        int parseInt = parseInt(xmlPullParser3, "bandwidth", -1);
        String parseString = parseString(xmlPullParser3, "mimeType", str);
        String parseString2 = parseString(xmlPullParser3, "codecs", str2);
        String parseString3 = parseString(xmlPullParser3, "scte214:supplementalCodecs", str3);
        String parseString4 = parseString(xmlPullParser3, "scte214:supplementalProfiles", str4);
        int parseInt2 = parseInt(xmlPullParser3, "width", i);
        int parseInt3 = parseInt(xmlPullParser3, "height", i2);
        float parseFrameRate = parseFrameRate(xmlPullParser3, f);
        int parseInt4 = parseInt(xmlPullParser3, "audioSamplingRate", i4);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList(list4);
        ArrayList arrayList9 = new ArrayList(list5);
        ArrayList arrayList10 = new ArrayList();
        int i7 = i3;
        long j8 = j4;
        String str9 = null;
        boolean z3 = false;
        c8q0 c8q0Var3 = c8q0Var;
        long j9 = j3;
        while (true) {
            xmlPullParser3.next();
            ArrayList arrayList11 = arrayList6;
            if (hq91.e(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j9 = gggVar.parseAvailabilityTimeOffsetUs(xmlPullParser3, j9);
                    z3 = true;
                }
                c8q0 c8q0Var4 = c8q0Var3;
                str6 = attributeValue;
                arrayList10.addAll(gggVar.parseBaseUrl(xmlPullParser3, list, z));
                arrayList = arrayList11;
                xmlPullParser2 = xmlPullParser3;
                arrayList4 = arrayList8;
                arrayList5 = arrayList9;
                arrayList2 = arrayList10;
                j6 = j8;
                str7 = parseString2;
                i5 = parseInt;
                i6 = i7;
                str8 = str9;
                z2 = z3;
                c8q0Var2 = c8q0Var4;
            } else {
                c8q0 c8q0Var5 = c8q0Var3;
                str6 = attributeValue;
                if (hq91.e(xmlPullParser3, "AudioChannelConfiguration")) {
                    int parseAudioChannelConfiguration = gggVar.parseAudioChannelConfiguration(xmlPullParser3, parseString2);
                    c8q0Var2 = c8q0Var5;
                    arrayList = arrayList11;
                    xmlPullParser2 = xmlPullParser3;
                    i6 = parseAudioChannelConfiguration;
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList9;
                    arrayList2 = arrayList10;
                    j6 = j8;
                    str7 = parseString2;
                    i5 = parseInt;
                    str8 = str9;
                    z2 = z3;
                } else if (hq91.e(xmlPullParser3, "SegmentBase")) {
                    b8q0 parseSegmentBase = gggVar.parseSegmentBase(xmlPullParser3, (b8q0) c8q0Var5);
                    arrayList = arrayList11;
                    xmlPullParser2 = xmlPullParser3;
                    arrayList4 = arrayList8;
                    arrayList2 = arrayList10;
                    j6 = j8;
                    str7 = parseString2;
                    i5 = parseInt;
                    i6 = i7;
                    str8 = str9;
                    z2 = z3;
                    c8q0Var2 = parseSegmentBase;
                    arrayList3 = arrayList7;
                    arrayList5 = arrayList9;
                    j7 = j9;
                    if (hq91.d(xmlPullParser2, "Representation")) {
                        break;
                    }
                    int i8 = parseInt2;
                    ArrayList arrayList12 = arrayList3;
                    String str10 = parseString4;
                    parseInt2 = i8;
                    arrayList7 = arrayList12;
                    arrayList8 = arrayList4;
                    arrayList9 = arrayList5;
                    arrayList6 = arrayList;
                    c8q0Var3 = c8q0Var2;
                    j9 = j7;
                    j8 = j6;
                    arrayList10 = arrayList2;
                    parseString2 = str7;
                    z3 = z2;
                    str9 = str8;
                    i7 = i6;
                    parseString3 = parseString3;
                    parseString4 = str10;
                    attributeValue = str6;
                    parseInt = i5;
                    xmlPullParser3 = xmlPullParser2;
                    gggVar = this;
                } else {
                    if (hq91.e(xmlPullParser3, "SegmentList")) {
                        long j10 = j9;
                        long parseAvailabilityTimeOffsetUs = gggVar.parseAvailabilityTimeOffsetUs(xmlPullParser3, j8);
                        arrayList = arrayList11;
                        arrayList2 = arrayList10;
                        i5 = parseInt;
                        arrayList3 = arrayList7;
                        y7q0 parseSegmentList = gggVar.parseSegmentList(xmlPullParser3, (y7q0) c8q0Var5, j, j2, j10, parseAvailabilityTimeOffsetUs, j5);
                        xmlPullParser2 = xmlPullParser3;
                        str7 = parseString2;
                        str8 = str9;
                        z2 = z3;
                        arrayList5 = arrayList9;
                        j7 = j10;
                        i6 = i7;
                        c8q0Var2 = parseSegmentList;
                        arrayList4 = arrayList8;
                        j6 = parseAvailabilityTimeOffsetUs;
                    } else {
                        arrayList = arrayList11;
                        ArrayList arrayList13 = arrayList8;
                        ArrayList arrayList14 = arrayList9;
                        arrayList2 = arrayList10;
                        long j11 = j9;
                        i5 = parseInt;
                        arrayList3 = arrayList7;
                        if (hq91.e(xmlPullParser3, "SegmentTemplate")) {
                            long parseAvailabilityTimeOffsetUs2 = gggVar.parseAvailabilityTimeOffsetUs(xmlPullParser3, j8);
                            str7 = parseString2;
                            z7q0 parseSegmentTemplate = gggVar.parseSegmentTemplate(xmlPullParser3, (z7q0) c8q0Var5, list5, j, j2, j11, parseAvailabilityTimeOffsetUs2, j5);
                            xmlPullParser2 = xmlPullParser3;
                            str8 = str9;
                            z2 = z3;
                            arrayList5 = arrayList14;
                            j7 = j11;
                            i6 = i7;
                            c8q0Var2 = parseSegmentTemplate;
                            arrayList4 = arrayList13;
                            j6 = parseAvailabilityTimeOffsetUs2;
                        } else {
                            xmlPullParser2 = xmlPullParser3;
                            str7 = parseString2;
                            if (hq91.e(xmlPullParser2, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> parseContentProtection = parseContentProtection(xmlPullParser);
                                Object obj = parseContentProtection.first;
                                if (obj != null) {
                                    str9 = (String) obj;
                                }
                                Object obj2 = parseContentProtection.second;
                                if (obj2 != null) {
                                    arrayList.add((DrmInitData.SchemeData) obj2);
                                }
                                str8 = str9;
                                z2 = z3;
                                arrayList4 = arrayList13;
                                arrayList5 = arrayList14;
                                j7 = j11;
                                j6 = j8;
                            } else {
                                if (hq91.e(xmlPullParser2, "InbandEventStream")) {
                                    arrayList3.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                    arrayList4 = arrayList13;
                                } else if (hq91.e(xmlPullParser2, "EssentialProperty")) {
                                    arrayList4 = arrayList13;
                                    arrayList4.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                                } else {
                                    arrayList4 = arrayList13;
                                    if (hq91.e(xmlPullParser2, "SupplementalProperty")) {
                                        arrayList5 = arrayList14;
                                        arrayList5.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                                    } else {
                                        arrayList5 = arrayList14;
                                        maybeSkipTag(xmlPullParser2);
                                    }
                                    j6 = j8;
                                    str8 = str9;
                                    z2 = z3;
                                    j7 = j11;
                                }
                                arrayList5 = arrayList14;
                                j6 = j8;
                                str8 = str9;
                                z2 = z3;
                                j7 = j11;
                            }
                            i6 = i7;
                            c8q0Var2 = c8q0Var5;
                        }
                    }
                    if (hq91.d(xmlPullParser2, "Representation")) {
                    }
                }
            }
            arrayList3 = arrayList7;
            j7 = j9;
            if (hq91.d(xmlPullParser2, "Representation")) {
            }
        }
        ArrayList arrayList15 = arrayList3;
        String str11 = parseString4;
        ArrayList arrayList16 = arrayList;
        String str12 = parseString3;
        ArrayList arrayList17 = arrayList5;
        ArrayList arrayList18 = arrayList4;
        a buildFormat = buildFormat(str6, parseString, parseInt2, parseInt3, parseFrameRate, i6, parseInt4, i5, str5, list2, list3, str7, str12, str11, arrayList18, arrayList17);
        if (c8q0Var2 == null) {
            c8q0Var2 = new b8q0();
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        return new fgg(buildFormat, list, c8q0Var2, str8, arrayList16, arrayList15, arrayList18, arrayList17);
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<eyi> list) {
        int parseTvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            eyi eyiVar = list.get(i2);
            String str = eyiVar.a;
            String str2 = eyiVar.b;
            if (f0b1.f("urn:mpeg:dash:role:2011", str)) {
                parseTvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(str2);
            } else if (f0b1.f("urn:tva:metadata:cs:AudioPurposeCS:2007", eyiVar.a)) {
                parseTvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(str2);
            }
            i |= parseTvaAudioPurposeCsValue;
        }
        return i;
    }

    public int parseRoleFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public int parseRoleFlagsFromProperties(List<eyi> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (f0b1.f("http://dashif.org/guidelines/trickmode", list.get(i2).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<eyi> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            eyi eyiVar = list.get(i2);
            if (f0b1.f("urn:mpeg:dash:role:2011", eyiVar.a)) {
                i |= parseRoleFlagsFromDashRoleScheme(eyiVar.b);
            }
        }
        return i;
    }

    public b8q0 parseSegmentBase(XmlPullParser xmlPullParser, b8q0 b8q0Var) throws XmlPullParserException, IOException {
        long parseLong = parseLong(xmlPullParser, "timescale", b8q0Var != null ? b8q0Var.b : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", b8q0Var != null ? b8q0Var.c : 0L);
        long j = b8q0Var != null ? b8q0Var.d : 0L;
        long j2 = b8q0Var != null ? b8q0Var.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j = Long.parseLong(split[0]);
            j2 = (Long.parseLong(split[1]) - j) + 1;
        }
        long j3 = j2;
        w6i0 w6i0Var = b8q0Var != null ? b8q0Var.a : null;
        while (true) {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "Initialization")) {
                w6i0Var = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
            w6i0 w6i0Var2 = w6i0Var;
            if (hq91.d(xmlPullParser, "SegmentBase")) {
                return buildSingleSegmentBase(w6i0Var2, parseLong, parseLong2, j, j3);
            }
            w6i0Var = w6i0Var2;
        }
    }

    public y7q0 parseSegmentList(XmlPullParser xmlPullParser, y7q0 y7q0Var, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long parseLong = parseLong(xmlPullParser, "timescale", y7q0Var != null ? y7q0Var.b : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", y7q0Var != null ? y7q0Var.c : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", y7q0Var != null ? y7q0Var.e : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", y7q0Var != null ? y7q0Var.d : 1L);
        long j7 = j4 == -9223372036854775807L ? j3 : j4;
        long j8 = j7 == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? -9223372036854775807L : j7;
        List list = null;
        w6i0 w6i0Var = null;
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "Initialization")) {
                w6i0Var = parseInitialization(xmlPullParser);
                j6 = parseLong;
            } else if (hq91.e(xmlPullParser, "SegmentTimeline")) {
                j6 = parseLong;
                list2 = parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                j6 = parseLong;
                if (hq91.e(xmlPullParser, "SegmentURL")) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(parseSegmentUrl(xmlPullParser));
                } else {
                    maybeSkipTag(xmlPullParser);
                }
            }
            if (hq91.d(xmlPullParser, "SegmentList")) {
                break;
            }
            parseLong = j6;
        }
        if (y7q0Var != null) {
            if (w6i0Var == null) {
                w6i0Var = y7q0Var.a;
            }
            if (list2 == null) {
                list2 = y7q0Var.f;
            }
            if (list == null) {
                list = y7q0Var.j;
            }
        }
        return buildSegmentList(w6i0Var, j6, parseLong2, parseLong4, parseLong3, list2, j8, list, j5, j);
    }

    public z7q0 parseSegmentTemplate(XmlPullParser xmlPullParser, z7q0 z7q0Var, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        ggg gggVar = this;
        long parseLong = parseLong(xmlPullParser, "timescale", z7q0Var != null ? z7q0Var.b : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", z7q0Var != null ? z7q0Var.c : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", z7q0Var != null ? z7q0Var.e : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", z7q0Var != null ? z7q0Var.d : 1L);
        long parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long j7 = j4 == -9223372036854775807L ? j3 : j4;
        long j8 = j7 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED ? j7 : -9223372036854775807L;
        xh21 parseUrlTemplate = gggVar.parseUrlTemplate(xmlPullParser, "media", z7q0Var != null ? z7q0Var.k : null);
        xh21 parseUrlTemplate2 = gggVar.parseUrlTemplate(xmlPullParser, "initialization", z7q0Var != null ? z7q0Var.j : null);
        w6i0 w6i0Var = null;
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "Initialization")) {
                w6i0Var = parseInitialization(xmlPullParser);
                j6 = parseLong;
            } else if (hq91.e(xmlPullParser, "SegmentTimeline")) {
                j6 = parseLong;
                list2 = gggVar.parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                j6 = parseLong;
                maybeSkipTag(xmlPullParser);
            }
            if (hq91.d(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty;
            j8 = j8;
            gggVar = this;
            parseLong4 = parseLong4;
            parseLong2 = parseLong2;
            parseLong = j6;
        }
        if (z7q0Var != null) {
            if (w6i0Var == null) {
                w6i0Var = z7q0Var.a;
            }
            if (list2 == null) {
                list2 = z7q0Var.f;
            }
        }
        return buildSegmentTemplate(w6i0Var, j6, parseLong2, parseLong4, parseLastSegmentNumberSupplementalProperty, parseLong3, list2, j8, parseUrlTemplate2, parseUrlTemplate, j5, j);
    }

    public List parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "S")) {
                long parseLong = parseLong(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    ArrayList arrayList2 = arrayList;
                    j3 = a(arrayList2, j3, j4, i, parseLong);
                    arrayList = arrayList2;
                }
                if (parseLong != -9223372036854775807L) {
                    j3 = parseLong;
                }
                j4 = parseLong(xmlPullParser, "d", -9223372036854775807L);
                i = parseInt(xmlPullParser, "r", 0);
                z = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!hq91.d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            int i2 = tw21.a;
            a(arrayList, j3, j4, i, tw21.e0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public w6i0 parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    public int parseSelectionFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<eyi> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            eyi eyiVar = list.get(i2);
            if (f0b1.f("urn:mpeg:dash:role:2011", eyiVar.a)) {
                i |= parseSelectionFlagsFromDashRoleScheme(eyiVar.b);
            }
        }
        return i;
    }

    public kvq0 parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, "target", -9223372036854775807L);
                j2 = parseLong(xmlPullParser, "min", -9223372036854775807L);
                j3 = parseLong(xmlPullParser, CspBioProgressConstants.MAX, -9223372036854775807L);
            } else if (hq91.e(xmlPullParser, "PlaybackRate")) {
                f = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f2 = parseFloat(xmlPullParser, CspBioProgressConstants.MAX, -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (hq91.d(xmlPullParser, "ServiceDescription")) {
                return new kvq0(f3, f4, j4, j5, j6);
            }
            f = f3;
            f2 = f4;
            j = j4;
            j2 = j5;
            j3 = j6;
        }
    }

    public Pair<Integer, Integer> parseTileCountFromProperties(List<eyi> list) {
        String str;
        char c = 0;
        for (int i = 0; i < list.size(); i++) {
            eyi eyiVar = list.get(i);
            if ((f0b1.f("http://dashif.org/thumbnail_tile", eyiVar.a) || f0b1.f("http://dashif.org/guidelines/thumbnail_tile", eyiVar.a)) && (str = eyiVar.b) != null) {
                int i2 = tw21.a;
                String[] split = str.split(RemoteBioParameters.X, -1);
                if (split.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(split[c])), Integer.valueOf(Integer.parseInt(split[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int parseTvaAudioPurposeCsValue(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public xh21 parseUrlTemplate(XmlPullParser xmlPullParser, String str, xh21 xh21Var) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? xh21.b(attributeValue) : xh21Var;
    }

    public kw21 parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }
}
