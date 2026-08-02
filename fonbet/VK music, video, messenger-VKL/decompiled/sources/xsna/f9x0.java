package xsna;

import org.json.JSONObject;

/* compiled from: WallCommentRequestStrategy.kt */
/* loaded from: classes4.dex */
public final class f9x0 implements dcg {
    public final qzo a = new qzo();

    @Override // xsna.dcg
    public final io.reactivex.rxjava3.core.q<JSONObject> a(rzo rzoVar) {
        return rsg0.y0(new z1p("wall.editComment", rzoVar.a, rzoVar.b, rzoVar.e, rzoVar.f, null, null, rzoVar.h), null, null, 3).L(new p5w(new p0p0(6, rzoVar, this), 28), false);
    }
}
