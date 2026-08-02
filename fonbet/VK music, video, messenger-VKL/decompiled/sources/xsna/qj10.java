package xsna;

import com.vk.push.core.base.AidlResult;
import com.vk.push.pushsdk.masterhost.ipc.HostAppInfo;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterIPCClient.kt */
/* loaded from: classes5.dex */
public final class qj10 extends Lambda implements wzs {
    public static final qj10 j;
    public static final qj10 k;
    public final /* synthetic */ int i;

    static {
        int i = 2;
        j = new qj10(i, 0);
        k = new qj10(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qj10(int i, int i2) {
        super(i);
        this.i = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return new Result((HostAppInfo) ((AidlResult) obj).getData());
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
