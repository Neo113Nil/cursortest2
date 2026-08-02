package xsna;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import androidx.media3.exoplayer.upstream.c;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.common.collect.ImmutableList;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.jsonwebtoken.JwtParser;
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
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.e7g0;
import xsna.o4i0;
import xsna.xae0;

/* compiled from: DashManifestParser.java */
/* loaded from: classes12.dex */
public class wsk extends DefaultHandler implements c.a<rsk> {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    public static final int[] f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    /* compiled from: DashManifestParser.java */
    public static final class a {
        public final androidx.media3.common.a a;
        public final ImmutableList<tp6> b;
        public final o4i0 c;

        @Nullable
        public final String d;
        public final ArrayList<DrmInitData.SchemeData> e;
        public final ArrayList<y2m> f;
        public final long g;
        public final List<y2m> h;
        public final List<y2m> i;

        public a(androidx.media3.common.a aVar, List<tp6> list, o4i0 o4i0Var, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<y2m> arrayList2, List<y2m> list2, List<y2m> list3, long j) {
            this.a = aVar;
            this.b = ImmutableList.m(list);
            this.c = o4i0Var;
            this.d = str;
            this.e = arrayList;
            this.f = arrayList2;
            this.h = list2;
            this.i = list3;
            this.g = j;
        }
    }

