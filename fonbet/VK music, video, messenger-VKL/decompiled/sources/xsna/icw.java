package xsna;

import androidx.fragment.app.Fragment;
import com.vk.httpexecutor.api.NetworkClient;
import java.util.HashSet;
import java.util.Iterator;
import okhttp3.Interceptor;
import xsna.i2i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class icw implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ icw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.b) {
            case 0:
                i2i0.a aVar = (i2i0.a) ((kcw) this.c).a.a;
                HashSet hashSet = aVar.a;
                Iterator<Fragment> it = aVar.b.c.f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Fragment next = it.next();
                        if (next.isVisible() && hashSet.contains(fpf0.a(next.getClass()))) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            default:
                Interceptor interceptor = (Interceptor) this.c;
                NetworkClient.ClientType clientType = (NetworkClient.ClientType) obj;
                if (clientType == NetworkClient.ClientType.CLIENT_API || clientType == NetworkClient.ClientType.CLIENT_WEB) {
                    return interceptor;
                }
                return null;
        }
    }
}
