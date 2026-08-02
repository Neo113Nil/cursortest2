package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf4 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hf4(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.d;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.valueOf(!this.c));
                }
                break;
            default:
                x6y x6yVar = (x6y) this.d;
                fvv0 M = x6yVar.M();
                gvv0 view = M != null ? M.getView() : null;
                if (view != null) {
                    boolean cl = view.cl(this.c);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", cl);
                    bex0.a.b(x6yVar, JsApiMethodType.SWIPE_TO_CLOSE, jSONObject, null, 12);
                } else {
                    x6yVar.y(JsApiMethodType.SWIPE_TO_CLOSE);
                }
                break;
        }
        return s3q0.a;
    }
}
