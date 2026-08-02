package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.a;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class oj11 implements q2v0 {
    public final XmlPullParserFactory a;
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern w = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern x = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern y = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern z = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern A = Pattern.compile("^(\\d+) (\\d+)$");
    public static final nj11 B = new nj11(30.0f, 1, 1);

    public oj11() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            ny61.n("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    public static qj11 a(qj11 qj11Var) {
        return qj11Var == null ? new qj11() : qj11Var;
    }

    public static boolean c(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals(kju0.j) || str.equals("image") || str.equals(Constants.KEY_DATA) || str.equals("information");
    }

    public static int e(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = A.matcher(attributeValue);
        if (!matcher.matches()) {
            lk91.j("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z2 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z2 = false;
            }
            d6z.k("Invalid cell resolution " + parseInt + " " + parseInt2, z2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            lk91.j("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void g(String str, qj11 qj11Var) {
        Matcher matcher;
        String group;
        int i = tw21.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = w;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new SubtitleDecoderException(oyr.m(split.length, Extension.DOT_CHAR, new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            lk91.j("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(oyr.p("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                qj11Var.j = 3;
                break;
            case "em":
                qj11Var.j = 2;
                break;
            case "px":
                qj11Var.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(oyr.p("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        qj11Var.k = Float.parseFloat(group2);
    }

    public static nj11 h(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = tw21.a;
            d6z.k("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        nj11 nj11Var = B;
        int i2 = nj11Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = nj11Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new nj11(parseInt * f, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(XmlPullParser xmlPullParser, HashMap hashMap, int i, i6z0 i6z0Var, HashMap hashMap2, HashMap hashMap3) {
        String b2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i2;
        String b3;
        int i3;
        pj11 pj11Var;
        char c2;
        float parseFloat;
        float parseFloat2;
        String b4;
        qj11 qj11Var;
        String b5;
        qj11 qj11Var2;
        String[] split;
        do {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, "style")) {
                String b6 = hq91.b(xmlPullParser, "style");
                qj11 k = k(xmlPullParser, new qj11());
                if (b6 != null) {
                    String trim = b6.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i4 = tw21.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str : split) {
                        k.a((qj11) hashMap.get(str));
                    }
                }
                String str2 = k.l;
                if (str2 != null) {
                    hashMap.put(str2, k);
                }
            } else if (hq91.e(xmlPullParser, "region")) {
                String b7 = hq91.b(xmlPullParser, "id");
                if (b7 != null) {
                    String b8 = hq91.b(xmlPullParser, "origin");
                    if (b8 == null && (b5 = hq91.b(xmlPullParser, "style")) != null && (qj11Var2 = (qj11) hashMap.get(b5)) != null) {
                        b8 = qj11Var2.t;
                    }
                    int i5 = 2;
                    Pattern pattern = z;
                    Pattern pattern2 = y;
                    if (b8 != null) {
                        Matcher matcher = pattern2.matcher(b8);
                        Matcher matcher2 = pattern.matcher(b8);
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                f = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                f2 = Float.parseFloat(group2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                lk91.j("Ignoring region with malformed origin: ".concat(b8));
                            }
                        } else if (!matcher2.matches()) {
                            lk91.j("Ignoring region with unsupported origin: ".concat(b8));
                        } else if (i6z0Var == null) {
                            lk91.j("Ignoring region with missing tts:extent: ".concat(b8));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                float f6 = parseInt / i6z0Var.b;
                                f2 = Integer.parseInt(group4) / i6z0Var.c;
                                f = f6;
                            } catch (NumberFormatException unused2) {
                                lk91.j("Ignoring region with malformed origin: ".concat(b8));
                            }
                        }
                    } else {
                        f = 0.0f;
                        f2 = 0.0f;
                    }
                    String b9 = hq91.b(xmlPullParser, "extent");
                    if (b9 == null && (b4 = hq91.b(xmlPullParser, "style")) != null && (qj11Var = (qj11) hashMap.get(b4)) != null) {
                        b9 = qj11Var.u;
                    }
                    if (b9 != null) {
                        Matcher matcher3 = pattern2.matcher(b9);
                        Matcher matcher4 = pattern.matcher(b9);
                        if (matcher3.matches()) {
                            try {
                                String group5 = matcher3.group(1);
                                group5.getClass();
                                parseFloat = Float.parseFloat(group5) / 100.0f;
                                String group6 = matcher3.group(2);
                                group6.getClass();
                                parseFloat2 = Float.parseFloat(group6) / 100.0f;
                            } catch (NumberFormatException unused3) {
                                lk91.j("Ignoring region with malformed extent: " + b8);
                            }
                        } else if (!matcher4.matches()) {
                            lk91.j("Ignoring region with unsupported extent: " + b8);
                        } else if (i6z0Var == null) {
                            lk91.j("Ignoring region with missing tts:extent: " + b8);
                        } else {
                            try {
                                String group7 = matcher4.group(1);
                                group7.getClass();
                                int parseInt2 = Integer.parseInt(group7);
                                String group8 = matcher4.group(2);
                                group8.getClass();
                                float f7 = parseInt2 / i6z0Var.b;
                                parseFloat2 = Integer.parseInt(group8) / i6z0Var.c;
                                parseFloat = f7;
                            } catch (NumberFormatException unused4) {
                                lk91.j("Ignoring region with malformed extent: " + b8);
                            }
                        }
                        f3 = parseFloat;
                        f4 = parseFloat2;
                    } else {
                        f3 = 1.0f;
                        f4 = 1.0f;
                    }
                    String b10 = hq91.b(xmlPullParser, "displayAlign");
                    if (b10 != null) {
                        String g = f0b1.g(b10);
                        g.getClass();
                        if (g.equals("center")) {
                            f5 = f2 + (f4 / 2.0f);
                            i2 = 1;
                        } else if (g.equals("after")) {
                            f5 = f2 + f4;
                            i2 = 2;
                        }
                        float f8 = 1.0f / i;
                        b3 = hq91.b(xmlPullParser, "writingMode");
                        if (b3 != null) {
                            String g2 = f0b1.g(b3);
                            g2.getClass();
                            switch (g2.hashCode()) {
                                case 3694:
                                    if (g2.equals("tb")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553396:
                                    if (g2.equals("tblr")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3553576:
                                    if (g2.equals("tbrl")) {
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
                                    i3 = i5;
                                    break;
                                case 2:
                                    i3 = 1;
                                    break;
                            }
                            pj11Var = new pj11(b7, f, f5, 0, i2, f3, f4, 1, f8, i3);
                            if (pj11Var != null) {
                                hashMap2.put(pj11Var.a, pj11Var);
                            }
                        }
                        i5 = Integer.MIN_VALUE;
                        i3 = i5;
                        pj11Var = new pj11(b7, f, f5, 0, i2, f3, f4, 1, f8, i3);
                        if (pj11Var != null) {
                        }
                    }
                    f5 = f2;
                    i2 = 0;
                    float f82 = 1.0f / i;
                    b3 = hq91.b(xmlPullParser, "writingMode");
                    if (b3 != null) {
                    }
                    i5 = Integer.MIN_VALUE;
                    i3 = i5;
                    pj11Var = new pj11(b7, f, f5, 0, i2, f3, f4, 1, f82, i3);
                    if (pj11Var != null) {
                    }
                }
                pj11Var = null;
                if (pj11Var != null) {
                }
            } else if (hq91.e(xmlPullParser, kju0.j)) {
                do {
                    xmlPullParser.next();
                    if (hq91.e(xmlPullParser, "image") && (b2 = hq91.b(xmlPullParser, "id")) != null) {
                        hashMap3.put(b2, xmlPullParser.nextText());
                    }
                } while (!hq91.d(xmlPullParser, kju0.j));
            }
        } while (!hq91.d(xmlPullParser, "head"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static mj11 j(XmlPullParser xmlPullParser, mj11 mj11Var, HashMap hashMap, nj11 nj11Var) {
        long j;
        char c2;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        qj11 k = k(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
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
                    if (attributeName.equals("end")) {
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
                    if (attributeName.equals("style")) {
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
                    j4 = l(attributeValue, nj11Var);
                    break;
                case 2:
                    j3 = l(attributeValue, nj11Var);
                    break;
                case 3:
                    j2 = l(attributeValue, nj11Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i2 = tw21.a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith(ShimmerDivHandler.NUMBER_SING)) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (mj11Var != null) {
            long j5 = mj11Var.d;
            if (j5 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L) {
                    j2 += j5;
                }
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        }
        if (j3 == -9223372036854775807L) {
            if (j4 != -9223372036854775807L) {
                j3 = j2 + j4;
            } else if (mj11Var != null) {
                long j6 = mj11Var.e;
                if (j6 != -9223372036854775807L) {
                    j = j6;
                    return new mj11(xmlPullParser.getName(), null, j2, j, k, strArr, str2, str, mj11Var);
                }
            }
        }
        j = j3;
        return new mj11(xmlPullParser.getName(), null, j2, j, k, strArr, str2, str, mj11Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0296  */
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
    public static qj11 k(XmlPullParser xmlPullParser, qj11 qj11Var) {
        char c2;
        ?? r9;
        ?? r10;
        char c3;
        int i;
        p4r0 h;
        int i2;
        int hashCode;
        int i3;
        emy0 emy0Var;
        int i4;
        char c4;
        int attributeCount = xmlPullParser.getAttributeCount();
        qj11 qj11Var2 = qj11Var;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            String attributeValue = xmlPullParser.getAttributeValue(i5);
            String attributeName = xmlPullParser.getAttributeName(i5);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
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
                    if (attributeName.equals("textDecoration")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
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
                    if (attributeName.equals("fontSize")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c2 = HexString.LF;
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
                    if (attributeName.equals(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR)) {
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
                    qj11Var2 = a(qj11Var2);
                    qj11Var2.i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    qj11Var2 = a(qj11Var2);
                    qj11Var2.u = attributeValue;
                    break;
                case 2:
                    qj11Var2 = a(qj11Var2);
                    qj11Var2.a = attributeValue;
                    break;
                case 3:
                    qj11Var2 = a(qj11Var2);
                    String g = f0b1.g(attributeValue);
                    g.getClass();
                    switch (g.hashCode()) {
                        case -1364013995:
                            if (g.equals("center")) {
                                r9 = false;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 100571:
                            if (g.equals("end")) {
                                r9 = true;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 3317767:
                            if (g.equals("left")) {
                                r9 = 2;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 108511772:
                            if (g.equals("right")) {
                                r9 = 3;
                                break;
                            }
                            r9 = -1;
                            break;
                        case 109757538:
                            if (g.equals("start")) {
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
                    qj11Var2.o = alignment;
                    break;
                case 4:
                    qj11Var2 = a(qj11Var2);
                    qj11Var2.t = attributeValue;
                    break;
                case 5:
                    String g2 = f0b1.g(attributeValue);
                    g2.getClass();
                    switch (g2.hashCode()) {
                        case -1461280213:
                            if (g2.equals("nounderline")) {
                                r10 = false;
                                break;
                            }
                            r10 = -1;
                            break;
                        case -1026963764:
                            if (g2.equals("underline")) {
                                r10 = true;
                                break;
                            }
                            r10 = -1;
                            break;
                        case 913457136:
                            if (g2.equals("nolinethrough")) {
                                r10 = 2;
                                break;
                            }
                            r10 = -1;
                            break;
                        case 1679736913:
                            if (g2.equals("linethrough")) {
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
                            qj11Var2 = a(qj11Var2);
                            qj11Var2.g = 0;
                            break;
                        case 1:
                            qj11Var2 = a(qj11Var2);
                            qj11Var2.g = 1;
                            break;
                        case 2:
                            qj11Var2 = a(qj11Var2);
                            qj11Var2.f = 0;
                            break;
                        case 3:
                            qj11Var2 = a(qj11Var2);
                            qj11Var2.f = 1;
                            break;
                    }
                case 6:
                    qj11Var2 = a(qj11Var2);
                    qj11Var2.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 7:
                    if ("style".equals(xmlPullParser.getName())) {
                        qj11Var2 = a(qj11Var2);
                        qj11Var2.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case '\b':
                    String g3 = f0b1.g(attributeValue);
                    g3.getClass();
                    switch (g3.hashCode()) {
                        case -618561360:
                            if (g3.equals("baseContainer")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -410956671:
                            if (g3.equals("container")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -250518009:
                            if (g3.equals("delimiter")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -136074796:
                            if (g3.equals("textContainer")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3016401:
                            if (g3.equals("base")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3556653:
                            if (g3.equals("text")) {
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
                            qj11Var2 = a(qj11Var2);
                            qj11Var2.m = 2;
                            break;
                        case 1:
                            qj11Var2 = a(qj11Var2);
                            qj11Var2.m = 1;
                            break;
                        case 2:
                            qj11Var2 = a(qj11Var2);
                            qj11Var2.m = 4;
                            break;
                        case 3:
                        case 5:
                            qj11Var2 = a(qj11Var2);
                            qj11Var2.m = 3;
                            break;
                    }
                case '\t':
                    qj11Var2 = a(qj11Var2);
                    try {
                        qj11Var2.b = wfc.a(attributeValue, false);
                        qj11Var2.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        lk91.j("Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\n':
                    qj11 a = a(qj11Var2);
                    Matcher matcher = x.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (matcher.matches()) {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e) {
                            lk91.k("Failed to parse shear: " + attributeValue, e);
                        }
                    } else {
                        lk91.j("Invalid value for shear: " + attributeValue);
                    }
                    a.s = f;
                    qj11Var2 = a;
                    break;
                case 11:
                    String g4 = f0b1.g(attributeValue);
                    g4.getClass();
                    if (g4.equals("all")) {
                        qj11Var2 = a(qj11Var2);
                        qj11Var2.q = 1;
                        break;
                    } else if (g4.equals("none")) {
                        qj11Var2 = a(qj11Var2);
                        qj11Var2.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\f':
                    try {
                        qj11Var2 = a(qj11Var2);
                        g(attributeValue, qj11Var2);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        lk91.j("Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case '\r':
                    qj11Var2 = a(qj11Var2);
                    Pattern pattern = emy0.d;
                    if (attributeValue != null) {
                        String g5 = f0b1.g(attributeValue.trim());
                        if (!g5.isEmpty()) {
                            ImmutableSet n = ImmutableSet.n(TextUtils.split(g5, emy0.d));
                            String str = (String) eab1.b(lab1.h(emy0.h, n), "outside");
                            int hashCode2 = str.hashCode();
                            if (hashCode2 != -1392885889) {
                                if (hashCode2 != -1106037339) {
                                    if (hashCode2 == 92734940 && str.equals("after")) {
                                        i = 2;
                                        h = lab1.h(emy0.e, n);
                                        if (h.isEmpty()) {
                                            p4r0 h2 = lab1.h(emy0.g, n);
                                            p4r0 h3 = lab1.h(emy0.f, n);
                                            if (h2.isEmpty() && h3.isEmpty()) {
                                                emy0Var = new emy0(-1, 0, i);
                                            } else {
                                                String str2 = (String) eab1.b(h2, "filled");
                                                int hashCode3 = str2.hashCode();
                                                if (hashCode3 == -1274499742) {
                                                    str2.equals("filled");
                                                } else if (hashCode3 == 3417674 && str2.equals(OpenList.STR_OPEN)) {
                                                    i2 = 2;
                                                    String str3 = (String) eab1.b(h3, "circle");
                                                    hashCode = str3.hashCode();
                                                    if (hashCode != -1360216880) {
                                                        str3.equals("circle");
                                                    } else if (hashCode != -905816648) {
                                                        if (hashCode == 99657 && str3.equals("dot")) {
                                                            i3 = 2;
                                                            emy0Var = new emy0(i3, i2, i);
                                                        }
                                                    } else if (str3.equals("sesame")) {
                                                        i3 = 3;
                                                        emy0Var = new emy0(i3, i2, i);
                                                    }
                                                    i3 = 1;
                                                    emy0Var = new emy0(i3, i2, i);
                                                }
                                                i2 = 1;
                                                String str32 = (String) eab1.b(h3, "circle");
                                                hashCode = str32.hashCode();
                                                if (hashCode != -1360216880) {
                                                }
                                                i3 = 1;
                                                emy0Var = new emy0(i3, i2, i);
                                            }
                                        } else {
                                            String str4 = (String) ((a) h.iterator()).next();
                                            int hashCode4 = str4.hashCode();
                                            if (hashCode4 == 3005871) {
                                                str4.equals("auto");
                                            } else if (hashCode4 == 3387192 && str4.equals("none")) {
                                                i4 = 0;
                                                emy0Var = new emy0(i4, 0, i);
                                            }
                                            i4 = -1;
                                            emy0Var = new emy0(i4, 0, i);
                                        }
                                    }
                                } else if (str.equals("outside")) {
                                    i = -2;
                                    h = lab1.h(emy0.e, n);
                                    if (h.isEmpty()) {
                                    }
                                }
                                qj11Var2.r = emy0Var;
                                break;
                            } else {
                                str.equals("before");
                            }
                            i = 1;
                            h = lab1.h(emy0.e, n);
                            if (h.isEmpty()) {
                            }
                            qj11Var2.r = emy0Var;
                        }
                    }
                    emy0Var = null;
                    qj11Var2.r = emy0Var;
                    break;
                case 14:
                    String g6 = f0b1.g(attributeValue);
                    g6.getClass();
                    if (g6.equals("before")) {
                        qj11Var2 = a(qj11Var2);
                        qj11Var2.n = 1;
                        break;
                    } else if (g6.equals("after")) {
                        qj11Var2 = a(qj11Var2);
                        qj11Var2.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    qj11Var2 = a(qj11Var2);
                    try {
                        qj11Var2.d = wfc.a(attributeValue, false);
                        qj11Var2.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        lk91.j("Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 16:
                    qj11Var2 = a(qj11Var2);
                    String g7 = f0b1.g(attributeValue);
                    g7.getClass();
                    switch (g7.hashCode()) {
                        case -1364013995:
                            if (g7.equals("center")) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 100571:
                            if (g7.equals("end")) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 3317767:
                            if (g7.equals("left")) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 108511772:
                            if (g7.equals("right")) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 109757538:
                            if (g7.equals("start")) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
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
                    qj11Var2.p = alignment;
                    break;
            }
        }
        return qj11Var2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long l(String str, nj11 nj11Var) {
        double d;
        double d2;
        Matcher matcher = b.matcher(str);
        char c2 = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / nj11Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / nj11Var.b) / nj11Var.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(g8e.o("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        double parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        switch (group4.hashCode()) {
            case 102:
                if (group4.equals("f")) {
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
                if (group4.equals("m")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case BuildConfig.API_LEVEL /* 116 */:
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
                d = nj11Var.a;
                parseDouble /= d;
                break;
            case 1:
                d2 = 3600.0d;
                break;
            case 2:
                d2 = 60.0d;
                break;
            case 3:
                d = nj11Var.c;
                parseDouble /= d;
                break;
            case 4:
                d = 1000.0d;
                parseDouble /= d;
                break;
        }
        parseDouble *= d2;
        return (long) (parseDouble * 1000000.0d);
    }

    public static i6z0 m(XmlPullParser xmlPullParser) {
        String b2 = hq91.b(xmlPullParser, "extent");
        if (b2 == null) {
            return null;
        }
        Matcher matcher = z.matcher(b2);
        if (!matcher.matches()) {
            lk91.j("Ignoring non-pixel tts extent: ".concat(b2));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new i6z0(parseInt, Integer.parseInt(group2), 12);
        } catch (NumberFormatException unused) {
            lk91.j("Ignoring malformed tts extent: ".concat(b2));
            return null;
        }
    }

    @Override // defpackage.q2v0
    public final void b(byte[] bArr, int i, int i2, p2v0 p2v0Var, c9e c9eVar) {
        ydb1.d(d(i, i2, bArr), p2v0Var, c9eVar);
    }

    @Override // defpackage.q2v0
    public final e2v0 d(int i, int i2, byte[] bArr) {
        e2v0 e2v0Var;
        e2v0 e2v0Var2 = null;
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new pj11("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int eventType = newPullParser.getEventType();
            nj11 nj11Var = B;
            int i3 = 15;
            int i4 = 0;
            hlx0 hlx0Var = null;
            i6z0 i6z0Var = null;
            while (eventType != 1) {
                mj11 mj11Var = (mj11) arrayDeque.peek();
                if (i4 == 0) {
                    e2v0Var = e2v0Var2;
                    try {
                        String name = newPullParser.getName();
                        if (eventType == 2) {
                            if ("tt".equals(name)) {
                                nj11Var = h(newPullParser);
                                i3 = e(newPullParser);
                                i6z0Var = m(newPullParser);
                            }
                            i6z0 i6z0Var2 = i6z0Var;
                            nj11 nj11Var2 = nj11Var;
                            int i5 = i3;
                            if (c(name)) {
                                if ("head".equals(name)) {
                                    i(newPullParser, hashMap, i5, i6z0Var2, hashMap2, hashMap3);
                                } else {
                                    try {
                                        mj11 j = j(newPullParser, mj11Var, hashMap2, nj11Var2);
                                        arrayDeque.push(j);
                                        if (mj11Var != null) {
                                            if (mj11Var.m == null) {
                                                mj11Var.m = new ArrayList();
                                            }
                                            mj11Var.m.add(j);
                                        }
                                    } catch (SubtitleDecoderException e) {
                                        lk91.k("Suppressing parser error", e);
                                    }
                                }
                                i3 = i5;
                                nj11Var = nj11Var2;
                                i6z0Var = i6z0Var2;
                            } else {
                                lk91.h("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            }
                            i4++;
                            i3 = i5;
                            nj11Var = nj11Var2;
                            i6z0Var = i6z0Var2;
                        } else if (eventType == 4) {
                            mj11Var.getClass();
                            mj11 a = mj11.a(newPullParser.getText());
                            if (mj11Var.m == null) {
                                mj11Var.m = new ArrayList();
                            }
                            mj11Var.m.add(a);
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                mj11 mj11Var2 = (mj11) arrayDeque.peek();
                                mj11Var2.getClass();
                                hlx0Var = new hlx0(mj11Var2, hashMap, hashMap2, hashMap3);
                            }
                            arrayDeque.pop();
                        }
                    } catch (IOException e2) {
                        e = e2;
                        ny61.h("Unexpected error when reading input.", e);
                        return e2v0Var;
                    } catch (XmlPullParserException e3) {
                        e = e3;
                        ny61.h("Unable to decode source", e);
                        return e2v0Var;
                    }
                } else {
                    e2v0Var = e2v0Var2;
                    if (eventType == 2) {
                        i4++;
                    } else if (eventType == 3) {
                        i4--;
                    }
                }
                newPullParser.next();
                eventType = newPullParser.getEventType();
                e2v0Var2 = e2v0Var;
            }
            e2v0Var = e2v0Var2;
            hlx0Var.getClass();
            return hlx0Var;
        } catch (IOException e4) {
            e = e4;
            e2v0Var = e2v0Var2;
        } catch (XmlPullParserException e5) {
            e = e5;
            e2v0Var = e2v0Var2;
        }
    }

    @Override // defpackage.q2v0
    public final int f() {
        return 1;
    }
}
