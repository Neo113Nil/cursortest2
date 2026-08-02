package xsna;

import org.json.JSONObject;
import xsna.i340;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ax2 implements jj90, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ Object b;

    public /* synthetic */ ax2(Object obj) {
        this.b = obj;
    }

    @Override // xsna.jj90
    public Object a(JSONObject jSONObject) {
        return ((xy2) this.b).a().e(new wwx(jSONObject));
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (i340.e) ((a340) this.b).invoke(obj);
    }
}
