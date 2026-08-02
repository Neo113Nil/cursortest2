package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.network.proxy.verifier.VkProxyPoll;
import java.util.concurrent.TimeUnit;

/* compiled from: VkChannelMessageAttachRouter.kt */
/* loaded from: classes11.dex */
public final class hju0 implements qev0 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ hju0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(Context context, com.vk.im.engine.models.messages.a aVar, Attach attach, View view) {
        iwv.l((iwv) this.c, context, attach, aVar, null, null, view, false, 88);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.qev0
    public VkProxyPoll d() {
        switch (this.b) {
            case 1:
                return ((Boolean) ((bpn0) this.c).getValue()).booleanValue() ? VkProxyPoll.ERROR : VkProxyPoll.NEXT;
            default:
                return ((Boolean) new io.reactivex.rxjava3.internal.operators.observable.p1(((pev0) this.c).j.y0(4L, TimeUnit.SECONDS), new pzn(new v1w(4))).a()).booleanValue() ? VkProxyPoll.NEXT : VkProxyPoll.CANCEL;
        }
    }

    public hju0() {
        this.b = 1;
        this.c = new bpn0(new p03(13));
    }
}
