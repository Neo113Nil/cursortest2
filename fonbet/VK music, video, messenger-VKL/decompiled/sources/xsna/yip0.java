package xsna;

import androidx.room.RoomDatabase;
import com.vk.push.pushsdk.data.VkpnsPushDatabase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TransactionProviderImpl.kt */
/* loaded from: classes5.dex */
public final class yip0 implements xip0 {
    public final RoomDatabase a;

    public yip0(VkpnsPushDatabase vkpnsPushDatabase) {
        this.a = vkpnsPushDatabase;
    }

    @Override // xsna.xip0
    public final Object a(izs izsVar, ContinuationImpl continuationImpl) {
        return bmg0.a(this.a, izsVar, continuationImpl);
    }
}
