package xsna;

import android.text.TextUtils;
import android.util.Xml;
import androidx.core.app.NotificationCompat;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.csz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class g7z0 {
    public static final String[] o = {MimeTypes.VIDEO_MP4, "application/vnd.apple.mpegurl", "application/x-mpegurl"};
    public final u6z0 a;
    public final jkz0 b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public boolean h;
    public String i;
    public String j;
    public y5z0 k;
    public jkz0 l;
    public String m;
    public fwy n;

    public g7z0(u6z0 u6z0Var, jkz0 jkz0Var) {
        this.a = u6z0Var;
        this.b = jkz0Var;
        this.n = jkz0Var.J;
    }

    public static String a(String str) {
        return str.replaceAll("&amp;", "&").replaceAll("&lt;", "<").replaceAll("&gt;", ">").trim();
    }

    public static float d(String str) {
        long j;
        try {
            if (str.contains(".")) {
                int indexOf = str.indexOf(".");
                j = Long.parseLong(str.substring(indexOf + 1));
                if (j > 1000) {
                    return -1.0f;
                }
                str = str.substring(0, indexOf);
            } else {
                j = 0;
            }
            String[] split = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER, 3);
            long parseInt = Integer.parseInt(split[0]);
            long parseInt2 = Integer.parseInt(split[1]);
            long parseInt3 = Integer.parseInt(split[2]);
            if (parseInt >= 24 || parseInt2 >= 60 || parseInt3 >= 60) {
                return -1.0f;
            }
            return ((parseInt * 3600000) + ((parseInt2 * 60000) + ((parseInt3 * 1000) + j))) / 1000.0f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    public static int j(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.getEventType();
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("VastParser: Error - "), th);
            return Integer.MIN_VALUE;
        }
    }

    public static int l(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("VastParser: Error - "), th);
            return Integer.MIN_VALUE;
        }
    }

    public static int m(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.nextTag();
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("VastParser: Error - "), th);
            return Integer.MIN_VALUE;
        }
    }

    public static String n(XmlPullParser xmlPullParser) {
        String str;
        if (l(xmlPullParser) == 4) {
            str = xmlPullParser.getText();
            m(xmlPullParser);
        } else {
            gu8.c(null, "VastParser: No text - " + xmlPullParser.getName());
            str = "";
        }
        return str.trim();
    }

    public static void o(XmlPullParser xmlPullParser) {
        if (j(xmlPullParser) != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int l = l(xmlPullParser);
            if (l == 2) {
                i++;
            } else if (l == 3) {
                i--;
            }
        }
    }

    public final void b(float f, String str, xey0 xey0Var) {
        e9z0 e9z0Var = new e9z0("playheadReachedValue", str, false);
        e9z0Var.f = -1.0f;
        e9z0Var.g = -1.0f;
        if (xey0Var != null) {
            float f2 = xey0Var.D;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                e9z0Var.f = (f / 100.0f) * f2;
                xey0Var.a.f(e9z0Var);
                return;
            }
        }
        e9z0Var.g = f;
        this.e.add(e9z0Var);
    }

    public final void c(XmlPullParser xmlPullParser, xey0 xey0Var, boolean z) {
        float f;
        while (m(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, NotificationCompat.CATEGORY_EVENT);
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, SignalingProtocol.KEY_OFFSET);
                    if (attributeValue != null) {
                        if (!NotificationCompat.CATEGORY_PROGRESS.equals(attributeValue) || TextUtils.isEmpty(attributeValue2)) {
                            String n = n(xmlPullParser);
                            if ("start".equalsIgnoreCase(attributeValue)) {
                                e(z ? "show" : "playbackStarted", n, xey0Var);
                            } else if ("firstQuartile".equalsIgnoreCase(attributeValue)) {
                                b(25.0f, n, xey0Var);
                            } else if (CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT.equalsIgnoreCase(attributeValue)) {
                                b(50.0f, n, xey0Var);
                            } else if ("thirdQuartile".equalsIgnoreCase(attributeValue)) {
                                b(75.0f, n, xey0Var);
                            } else if (CampaignEx.JSON_NATIVE_VIDEO_COMPLETE.equalsIgnoreCase(attributeValue)) {
                                b(100.0f, n, xey0Var);
                            } else if ("creativeView".equalsIgnoreCase(attributeValue)) {
                                e(z ? "show" : "playbackStarted", n, xey0Var);
                            } else if ("mute".equalsIgnoreCase(attributeValue)) {
                                e("volumeOff", n, xey0Var);
                            } else if ("unmute".equalsIgnoreCase(attributeValue)) {
                                e("volumeOn", n, xey0Var);
                            } else if ("pause".equalsIgnoreCase(attributeValue)) {
                                e("playbackPaused", n, xey0Var);
                            } else if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equalsIgnoreCase(attributeValue)) {
                                e("playbackResumed", n, xey0Var);
                            } else if ("fullscreen".equalsIgnoreCase(attributeValue)) {
                                e("fullscreenOn", n, xey0Var);
                            } else if ("exitFullscreen".equalsIgnoreCase(attributeValue)) {
                                e("fullscreenOff", n, xey0Var);
                            } else if (FreeSpaceBox.TYPE.equalsIgnoreCase(attributeValue)) {
                                e("closedByUser", n, xey0Var);
                            } else if ("error".equalsIgnoreCase(attributeValue)) {
                                e("error", n, xey0Var);
                            } else if ("ClickTracking".equalsIgnoreCase(attributeValue)) {
                                e("click", n, xey0Var);
                            } else if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(attributeValue)) {
                                e("closedByUser", n, xey0Var);
                            } else if ("closeLinear".equalsIgnoreCase(attributeValue)) {
                                e("closedByUser", n, xey0Var);
                            }
                        } else if (attributeValue2.endsWith("%")) {
                            try {
                                b(Integer.parseInt(attributeValue2.replace("%", "")), n(xmlPullParser), xey0Var);
                            } catch (Throwable unused) {
                                gu8.c(null, "VastParser: Unable to parse progress stat with value ".concat(attributeValue2));
                            }
                        } else {
                            String n2 = n(xmlPullParser);
                            try {
                                f = d(attributeValue2);
                            } catch (Throwable unused2) {
                                f = -1.0f;
                            }
                            if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                e9z0 e9z0Var = new e9z0("playheadReachedValue", n2, false);
                                e9z0Var.g = -1.0f;
                                e9z0Var.f = f;
                                if (xey0Var != null) {
                                    xey0Var.a.f(e9z0Var);
                                } else {
                                    this.d.add(e9z0Var);
                                }
                            } else {
                                gu8.c(null, "VastParser: Unable to parse progress stat with value ".concat(attributeValue2));
                            }
                        }
                    }
                    gu8.c(null, "VastParser: Added VAST tracking \"" + attributeValue + "\"");
                } else {
                    o(xmlPullParser);
                }
            }
        }
    }

    public final void e(String str, String str2, xey0 xey0Var) {
        if (xey0Var != null) {
            xey0Var.a.f(new z1z0(str, str2, false));
        } else {
            this.d.add(new z1z0(str, str2, false));
        }
    }

    public final void f(XmlPullParser xmlPullParser) {
        while (m(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
                    String str = null;
                    String str2 = null;
                    while (m(xmlPullParser) == 2) {
                        if (j(xmlPullParser) == 2) {
                            String name = xmlPullParser.getName();
                            if ("JavaScriptResource".equals(name)) {
                                str = n(xmlPullParser);
                            } else if ("VerificationParameters".equals(name)) {
                                str2 = n(xmlPullParser);
                            } else {
                                o(xmlPullParser);
                            }
                        }
                    }
                    if (str != null) {
                        if (this.n == null) {
                            this.n = new fwy(null, null);
                        }
                        ((ArrayList) this.n.e).add((TextUtils.isEmpty(attributeValue) || TextUtils.isEmpty(str2)) ? new j9z0(str, null, null) : new j9z0(str, attributeValue, str2));
                    }
                } else {
                    o(xmlPullParser);
                }
            }
        }
    }

    public final void g(String str) {
        String str2;
        XmlPullParser newPullParser = Xml.newPullParser();
        String str3 = null;
        try {
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(new StringReader(str));
            jkz0 jkz0Var = this.b;
            ArrayList arrayList = jkz0Var.e;
            e5z0 e5z0Var = jkz0Var.d;
            ArrayList arrayList2 = arrayList != null ? new ArrayList(jkz0Var.e) : null;
            ArrayList arrayList3 = this.c;
            if (arrayList2 != null) {
                arrayList3.addAll(arrayList2);
            }
            ArrayList arrayList4 = jkz0Var.f;
            ArrayList arrayList5 = this.f;
            if (arrayList4 != null) {
                arrayList5.addAll(arrayList4);
            }
            int j = j(newPullParser);
            while (true) {
                boolean z = true;
                if (j == 1 || j == Integer.MIN_VALUE) {
                    return;
                }
                int i = 2;
                if (j == 2 && "VAST".equalsIgnoreCase(newPullParser.getName())) {
                    while (m(newPullParser) == i) {
                        if (j(newPullParser) == i && "Ad".equals(newPullParser.getName())) {
                            while (m(newPullParser) == i) {
                                if (j(newPullParser) == i) {
                                    String name = newPullParser.getName();
                                    boolean equals = "Wrapper".equals(name);
                                    ArrayList arrayList6 = this.e;
                                    ArrayList arrayList7 = this.d;
                                    if (equals) {
                                        this.h = z;
                                        gu8.c(str3, "VastParser: VAST file contains wrapped ad information");
                                        int i2 = jkz0Var.m;
                                        if (i2 < 5) {
                                            String str4 = str3;
                                            while (m(newPullParser) == 2) {
                                                if (j(newPullParser) == 2) {
                                                    String name2 = newPullParser.getName();
                                                    if ("Impression".equals(name2)) {
                                                        k(newPullParser);
                                                    } else if ("Creatives".equals(name2)) {
                                                        h(newPullParser);
                                                    } else if ("Extensions".equals(name2)) {
                                                        i(newPullParser);
                                                    } else if ("VASTAdTagURI".equals(name2)) {
                                                        str4 = n(newPullParser);
                                                    } else if ("AdVerifications".equals(name2)) {
                                                        f(newPullParser);
                                                    } else {
                                                        o(newPullParser);
                                                    }
                                                }
                                            }
                                            if (str4 != null) {
                                                String str5 = jkz0Var.i;
                                                String str6 = jkz0Var.j;
                                                y5z0 y5z0Var = jkz0Var.k;
                                                jkz0 jkz0Var2 = new jkz0(str4, null);
                                                this.l = jkz0Var2;
                                                jkz0Var2.m = i2 + 1;
                                                jkz0Var2.e = arrayList3;
                                                jkz0Var2.J = this.n;
                                                if (TextUtils.isEmpty(str5)) {
                                                    str5 = this.i;
                                                }
                                                jkz0Var2.i = str5;
                                                jkz0 jkz0Var3 = this.l;
                                                if (TextUtils.isEmpty(str6)) {
                                                    str6 = this.j;
                                                }
                                                jkz0Var3.j = str6;
                                                jkz0 jkz0Var4 = this.l;
                                                if (y5z0Var == null) {
                                                    y5z0Var = this.k;
                                                }
                                                jkz0Var4.k = y5z0Var;
                                                jkz0Var4.f = arrayList5;
                                                jkz0Var4.x = jkz0Var.x;
                                                jkz0Var4.y = jkz0Var.y;
                                                jkz0Var4.z = jkz0Var.z;
                                                jkz0Var4.A = jkz0Var.A;
                                                jkz0Var4.B = jkz0Var.B;
                                                jkz0Var4.C = jkz0Var.C;
                                                jkz0Var4.D = jkz0Var.D;
                                                jkz0Var4.w = jkz0Var.w;
                                                jkz0Var4.E = jkz0Var.E;
                                                jkz0Var4.K = jkz0Var.K;
                                                jkz0Var4.l = jkz0Var.l;
                                                e5z0 e5z0Var2 = jkz0Var4.d;
                                                e5z0Var2.e(arrayList7);
                                                e5z0Var2.e.addAll(arrayList6);
                                                e5z0Var2.g(e5z0Var, -1.0f);
                                                jkz0Var.b.add(this.l);
                                                str2 = null;
                                            } else {
                                                str2 = null;
                                                gu8.c(null, "VastParser: Got VAST wrapper, but no vastAdTagUri");
                                            }
                                        } else {
                                            str2 = str3;
                                            gu8.c(str2, "VastParser: Got VAST wrapper, but max redirects limit exceeded");
                                            o(newPullParser);
                                        }
                                        str3 = str2;
                                        z = true;
                                        i = 2;
                                    } else {
                                        String str7 = str3;
                                        if ("InLine".equals(name)) {
                                            int i3 = 0;
                                            this.h = false;
                                            gu8.c(str7, "VastParser: VAST file contains inline ad information.");
                                            while (m(newPullParser) == 2) {
                                                if (j(newPullParser) == 2) {
                                                    String name3 = newPullParser.getName();
                                                    if ("Impression".equals(name3)) {
                                                        k(newPullParser);
                                                    } else if ("Creatives".equals(name3)) {
                                                        h(newPullParser);
                                                    } else if ("Extensions".equals(name3)) {
                                                        i(newPullParser);
                                                    } else if ("AdVerifications".equals(name3)) {
                                                        f(newPullParser);
                                                    } else {
                                                        o(newPullParser);
                                                    }
                                                }
                                            }
                                            int i4 = 0;
                                            while (true) {
                                                ArrayList arrayList8 = this.g;
                                                if (i4 >= arrayList8.size()) {
                                                    break;
                                                }
                                                lgz0 lgz0Var = (lgz0) arrayList8.get(i4);
                                                e5z0 e5z0Var3 = lgz0Var.a;
                                                e5z0Var3.g(e5z0Var, lgz0Var.D);
                                                String str8 = jkz0Var.i;
                                                if (TextUtils.isEmpty(str8)) {
                                                    str8 = this.i;
                                                }
                                                lgz0Var.d = str8;
                                                lgz0Var.x0 = TextUtils.isEmpty(null) ? this.m : null;
                                                String str9 = jkz0Var.j;
                                                if (TextUtils.isEmpty(str9)) {
                                                    str9 = this.j;
                                                }
                                                lgz0Var.e = str9;
                                                y5z0 y5z0Var2 = jkz0Var.k;
                                                if (y5z0Var2 == null) {
                                                    y5z0Var2 = this.k;
                                                }
                                                lgz0Var.f0 = y5z0Var2;
                                                int size = arrayList6.size();
                                                int i5 = i3;
                                                while (i5 < size) {
                                                    Object obj = arrayList6.get(i5);
                                                    i5++;
                                                    e9z0 e9z0Var = (e9z0) obj;
                                                    b(e9z0Var.g, e9z0Var.b, lgz0Var);
                                                }
                                                e5z0Var3.e(arrayList7);
                                                int size2 = arrayList5.size();
                                                int i6 = 0;
                                                while (i6 < size2) {
                                                    Object obj2 = arrayList5.get(i6);
                                                    i6++;
                                                    lgz0Var.U.add((n4z0) obj2);
                                                }
                                                if (i4 == 0) {
                                                    e5z0Var3.e(arrayList3);
                                                    int size3 = arrayList5.size();
                                                    int i7 = 0;
                                                    while (i7 < size3) {
                                                        Object obj3 = arrayList5.get(i7);
                                                        i7++;
                                                        e5z0 e5z0Var4 = ((n4z0) obj3).a;
                                                        e5z0Var4.getClass();
                                                        e5z0Var4.e(e5z0Var.l("click"));
                                                        e5z0Var4.e(e5z0Var.l("ctaClick"));
                                                        e5z0Var4.e(e5z0Var.l("closedByUser"));
                                                    }
                                                }
                                                lgz0Var.M = this.n;
                                                i4++;
                                                i3 = 0;
                                            }
                                            i = 2;
                                            str3 = null;
                                        } else {
                                            o(newPullParser);
                                            i = 2;
                                            str3 = null;
                                        }
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                j = l(newPullParser);
                str3 = null;
            }
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("VastParser: Unable to parse VAST - "), th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x042e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(XmlPullParser xmlPullParser) {
        int i;
        boolean z;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        lgz0 lgz0Var;
        String str5;
        Object obj;
        String str6;
        float f;
        float f2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        sgz0 sgz0Var;
        int i3;
        int i4;
        String str15;
        Object obj2;
        dbz0 dbz0Var;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        while (true) {
            int i5 = 2;
            if (m(xmlPullParser) != 2) {
                return;
            }
            if (j(xmlPullParser) == 2) {
                if ("Creative".equals(xmlPullParser.getName())) {
                    String str23 = null;
                    String str24 = "id";
                    String attributeValue = xmlPullParser.getAttributeValue(null, "id");
                    Object obj3 = null;
                    String str25 = null;
                    String str26 = null;
                    boolean z2 = false;
                    int i6 = 0;
                    while (m(xmlPullParser) == i5) {
                        if (j(xmlPullParser) == i5) {
                            String name = xmlPullParser.getName();
                            String str27 = "type";
                            if ("CreativeExtensions".equals(name)) {
                                while (m(xmlPullParser) == i5) {
                                    if (j(xmlPullParser) == i5) {
                                        if ("CreativeExtension".equals(xmlPullParser.getName())) {
                                            String attributeValue2 = xmlPullParser.getAttributeValue(str23, "type");
                                            if ("adChoices".equals(attributeValue2)) {
                                                gu8.c(str23, "VastParser: Found adChoices for creative (id = " + attributeValue + ")");
                                                String a = a(n(xmlPullParser));
                                                if (TextUtils.isEmpty(a)) {
                                                    gu8.e(str23, "VastParser: Error: VAST adChoices declared but it's content is empty");
                                                } else if (obj3 != null) {
                                                    gu8.e(str23, "VastParser: Error: VAST adChoices declared but it's content is empty for creativeId = " + attributeValue);
                                                } else {
                                                    try {
                                                        Object a2 = c6z0.a(new JSONObject(a));
                                                        gu8.c(str23, "VastParser: Parsed adChoices for creative (id = " + attributeValue + ")");
                                                        obj3 = a2;
                                                    } catch (JSONException e) {
                                                        gu8.e(str23, "VastParser: VAST adChoices json error: " + e.getMessage());
                                                        obj3 = str23;
                                                    }
                                                }
                                            } else if ("adDisclaimer".equals(attributeValue2)) {
                                                gu8.c(str23, "VastParser: Found adDisclaimer for creative (id = " + attributeValue + ")");
                                                String n = n(xmlPullParser);
                                                if (TextUtils.isEmpty(n)) {
                                                    gu8.e(str23, "VastParser: Error: VAST adDisclaimer declared but it's content is empty");
                                                } else if (str25 != null) {
                                                    gu8.e(str23, "VastParser: Error: VAST duplicate adDisclaimer for creativeId = " + attributeValue);
                                                } else {
                                                    str25 = n;
                                                }
                                            } else if ("adAgeRestriction".equals(attributeValue2)) {
                                                gu8.c(str23, "VastParser: Found adAgeRestrictions for creative (id = " + attributeValue + ")");
                                                String n2 = n(xmlPullParser);
                                                if (TextUtils.isEmpty(n2)) {
                                                    gu8.e(str23, "VastParser: Error: VAST ageRestrictions declared but it's content is empty");
                                                } else if (str26 != null) {
                                                    gu8.e(str23, "VastParser: Error: VAST duplicate ageRestrictions for creativeId = " + attributeValue);
                                                } else {
                                                    str26 = n2;
                                                }
                                            } else {
                                                o(xmlPullParser);
                                            }
                                        } else {
                                            o(xmlPullParser);
                                        }
                                    }
                                }
                            } else {
                                boolean z3 = true;
                                String str28 = "height";
                                String str29 = "TrackingEvents";
                                if ("Linear".equals(name)) {
                                    if (this.h) {
                                        z = z2;
                                        str4 = null;
                                        lgz0Var = null;
                                    } else {
                                        z = z2;
                                        str4 = null;
                                        lgz0Var = new lgz0(giy0.d, null);
                                        lgz0Var.F = attributeValue != null ? attributeValue : "";
                                    }
                                    String attributeValue3 = xmlPullParser.getAttributeValue(str4, "skipoffset");
                                    while (true) {
                                        i2 = i6;
                                        if (m(xmlPullParser) != 2) {
                                            str = str26;
                                            break;
                                        }
                                        String name2 = xmlPullParser.getName();
                                        str = str26;
                                        if (j(xmlPullParser) == 2) {
                                            if ("Duration".equals(name2)) {
                                                if (lgz0Var != null) {
                                                    try {
                                                        f = d(n(xmlPullParser));
                                                    } catch (Throwable unused) {
                                                        f = 0.0f;
                                                    }
                                                    if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                        break;
                                                    }
                                                    lgz0Var.D = f;
                                                    if (attributeValue3 != null) {
                                                        if (attributeValue3.contains("%")) {
                                                            int parseInt = Integer.parseInt(attributeValue3.substring(0, attributeValue3.length() - 1));
                                                            gu8.c(null, "VastParser: Linear skipoffset is " + attributeValue3 + " [%]");
                                                            f2 = (lgz0Var.D / 100.0f) * ((float) parseInt);
                                                        } else if (attributeValue3.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                                                            try {
                                                                f2 = d(attributeValue3);
                                                            } catch (Throwable unused2) {
                                                                StringBuilder a3 = t33.a("VastParser: Failed to convert ISO time skipoffset string ", attributeValue3, " with banner id ");
                                                                a3.append(lgz0Var.F);
                                                                gu8.f(null, a3.toString());
                                                            }
                                                        }
                                                        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                            lgz0Var.q0 = f2;
                                                        }
                                                    }
                                                    f2 = -1.0f;
                                                    if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                    }
                                                }
                                            } else if (str29.equals(name2)) {
                                                c(xmlPullParser, lgz0Var, false);
                                            } else {
                                                if (!"MediaFiles".equals(name2)) {
                                                    str7 = attributeValue3;
                                                    str8 = str29;
                                                    str5 = str24;
                                                    str9 = str28;
                                                    obj = obj3;
                                                    str6 = str25;
                                                    str10 = str27;
                                                    if ("VideoClicks".equals(name2)) {
                                                        while (m(xmlPullParser) == 2) {
                                                            if (j(xmlPullParser) == 2) {
                                                                String name3 = xmlPullParser.getName();
                                                                if ("ClickThrough".equals(name3)) {
                                                                    if (lgz0Var != null) {
                                                                        String n3 = n(xmlPullParser);
                                                                        if (!TextUtils.isEmpty(n3)) {
                                                                            lgz0Var.J = a(n3);
                                                                        }
                                                                    }
                                                                } else if ("ClickTracking".equals(name3)) {
                                                                    String n4 = n(xmlPullParser);
                                                                    if (!TextUtils.isEmpty(n4)) {
                                                                        this.d.add(new z1z0("click", n4, false));
                                                                    }
                                                                } else {
                                                                    o(xmlPullParser);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        o(xmlPullParser);
                                                    }
                                                } else if (lgz0Var != null) {
                                                    boolean equals = "instreamads".equals(this.a.h);
                                                    String str30 = BadConnectionSignaling.KEY_BAD_NET_BITRATE;
                                                    str7 = attributeValue3;
                                                    String str31 = "MediaFile";
                                                    if (!equals) {
                                                        str6 = str25;
                                                        if (!"fullscreen".equals(this.a.h) && !"rewarded".equals(this.a.h)) {
                                                            if ("instreamaudioads".equals(this.a.h)) {
                                                                while (m(xmlPullParser) == 2) {
                                                                    if (j(xmlPullParser) == 2) {
                                                                        if ("MediaFile".equals(xmlPullParser.getName())) {
                                                                            String attributeValue4 = xmlPullParser.getAttributeValue(null, str27);
                                                                            String attributeValue5 = xmlPullParser.getAttributeValue(null, BadConnectionSignaling.KEY_BAD_NET_BITRATE);
                                                                            String a4 = a(n(xmlPullParser));
                                                                            if (TextUtils.isEmpty(attributeValue4) || TextUtils.isEmpty(a4)) {
                                                                                str15 = str29;
                                                                                obj2 = obj3;
                                                                            } else {
                                                                                obj2 = obj3;
                                                                                str15 = str29;
                                                                                if (attributeValue4.toLowerCase(Locale.ROOT).trim().startsWith("audio")) {
                                                                                    if (attributeValue5 != null) {
                                                                                        try {
                                                                                            Integer.parseInt(attributeValue5);
                                                                                        } catch (Throwable unused3) {
                                                                                        }
                                                                                    }
                                                                                    dbz0Var = new dbz0(a4, null);
                                                                                    if (dbz0Var != null) {
                                                                                        gu8.c(null, "VastParser: Skipping unsupported VAST file (mimetype=" + attributeValue4 + ",url=" + a4);
                                                                                    } else {
                                                                                        lgz0Var.v0 = dbz0Var;
                                                                                    }
                                                                                    obj3 = obj2;
                                                                                    str29 = str15;
                                                                                }
                                                                            }
                                                                            dbz0Var = null;
                                                                            if (dbz0Var != null) {
                                                                            }
                                                                            obj3 = obj2;
                                                                            str29 = str15;
                                                                        } else {
                                                                            o(xmlPullParser);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            str8 = str29;
                                                            obj = obj3;
                                                            str5 = str24;
                                                            str9 = str28;
                                                            str10 = str27;
                                                            if (lgz0Var.v0 == null) {
                                                                gu8.c(null, "VastParser: Unable to find valid mediafile!");
                                                                break;
                                                            }
                                                        } else {
                                                            str8 = str29;
                                                            obj = obj3;
                                                        }
                                                    } else {
                                                        str8 = str29;
                                                        obj = obj3;
                                                        str6 = str25;
                                                    }
                                                    ArrayList arrayList = new ArrayList();
                                                    while (m(xmlPullParser) == 2) {
                                                        if (j(xmlPullParser) == 2) {
                                                            if (str31.equals(xmlPullParser.getName())) {
                                                                String attributeValue6 = xmlPullParser.getAttributeValue(null, str27);
                                                                String attributeValue7 = xmlPullParser.getAttributeValue(null, str30);
                                                                String str32 = str31;
                                                                String attributeValue8 = xmlPullParser.getAttributeValue(null, "width");
                                                                String attributeValue9 = xmlPullParser.getAttributeValue(null, str28);
                                                                String a5 = a(n(xmlPullParser));
                                                                if (TextUtils.isEmpty(attributeValue6) || TextUtils.isEmpty(a5)) {
                                                                    str11 = str24;
                                                                    str12 = str28;
                                                                    str13 = str30;
                                                                    str14 = str27;
                                                                } else {
                                                                    String[] strArr = o;
                                                                    str13 = str30;
                                                                    str14 = str27;
                                                                    int i7 = 0;
                                                                    while (true) {
                                                                        if (i7 >= 3) {
                                                                            break;
                                                                        }
                                                                        if (strArr[i7].equals(attributeValue6)) {
                                                                            if (attributeValue8 != null) {
                                                                                try {
                                                                                    i3 = Integer.parseInt(attributeValue8);
                                                                                } catch (Throwable unused4) {
                                                                                    i3 = 0;
                                                                                    i4 = 0;
                                                                                    if (i3 > 0) {
                                                                                        str11 = str24;
                                                                                        str12 = str28;
                                                                                        sgz0Var = new sgz0(a5, i3, i4, null);
                                                                                        if (sgz0Var != null) {
                                                                                        }
                                                                                        str31 = str32;
                                                                                        str30 = str13;
                                                                                        str27 = str14;
                                                                                        str24 = str11;
                                                                                        str28 = str12;
                                                                                    }
                                                                                    str11 = str24;
                                                                                    str12 = str28;
                                                                                    sgz0Var = null;
                                                                                    if (sgz0Var != null) {
                                                                                    }
                                                                                    str31 = str32;
                                                                                    str30 = str13;
                                                                                    str27 = str14;
                                                                                    str24 = str11;
                                                                                    str28 = str12;
                                                                                }
                                                                            } else {
                                                                                i3 = 0;
                                                                            }
                                                                            if (attributeValue9 != null) {
                                                                                try {
                                                                                    i4 = Integer.parseInt(attributeValue9);
                                                                                } catch (Throwable unused5) {
                                                                                    i4 = 0;
                                                                                    if (i3 > 0) {
                                                                                    }
                                                                                    str11 = str24;
                                                                                    str12 = str28;
                                                                                    sgz0Var = null;
                                                                                    if (sgz0Var != null) {
                                                                                    }
                                                                                    str31 = str32;
                                                                                    str30 = str13;
                                                                                    str27 = str14;
                                                                                    str24 = str11;
                                                                                    str28 = str12;
                                                                                }
                                                                            } else {
                                                                                i4 = 0;
                                                                            }
                                                                            if (attributeValue7 != null) {
                                                                                try {
                                                                                    Integer.parseInt(attributeValue7);
                                                                                } catch (Throwable unused6) {
                                                                                }
                                                                            }
                                                                            if (i3 > 0 && i4 > 0) {
                                                                                str11 = str24;
                                                                                str12 = str28;
                                                                                sgz0Var = new sgz0(a5, i3, i4, null);
                                                                            }
                                                                        } else {
                                                                            i7++;
                                                                        }
                                                                    }
                                                                    str11 = str24;
                                                                    str12 = str28;
                                                                }
                                                                sgz0Var = null;
                                                                if (sgz0Var != null) {
                                                                    StringBuilder a6 = xe9.a("VastParser: Skipping unsupported VAST file (mimeType=", attributeValue6, ",width=", attributeValue8, ",height=");
                                                                    a6.append(attributeValue9);
                                                                    a6.append(",url=");
                                                                    a6.append(a5);
                                                                    gu8.c(null, a6.toString());
                                                                } else {
                                                                    arrayList.add(sgz0Var);
                                                                }
                                                                str31 = str32;
                                                                str30 = str13;
                                                                str27 = str14;
                                                                str24 = str11;
                                                                str28 = str12;
                                                            } else {
                                                                o(xmlPullParser);
                                                            }
                                                        }
                                                    }
                                                    str5 = str24;
                                                    str9 = str28;
                                                    str10 = str27;
                                                    lgz0Var.v0 = sgz0.a(this.a.d, arrayList);
                                                    if (lgz0Var.v0 == null) {
                                                    }
                                                }
                                                i6 = i2;
                                                str26 = str;
                                                attributeValue3 = str7;
                                                str25 = str6;
                                                obj3 = obj;
                                                str29 = str8;
                                                str27 = str10;
                                                str24 = str5;
                                                str28 = str9;
                                            }
                                        }
                                        i6 = i2;
                                        str26 = str;
                                    }
                                    str5 = str24;
                                    obj = obj3;
                                    str6 = str25;
                                    if (lgz0Var != null) {
                                        if (lgz0Var.D <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            str2 = null;
                                            gu8.e(null, "VastParser: Error: VAST has no valid Duration with banner id " + lgz0Var.F);
                                        } else if (lgz0Var.v0 != null) {
                                            this.g.add(lgz0Var);
                                            z2 = true;
                                            i6 = i2;
                                            str26 = str;
                                            str25 = str6;
                                            obj3 = obj;
                                            str24 = str5;
                                            i5 = 2;
                                            str23 = null;
                                        } else {
                                            str2 = null;
                                            gu8.e(null, "VastParser: Error: VAST has no valid mediaData with banner id " + lgz0Var.F);
                                        }
                                        str25 = str6;
                                        obj3 = obj;
                                        str3 = str5;
                                        i = 2;
                                    } else {
                                        str25 = str6;
                                        obj3 = obj;
                                        str3 = str5;
                                        i = 2;
                                        str2 = null;
                                    }
                                    i5 = i;
                                    str23 = str2;
                                    str24 = str3;
                                    z2 = z;
                                    i6 = i2;
                                    str26 = str;
                                } else {
                                    String str33 = "TrackingEvents";
                                    String str34 = str24;
                                    String str35 = "height";
                                    z = z2;
                                    i2 = i6;
                                    Object obj4 = obj3;
                                    String str36 = str25;
                                    str = str26;
                                    str2 = null;
                                    if (name == null || !name.equals("CompanionAds")) {
                                        str3 = str34;
                                        i = 2;
                                        o(xmlPullParser);
                                        str25 = str36;
                                        obj3 = obj4;
                                        i5 = i;
                                        str23 = str2;
                                        str24 = str3;
                                        z2 = z;
                                        i6 = i2;
                                        str26 = str;
                                    } else {
                                        String attributeValue10 = xmlPullParser.getAttributeValue(null, "required");
                                        if (attributeValue10 == null || "all".equals(attributeValue10) || "any".equals(attributeValue10) || "none".equals(attributeValue10)) {
                                            str16 = attributeValue10;
                                        } else {
                                            gu8.e(null, "VastParser: Error: Wrong companion required attribute: " + attributeValue10 + "with banner id " + attributeValue);
                                            str16 = null;
                                        }
                                        int size = this.f.size();
                                        while (m(xmlPullParser) == 2) {
                                            if (j(xmlPullParser) != 2) {
                                                str18 = str34;
                                                str19 = str35;
                                            } else {
                                                String name4 = xmlPullParser.getName();
                                                if (name4 == null || !name4.equals("Companion")) {
                                                    str17 = str33;
                                                    str18 = str34;
                                                    str19 = str35;
                                                    o(xmlPullParser);
                                                    str35 = str19;
                                                    str34 = str18;
                                                    str33 = str17;
                                                    z3 = true;
                                                } else {
                                                    String attributeValue11 = xmlPullParser.getAttributeValue(null, "width");
                                                    str19 = str35;
                                                    String attributeValue12 = xmlPullParser.getAttributeValue(null, str19);
                                                    str18 = str34;
                                                    String attributeValue13 = xmlPullParser.getAttributeValue(null, str18);
                                                    n4z0 n4z0Var = new n4z0();
                                                    if (attributeValue13 == null) {
                                                        attributeValue13 = "";
                                                    }
                                                    n4z0Var.F = attributeValue13;
                                                    try {
                                                        n4z0Var.B = Integer.parseInt(attributeValue11);
                                                        n4z0Var.C = Integer.parseInt(attributeValue12);
                                                        str20 = null;
                                                    } catch (Throwable unused7) {
                                                        str20 = null;
                                                        gu8.e(null, "VastParser: Error: Unable  to convert required companion attributes, width = " + attributeValue11 + " height = " + attributeValue12);
                                                    }
                                                    n4z0Var.d0 = str16;
                                                    String attributeValue14 = xmlPullParser.getAttributeValue(str20, "assetWidth");
                                                    String attributeValue15 = xmlPullParser.getAttributeValue(str20, "assetHeight");
                                                    try {
                                                        if (!TextUtils.isEmpty(attributeValue14)) {
                                                            n4z0Var.U = Integer.parseInt(attributeValue14);
                                                        }
                                                        if (!TextUtils.isEmpty(attributeValue15)) {
                                                            n4z0Var.V = Integer.parseInt(attributeValue15);
                                                        }
                                                        str21 = null;
                                                    } catch (Throwable th) {
                                                        str21 = null;
                                                        eb3.a(null, new StringBuilder("VastParser: Wrong VAST asset dimensions - "), th);
                                                    }
                                                    String attributeValue16 = xmlPullParser.getAttributeValue(str21, "expandedWidth");
                                                    String attributeValue17 = xmlPullParser.getAttributeValue(str21, "expandedHeight");
                                                    try {
                                                        if (!TextUtils.isEmpty(attributeValue16)) {
                                                            n4z0Var.W = Integer.parseInt(attributeValue16);
                                                        }
                                                        if (!TextUtils.isEmpty(attributeValue17)) {
                                                            n4z0Var.X = Integer.parseInt(attributeValue17);
                                                        }
                                                        str22 = null;
                                                    } catch (Throwable th2) {
                                                        str22 = null;
                                                        eb3.a(null, new StringBuilder("VastParser: Wrong VAST expanded dimensions "), th2);
                                                    }
                                                    n4z0Var.c0 = xmlPullParser.getAttributeValue(str22, "adSlotID");
                                                    n4z0Var.b0 = xmlPullParser.getAttributeValue(str22, "apiFramework");
                                                    this.f.add(n4z0Var);
                                                    while (m(xmlPullParser) == 2) {
                                                        String name5 = xmlPullParser.getName();
                                                        if ("StaticResource".equals(name5)) {
                                                            n4z0Var.Y = s770.b(n(xmlPullParser));
                                                        } else if ("HTMLResource".equals(name5)) {
                                                            n4z0Var.a0 = s770.b(n(xmlPullParser));
                                                        } else if ("IFrameResource".equals(name5)) {
                                                            n4z0Var.Z = s770.b(n(xmlPullParser));
                                                        } else if ("CompanionClickThrough".equals(name5)) {
                                                            String n5 = n(xmlPullParser);
                                                            if (!TextUtils.isEmpty(n5)) {
                                                                n4z0Var.J = a(n5);
                                                            }
                                                        } else if ("CompanionClickTracking".equals(name5)) {
                                                            String n6 = n(xmlPullParser);
                                                            if (!TextUtils.isEmpty(n6)) {
                                                                n4z0Var.a.f(new z1z0("click", n6, false));
                                                            }
                                                        } else {
                                                            String str37 = str33;
                                                            if (str37.equals(name5)) {
                                                                c(xmlPullParser, n4z0Var, z3);
                                                                str33 = str37;
                                                            } else {
                                                                o(xmlPullParser);
                                                                str33 = str37;
                                                                z3 = true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            str17 = str33;
                                            str35 = str19;
                                            str34 = str18;
                                            str33 = str17;
                                            z3 = true;
                                        }
                                        int size2 = this.f.size() - size;
                                        gu8.c(null, "VastParser: parsed " + size2 + " companion banners");
                                        i5 = 2;
                                        str23 = null;
                                        str24 = str34;
                                        z2 = z;
                                        str26 = str;
                                        str25 = str36;
                                        obj3 = obj4;
                                        i6 = size2;
                                    }
                                }
                            }
                        }
                        i = i5;
                        z = z2;
                        i2 = i6;
                        str = str26;
                        str2 = str23;
                        str3 = str24;
                        i5 = i;
                        str23 = str2;
                        str24 = str3;
                        z2 = z;
                        i6 = i2;
                        str26 = str;
                    }
                    boolean z4 = z2;
                    int i8 = i6;
                    wty0 wty0Var = obj3;
                    String str38 = str25;
                    String str39 = str26;
                    ArrayList arrayList2 = this.f;
                    if (z4) {
                        lgz0 lgz0Var2 = (lgz0) xy9.b(1, this.g);
                        if (wty0Var != 0) {
                            lgz0Var2.L = wty0Var;
                        }
                        if (str38 != null) {
                            lgz0Var2.g = str38;
                        }
                        if (str39 != null) {
                            lgz0Var2.h = str39;
                        }
                    } else {
                        for (int size3 = arrayList2.size() - i8; size3 < arrayList2.size(); size3++) {
                            n4z0 n4z0Var2 = (n4z0) arrayList2.get(size3);
                            if (wty0Var != 0) {
                                n4z0Var2.L = wty0Var;
                            }
                            if (str38 != null) {
                                n4z0Var2.g = str38;
                            }
                            if (str39 != null) {
                                n4z0Var2.h = str39;
                            }
                        }
                    }
                } else {
                    o(xmlPullParser);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(XmlPullParser xmlPullParser) {
        csz0 a;
        while (m(xmlPullParser) == 2) {
            if (j(xmlPullParser) == 2) {
                if ("Extension".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if ("linkTxt".equals(attributeValue)) {
                        String n = n(xmlPullParser);
                        this.i = s770.b(n);
                        wga0.b("VastParser: VAST linkTxt raw text: ", n, null);
                    } else if ("erid".equals(attributeValue)) {
                        this.m = s770.b(n(xmlPullParser));
                        qjk0.a(new StringBuilder("VastParser: ERID text: "), this.m, null);
                    } else if (yads.n5.a.equals(attributeValue)) {
                        String n2 = n(xmlPullParser);
                        if (!TextUtils.isEmpty(n2)) {
                            try {
                                a = new i8z0().a(new JSONObject(n2));
                                gu8.c(null, "VastParser: Parsed yandex_ad_info: " + a);
                            } catch (JSONException e) {
                                gu8.c(null, "VastParser: Failed to parse yandex_ad_info: " + e);
                            }
                            if (a != null) {
                                csz0.b bVar = a.a;
                                this.j = bVar.c;
                                List list = a.b.a;
                                if (list != null && !list.isEmpty()) {
                                    this.k = new y5z0(bVar.a, 3.0d, false, y5z0.f, kiw.b(((csz0.a.C2681a) list.get(0)).b, ((csz0.a.C2681a) list.get(0)).c, ((csz0.a.C2681a) list.get(0)).a));
                                }
                            }
                            gu8.c(null, "VastParser: VAST yandex_ad_info additional text: " + this.j);
                            gu8.c(null, "VastParser: VAST yandex_ad_info postView: " + this.k);
                        }
                        a = null;
                        if (a != null) {
                        }
                        gu8.c(null, "VastParser: VAST yandex_ad_info additional text: " + this.j);
                        gu8.c(null, "VastParser: VAST yandex_ad_info postView: " + this.k);
                    }
                    o(xmlPullParser);
                } else {
                    o(xmlPullParser);
                }
            }
        }
    }

    public final void k(XmlPullParser xmlPullParser) {
        String n = n(xmlPullParser);
        if (TextUtils.isEmpty(n)) {
            return;
        }
        this.c.add(new z1z0("playbackStarted", n, false));
        qjk0.a(new StringBuilder("VastParser: Impression tracker url for wrapper - "), n, null);
    }
}
