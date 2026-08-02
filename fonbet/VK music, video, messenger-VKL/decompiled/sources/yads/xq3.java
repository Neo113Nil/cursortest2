package yads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.StringReader;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes10.dex */
public abstract class xq3 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static tn2 a(XmlPullParser xmlPullParser, String str, String str2) {
        p51 p51Var = s51.c;
        kx.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i = 0;
        do {
            xmlPullParser.next();
            if (wq3.c(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = wq3.a(xmlPullParser, concat3);
                String a3 = wq3.a(xmlPullParser, concat4);
                String a4 = wq3.a(xmlPullParser, concat5);
                String a5 = wq3.a(xmlPullParser, concat6);
                if (a2 == null || a3 == null) {
                    return tn2.f;
                }
                fw1 fw1Var = new fw1(a2, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L);
                int i2 = i + 1;
                if (objArr.length < i2) {
                    objArr = Arrays.copyOf(objArr, l51.a(objArr.length, i2));
                }
                objArr[i] = fw1Var;
                i = i2;
            }
        } while (!wq3.b(xmlPullParser, concat2));
        return s51.b(i, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r8 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gw1 a(String str) {
        long j;
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (wq3.c(newPullParser, "x:xmpmeta")) {
            p51 p51Var = s51.c;
            tn2 tn2Var = tn2.f;
            long j2 = -9223372036854775807L;
            loop0: do {
                newPullParser.next();
                if (wq3.c(newPullParser, "rdf:Description")) {
                    String[] strArr = a;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 4) {
                            break loop0;
                        }
                        String a2 = wq3.a(newPullParser, strArr[i2]);
                        if (a2 == null) {
                            i2++;
                        } else if (Integer.parseInt(a2) == 1) {
                            String[] strArr2 = b;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= 4) {
                                    break;
                                }
                                String a3 = wq3.a(newPullParser, strArr2[i3]);
                                if (a3 != null) {
                                    j = Long.parseLong(a3);
                                } else {
                                    i3++;
                                }
                            }
                            j = -9223372036854775807L;
                            String[] strArr3 = c;
                            while (true) {
                                if (i < 2) {
                                    String a4 = wq3.a(newPullParser, strArr3[i]);
                                    if (a4 != null) {
                                        tn2Var = s51.a(new fw1("image/jpeg", 0L, 0L), new fw1(MimeTypes.VIDEO_MP4, Long.parseLong(a4), 0L));
                                        break;
                                    }
                                    i++;
                                } else {
                                    p51 p51Var2 = s51.c;
                                    tn2Var = tn2.f;
                                    break;
                                }
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (wq3.c(newPullParser, "Container:Directory")) {
                    tn2Var = a(newPullParser, "Container", "Item");
                } else if (wq3.c(newPullParser, "GContainer:Directory")) {
                    tn2Var = a(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!wq3.b(newPullParser, "x:xmpmeta"));
            if (tn2Var.isEmpty()) {
                return null;
            }
            return new gw1(j2, tn2Var);
        }
        throw new pc2("Couldn't find xmp metadata", null, true, 1);
    }
}
