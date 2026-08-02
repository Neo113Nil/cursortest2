package xsna;

import com.vk.instantjobs.InstantJob;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m7x implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        r7x.a aVar = (r7x.a) obj;
        return Boolean.valueOf(aVar.e(InstantJob.NotificationShowCondition.WHEN_UI_INVISIBLE) || aVar.e(InstantJob.NotificationShowCondition.WHEN_APP_SUSPENDING));
    }
}
