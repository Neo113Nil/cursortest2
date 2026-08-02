package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.AuthModel;
import com.vk.superapp.api.states.VkAuthState;
import xsna.xbu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g45 implements izs {
    public final /* synthetic */ AuthModel b;
    public final /* synthetic */ VkAuthState c;
    public final /* synthetic */ String d;

    public /* synthetic */ g45(AuthModel authModel, VkAuthState vkAuthState, String str) {
        this.b = authModel;
        this.c = vkAuthState;
        this.d = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.b.getClass();
        xbu0 xbu0Var = xbu0.i;
        return io.reactivex.rxjava3.core.q.T(xbu0.b.a()).L(new z7(new z14((AuthResult) obj, this.c, this.d, 1), 5), false);
    }
}
