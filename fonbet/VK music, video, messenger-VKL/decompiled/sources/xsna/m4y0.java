package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import xsna.gb30;

/* compiled from: XmpMotionPhotoDescriptionParser.java */
/* loaded from: classes12.dex */
public final class m4y0 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gb30 a(String str) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!o19.n(newPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (o19.n(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String i3 = o19.i(newPullParser, a[i2]);
                    if (i3 == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(i3) != 1) {
                            break;
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 4) {
                                break;
                            }
                            String i5 = o19.i(newPullParser, b[i4]);
                            if (i5 != null) {
                                j = Long.parseLong(i5);
                            } else {
                                i4++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                ImmutableList.b bVar2 = ImmutableList.c;
                                gVar = com.google.common.collect.g.f;
                                break;
                            }
                            String i6 = o19.i(newPullParser, c[i]);
                            if (i6 != null) {
                                gVar = ImmutableList.q(new gb30.a("image/jpeg", 0L, 0L), new gb30.a(MimeTypes.VIDEO_MP4, Long.parseLong(i6), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (o19.n(newPullParser, "Container:Directory")) {
                gVar = b(newPullParser, "Container", "Item");
            } else if (o19.n(newPullParser, "GContainer:Directory")) {
                gVar = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (o19.m(newPullParser, "x:xmpmeta")) {
                if (!gVar.isEmpty()) {
                    return new gb30(j, gVar);
                }
            }
        }
        return null;
    }

    public static com.google.common.collect.g b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar = new ImmutableList.a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (o19.n(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String i = o19.i(xmlPullParser, concat3);
                String i2 = o19.i(xmlPullParser, concat4);
                String i3 = o19.i(xmlPullParser, concat5);
                String i4 = o19.i(xmlPullParser, concat6);
                if (i == null || i2 == null) {
                    return com.google.common.collect.g.f;
                }
                aVar.c(new gb30.a(i, i3 != null ? Long.parseLong(i3) : 0L, i4 != null ? Long.parseLong(i4) : 0L));
            }
        } while (!o19.m(xmlPullParser, concat2));
        return aVar.g();
    }
}
