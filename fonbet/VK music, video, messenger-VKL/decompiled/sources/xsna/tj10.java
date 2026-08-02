package xsna;

import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.hostinfo.MasterElections;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterIPCClient.kt */
/* loaded from: classes5.dex */
public final class tj10 extends Lambda implements wzs<MasterElections, AsyncCallback, s3q0> {
    final /* synthetic */ String $newMasterPackage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj10(String str) {
        super(2);
        this.$newMasterPackage = str;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(MasterElections masterElections, AsyncCallback asyncCallback) {
        masterElections.notifyOldMaster(this.$newMasterPackage, asyncCallback);
        return s3q0.a;
    }
}
