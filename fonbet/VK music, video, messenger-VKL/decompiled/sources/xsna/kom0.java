package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import org.json.JSONObject;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kom0 implements izs {
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int[] d;

    public /* synthetic */ kom0(String str, boolean z, int[] iArr) {
        this.b = str;
        this.c = z;
        this.d = iArr;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        drj0 drj0Var = (drj0) obj;
        JSONObject c = ((vx70.a) drj0Var.a()).c();
        if (c == null) {
            throw new VKApiException("Response returned null instead of valid string response");
        }
        boolean k = mnh0.k(c);
        String str = this.b;
        if (k) {
            throw mnh0.I(str, ((vx70.a) drj0Var.a()).a(), c);
        }
        if (this.c) {
            int[] iArr = this.d;
            if (mnh0.j(c, iArr)) {
                throw mnh0.F(c, str, iArr);
            }
        }
        return c;
    }
}
