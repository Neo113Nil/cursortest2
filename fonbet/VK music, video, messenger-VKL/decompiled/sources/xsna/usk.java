package xsna;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import xsna.fi20;
import xsna.wsk;

/* compiled from: DashManifestExtensionsParser.kt */
/* loaded from: classes8.dex */
public class usk extends wsk {
    public final boolean g;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final Set<Object> i = Collections.singleton(new zq70());

    public usk(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x029f A[LOOP:1: B:37:0x00d6->B:50:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0269 A[SYNTHETIC] */
    @Override // xsna.wsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rsk m(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        boolean z;
        int i;
        boolean z2;
        ArrayList arrayList;
        long j;
        long j2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j3;
        long parseLong;
        int i2 = 0;
        String[] strArr = new String[0];
        String attributeValue = xmlPullParser.getAttributeValue(null, "profiles");
        if (attributeValue != null) {
            strArr = attributeValue.split(StringUtils.COMMA);
        }
        int length = strArr.length;
        int i3 = 0;
        while (true) {
            z = this.g;
            i = 1;
            if (i3 < length) {
                if (brm0.B(strArr[i3], "urn:dvb:dash:profile:dvb-dash:", false)) {
                    break;
                }
                i3++;
            } else if (!z) {
                z2 = false;
            }
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "availabilityStartTime");
        long V = attributeValue2 == null ? -9223372036854775807L : y2r0.V(attributeValue2);
        long k = wsk.k(xmlPullParser, "mediaPresentationDuration", C.TIME_UNSET);
        long k2 = wsk.k(xmlPullParser, "minBufferTime", C.TIME_UNSET);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long k3 = equals ? wsk.k(xmlPullParser, "minimumUpdatePeriod", C.TIME_UNSET) : -9223372036854775807L;
        long k4 = equals ? wsk.k(xmlPullParser, "timeShiftBufferDepth", C.TIME_UNSET) : -9223372036854775807L;
        long k5 = equals ? wsk.k(xmlPullParser, "suggestedPresentationDelay", C.TIME_UNSET) : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "publishTime");
        long V2 = attributeValue3 == null ? -9223372036854775807L : y2r0.V(attributeValue3);
        long j4 = equals ? 0L : -9223372036854775807L;
        String uri2 = z ? "" : uri.toString();
        ArrayList d = qhz.d(new tp6(uri2, uri2, z2 ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j5 = equals ? -9223372036854775807L : 0L;
        int i4 = 0;
        boolean z3 = false;
        p1e0 p1e0Var = null;
        wak wakVar = null;
        Uri uri3 = null;
        voi0 voi0Var = null;
        while (true) {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, "BaseURL")) {
                if (i4 == 0) {
                    j4 = wsk.f(xmlPullParser, j4);
                    i4 = i;
                }
                arrayList5.addAll(wsk.g(xmlPullParser, d, z2));
                if (arrayList5.size() > i) {
                    int size = arrayList5.size();
                    for (int i5 = i2; i5 < size; i5++) {
                        arrayList5.set(i5, new tp6(((tp6) arrayList5.get(i5)).a, ((tp6) arrayList5.get(i5)).b, i5, i));
                    }
                }
            } else if (o19.n(xmlPullParser, "ProgramInformation")) {
                p1e0Var = wsk.o(xmlPullParser);
            } else {
                if (o19.n(xmlPullParser, "UTCTiming")) {
                    arrayList2 = d;
                    wakVar = new wak(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"), 2);
                    arrayList3 = arrayList4;
                    j3 = C.TIME_UNSET;
                    long j6 = V;
                    arrayList = arrayList5;
                    j = j4;
                    j2 = j6;
                } else if (o19.n(xmlPullParser, "Location")) {
                    uri3 = neq0.d(uri.toString(), xmlPullParser.nextText());
                } else if (o19.n(xmlPullParser, "ServiceDescription")) {
                    voi0Var = wsk.x(xmlPullParser);
                } else if (!o19.n(xmlPullParser, "Period") || z3) {
                    long j7 = V;
                    arrayList = arrayList5;
                    j = j4;
                    j2 = j7;
                    arrayList2 = d;
                    arrayList3 = arrayList4;
                    j3 = C.TIME_UNSET;
                    if (o19.n(xmlPullParser, "vk:Attrs")) {
                        while (true) {
                            xmlPullParser.next();
                            if (!o19.n(xmlPullParser, "vk:XPlaybackDuration")) {
                                wsk.c(xmlPullParser);
                                if (o19.m(xmlPullParser, "vk:Attrs")) {
                                    break;
                                }
                            } else {
                                String nextText = xmlPullParser.nextText();
                                if (nextText != null) {
                                    parseLong = Long.parseLong(nextText);
                                }
                            }
                        }
                        parseLong = 0;
                        this.h.post(new tsk(this, parseLong));
                    } else {
                        wsk.c(xmlPullParser);
                    }
                } else {
                    ArrayList o = i4 != 0 ? arrayList5.isEmpty() ? d : arrayList5 : e43.o(new tp6(uri.toString(), uri.toString(), z2 ? i : Integer.MIN_VALUE, i));
                    long j8 = V;
                    arrayList = arrayList5;
                    j = j4;
                    j2 = j8;
                    arrayList2 = d;
                    ArrayList arrayList6 = o;
                    long j9 = j5;
                    arrayList3 = arrayList4;
                    j3 = C.TIME_UNSET;
                    Pair n = n(xmlPullParser, arrayList6, j9, j, j2, k4, z2);
                    jx90 jx90Var = (jx90) n.first;
                    j5 = j9;
                    if (jx90Var.b != C.TIME_UNSET) {
                        Long l = (Long) n.second;
                        long longValue = (l != null && l.longValue() == C.TIME_UNSET) ? -9223372036854775807L : l.longValue() + jx90Var.b;
                        arrayList3.add(jx90Var);
                        j5 = longValue;
                    } else {
                        if (!equals) {
                            throw ParserException.b(null, "Unable to determine start of period " + arrayList3.size());
                        }
                        z3 = true;
                    }
                }
                if (!o19.m(xmlPullParser, "MPD")) {
                    if (k == j3) {
                        if (j5 != j3) {
                            k = j5;
                        } else if (!equals) {
                            throw ParserException.b(null, "Unable to determine duration of static manifest.");
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        throw ParserException.b(null, "No periods found.");
                    }
                    return new rsk(j2, k, k2, equals, k3, k4, k5, V2, p1e0Var, wakVar, voi0Var, uri3, arrayList3);
                }
                long j10 = j;
                arrayList5 = arrayList;
                V = j2;
                j4 = j10;
                d = arrayList2;
                arrayList4 = arrayList3;
                i2 = 0;
                i = 1;
            }
            long j11 = V;
            arrayList = arrayList5;
            j = j4;
            j2 = j11;
            arrayList2 = d;
            arrayList3 = arrayList4;
            j3 = C.TIME_UNSET;
            if (!o19.m(xmlPullParser, "MPD")) {
            }
        }
    }

    @Override // xsna.wsk
    public final wsk.a q(XmlPullParser xmlPullParser, ArrayList arrayList, String str, String str2, String str3, String str4, int i, int i2, float f, int i3, int i4, String str5, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, o4i0 o4i0Var, long j, long j2, long j3, long j4, long j5, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "quality");
        if (attributeValue == null) {
            attributeValue = "";
        }
        wsk.a q = super.q(xmlPullParser, arrayList, str, str2, str3, str4, i, i2, f, i3, i4, str5, arrayList2, arrayList3, arrayList4, arrayList5, o4i0Var, j, j2, j3, j4, j5, z);
        androidx.media3.common.a aVar = q.a;
        if (drm0.N(attributeValue)) {
            return q;
        }
        fi20 fi20Var = aVar.l;
        if (fi20Var == null) {
            fi20Var = new fi20(new fi20.a[0]);
        }
        fi20 a = fi20Var.a(new yer0(attributeValue));
        a.C0043a a2 = aVar.a();
        a2.k = a;
        return new wsk.a(new androidx.media3.common.a(a2), q.b, q.c, q.d, q.e, q.f, q.h, q.i, q.g);
    }
}
