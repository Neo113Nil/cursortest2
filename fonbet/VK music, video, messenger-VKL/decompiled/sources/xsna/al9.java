package xsna;

import android.content.SharedPreferences;
import android.util.Base64;
import com.vk.media.MediaUtils;
import java.io.File;
import java.util.concurrent.Callable;
import xsna.it80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class al9 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ al9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                String str = (String) this.c;
                if (str == null) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                MediaUtils.f d = MediaUtils.a.d(str);
                mat0 mat0Var = new mat0(new File(str), false, 0L, Math.min(d != null ? d.f : 60000L, 60000L), false, d, 224);
                mat0Var.e();
                it80.b.getClass();
                return new it80(mat0Var);
            case 1:
                return Boolean.valueOf(!((ec20) this.c).c.b().isEmpty());
            default:
                d2p0 d2p0Var = (d2p0) this.c;
                String string = ((SharedPreferences) d2p0Var.c.getValue()).getString("VK_PAY_CHECKOUT_VKPAY_TOKEN_IV/" + d2p0Var.b.b, null);
                if (string != null) {
                    return Base64.decode(string, 0);
                }
                throw new IllegalStateException("Initialization vector must be not null");
        }
    }
}
