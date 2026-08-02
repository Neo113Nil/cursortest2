package xsna;

import com.vk.api.sdk.exceptions.VKApiException;
import java.io.IOException;

/* compiled from: InternalApiCommand.kt */
/* loaded from: classes15.dex */
public abstract class pfx<Response> extends nx2<Response> {
    @Override // xsna.nx2
    public final Response f(l7r0 l7r0Var) {
        return g((wy2) l7r0Var);
    }

    public abstract Response g(wy2 wy2Var) throws InterruptedException, IOException, VKApiException;
}
