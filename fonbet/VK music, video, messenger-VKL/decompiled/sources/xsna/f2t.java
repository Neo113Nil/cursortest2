package xsna;

import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: GLTextureInfo.kt */
/* loaded from: classes4.dex */
public final class f2t {
    public final int a;
    public final float b;
    public final float c;

    public f2t(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2t)) {
            return false;
        }
        f2t f2tVar = (f2t) obj;
        return this.a == f2tVar.a && Float.compare(this.b, f2tVar.b) == 0 && Float.compare(this.c, f2tVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return new JSONObject(pn00.k(new Pair("handle", Integer.valueOf(this.a)), new Pair("imageWidth", Float.valueOf(this.b)), new Pair("imageHeight", Float.valueOf(this.c)))).toString();
    }
}
