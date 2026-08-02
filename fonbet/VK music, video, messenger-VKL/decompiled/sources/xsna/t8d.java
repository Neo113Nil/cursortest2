package xsna;

import android.content.res.XmlResourceParser;
import com.vk.utils.vectordrawable.internal.element.ClipPathElement;

/* compiled from: ClipPathElementParser.kt */
/* loaded from: classes6.dex */
public final class t8d extends de {
    public final ClipPathElement q0(XmlResourceParser xmlResourceParser) {
        int P = de.P(this, xmlResourceParser, "name");
        String attributeValue = P != -1 ? xmlResourceParser.getAttributeValue(P) : null;
        int P2 = de.P(this, xmlResourceParser, "pathData");
        return new ClipPathElement(attributeValue, P2 != -1 ? xmlResourceParser.getAttributeValue(P2) : null);
    }
}
