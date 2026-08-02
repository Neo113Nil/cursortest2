package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vkontakte.android.VKApplication;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.NetError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class v7r0 implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        VKApplication.a aVar = VKApplication.c;
        String h = DevNullEventKey.LAUNCHER_ICONS_CHANGE.h();
        int i2 = 0;
        if (booleanValue) {
            i = 1;
        } else {
            if (booleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        if (booleanValue2) {
            i2 = 1;
        } else if (booleanValue2) {
            throw new NoWhenBranchMatchedException();
        }
        SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = new SchemeStat$TypeDevNullItem(h, null, null, Integer.valueOf(i), null, Integer.valueOf(i2), str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_INTERNET_DISCONNECTED, 3, null);
        l5m l5mVar = new l5m(null, null, 3);
        l5mVar.g = schemeStat$TypeDevNullItem;
        l5mVar.q();
        return s3q0.a;
    }
}
