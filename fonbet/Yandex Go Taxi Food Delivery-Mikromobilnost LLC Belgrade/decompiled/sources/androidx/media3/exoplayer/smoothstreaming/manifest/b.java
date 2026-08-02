package androidx.media3.exoplayer.smoothstreaming.manifest;

import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.ArrayList;
import java.util.LinkedList;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class b extends a {
    public final String e;
    public final LinkedList f;
    public int g;
    public String h;
    public long i;
    public String j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public ArrayList q;
    public long r;

    public b(a aVar, String str) {
        super(aVar, str, "StreamIndex");
        this.e = str;
        this.f = new LinkedList();
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final void a(Object obj) {
        if (obj instanceof androidx.media3.common.a) {
            this.f.add((androidx.media3.common.a) obj);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 oxt0, still in use, count: 2, list:
          (r3v0 oxt0) from 0x0082: MOVE (r26v0 oxt0) = (r3v0 oxt0)
          (r3v0 oxt0) from 0x004e: MOVE (r26v4 oxt0) = (r3v0 oxt0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.smoothstreaming.manifest.b.b():java.lang.Object");
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final void j(XmlPullParser xmlPullParser) {
        int i = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new SsManifestParser.MissingFieldException("Type");
            }
            if (!MediaStreamTrack.AUDIO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                if (MediaStreamTrack.VIDEO_TRACK_KIND.equalsIgnoreCase(attributeValue)) {
                    i = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw ParserException.b(null, "Invalid key value[" + attributeValue + "]");
                    }
                    i = 3;
                }
            }
            this.g = i;
            l(Integer.valueOf(i), "Type");
            if (this.g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new SsManifestParser.MissingFieldException("Subtype");
                }
                this.h = attributeValue2;
            } else {
                this.h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, PlusAcquisitionSmartOffer.Texts.NAME);
            this.j = attributeValue3;
            l(attributeValue3, PlusAcquisitionSmartOffer.Texts.NAME);
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new SsManifestParser.MissingFieldException("Url");
            }
            this.k = attributeValue4;
            this.l = a.g(xmlPullParser, "MaxWidth");
            this.m = a.g(xmlPullParser, "MaxHeight");
            this.n = a.g(xmlPullParser, "DisplayWidth");
            this.o = a.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue5;
            l(attributeValue5, "Language");
            long g = a.g(xmlPullParser, "TimeScale");
            this.i = g;
            if (g == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList();
            return;
        }
        int size = this.q.size();
        long h = a.h(xmlPullParser, "t", -9223372036854775807L);
        if (h == -9223372036854775807L) {
            if (size == 0) {
                h = 0;
            } else {
                if (this.r == -1) {
                    throw ParserException.b(null, "Unable to infer start time");
                }
                h = this.r + ((Long) this.q.get(size - 1)).longValue();
            }
        }
        this.q.add(Long.valueOf(h));
        this.r = a.h(xmlPullParser, "d", -9223372036854775807L);
        long h2 = a.h(xmlPullParser, "r", 1L);
        if (h2 > 1 && this.r == -9223372036854775807L) {
            throw ParserException.b(null, "Repeated chunk with unspecified duration");
        }
        while (true) {
            long j = i;
            if (j >= h2) {
                return;
            }
            this.q.add(Long.valueOf((this.r * j) + h));
            i++;
        }
    }
}
