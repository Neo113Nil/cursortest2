package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.groups.GroupPrivacy;
import java.util.Optional;
import xsna.ea6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class w96 implements izs {
    public final /* synthetic */ g9u0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ w96(g9u0 g9u0Var, long j, int i) {
        this.b = g9u0Var;
        this.c = j;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Optional optional = (Optional) obj;
        boolean isPresent = optional.isPresent();
        long j = this.c;
        if (isPresent) {
            Channel channel = (Channel) optional.get();
            if (channel.B == GroupPrivacy.OPEN || channel.o) {
                return this.b.e(this.d, j);
            }
        }
        return io.reactivex.rxjava3.core.x.k(new ea6.e.b(j));
    }
}
