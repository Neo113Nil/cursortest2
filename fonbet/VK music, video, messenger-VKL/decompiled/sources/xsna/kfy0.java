package xsna;

import com.vk.push.core.IPCInteractor;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;

/* loaded from: classes9.dex */
public interface kfy0 extends IPCInteractor {
    void d(CallingAppIds callingAppIds, String str, AsyncCallback asyncCallback);

    void e(AsyncCallback asyncCallback, CallingAppIds callingAppIds);

    void f(AsyncCallback asyncCallback, CallingAppIds callingAppIds);
}
