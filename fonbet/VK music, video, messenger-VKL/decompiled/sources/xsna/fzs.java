package xsna;

import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.pushsdk.broadcast.FullyPackageRemovedReceiver;
import kotlin.jvm.internal.Lambda;

/* compiled from: FullyPackageRemovedReceiver.kt */
/* loaded from: classes5.dex */
public final class fzs extends Lambda implements izs<Boolean, s3q0> {
    final /* synthetic */ String $masterHost;
    final /* synthetic */ String $packageName;
    final /* synthetic */ FullyPackageRemovedReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzs(FullyPackageRemovedReceiver fullyPackageRemovedReceiver, String str, String str2) {
        super(1);
        this.this$0 = fullyPackageRemovedReceiver;
        this.$packageName = str;
        this.$masterHost = str2;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        FullyPackageRemovedReceiver fullyPackageRemovedReceiver = this.this$0;
        String str = this.$packageName;
        ((AnalyticsSender) fullyPackageRemovedReceiver.h.getValue()).send(new s83(str, booleanValue, epx.f(str, this.$masterHost)));
        return s3q0.a;
    }
}
