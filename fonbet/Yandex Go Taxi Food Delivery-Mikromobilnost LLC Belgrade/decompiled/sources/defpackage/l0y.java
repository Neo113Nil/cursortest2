package defpackage;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public final class l0y {
    public final ArrayDeque a = new ArrayDeque();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(AttributeSet attributeSet) {
        ArrayDeque arrayDeque;
        XmlPullParser xmlPullParser;
        boolean z;
        if (attributeSet instanceof XmlPullParser) {
            XmlPullParser xmlPullParser2 = (XmlPullParser) attributeSet;
            if (xmlPullParser2.getDepth() == 1) {
                while (true) {
                    arrayDeque = this.a;
                    if (arrayDeque.isEmpty()) {
                        xmlPullParser = null;
                        break;
                    }
                    xmlPullParser = (XmlPullParser) ((WeakReference) arrayDeque.peek()).get();
                    if (xmlPullParser != null) {
                        try {
                            if (xmlPullParser.getEventType() != 3 && xmlPullParser.getEventType() != 1) {
                                break;
                            }
                        } catch (XmlPullParserException unused) {
                            continue;
                        }
                    }
                    arrayDeque.pop();
                }
                arrayDeque.push(new WeakReference(xmlPullParser2));
                if (xmlPullParser != null && xmlPullParser2 != xmlPullParser) {
                    if (xmlPullParser.getEventType() == 2) {
                        z = "include".equals(xmlPullParser.getName());
                        if (!z) {
                            return true;
                        }
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }
}
