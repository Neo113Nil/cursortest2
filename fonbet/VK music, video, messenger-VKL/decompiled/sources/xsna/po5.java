package xsna;

import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AutoflowDelegate.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class po5 extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po5(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                bn40.c((Throwable) obj, new Object[0]);
                break;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).C((CommunityProfileAction) obj);
                break;
            default:
                ((s9i0) this.receiver).C((p9i0) obj);
                break;
        }
        return s3q0.a;
    }
}
