package yads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.i5s;
import xsna.uq;

/* loaded from: classes10.dex */
public final class e30 extends DefaultHandler implements qc2 {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public e30() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static long a(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = mc3.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(new jy2(j, j2));
            j += j2;
        }
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        if (r3 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        if (r0.equals("fa01") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0105, code lost:
    
        if (r3 < 33) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(XmlPullParser xmlPullParser) {
        char c2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 6;
        char c3 = 3;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c2 = 6;
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
            case 4:
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                i = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (i > 0) {
                    break;
                }
                i = -1;
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null) {
                    i = Integer.parseInt(attributeValue3);
                    break;
                }
                i = -1;
                break;
            case 2:
            case 6:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    String a = ki.a(attributeValue4);
                    a.getClass();
                    switch (a.hashCode()) {
                        case 1596796:
                            if (a.equals("4000")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2937391:
                            if (a.equals("a000")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094035:
                            if (a.equals("f801")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3133436:
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            i = 2;
                            break;
                        case 3:
                            i = 8;
                            break;
                    }
                }
                i = -1;
                break;
            case 3:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt = attributeValue5 == null ? -1 : Integer.parseInt(attributeValue5);
                if (parseInt >= 0) {
                    int[] iArr = e;
                    if (parseInt < iArr.length) {
                        i = iArr[parseInt];
                        break;
                    }
                }
                i = -1;
                break;
            case 5:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue6 != null) {
                    i = Integer.bitCount(Integer.parseInt(attributeValue6, 16));
                    break;
                }
                i = -1;
                break;
            default:
                i = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!wq3.b(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair c(XmlPullParser xmlPullParser) {
        String str;
        ?? r6;
        String str2;
        String str3;
        ?? r7;
        char c2;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String a = ki.a(attributeValue);
            a.getClass();
            switch (a.hashCode()) {
                case -1980789791:
                    if (a.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 489446379:
                    if (a.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 755418770:
                    if (a.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812765994:
                    if (a.equals("urn:mpeg:dash:mp4protection:2011")) {
                        c2 = 3;
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
                    r6 = jr.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 1:
                    r6 = jr.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 2:
                    r6 = jr.d;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
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
                    if (!TextUtils.isEmpty(str4) && !DeviceIdUtils.NULL_UUID.equals(str4)) {
                        String[] split = str4.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i2 = 0; i2 < split.length; i2++) {
                            uuidArr[i2] = UUID.fromString(split[i2]);
                        }
                        r6 = jr.b;
                        str3 = null;
                        r7 = fm2.a(r6, uuidArr, null);
                        break;
                    } else {
                        r6 = null;
                        str2 = r6;
                        str3 = str2;
                        r7 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if (!wq3.c(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r7 = r7;
                } else if (wq3.c(xmlPullParser, "ms:laurl")) {
                    if (r7 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals(ProtectionSystemSpecificHeaderBox.TYPE) && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            em2 a2 = fm2.a(decode);
                            UUID uuid = a2 == null ? null : a2.a;
                            if (uuid == null) {
                                ji1.d("MpdParser", "Skipping malformed cenc:pssh data");
                                r6 = uuid;
                                r7 = 0;
                            } else {
                                UUID uuid2 = uuid;
                                r7 = decode;
                                r6 = uuid2;
                            }
                        }
                    }
                    if (r7 == 0) {
                        ?? r9 = jr.e;
                        if (r9.equals(r6) && wq3.c(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r7 = fm2.a(r9, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    a(xmlPullParser);
                    r7 = r7;
                } else {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r7 = r7;
                }
            } while (!wq3.b(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r6 != null ? new kk0(r6, str3, MimeTypes.VIDEO_MP4, r7) : null);
        }
        str = null;
        r6 = null;
        str2 = r6;
        str3 = str2;
        r7 = str2;
        do {
            xmlPullParser.next();
            if (!wq3.c(xmlPullParser, "clearkey:Laurl")) {
            }
            if (wq3.c(xmlPullParser, "ms:laurl")) {
            }
        } while (!wq3.b(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r6 != null ? new kk0(r6, str3, MimeTypes.VIDEO_MP4, r7) : null);
    }

    public static void a(XmlPullParser xmlPullParser) {
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

    @Override // yads.qc2
    public final Object a(Uri uri, r30 r30Var) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(r30Var, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return a(newPullParser, uri);
            }
            throw new pc2("inputStream does not contain a valid media presentation description", null, true, 4);
        } catch (XmlPullParserException e2) {
            throw new pc2(null, e2, true, 4);
        }
    }

    public static long a(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList a(XmlPullParser xmlPullParser, List list, boolean z) {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = z ? 1 : Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                a(xmlPullParser);
            }
        } while (!wq3.b(xmlPullParser, "BaseURL"));
        if (str != null && sb3.a(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return rg1.a(new uo(i, parseInt, str, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            uo uoVar = (uo) list.get(i2);
            String a = sb3.a(uoVar.a, str);
            String str2 = attributeValue3 == null ? a : attributeValue3;
            if (z) {
                i = uoVar.c;
                parseInt = uoVar.d;
                str2 = uoVar.b;
            }
            arrayList.add(new uo(i, parseInt, a, str2));
        }
        return arrayList;
    }

    public static wf0 a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!wq3.b(xmlPullParser, str));
        return new wf0(attributeValue, attributeValue2, str2);
    }

    public static long a(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = mc3.h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d2 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
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
            if (group6 != null) {
                d2 = Double.parseDouble(group6);
            }
            long j2 = (long) ((parseDouble5 + d2) * 1000.0d);
            return !isEmpty ? -j2 : j2;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static qm2 a(XmlPullParser xmlPullParser, String str, String str2) {
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
        return new qm2(attributeValue, j, j2);
    }

    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static ky2 a(XmlPullParser xmlPullParser, ky2 ky2Var) {
        long j = ky2Var != null ? ky2Var.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = ky2Var != null ? ky2Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = ky2Var != null ? ky2Var.d : 0L;
        long j6 = ky2Var != null ? ky2Var.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j5 = Long.parseLong(split[0]);
            j6 = (Long.parseLong(split[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        qm2 qm2Var = ky2Var != null ? ky2Var.a : null;
        while (true) {
            xmlPullParser.next();
            if (wq3.c(xmlPullParser, "Initialization")) {
                qm2Var = a(xmlPullParser, "sourceURL", "range");
            } else {
                a(xmlPullParser);
            }
            qm2 qm2Var2 = qm2Var;
            if (wq3.b(xmlPullParser, "SegmentBase")) {
                return new ky2(qm2Var2, j2, j4, j8, j7);
            }
            qm2Var = qm2Var2;
        }
    }

    public static hy2 a(XmlPullParser xmlPullParser, hy2 hy2Var, long j, long j2, long j3, long j4, long j5) {
        long j6 = hy2Var != null ? hy2Var.b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = hy2Var != null ? hy2Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = hy2Var != null ? hy2Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = hy2Var != null ? hy2Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == C.TIME_UNSET ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        qm2 qm2Var = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (wq3.c(xmlPullParser, "Initialization")) {
                qm2Var = a(xmlPullParser, "sourceURL", "range");
            } else if (wq3.c(xmlPullParser, "SegmentTimeline")) {
                list2 = a(xmlPullParser, j7, j2);
            } else if (wq3.c(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(a(xmlPullParser, X3.i.I0, "mediaRange"));
            } else {
                a(xmlPullParser);
            }
        } while (!wq3.b(xmlPullParser, "SegmentList"));
        if (hy2Var != null) {
            if (qm2Var == null) {
                qm2Var = hy2Var.a;
            }
            if (list2 == null) {
                list2 = hy2Var.f;
            }
            if (list == null) {
                list = hy2Var.j;
            }
        }
        return new hy2(qm2Var, j7, j9, j13, j11, list2, j15, list, mc3.a(j5), mc3.a(j));
    }

    public static iy2 a(XmlPullParser xmlPullParser, iy2 iy2Var, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long j7 = iy2Var != null ? iy2Var.b : 1L;
        qm2 qm2Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = iy2Var != null ? iy2Var.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = iy2Var != null ? iy2Var.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = iy2Var != null ? iy2Var.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j13 = Long.parseLong(attributeValue4);
        }
        long j14 = j13;
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            wf0 wf0Var = (wf0) list.get(i);
            if (ki.a("http://dashif.org/guidelines/last-segment-number", wf0Var.a)) {
                j6 = Long.parseLong(wf0Var.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == C.TIME_UNSET ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        zb3 a = a(xmlPullParser, X3.i.I0, iy2Var != null ? iy2Var.k : null);
        zb3 a2 = a(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, iy2Var != null ? iy2Var.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (wq3.c(xmlPullParser, "Initialization")) {
                qm2Var = a(xmlPullParser, "sourceURL", "range");
            } else if (wq3.c(xmlPullParser, "SegmentTimeline")) {
                list2 = a(xmlPullParser, j8, j2);
            } else {
                a(xmlPullParser);
            }
        } while (!wq3.b(xmlPullParser, "SegmentTemplate"));
        if (iy2Var != null) {
            if (qm2Var == null) {
                qm2Var = iy2Var.a;
            }
            if (list2 == null) {
                list2 = iy2Var.f;
            }
        }
        return new iy2(qm2Var, j8, j10, j14, j15, j12, list2, j17, a2, a, mc3.a(j5), mc3.a(j));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00c2. Please report as an issue. */
    public static zb3 a(XmlPullParser xmlPullParser, String str, zb3 zb3Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return zb3Var;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            if (indexOf == -1) {
                strArr[i2] = strArr[i2] + attributeValue.substring(i);
                i = attributeValue.length();
            } else if (indexOf != i) {
                strArr[i2] = strArr[i2] + attributeValue.substring(i, indexOf);
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                strArr[i2] = i5s.a(new StringBuilder(), strArr[i2], "$");
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i3);
                String substring = attributeValue.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = str2.concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    switch (substring) {
                        case "Number":
                            iArr[i2] = 2;
                            break;
                        case "Time":
                            iArr[i2] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i2] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return new zb3(strArr, iArr, strArr2, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x1171 A[LOOP:5: B:194:0x044a->B:201:0x1171, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0ffe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0e51 A[LOOP:11: B:377:0x0849->B:387:0x0e51, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0a69 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x038b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c30 a(XmlPullParser xmlPullParser, Uri uri) {
        boolean z;
        boolean z2;
        long j;
        ArrayList arrayList;
        long j2;
        ArrayList arrayList2;
        boolean z3;
        long j3;
        boolean z4;
        long j4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j5;
        String str;
        String str2;
        ArrayList arrayList6;
        String str3;
        ArrayList arrayList7;
        String str4;
        ArrayList arrayList8;
        long j6;
        long j7;
        String str5;
        ArrayList arrayList9;
        ByteArrayOutputStream byteArrayOutputStream;
        String str6;
        String str7;
        long j8;
        String str8;
        String str9;
        ByteArrayOutputStream byteArrayOutputStream2;
        int i;
        long j9;
        String str10;
        String str11;
        String str12;
        String attributeValue;
        String str13;
        float f;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        String str14;
        ArrayList arrayList13;
        String str15;
        ArrayList arrayList14;
        ArrayList arrayList15;
        String str16;
        ArrayList arrayList16;
        int i2;
        String str17;
        long j10;
        ArrayList arrayList17;
        ArrayList arrayList18;
        int i3;
        String str18;
        ArrayList arrayList19;
        String str19;
        ArrayList arrayList20;
        ArrayList arrayList21;
        String str20;
        int i4;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        ArrayList arrayList22;
        String str29;
        String str30;
        String str31;
        ArrayList arrayList23;
        long j11;
        ArrayList arrayList24;
        String str32;
        long j12;
        String str33;
        long j13;
        ArrayList arrayList25;
        String str34;
        int i5;
        String str35;
        String str36;
        ArrayList arrayList26;
        int parseInt;
        String str37;
        String str38;
        String str39;
        int parseInt2;
        String str40;
        int parseInt3;
        String str41;
        float f2;
        int parseInt4;
        ArrayList arrayList27;
        ArrayList arrayList28;
        ArrayList arrayList29;
        ArrayList arrayList30;
        ArrayList arrayList31;
        ArrayList arrayList32;
        ArrayList arrayList33;
        String str42;
        long j14;
        long j15;
        int i6;
        String str43;
        int i7;
        ArrayList arrayList34;
        String str44;
        String str45;
        float f3;
        int i8;
        long j16;
        String str46;
        int i9;
        ArrayList arrayList35;
        String str47;
        String str48;
        String str49;
        int i10;
        long j17;
        ArrayList arrayList36;
        String str50;
        ArrayList arrayList37;
        ArrayList arrayList38;
        long j18;
        long j19;
        String str51;
        long j20;
        ArrayList arrayList39;
        ArrayList arrayList40;
        long j21;
        String str52;
        int i11;
        String str53;
        String str54;
        String str55;
        String[] split;
        String a;
        long j22;
        String str56;
        int parseInt5;
        String str57;
        String str58;
        int i12;
        char c2;
        String[] split2;
        String str59;
        int i13;
        String str60;
        long j23;
        int i14;
        mp2 kp2Var;
        String str61;
        int i15;
        String str62;
        String str63;
        String str64;
        String str65;
        String[] strArr = new String[0];
        String str66 = null;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue2 != null) {
            strArr = attributeValue2.split(StringUtils.COMMA);
        }
        int length = strArr.length;
        int i16 = 0;
        while (true) {
            z = true;
            if (i16 >= length) {
                z2 = false;
                break;
            }
            if (strArr[i16].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z2 = true;
                break;
            }
            i16++;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j24 = C.TIME_UNSET;
        long f4 = attributeValue3 == null ? -9223372036854775807L : mc3.f(attributeValue3);
        long a2 = a(xmlPullParser, "mediaPresentationDuration", C.TIME_UNSET);
        long a3 = a(xmlPullParser, "minBufferTime", C.TIME_UNSET);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long a4 = equals ? a(xmlPullParser, "minimumUpdatePeriod", C.TIME_UNSET) : -9223372036854775807L;
        long a5 = equals ? a(xmlPullParser, "timeShiftBufferDepth", C.TIME_UNSET) : -9223372036854775807L;
        long a6 = equals ? a(xmlPullParser, "suggestedPresentationDelay", C.TIME_UNSET) : -9223372036854775807L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "publishTime");
        long f5 = attributeValue4 == null ? -9223372036854775807L : mc3.f(attributeValue4);
        long j25 = equals ? 0L : -9223372036854775807L;
        ArrayList a7 = rg1.a(new uo(z2 ? 1 : Integer.MIN_VALUE, 1, uri.toString(), uri.toString()));
        ArrayList arrayList41 = new ArrayList();
        ArrayList arrayList42 = new ArrayList();
        long j26 = equals ? -9223372036854775807L : 0L;
        boolean z5 = false;
        boolean z6 = false;
        ek2 ek2Var = null;
        lc3 lc3Var = null;
        Uri uri2 = null;
        dz2 dz2Var = null;
        while (true) {
            xmlPullParser.next();
            String str67 = "BaseURL";
            if (wq3.c(xmlPullParser, "BaseURL")) {
                if (!z5) {
                    j25 = a(xmlPullParser, j25);
                    z5 = z;
                }
                arrayList42.addAll(a(xmlPullParser, a7, z2));
                arrayList = a7;
                j3 = j24;
                arrayList2 = arrayList42;
                j4 = j26;
                z3 = z2;
                arrayList3 = arrayList41;
                z4 = false;
            } else {
                String str68 = "lang";
                if (wq3.c(xmlPullParser, "ProgramInformation")) {
                    String attributeValue5 = xmlPullParser.getAttributeValue(str66, "moreInformationURL");
                    String str69 = attributeValue5 == null ? str66 : attributeValue5;
                    String attributeValue6 = xmlPullParser.getAttributeValue(str66, "lang");
                    if (attributeValue6 == null) {
                        str63 = str66;
                        str64 = str63;
                        str65 = str64;
                        str62 = str65;
                    } else {
                        str62 = attributeValue6;
                        str63 = str66;
                        str64 = str63;
                        str65 = str64;
                    }
                    while (true) {
                        xmlPullParser.next();
                        j = j24;
                        if (wq3.c(xmlPullParser, "Title")) {
                            str63 = xmlPullParser.nextText();
                        } else if (wq3.c(xmlPullParser, "Source")) {
                            str64 = xmlPullParser.nextText();
                        } else if (wq3.c(xmlPullParser, "Copyright")) {
                            str65 = xmlPullParser.nextText();
                        } else {
                            a(xmlPullParser);
                        }
                        String str70 = str63;
                        String str71 = str64;
                        String str72 = str65;
                        if (wq3.b(xmlPullParser, "ProgramInformation")) {
                            arrayList = a7;
                            arrayList2 = arrayList42;
                            z3 = z2;
                            ek2Var = new ek2(str70, str71, str72, str69, str62);
                        } else {
                            str63 = str70;
                            str64 = str71;
                            str65 = str72;
                            j24 = j;
                        }
                    }
                } else {
                    j = j24;
                    if (wq3.c(xmlPullParser, "UTCTiming")) {
                        arrayList = a7;
                        arrayList2 = arrayList42;
                        lc3Var = new lc3(xmlPullParser.getAttributeValue(str66, "schemeIdUri"), xmlPullParser.getAttributeValue(str66, "value"));
                    } else if (wq3.c(xmlPullParser, "Location")) {
                        uri2 = Uri.parse(sb3.a(uri.toString(), xmlPullParser.nextText()));
                        arrayList = a7;
                        arrayList2 = arrayList42;
                    } else if (wq3.c(xmlPullParser, "ServiceDescription")) {
                        float f6 = -3.4028235E38f;
                        float f7 = -3.4028235E38f;
                        long j27 = j;
                        long j28 = j27;
                        long j29 = j28;
                        while (true) {
                            xmlPullParser.next();
                            if (wq3.c(xmlPullParser, "Latency")) {
                                arrayList = a7;
                                String attributeValue7 = xmlPullParser.getAttributeValue(null, "target");
                                j29 = attributeValue7 == null ? j : Long.parseLong(attributeValue7);
                                String attributeValue8 = xmlPullParser.getAttributeValue(null, UcumUtils.UCUM_MINUTES);
                                j27 = attributeValue8 == null ? j : Long.parseLong(attributeValue8);
                                String attributeValue9 = xmlPullParser.getAttributeValue(null, InneractiveMediationNameConsts.MAX);
                                j28 = attributeValue9 == null ? j : Long.parseLong(attributeValue9);
                            } else {
                                arrayList = a7;
                                if (wq3.c(xmlPullParser, "PlaybackRate")) {
                                    String attributeValue10 = xmlPullParser.getAttributeValue(null, UcumUtils.UCUM_MINUTES);
                                    f6 = attributeValue10 == null ? -3.4028235E38f : Float.parseFloat(attributeValue10);
                                    String attributeValue11 = xmlPullParser.getAttributeValue(null, InneractiveMediationNameConsts.MAX);
                                    f7 = attributeValue11 == null ? -3.4028235E38f : Float.parseFloat(attributeValue11);
                                }
                            }
                            float f8 = f6;
                            float f9 = f7;
                            long j30 = j27;
                            long j31 = j28;
                            long j32 = j29;
                            if (wq3.b(xmlPullParser, "ServiceDescription")) {
                                dz2 dz2Var2 = new dz2(j32, j30, j31, f8, f9);
                                arrayList2 = arrayList42;
                                z3 = z2;
                                j3 = j;
                                dz2Var = dz2Var2;
                                z4 = false;
                                j4 = j26;
                                arrayList3 = arrayList41;
                            } else {
                                a7 = arrayList;
                                j29 = j32;
                                j27 = j30;
                                j28 = j31;
                                f6 = f8;
                                f7 = f9;
                            }
                        }
                    } else {
                        arrayList = a7;
                        if (wq3.c(xmlPullParser, "Period") && !z6) {
                            ArrayList arrayList43 = !arrayList42.isEmpty() ? arrayList42 : arrayList;
                            String str73 = "id";
                            String str74 = "schemeIdUri";
                            String attributeValue12 = xmlPullParser.getAttributeValue(null, "id");
                            long a8 = a(xmlPullParser, "start", j26);
                            long j33 = f4 != j ? f4 + a8 : j;
                            j2 = j25;
                            long a9 = a(xmlPullParser, "duration", j);
                            String str75 = "Period";
                            ArrayList arrayList44 = new ArrayList();
                            String str76 = "value";
                            ArrayList arrayList45 = new ArrayList();
                            ArrayList arrayList46 = new ArrayList();
                            String str77 = "duration";
                            long j34 = j;
                            long j35 = j2;
                            ly2 ly2Var = null;
                            boolean z7 = false;
                            while (true) {
                                xmlPullParser.next();
                                if (wq3.c(xmlPullParser, str67)) {
                                    if (!z7) {
                                        j35 = a(xmlPullParser, j35);
                                        z7 = true;
                                    }
                                    arrayList46.addAll(a(xmlPullParser, arrayList43, z2));
                                    arrayList5 = arrayList43;
                                    j5 = j35;
                                    str = str67;
                                    z3 = z2;
                                    arrayList4 = arrayList46;
                                    str2 = str68;
                                    arrayList6 = arrayList41;
                                    str4 = str74;
                                    str5 = str75;
                                    j7 = j33;
                                    arrayList7 = arrayList45;
                                    z4 = false;
                                    str3 = str73;
                                    arrayList2 = arrayList42;
                                    arrayList8 = arrayList44;
                                    j6 = a9;
                                    j3 = C.TIME_UNSET;
                                    j4 = j26;
                                } else {
                                    arrayList4 = arrayList46;
                                    ArrayList arrayList47 = arrayList44;
                                    String str78 = "SegmentTemplate";
                                    if (wq3.c(xmlPullParser, "AdaptationSet")) {
                                        if (arrayList4.isEmpty()) {
                                            arrayList5 = arrayList43;
                                        } else {
                                            arrayList5 = arrayList43;
                                            arrayList43 = arrayList4;
                                        }
                                        j5 = j35;
                                        String attributeValue13 = xmlPullParser.getAttributeValue(null, str73);
                                        int parseInt6 = attributeValue13 == null ? -1 : Integer.parseInt(attributeValue13);
                                        String str79 = "contentType";
                                        String str80 = "AdaptationSet";
                                        String attributeValue14 = xmlPullParser.getAttributeValue(null, "contentType");
                                        String str81 = "text";
                                        ArrayList arrayList48 = arrayList42;
                                        String str82 = "video";
                                        long j36 = j26;
                                        String str83 = "audio";
                                        if (!TextUtils.isEmpty(attributeValue14)) {
                                            if ("audio".equals(attributeValue14)) {
                                                i = 1;
                                            } else if ("video".equals(attributeValue14)) {
                                                i = 2;
                                            } else if ("text".equals(attributeValue14)) {
                                                i = 3;
                                            }
                                            int i17 = i;
                                            String attributeValue15 = xmlPullParser.getAttributeValue(null, RTCStatsConstants.KEY_MIME_TYPE);
                                            j9 = a5;
                                            String attributeValue16 = xmlPullParser.getAttributeValue(null, "codecs");
                                            String attributeValue17 = xmlPullParser.getAttributeValue(null, "width");
                                            int parseInt7 = attributeValue17 != null ? -1 : Integer.parseInt(attributeValue17);
                                            str10 = "SegmentList";
                                            String attributeValue18 = xmlPullParser.getAttributeValue(null, "height");
                                            int parseInt8 = attributeValue18 != null ? -1 : Integer.parseInt(attributeValue18);
                                            str11 = "SegmentBase";
                                            str12 = "height";
                                            attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
                                            if (attributeValue != null) {
                                                Matcher matcher = b.matcher(attributeValue);
                                                if (matcher.matches()) {
                                                    int parseInt9 = Integer.parseInt(matcher.group(1));
                                                    str13 = "frameRate";
                                                    f = !TextUtils.isEmpty(matcher.group(2)) ? parseInt9 / Integer.parseInt(r5) : parseInt9;
                                                    String attributeValue19 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                                    int parseInt10 = attributeValue19 == null ? -1 : Integer.parseInt(attributeValue19);
                                                    String attributeValue20 = xmlPullParser.getAttributeValue(null, str68);
                                                    String attributeValue21 = xmlPullParser.getAttributeValue(null, "label");
                                                    arrayList10 = new ArrayList();
                                                    float f10 = f;
                                                    arrayList11 = new ArrayList();
                                                    arrayList12 = new ArrayList();
                                                    str14 = attributeValue21;
                                                    arrayList13 = new ArrayList();
                                                    str15 = "width";
                                                    ArrayList arrayList49 = new ArrayList();
                                                    String str84 = "codecs";
                                                    ArrayList arrayList50 = new ArrayList();
                                                    String str85 = RTCStatsConstants.KEY_MIME_TYPE;
                                                    arrayList14 = new ArrayList();
                                                    arrayList15 = new ArrayList();
                                                    str16 = str73;
                                                    arrayList16 = arrayList49;
                                                    ly2 ly2Var2 = ly2Var;
                                                    long j37 = j34;
                                                    i2 = i17;
                                                    str17 = attributeValue20;
                                                    String str86 = null;
                                                    boolean z8 = false;
                                                    int i18 = -1;
                                                    ArrayList arrayList51 = arrayList50;
                                                    j10 = j5;
                                                    while (true) {
                                                        xmlPullParser.next();
                                                        if (wq3.c(xmlPullParser, str67)) {
                                                            if (!z8) {
                                                                j10 = a(xmlPullParser, j10);
                                                                z8 = true;
                                                            }
                                                            long j38 = j10;
                                                            arrayList15.addAll(a(xmlPullParser, arrayList43, z2));
                                                            str19 = str81;
                                                            arrayList21 = arrayList13;
                                                            str20 = str82;
                                                            str30 = str83;
                                                            str = str67;
                                                            z3 = z2;
                                                            arrayList23 = arrayList12;
                                                            arrayList20 = arrayList10;
                                                            arrayList6 = arrayList41;
                                                            str4 = str74;
                                                            j6 = a9;
                                                            str21 = str77;
                                                            arrayList2 = arrayList48;
                                                            j4 = j36;
                                                            j12 = j9;
                                                            str32 = str10;
                                                            str33 = str11;
                                                            str24 = str12;
                                                            str25 = str13;
                                                            str34 = str14;
                                                            str26 = str15;
                                                            str27 = str16;
                                                            arrayList22 = arrayList16;
                                                            str28 = str17;
                                                            str29 = str79;
                                                            str2 = str68;
                                                            str31 = str78;
                                                            str35 = str80;
                                                            arrayList25 = arrayList11;
                                                            i5 = i2;
                                                            arrayList17 = arrayList43;
                                                            arrayList18 = arrayList15;
                                                            arrayList24 = arrayList14;
                                                            j11 = j38;
                                                        } else {
                                                            arrayList17 = arrayList43;
                                                            if (wq3.c(xmlPullParser, "ContentProtection")) {
                                                                Pair c3 = c(xmlPullParser);
                                                                arrayList18 = arrayList15;
                                                                Object obj = c3.first;
                                                                if (obj != null) {
                                                                    str86 = (String) obj;
                                                                }
                                                                Object obj2 = c3.second;
                                                                if (obj2 != null) {
                                                                    arrayList10.add((kk0) obj2);
                                                                }
                                                                str19 = str81;
                                                                arrayList21 = arrayList13;
                                                                str20 = str82;
                                                                str30 = str83;
                                                                str = str67;
                                                                j11 = j10;
                                                                z3 = z2;
                                                                arrayList23 = arrayList12;
                                                                arrayList20 = arrayList10;
                                                                arrayList6 = arrayList41;
                                                                str4 = str74;
                                                                j6 = a9;
                                                                str21 = str77;
                                                                arrayList2 = arrayList48;
                                                                j4 = j36;
                                                                j12 = j9;
                                                                str32 = str10;
                                                                str33 = str11;
                                                                str24 = str12;
                                                                str25 = str13;
                                                                str34 = str14;
                                                                str26 = str15;
                                                                arrayList24 = arrayList14;
                                                                str27 = str16;
                                                                arrayList22 = arrayList16;
                                                                str28 = str17;
                                                                str29 = str79;
                                                                str2 = str68;
                                                                str31 = str78;
                                                                str35 = str80;
                                                                arrayList25 = arrayList11;
                                                                i5 = i2;
                                                            } else {
                                                                arrayList18 = arrayList15;
                                                                if (wq3.c(xmlPullParser, "ContentComponent")) {
                                                                    String attributeValue22 = xmlPullParser.getAttributeValue(null, str68);
                                                                    if (str17 == null) {
                                                                        str17 = attributeValue22;
                                                                    } else if (attributeValue22 != null && !str17.equals(attributeValue22)) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    String attributeValue23 = xmlPullParser.getAttributeValue(null, str79);
                                                                    if (!TextUtils.isEmpty(attributeValue23)) {
                                                                        if (str83.equals(attributeValue23)) {
                                                                            str59 = str17;
                                                                            i3 = i2;
                                                                            i13 = 1;
                                                                        } else if (str82.equals(attributeValue23)) {
                                                                            str59 = str17;
                                                                            i3 = i2;
                                                                            i13 = 2;
                                                                        } else if (str81.equals(attributeValue23)) {
                                                                            str59 = str17;
                                                                            i13 = 3;
                                                                            i3 = i2;
                                                                        }
                                                                        if (i3 != -1) {
                                                                            str19 = str81;
                                                                            arrayList21 = arrayList13;
                                                                            str20 = str82;
                                                                            str30 = str83;
                                                                            str = str67;
                                                                            j11 = j10;
                                                                            z3 = z2;
                                                                            arrayList23 = arrayList12;
                                                                            arrayList20 = arrayList10;
                                                                            arrayList6 = arrayList41;
                                                                            str4 = str74;
                                                                            j6 = a9;
                                                                            str21 = str77;
                                                                            str28 = str59;
                                                                            arrayList2 = arrayList48;
                                                                            j4 = j36;
                                                                            j12 = j9;
                                                                            str32 = str10;
                                                                            str33 = str11;
                                                                            str24 = str12;
                                                                            str25 = str13;
                                                                            str34 = str14;
                                                                            str26 = str15;
                                                                            str27 = str16;
                                                                            arrayList22 = arrayList16;
                                                                            str29 = str79;
                                                                            str2 = str68;
                                                                            str31 = str78;
                                                                            str35 = str80;
                                                                            arrayList25 = arrayList11;
                                                                            i5 = i13;
                                                                            arrayList24 = arrayList14;
                                                                        } else {
                                                                            if (i13 != -1 && i3 != i13) {
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            str19 = str81;
                                                                            arrayList21 = arrayList13;
                                                                            str20 = str82;
                                                                            str30 = str83;
                                                                            str = str67;
                                                                            z3 = z2;
                                                                            arrayList23 = arrayList12;
                                                                            arrayList20 = arrayList10;
                                                                            arrayList6 = arrayList41;
                                                                            str4 = str74;
                                                                            j6 = a9;
                                                                            str21 = str77;
                                                                            str28 = str59;
                                                                            arrayList2 = arrayList48;
                                                                            j4 = j36;
                                                                            str32 = str10;
                                                                            str24 = str12;
                                                                            str25 = str13;
                                                                            str34 = str14;
                                                                            str26 = str15;
                                                                            arrayList24 = arrayList14;
                                                                            str27 = str16;
                                                                            arrayList22 = arrayList16;
                                                                            str29 = str79;
                                                                            str2 = str68;
                                                                            str31 = str78;
                                                                            str35 = str80;
                                                                            arrayList25 = arrayList11;
                                                                            i5 = i3;
                                                                            j11 = j10;
                                                                            j12 = j9;
                                                                            str33 = str11;
                                                                        }
                                                                    }
                                                                    str59 = str17;
                                                                    i3 = i2;
                                                                    i13 = -1;
                                                                    if (i3 != -1) {
                                                                    }
                                                                } else {
                                                                    String str87 = str17;
                                                                    i3 = i2;
                                                                    if (wq3.c(xmlPullParser, "Role")) {
                                                                        arrayList13.add(a(xmlPullParser, "Role"));
                                                                    } else if (wq3.c(xmlPullParser, "AudioChannelConfiguration")) {
                                                                        i18 = b(xmlPullParser);
                                                                        str19 = str81;
                                                                        arrayList21 = arrayList13;
                                                                        str20 = str82;
                                                                        str30 = str83;
                                                                        str = str67;
                                                                        z3 = z2;
                                                                        arrayList23 = arrayList12;
                                                                        arrayList20 = arrayList10;
                                                                        arrayList6 = arrayList41;
                                                                        str4 = str74;
                                                                        j6 = a9;
                                                                        str21 = str77;
                                                                        arrayList2 = arrayList48;
                                                                        j4 = j36;
                                                                        str32 = str10;
                                                                        str24 = str12;
                                                                        str25 = str13;
                                                                        arrayList25 = arrayList11;
                                                                        str34 = str14;
                                                                        str26 = str15;
                                                                        str27 = str16;
                                                                        arrayList22 = arrayList16;
                                                                        str28 = str87;
                                                                        str29 = str79;
                                                                        str2 = str68;
                                                                        str31 = str78;
                                                                        str35 = str80;
                                                                        arrayList24 = arrayList14;
                                                                        i5 = i3;
                                                                        j11 = j10;
                                                                        j12 = j9;
                                                                        str33 = str11;
                                                                    } else if (wq3.c(xmlPullParser, "Accessibility")) {
                                                                        arrayList12.add(a(xmlPullParser, "Accessibility"));
                                                                    } else {
                                                                        if (wq3.c(xmlPullParser, "EssentialProperty")) {
                                                                            str18 = str87;
                                                                            arrayList19 = arrayList16;
                                                                            arrayList19.add(a(xmlPullParser, "EssentialProperty"));
                                                                            str19 = str81;
                                                                            arrayList21 = arrayList13;
                                                                            str20 = str82;
                                                                            str30 = str83;
                                                                            str = str67;
                                                                            z3 = z2;
                                                                            arrayList23 = arrayList12;
                                                                            arrayList20 = arrayList10;
                                                                            str2 = str68;
                                                                        } else {
                                                                            str18 = str87;
                                                                            arrayList19 = arrayList16;
                                                                            str2 = str68;
                                                                            String str88 = "SupplementalProperty";
                                                                            if (!wq3.c(xmlPullParser, "SupplementalProperty")) {
                                                                                ArrayList arrayList52 = arrayList51;
                                                                                String str89 = "EssentialProperty";
                                                                                str19 = str81;
                                                                                arrayList20 = arrayList10;
                                                                                if (wq3.c(xmlPullParser, "Representation")) {
                                                                                    if (arrayList18.isEmpty()) {
                                                                                        String str90 = str16;
                                                                                        str29 = str79;
                                                                                        str36 = str90;
                                                                                        arrayList26 = arrayList17;
                                                                                    } else {
                                                                                        String str91 = str16;
                                                                                        str29 = str79;
                                                                                        str36 = str91;
                                                                                        arrayList26 = arrayList18;
                                                                                    }
                                                                                    ArrayList arrayList53 = arrayList13;
                                                                                    ArrayList arrayList54 = arrayList12;
                                                                                    String attributeValue24 = xmlPullParser.getAttributeValue(null, str36);
                                                                                    String str92 = str36;
                                                                                    String attributeValue25 = xmlPullParser.getAttributeValue(null, "bandwidth");
                                                                                    if (attributeValue25 == null) {
                                                                                        str37 = str85;
                                                                                        parseInt = -1;
                                                                                    } else {
                                                                                        String str93 = str85;
                                                                                        parseInt = Integer.parseInt(attributeValue25);
                                                                                        str37 = str93;
                                                                                    }
                                                                                    String attributeValue26 = xmlPullParser.getAttributeValue(null, str37);
                                                                                    String str94 = str84;
                                                                                    String str95 = str37;
                                                                                    String str96 = attributeValue26 == null ? attributeValue15 : attributeValue26;
                                                                                    String attributeValue27 = xmlPullParser.getAttributeValue(null, str94);
                                                                                    String str97 = str94;
                                                                                    String str98 = str15;
                                                                                    String str99 = attributeValue27 == null ? attributeValue16 : attributeValue27;
                                                                                    String attributeValue28 = xmlPullParser.getAttributeValue(null, str98);
                                                                                    if (attributeValue28 == null) {
                                                                                        String str100 = str12;
                                                                                        str38 = attributeValue24;
                                                                                        str39 = str100;
                                                                                        parseInt2 = parseInt7;
                                                                                    } else {
                                                                                        String str101 = str12;
                                                                                        str38 = attributeValue24;
                                                                                        str39 = str101;
                                                                                        parseInt2 = Integer.parseInt(attributeValue28);
                                                                                    }
                                                                                    String attributeValue29 = xmlPullParser.getAttributeValue(null, str39);
                                                                                    if (attributeValue29 == null) {
                                                                                        str24 = str39;
                                                                                        str40 = str13;
                                                                                        parseInt3 = parseInt8;
                                                                                    } else {
                                                                                        str24 = str39;
                                                                                        str40 = str13;
                                                                                        parseInt3 = Integer.parseInt(attributeValue29);
                                                                                    }
                                                                                    str26 = str98;
                                                                                    String attributeValue30 = xmlPullParser.getAttributeValue(null, str40);
                                                                                    if (attributeValue30 != null) {
                                                                                        Matcher matcher2 = b.matcher(attributeValue30);
                                                                                        if (matcher2.matches()) {
                                                                                            int parseInt11 = Integer.parseInt(matcher2.group(1));
                                                                                            str41 = str82;
                                                                                            f2 = !TextUtils.isEmpty(matcher2.group(2)) ? parseInt11 / Integer.parseInt(r4) : parseInt11;
                                                                                            String attributeValue31 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                                                                            parseInt4 = attributeValue31 != null ? parseInt10 : Integer.parseInt(attributeValue31);
                                                                                            arrayList27 = new ArrayList();
                                                                                            arrayList28 = new ArrayList();
                                                                                            ArrayList arrayList55 = new ArrayList(arrayList19);
                                                                                            str25 = str40;
                                                                                            arrayList29 = new ArrayList(arrayList52);
                                                                                            arrayList30 = new ArrayList();
                                                                                            arrayList31 = arrayList19;
                                                                                            arrayList32 = arrayList52;
                                                                                            arrayList33 = arrayList55;
                                                                                            str42 = str83;
                                                                                            j14 = j10;
                                                                                            ly2 ly2Var3 = ly2Var2;
                                                                                            j15 = j37;
                                                                                            i6 = i18;
                                                                                            boolean z9 = false;
                                                                                            str43 = null;
                                                                                            while (true) {
                                                                                                xmlPullParser.next();
                                                                                                if (!wq3.c(xmlPullParser, str67)) {
                                                                                                    if (!z9) {
                                                                                                        j14 = a(xmlPullParser, j14);
                                                                                                        z9 = true;
                                                                                                    }
                                                                                                    i7 = parseInt4;
                                                                                                    arrayList30.addAll(a(xmlPullParser, arrayList26, z2));
                                                                                                } else {
                                                                                                    i7 = parseInt4;
                                                                                                    if (wq3.c(xmlPullParser, "AudioChannelConfiguration")) {
                                                                                                        i6 = b(xmlPullParser);
                                                                                                    } else {
                                                                                                        String str102 = str11;
                                                                                                        if (wq3.c(xmlPullParser, str102)) {
                                                                                                            arrayList34 = arrayList26;
                                                                                                            ly2Var3 = a(xmlPullParser, (ky2) ly2Var3);
                                                                                                            str45 = str102;
                                                                                                            f3 = f2;
                                                                                                            i8 = i3;
                                                                                                            str = str67;
                                                                                                            z3 = z2;
                                                                                                            arrayList6 = arrayList41;
                                                                                                            str4 = str74;
                                                                                                            str21 = str77;
                                                                                                            str22 = str78;
                                                                                                            str46 = str80;
                                                                                                            arrayList2 = arrayList48;
                                                                                                            str51 = str89;
                                                                                                            str44 = str10;
                                                                                                            i9 = parseInt;
                                                                                                            arrayList35 = arrayList14;
                                                                                                            str47 = str18;
                                                                                                            str27 = str92;
                                                                                                            str48 = str41;
                                                                                                            arrayList22 = arrayList31;
                                                                                                            arrayList51 = arrayList32;
                                                                                                            str49 = str42;
                                                                                                            i10 = i7;
                                                                                                            j20 = j15;
                                                                                                            j18 = j14;
                                                                                                            arrayList36 = arrayList30;
                                                                                                            str50 = str88;
                                                                                                            j16 = a9;
                                                                                                            j4 = j36;
                                                                                                            str85 = str95;
                                                                                                            str84 = str97;
                                                                                                            str52 = str43;
                                                                                                            arrayList37 = arrayList27;
                                                                                                            arrayList38 = arrayList28;
                                                                                                            arrayList39 = arrayList33;
                                                                                                            arrayList40 = arrayList29;
                                                                                                            j21 = j33;
                                                                                                            j17 = j10;
                                                                                                            j19 = j9;
                                                                                                            i11 = i6;
                                                                                                            if (wq3.b(xmlPullParser, "Representation")) {
                                                                                                                String str103 = str49;
                                                                                                                if (str103.equals(iu1.c(str96))) {
                                                                                                                    if (str99 != null) {
                                                                                                                        int i19 = mc3.a;
                                                                                                                        if (TextUtils.isEmpty(str99)) {
                                                                                                                            split2 = new String[0];
                                                                                                                        } else {
                                                                                                                            split2 = str99.trim().split("(\\s*,\\s*)", -1);
                                                                                                                        }
                                                                                                                        for (String str104 : split2) {
                                                                                                                            String a10 = iu1.a(str104);
                                                                                                                            if (a10 != null && str103.equals(iu1.c(a10))) {
                                                                                                                                a = a10;
                                                                                                                                str53 = str48;
                                                                                                                                str54 = a;
                                                                                                                                str55 = str96;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    str55 = str96;
                                                                                                                    str53 = str48;
                                                                                                                    str54 = null;
                                                                                                                } else {
                                                                                                                    str53 = str48;
                                                                                                                    if (str53.equals(iu1.c(str96))) {
                                                                                                                        if (str99 != null) {
                                                                                                                            int i20 = mc3.a;
                                                                                                                            if (TextUtils.isEmpty(str99)) {
                                                                                                                                split = new String[0];
                                                                                                                            } else {
                                                                                                                                split = str99.trim().split("(\\s*,\\s*)", -1);
                                                                                                                            }
                                                                                                                            int length2 = split.length;
                                                                                                                            int i21 = 0;
                                                                                                                            while (i21 < length2) {
                                                                                                                                a = iu1.a(split[i21]);
                                                                                                                                int i22 = length2;
                                                                                                                                if (a == null || !str53.equals(iu1.c(a))) {
                                                                                                                                    i21++;
                                                                                                                                    length2 = i22;
                                                                                                                                } else {
                                                                                                                                    str54 = a;
                                                                                                                                    str55 = str96;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        str55 = str96;
                                                                                                                    } else if (iu1.e(str96) || "image".equals(iu1.c(str96))) {
                                                                                                                        str54 = str96;
                                                                                                                        str55 = str54;
                                                                                                                    } else {
                                                                                                                        str55 = str96;
                                                                                                                        if (MimeTypes.APPLICATION_MP4.equals(str55)) {
                                                                                                                            str54 = iu1.a(str99);
                                                                                                                            if (MimeTypes.TEXT_VTT.equals(str54)) {
                                                                                                                                str54 = MimeTypes.APPLICATION_MP4VTT;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    str54 = null;
                                                                                                                }
                                                                                                                if (MimeTypes.AUDIO_E_AC3.equals(str54)) {
                                                                                                                    int i23 = 0;
                                                                                                                    while (i23 < arrayList40.size()) {
                                                                                                                        wf0 wf0Var = (wf0) arrayList40.get(i23);
                                                                                                                        String str105 = wf0Var.a;
                                                                                                                        int i24 = i23;
                                                                                                                        if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str105)) {
                                                                                                                            j22 = j16;
                                                                                                                            if ("JOC".equals(wf0Var.b)) {
                                                                                                                                str54 = MimeTypes.AUDIO_E_AC3_JOC;
                                                                                                                                if (MimeTypes.AUDIO_E_AC3_JOC.equals(str54)) {
                                                                                                                                    str99 = "ec+3";
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            j22 = j16;
                                                                                                                        }
                                                                                                                        if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str105) && "ec+3".equals(wf0Var.b)) {
                                                                                                                            str54 = MimeTypes.AUDIO_E_AC3_JOC;
                                                                                                                            if (MimeTypes.AUDIO_E_AC3_JOC.equals(str54)) {
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i23 = i24 + 1;
                                                                                                                            j16 = j22;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    j22 = j16;
                                                                                                                    str54 = MimeTypes.AUDIO_E_AC3;
                                                                                                                    if (MimeTypes.AUDIO_E_AC3_JOC.equals(str54)) {
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    j22 = j16;
                                                                                                                }
                                                                                                                String str106 = str99;
                                                                                                                int i25 = 0;
                                                                                                                int i26 = 0;
                                                                                                                while (true) {
                                                                                                                    long j39 = j19;
                                                                                                                    String str107 = "urn:mpeg:dash:role:2011";
                                                                                                                    if (i25 < arrayList53.size()) {
                                                                                                                        ArrayList arrayList56 = arrayList53;
                                                                                                                        wf0 wf0Var2 = (wf0) arrayList56.get(i25);
                                                                                                                        int i27 = i25;
                                                                                                                        if (ki.a("urn:mpeg:dash:role:2011", wf0Var2.a)) {
                                                                                                                            String str108 = wf0Var2.b;
                                                                                                                            i26 = ((str108 != null && (str108.equals("forced_subtitle") || str108.equals("forced-subtitle"))) ? 2 : 0) | i26;
                                                                                                                        }
                                                                                                                        i25 = i27 + 1;
                                                                                                                        arrayList53 = arrayList56;
                                                                                                                        j19 = j39;
                                                                                                                    } else {
                                                                                                                        ArrayList arrayList57 = arrayList53;
                                                                                                                        ArrayList arrayList58 = arrayList37;
                                                                                                                        int i28 = 0;
                                                                                                                        int i29 = 0;
                                                                                                                        while (i28 < arrayList57.size()) {
                                                                                                                            wf0 wf0Var3 = (wf0) arrayList57.get(i28);
                                                                                                                            int i30 = i28;
                                                                                                                            if (ki.a("urn:mpeg:dash:role:2011", wf0Var3.a)) {
                                                                                                                                i29 = a(wf0Var3.b) | i29;
                                                                                                                            }
                                                                                                                            i28 = i30 + 1;
                                                                                                                        }
                                                                                                                        arrayList21 = arrayList57;
                                                                                                                        int i31 = 0;
                                                                                                                        int i32 = 0;
                                                                                                                        while (i31 < arrayList54.size()) {
                                                                                                                            ArrayList arrayList59 = arrayList54;
                                                                                                                            int i33 = i31;
                                                                                                                            wf0 wf0Var4 = (wf0) arrayList59.get(i31);
                                                                                                                            int i34 = i32;
                                                                                                                            if (ki.a(str107, wf0Var4.a)) {
                                                                                                                                i32 = i34 | a(wf0Var4.b);
                                                                                                                                str58 = str107;
                                                                                                                            } else {
                                                                                                                                str58 = str107;
                                                                                                                                if (ki.a("urn:tva:metadata:cs:AudioPurposeCS:2007", wf0Var4.a)) {
                                                                                                                                    String str109 = wf0Var4.b;
                                                                                                                                    if (str109 != null) {
                                                                                                                                        switch (str109.hashCode()) {
                                                                                                                                            case 49:
                                                                                                                                                if (str109.equals("1")) {
                                                                                                                                                    c2 = 0;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                c2 = 65535;
                                                                                                                                                break;
                                                                                                                                            case 50:
                                                                                                                                                if (str109.equals("2")) {
                                                                                                                                                    c2 = 1;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                c2 = 65535;
                                                                                                                                                break;
                                                                                                                                            case 51:
                                                                                                                                                if (str109.equals("3")) {
                                                                                                                                                    c2 = 2;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                c2 = 65535;
                                                                                                                                                break;
                                                                                                                                            case 52:
                                                                                                                                                if (str109.equals("4")) {
                                                                                                                                                    c2 = 3;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                c2 = 65535;
                                                                                                                                                break;
                                                                                                                                            case 53:
                                                                                                                                            default:
                                                                                                                                                c2 = 65535;
                                                                                                                                                break;
                                                                                                                                            case 54:
                                                                                                                                                if (str109.equals("6")) {
                                                                                                                                                    c2 = 4;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                c2 = 65535;
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        switch (c2) {
                                                                                                                                            case 0:
                                                                                                                                                i12 = 512;
                                                                                                                                                break;
                                                                                                                                            case 1:
                                                                                                                                                i12 = 2048;
                                                                                                                                                break;
                                                                                                                                            case 2:
                                                                                                                                                i12 = 4;
                                                                                                                                                break;
                                                                                                                                            case 3:
                                                                                                                                                i12 = 8;
                                                                                                                                                break;
                                                                                                                                            case 4:
                                                                                                                                                i12 = 1;
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                        i32 = i34 | i12;
                                                                                                                                    }
                                                                                                                                    i12 = 0;
                                                                                                                                    i32 = i34 | i12;
                                                                                                                                } else {
                                                                                                                                    i32 = i34;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            i31 = i33 + 1;
                                                                                                                            arrayList54 = arrayList59;
                                                                                                                            str107 = str58;
                                                                                                                        }
                                                                                                                        ArrayList arrayList60 = arrayList54;
                                                                                                                        int i35 = i29 | i32;
                                                                                                                        int i36 = 0;
                                                                                                                        int i37 = 0;
                                                                                                                        while (i36 < arrayList39.size()) {
                                                                                                                            ArrayList arrayList61 = arrayList39;
                                                                                                                            if (ki.a("http://dashif.org/guidelines/trickmode", ((wf0) arrayList39.get(i36)).a)) {
                                                                                                                                i37 = 16384;
                                                                                                                            }
                                                                                                                            i36++;
                                                                                                                            arrayList39 = arrayList61;
                                                                                                                        }
                                                                                                                        ArrayList arrayList62 = arrayList39;
                                                                                                                        int i38 = i35 | i37;
                                                                                                                        int i39 = 0;
                                                                                                                        for (int i40 = 0; i40 < arrayList40.size(); i40++) {
                                                                                                                            if (ki.a("http://dashif.org/guidelines/trickmode", ((wf0) arrayList40.get(i40)).a)) {
                                                                                                                                i39 = 16384;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        mx0 mx0Var = new mx0();
                                                                                                                        mx0Var.a = str38;
                                                                                                                        mx0Var.j = str55;
                                                                                                                        mx0Var.k = str54;
                                                                                                                        mx0Var.h = str106;
                                                                                                                        mx0Var.g = i9;
                                                                                                                        mx0Var.d = i26;
                                                                                                                        mx0Var.e = i38 | i39;
                                                                                                                        str28 = str47;
                                                                                                                        mx0Var.c = str28;
                                                                                                                        if (str53.equals(iu1.c(str54))) {
                                                                                                                            mx0Var.p = parseInt2;
                                                                                                                            mx0Var.q = parseInt3;
                                                                                                                            mx0Var.r = f3;
                                                                                                                        } else {
                                                                                                                            int i41 = parseInt3;
                                                                                                                            int i42 = parseInt2;
                                                                                                                            if (str103.equals(iu1.c(str54))) {
                                                                                                                                mx0Var.x = i11;
                                                                                                                                mx0Var.y = i10;
                                                                                                                            } else if (iu1.e(str54)) {
                                                                                                                                if (MimeTypes.APPLICATION_CEA608.equals(str54)) {
                                                                                                                                    for (int i43 = 0; i43 < arrayList60.size(); i43++) {
                                                                                                                                        wf0 wf0Var5 = (wf0) arrayList60.get(i43);
                                                                                                                                        if ("urn:scte:dash:cc:cea-608:2015".equals(wf0Var5.a) && (str57 = wf0Var5.b) != null) {
                                                                                                                                            Matcher matcher3 = c.matcher(str57);
                                                                                                                                            if (matcher3.matches()) {
                                                                                                                                                parseInt5 = Integer.parseInt(matcher3.group(1));
                                                                                                                                                mx0Var.C = parseInt5;
                                                                                                                                            } else {
                                                                                                                                                ji1.d("MpdParser", "Unable to parse CEA-608 channel number from: " + wf0Var5.b);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    parseInt5 = -1;
                                                                                                                                    mx0Var.C = parseInt5;
                                                                                                                                } else {
                                                                                                                                    if (MimeTypes.APPLICATION_CEA708.equals(str54)) {
                                                                                                                                        for (int i44 = 0; i44 < arrayList60.size(); i44++) {
                                                                                                                                            wf0 wf0Var6 = (wf0) arrayList60.get(i44);
                                                                                                                                            if ("urn:scte:dash:cc:cea-708:2015".equals(wf0Var6.a) && (str56 = wf0Var6.b) != null) {
                                                                                                                                                Matcher matcher4 = d.matcher(str56);
                                                                                                                                                if (matcher4.matches()) {
                                                                                                                                                    parseInt5 = Integer.parseInt(matcher4.group(1));
                                                                                                                                                    mx0Var.C = parseInt5;
                                                                                                                                                } else {
                                                                                                                                                    ji1.d("MpdParser", "Unable to parse CEA-708 service block number from: " + wf0Var6.b);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    parseInt5 = -1;
                                                                                                                                    mx0Var.C = parseInt5;
                                                                                                                                }
                                                                                                                            } else if ("image".equals(iu1.c(str54))) {
                                                                                                                                mx0Var.p = i42;
                                                                                                                                mx0Var.q = i41;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        nx0 nx0Var = new nx0(mx0Var);
                                                                                                                        d30 d30Var = new d30(nx0Var, !arrayList36.isEmpty() ? arrayList36 : arrayList34, ly2Var3 != null ? ly2Var3 : new ky2(null, 1L, 0L, 0L, 0L), str52, arrayList58, arrayList38, arrayList62, arrayList40);
                                                                                                                        int d2 = iu1.d(nx0Var.m);
                                                                                                                        int i45 = i8;
                                                                                                                        if (i45 != -1) {
                                                                                                                            if (d2 != -1 && i45 != d2) {
                                                                                                                                throw new IllegalStateException();
                                                                                                                            }
                                                                                                                            d2 = i45;
                                                                                                                        }
                                                                                                                        arrayList24 = arrayList35;
                                                                                                                        arrayList24.add(d30Var);
                                                                                                                        str30 = str103;
                                                                                                                        str20 = str53;
                                                                                                                        i5 = d2;
                                                                                                                        arrayList23 = arrayList60;
                                                                                                                        j11 = j17;
                                                                                                                        j33 = j21;
                                                                                                                        j6 = j22;
                                                                                                                        arrayList25 = arrayList11;
                                                                                                                        str34 = str14;
                                                                                                                        j12 = j39;
                                                                                                                        str35 = str46;
                                                                                                                        str32 = str44;
                                                                                                                        str33 = str45;
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                arrayList33 = arrayList39;
                                                                                                                arrayList29 = arrayList40;
                                                                                                                long j40 = j16;
                                                                                                                j14 = j18;
                                                                                                                i6 = i11;
                                                                                                                arrayList27 = arrayList37;
                                                                                                                arrayList28 = arrayList38;
                                                                                                                arrayList30 = arrayList36;
                                                                                                                j10 = j17;
                                                                                                                str88 = str50;
                                                                                                                z2 = z3;
                                                                                                                arrayList31 = arrayList22;
                                                                                                                j33 = j21;
                                                                                                                arrayList26 = arrayList34;
                                                                                                                str97 = str84;
                                                                                                                str95 = str85;
                                                                                                                str43 = str52;
                                                                                                                i3 = i8;
                                                                                                                arrayList41 = arrayList6;
                                                                                                                arrayList14 = arrayList35;
                                                                                                                str18 = str47;
                                                                                                                parseInt = i9;
                                                                                                                f2 = f3;
                                                                                                                parseInt4 = i10;
                                                                                                                str77 = str21;
                                                                                                                str10 = str44;
                                                                                                                str11 = str45;
                                                                                                                str41 = str48;
                                                                                                                str42 = str49;
                                                                                                                str78 = str22;
                                                                                                                arrayList48 = arrayList2;
                                                                                                                j36 = j4;
                                                                                                                arrayList32 = arrayList51;
                                                                                                                a9 = j40;
                                                                                                                j9 = j19;
                                                                                                                str74 = str4;
                                                                                                                str92 = str27;
                                                                                                                str96 = str96;
                                                                                                                str89 = str51;
                                                                                                                j15 = j20;
                                                                                                                str67 = str;
                                                                                                                str80 = str46;
                                                                                                            }
                                                                                                        } else {
                                                                                                            arrayList34 = arrayList26;
                                                                                                            String str110 = str10;
                                                                                                            if (wq3.c(xmlPullParser, str110)) {
                                                                                                                int i46 = i3;
                                                                                                                str = str67;
                                                                                                                long a11 = a(xmlPullParser, j15);
                                                                                                                str44 = str110;
                                                                                                                str45 = str102;
                                                                                                                f3 = f2;
                                                                                                                arrayList6 = arrayList41;
                                                                                                                str4 = str74;
                                                                                                                long j41 = j33;
                                                                                                                long j42 = a9;
                                                                                                                str21 = str77;
                                                                                                                str46 = str80;
                                                                                                                arrayList2 = arrayList48;
                                                                                                                j4 = j36;
                                                                                                                String str111 = str89;
                                                                                                                i8 = i46;
                                                                                                                i9 = parseInt;
                                                                                                                arrayList35 = arrayList14;
                                                                                                                str47 = str18;
                                                                                                                str27 = str92;
                                                                                                                str48 = str41;
                                                                                                                arrayList22 = arrayList31;
                                                                                                                arrayList51 = arrayList32;
                                                                                                                str49 = str42;
                                                                                                                i10 = i7;
                                                                                                                j17 = j10;
                                                                                                                arrayList36 = arrayList30;
                                                                                                                str50 = str88;
                                                                                                                long j43 = j9;
                                                                                                                str85 = str95;
                                                                                                                str84 = str97;
                                                                                                                arrayList37 = arrayList27;
                                                                                                                arrayList38 = arrayList28;
                                                                                                                ly2Var3 = a(xmlPullParser, (hy2) ly2Var3, j41, j42, j14, a11, j43);
                                                                                                                j16 = j42;
                                                                                                                j21 = j41;
                                                                                                                j20 = a11;
                                                                                                                j18 = j14;
                                                                                                                str22 = str78;
                                                                                                                str52 = str43;
                                                                                                                arrayList40 = arrayList29;
                                                                                                                arrayList39 = arrayList33;
                                                                                                                str51 = str111;
                                                                                                                z3 = z2;
                                                                                                                j19 = j43;
                                                                                                            } else {
                                                                                                                str44 = str110;
                                                                                                                str45 = str102;
                                                                                                                f3 = f2;
                                                                                                                long j44 = j14;
                                                                                                                i8 = i3;
                                                                                                                str = str67;
                                                                                                                arrayList6 = arrayList41;
                                                                                                                str4 = str74;
                                                                                                                long j45 = j33;
                                                                                                                j16 = a9;
                                                                                                                str21 = str77;
                                                                                                                String str112 = str78;
                                                                                                                str46 = str80;
                                                                                                                arrayList2 = arrayList48;
                                                                                                                j4 = j36;
                                                                                                                String str113 = str89;
                                                                                                                i9 = parseInt;
                                                                                                                arrayList35 = arrayList14;
                                                                                                                str47 = str18;
                                                                                                                str27 = str92;
                                                                                                                str48 = str41;
                                                                                                                arrayList22 = arrayList31;
                                                                                                                arrayList51 = arrayList32;
                                                                                                                ArrayList arrayList63 = arrayList33;
                                                                                                                str49 = str42;
                                                                                                                i10 = i7;
                                                                                                                j17 = j10;
                                                                                                                arrayList36 = arrayList30;
                                                                                                                str50 = str88;
                                                                                                                long j46 = j9;
                                                                                                                str85 = str95;
                                                                                                                str84 = str97;
                                                                                                                arrayList37 = arrayList27;
                                                                                                                arrayList38 = arrayList28;
                                                                                                                if (wq3.c(xmlPullParser, str112)) {
                                                                                                                    long a12 = a(xmlPullParser, j15);
                                                                                                                    str22 = str112;
                                                                                                                    j18 = j44;
                                                                                                                    z3 = z2;
                                                                                                                    j19 = j46;
                                                                                                                    ly2Var3 = a(xmlPullParser, (iy2) ly2Var3, arrayList51, j45, j16, j18, a12, j19);
                                                                                                                    j21 = j45;
                                                                                                                    j20 = a12;
                                                                                                                } else {
                                                                                                                    str22 = str112;
                                                                                                                    j18 = j44;
                                                                                                                    z3 = z2;
                                                                                                                    j19 = j46;
                                                                                                                    if (wq3.c(xmlPullParser, "ContentProtection")) {
                                                                                                                        Pair c4 = c(xmlPullParser);
                                                                                                                        Object obj3 = c4.first;
                                                                                                                        if (obj3 != null) {
                                                                                                                            str43 = (String) obj3;
                                                                                                                        }
                                                                                                                        Object obj4 = c4.second;
                                                                                                                        if (obj4 != null) {
                                                                                                                            arrayList37.add((kk0) obj4);
                                                                                                                        }
                                                                                                                        j20 = j15;
                                                                                                                        j21 = j45;
                                                                                                                    } else {
                                                                                                                        if (wq3.c(xmlPullParser, "InbandEventStream")) {
                                                                                                                            arrayList38.add(a(xmlPullParser, "InbandEventStream"));
                                                                                                                            j20 = j15;
                                                                                                                            arrayList40 = arrayList29;
                                                                                                                            arrayList39 = arrayList63;
                                                                                                                            str51 = str113;
                                                                                                                        } else {
                                                                                                                            str51 = str113;
                                                                                                                            if (wq3.c(xmlPullParser, str51)) {
                                                                                                                                j20 = j15;
                                                                                                                                arrayList39 = arrayList63;
                                                                                                                                arrayList39.add(a(xmlPullParser, str51));
                                                                                                                                arrayList40 = arrayList29;
                                                                                                                            } else {
                                                                                                                                j20 = j15;
                                                                                                                                arrayList39 = arrayList63;
                                                                                                                                if (wq3.c(xmlPullParser, str50)) {
                                                                                                                                    wf0 a13 = a(xmlPullParser, str50);
                                                                                                                                    str50 = str50;
                                                                                                                                    arrayList40 = arrayList29;
                                                                                                                                    arrayList40.add(a13);
                                                                                                                                } else {
                                                                                                                                    str50 = str50;
                                                                                                                                    arrayList40 = arrayList29;
                                                                                                                                    a(xmlPullParser);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        j21 = j45;
                                                                                                                        str52 = str43;
                                                                                                                    }
                                                                                                                }
                                                                                                                str52 = str43;
                                                                                                                arrayList40 = arrayList29;
                                                                                                                i11 = i6;
                                                                                                                arrayList39 = arrayList63;
                                                                                                                str51 = str113;
                                                                                                                if (wq3.b(xmlPullParser, "Representation")) {
                                                                                                                }
                                                                                                            }
                                                                                                            i11 = i6;
                                                                                                            if (wq3.b(xmlPullParser, "Representation")) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                f3 = f2;
                                                                                                i8 = i3;
                                                                                                str = str67;
                                                                                                z3 = z2;
                                                                                                arrayList6 = arrayList41;
                                                                                                str4 = str74;
                                                                                                str21 = str77;
                                                                                                str22 = str78;
                                                                                                str46 = str80;
                                                                                                arrayList2 = arrayList48;
                                                                                                str51 = str89;
                                                                                                str44 = str10;
                                                                                                str45 = str11;
                                                                                                i9 = parseInt;
                                                                                                arrayList35 = arrayList14;
                                                                                                str47 = str18;
                                                                                                str27 = str92;
                                                                                                str48 = str41;
                                                                                                arrayList22 = arrayList31;
                                                                                                arrayList51 = arrayList32;
                                                                                                str49 = str42;
                                                                                                i10 = i7;
                                                                                                j20 = j15;
                                                                                                arrayList34 = arrayList26;
                                                                                                j18 = j14;
                                                                                                arrayList36 = arrayList30;
                                                                                                str50 = str88;
                                                                                                j16 = a9;
                                                                                                j4 = j36;
                                                                                                str85 = str95;
                                                                                                str84 = str97;
                                                                                                str52 = str43;
                                                                                                arrayList37 = arrayList27;
                                                                                                arrayList38 = arrayList28;
                                                                                                arrayList39 = arrayList33;
                                                                                                arrayList40 = arrayList29;
                                                                                                j21 = j33;
                                                                                                j17 = j10;
                                                                                                j19 = j9;
                                                                                                i11 = i6;
                                                                                                if (wq3.b(xmlPullParser, "Representation")) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    str41 = str82;
                                                                                    f2 = f10;
                                                                                    String attributeValue312 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                                                                    if (attributeValue312 != null) {
                                                                                    }
                                                                                    arrayList27 = new ArrayList();
                                                                                    arrayList28 = new ArrayList();
                                                                                    ArrayList arrayList552 = new ArrayList(arrayList19);
                                                                                    str25 = str40;
                                                                                    arrayList29 = new ArrayList(arrayList52);
                                                                                    arrayList30 = new ArrayList();
                                                                                    arrayList31 = arrayList19;
                                                                                    arrayList32 = arrayList52;
                                                                                    arrayList33 = arrayList552;
                                                                                    str42 = str83;
                                                                                    j14 = j10;
                                                                                    ly2 ly2Var32 = ly2Var2;
                                                                                    j15 = j37;
                                                                                    i6 = i18;
                                                                                    boolean z92 = false;
                                                                                    str43 = null;
                                                                                    while (true) {
                                                                                        xmlPullParser.next();
                                                                                        if (!wq3.c(xmlPullParser, str67)) {
                                                                                        }
                                                                                        f3 = f2;
                                                                                        i8 = i3;
                                                                                        str = str67;
                                                                                        z3 = z2;
                                                                                        arrayList6 = arrayList41;
                                                                                        str4 = str74;
                                                                                        str21 = str77;
                                                                                        str22 = str78;
                                                                                        str46 = str80;
                                                                                        arrayList2 = arrayList48;
                                                                                        str51 = str89;
                                                                                        str44 = str10;
                                                                                        str45 = str11;
                                                                                        i9 = parseInt;
                                                                                        arrayList35 = arrayList14;
                                                                                        str47 = str18;
                                                                                        str27 = str92;
                                                                                        str48 = str41;
                                                                                        arrayList22 = arrayList31;
                                                                                        arrayList51 = arrayList32;
                                                                                        str49 = str42;
                                                                                        i10 = i7;
                                                                                        j20 = j15;
                                                                                        arrayList34 = arrayList26;
                                                                                        j18 = j14;
                                                                                        arrayList36 = arrayList30;
                                                                                        str50 = str88;
                                                                                        j16 = a9;
                                                                                        j4 = j36;
                                                                                        str85 = str95;
                                                                                        str84 = str97;
                                                                                        str52 = str43;
                                                                                        arrayList37 = arrayList27;
                                                                                        arrayList38 = arrayList28;
                                                                                        arrayList39 = arrayList33;
                                                                                        arrayList40 = arrayList29;
                                                                                        j21 = j33;
                                                                                        j17 = j10;
                                                                                        j19 = j9;
                                                                                        i11 = i6;
                                                                                        if (wq3.b(xmlPullParser, "Representation")) {
                                                                                        }
                                                                                        arrayList33 = arrayList39;
                                                                                        arrayList29 = arrayList40;
                                                                                        long j402 = j16;
                                                                                        j14 = j18;
                                                                                        i6 = i11;
                                                                                        arrayList27 = arrayList37;
                                                                                        arrayList28 = arrayList38;
                                                                                        arrayList30 = arrayList36;
                                                                                        j10 = j17;
                                                                                        str88 = str50;
                                                                                        z2 = z3;
                                                                                        arrayList31 = arrayList22;
                                                                                        j33 = j21;
                                                                                        arrayList26 = arrayList34;
                                                                                        str97 = str84;
                                                                                        str95 = str85;
                                                                                        str43 = str52;
                                                                                        i3 = i8;
                                                                                        arrayList41 = arrayList6;
                                                                                        arrayList14 = arrayList35;
                                                                                        str18 = str47;
                                                                                        parseInt = i9;
                                                                                        f2 = f3;
                                                                                        parseInt4 = i10;
                                                                                        str77 = str21;
                                                                                        str10 = str44;
                                                                                        str11 = str45;
                                                                                        str41 = str48;
                                                                                        str42 = str49;
                                                                                        str78 = str22;
                                                                                        arrayList48 = arrayList2;
                                                                                        j36 = j4;
                                                                                        arrayList32 = arrayList51;
                                                                                        a9 = j402;
                                                                                        j9 = j19;
                                                                                        str74 = str4;
                                                                                        str92 = str27;
                                                                                        str96 = str96;
                                                                                        str89 = str51;
                                                                                        j15 = j20;
                                                                                        str67 = str;
                                                                                        str80 = str46;
                                                                                    }
                                                                                } else {
                                                                                    arrayList51 = arrayList52;
                                                                                    arrayList21 = arrayList13;
                                                                                    str20 = str82;
                                                                                    i4 = i3;
                                                                                    str = str67;
                                                                                    z3 = z2;
                                                                                    ArrayList arrayList64 = arrayList12;
                                                                                    arrayList6 = arrayList41;
                                                                                    str4 = str74;
                                                                                    str21 = str77;
                                                                                    str22 = str78;
                                                                                    str23 = str80;
                                                                                    arrayList2 = arrayList48;
                                                                                    long j47 = j9;
                                                                                    String str114 = str10;
                                                                                    str24 = str12;
                                                                                    str25 = str13;
                                                                                    str26 = str15;
                                                                                    str27 = str16;
                                                                                    str28 = str18;
                                                                                    arrayList22 = arrayList19;
                                                                                    str29 = str79;
                                                                                    String str115 = str83;
                                                                                    long j48 = a9;
                                                                                    j4 = j36;
                                                                                    String str116 = str11;
                                                                                    long j49 = j33;
                                                                                    long j50 = j10;
                                                                                    if (wq3.c(xmlPullParser, str116)) {
                                                                                        ly2Var2 = a(xmlPullParser, (ky2) ly2Var2);
                                                                                        str30 = str115;
                                                                                        str33 = str116;
                                                                                        arrayList23 = arrayList64;
                                                                                        i5 = i4;
                                                                                        j11 = j50;
                                                                                        j33 = j49;
                                                                                        j6 = j48;
                                                                                        arrayList25 = arrayList11;
                                                                                        str34 = str14;
                                                                                        arrayList24 = arrayList14;
                                                                                        j12 = j47;
                                                                                        str35 = str23;
                                                                                        str32 = str114;
                                                                                    } else if (wq3.c(xmlPullParser, str114)) {
                                                                                        long a14 = a(xmlPullParser, j37);
                                                                                        str30 = str115;
                                                                                        ly2Var2 = a(xmlPullParser, (hy2) ly2Var2, j49, j48, j50, a14, j47);
                                                                                        j6 = j48;
                                                                                        j37 = a14;
                                                                                        arrayList23 = arrayList64;
                                                                                        i5 = i4;
                                                                                        j11 = j50;
                                                                                        arrayList24 = arrayList14;
                                                                                        str35 = str23;
                                                                                        str32 = str114;
                                                                                        str31 = str22;
                                                                                        j33 = j49;
                                                                                        j12 = j47;
                                                                                        arrayList25 = arrayList11;
                                                                                        str34 = str14;
                                                                                        str33 = str116;
                                                                                    } else {
                                                                                        str30 = str115;
                                                                                        j6 = j48;
                                                                                        long j51 = j37;
                                                                                        if (wq3.c(xmlPullParser, str22)) {
                                                                                            long a15 = a(xmlPullParser, j51);
                                                                                            arrayList23 = arrayList64;
                                                                                            j11 = j50;
                                                                                            j12 = j47;
                                                                                            ly2Var2 = a(xmlPullParser, (iy2) ly2Var2, arrayList51, j49, j6, j11, a15, j12);
                                                                                            j33 = j49;
                                                                                            j37 = a15;
                                                                                            i5 = i4;
                                                                                            str31 = str22;
                                                                                            arrayList25 = arrayList11;
                                                                                            str34 = str14;
                                                                                            arrayList24 = arrayList14;
                                                                                            str35 = str23;
                                                                                            str32 = str114;
                                                                                            str33 = str116;
                                                                                        } else {
                                                                                            str31 = str22;
                                                                                            arrayList23 = arrayList64;
                                                                                            j11 = j50;
                                                                                            j33 = j49;
                                                                                            arrayList24 = arrayList14;
                                                                                            str32 = str114;
                                                                                            j12 = j47;
                                                                                            str33 = str116;
                                                                                            if (wq3.c(xmlPullParser, "InbandEventStream")) {
                                                                                                j13 = j51;
                                                                                                arrayList25 = arrayList11;
                                                                                                arrayList25.add(a(xmlPullParser, "InbandEventStream"));
                                                                                            } else {
                                                                                                j13 = j51;
                                                                                                arrayList25 = arrayList11;
                                                                                                if (wq3.c(xmlPullParser, "Label")) {
                                                                                                    str34 = "";
                                                                                                    do {
                                                                                                        xmlPullParser.next();
                                                                                                        String str117 = str34;
                                                                                                        if (xmlPullParser.getEventType() == 4) {
                                                                                                            str34 = xmlPullParser.getText();
                                                                                                        } else {
                                                                                                            a(xmlPullParser);
                                                                                                            str34 = str117;
                                                                                                        }
                                                                                                    } while (!wq3.b(xmlPullParser, "Label"));
                                                                                                    j37 = j13;
                                                                                                    i5 = i4;
                                                                                                    str35 = str23;
                                                                                                } else if (xmlPullParser.getEventType() == 2) {
                                                                                                    a(xmlPullParser);
                                                                                                }
                                                                                            }
                                                                                            j37 = j13;
                                                                                            str34 = str14;
                                                                                            i5 = i4;
                                                                                            str35 = str23;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                str31 = str22;
                                                                            } else {
                                                                                arrayList51.add(a(xmlPullParser, "SupplementalProperty"));
                                                                                str19 = str81;
                                                                                arrayList21 = arrayList13;
                                                                                str20 = str82;
                                                                                str30 = str83;
                                                                                str = str67;
                                                                                z3 = z2;
                                                                                arrayList23 = arrayList12;
                                                                                arrayList20 = arrayList10;
                                                                            }
                                                                        }
                                                                        arrayList6 = arrayList41;
                                                                        str4 = str74;
                                                                        j6 = a9;
                                                                        str21 = str77;
                                                                        str23 = str80;
                                                                        arrayList2 = arrayList48;
                                                                        j4 = j36;
                                                                        str32 = str10;
                                                                        str24 = str12;
                                                                        str25 = str13;
                                                                        arrayList25 = arrayList11;
                                                                        str26 = str15;
                                                                        str27 = str16;
                                                                        str28 = str18;
                                                                        j13 = j37;
                                                                        arrayList22 = arrayList19;
                                                                        str29 = str79;
                                                                        i4 = i3;
                                                                        j11 = j10;
                                                                        str31 = str78;
                                                                        j12 = j9;
                                                                        str33 = str11;
                                                                        arrayList24 = arrayList14;
                                                                        j37 = j13;
                                                                        str34 = str14;
                                                                        i5 = i4;
                                                                        str35 = str23;
                                                                    }
                                                                    str19 = str81;
                                                                    arrayList21 = arrayList13;
                                                                    str20 = str82;
                                                                    str30 = str83;
                                                                    str = str67;
                                                                    z3 = z2;
                                                                    arrayList23 = arrayList12;
                                                                    arrayList20 = arrayList10;
                                                                    arrayList6 = arrayList41;
                                                                    str4 = str74;
                                                                    j6 = a9;
                                                                    str21 = str77;
                                                                    str23 = str80;
                                                                    arrayList2 = arrayList48;
                                                                    j4 = j36;
                                                                    str32 = str10;
                                                                    str24 = str12;
                                                                    str25 = str13;
                                                                    arrayList25 = arrayList11;
                                                                    str26 = str15;
                                                                    str27 = str16;
                                                                    arrayList22 = arrayList16;
                                                                    j13 = j37;
                                                                    str28 = str87;
                                                                    str29 = str79;
                                                                    str2 = str68;
                                                                    str31 = str78;
                                                                    arrayList24 = arrayList14;
                                                                    i4 = i3;
                                                                    j11 = j10;
                                                                    j12 = j9;
                                                                    str33 = str11;
                                                                    j37 = j13;
                                                                    str34 = str14;
                                                                    i5 = i4;
                                                                    str35 = str23;
                                                                }
                                                            }
                                                        }
                                                        if (wq3.b(xmlPullParser, str35)) {
                                                            ArrayList arrayList65 = new ArrayList(arrayList24.size());
                                                            int i47 = 0;
                                                            while (i47 < arrayList24.size()) {
                                                                d30 d30Var2 = (d30) arrayList24.get(i47);
                                                                nx0 nx0Var2 = d30Var2.a;
                                                                nx0Var2.getClass();
                                                                mx0 mx0Var2 = new mx0(nx0Var2);
                                                                if (str34 != null) {
                                                                    mx0Var2.b = str34;
                                                                }
                                                                String str118 = d30Var2.d;
                                                                if (str118 == null) {
                                                                    str118 = str86;
                                                                }
                                                                ArrayList arrayList66 = d30Var2.e;
                                                                ArrayList arrayList67 = arrayList20;
                                                                arrayList66.addAll(arrayList67);
                                                                ArrayList arrayList68 = arrayList24;
                                                                if (arrayList66.isEmpty()) {
                                                                    str60 = str34;
                                                                    j23 = j6;
                                                                    i14 = i47;
                                                                } else {
                                                                    int i48 = 0;
                                                                    while (true) {
                                                                        if (i48 < arrayList66.size()) {
                                                                            kk0 kk0Var = (kk0) arrayList66.get(i48);
                                                                            str60 = str34;
                                                                            j23 = j6;
                                                                            if (!jr.c.equals(kk0Var.c) || (str61 = kk0Var.d) == null) {
                                                                                i48++;
                                                                                str34 = str60;
                                                                                j6 = j23;
                                                                            } else {
                                                                                arrayList66.remove(i48);
                                                                            }
                                                                        } else {
                                                                            str60 = str34;
                                                                            j23 = j6;
                                                                            str61 = null;
                                                                        }
                                                                    }
                                                                    if (str61 != null) {
                                                                        int i49 = 0;
                                                                        while (i49 < arrayList66.size()) {
                                                                            kk0 kk0Var2 = (kk0) arrayList66.get(i49);
                                                                            if (jr.b.equals(kk0Var2.c) && kk0Var2.d == null) {
                                                                                i15 = i47;
                                                                                arrayList66.set(i49, new kk0(jr.c, str61, kk0Var2.e, kk0Var2.f));
                                                                            } else {
                                                                                i15 = i47;
                                                                            }
                                                                            i49++;
                                                                            i47 = i15;
                                                                        }
                                                                    }
                                                                    i14 = i47;
                                                                    for (int size = arrayList66.size() - 1; size >= 0; size--) {
                                                                        kk0 kk0Var3 = (kk0) arrayList66.get(size);
                                                                        if (kk0Var3.f == null) {
                                                                            int i50 = 0;
                                                                            while (true) {
                                                                                if (i50 < arrayList66.size()) {
                                                                                    kk0 kk0Var4 = (kk0) arrayList66.get(i50);
                                                                                    if (kk0Var4.f != null && kk0Var3.f == null && kk0Var4.a(kk0Var3.c)) {
                                                                                        arrayList66.remove(size);
                                                                                    } else {
                                                                                        i50++;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    mx0Var2.n = new lk0(str118, false, (kk0[]) arrayList66.toArray(new kk0[0]));
                                                                }
                                                                ArrayList arrayList69 = d30Var2.f;
                                                                arrayList69.addAll(arrayList25);
                                                                long j52 = d30Var2.g;
                                                                nx0 nx0Var3 = new nx0(mx0Var2);
                                                                s51 s51Var = d30Var2.b;
                                                                ly2 ly2Var4 = d30Var2.c;
                                                                if (ly2Var4 instanceof ky2) {
                                                                    kp2Var = new lp2(j52, nx0Var3, s51Var, (ky2) ly2Var4, arrayList69);
                                                                } else if (ly2Var4 instanceof gy2) {
                                                                    kp2Var = new kp2(j52, nx0Var3, s51Var, (gy2) ly2Var4, arrayList69);
                                                                } else {
                                                                    throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                                }
                                                                arrayList65.add(kp2Var);
                                                                i47 = i14 + 1;
                                                                arrayList20 = arrayList67;
                                                                str34 = str60;
                                                                j6 = j23;
                                                                arrayList24 = arrayList68;
                                                            }
                                                            arrayList47.add(new zb(parseInt6, i5, arrayList65, arrayList23, arrayList22, arrayList51));
                                                            z4 = false;
                                                            a5 = j12;
                                                            j7 = j33;
                                                            arrayList7 = arrayList45;
                                                            str77 = str21;
                                                            str3 = str27;
                                                            j3 = C.TIME_UNSET;
                                                            arrayList8 = arrayList47;
                                                        } else {
                                                            arrayList14 = arrayList24;
                                                            arrayList11 = arrayList25;
                                                            str78 = str31;
                                                            str10 = str32;
                                                            str11 = str33;
                                                            j9 = j12;
                                                            str17 = str28;
                                                            str14 = str34;
                                                            j36 = j4;
                                                            z2 = z3;
                                                            i2 = i5;
                                                            str79 = str29;
                                                            arrayList43 = arrayList17;
                                                            str81 = str19;
                                                            arrayList10 = arrayList20;
                                                            arrayList12 = arrayList23;
                                                            str12 = str24;
                                                            str15 = str26;
                                                            str13 = str25;
                                                            str67 = str;
                                                            arrayList41 = arrayList6;
                                                            str77 = str21;
                                                            str16 = str27;
                                                            a9 = j6;
                                                            j10 = j11;
                                                            str80 = str35;
                                                            str68 = str2;
                                                            arrayList15 = arrayList18;
                                                            arrayList13 = arrayList21;
                                                            str82 = str20;
                                                            str83 = str30;
                                                            arrayList16 = arrayList22;
                                                            arrayList48 = arrayList2;
                                                            str74 = str4;
                                                        }
                                                    }
                                                }
                                            }
                                            str13 = "frameRate";
                                            f = -1.0f;
                                            String attributeValue192 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                            if (attributeValue192 == null) {
                                            }
                                            String attributeValue202 = xmlPullParser.getAttributeValue(null, str68);
                                            String attributeValue212 = xmlPullParser.getAttributeValue(null, "label");
                                            arrayList10 = new ArrayList();
                                            float f102 = f;
                                            arrayList11 = new ArrayList();
                                            arrayList12 = new ArrayList();
                                            str14 = attributeValue212;
                                            arrayList13 = new ArrayList();
                                            str15 = "width";
                                            ArrayList arrayList492 = new ArrayList();
                                            String str842 = "codecs";
                                            ArrayList arrayList502 = new ArrayList();
                                            String str852 = RTCStatsConstants.KEY_MIME_TYPE;
                                            arrayList14 = new ArrayList();
                                            arrayList15 = new ArrayList();
                                            str16 = str73;
                                            arrayList16 = arrayList492;
                                            ly2 ly2Var22 = ly2Var;
                                            long j372 = j34;
                                            i2 = i17;
                                            str17 = attributeValue202;
                                            String str862 = null;
                                            boolean z82 = false;
                                            int i182 = -1;
                                            ArrayList arrayList512 = arrayList502;
                                            j10 = j5;
                                            while (true) {
                                                xmlPullParser.next();
                                                if (wq3.c(xmlPullParser, str67)) {
                                                }
                                                if (wq3.b(xmlPullParser, str35)) {
                                                }
                                                arrayList14 = arrayList24;
                                                arrayList11 = arrayList25;
                                                str78 = str31;
                                                str10 = str32;
                                                str11 = str33;
                                                j9 = j12;
                                                str17 = str28;
                                                str14 = str34;
                                                j36 = j4;
                                                z2 = z3;
                                                i2 = i5;
                                                str79 = str29;
                                                arrayList43 = arrayList17;
                                                str81 = str19;
                                                arrayList10 = arrayList20;
                                                arrayList12 = arrayList23;
                                                str12 = str24;
                                                str15 = str26;
                                                str13 = str25;
                                                str67 = str;
                                                arrayList41 = arrayList6;
                                                str77 = str21;
                                                str16 = str27;
                                                a9 = j6;
                                                j10 = j11;
                                                str80 = str35;
                                                str68 = str2;
                                                arrayList15 = arrayList18;
                                                arrayList13 = arrayList21;
                                                str82 = str20;
                                                str83 = str30;
                                                arrayList16 = arrayList22;
                                                arrayList48 = arrayList2;
                                                str74 = str4;
                                            }
                                        }
                                        i = -1;
                                        int i172 = i;
                                        String attributeValue152 = xmlPullParser.getAttributeValue(null, RTCStatsConstants.KEY_MIME_TYPE);
                                        j9 = a5;
                                        String attributeValue162 = xmlPullParser.getAttributeValue(null, "codecs");
                                        String attributeValue172 = xmlPullParser.getAttributeValue(null, "width");
                                        if (attributeValue172 != null) {
                                        }
                                        str10 = "SegmentList";
                                        String attributeValue182 = xmlPullParser.getAttributeValue(null, "height");
                                        if (attributeValue182 != null) {
                                        }
                                        str11 = "SegmentBase";
                                        str12 = "height";
                                        attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
                                        if (attributeValue != null) {
                                        }
                                        str13 = "frameRate";
                                        f = -1.0f;
                                        String attributeValue1922 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
                                        if (attributeValue1922 == null) {
                                        }
                                        String attributeValue2022 = xmlPullParser.getAttributeValue(null, str68);
                                        String attributeValue2122 = xmlPullParser.getAttributeValue(null, "label");
                                        arrayList10 = new ArrayList();
                                        float f1022 = f;
                                        arrayList11 = new ArrayList();
                                        arrayList12 = new ArrayList();
                                        str14 = attributeValue2122;
                                        arrayList13 = new ArrayList();
                                        str15 = "width";
                                        ArrayList arrayList4922 = new ArrayList();
                                        String str8422 = "codecs";
                                        ArrayList arrayList5022 = new ArrayList();
                                        String str8522 = RTCStatsConstants.KEY_MIME_TYPE;
                                        arrayList14 = new ArrayList();
                                        arrayList15 = new ArrayList();
                                        str16 = str73;
                                        arrayList16 = arrayList4922;
                                        ly2 ly2Var222 = ly2Var;
                                        long j3722 = j34;
                                        i2 = i172;
                                        str17 = attributeValue2022;
                                        String str8622 = null;
                                        boolean z822 = false;
                                        int i1822 = -1;
                                        ArrayList arrayList5122 = arrayList5022;
                                        j10 = j5;
                                        while (true) {
                                            xmlPullParser.next();
                                            if (wq3.c(xmlPullParser, str67)) {
                                            }
                                            if (wq3.b(xmlPullParser, str35)) {
                                            }
                                            arrayList14 = arrayList24;
                                            arrayList11 = arrayList25;
                                            str78 = str31;
                                            str10 = str32;
                                            str11 = str33;
                                            j9 = j12;
                                            str17 = str28;
                                            str14 = str34;
                                            j36 = j4;
                                            z2 = z3;
                                            i2 = i5;
                                            str79 = str29;
                                            arrayList43 = arrayList17;
                                            str81 = str19;
                                            arrayList10 = arrayList20;
                                            arrayList12 = arrayList23;
                                            str12 = str24;
                                            str15 = str26;
                                            str13 = str25;
                                            str67 = str;
                                            arrayList41 = arrayList6;
                                            str77 = str21;
                                            str16 = str27;
                                            a9 = j6;
                                            j10 = j11;
                                            str80 = str35;
                                            str68 = str2;
                                            arrayList15 = arrayList18;
                                            arrayList13 = arrayList21;
                                            str82 = str20;
                                            str83 = str30;
                                            arrayList16 = arrayList22;
                                            arrayList48 = arrayList2;
                                            str74 = str4;
                                        }
                                    } else {
                                        arrayList5 = arrayList43;
                                        String str119 = str73;
                                        j5 = j35;
                                        str = str67;
                                        z3 = z2;
                                        str2 = str68;
                                        arrayList6 = arrayList41;
                                        String str120 = str74;
                                        long j53 = a9;
                                        String str121 = str77;
                                        ArrayList arrayList70 = arrayList47;
                                        arrayList2 = arrayList42;
                                        j4 = j26;
                                        long j54 = a5;
                                        if (wq3.c(xmlPullParser, "EventStream")) {
                                            String attributeValue32 = xmlPullParser.getAttributeValue(null, str120);
                                            String str122 = attributeValue32 == null ? "" : attributeValue32;
                                            String str123 = str76;
                                            String attributeValue33 = xmlPullParser.getAttributeValue(null, str123);
                                            String str124 = attributeValue33 == null ? "" : attributeValue33;
                                            String attributeValue34 = xmlPullParser.getAttributeValue(null, "timescale");
                                            long parseLong = attributeValue34 == null ? 1L : Long.parseLong(attributeValue34);
                                            ArrayList arrayList71 = new ArrayList();
                                            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream(512);
                                            while (true) {
                                                xmlPullParser.next();
                                                if (wq3.c(xmlPullParser, "Event")) {
                                                    str3 = str119;
                                                    String attributeValue35 = xmlPullParser.getAttributeValue(null, str3);
                                                    long parseLong2 = attributeValue35 == null ? 0L : Long.parseLong(attributeValue35);
                                                    String str125 = str121;
                                                    String attributeValue36 = xmlPullParser.getAttributeValue(null, str125);
                                                    long parseLong3 = attributeValue36 == null ? C.TIME_UNSET : Long.parseLong(attributeValue36);
                                                    String attributeValue37 = xmlPullParser.getAttributeValue(null, "presentationTime");
                                                    long parseLong4 = attributeValue37 == null ? 0L : Long.parseLong(attributeValue37);
                                                    long a16 = mc3.a(parseLong3, 1000L, parseLong);
                                                    long a17 = mc3.a(parseLong4, 1000000L, parseLong);
                                                    j8 = parseLong;
                                                    String attributeValue38 = xmlPullParser.getAttributeValue(null, "messageData");
                                                    if (attributeValue38 == null) {
                                                        attributeValue38 = null;
                                                    }
                                                    byteArrayOutputStream3.reset();
                                                    XmlSerializer newSerializer = Xml.newSerializer();
                                                    arrayList9 = arrayList70;
                                                    newSerializer.setOutput(byteArrayOutputStream3, bu.c.name());
                                                    xmlPullParser.nextToken();
                                                    while (!wq3.b(xmlPullParser, "Event")) {
                                                        switch (xmlPullParser.getEventType()) {
                                                            case 0:
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                newSerializer.startDocument(null, Boolean.FALSE);
                                                                break;
                                                            case 1:
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                newSerializer.endDocument();
                                                                break;
                                                            case 2:
                                                                str8 = attributeValue38;
                                                                newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                int i51 = 0;
                                                                while (i51 < xmlPullParser.getAttributeCount()) {
                                                                    newSerializer.attribute(xmlPullParser.getAttributeNamespace(i51), xmlPullParser.getAttributeName(i51), xmlPullParser.getAttributeValue(i51));
                                                                    i51++;
                                                                    str125 = str125;
                                                                    byteArrayOutputStream3 = byteArrayOutputStream3;
                                                                }
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            case 3:
                                                                str8 = attributeValue38;
                                                                newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            case 4:
                                                                newSerializer.text(xmlPullParser.getText());
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            case 5:
                                                                newSerializer.cdsect(xmlPullParser.getText());
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            case 6:
                                                                newSerializer.entityRef(xmlPullParser.getText());
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            case 7:
                                                                newSerializer.ignorableWhitespace(xmlPullParser.getText());
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            case 8:
                                                                newSerializer.processingInstruction(xmlPullParser.getText());
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            case 9:
                                                                newSerializer.comment(xmlPullParser.getText());
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            case 10:
                                                                newSerializer.docdecl(xmlPullParser.getText());
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                            default:
                                                                str8 = attributeValue38;
                                                                str9 = str125;
                                                                byteArrayOutputStream2 = byteArrayOutputStream3;
                                                                break;
                                                        }
                                                        xmlPullParser.nextToken();
                                                        attributeValue38 = str8;
                                                        str125 = str9;
                                                        byteArrayOutputStream3 = byteArrayOutputStream2;
                                                    }
                                                    String str126 = attributeValue38;
                                                    str77 = str125;
                                                    byteArrayOutputStream = byteArrayOutputStream3;
                                                    newSerializer.flush();
                                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                    Long valueOf = Long.valueOf(a17);
                                                    if (str126 != null) {
                                                        byteArray = mc3.c(str126);
                                                    }
                                                    str6 = str122;
                                                    str7 = str124;
                                                    arrayList71.add(Pair.create(valueOf, new xm0(str122, str124, a16, parseLong2, byteArray)));
                                                } else {
                                                    arrayList9 = arrayList70;
                                                    byteArrayOutputStream = byteArrayOutputStream3;
                                                    str6 = str122;
                                                    str7 = str124;
                                                    j8 = parseLong;
                                                    str77 = str121;
                                                    str3 = str119;
                                                    a(xmlPullParser);
                                                }
                                                if (wq3.b(xmlPullParser, "EventStream")) {
                                                    long[] jArr = new long[arrayList71.size()];
                                                    xm0[] xm0VarArr = new xm0[arrayList71.size()];
                                                    for (int i52 = 0; i52 < arrayList71.size(); i52++) {
                                                        Pair pair = (Pair) arrayList71.get(i52);
                                                        jArr[i52] = ((Long) pair.first).longValue();
                                                        xm0VarArr[i52] = (xm0) pair.second;
                                                    }
                                                    bn0 bn0Var = new bn0(str6, str7, jArr, xm0VarArr);
                                                    ArrayList arrayList72 = arrayList45;
                                                    arrayList72.add(bn0Var);
                                                    arrayList7 = arrayList72;
                                                    j7 = j33;
                                                    a5 = j54;
                                                    str4 = str120;
                                                    arrayList8 = arrayList9;
                                                    j6 = j53;
                                                    z4 = false;
                                                    str76 = str123;
                                                    j3 = C.TIME_UNSET;
                                                } else {
                                                    str122 = str6;
                                                    str124 = str7;
                                                    str119 = str3;
                                                    arrayList70 = arrayList9;
                                                    str121 = str77;
                                                    byteArrayOutputStream3 = byteArrayOutputStream;
                                                    parseLong = j8;
                                                }
                                            }
                                        } else {
                                            String str127 = str76;
                                            ArrayList arrayList73 = arrayList45;
                                            str77 = str121;
                                            str3 = str119;
                                            if (wq3.c(xmlPullParser, "SegmentBase")) {
                                                ly2Var = a(xmlPullParser, (ky2) null);
                                                arrayList7 = arrayList73;
                                                j7 = j33;
                                                a5 = j54;
                                                str4 = str120;
                                                str5 = str75;
                                                arrayList8 = arrayList70;
                                                j6 = j53;
                                                z4 = false;
                                                str76 = str127;
                                                j3 = C.TIME_UNSET;
                                            } else if (wq3.c(xmlPullParser, "SegmentList")) {
                                                long a18 = a(xmlPullParser, C.TIME_UNSET);
                                                long j55 = j33;
                                                arrayList7 = arrayList73;
                                                a5 = j54;
                                                str4 = str120;
                                                arrayList8 = arrayList70;
                                                z4 = false;
                                                str76 = str127;
                                                j3 = -9223372036854775807L;
                                                ly2Var = a(xmlPullParser, null, j55, j53, j5, a18, a5);
                                                j6 = j53;
                                                j7 = j55;
                                                j34 = a18;
                                            } else {
                                                long j56 = j33;
                                                arrayList7 = arrayList73;
                                                a5 = j54;
                                                str4 = str120;
                                                arrayList8 = arrayList70;
                                                j6 = j53;
                                                z4 = false;
                                                str76 = str127;
                                                j3 = C.TIME_UNSET;
                                                if (wq3.c(xmlPullParser, str78)) {
                                                    long a19 = a(xmlPullParser, C.TIME_UNSET);
                                                    p51 p51Var = s51.c;
                                                    j7 = j56;
                                                    ly2Var = a(xmlPullParser, null, tn2.f, j7, j6, j5, a19, a5);
                                                    a5 = a5;
                                                    j34 = a19;
                                                } else {
                                                    j7 = j56;
                                                    if (wq3.c(xmlPullParser, "AssetIdentifier")) {
                                                        a(xmlPullParser, "AssetIdentifier");
                                                    } else {
                                                        a(xmlPullParser);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    str5 = str75;
                                }
                                if (wq3.b(xmlPullParser, str5)) {
                                    Pair create = Pair.create(new gd2(attributeValue12, a8, arrayList8, arrayList7), Long.valueOf(j6));
                                    gd2 gd2Var = (gd2) create.first;
                                    if (gd2Var.b != j3) {
                                        arrayList3 = arrayList6;
                                        long longValue = ((Long) create.second).longValue();
                                        long j57 = longValue == j3 ? j3 : longValue + gd2Var.b;
                                        arrayList3.add(gd2Var);
                                        j4 = j57;
                                    } else {
                                        if (!equals) {
                                            throw new pc2(uq.b(arrayList6, new StringBuilder("Unable to determine start of period ")), null, true, 4);
                                        }
                                        j25 = j2;
                                        arrayList3 = arrayList6;
                                        z6 = true;
                                    }
                                } else {
                                    str75 = str5;
                                    str73 = str3;
                                    arrayList44 = arrayList8;
                                    arrayList45 = arrayList7;
                                    j26 = j4;
                                    z2 = z3;
                                    arrayList43 = arrayList5;
                                    arrayList46 = arrayList4;
                                    str68 = str2;
                                    str67 = str;
                                    arrayList41 = arrayList6;
                                    j33 = j7;
                                    a9 = j6;
                                    arrayList42 = arrayList2;
                                    j35 = j5;
                                    str74 = str4;
                                }
                            }
                        } else {
                            j2 = j25;
                            arrayList2 = arrayList42;
                            z3 = z2;
                            j3 = j;
                            z4 = false;
                            j4 = j26;
                            arrayList3 = arrayList41;
                            a(xmlPullParser);
                        }
                        j25 = j2;
                    }
                    z3 = z2;
                }
                j3 = j;
                z4 = false;
                j4 = j26;
                arrayList3 = arrayList41;
            }
            if (wq3.b(xmlPullParser, "MPD")) {
                if (a2 == j3) {
                    if (j4 != j3) {
                        a2 = j4;
                    } else if (!equals) {
                        throw new pc2("Unable to determine duration of static manifest.", null, true, 4);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    return new c30(f4, a2, a3, equals, a4, a5, a6, f5, ek2Var, lc3Var, dz2Var, uri2, arrayList3);
                }
                throw new pc2("No periods found.", null, true, 4);
            }
            arrayList41 = arrayList3;
            j24 = j3;
            arrayList42 = arrayList2;
            j26 = j4;
            a7 = arrayList;
            z2 = z3;
            str66 = null;
            z = true;
        }
    }

    public static ArrayList a(XmlPullParser xmlPullParser, long j, long j2) {
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (wq3.c(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = parseLong;
                    j4 = a(arrayList, j4, j5, i2, j3);
                } else {
                    j3 = parseLong;
                }
                if (j3 != C.TIME_UNSET) {
                    j4 = j3;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j5 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                i = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z = true;
            } else {
                a(xmlPullParser);
            }
        } while (!wq3.b(xmlPullParser, "SegmentTimeline"));
        if (!z) {
            return arrayList;
        }
        a(arrayList, j4, j5, i, mc3.a(j2, j, 1000L));
        return arrayList;
    }
}
