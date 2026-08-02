package xsna;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.hostinfo.MasterElections;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterIPCClient.kt */
/* loaded from: classes5.dex */
public final class pj10 extends Lambda implements wzs<MasterElections, AsyncCallback, s3q0> {
    public static final pj10 i = new pj10(2);

    @Override // xsna.wzs
    public final s3q0 invoke(MasterElections masterElections, AsyncCallback asyncCallback) {
        masterElections.getHostInfo(asyncCallback);
        return s3q0.a;
    }
}
