package xsna;

import android.os.Bundle;
import com.vk.channels.impl.channelselection.SelectChannelFragment;

/* compiled from: SelectChannelComponent.kt */
/* loaded from: classes16.dex */
public final class q6i0 extends yj50<s6i0, z6i0, w6i0, x6i0, y6i0, t6i0, u6i0> {
    public final SelectChannelFragment n;
    public final a1w o;

    public q6i0(SelectChannelFragment selectChannelFragment, a1w a1wVar, SelectChannelFragment selectChannelFragment2) {
        super(selectChannelFragment, selectChannelFragment2, w6i0.class, false);
        this.n = selectChannelFragment;
        this.o = a1wVar;
    }

    @Override // xsna.yj50
    public final s6i0 a(Bundle bundle) {
        return new s6i0(this.o);
    }

    @Override // xsna.yj50
    public final u6i0 b() {
        return new u6i0(this.n);
    }

    @Override // xsna.yj50
    public final x6i0 d() {
        return new x6i0(this.n);
    }
}
