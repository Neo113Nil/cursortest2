package xsna;

import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: CommunityProfileFeature.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class ioh extends AdaptedFunctionReference implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ioh(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
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
                Throwable th = (Throwable) obj;
                u440 u440Var = (u440) this.receiver;
                int i = u440.I0;
                u440Var.getClass();
                L.g("MultiStory", th);
                th.printStackTrace();
                h03.b(th);
                ((g440) u440Var.s).ik();
                u440Var.j.M();
                break;
            default:
                L.E((Throwable) obj, new Object[0]);
                break;
        }
        return s3q0.a;
    }
}
