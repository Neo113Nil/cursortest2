package xsna;

import com.vk.network.kbh.state.NetworkState;
import kotlin.NoWhenBranchMatchedException;
import xsna.lpm;
import xsna.npm;

/* compiled from: DialogsFabFeature.kt */
/* loaded from: classes18.dex */
public final class kpm extends di6<ppm, npm, Object, lpm> {
    @Override // xsna.di6
    public final void d(npm npmVar) {
        npm npmVar2 = npmVar;
        if (!(npmVar2 instanceof npm.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (d6q0.t == NetworkState.UNSTABLE) {
            cvk.t();
        } else {
            m(new lpm.a(((npm.a) npmVar2).b));
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
