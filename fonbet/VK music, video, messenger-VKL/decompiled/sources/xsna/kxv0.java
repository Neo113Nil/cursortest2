package xsna;

import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kxv0 implements izs {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;

    public /* synthetic */ kxv0(long j, long j2, String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = j2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        JSONObject jSONObject = (JSONObject) pair.d();
        WebGroup webGroup = (WebGroup) pair.g();
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.y(new g5i(jSONObject.toString(), this.b, this.c, webGroup.c, this.f, this.g, this.d, this.e));
        return s3q0.a;
    }
}
