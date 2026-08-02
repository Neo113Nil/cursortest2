package xsna;

import com.vk.core.apps.BuildInfo;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: ApiMethodExtension.kt */
/* loaded from: classes.dex */
public final class dz2 extends rsg0<Object> {
    public final mom0<Object, Object> s;
    public final String t;
    public final /* synthetic */ xy2<Object> u;

    /* compiled from: ApiMethodExtension.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<JSONObject, Object> {
        @Override // xsna.izs
        public final Object invoke(JSONObject jSONObject) {
            return ((dz2) this.receiver).a(jSONObject);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz2(xy2<Object> xy2Var, String str, String str2) {
        super(str2);
        this.u = xy2Var;
        this.s = new mom0<>(xy2Var.e(), new a(1, this, dz2.class, "parse", "parse(Lorg/json/JSONObject;)Ljava/lang/Object;", 0), new bod(2));
        this.t = BuildInfo.h() ? vx2.d.d() : str;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return this.u.a().e(new wwx(jSONObject));
    }

    @Override // xsna.oer0, xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return this.s.a(qrj0Var, qrj0Var2);
    }

    @Override // xsna.xz2
    public final String k() {
        return this.t;
    }
}
