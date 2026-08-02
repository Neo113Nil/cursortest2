package xsna;

import com.vk.api.generated.tabbar.dto.TabbarGetResponseDto;
import com.vk.instantjobs.InstantJob;
import xsna.r7x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m3w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ m3w(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.metrics.eventtracking.b.a.a((Exception) obj);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((r7x.a) obj).e(InstantJob.NotificationShowCondition.WHEN_UI_INVISIBLE));
            case 2:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            default:
                return gun0.a((TabbarGetResponseDto) obj);
        }
    }
}
