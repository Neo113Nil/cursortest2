package yads;

import android.text.Layout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
import xsna.go9;
import xsna.h5s;

/* loaded from: classes10.dex */
public final class va3 extends j03 {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final ta3 u = new ta3(30.0f, 1, 1);
    public static final sa3 v = new sa3(15);
    public final XmlPullParserFactory m;

    public va3() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static za3 a(za3 za3Var) {
        return za3Var == null ? new za3() : za3Var;
    }

    public static Layout.Alignment b(String str) {
        String a = ki.a(str);
        a.getClass();
        switch (a) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    @Override // yads.j03
    public final v53 a(byte[] bArr, int i, boolean z) {
        try {
            XmlPullParser newPullParser = this.m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new xa3("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            ua3 ua3Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i2 = 0;
            ta3 ta3Var = u;
            sa3 sa3Var = v;
            ab3 ab3Var = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                wa3 wa3Var = (wa3) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            ta3Var = a(newPullParser);
                            sa3Var = a(newPullParser, v);
                            ua3Var = b(newPullParser);
                        }
                        sa3 sa3Var2 = sa3Var;
                        ta3 ta3Var2 = ta3Var;
                        if (a(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                a(newPullParser, hashMap, sa3Var2, ua3Var, hashMap2, hashMap3);
                            } else {
                                try {
                                    wa3 a = a(newPullParser, wa3Var, hashMap2, ta3Var2);
                                    arrayDeque.push(a);
                                    if (wa3Var != null) {
                                        if (wa3Var.m == null) {
                                            wa3Var.m = new ArrayList();
                                        }
                                        wa3Var.m.add(a);
                                    }
                                } catch (x53 e) {
                                    ji1.d("TtmlDecoder", ji1.a("Suppressing parser error", e));
                                }
                            }
                            sa3Var = sa3Var2;
                            ta3Var = ta3Var2;
                        } else {
                            ji1.c("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        sa3Var = sa3Var2;
                        ta3Var = ta3Var2;
                        i2++;
                    } else if (eventType == 4) {
                        wa3Var.getClass();
                        wa3 a2 = wa3.a(newPullParser.getText());
                        if (wa3Var.m == null) {
                            wa3Var.m = new ArrayList();
                        }
                        wa3Var.m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals(TtmlNode.TAG_TT)) {
                            wa3 wa3Var2 = (wa3) arrayDeque.peek();
                            wa3Var2.getClass();
                            ab3Var = new ab3(wa3Var2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                    newPullParser.next();
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i2--;
                        }
                        newPullParser.next();
                    }
                    i2++;
                    newPullParser.next();
                }
            }
            if (ab3Var != null) {
                return ab3Var;
            }
            throw new x53("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new x53("Unable to decode source", e3);
        }
    }

    public static ua3 b(XmlPullParser xmlPullParser) {
        String a = wq3.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (a == null) {
            return null;
        }
        Matcher matcher = s.matcher(a);
        if (!matcher.matches()) {
            ji1.d("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(a));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new ua3(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            ji1.d("TtmlDecoder", "Ignoring malformed tts extent: ".concat(a));
            return null;
        }
    }

    public static boolean a(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals("body") || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals(TtmlNode.TAG_STYLE) || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals(TtmlNode.TAG_REGION) || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static sa3 a(XmlPullParser xmlPullParser, sa3 sa3Var) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return sa3Var;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            ji1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return sa3Var;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                throw new x53("Invalid cell resolution " + parseInt + " " + parseInt2);
            }
            return new sa3(parseInt2);
        } catch (NumberFormatException unused) {
            ji1.d("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return sa3Var;
        }
    }

    public static void a(String str, za3 za3Var) {
        Matcher matcher;
        String group;
        int i = mc3.a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = p.matcher(str);
        } else if (split.length == 2) {
            matcher = p.matcher(split[1]);
            ji1.d("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new x53(h5s.c(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
        }
        if (matcher.matches()) {
            group = matcher.group(3);
            group.getClass();
            switch (group) {
                case "%":
                    za3Var.j = 3;
                    break;
                case "em":
                    za3Var.j = 2;
                    break;
                case "px":
                    za3Var.j = 1;
                    break;
                default:
                    throw new x53(xsna.zr.a("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            za3Var.k = Float.parseFloat(group2);
            return;
        }
        throw new x53(xsna.zr.a("Invalid expression for fontSize: '", str, "'."));
    }

    public static ta3 a(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = mc3.a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new x53("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        ta3 ta3Var = u;
        int i2 = ta3Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = ta3Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new ta3(parseInt * f, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(XmlPullParser xmlPullParser, HashMap hashMap, sa3 sa3Var, ua3 ua3Var, HashMap hashMap2, HashMap hashMap3) {
        String a;
        float parseFloat;
        float parseFloat2;
        float parseFloat3;
        float f;
        sa3 sa3Var2;
        float f2;
        int i;
        String a2;
        int i2;
        xa3 xa3Var;
        char c;
        String[] split;
        do {
            xmlPullParser.next();
            if (wq3.c(xmlPullParser, TtmlNode.TAG_STYLE)) {
                String a3 = wq3.a(xmlPullParser, TtmlNode.TAG_STYLE);
                za3 a4 = a(xmlPullParser, new za3());
                if (a3 != null) {
                    String trim = a3.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i3 = mc3.a;
                        split = trim.split("\\s+", -1);
                    }
                    for (String str : split) {
                        a4.a((za3) hashMap.get(str));
                    }
                }
                String str2 = a4.l;
                if (str2 != null) {
                    hashMap.put(str2, a4);
                }
            } else if (wq3.c(xmlPullParser, TtmlNode.TAG_REGION)) {
                String a5 = wq3.a(xmlPullParser, "id");
                if (a5 != null) {
                    String a6 = wq3.a(xmlPullParser, "origin");
                    if (a6 != null) {
                        Pattern pattern = r;
                        Matcher matcher = pattern.matcher(a6);
                        Pattern pattern2 = s;
                        Matcher matcher2 = pattern2.matcher(a6);
                        int i4 = 2;
                        if (matcher.matches()) {
                            try {
                                String group = matcher.group(1);
                                group.getClass();
                                parseFloat = Float.parseFloat(group) / 100.0f;
                                String group2 = matcher.group(2);
                                group2.getClass();
                                parseFloat2 = Float.parseFloat(group2) / 100.0f;
                            } catch (NumberFormatException unused) {
                                ji1.d("TtmlDecoder", "Ignoring region with malformed origin: ".concat(a6));
                            }
                        } else if (!matcher2.matches()) {
                            ji1.d("TtmlDecoder", "Ignoring region with unsupported origin: ".concat(a6));
                        } else if (ua3Var == null) {
                            ji1.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(a6));
                        } else {
                            try {
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                int parseInt = Integer.parseInt(group3);
                                String group4 = matcher2.group(2);
                                group4.getClass();
                                float f3 = parseInt / ua3Var.a;
                                float parseInt2 = Integer.parseInt(group4) / ua3Var.b;
                                parseFloat = f3;
                                parseFloat2 = parseInt2;
                            } catch (NumberFormatException unused2) {
                                ji1.d("TtmlDecoder", "Ignoring region with malformed origin: ".concat(a6));
                            }
                        }
                        String a7 = wq3.a(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                        if (a7 != null) {
                            Matcher matcher3 = pattern.matcher(a7);
                            Matcher matcher4 = pattern2.matcher(a7);
                            if (matcher3.matches()) {
                                try {
                                    String group5 = matcher3.group(1);
                                    group5.getClass();
                                    float parseFloat4 = Float.parseFloat(group5) / 100.0f;
                                    String group6 = matcher3.group(2);
                                    group6.getClass();
                                    parseFloat3 = Float.parseFloat(group6) / 100.0f;
                                    f = parseFloat4;
                                } catch (NumberFormatException unused3) {
                                    ji1.d("TtmlDecoder", "Ignoring region with malformed extent: ".concat(a6));
                                }
                            } else if (!matcher4.matches()) {
                                ji1.d("TtmlDecoder", "Ignoring region with unsupported extent: ".concat(a6));
                            } else if (ua3Var == null) {
                                ji1.d("TtmlDecoder", "Ignoring region with missing tts:extent: ".concat(a6));
                            } else {
                                try {
                                    String group7 = matcher4.group(1);
                                    group7.getClass();
                                    int parseInt3 = Integer.parseInt(group7);
                                    String group8 = matcher4.group(2);
                                    group8.getClass();
                                    float f4 = parseInt3 / ua3Var.a;
                                    parseFloat3 = Integer.parseInt(group8) / ua3Var.b;
                                    f = f4;
                                } catch (NumberFormatException unused4) {
                                    ji1.d("TtmlDecoder", "Ignoring region with malformed extent: ".concat(a6));
                                }
                            }
                            float f5 = parseFloat3;
                            String a8 = wq3.a(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                            if (a8 != null) {
                                String a9 = ki.a(a8);
                                a9.getClass();
                                if (a9.equals(TtmlNode.CENTER)) {
                                    parseFloat2 += f5 / 2.0f;
                                    sa3Var2 = sa3Var;
                                    f2 = parseFloat;
                                    i = 1;
                                } else if (a9.equals("after")) {
                                    parseFloat2 += f5;
                                    sa3Var2 = sa3Var;
                                    f2 = parseFloat;
                                    i = 2;
                                }
                                float f6 = 1.0f / sa3Var2.a;
                                a2 = wq3.a(xmlPullParser, "writingMode");
                                if (a2 != null) {
                                    String a10 = ki.a(a2);
                                    a10.getClass();
                                    switch (a10.hashCode()) {
                                        case 3694:
                                            if (a10.equals("tb")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3553396:
                                            if (a10.equals("tblr")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 3553576:
                                            if (a10.equals("tbrl")) {
                                                c = 2;
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
                                        case 1:
                                            i2 = i4;
                                            break;
                                        case 2:
                                            i2 = 1;
                                            break;
                                    }
                                    xa3Var = new xa3(a5, f2, parseFloat2, 0, i, f, f5, 1, f6, i2);
                                    if (xa3Var != null) {
                                        hashMap2.put(xa3Var.a, xa3Var);
                                    }
                                }
                                i4 = Integer.MIN_VALUE;
                                i2 = i4;
                                xa3Var = new xa3(a5, f2, parseFloat2, 0, i, f, f5, 1, f6, i2);
                                if (xa3Var != null) {
                                }
                            }
                            sa3Var2 = sa3Var;
                            f2 = parseFloat;
                            i = 0;
                            float f62 = 1.0f / sa3Var2.a;
                            a2 = wq3.a(xmlPullParser, "writingMode");
                            if (a2 != null) {
                            }
                            i4 = Integer.MIN_VALUE;
                            i2 = i4;
                            xa3Var = new xa3(a5, f2, parseFloat2, 0, i, f, f5, 1, f62, i2);
                            if (xa3Var != null) {
                            }
                        } else {
                            ji1.d("TtmlDecoder", "Ignoring region without an extent");
                        }
                    } else {
                        ji1.d("TtmlDecoder", "Ignoring region without an origin");
                    }
                }
                xa3Var = null;
                if (xa3Var != null) {
                }
            } else if (wq3.c(xmlPullParser, "metadata")) {
                do {
                    xmlPullParser.next();
                    if (wq3.c(xmlPullParser, "image") && (a = wq3.a(xmlPullParser, "id")) != null) {
                        hashMap3.put(a, xmlPullParser.nextText());
                    }
                } while (!wq3.b(xmlPullParser, "metadata"));
            }
        } while (!wq3.b(xmlPullParser, TtmlNode.TAG_HEAD));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static wa3 a(XmlPullParser xmlPullParser, wa3 wa3Var, HashMap hashMap, ta3 ta3Var) {
        long j;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String[] strArr = null;
        za3 a = a(xmlPullParser, (za3) null);
        String str = null;
        String str2 = "";
        long j2 = C.TIME_UNSET;
        long j3 = C.TIME_UNSET;
        long j4 = C.TIME_UNSET;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals(TtmlNode.TAG_REGION)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals(TtmlNode.END)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals(TtmlNode.TAG_STYLE)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
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
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j4 = a(attributeValue, ta3Var);
                    break;
                case 2:
                    j3 = a(attributeValue, ta3Var);
                    break;
                case 3:
                    j2 = a(attributeValue, ta3Var);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i2 = mc3.a;
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
        if (wa3Var != null) {
            long j5 = wa3Var.d;
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
            } else if (wa3Var != null) {
                long j6 = wa3Var.e;
                if (j6 != C.TIME_UNSET) {
                    j = j6;
                    return new wa3(xmlPullParser.getName(), null, j2, j, a, strArr, str2, str, wa3Var);
                }
            }
        }
        j = j3;
        return new wa3(xmlPullParser.getName(), null, j2, j, a, strArr, str2, str, wa3Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e6, code lost:
    
        if (r3.equals("text") == false) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static za3 a(XmlPullParser xmlPullParser, za3 za3Var) {
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            char c2 = 5;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = 14;
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
                    za3Var = a(za3Var);
                    za3Var.i = TtmlNode.ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    za3Var = a(za3Var);
                    za3Var.a = attributeValue;
                    break;
                case 2:
                    za3Var = a(za3Var);
                    za3Var.o = b(attributeValue);
                    break;
                case 3:
                    String a = ki.a(attributeValue);
                    a.getClass();
                    switch (a) {
                        case "nounderline":
                            za3Var = a(za3Var);
                            za3Var.g = 0;
                            break;
                        case "underline":
                            za3Var = a(za3Var);
                            za3Var.g = 1;
                            break;
                        case "nolinethrough":
                            za3Var = a(za3Var);
                            za3Var.f = 0;
                            break;
                        case "linethrough":
                            za3Var = a(za3Var);
                            za3Var.f = 1;
                            break;
                    }
                case 4:
                    za3Var = a(za3Var);
                    za3Var.h = TtmlNode.BOLD.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        za3Var = a(za3Var);
                        za3Var.l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String a2 = ki.a(attributeValue);
                    a2.getClass();
                    switch (a2.hashCode()) {
                        case -618561360:
                            if (a2.equals("baseContainer")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -410956671:
                            if (a2.equals("container")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -250518009:
                            if (a2.equals("delimiter")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -136074796:
                            if (a2.equals("textContainer")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3016401:
                            if (a2.equals("base")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3556653:
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 4:
                            za3Var = a(za3Var);
                            za3Var.m = 2;
                            break;
                        case 1:
                            za3Var = a(za3Var);
                            za3Var.m = 1;
                            break;
                        case 2:
                            za3Var = a(za3Var);
                            za3Var.m = 4;
                            break;
                        case 3:
                        case 5:
                            za3Var = a(za3Var);
                            za3Var.m = 3;
                            break;
                    }
                case 7:
                    za3Var = a(za3Var);
                    try {
                        za3Var.b = nx.a(attributeValue, false);
                        za3Var.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        ql1.a("Failed parsing color value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case '\b':
                    za3Var = a(za3Var);
                    Matcher matcher = q.matcher(attributeValue);
                    float f = Float.MAX_VALUE;
                    if (!matcher.matches()) {
                        ql1.a("Invalid value for shear: ", attributeValue, "TtmlDecoder");
                    } else {
                        try {
                            String group = matcher.group(1);
                            group.getClass();
                            f = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(group)));
                        } catch (NumberFormatException e) {
                            ji1.d("TtmlDecoder", ji1.a("Failed to parse shear: " + attributeValue, e));
                        }
                    }
                    za3Var.s = f;
                    break;
                case '\t':
                    String a3 = ki.a(attributeValue);
                    a3.getClass();
                    if (a3.equals("all")) {
                        za3Var = a(za3Var);
                        za3Var.q = 1;
                        break;
                    } else if (a3.equals("none")) {
                        za3Var = a(za3Var);
                        za3Var.q = 0;
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        za3Var = a(za3Var);
                        a(attributeValue, za3Var);
                        break;
                    } catch (x53 unused2) {
                        ql1.a("Failed parsing fontSize value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case 11:
                    za3Var = a(za3Var);
                    za3Var.r = z63.a(attributeValue);
                    break;
                case '\f':
                    String a4 = ki.a(attributeValue);
                    a4.getClass();
                    if (a4.equals("before")) {
                        za3Var = a(za3Var);
                        za3Var.n = 1;
                        break;
                    } else if (a4.equals("after")) {
                        za3Var = a(za3Var);
                        za3Var.n = 2;
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    za3Var = a(za3Var);
                    try {
                        za3Var.d = nx.a(attributeValue, false);
                        za3Var.e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        ql1.a("Failed parsing background value: ", attributeValue, "TtmlDecoder");
                        break;
                    }
                case 14:
                    za3Var = a(za3Var);
                    za3Var.p = b(attributeValue);
                    break;
            }
        }
        return za3Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.equals(ru.ok.tracer.base.ucum.UcumUtils.UCUM_MILLISECODS) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long a(String str, ta3 ta3Var) {
        double d;
        double d2;
        Matcher matcher = n.matcher(str);
        char c = 4;
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * TimeUtils.SECONDS_PER_HOUR;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            double d3 = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            double parseDouble = parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / ta3Var.a : 0.0d);
            if (matcher.group(6) != null) {
                d3 = (Long.parseLong(r13) / ta3Var.b) / ta3Var.a;
            }
            return (long) ((parseDouble + d3) * 1000000.0d);
        }
        Matcher matcher2 = o.matcher(str);
        if (matcher2.matches()) {
            String group3 = matcher2.group(1);
            group3.getClass();
            double parseDouble2 = Double.parseDouble(group3);
            String group4 = matcher2.group(2);
            group4.getClass();
            switch (group4.hashCode()) {
                case 102:
                    if (group4.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 104:
                    if (group4.equals("h")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109:
                    if (group4.equals(InneractiveMediationDefs.GENDER_MALE)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (group4.equals("t")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3494:
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    d = ta3Var.a;
                    parseDouble2 /= d;
                    break;
                case 1:
                    d2 = 3600.0d;
                    break;
                case 2:
                    d2 = 60.0d;
                    break;
                case 3:
                    d = ta3Var.c;
                    parseDouble2 /= d;
                    break;
                case 4:
                    d = 1000.0d;
                    parseDouble2 /= d;
                    break;
            }
            parseDouble2 *= d2;
            return (long) (parseDouble2 * 1000000.0d);
        }
        throw new x53(go9.b("Malformed time expression: ", str));
    }
}
