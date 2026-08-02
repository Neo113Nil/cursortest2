package xsna;

import android.net.Network;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultLocalTunnelDetector.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class uhl extends FunctionReferenceImpl implements wzs<Network, Boolean, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Network network, Boolean bool) {
        Network network2 = network;
        boolean booleanValue = bool.booleanValue();
        whl whlVar = (whl) this.receiver;
        LinkedHashSet linkedHashSet = whlVar.e;
        if (whlVar.f) {
            if (booleanValue) {
                linkedHashSet.add(network2);
            } else {
                linkedHashSet.remove(network2);
            }
            boolean z = !linkedHashSet.isEmpty();
            if (z != whlVar.g) {
                whlVar.g = z;
                mq2 mq2Var = whlVar.i;
                if (mq2Var != null) {
                    mq2Var.invoke(Boolean.valueOf(z), Boolean.FALSE);
                }
            }
        }
        return s3q0.a;
    }
}
