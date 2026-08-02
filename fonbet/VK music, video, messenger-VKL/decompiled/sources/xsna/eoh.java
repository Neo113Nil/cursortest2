package xsna;

import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CommunityProfileFeature.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class eoh extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eoh(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).C((CommunityProfileAction) obj);
                break;
            case 1:
                ((q7p) this.receiver).C((com.vk.search.params.impl.presentation.modal.education.mvi.model.a) obj);
                break;
            case 2:
                L.E((Throwable) obj, new Object[0]);
                break;
            default:
                bn40.c((Throwable) obj, new Object[0]);
                break;
        }
        return s3q0.a;
    }
}
