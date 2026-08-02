package xsna;

import android.content.res.XmlResourceParser;
import com.unity3d.services.UnityAdsConstants;
import com.vk.utils.vectordrawable.internal.element.GroupElement;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: GroupElementParser.kt */
/* loaded from: classes6.dex */
public final class uju extends de {
    public final GroupElement q0(XmlResourceParser xmlResourceParser) {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int P = de.P(this, xmlResourceParser, "name");
        String attributeValue = P != -1 ? xmlResourceParser.getAttributeValue(P) : null;
        int P2 = de.P(this, xmlResourceParser, "pivotX");
        float floatValue = (P2 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P2))) : valueOf2).floatValue();
        int P3 = de.P(this, xmlResourceParser, "pivotY");
        float floatValue2 = (P3 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P3))) : valueOf2).floatValue();
        int P4 = de.P(this, xmlResourceParser, "rotation");
        float floatValue3 = (P4 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P4))) : valueOf2).floatValue();
        int P5 = de.P(this, xmlResourceParser, "scaleX");
        float floatValue4 = (P5 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P5))) : valueOf).floatValue();
        int P6 = de.P(this, xmlResourceParser, "scaleY");
        if (P6 != -1) {
            valueOf = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P6)));
        }
        float floatValue5 = valueOf.floatValue();
        int P7 = de.P(this, xmlResourceParser, "translateX");
        float floatValue6 = (P7 != -1 ? Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P7))) : valueOf2).floatValue();
        int P8 = de.P(this, xmlResourceParser, "translateY");
        if (P8 != -1) {
            valueOf2 = Float.valueOf(Float.parseFloat(xmlResourceParser.getAttributeValue(P8)));
        }
        return new GroupElement(attributeValue, floatValue, floatValue2, floatValue3, floatValue4, floatValue5, floatValue6, valueOf2.floatValue(), null, null, Tensorflow.FRAME_HEIGHT, null);
    }
}
