package xsna;

import android.content.Intent;
import com.vk.channels.impl.channelselection.SelectChannelFragment;
import com.vk.im.mvicomponent.MviComponentFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.t6i0;

/* compiled from: SelectChannelNavigationEventRouter.kt */
/* loaded from: classes16.dex */
public final class u6i0 implements hm50<t6i0> {
    public final MviComponentFragment a;

    public u6i0(SelectChannelFragment selectChannelFragment) {
        this.a = selectChannelFragment;
    }

    @Override // xsna.hm50
    public final void a(t6i0 t6i0Var) {
        t6i0 t6i0Var2 = t6i0Var;
        if (!(t6i0Var2 instanceof t6i0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Intent intent = new Intent();
        intent.putExtra("select", ((t6i0.a) t6i0Var2).a);
        this.a.Mf(-1, intent);
    }
}
