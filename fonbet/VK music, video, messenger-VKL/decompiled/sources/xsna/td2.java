package xsna;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: XmlVectorParser.android.kt */
/* loaded from: classes11.dex */
public final class td2 {
    public final XmlPullParser a;
    public int b = 0;
    public final sq90 c = new sq90(0);

    public td2(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float e = ytp0.e(typedArray, this.a, str, i, f);
        b(typedArray.getChangingConfigurations());
        return e;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td2)) {
            return false;
        }
        td2 td2Var = (td2) obj;
        return epx.f(this.a, td2Var.a) && this.b == td2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return vu5.b(sb, this.b, ')');
    }
}
