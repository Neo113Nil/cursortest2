package xsna;

import com.vk.instantjobs.InstantJob;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l7x implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ l7x(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((r7x.a) obj).e(InstantJob.NotificationShowCondition.WHEN_UI_INVISIBLE));
            default:
                return s3q0.a;
        }
    }
}
