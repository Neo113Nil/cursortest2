package xsna;

import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* compiled from: CollageParams.kt */
/* loaded from: classes4.dex */
public abstract class w1g implements g5p {
    public final e4p a;
    public final w0g b;
    public final CollageAspectRatioFormat c;
    public final float d;
    public final float e;
    public final f0g f;
    public final g2g g;
    public final double h;

    public w1g(e4p e4pVar, w0g w0gVar, CollageAspectRatioFormat collageAspectRatioFormat, float f, float f2, f0g f0gVar, g2g g2gVar, double d) {
        this.a = e4pVar;
        this.b = w0gVar;
        this.c = collageAspectRatioFormat;
        this.d = f;
        this.e = f2;
        this.f = f0gVar;
        this.g = g2gVar;
        this.h = d;
    }

    public static w1g a(bc0 bc0Var, w0g w0gVar, CollageAspectRatioFormat collageAspectRatioFormat, Float f, Float f2, f0g f0gVar, g2g g2gVar, Double d, int i) {
        w0g w0gVar2 = (i & 2) != 0 ? null : w0gVar;
        CollageAspectRatioFormat collageAspectRatioFormat2 = (i & 4) != 0 ? null : collageAspectRatioFormat;
        Float f3 = (i & 8) != 0 ? null : f;
        Float f4 = (i & 16) != 0 ? null : f2;
        f0g f0gVar2 = (i & 32) != 0 ? null : f0gVar;
        g2g g2gVar2 = (i & 64) != 0 ? null : g2gVar;
        Double d2 = (i & 128) == 0 ? d : null;
        e4p e4pVar = bc0Var.a;
        if (w0gVar2 == null) {
            w0gVar2 = bc0Var.b;
        }
        w0g w0gVar3 = w0gVar2;
        if (collageAspectRatioFormat2 == null) {
            collageAspectRatioFormat2 = bc0Var.c;
        }
        CollageAspectRatioFormat collageAspectRatioFormat3 = collageAspectRatioFormat2;
        float floatValue = f3 != null ? f3.floatValue() : bc0Var.d;
        float floatValue2 = f4 != null ? f4.floatValue() : bc0Var.e;
        if (f0gVar2 == null) {
            f0gVar2 = bc0Var.f;
        }
        f0g f0gVar3 = f0gVar2;
        if (g2gVar2 == null) {
            g2gVar2 = bc0Var.g;
        }
        return new bc0(e4pVar, w0gVar3, collageAspectRatioFormat3, floatValue, floatValue2, f0gVar3, g2gVar2, d2 != null ? d2.doubleValue() : bc0Var.h);
    }

    @Override // xsna.g5p
    public boolean I() {
        return false;
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return y2g.a;
    }

    public final String toString() {
        Pair pair = new Pair("isDefault", Boolean.valueOf(I()));
        e4p e4pVar = this.a;
        Pair pair2 = new Pair("basedOnImageLink", e4pVar != null ? e4pVar.a() : null);
        Pair pair3 = new Pair("grid", this.b.toString());
        Pair pair4 = new Pair("format", this.c.toString());
        Pair pair5 = new Pair("borderWidth", Float.valueOf(this.d));
        Pair pair6 = new Pair("cornerRadius", Float.valueOf(this.e));
        Pair pair7 = new Pair("borderColor", this.f.a);
        g2g g2gVar = this.g;
        g2gVar.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<n2k0, c2g> entry : g2gVar.a.entrySet()) {
            String obj = entry.getKey().toString();
            c2g value = entry.getValue();
            value.getClass();
            e4p e4pVar2 = value.i;
            jSONObject.put(obj, new JSONObject(pn00.k(new Pair("imageLink", e4pVar2 != null ? e4pVar2.a() : null), new Pair("x", Float.valueOf(value.a)), new Pair("y", Float.valueOf(value.b)), new Pair(Logger.METHOD_W, Float.valueOf(value.c)), new Pair("h", Float.valueOf(value.d)), new Pair("translateX", Float.valueOf(value.e)), new Pair("translateY", Float.valueOf(value.f)), new Pair("scale", Float.valueOf(value.g)), new Pair("rotateAngle", Float.valueOf(value.h)))));
            pair = pair;
        }
        return new JSONObject(pn00.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("slotsConfig", jSONObject))).toString();
    }
}
