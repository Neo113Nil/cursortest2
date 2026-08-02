package xsna;

import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.IPCInteractor;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.domain.model.CallingAppIds;
import java.util.List;

/* loaded from: classes9.dex */
public interface nvy0 extends IPCInteractor {
    void b(CallingAppIds callingAppIds, List<RemoteMessage> list, AsyncCallback asyncCallback);
}