    public wsk() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static long b(ArrayList arrayList, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            String str = y2r0.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new o4i0.d(j, j2));
            j += j2;
        }
        return j;
    }

    public static void c(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r13.equals("fa01") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0190, code lost:
    
        if (r13 == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a3, code lost:
    
        if (r13 < 33) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        char c2;
        int parseInt;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        attributeValue.getClass();
        int i = 5;
        char c3 = 4;
        int i2 = 0;
        int i3 = -1;
        switch (attributeValue.hashCode()) {
            case -2128649360:
                if (attributeValue.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -2060825028:
                if (attributeValue.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1352850286:
                if (attributeValue.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1138141449:
                if (attributeValue.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -986633423:
                if (attributeValue.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -79006963:
                if (attributeValue.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 312179081:
                if (attributeValue.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 2036691300:
                if (attributeValue.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
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
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
                parseInt = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
                if (parseInt > 0) {
                    break;
                }
                break;
            case 1:
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue3 != null && attributeValue3.length() == 6) {
                    int parseInt2 = Integer.parseInt(attributeValue3, 16);
                    if ((8388608 & parseInt2) == 0) {
                        parseInt = 0;
                        while (true) {
                            int[] iArr = e;
                            if (i2 >= iArr.length) {
                                break;
                            } else {
                                parseInt += ((parseInt2 >> i2) & 1) * iArr[i2];
                                i2++;
                            }
                        }
                    } else {
                        String[] f0 = y2r0.f0(str);
                        if (f0.length != 0) {
                            List<String> c4 = vlk0.a(JwtParser.SEPARATOR_CHAR).c(o19.u(f0[0].trim()));
                            if (c4.size() == 4 && c4.get(0).equals("ac-4")) {
                                String str2 = c4.get(3);
                                str2.getClass();
                                if (!str2.equals("03")) {
                                    if (str2.equals("04")) {
                                        i3 = 21;
                                        break;
                                    }
                                } else {
                                    i3 = 18;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue4 != null) {
                    i3 = Integer.parseInt(attributeValue4);
                    break;
                }
                break;
            case 3:
            case 7:
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue5 != null) {
                    String u = o19.u(attributeValue5);
                    u.getClass();
                    switch (u.hashCode()) {
                        case 1596796:
                            if (u.equals("4000")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 2937391:
                            if (u.equals("a000")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094034:
                            if (u.equals("f800")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3094035:
                            if (u.equals("f801")) {
                                c3 = 3;
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
                            i = 6;
                            break;
                        case 4:
                            i = 8;
                            break;
                    }
                    i3 = i;
                    break;
                }
                i = -1;
                i3 = i;
            case 4:
                String attributeValue6 = xmlPullParser.getAttributeValue(null, "value");
                int parseInt3 = attributeValue6 == null ? -1 : Integer.parseInt(attributeValue6);
                if (parseInt3 >= 0) {
                    int[] iArr2 = f;
                    if (parseInt3 < iArr2.length) {
                        i3 = iArr2[parseInt3];
                        break;
                    }
                }
                break;
            case 6:
                String attributeValue7 = xmlPullParser.getAttributeValue(null, "value");
                if (attributeValue7 != null) {
                    parseInt = Integer.bitCount(Integer.parseInt(attributeValue7, 16));
                    break;
                }
                break;
        }
        do {
            xmlPullParser.next();
        } while (!o19.m(xmlPullParser, "AudioChannelConfiguration"));
        return i3;
    }

    public static long f(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList g(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                c(xmlPullParser);
            }
        } while (!o19.m(xmlPullParser, "BaseURL"));
        if (str != null && neq0.a(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return qhz.d(new tp6(str, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            tp6 tp6Var = (tp6) arrayList.get(i);
            String c2 = neq0.c(tp6Var.a, str);
            String str2 = attributeValue3 == null ? c2 : attributeValue3;
            if (z) {
                parseInt = tp6Var.c;
                parseInt2 = tp6Var.d;
                str2 = tp6Var.b;
            }
            arrayList2.add(new tp6(c2, str2, parseInt, parseInt2));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        ?? r6;
        String str2;
        String str3;
        ?? r7;
        char c2;
        String str4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String u = o19.u(attributeValue);
            u.getClass();
            switch (u.hashCode()) {
                case -1980789791:
                    if (u.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 489446379:
                    if (u.equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 755418770:
                    if (u.equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1812765994:
                    if (u.equals("urn:mpeg:dash:mp4protection:2011")) {
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
                    r6 = tu8.c;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 1:
                    r6 = tu8.e;
                    str = null;
                    str2 = null;
                    str3 = str2;
                    r7 = str2;
                    break;
                case 2:
                    r6 = tu8.d;
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
                        r6 = tu8.b;
                        str3 = null;
                        r7 = xae0.b(r6, uuidArr, null);
                        break;
                    } else {
                        ahn.F("Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
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
                if ((!o19.n(xmlPullParser, "clearkey:Laurl") || o19.n(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r7 = r7;
                } else if (o19.n(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r7 = r7;
                } else {
                    if (r7 == 0 && xmlPullParser.getEventType() == 2) {
                        String name = xmlPullParser.getName();
                        int indexOf2 = name.indexOf(58);
                        if (indexOf2 != -1) {
                            name = name.substring(indexOf2 + 1);
                        }
                        if (name.equals(ProtectionSystemSpecificHeaderBox.TYPE) && xmlPullParser.next() == 4) {
                            byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                            xae0.a c3 = xae0.c(decode);
                            UUID uuid = c3 == null ? null : c3.a;
                            if (uuid == null) {
                                ahn.F("Skipping malformed cenc:pssh data");
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
                        ?? r9 = tu8.e;
                        if (r9.equals(r6) && o19.n(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r7 = xae0.b(r9, null, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    c(xmlPullParser);
                    r7 = r7;
                }
            } while (!o19.m(xmlPullParser, "ContentProtection"));
            return Pair.create(str, r6 != null ? new DrmInitData.SchemeData(r6, str3, MimeTypes.VIDEO_MP4, r7) : null);
        }
        str = null;
        r6 = null;
        str2 = r6;
        str3 = str2;
        r7 = str2;
        do {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "clearkey:Laurl")) {
            }
            str3 = xmlPullParser.getText();
            r7 = r7;
        } while (!o19.m(xmlPullParser, "ContentProtection"));
        return Pair.create(str, r6 != null ? new DrmInitData.SchemeData(r6, str3, MimeTypes.VIDEO_MP4, r7) : null);
    }

    public static int i(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static y2m j(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
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
        } while (!o19.m(xmlPullParser, str));
        return new y2m(attributeValue, attributeValue2, str2);
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = y2r0.e.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
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

    public static float l(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f2;
    }

    public static p1e0 o(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "moreInformationURL");
        String str2 = attributeValue == null ? null : attributeValue;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "lang");
        String str3 = attributeValue2 == null ? null : attributeValue2;
        String str4 = null;
        String str5 = null;
        while (true) {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (o19.n(xmlPullParser, "Source")) {
                str4 = xmlPullParser.nextText();
            } else if (o19.n(xmlPullParser, "Copyright")) {
                str5 = xmlPullParser.nextText();
            } else {
                c(xmlPullParser);
            }
            String str6 = str4;
            String str7 = str;
            String str8 = str5;
            if (o19.m(xmlPullParser, "ProgramInformation")) {
                return new p1e0(str7, str6, str8, str2, str3);
            }
            str = str7;
            str4 = str6;
            str5 = str8;
        }
    }

    public static rwe0 p(XmlPullParser xmlPullParser, String str, String str2) {
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
        return new rwe0(attributeValue, j, j2);
    }

    public static int r(@Nullable String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int s(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (o19.h("http://dashif.org/guidelines/trickmode", ((y2m) arrayList.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static o4i0.e t(XmlPullParser xmlPullParser, @Nullable o4i0.e eVar) throws XmlPullParserException, IOException {
        long j = eVar != null ? eVar.b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j2 = j;
        long j3 = eVar != null ? eVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j3 = Long.parseLong(attributeValue2);
        }
        long j4 = j3;
        long j5 = eVar != null ? eVar.d : 0L;
        long j6 = eVar != null ? eVar.e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j5 = Long.parseLong(split[0]);
            j6 = (Long.parseLong(split[1]) - j5) + 1;
        }
        long j7 = j6;
        long j8 = j5;
        rwe0 rwe0Var = eVar != null ? eVar.a : null;
        while (true) {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "Initialization")) {
                rwe0Var = p(xmlPullParser, "sourceURL", "range");
            } else {
                c(xmlPullParser);
            }
            rwe0 rwe0Var2 = rwe0Var;
            if (o19.m(xmlPullParser, "SegmentBase")) {
                return new o4i0.e(rwe0Var2, j2, j4, j8, j7);
            }
            rwe0Var = rwe0Var2;
        }
    }

    public static o4i0.b u(XmlPullParser xmlPullParser, @Nullable o4i0.b bVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6 = bVar != null ? bVar.b : 1L;
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j6 = Long.parseLong(attributeValue);
        }
        long j7 = j6;
        long j8 = bVar != null ? bVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j8 = Long.parseLong(attributeValue2);
        }
        long j9 = j8;
        long j10 = bVar != null ? bVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j10 = Long.parseLong(attributeValue3);
        }
        long j11 = j10;
        long j12 = bVar != null ? bVar.d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j12 = Long.parseLong(attributeValue4);
        }
        long j13 = j12;
        long j14 = j4 == C.TIME_UNSET ? j3 : j4;
        long j15 = j14 == Long.MAX_VALUE ? -9223372036854775807L : j14;
        rwe0 rwe0Var = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "Initialization")) {
                rwe0Var = p(xmlPullParser, "sourceURL", "range");
            } else if (o19.n(xmlPullParser, "SegmentTimeline")) {
                list2 = w(xmlPullParser, j7, j2);
            } else if (o19.n(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(p(xmlPullParser, X3.i.I0, "mediaRange"));
            } else {
                c(xmlPullParser);
            }
        } while (!o19.m(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (rwe0Var == null) {
                rwe0Var = bVar.a;
            }
            if (list2 == null) {
                list2 = bVar.f;
            }
            if (list == null) {
                list = bVar.j;
            }
        }
        return new o4i0.b(rwe0Var, j7, j9, j13, j11, list2, j15, list, y2r0.S(j5), y2r0.S(j));
    }

    public static o4i0.c v(XmlPullParser xmlPullParser, @Nullable o4i0.c cVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long j7 = cVar != null ? cVar.b : 1L;
        rwe0 rwe0Var = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j7 = Long.parseLong(attributeValue);
        }
        long j8 = j7;
        long j9 = cVar != null ? cVar.c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j9 = Long.parseLong(attributeValue2);
        }
        long j10 = j9;
        long j11 = cVar != null ? cVar.e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j11 = Long.parseLong(attributeValue3);
        }
        long j12 = j11;
        long j13 = cVar != null ? cVar.d : 1L;
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
            y2m y2mVar = (y2m) list.get(i);
            if (o19.h("http://dashif.org/guidelines/last-segment-number", y2mVar.a)) {
                j6 = Long.parseLong(y2mVar.b);
                break;
            }
            i++;
        }
        long j15 = j6;
        long j16 = j4 == C.TIME_UNSET ? j3 : j4;
        long j17 = j16 == Long.MAX_VALUE ? -9223372036854775807L : j16;
        k05 y = y(xmlPullParser, X3.i.I0, cVar != null ? cVar.k : null);
        k05 y2 = y(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, cVar != null ? cVar.j : null);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "Initialization")) {
                rwe0Var = p(xmlPullParser, "sourceURL", "range");
            } else if (o19.n(xmlPullParser, "SegmentTimeline")) {
                list2 = w(xmlPullParser, j8, j2);
            } else {
                c(xmlPullParser);
            }
        } while (!o19.m(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (rwe0Var == null) {
                rwe0Var = cVar.a;
            }
            if (list2 == null) {
                list2 = cVar.f;
            }
        }
        return new o4i0.c(rwe0Var, j8, j10, j14, j15, j12, list2, j17, y2, y, y2r0.S(j5), y2r0.S(j));
    }

    public static ArrayList w(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        ArrayList arrayList = new ArrayList();
        long j4 = 0;
        long j5 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long parseLong = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z) {
                    int i2 = i;
                    j3 = parseLong;
                    j4 = b(arrayList, j4, j5, i2, j3);
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
                c(xmlPullParser);
            }
        } while (!o19.m(xmlPullParser, "SegmentTimeline"));
        if (z) {
            String str = y2r0.a;
            b(arrayList, j4, j5, i, y2r0.d0(j2, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static voi0 x(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f2 = -3.4028235E38f;
        float f3 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "Latency")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "target");
                j = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                String attributeValue2 = xmlPullParser.getAttributeValue(null, UcumUtils.UCUM_MINUTES);
                j2 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, InneractiveMediationNameConsts.MAX);
                j3 = attributeValue3 == null ? -9223372036854775807L : Long.parseLong(attributeValue3);
            } else if (o19.n(xmlPullParser, "PlaybackRate")) {
                String attributeValue4 = xmlPullParser.getAttributeValue(null, UcumUtils.UCUM_MINUTES);
                f2 = attributeValue4 == null ? -3.4028235E38f : Float.parseFloat(attributeValue4);
                String attributeValue5 = xmlPullParser.getAttributeValue(null, InneractiveMediationNameConsts.MAX);
                f3 = attributeValue5 == null ? -3.4028235E38f : Float.parseFloat(attributeValue5);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f4 = f2;
            float f5 = f3;
            if (o19.m(xmlPullParser, "ServiceDescription")) {
                return new voi0(j4, j5, j6, f4, f5);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f2 = f4;
            f3 = f5;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00ff. Please report as an issue. */
    @Nullable
    public static k05 y(XmlPullParser xmlPullParser, String str, @Nullable k05 k05Var) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return k05Var;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int i = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            if (indexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i));
                i = attributeValue.length();
            } else if (indexOf != i) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(i, indexOf));
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                i += 2;
            } else {
                arrayList3.add("");
                int i2 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i2);
                String substring = attributeValue.substring(i2, indexOf2);
                if (substring.equals("RepresentationID")) {
                    arrayList2.add(1);
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
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, str2);
                }
                arrayList.add("");
                i = indexOf2 + 1;
            }
        }
        return new k05(arrayList, arrayList2, arrayList3);
    }

    @Override // androidx.media3.exoplayer.upstream.c.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public rsk a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return m(newPullParser, uri);
            }
            throw ParserException.b(null, "inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw ParserException.b(e2, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01fc A[LOOP:1: B:35:0x00cd->B:44:0x01fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rsk m(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        boolean z;
        boolean z2;
        long j;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j2;
        ArrayList arrayList3;
        Uri uri2;
        ArrayList arrayList4;
        boolean z3;
        p1e0 p1e0Var;
        wak wakVar;
        String[] strArr = new String[0];
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(StringUtils.COMMA);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                z2 = false;
                break;
            }
            if (strArr[i].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                z2 = true;
                break;
            }
            i++;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long j3 = C.TIME_UNSET;
        long V = attributeValue2 == null ? -9223372036854775807L : y2r0.V(attributeValue2);
        long k = k(xmlPullParser, "mediaPresentationDuration", C.TIME_UNSET);
        long k2 = k(xmlPullParser, "minBufferTime", C.TIME_UNSET);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long k3 = equals ? k(xmlPullParser, "minimumUpdatePeriod", C.TIME_UNSET) : -9223372036854775807L;
        long k4 = equals ? k(xmlPullParser, "timeShiftBufferDepth", C.TIME_UNSET) : -9223372036854775807L;
        long k5 = equals ? k(xmlPullParser, "suggestedPresentationDelay", C.TIME_UNSET) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long V2 = attributeValue3 == null ? -9223372036854775807L : y2r0.V(attributeValue3);
        long j4 = equals ? 0L : -9223372036854775807L;
        ArrayList d2 = qhz.d(new tp6(uri.toString(), uri.toString(), z2 ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j5 = j4;
        p1e0 p1e0Var2 = null;
        wak wakVar2 = null;
        Uri uri3 = null;
        voi0 voi0Var = null;
        boolean z4 = false;
        boolean z5 = false;
        long j6 = equals ? -9223372036854775807L : 0L;
        while (true) {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "BaseURL")) {
                if (!z5) {
                    j5 = f(xmlPullParser, j5);
                    z5 = z;
                }
                arrayList6.addAll(g(xmlPullParser, d2, z2));
            } else if (o19.n(xmlPullParser, "ProgramInformation")) {
                p1e0Var2 = o(xmlPullParser);
            } else if (o19.n(xmlPullParser, "UTCTiming")) {
                j = j3;
                arrayList2 = arrayList6;
                p1e0Var = p1e0Var2;
                uri2 = uri3;
                arrayList3 = arrayList5;
                wakVar = new wak(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"), 2);
                arrayList = d2;
                z3 = true;
                if (!o19.m(xmlPullParser, "MPD")) {
                    if (k == j) {
                        if (j6 != j) {
                            k = j6;
                        } else if (!equals) {
                            throw ParserException.b(null, "Unable to determine duration of static manifest.");
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        throw ParserException.b(null, "No periods found.");
                    }
                    return new rsk(V, k, k2, equals, k3, k4, k5, V2, p1e0Var, wakVar, voi0Var, uri2, arrayList3);
                }
                ArrayList arrayList7 = arrayList;
                z = z3;
                d2 = arrayList7;
                arrayList5 = arrayList3;
                arrayList6 = arrayList2;
                p1e0Var2 = p1e0Var;
                wakVar2 = wakVar;
                uri3 = uri2;
                j3 = j;
            } else {
                j = j3;
                if (o19.n(xmlPullParser, "Location")) {
                    uri3 = neq0.d(uri.toString(), xmlPullParser.nextText());
                } else if (o19.n(xmlPullParser, "ServiceDescription")) {
                    voi0Var = x(xmlPullParser);
                } else {
                    if (!o19.n(xmlPullParser, "Period") || z4) {
                        arrayList = d2;
                        arrayList2 = arrayList6;
                        j2 = j5;
                        arrayList3 = arrayList5;
                        c(xmlPullParser);
                    } else {
                        if (arrayList6.isEmpty()) {
                            arrayList4 = d2;
                            arrayList = arrayList4;
                            arrayList2 = arrayList6;
                        } else {
                            arrayList = d2;
                            arrayList4 = arrayList6;
                            arrayList2 = arrayList4;
                        }
                        j2 = j5;
                        long j7 = V;
                        arrayList3 = arrayList5;
                        Pair n = n(xmlPullParser, arrayList4, j6, j2, j7, k4, z2);
                        V = j7;
                        jx90 jx90Var = (jx90) n.first;
                        if (jx90Var.b != j) {
                            long longValue = ((Long) n.second).longValue();
                            j6 = longValue == j ? j : jx90Var.b + longValue;
                            arrayList3.add(jx90Var);
                        } else {
                            if (!equals) {
                                throw ParserException.b(null, "Unable to determine start of period " + arrayList3.size());
                            }
                            z4 = true;
                        }
                    }
                    j5 = j2;
                    uri2 = uri3;
                    z3 = true;
                    wakVar = wakVar2;
                    p1e0Var = p1e0Var2;
                    if (!o19.m(xmlPullParser, "MPD")) {
                    }
                }
                arrayList = d2;
                arrayList2 = arrayList6;
                uri2 = uri3;
                arrayList3 = arrayList5;
                z3 = true;
                wakVar = wakVar2;
                p1e0Var = p1e0Var2;
                if (!o19.m(xmlPullParser, "MPD")) {
                }
            }
            boolean z6 = z;
            arrayList = d2;
            z3 = z6;
            j = j3;
            uri2 = uri3;
            arrayList3 = arrayList5;
            arrayList2 = arrayList6;
            wakVar = wakVar2;
            p1e0Var = p1e0Var2;
            if (!o19.m(xmlPullParser, "MPD")) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Pair n(XmlPullParser xmlPullParser, ArrayList arrayList, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        String str;
        String str2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j5;
        ArrayList arrayList4;
        Object obj;
        long j6;
        long j7;
        long j8;
        long j9;
        ArrayList arrayList5;
        ByteArrayOutputStream byteArrayOutputStream;
        long j10;
        ArrayList arrayList6;
        long j11;
        ArrayList arrayList7;
        String str3;
        String str4;
        ArrayList arrayList8;
        int i;
        String str5;
        String str6;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        long j12;
        String str7;
        ArrayList arrayList12;
        int i2;
        String str8;
        long j13;
        int i3;
        ArrayList arrayList13;
        String str9;
        String str10;
        String str11;
        int i4;
        String str12;
        ArrayList arrayList14;
        long j14;
        ArrayList arrayList15;
        String str13;
        String str14;
        ArrayList arrayList16;
        ArrayList arrayList17;
        wsk wskVar;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList18;
        int i5;
        ArrayList arrayList19;
        ArrayList arrayList20;
        String str18;
        String str19;
        ArrayList arrayList21;
        ArrayList arrayList22;
        long j15;
        int i6;
        float f2;
        int i7;
        String str20;
        boolean z2;
        long j16;
        Object aVar;
        String str21;
        ArrayList arrayList23;
        String str22;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        boolean z3 = z;
        Object obj2 = null;
        String str23 = "id";
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long k = k(xmlPullParser2, "start", j);
        long j17 = C.TIME_UNSET;
        long j18 = j3 != C.TIME_UNSET ? j3 + k : -9223372036854775807L;
        String str24 = "duration";
        long k2 = k(xmlPullParser2, "duration", C.TIME_UNSET);
        ArrayList arrayList24 = new ArrayList();
        ArrayList arrayList25 = new ArrayList();
        ArrayList arrayList26 = new ArrayList();
        long j19 = j2;
        o4i0 o4i0Var = null;
        long j20 = -9223372036854775807L;
        boolean z4 = false;
        while (true) {
            xmlPullParser2.next();
            String str25 = "BaseURL";
            if (o19.n(xmlPullParser2, "BaseURL")) {
                if (!z4) {
                    j19 = f(xmlPullParser2, j19);
                    z4 = true;
                }
                arrayList26.addAll(g(xmlPullParser2, arrayList, z3));
                obj = obj2;
                str = str23;
                j8 = j17;
                str2 = str24;
                arrayList4 = arrayList24;
                arrayList2 = arrayList25;
                arrayList3 = arrayList26;
                j7 = j18;
                j6 = k2;
            } else {
                String str26 = "SegmentTemplate";
                String str27 = "SegmentList";
                if (o19.n(xmlPullParser2, "AdaptationSet")) {
                    ArrayList arrayList27 = !arrayList26.isEmpty() ? arrayList26 : arrayList;
                    String attributeValue2 = xmlPullParser2.getAttributeValue(null, str23);
                    long parseLong = attributeValue2 == null ? -1L : Long.parseLong(attributeValue2);
                    int i8 = i(xmlPullParser2);
                    String str28 = "SegmentBase";
                    String attributeValue3 = xmlPullParser2.getAttributeValue(null, RTCStatsConstants.KEY_MIME_TYPE);
                    String attributeValue4 = xmlPullParser2.getAttributeValue(null, "codecs");
                    String str29 = str23;
                    String attributeValue5 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalCodecs");
                    String attributeValue6 = xmlPullParser2.getAttributeValue(null, "scte214:supplementalProfiles");
                    String attributeValue7 = xmlPullParser2.getAttributeValue(null, "width");
                    int parseInt = attributeValue7 == null ? -1 : Integer.parseInt(attributeValue7);
                    String attributeValue8 = xmlPullParser2.getAttributeValue(null, "height");
                    int parseInt2 = attributeValue8 == null ? -1 : Integer.parseInt(attributeValue8);
                    float l = l(xmlPullParser2, -1.0f);
                    int i9 = parseInt2;
                    String attributeValue9 = xmlPullParser2.getAttributeValue(null, "audioSamplingRate");
                    int parseInt3 = attributeValue9 == null ? -1 : Integer.parseInt(attributeValue9);
                    String str30 = "lang";
                    String attributeValue10 = xmlPullParser2.getAttributeValue(null, "lang");
                    String attributeValue11 = xmlPullParser2.getAttributeValue(null, "label");
                    ArrayList arrayList28 = new ArrayList();
                    ArrayList arrayList29 = new ArrayList();
                    String str31 = attributeValue11;
                    ArrayList arrayList30 = new ArrayList();
                    ArrayList arrayList31 = new ArrayList();
                    String str32 = "AdaptationSet";
                    ArrayList arrayList32 = new ArrayList();
                    String str33 = str24;
                    ArrayList arrayList33 = new ArrayList();
                    ArrayList arrayList34 = arrayList24;
                    ArrayList arrayList35 = new ArrayList();
                    ArrayList arrayList36 = arrayList25;
                    ArrayList arrayList37 = new ArrayList();
                    ArrayList arrayList38 = new ArrayList();
                    j5 = j19;
                    int i10 = parseInt;
                    float f3 = l;
                    String str34 = attributeValue10;
                    boolean z5 = false;
                    o4i0 o4i0Var2 = o4i0Var;
                    long j21 = j20;
                    int i11 = -1;
                    ArrayList arrayList39 = arrayList26;
                    int i12 = i8;
                    String str35 = null;
                    while (true) {
                        xmlPullParser2.next();
                        if (o19.n(xmlPullParser2, str25)) {
                            if (!z5) {
                                j19 = f(xmlPullParser2, j19);
                                z5 = true;
                            }
                            long j22 = j19;
                            arrayList38.addAll(g(xmlPullParser2, arrayList27, z3));
                            ArrayList arrayList40 = arrayList28;
                            arrayList12 = arrayList27;
                            arrayList15 = arrayList40;
                            str12 = str26;
                            str3 = attributeValue6;
                            str9 = attributeValue4;
                            str13 = str30;
                            arrayList8 = arrayList29;
                            j7 = j18;
                            str = str29;
                            j13 = j21;
                            i = parseInt3;
                            str5 = str31;
                            arrayList14 = arrayList30;
                            str2 = str33;
                            arrayList4 = arrayList34;
                            arrayList2 = arrayList36;
                            arrayList9 = arrayList31;
                            arrayList11 = arrayList35;
                            str7 = str25;
                            i3 = i10;
                            arrayList3 = arrayList39;
                            str14 = str32;
                            arrayList10 = arrayList33;
                            str8 = str34;
                            arrayList13 = arrayList32;
                            j6 = k2;
                            str11 = str27;
                            str10 = str28;
                            arrayList7 = arrayList38;
                            j12 = j22;
                        } else {
                            if (o19.n(xmlPullParser2, "ContentProtection")) {
                                Pair h = h(xmlPullParser2);
                                arrayList7 = arrayList38;
                                Object obj3 = h.first;
                                if (obj3 != null) {
                                    str35 = (String) obj3;
                                }
                                Object obj4 = h.second;
                                if (obj4 != null) {
                                    arrayList29.add((DrmInitData.SchemeData) obj4);
                                }
                                ArrayList arrayList41 = arrayList28;
                                arrayList12 = arrayList27;
                                arrayList15 = arrayList41;
                                str12 = str26;
                                str3 = attributeValue6;
                                str9 = attributeValue4;
                                arrayList8 = arrayList29;
                                str = str29;
                                j13 = j21;
                                i = parseInt3;
                                str5 = str31;
                                str2 = str33;
                                arrayList4 = arrayList34;
                                arrayList2 = arrayList36;
                            } else {
                                arrayList7 = arrayList38;
                                if (o19.n(xmlPullParser2, "ContentComponent")) {
                                    String attributeValue12 = xmlPullParser2.getAttributeValue(null, str30);
                                    if (str34 == null) {
                                        str34 = attributeValue12;
                                    } else if (attributeValue12 != null) {
                                        fxc0.z(str34.equals(attributeValue12));
                                    }
                                    int i13 = i(xmlPullParser2);
                                    if (i12 == -1) {
                                        i12 = i13;
                                    } else if (i13 != -1) {
                                        fxc0.z(i12 == i13);
                                    }
                                    ArrayList arrayList42 = arrayList28;
                                    arrayList12 = arrayList27;
                                    arrayList15 = arrayList42;
                                    str12 = str26;
                                    str3 = attributeValue6;
                                    str9 = attributeValue4;
                                    arrayList8 = arrayList29;
                                } else {
                                    if (o19.n(xmlPullParser2, "Role")) {
                                        arrayList32.add(j(xmlPullParser2, "Role"));
                                    } else if (o19.n(xmlPullParser2, "AudioChannelConfiguration")) {
                                        ArrayList arrayList43 = arrayList28;
                                        arrayList12 = arrayList27;
                                        arrayList15 = arrayList43;
                                        str12 = str26;
                                        str3 = attributeValue6;
                                        str9 = attributeValue4;
                                        arrayList8 = arrayList29;
                                        i11 = e(xmlPullParser2, attributeValue4);
                                    } else if (o19.n(xmlPullParser2, "Accessibility")) {
                                        arrayList31.add(j(xmlPullParser2, "Accessibility"));
                                    } else if (o19.n(xmlPullParser2, "EssentialProperty")) {
                                        arrayList33.add(j(xmlPullParser2, "EssentialProperty"));
                                    } else if (o19.n(xmlPullParser2, "SupplementalProperty")) {
                                        arrayList35.add(j(xmlPullParser2, "SupplementalProperty"));
                                    } else {
                                        if (o19.n(xmlPullParser2, "Representation")) {
                                            str4 = str30;
                                            if (arrayList7.isEmpty()) {
                                                arrayList16 = arrayList27;
                                                arrayList17 = arrayList28;
                                                arrayList12 = arrayList16;
                                                wskVar = this;
                                                str15 = str26;
                                                str16 = str27;
                                                str17 = str28;
                                                arrayList8 = arrayList29;
                                                arrayList18 = arrayList33;
                                                i5 = i10;
                                                str = str29;
                                                str5 = str31;
                                                arrayList19 = arrayList30;
                                                str6 = str32;
                                                str2 = str33;
                                                arrayList4 = arrayList34;
                                                arrayList2 = arrayList36;
                                                arrayList20 = arrayList37;
                                                str18 = attributeValue3;
                                                str19 = attributeValue5;
                                                arrayList21 = arrayList31;
                                                arrayList22 = arrayList35;
                                                j15 = j19;
                                                str7 = str25;
                                                i6 = parseInt3;
                                                arrayList3 = arrayList39;
                                                f2 = f3;
                                                i7 = i11;
                                                str20 = attributeValue6;
                                                z2 = z;
                                            } else {
                                                arrayList17 = arrayList28;
                                                arrayList16 = arrayList7;
                                                arrayList12 = arrayList27;
                                                wskVar = this;
                                                str15 = str26;
                                                str16 = str27;
                                                str17 = str28;
                                                arrayList8 = arrayList29;
                                                arrayList18 = arrayList33;
                                                i5 = i10;
                                                str = str29;
                                                str5 = str31;
                                                arrayList19 = arrayList30;
                                                str6 = str32;
                                                str2 = str33;
                                                arrayList4 = arrayList34;
                                                arrayList2 = arrayList36;
                                                arrayList20 = arrayList37;
                                                str18 = attributeValue3;
                                                str19 = attributeValue5;
                                                arrayList22 = arrayList35;
                                                j15 = j19;
                                                str7 = str25;
                                                i6 = parseInt3;
                                                arrayList3 = arrayList39;
                                                f2 = f3;
                                                i7 = i11;
                                                str20 = attributeValue6;
                                                z2 = z;
                                                arrayList21 = arrayList31;
                                            }
                                            String str36 = attributeValue4;
                                            XmlPullParser xmlPullParser3 = xmlPullParser2;
                                            int i14 = i12;
                                            int i15 = i9;
                                            a q = wskVar.q(xmlPullParser3, arrayList16, str18, str36, str19, str20, i5, i15, f2, i7, i6, str34, arrayList32, arrayList21, arrayList18, arrayList22, o4i0Var2, j18, k2, j15, j21, j4, z2);
                                            i9 = i15;
                                            f3 = f2;
                                            str8 = str34;
                                            arrayList9 = arrayList21;
                                            arrayList10 = arrayList18;
                                            arrayList11 = arrayList22;
                                            String str37 = str18;
                                            String str38 = str19;
                                            str3 = str20;
                                            arrayList13 = arrayList32;
                                            j6 = k2;
                                            j13 = j21;
                                            i3 = i5;
                                            int i16 = i7;
                                            j12 = j15;
                                            i = i6;
                                            i12 = io20.i(q.a.n);
                                            if (i14 != -1) {
                                                if (i12 != -1) {
                                                    fxc0.z(i14 == i12);
                                                }
                                                i12 = i14;
                                            }
                                            ArrayList arrayList44 = arrayList20;
                                            arrayList44.add(q);
                                            xmlPullParser2 = xmlPullParser3;
                                            arrayList37 = arrayList44;
                                            attributeValue3 = str37;
                                            str9 = str36;
                                            attributeValue5 = str38;
                                            j7 = j18;
                                            i11 = i16;
                                            arrayList15 = arrayList17;
                                            arrayList14 = arrayList19;
                                            str12 = str15;
                                            str11 = str16;
                                            str10 = str17;
                                        } else {
                                            String str39 = str26;
                                            String str40 = str27;
                                            str3 = attributeValue6;
                                            str4 = str30;
                                            arrayList8 = arrayList29;
                                            str = str29;
                                            i = parseInt3;
                                            ArrayList arrayList45 = arrayList28;
                                            str5 = str31;
                                            ArrayList arrayList46 = arrayList30;
                                            str6 = str32;
                                            str2 = str33;
                                            arrayList4 = arrayList34;
                                            arrayList2 = arrayList36;
                                            String str41 = str28;
                                            XmlPullParser xmlPullParser4 = xmlPullParser2;
                                            arrayList9 = arrayList31;
                                            arrayList10 = arrayList33;
                                            arrayList11 = arrayList35;
                                            int i17 = i12;
                                            j12 = j19;
                                            str7 = str25;
                                            arrayList12 = arrayList27;
                                            j6 = k2;
                                            arrayList3 = arrayList39;
                                            ArrayList arrayList47 = arrayList37;
                                            i2 = i11;
                                            String str42 = attributeValue5;
                                            str8 = str34;
                                            String str43 = attributeValue3;
                                            ArrayList arrayList48 = arrayList32;
                                            String str44 = attributeValue4;
                                            j13 = j21;
                                            i3 = i10;
                                            arrayList13 = arrayList48;
                                            if (o19.n(xmlPullParser4, str41)) {
                                                o4i0Var2 = t(xmlPullParser4, (o4i0.e) o4i0Var2);
                                                i12 = i17;
                                                xmlPullParser2 = xmlPullParser4;
                                                arrayList37 = arrayList47;
                                                attributeValue3 = str43;
                                                str9 = str44;
                                                attributeValue5 = str42;
                                                i11 = i2;
                                                arrayList15 = arrayList45;
                                                arrayList14 = arrayList46;
                                                str12 = str39;
                                                str11 = str40;
                                                str14 = str6;
                                                str13 = str4;
                                                str10 = str41;
                                                j7 = j18;
                                            } else if (o19.n(xmlPullParser4, str40)) {
                                                long f4 = f(xmlPullParser4, j13);
                                                arrayList37 = arrayList47;
                                                attributeValue3 = str43;
                                                str9 = str44;
                                                attributeValue5 = str42;
                                                str11 = str40;
                                                str10 = str41;
                                                long j23 = j18;
                                                xmlPullParser2 = xmlPullParser4;
                                                o4i0Var2 = u(xmlPullParser2, (o4i0.b) o4i0Var2, j23, j6, j12, f4, j4);
                                                j6 = j6;
                                                j7 = j23;
                                                j13 = f4;
                                                j12 = j12;
                                                i12 = i17;
                                                i11 = i2;
                                                arrayList15 = arrayList45;
                                                arrayList14 = arrayList46;
                                                str12 = str39;
                                            } else {
                                                arrayList37 = arrayList47;
                                                attributeValue3 = str43;
                                                str9 = str44;
                                                attributeValue5 = str42;
                                                str10 = str41;
                                                str11 = str40;
                                                long j24 = j18;
                                                i4 = i17;
                                                xmlPullParser2 = xmlPullParser4;
                                                j7 = j24;
                                                if (o19.n(xmlPullParser2, str39)) {
                                                    j12 = j12;
                                                    long f5 = f(xmlPullParser2, j13);
                                                    str12 = str39;
                                                    o4i0Var2 = v(xmlPullParser2, (o4i0.c) o4i0Var2, arrayList11, j7, j6, j12, f5, j4);
                                                    j13 = f5;
                                                    i12 = i4;
                                                    i11 = i2;
                                                    arrayList15 = arrayList45;
                                                    arrayList14 = arrayList46;
                                                } else {
                                                    str12 = str39;
                                                    j12 = j12;
                                                    if (o19.n(xmlPullParser2, "InbandEventStream")) {
                                                        arrayList14 = arrayList46;
                                                        arrayList14.add(j(xmlPullParser2, "InbandEventStream"));
                                                        j14 = j13;
                                                        arrayList15 = arrayList45;
                                                        str13 = str4;
                                                    } else {
                                                        arrayList14 = arrayList46;
                                                        if (o19.n(xmlPullParser2, "Label")) {
                                                            str13 = str4;
                                                            String attributeValue13 = xmlPullParser2.getAttributeValue(null, str13);
                                                            String str45 = "";
                                                            while (true) {
                                                                xmlPullParser2.next();
                                                                j14 = j13;
                                                                if (xmlPullParser2.getEventType() == 4) {
                                                                    str45 = xmlPullParser2.getText();
                                                                } else {
                                                                    c(xmlPullParser2);
                                                                }
                                                                String str46 = str45;
                                                                if (o19.m(xmlPullParser2, "Label")) {
                                                                    arrayList15 = arrayList45;
                                                                    arrayList15.add(new zky(attributeValue13, str46));
                                                                } else {
                                                                    str45 = str46;
                                                                    j13 = j14;
                                                                }
                                                            }
                                                        } else {
                                                            j14 = j13;
                                                            arrayList15 = arrayList45;
                                                            str13 = str4;
                                                            if (xmlPullParser2.getEventType() == 2) {
                                                                c(xmlPullParser2);
                                                            }
                                                        }
                                                    }
                                                    i12 = i4;
                                                    j13 = j14;
                                                    str14 = str6;
                                                    i11 = i2;
                                                }
                                            }
                                        }
                                        str14 = str6;
                                        str13 = str4;
                                    }
                                    ArrayList arrayList49 = arrayList28;
                                    arrayList12 = arrayList27;
                                    arrayList15 = arrayList49;
                                    str12 = str26;
                                    str3 = attributeValue6;
                                    str9 = attributeValue4;
                                    arrayList8 = arrayList29;
                                    str = str29;
                                    i = parseInt3;
                                    str5 = str31;
                                    str6 = str32;
                                    str2 = str33;
                                    arrayList4 = arrayList34;
                                    arrayList2 = arrayList36;
                                    arrayList10 = arrayList33;
                                    arrayList11 = arrayList35;
                                    j12 = j19;
                                    str7 = str25;
                                    arrayList3 = arrayList39;
                                    arrayList14 = arrayList30;
                                    str13 = str30;
                                    arrayList9 = arrayList31;
                                    str8 = str34;
                                    j7 = j18;
                                    j6 = k2;
                                    i2 = i11;
                                    str11 = str27;
                                    i4 = i12;
                                    j14 = j21;
                                    i3 = i10;
                                    arrayList13 = arrayList32;
                                    str10 = str28;
                                    i12 = i4;
                                    j13 = j14;
                                    str14 = str6;
                                    i11 = i2;
                                }
                                str = str29;
                                j13 = j21;
                                i = parseInt3;
                                str5 = str31;
                                str2 = str33;
                                arrayList4 = arrayList34;
                                arrayList2 = arrayList36;
                            }
                            arrayList11 = arrayList35;
                            j12 = j19;
                            str7 = str25;
                            i3 = i10;
                            arrayList3 = arrayList39;
                            arrayList14 = arrayList30;
                            str14 = str32;
                            str13 = str30;
                            arrayList9 = arrayList31;
                            arrayList10 = arrayList33;
                            str8 = str34;
                            arrayList13 = arrayList32;
                            j7 = j18;
                            j6 = k2;
                            str11 = str27;
                            str10 = str28;
                        }
                        if (o19.m(xmlPullParser2, str14)) {
                            ArrayList arrayList50 = new ArrayList(arrayList37.size());
                            int i18 = 0;
                            while (i18 < arrayList37.size()) {
                                ArrayList arrayList51 = arrayList37;
                                a aVar2 = (a) arrayList51.get(i18);
                                a.C0043a a2 = aVar2.a.a();
                                String str47 = str5;
                                if (str47 == null || !arrayList15.isEmpty()) {
                                    a2.c = ImmutableList.m(arrayList15);
                                } else {
                                    a2.b = str47;
                                }
                                String str48 = aVar2.d;
                                if (str48 == null) {
                                    str48 = str35;
                                }
                                ArrayList<DrmInitData.SchemeData> arrayList52 = aVar2.e;
                                int i19 = i18;
                                arrayList52.addAll(arrayList8);
                                long j25 = j7;
                                if (arrayList52.isEmpty()) {
                                    j16 = j6;
                                    arrayList37 = arrayList51;
                                } else {
                                    int i20 = 0;
                                    while (true) {
                                        if (i20 < arrayList52.size()) {
                                            DrmInitData.SchemeData schemeData = arrayList52.get(i20);
                                            j16 = j6;
                                            if (!tu8.c.equals(schemeData.c) || (str22 = schemeData.d) == null) {
                                                i20++;
                                                j6 = j16;
                                            } else {
                                                arrayList52.remove(i20);
                                                str21 = str22;
                                            }
                                        } else {
                                            j16 = j6;
                                            str21 = null;
                                        }
                                    }
                                    if (str21 != null) {
                                        int i21 = 0;
                                        while (i21 < arrayList52.size()) {
                                            DrmInitData.SchemeData schemeData2 = arrayList52.get(i21);
                                            if (tu8.b.equals(schemeData2.c) && schemeData2.d == null) {
                                                arrayList23 = arrayList51;
                                                arrayList52.set(i21, new DrmInitData.SchemeData(tu8.c, str21, schemeData2.e, schemeData2.f));
                                            } else {
                                                arrayList23 = arrayList51;
                                            }
                                            i21++;
                                            arrayList51 = arrayList23;
                                        }
                                    }
                                    arrayList37 = arrayList51;
                                    for (int size = arrayList52.size() - 1; size >= 0; size--) {
                                        DrmInitData.SchemeData schemeData3 = arrayList52.get(size);
                                        if (schemeData3.f == null) {
                                            int i22 = 0;
                                            while (true) {
                                                if (i22 < arrayList52.size()) {
                                                    DrmInitData.SchemeData schemeData4 = arrayList52.get(i22);
                                                    if (schemeData4.f != null && schemeData3.f == null) {
                                                        UUID uuid = schemeData3.c;
                                                        schemeData4.getClass();
                                                        UUID uuid2 = tu8.a;
                                                        UUID uuid3 = schemeData4.c;
                                                        if (uuid2.equals(uuid3) || uuid.equals(uuid3)) {
                                                            arrayList52.remove(size);
                                                        }
                                                    }
                                                    i22++;
                                                }
                                            }
                                        }
                                    }
                                    a2.q = new DrmInitData(str48, arrayList52);
                                }
                                ArrayList<y2m> arrayList53 = aVar2.f;
                                arrayList53.addAll(arrayList14);
                                androidx.media3.common.a aVar3 = new androidx.media3.common.a(a2);
                                ImmutableList<tp6> immutableList = aVar2.b;
                                o4i0 o4i0Var3 = aVar2.c;
                                List<y2m> list = aVar2.h;
                                List<y2m> list2 = aVar2.i;
                                if (o4i0Var3 instanceof o4i0.e) {
                                    aVar = new e7g0.b(aVar3, immutableList, (o4i0.e) o4i0Var3, arrayList53, list, list2);
                                } else {
                                    if (!(o4i0Var3 instanceof o4i0.a)) {
                                        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                    }
                                    aVar = new e7g0.a(aVar3, immutableList, (o4i0.a) o4i0Var3, arrayList53, list, list2);
                                }
                                arrayList50.add(aVar);
                                i18 = i19 + 1;
                                j6 = j16;
                                str5 = str47;
                                j7 = j25;
                            }
                            arrayList4.add(new cj0(parseLong, i12, arrayList50, arrayList9, arrayList10, arrayList11));
                        } else {
                            j18 = j7;
                            long j26 = j13;
                            ArrayList arrayList54 = arrayList12;
                            arrayList28 = arrayList15;
                            arrayList27 = arrayList54;
                            z3 = z;
                            k2 = j6;
                            str27 = str11;
                            str28 = str10;
                            attributeValue6 = str3;
                            arrayList32 = arrayList13;
                            parseInt3 = i;
                            i10 = i3;
                            str34 = str8;
                            arrayList31 = arrayList9;
                            arrayList33 = arrayList10;
                            arrayList39 = arrayList3;
                            arrayList34 = arrayList4;
                            arrayList36 = arrayList2;
                            arrayList29 = arrayList8;
                            str29 = str;
                            j21 = j26;
                            arrayList30 = arrayList14;
                            str30 = str13;
                            str32 = str14;
                            str25 = str7;
                            str31 = str5;
                            attributeValue4 = str9;
                            j19 = j12;
                            arrayList35 = arrayList11;
                            arrayList38 = arrayList7;
                            str33 = str2;
                            str26 = str12;
                        }
                    }
                } else {
                    str = str23;
                    str2 = str24;
                    ArrayList arrayList55 = arrayList24;
                    arrayList2 = arrayList25;
                    arrayList3 = arrayList26;
                    j5 = j19;
                    long j27 = k2;
                    if (o19.n(xmlPullParser2, "EventStream")) {
                        String attributeValue14 = xmlPullParser2.getAttributeValue(null, "schemeIdUri");
                        String str49 = attributeValue14 == null ? "" : attributeValue14;
                        String attributeValue15 = xmlPullParser2.getAttributeValue(null, "value");
                        String str50 = attributeValue15 == null ? "" : attributeValue15;
                        String attributeValue16 = xmlPullParser2.getAttributeValue(null, "timescale");
                        long parseLong2 = attributeValue16 == null ? 1L : Long.parseLong(attributeValue16);
                        String attributeValue17 = xmlPullParser2.getAttributeValue(null, "presentationTimeOffset");
                        long parseLong3 = attributeValue17 == null ? 0L : Long.parseLong(attributeValue17);
                        ArrayList arrayList56 = new ArrayList();
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
                        while (true) {
                            xmlPullParser2.next();
                            if (o19.n(xmlPullParser2, "Event")) {
                                String str51 = str;
                                String attributeValue18 = xmlPullParser2.getAttributeValue(null, str51);
                                long parseLong4 = attributeValue18 == null ? 0L : Long.parseLong(attributeValue18);
                                String str52 = str2;
                                String attributeValue19 = xmlPullParser2.getAttributeValue(null, str52);
                                long parseLong5 = attributeValue19 == null ? C.TIME_UNSET : Long.parseLong(attributeValue19);
                                String attributeValue20 = xmlPullParser2.getAttributeValue(null, "presentationTime");
                                long parseLong6 = attributeValue20 == null ? 0L : Long.parseLong(attributeValue20);
                                String str53 = y2r0.a;
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                str2 = str52;
                                str = str51;
                                long d0 = y2r0.d0(parseLong5, 1000L, parseLong2, roundingMode);
                                long d02 = y2r0.d0(parseLong6 - parseLong3, 1000000L, parseLong2, roundingMode);
                                j10 = parseLong2;
                                String attributeValue21 = xmlPullParser2.getAttributeValue(null, "messageData");
                                if (attributeValue21 == null) {
                                    attributeValue21 = null;
                                }
                                byteArrayOutputStream2.reset();
                                XmlSerializer newSerializer = Xml.newSerializer();
                                newSerializer.setOutput(byteArrayOutputStream2, StandardCharsets.UTF_8.name());
                                xmlPullParser2.nextToken();
                                while (!o19.m(xmlPullParser2, "Event")) {
                                    switch (xmlPullParser2.getEventType()) {
                                        case 0:
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            newSerializer.startDocument(null, Boolean.FALSE);
                                            break;
                                        case 1:
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            newSerializer.endDocument();
                                            break;
                                        case 2:
                                            arrayList6 = arrayList55;
                                            newSerializer.startTag(xmlPullParser2.getNamespace(), xmlPullParser2.getName());
                                            int i23 = 0;
                                            while (i23 < xmlPullParser2.getAttributeCount()) {
                                                newSerializer.attribute(xmlPullParser2.getAttributeNamespace(i23), xmlPullParser2.getAttributeName(i23), xmlPullParser2.getAttributeValue(i23));
                                                i23++;
                                                parseLong3 = parseLong3;
                                            }
                                            j11 = parseLong3;
                                            break;
                                        case 3:
                                            arrayList6 = arrayList55;
                                            newSerializer.endTag(xmlPullParser2.getNamespace(), xmlPullParser2.getName());
                                            j11 = parseLong3;
                                            break;
                                        case 4:
                                            newSerializer.text(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            break;
                                        case 5:
                                            newSerializer.cdsect(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            break;
                                        case 6:
                                            newSerializer.entityRef(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            break;
                                        case 7:
                                            newSerializer.ignorableWhitespace(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            break;
                                        case 8:
                                            newSerializer.processingInstruction(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            break;
                                        case 9:
                                            newSerializer.comment(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            break;
                                        case 10:
                                            newSerializer.docdecl(xmlPullParser2.getText());
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            break;
                                        default:
                                            arrayList6 = arrayList55;
                                            j11 = parseLong3;
                                            break;
                                    }
                                    xmlPullParser2.nextToken();
                                    parseLong3 = j11;
                                    arrayList55 = arrayList6;
                                }
                                arrayList4 = arrayList55;
                                j9 = parseLong3;
                                newSerializer.flush();
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                Long valueOf = Long.valueOf(d02);
                                if (attributeValue21 != null) {
                                    byteArray = attributeValue21.getBytes(StandardCharsets.UTF_8);
                                }
                                byte[] bArr = byteArray;
                                arrayList5 = arrayList56;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                arrayList5.add(Pair.create(valueOf, new g0q(str49, str50, d0, parseLong4, bArr)));
                            } else {
                                arrayList4 = arrayList55;
                                j9 = parseLong3;
                                arrayList5 = arrayList56;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                j10 = parseLong2;
                                c(xmlPullParser2);
                            }
                            if (o19.m(xmlPullParser2, "EventStream")) {
                                long[] jArr = new long[arrayList5.size()];
                                g0q[] g0qVarArr = new g0q[arrayList5.size()];
                                for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                                    Pair pair = (Pair) arrayList5.get(i24);
                                    jArr[i24] = ((Long) pair.first).longValue();
                                    g0qVarArr[i24] = (g0q) pair.second;
                                }
                                arrayList2.add(new r0q(str49, str50, jArr, g0qVarArr));
                                j6 = j27;
                                j7 = j18;
                            } else {
                                arrayList56 = arrayList5;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                parseLong2 = j10;
                                arrayList55 = arrayList4;
                                parseLong3 = j9;
                            }
                        }
                    } else {
                        arrayList4 = arrayList55;
                        if (o19.n(xmlPullParser2, "SegmentBase")) {
                            obj = null;
                            j6 = j27;
                            o4i0Var = t(xmlPullParser2, null);
                            arrayList2 = arrayList2;
                            j7 = j18;
                            j19 = j5;
                            j8 = C.TIME_UNSET;
                        } else {
                            obj = null;
                            if (o19.n(xmlPullParser2, str27)) {
                                j8 = C.TIME_UNSET;
                                long f6 = f(xmlPullParser2, C.TIME_UNSET);
                                long j28 = j18;
                                j6 = j27;
                                j7 = j28;
                                o4i0Var = u(xmlPullParser2, null, j28, j27, j5, f6, j4);
                                j20 = f6;
                                arrayList2 = arrayList2;
                            } else {
                                j6 = j27;
                                j7 = j18;
                                j8 = C.TIME_UNSET;
                                if (o19.n(xmlPullParser2, str26)) {
                                    long f7 = f(xmlPullParser2, C.TIME_UNSET);
                                    ImmutableList.b bVar = ImmutableList.c;
                                    arrayList2 = arrayList2;
                                    o4i0Var = v(xmlPullParser2, null, com.google.common.collect.g.f, j7, j6, j5, f7, j4);
                                    j20 = f7;
                                } else {
                                    arrayList2 = arrayList2;
                                    if (o19.n(xmlPullParser2, "AssetIdentifier")) {
                                        j(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        c(xmlPullParser2);
                                    }
                                }
                            }
                            j19 = j5;
                        }
                    }
                }
                j8 = C.TIME_UNSET;
                obj = null;
                j19 = j5;
            }
            if (o19.m(xmlPullParser2, "Period")) {
                return Pair.create(new jx90(attributeValue, k, arrayList4, arrayList2), Long.valueOf(j6));
            }
            z3 = z;
            j18 = j7;
            k2 = j6;
            j17 = j8;
            obj2 = obj;
            arrayList26 = arrayList3;
            arrayList24 = arrayList4;
            arrayList25 = arrayList2;
            str24 = str2;
            str23 = str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0274, code lost:
    
        if (com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_E_AC3_JOC.equals(r0) != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0512 A[LOOP:0: B:24:0x00a3->B:33:0x0512, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ea A[EDGE_INSN: B:34:0x01ea->B:35:0x01ea BREAK  A[LOOP:0: B:24:0x00a3->B:33:0x0512], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a q(XmlPullParser xmlPullParser, ArrayList arrayList, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, float f2, int i3, int i4, @Nullable String str5, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, @Nullable o4i0 o4i0Var, long j, long j2, long j3, long j4, long j5, boolean z) throws XmlPullParserException, IOException {
        String str6;
        String str7;
        int i5;
        ArrayList arrayList6;
        String str8;
        float f3;
        int i6;
        ArrayList arrayList7;
        int i7;
        int i8;
        String str9;
        ArrayList arrayList8;
        int i9;
        ArrayList arrayList9;
        String str10;
        ArrayList arrayList10;
        int i10;
        String str11;
        String str12;
        String k;
        String str13;
        String str14;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Pair pair;
        int parseInt;
        String str15;
        int i16;
        int i17;
        int i18;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "bandwidth");
        int parseInt2 = attributeValue2 == null ? -1 : Integer.parseInt(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, RTCStatsConstants.KEY_MIME_TYPE);
        if (attributeValue3 == null) {
            attributeValue3 = str;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "codecs");
        if (attributeValue4 == null) {
            attributeValue4 = str2;
        }
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "scte214:supplementalCodecs");
        if (attributeValue5 == null) {
            attributeValue5 = str3;
        }
        xmlPullParser.getAttributeValue(null, "scte214:supplementalProfiles");
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "width");
        int parseInt3 = attributeValue6 == null ? i : Integer.parseInt(attributeValue6);
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "height");
        int parseInt4 = attributeValue7 == null ? i2 : Integer.parseInt(attributeValue7);
        float l = l(xmlPullParser, f2);
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "audioSamplingRate");
        int parseInt5 = attributeValue8 == null ? i4 : Integer.parseInt(attributeValue8);
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(arrayList4);
        String str16 = attributeValue;
        ArrayList arrayList14 = arrayList5;
        ArrayList arrayList15 = new ArrayList(arrayList14);
        ArrayList arrayList16 = new ArrayList();
        int i19 = i3;
        o4i0 o4i0Var2 = o4i0Var;
        int i20 = parseInt2;
        ArrayList arrayList17 = arrayList15;
        int i21 = parseInt3;
        int i22 = parseInt4;
        boolean z2 = false;
        String str17 = null;
        long j6 = j3;
        long j7 = j4;
        while (true) {
            xmlPullParser.next();
            str6 = attributeValue3;
            if (o19.n(xmlPullParser, "BaseURL")) {
                if (!z2) {
                    j6 = f(xmlPullParser, j6);
                    z2 = true;
                }
                str7 = attributeValue5;
                i5 = 1;
                arrayList16.addAll(g(xmlPullParser, arrayList, z));
                str8 = attributeValue4;
            } else {
                str7 = attributeValue5;
                i5 = 1;
                if (o19.n(xmlPullParser, "AudioChannelConfiguration")) {
                    i10 = e(xmlPullParser, attributeValue4);
                    str8 = attributeValue4;
                    f3 = l;
                    i6 = parseInt5;
                    arrayList7 = arrayList12;
                    str10 = str16;
                    i7 = i21;
                    i8 = i22;
                    str9 = str7;
                    arrayList10 = arrayList17;
                    arrayList8 = arrayList16;
                    i9 = i20;
                    arrayList9 = arrayList11;
                    if (o19.m(xmlPullParser, "Representation")) {
                        break;
                    }
                    attributeValue3 = str6;
                    arrayList14 = arrayList5;
                    arrayList17 = arrayList10;
                    i19 = i10;
                    arrayList12 = arrayList7;
                    arrayList11 = arrayList9;
                    attributeValue4 = str8;
                    i20 = i9;
                    attributeValue5 = str9;
                    i21 = i7;
                    i22 = i8;
                    l = f3;
                    parseInt5 = i6;
                    str16 = str10;
                    arrayList16 = arrayList8;
                } else if (o19.n(xmlPullParser, "SegmentBase")) {
                    str8 = attributeValue4;
                    o4i0Var2 = t(xmlPullParser, (o4i0.e) o4i0Var2);
                } else {
                    if (o19.n(xmlPullParser, "SegmentList")) {
                        float f4 = l;
                        long f5 = f(xmlPullParser, j7);
                        arrayList6 = arrayList17;
                        str8 = attributeValue4;
                        f3 = f4;
                        arrayList7 = arrayList12;
                        i7 = i21;
                        i8 = i22;
                        i6 = parseInt5;
                        str9 = str7;
                        arrayList8 = arrayList16;
                        i9 = i20;
                        arrayList9 = arrayList11;
                        o4i0Var2 = u(xmlPullParser, (o4i0.b) o4i0Var2, j, j2, j6, f5, j5);
                        j7 = f5;
                        str10 = str16;
                    } else {
                        arrayList6 = arrayList17;
                        str8 = attributeValue4;
                        f3 = l;
                        i6 = parseInt5;
                        arrayList7 = arrayList12;
                        i7 = i21;
                        i8 = i22;
                        str9 = str7;
                        arrayList8 = arrayList16;
                        i9 = i20;
                        arrayList9 = arrayList11;
                        if (o19.n(xmlPullParser, "SegmentTemplate")) {
                            long f6 = f(xmlPullParser, j7);
                            long j8 = j6;
                            str10 = str16;
                            j6 = j8;
                            o4i0Var2 = v(xmlPullParser, (o4i0.c) o4i0Var2, arrayList14, j, j2, j8, f6, j5);
                            j7 = f6;
                        } else {
                            str10 = str16;
                            if (o19.n(xmlPullParser, "ContentProtection")) {
                                Pair h = h(xmlPullParser);
                                Object obj = h.first;
                                if (obj != null) {
                                    str17 = (String) obj;
                                }
                                Object obj2 = h.second;
                                if (obj2 != null) {
                                    arrayList9.add((DrmInitData.SchemeData) obj2);
                                }
                            } else {
                                if (o19.n(xmlPullParser, "InbandEventStream")) {
                                    arrayList7.add(j(xmlPullParser, "InbandEventStream"));
                                } else if (o19.n(xmlPullParser, "EssentialProperty")) {
                                    arrayList13.add(j(xmlPullParser, "EssentialProperty"));
                                } else {
                                    if (o19.n(xmlPullParser, "SupplementalProperty")) {
                                        arrayList10 = arrayList6;
                                        arrayList10.add(j(xmlPullParser, "SupplementalProperty"));
                                    } else {
                                        arrayList10 = arrayList6;
                                        c(xmlPullParser);
                                    }
                                    i10 = i19;
                                    if (o19.m(xmlPullParser, "Representation")) {
                                    }
                                }
                                arrayList10 = arrayList6;
                                i10 = i19;
                                if (o19.m(xmlPullParser, "Representation")) {
                                }
                            }
                        }
                    }
                    i10 = i19;
                    arrayList10 = arrayList6;
                    if (o19.m(xmlPullParser, "Representation")) {
                    }
                }
            }
            f3 = l;
            i6 = parseInt5;
            arrayList7 = arrayList12;
            str10 = str16;
            i10 = i19;
            i7 = i21;
            i8 = i22;
            str9 = str7;
            arrayList10 = arrayList17;
            arrayList8 = arrayList16;
            i9 = i20;
            arrayList9 = arrayList11;
            if (o19.m(xmlPullParser, "Representation")) {
            }
        }
        if (io20.l(str6)) {
            k = io20.b(str8);
        } else {
            if (!io20.p(str6)) {
                if (io20.o(str6) || io20.n(str6)) {
                    str11 = str6;
                    str12 = str11;
                } else {
                    str12 = str6;
                    if (MimeTypes.APPLICATION_MP4.equals(str12)) {
                        str11 = io20.e(str8);
                        if (MimeTypes.TEXT_VTT.equals(str11)) {
                            str11 = MimeTypes.APPLICATION_MP4VTT;
                        }
                    } else {
                        str11 = null;
                    }
                }
                if (MimeTypes.AUDIO_E_AC3.equals(str11)) {
                    while (true) {
                        str13 = "ec+3";
                        if (i18 >= arrayList10.size()) {
                            str11 = MimeTypes.AUDIO_E_AC3;
                            break;
                        }
                        y2m y2mVar = (y2m) arrayList10.get(i18);
                        String str18 = y2mVar.a;
                        String str19 = y2mVar.b;
                        i18 = (("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str18) && "JOC".equals(str19)) || ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str18) && "ec+3".equals(str19))) ? 0 : i18 + 1;
                    }
                    str11 = MimeTypes.AUDIO_E_AC3_JOC;
                }
                str13 = str8;
                str14 = str9;
                if (io20.m(str13, str14)) {
                    if (str14 != null) {
                        str13 = str14;
                    }
                    str11 = "video/dolby-vision";
                }
                int i23 = 0;
                for (i11 = 0; i11 < arrayList2.size(); i11++) {
                    y2m y2mVar2 = (y2m) arrayList2.get(i11);
                    if (o19.h("urn:mpeg:dash:role:2011", y2mVar2.a)) {
                        String str20 = y2mVar2.b;
                        i23 |= (str20 != null && (str20.equals("forced_subtitle") || str20.equals("forced-subtitle"))) ? 2 : 0;
                    }
                }
                int i24 = 0;
                for (i12 = 0; i12 < arrayList2.size(); i12++) {
                    y2m y2mVar3 = (y2m) arrayList2.get(i12);
                    if (o19.h("urn:mpeg:dash:role:2011", y2mVar3.a)) {
                        i24 |= r(y2mVar3.b);
                    }
                }
                i13 = 0;
                int i25 = 0;
                while (i13 < arrayList3.size()) {
                    y2m y2mVar4 = (y2m) arrayList3.get(i13);
                    String str21 = y2mVar4.a;
                    int i26 = i13;
                    String str22 = y2mVar4.b;
                    if (o19.h("urn:mpeg:dash:role:2011", str21)) {
                        i17 = r(str22);
                    } else if (o19.h("urn:tva:metadata:cs:AudioPurposeCS:2007", y2mVar4.a)) {
                        if (str22 != null) {
                            switch (str22.hashCode()) {
                                case 49:
                                    if (str22.equals("1")) {
                                        i16 = 0;
                                        break;
                                    }
                                    i16 = -1;
                                    break;
                                case 50:
                                    if (str22.equals("2")) {
                                        i16 = i5;
                                        break;
                                    }
                                    i16 = -1;
                                    break;
                                case 51:
                                    if (str22.equals("3")) {
                                        i16 = 2;
                                        break;
                                    }
                                    i16 = -1;
                                    break;
                                case 52:
                                    if (str22.equals("4")) {
                                        i16 = 3;
                                        break;
                                    }
                                    i16 = -1;
                                    break;
                                case 53:
                                default:
                                    i16 = -1;
                                    break;
                                case 54:
                                    if (str22.equals("6")) {
                                        i16 = 4;
                                        break;
                                    }
                                    i16 = -1;
                                    break;
                            }
                            switch (i16) {
                                case 0:
                                    i17 = 512;
                                    break;
                                case 1:
                                    i17 = 2048;
                                    break;
                                case 2:
                                    i17 = 4;
                                    break;
                                case 3:
                                    i17 = 8;
                                    break;
                                case 4:
                                    i17 = i5;
                                    break;
                            }
                        }
                        i17 = 0;
                    } else {
                        i13 = i26 + 1;
                    }
                    i25 |= i17;
                    i13 = i26 + 1;
                }
                int s = i24 | i25 | s(arrayList13) | s(arrayList10);
                i14 = 0;
                while (true) {
                    if (i14 >= arrayList13.size()) {
                        y2m y2mVar5 = (y2m) arrayList13.get(i14);
                        if ((o19.h("http://dashif.org/thumbnail_tile", y2mVar5.a) || o19.h("http://dashif.org/guidelines/thumbnail_tile", y2mVar5.a)) && (str15 = y2mVar5.b) != null) {
                            String str23 = y2r0.a;
                            i15 = -1;
                            String[] split = str15.split("x", -1);
                            if (split.length != 2) {
                                continue;
                            } else {
                                try {
                                    pair = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[i5])));
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                        i14++;
                    } else {
                        i15 = -1;
                        pair = null;
                    }
                }
                a.C0043a c0043a = new a.C0043a();
                c0043a.a = str10;
                c0043a.l = io20.q(str12);
                c0043a.m = io20.q(str11);
                c0043a.j = str13;
                c0043a.i = i9;
                c0043a.e = i23;
                c0043a.f = s;
                c0043a.d = str5;
                c0043a.L = pair == null ? ((Integer) pair.first).intValue() : i15;
                c0043a.M = pair == null ? ((Integer) pair.second).intValue() : i15;
                if (io20.p(str11)) {
                    int i27 = i7;
                    int i28 = i8;
                    if (io20.l(str11)) {
                        c0043a.E = i10;
                        c0043a.F = i6;
                    } else if (io20.o(str11)) {
                        if (MimeTypes.APPLICATION_CEA608.equals(str11)) {
                            int i29 = 0;
                            while (i29 < arrayList3.size()) {
                                y2m y2mVar6 = (y2m) arrayList3.get(i29);
                                String str24 = y2mVar6.a;
                                String str25 = y2mVar6.b;
                                if ("urn:scte:dash:cc:cea-608:2015".equals(str24) && str25 != null) {
                                    Matcher matcher = c.matcher(str25);
                                    if (matcher.matches()) {
                                        parseInt = Integer.parseInt(matcher.group(i5));
                                        c0043a.J = parseInt;
                                    } else {
                                        ahn.F("Unable to parse CEA-608 channel number from: ".concat(str25));
                                    }
                                }
                                i29++;
                                i5 = 1;
                            }
                            parseInt = i15;
                            c0043a.J = parseInt;
                        } else {
                            if (MimeTypes.APPLICATION_CEA708.equals(str11)) {
                                for (int i30 = 0; i30 < arrayList3.size(); i30++) {
                                    y2m y2mVar7 = (y2m) arrayList3.get(i30);
                                    String str26 = y2mVar7.a;
                                    String str27 = y2mVar7.b;
                                    if ("urn:scte:dash:cc:cea-708:2015".equals(str26) && str27 != null) {
                                        Matcher matcher2 = d.matcher(str27);
                                        if (matcher2.matches()) {
                                            parseInt = Integer.parseInt(matcher2.group(1));
                                            c0043a.J = parseInt;
                                        } else {
                                            ahn.F("Unable to parse CEA-708 service block number from: ".concat(str27));
                                        }
                                    }
                                }
                            }
                            parseInt = i15;
                            c0043a.J = parseInt;
                        }
                    } else if (io20.n(str11)) {
                        c0043a.t = i27;
                        c0043a.u = i28;
                    }
                } else {
                    c0043a.t = i7;
                    c0043a.u = i8;
                    c0043a.x = f3;
                }
                androidx.media3.common.a aVar = new androidx.media3.common.a(c0043a);
                if (o4i0Var2 == null) {
                    o4i0Var2 = new o4i0.e();
                }
                return new a(aVar, arrayList8.isEmpty() ? arrayList8 : arrayList, o4i0Var2, str17, arrayList9, arrayList7, arrayList13, arrayList10, -1L);
            }
            k = io20.k(str8);
        }
        str11 = k;
        str12 = str6;
        if (MimeTypes.AUDIO_E_AC3.equals(str11)) {
        }
        str13 = str8;
        str14 = str9;
        if (io20.m(str13, str14)) {
        }
        int i232 = 0;
        while (i11 < arrayList2.size()) {
        }
        int i242 = 0;
        while (i12 < arrayList2.size()) {
        }
        i13 = 0;
        int i252 = 0;
        while (i13 < arrayList3.size()) {
        }
        int s2 = i242 | i252 | s(arrayList13) | s(arrayList10);
        i14 = 0;
        while (true) {
            if (i14 >= arrayList13.size()) {
            }
            i14++;
        }
        a.C0043a c0043a2 = new a.C0043a();
        c0043a2.a = str10;
        c0043a2.l = io20.q(str12);
        c0043a2.m = io20.q(str11);
        c0043a2.j = str13;
        c0043a2.i = i9;
        c0043a2.e = i232;
        c0043a2.f = s2;
        c0043a2.d = str5;
        c0043a2.L = pair == null ? ((Integer) pair.first).intValue() : i15;
        c0043a2.M = pair == null ? ((Integer) pair.second).intValue() : i15;
        if (io20.p(str11)) {
        }
        androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0043a2);
        if (o4i0Var2 == null) {
        }
        return new a(aVar2, arrayList8.isEmpty() ? arrayList8 : arrayList, o4i0Var2, str17, arrayList9, arrayList7, arrayList13, arrayList10, -1L);
    }
}
