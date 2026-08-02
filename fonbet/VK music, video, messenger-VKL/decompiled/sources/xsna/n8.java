package xsna;

import android.app.Activity;
import com.vk.dto.common.Good;
import com.vk.log.L;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixOption;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.state.Services;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.xn50;

/* compiled from: AboutVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class n8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                L.i((Throwable) obj);
                break;
            case 2:
                L.i((Throwable) obj);
                break;
            case 3:
                Good good = (Good) obj;
                elh elhVar = (elh) this.receiver;
                int i = elh.M;
                Services services = (Services) elhVar.t;
                if (services != null) {
                    zih.a(elhVar.E, services, new ooi0(good, services), null, 12);
                }
                break;
            case 4:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.receiver;
                communityProfileFragment.getClass();
                xn50.a.c(communityProfileFragment, (CommunityProfileAction) obj);
                break;
            case 5:
                nri nriVar = (nri) this.receiver;
                nriVar.getClass();
                a94 a94Var = new a94(9, nriVar, (Activity) obj);
                if (i0q0.b()) {
                    a94Var.invoke();
                } else {
                    i0q0.f(a94Var);
                }
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                ji80 ji80Var = (ji80) this.receiver;
                ji80Var.getClass();
                xn50.a.c(ji80Var, (xrb0) obj);
                break;
            case 9:
                e8j0 e8j0Var = (e8j0) this.receiver;
                e8j0Var.getClass();
                xn50.a.c(e8j0Var, (x7j0) obj);
                break;
            case 10:
                int intValue = ((Number) obj).intValue();
                lrp0 lrp0Var = (lrp0) this.receiver;
                break;
            case 11:
                int intValue2 = ((Number) obj).intValue();
                d4v0 d4v0Var = (d4v0) this.receiver;
                d4v0Var.e.invoke(((MixOption) d4v0Var.c.get(intValue2)).b);
                break;
            default:
                L.i((Throwable) obj);
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 4:
                super(1, obj, CommunityProfileFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                break;
            case 12:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(nri nriVar) {
        super(1, nriVar, nri.class, "warmupComposition", "warmupComposition(Landroid/app/Activity;)V", 0);
        this.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(kt70 kt70Var) {
        super(1, kt70Var, kt70.class, "buildV1Key", "buildV1Key(Landroidx/media3/datasource/DataSpec;)Ljava/lang/String;", 0);
        this.b = 7;
    }
}
