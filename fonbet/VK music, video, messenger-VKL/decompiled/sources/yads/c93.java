package yads;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.e43;

/* loaded from: classes10.dex */
public final class c93 implements uq3 {
    public final vq3 a;
    public final m73 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c93() {
        this(r0, new m73(new HashSet(e43.l(Arrays.copyOf(r2, r2.length)))));
        vq3 vq3Var = new vq3();
        k73[] values = k73.values();
    }

    @Override // yads.uq3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, kn knVar) {
        return a(xmlPullParser);
    }

    public final b93 a(XmlPullParser xmlPullParser) {
        this.a.getClass();
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, NotificationCompat.CATEGORY_EVENT);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, SignalingProtocol.KEY_OFFSET);
        this.a.getClass();
        String a = vq3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || a.length() <= 0) {
            return null;
        }
        return new b93(attributeValue, a, attributeValue2 != null ? this.b.a(attributeValue2) : null);
    }

    public c93(vq3 vq3Var, m73 m73Var) {
        this.a = vq3Var;
        this.b = m73Var;
    }
}
