package xsna;

import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: ResponseBodyStreamConverter.kt */
/* loaded from: classes15.dex */
public final class mbg0 {
    public final List<cpm0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public mbg0(List<? extends cpm0> list) {
        this.a = list;
    }

    public final InputStream a(okhttp3.v vVar, String str, String str2) {
        Object obj;
        if (str != null) {
            try {
                Iterator<T> it = this.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((cpm0) obj).a(str)) {
                        break;
                    }
                }
                cpm0 cpm0Var = (cpm0) obj;
                if (cpm0Var != null) {
                    return cpm0Var.b(vVar);
                }
            } catch (Exception e) {
                throw new VKApiExecutionException(-3, str2, true, y57.a(X3.j.d, str2, "] ", e.getLocalizedMessage()), null, null, null, null, 0, null, str, null, 3056);
            }
        }
        return null;
    }
}
