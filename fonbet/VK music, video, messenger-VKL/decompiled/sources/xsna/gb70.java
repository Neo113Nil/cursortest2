package xsna;

import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: NotificationListFragment.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class gb70 extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ gb70(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((wl50) this.receiver).C((oa70) obj);
                break;
            default:
                ((a5r0) this.receiver).b((UxPollEntryPoint) obj, false);
                break;
        }
        return s3q0.a;
    }

    public gb70(vk50 vk50Var) {
        super(1, vk50Var, wl50.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0);
    }
}
