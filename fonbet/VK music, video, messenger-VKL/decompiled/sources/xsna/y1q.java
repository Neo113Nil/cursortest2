package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.core.api.models.BanInfo;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: ExchangeLoginDataApiCommand.kt */
/* loaded from: classes6.dex */
public abstract class y1q extends nx2<xbu0> {
    public static AuthException.BannedUserException g(Throwable th) {
        if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            JSONObject D = vKApiExecutionException.D();
            if (D == null) {
                List<VKApiExecutionException> v = vKApiExecutionException.v();
                if (v != null) {
                    Iterator<T> it = v.iterator();
                    while (it.hasNext()) {
                        D = ((VKApiExecutionException) it.next()).D();
                        if (D != null) {
                            break;
                        }
                    }
                }
                D = null;
            }
            if (D != null) {
                Serializer.c<BanInfo> cVar = BanInfo.CREATOR;
                BanInfo a = BanInfo.a.a(D);
                if (!(a.c != null ? !drm0.N(r0) : false)) {
                    a = null;
                }
                if (a != null) {
                    return new AuthException.BannedUserException(a);
                }
            }
        }
        return null;
    }
}
