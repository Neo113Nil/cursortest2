package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: InterruptionReporter.kt */
/* loaded from: classes5.dex */
public final class eox implements dox {
    @Override // xsna.wzs
    public final s3q0 invoke(String str, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.IM_CUSTOM_THREAD_INTERRUPTION.h(), null, str, Integer.valueOf(booleanValue ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -14, 3, null);
        l5mVar.q();
        return s3q0.a;
    }
}
