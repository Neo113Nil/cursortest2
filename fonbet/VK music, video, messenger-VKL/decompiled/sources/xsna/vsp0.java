package xsna;

import android.text.Layout;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.common.collect.ImmutableSet;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.base.TimeUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a1n0;

/* compiled from: TtmlParser.java */
/* loaded from: classes12.dex */
public final class vsp0 implements a1n0 {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final a i = new a(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    /* compiled from: TtmlParser.java */
    public static final class a {
        public final float a;
        public final int b;
        public final int c;

        public a(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    /* compiled from: TtmlParser.java */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public vsp0() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static xsp0 d(@Nullable xsp0 xsp0Var) {
        return xsp0Var == null ? new xsp0() : xsp0Var;
    }

    public static boolean e(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int f(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            ahn.F("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            fxc0.k(parseInt, parseInt2, "Invalid cell resolution %s %s", z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            ahn.F("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void g(String str, xsp0 xsp0Var) throws SubtitleDecoderException {
        Matcher matcher;
        String group;
        String str2 = y2r0.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new SubtitleDecoderException(h5s.c(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            ahn.F("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(zr.a("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                xsp0Var.j = 3;
                break;
            case "em":
                xsp0Var.j = 2;
                break;
            case "px":
                xsp0Var.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(zr.a("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        xsp0Var.k = Float.parseFloat(group2);
    }

    public static a h(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = y2r0.a;
            fxc0.q(attributeValue2.split(" ", -1).length == 2, "frameRateMultiplier doesn't have 2 parts");
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        a aVar = i;
        int i2 = aVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = aVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new a(parseInt * f2, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(XmlPullParser xmlPullParser, HashMap hashMap, int i2, @Nullable b bVar, HashMap hashMap2, HashMap hashMap3) throws IOException, XmlPullParserException {
        String i3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i4;
        String i5;
        int i6;
        wsp0 wsp0Var;
        char c2;
        float parseFloat;
        float parseFloat2;
        String i7;
        xsp0 xsp0Var;
        String i8;
        xsp0 xsp0Var2;
        String[] split;
        do {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String i9 = o19.i(xmlPullParser, TtmlNode.TAG_STYLE);
                xsp0 k = k(xmlPullParser, new xsp0());
                if (i9 != null) {
                    String trim = i9.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str = y2r0.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str2 : split) {
                        k.a((xsp0) hashMap.get(str2));
                    }
                }
                String str3 = k.l;
                if (str3 != null) {
                    hashMap.put(str3, k);
                }
            } else if (o19.n(xmlPullParser, TtmlNode.TAG_REGION)) {
                String i10 = o19.i(xmlPullParser, "id");
                if (i10 != null) {
                    String i11 = o19.i(xmlPullParser, "origin");
                    if (i11 == null && (i8 = o19.i(xmlPullParser, TtmlNode.TAG_STYLE)) != null && (xsp0Var2 = (xsp0) hashMap.get(i8)) != null) {
                        i11 = xsp0Var2.t;
                    }
                    int i12 = 2;
                    Pattern pattern = g;
                    Pattern pattern2 = f;
                    if (i11 != null) {
                        Matcher matcher = pattern2.matcher(i11);
                        Matcher matcher2 = pattern.matcher(i11);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f2 = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f3 = Float.parseFloat(group2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                ahn.F("Ignoring region with malformed origin: ".concat(i11));
                            }
                        } else if (!matcher2.matches()) {
                            ahn.F("Ignoring region with unsupported origin: ".concat(i11));
                        } else if (bVar == null) {
                            ahn.F("Ignoring region with missing tts:extent: ".concat(i11));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                float f7 = parseInt / bVar.a;
                                f3 = Integer.parseInt(group4) / bVar.b;
                                f2 = f7;
                            } catch (NumberFormatException unused2) {
                                ahn.F("Ignoring region with malformed origin: ".concat(i11));
                            }
                        }
                    } else {
                        f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        f3 = 0.0f;
                    }
                    String i13 = o19.i(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                    if (i13 == null && (i7 = o19.i(xmlPullParser, TtmlNode.TAG_STYLE)) != null && (xsp0Var = (xsp0) hashMap.get(i7)) != null) {
                        i13 = xsp0Var.u;
                    }
                    if (i13 != null) {
                        Matcher matcher3 = pattern2.matcher(i13);
                        Matcher matcher4 = pattern.matcher(i13);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / 100.0f;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                xr.a("Ignoring region with malformed extent: ", i11);
                            }
                        } else if (!matcher4.matches()) {
                            xr.a("Ignoring region with unsupported extent: ", i11);
                        } else if (bVar == null) {
                            xr.a("Ignoring region with missing tts:extent: ", i11);
                        } else {
                            String group7 = matcher4.group(1);
                            group7.getClass();
                            int parseInt2 = Integer.parseInt(group7);
                            String group8 = matcher4.group(2);
                            group8.getClass();
                            float f8 = parseInt2 / bVar.a;
                            parseFloat2 = Integer.parseInt(group8) / bVar.b;
                            parseFloat = f8;
                        }
                        f4 = parseFloat;
                        f5 = parseFloat2;
                    } else {
                        f4 = 1.0f;
                        f5 = 1.0f;
                    }
                    String i14 = o19.i(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                    if (i14 != null) {
                        String u = o19.u(i14);
                        u.getClass();
                        if (u.equals(TtmlNode.CENTER)) {
                            f6 = f3 + (f5 / 2.0f);
                            i4 = 1;
                        } else if (u.equals("after")) {
                            f6 = f3 + f5;
                            i4 = 2;
                        }
                        float f9 = 1.0f / i2;
                        i5 = o19.i(xmlPullParser, "writingMode");
                        if (i5 != null) {
                            String u2 = o19.u(i5);
                            u2.getClass();
                            switch (u2.hashCode()) {
                                case 3694:
                                    if (u2.equals("tb")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553396:
                                    if (u2.equals("tblr")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553576:
                                    if (u2.equals("tbrl")) {
                                        c2 = 2;
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
                                    i6 = i12;
                                    break;
                                case 2:
                                    i6 = 1;
                                    break;
                            }
                            wsp0Var = new wsp0(i10, f2, f6, 0, i4, f4, f5, 1, f9, i6);
                            if (wsp0Var != null) {
                                hashMap2.put(wsp0Var.a, wsp0Var);
                            }
                        }
                        i12 = Integer.MIN_VALUE;
                        i6 = i12;
                        wsp0Var = new wsp0(i10, f2, f6, 0, i4, f4, f5, 1, f9, i6);
                        if (wsp0Var != null) {
                        }
                    }
                    f6 = f3;
                    i4 = 0;
                    float f92 = 1.0f / i2;
                    i5 = o19.i(xmlPullParser, "writingMode");
                    if (i5 != null) {
                    }
                    i12 = Integer.MIN_VALUE;
                    i6 = i12;
                    wsp0Var = new wsp0(i10, f2, f6, 0, i4, f4, f5, 1, f92, i6);
                    if (wsp0Var != null) {
                    }
                }
                wsp0Var = null;
                if (wsp0Var != null) {
                }
            } else if (o19.n(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (o19.n(xmlPullParser, "image") && (i3 = o19.i(xmlPullParser, "id")) != null) {
                        hashMap3.put(i3, xmlPullParser.nextText());
                    }
                } while (!o19.m(xmlPullParser, "metadata"));
            }
        } while (!o19.m(xmlPullParser, TtmlNode.TAG_HEAD));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static usp0 j(XmlPullParser xmlPullParser, @Nullable usp0 usp0Var, HashMap hashMap, a aVar) throws SubtitleDecoderException {
        long j;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        xsp0 k = k(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = C.TIME_UNSET;
        long j3 = C.TIME_UNSET;
        long j4 = C.TIME_UNSET;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(TtmlNode.TAG_REGION)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals(TtmlNode.END)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = l(attributeValue, aVar);
                    break;
                case 2:
                    j3 = l(attributeValue, aVar);
                    break;
                case 3:
                    j2 = l(attributeValue, aVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = y2r0.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (usp0Var != null) {
            long j5 = usp0Var.d;
            if (j5 != C.TIME_UNSET) {
                if (j2 != C.TIME_UNSET) {
                    j2 += j5;
                }
                if (j3 != C.TIME_UNSET) {
                    j3 += j5;
                }
            }
        }
        if (j3 == C.TIME_UNSET) {
            if (j4 != C.TIME_UNSET) {
                j3 = j2 + j4;
            } else if (usp0Var != null) {
                long j6 = usp0Var.e;
                if (j6 != C.TIME_UNSET) {
                    j = j6;
                    return new usp0(xmlPullParser.getName(), null, j2, j, k, strArr, str2, str, usp0Var);
                }
            }
        }
        j = j3;
        return new usp0(xmlPullParser.getName(), null, j2, j, k, strArr, str2, str, usp0Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0265  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xsp0 k(XmlPullParser xmlPullParser, xsp0 xsp0Var) {
        char c2;
        ?? r9;
        ?? r10;
        char c3;
        char c4;
        com.google.common.collect.j d2;
        int i2;
        int hashCode;
        char c5;
        ifo0 ifo0Var;
        int i3;
        char c6;
        int attributeCount = xmlPullParser.getAttributeCount();
        xsp0 xsp0Var2 = xsp0Var;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeValue = xmlPullParser.getAttributeValue(i4);
            String attributeName = xmlPullParser.getAttributeName(i4);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_EXTENT)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            Layout.Alignment alignment = null;
            switch (c2) {
                case 0:
                    xsp0Var2 = d(xsp0Var2);
                    xsp0Var2.i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    xsp0Var2 = d(xsp0Var2);
                    xsp0Var2.u = attributeValue;
                    break;
                case 2:
                    xsp0Var2 = d(xsp0Var2);
                    xsp0Var2.a = attributeValue;
                    break;
                case 3:
                    xsp0Var2 = d(xsp0Var2);
                    String u = o19.u(attributeValue);
                    u.getClass();
                    switch (u.hashCode()) {
                        case -1364013995:
                            if (u.equals(TtmlNode.CENTER)) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (u.equals(TtmlNode.END)) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (u.equals(TtmlNode.LEFT)) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (u.equals(TtmlNode.RIGHT)) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (u.equals("start")) {
                                r9 = 4;
                                break;
                            }
                            r9 = -1;
                            break;
                        default:
                            r9 = -1;
                            break;
                    }
                    switch (r9) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    xsp0Var2.o = alignment;
                    break;
                case 4:
                    xsp0Var2 = d(xsp0Var2);
                    xsp0Var2.t = attributeValue;
                    break;
                case 5:
                    String u2 = o19.u(attributeValue);
                    u2.getClass();
                    switch (u2.hashCode()) {
                        case -1461280213:
                            if (u2.equals(TtmlNode.NO_UNDERLINE)) {
                                r10 = false;
                                break;
                            }
                            r10 = -1;
                            break;
                        case -1026963764:
                            if (u2.equals(TtmlNode.UNDERLINE)) {
                                r10 = true;
                                break;
                            }
                            r10 = -1;
                            break;
                        case 913457136:
                            if (u2.equals(TtmlNode.NO_LINETHROUGH)) {
                                r10 = 2;
                                break;
                            }
                            r10 = -1;
                            break;
                        case 1679736913:
                            if (u2.equals(TtmlNode.LINETHROUGH)) {
                                r10 = 3;
                                break;
                            }
                            r10 = -1;
                            break;
                        default:
                            r10 = -1;
                            break;
                    }
                    switch (r10) {
                        case 0:
                            xsp0Var2 = d(xsp0Var2);
                            xsp0Var2.g = 0;
                            break;
                        case 1:
                            xsp0Var2 = d(xsp0Var2);
                            xsp0Var2.g = 1;
                            break;
                        case 2:
                            xsp0Var2 = d(xsp0Var2);
                            xsp0Var2.f = 0;
                            break;
                        case 3:
                            xsp0Var2 = d(xsp0Var2);
                            xsp0Var2.f = 1;
                            break;
                    }
                case 6:
                    xsp0Var2 = d(xsp0Var2);
                    xsp0Var2.h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        xsp0Var2 = d(xsp0Var2);
                        xsp0Var2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String u3 = o19.u(attributeValue);
                    u3.getClass();
                    switch (u3.hashCode()) {
                        case -618561360:
                            if (u3.equals("baseContainer")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -410956671:
                            if (u3.equals("container")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -250518009:
                            if (u3.equals("delimiter")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -136074796:
                            if (u3.equals("textContainer")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3016401:
                            if (u3.equals("base")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3556653:
                            if (u3.equals("text")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 4:
                            xsp0Var2 = d(xsp0Var2);
                            xsp0Var2.m = 2;
                            break;
                        case 1:
                            xsp0Var2 = d(xsp0Var2);
                            xsp0Var2.m = 1;
                            break;
                        case 2:
                            xsp0Var2 = d(xsp0Var2);
                            xsp0Var2.m = 4;
                            break;
                        case 3:
                        case 5:
                            xsp0Var2 = d(xsp0Var2);
                            xsp0Var2.m = 3;
                            break;
                    }
                case '\t':
                    xsp0Var2 = d(xsp0Var2);
                    try {
                        xsp0Var2.b = c7g.a(attributeValue, false);
                        xsp0Var2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        xr.a("Failed parsing color value: ", attributeValue);
                        break;
                    }
                case '\n':
                    xsp0 d3 = d(xsp0Var2);
                    Matcher matcher = e.matcher(attributeValue);
                    float f2 = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f2 = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e2) {
                            ahn.G("Failed to parse shear: " + attributeValue, e2);
                        }
                    } else {
                        xr.a("Invalid value for shear: ", attributeValue);
                    }
                    d3.s = f2;
                    xsp0Var2 = d3;
                    break;
                case 11:
                    String u4 = o19.u(attributeValue);
                    u4.getClass();
                    if (u4.equals("all")) {
                        xsp0Var2 = d(xsp0Var2);
                        xsp0Var2.q = 1;
                        break;
                    } else if (u4.equals("none")) {
                        xsp0Var2 = d(xsp0Var2);
                        xsp0Var2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        xsp0Var2 = d(xsp0Var2);
                        g(attributeValue, xsp0Var2);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        xr.a("Failed parsing fontSize value: ", attributeValue);
                        break;
                    }
                case '\r':
                    xsp0Var2 = d(xsp0Var2);
                    Pattern pattern = ifo0.d;
                    if (attributeValue != null) {
                        String u5 = o19.u(attributeValue.trim());
                        if (!u5.isEmpty()) {
                            String[] split = TextUtils.split(u5, ifo0.d);
                            int length = split.length;
                            ImmutableSet m = length != 0 ? length != 1 ? ImmutableSet.m(split.length, (Object[]) split.clone()) : new owj0(split[0]) : com.google.common.collect.i.k;
                            gzi0 gzi0Var = new gzi0(com.google.common.collect.l.d(ifo0.h, m));
                            String str = (String) (gzi0Var.hasNext() ? gzi0Var.next() : "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 == -1392885889) {
                                if (str.equals("before")) {
                                    c4 = 2;
                                    if (c4 == 0) {
                                    }
                                    d2 = com.google.common.collect.l.d(ifo0.e, m);
                                    if (d2.isEmpty()) {
                                    }
                                }
                                c4 = 65535;
                                if (c4 == 0) {
                                }
                                d2 = com.google.common.collect.l.d(ifo0.e, m);
                                if (d2.isEmpty()) {
                                }
                            } else if (hashCode2 != -1106037339) {
                                if (hashCode2 == 92734940 && str.equals("after")) {
                                    c4 = 0;
                                    int i5 = c4 == 0 ? c4 != 1 ? 1 : -2 : 2;
                                    d2 = com.google.common.collect.l.d(ifo0.e, m);
                                    if (d2.isEmpty()) {
                                        String str2 = (String) new gzi0(d2).next();
                                        int hashCode3 = str2.hashCode();
                                        if (hashCode3 == 3005871) {
                                            str2.equals("auto");
                                        } else if (hashCode3 == 3387192 && str2.equals("none")) {
                                            i3 = 0;
                                            ifo0Var = new ifo0(i3, 0, i5);
                                        }
                                        i3 = -1;
                                        ifo0Var = new ifo0(i3, 0, i5);
                                    } else {
                                        com.google.common.collect.j d4 = com.google.common.collect.l.d(ifo0.g, m);
                                        com.google.common.collect.j d5 = com.google.common.collect.l.d(ifo0.f, m);
                                        if (d4.isEmpty() && d5.isEmpty()) {
                                            ifo0Var = new ifo0(-1, 0, i5);
                                        } else {
                                            gzi0 gzi0Var2 = new gzi0(d4);
                                            String str3 = (String) (gzi0Var2.hasNext() ? gzi0Var2.next() : "filled");
                                            int hashCode4 = str3.hashCode();
                                            if (hashCode4 == -1274499742) {
                                                str3.equals("filled");
                                            } else if (hashCode4 == 3417674 && str3.equals("open")) {
                                                i2 = 2;
                                                gzi0 gzi0Var3 = new gzi0(d5);
                                                String str4 = (String) (!gzi0Var3.hasNext() ? gzi0Var3.next() : "circle");
                                                hashCode = str4.hashCode();
                                                if (hashCode != -1360216880) {
                                                    if (str4.equals("circle")) {
                                                        c5 = 2;
                                                        ifo0Var = new ifo0(c5 == 0 ? c5 != 1 ? 1 : 3 : 2, i2, i5);
                                                    }
                                                    c5 = 65535;
                                                    ifo0Var = new ifo0(c5 == 0 ? c5 != 1 ? 1 : 3 : 2, i2, i5);
                                                } else if (hashCode != -905816648) {
                                                    if (hashCode == 99657 && str4.equals("dot")) {
                                                        c5 = 0;
                                                        ifo0Var = new ifo0(c5 == 0 ? c5 != 1 ? 1 : 3 : 2, i2, i5);
                                                    }
                                                    c5 = 65535;
                                                    ifo0Var = new ifo0(c5 == 0 ? c5 != 1 ? 1 : 3 : 2, i2, i5);
                                                } else {
                                                    if (str4.equals("sesame")) {
                                                        c5 = 1;
                                                        ifo0Var = new ifo0(c5 == 0 ? c5 != 1 ? 1 : 3 : 2, i2, i5);
                                                    }
                                                    c5 = 65535;
                                                    ifo0Var = new ifo0(c5 == 0 ? c5 != 1 ? 1 : 3 : 2, i2, i5);
                                                }
                                            }
                                            i2 = 1;
                                            gzi0 gzi0Var32 = new gzi0(d5);
                                            String str42 = (String) (!gzi0Var32.hasNext() ? gzi0Var32.next() : "circle");
                                            hashCode = str42.hashCode();
                                            if (hashCode != -1360216880) {
                                            }
                                        }
                                    }
                                }
                                c4 = 65535;
                                if (c4 == 0) {
                                }
                                d2 = com.google.common.collect.l.d(ifo0.e, m);
                                if (d2.isEmpty()) {
                                }
                            } else {
                                if (str.equals("outside")) {
                                    c4 = 1;
                                    if (c4 == 0) {
                                    }
                                    d2 = com.google.common.collect.l.d(ifo0.e, m);
                                    if (d2.isEmpty()) {
                                    }
                                }
                                c4 = 65535;
                                if (c4 == 0) {
                                }
                                d2 = com.google.common.collect.l.d(ifo0.e, m);
                                if (d2.isEmpty()) {
                                }
                            }
                            xsp0Var2.r = ifo0Var;
                            break;
                        }
                    }
                    ifo0Var = null;
                    xsp0Var2.r = ifo0Var;
                    break;
                case 14:
                    String u6 = o19.u(attributeValue);
                    u6.getClass();
                    if (u6.equals("before")) {
                        xsp0Var2 = d(xsp0Var2);
                        xsp0Var2.n = 1;
                        break;
                    } else if (u6.equals("after")) {
                        xsp0Var2 = d(xsp0Var2);
                        xsp0Var2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    xsp0Var2 = d(xsp0Var2);
                    try {
                        xsp0Var2.d = c7g.a(attributeValue, false);
                        xsp0Var2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        xr.a("Failed parsing background value: ", attributeValue);
                        break;
                    }
                case 16:
                    xsp0Var2 = d(xsp0Var2);
                    String u7 = o19.u(attributeValue);
                    u7.getClass();
                    switch (u7.hashCode()) {
                        case -1364013995:
                            if (u7.equals(TtmlNode.CENTER)) {
                                c6 = 0;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 100571:
                            if (u7.equals(TtmlNode.END)) {
                                c6 = 1;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 3317767:
                            if (u7.equals(TtmlNode.LEFT)) {
                                c6 = 2;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 108511772:
                            if (u7.equals(TtmlNode.RIGHT)) {
                                c6 = 3;
                                break;
                            }
                            c6 = 65535;
                            break;
                        case 109757538:
                            if (u7.equals("start")) {
                                c6 = 4;
                                break;
                            }
                            c6 = 65535;
                            break;
                        default:
                            c6 = 65535;
                            break;
                    }
                    switch (c6) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                        case 3:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case 2:
                        case 4:
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                    }
                    xsp0Var2.p = alignment;
                    break;
            }
        }
        return xsp0Var2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals(ru.ok.tracer.base.ucum.UcumUtils.UCUM_MILLISECODS) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long l(String str, a aVar) throws SubtitleDecoderException {
        double d2;
        double d3;
        Matcher matcher = b.matcher(str);
        char c2 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * TimeUtils.SECONDS_PER_HOUR;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            double d4 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            double parseDouble = parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / aVar.a : 0.0d);
            if (matcher.group(6) != null) {
                d4 = (Long.parseLong(r13) / aVar.b) / aVar.a;
            }
            return (long) ((parseDouble + d4) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(go9.b("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble2 = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 104:
                if (group4.equals("h")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 109:
                if (group4.equals(InneractiveMediationDefs.GENDER_MALE)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 116:
                if (group4.equals("t")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3494:
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                d2 = aVar.a;
                parseDouble2 /= d2;
                break;
            case 1:
                d3 = 3600.0d;
                break;
            case 2:
                d3 = 60.0d;
                break;
            case 3:
                d2 = aVar.c;
                parseDouble2 /= d2;
                break;
            case 4:
                d2 = 1000.0d;
                parseDouble2 /= d2;
                break;
        }
        parseDouble2 *= d3;
        return (long) (parseDouble2 * 1000000.0d);
    }

    @Nullable
    public static b m(XmlPullParser xmlPullParser) {
        String i2 = o19.i(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (i2 == null) {
            return null;
        }
        Matcher matcher = g.matcher(i2);
        if (!matcher.matches()) {
            ahn.F("Ignoring non-pixel tts extent: ".concat(i2));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new b(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            ahn.F("Ignoring malformed tts extent: ".concat(i2));
            return null;
        }
    }

    @Override // xsna.a1n0
    public final void a(byte[] bArr, int i2, int i3, a1n0.b bVar, j7j<wkk> j7jVar) {
        i1z.b(c(i2, i3, bArr), bVar, j7jVar);
    }

    @Override // xsna.a1n0
    public final int b() {
        return 1;
    }

    @Override // xsna.a1n0
    public final m0n0 c(int i2, int i3, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new wsp0("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            b bVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVar = i;
            int i4 = 0;
            int i5 = 15;
            sg9 sg9Var = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                usp0 usp0Var = (usp0) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            aVar = h(newPullParser);
                            i5 = f(newPullParser);
                            bVar = m(newPullParser);
                        }
                        a aVar2 = aVar;
                        b bVar2 = bVar;
                        int i6 = i5;
                        if (e(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                i(newPullParser, hashMap, i6, bVar2, hashMap2, hashMap3);
                            } else {
                                try {
                                    usp0 j = j(newPullParser, usp0Var, hashMap2, aVar2);
                                    arrayDeque.push(j);
                                    if (usp0Var != null) {
                                        if (usp0Var.m == null) {
                                            usp0Var.m = new ArrayList();
                                        }
                                        usp0Var.m.add(j);
                                    }
                                } catch (SubtitleDecoderException e2) {
                                    ahn.G("Suppressing parser error", e2);
                                }
                            }
                            i5 = i6;
                            bVar = bVar2;
                            aVar = aVar2;
                        } else {
                            ahn.u("Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i4++;
                        i5 = i6;
                        bVar = bVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        usp0Var.getClass();
                        usp0 a2 = usp0.a(newPullParser.getText());
                        if (usp0Var.m == null) {
                            usp0Var.m = new ArrayList();
                        }
                        usp0Var.m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            usp0 usp0Var2 = (usp0) arrayDeque.peek();
                            usp0Var2.getClass();
                            sg9Var = new sg9(usp0Var2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                newPullParser.next();
            }
            sg9Var.getClass();
            return sg9Var;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new IllegalStateException("Unable to decode source", e4);
        }
    }
}
