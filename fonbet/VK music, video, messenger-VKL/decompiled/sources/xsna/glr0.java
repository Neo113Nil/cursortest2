package xsna;

import android.content.res.XmlResourceParser;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.internal.element.Shape;

/* compiled from: VectorElementParser.kt */
/* loaded from: classes6.dex */
public final class glr0 extends de {
    public final Shape q0(XmlResourceParser xmlResourceParser) {
        Float f;
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int P = de.P(this, xmlResourceParser, "viewportWidth");
        float floatValue = (P != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P))) : valueOf).floatValue();
        int P2 = de.P(this, xmlResourceParser, "viewportHeight");
        float floatValue2 = (P2 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P2))) : valueOf).floatValue();
        int P3 = de.P(this, xmlResourceParser, "alpha");
        int min = Math.min(255, (int) (255 * (P3 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P3))) : Float.valueOf(1.0f)).floatValue()));
        int P4 = de.P(this, xmlResourceParser, "name");
        String attributeValue = P4 != -1 ? xmlResourceParser.getAttributeValue(P4) : null;
        int P5 = de.P(this, xmlResourceParser, "width");
        if (P5 != -1) {
            String attributeValue2 = xmlResourceParser.getAttributeValue(P5);
            f = Float.valueOf(Float.parseFloat(attributeValue2.substring(0, attributeValue2.length() - (brm0.v(attributeValue2, "dip", false) ? 3 : 2))));
        } else {
            f = valueOf;
        }
        float floatValue3 = f.floatValue();
        int P6 = de.P(this, xmlResourceParser, "height");
        if (P6 != -1) {
            String attributeValue3 = xmlResourceParser.getAttributeValue(P6);
            valueOf = Float.valueOf(Float.parseFloat(attributeValue3.substring(0, attributeValue3.length() - (brm0.v(attributeValue3, "dip", false) ? 3 : 2))));
        }
        return new Shape(attributeValue, floatValue, floatValue2, min, floatValue3, valueOf.floatValue(), null, 64, null);
    }
}
