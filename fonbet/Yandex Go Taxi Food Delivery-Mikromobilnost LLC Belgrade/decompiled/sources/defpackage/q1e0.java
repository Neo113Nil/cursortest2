package defpackage;

import com.ybsdk.core.utils.poller.PollerEndpoint;

/* loaded from: classes2.dex */
public abstract class q1e0 {
    public final String a;

    public q1e0(PollerEndpoint pollerEndpoint) {
        this.a = pollerEndpoint.getUrlPath();
    }

    public String a() {
        return this.a;
    }
}
