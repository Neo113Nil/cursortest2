package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh;
import com.vk.donut.privacy.levels.PrivacyEditDonutLevelsFragment;
import com.vk.dto.common.Good;
import com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.CreateMarketItemReviewFragment;
import com.vk.notifications.NotificationClickHandlerImpl;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.qdd0;
import xsna.xn50;

/* compiled from: AiAssistantCardVh.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class ic1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ic1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        int i = 0;
        switch (this.b) {
            case 0:
                AiAssistantCardVh aiAssistantCardVh = (AiAssistantCardVh) this.receiver;
                aiAssistantCardVh.getClass();
                jjc.a(new hc1(i, (com.vk.catalog2.common.ui.mvp.holder.video.assistant.a) obj, aiAssistantCardVh));
                return s3q0.a;
            case 1:
                Good good = (Good) obj;
                kih kihVar = (kih) this.receiver;
                int i2 = kih.O;
                p8u p8uVar = (p8u) kihVar.t;
                if (p8uVar != null) {
                    zih.a(kihVar.E, p8uVar, new z3u(good, p8uVar), null, 12);
                }
                return s3q0.a;
            case 2:
                CreateMarketItemReviewFragment createMarketItemReviewFragment = (CreateMarketItemReviewFragment) this.receiver;
                createMarketItemReviewFragment.getClass();
                xn50.a.c(createMarketItemReviewFragment, (z7k) obj);
                return s3q0.a;
            case 3:
                return ((ecg) this.receiver).a((JSONObject) obj);
            case 4:
                ((jyx) this.receiver).i((Throwable) obj);
                return s3q0.a;
            case 5:
                f510 f510Var = (f510) this.receiver;
                f510Var.getClass();
                xn50.a.c(f510Var, (e510) obj);
                return s3q0.a;
            case 6:
                ((NotificationClickHandlerImpl) this.receiver).getClass();
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 7:
                ((h49) this.receiver).w((mlp) obj);
                return s3q0.a;
            case 8:
                bwt0.p0(((eka0) this.receiver).i, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 9:
                qdd0 qdd0Var = (qdd0) obj;
                PrivacyEditDonutLevelsFragment privacyEditDonutLevelsFragment = (PrivacyEditDonutLevelsFragment) this.receiver;
                qcy<Object>[] qcyVarArr = PrivacyEditDonutLevelsFragment.T;
                privacyEditDonutLevelsFragment.getClass();
                if (!(qdd0Var instanceof qdd0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intent intent = new Intent();
                intent.putExtra("donut_level", ((qdd0.a) qdd0Var).a);
                s3q0 s3q0Var = s3q0.a;
                privacyEditDonutLevelsFragment.Mf(-1, intent);
                return s3q0.a;
            case 10:
                ((wzh0) this.receiver).h(((Boolean) obj).booleanValue());
                return s3q0.a;
            default:
                l31 l31Var = (l31) obj;
                k31 k31Var = (k31) this.receiver;
                if (l31Var != null) {
                    k31Var.getClass();
                    arrayList = l31Var.c;
                } else {
                    arrayList = null;
                }
                l31 l31Var2 = k31Var.e;
                if (!epx.f(arrayList, l31Var2 != null ? l31Var2.c : null)) {
                    mg0 mg0Var = k31Var.f;
                    if (mg0Var != null) {
                        dw20 dw20Var = mg0Var.e;
                        if (dw20Var != null) {
                            dw20Var.dismiss();
                        }
                        mg0Var.e = null;
                    }
                    k31Var.f = null;
                    k31Var.e = l31Var;
                    if (l31Var != null) {
                        Context context = k31Var.a;
                        ArrayList arrayList2 = l31Var.c;
                        ((ng0) k31Var.d.getValue()).getClass();
                        mg0 mg0Var2 = new mg0(context, ng0.a(arrayList2), k31Var.b, k31Var.c);
                        k31Var.f = mg0Var2;
                        mg0Var2.a();
                    } else {
                        k31Var.f = null;
                    }
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(CreateMarketItemReviewFragment createMarketItemReviewFragment) {
        super(1, createMarketItemReviewFragment, CreateMarketItemReviewFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(Object obj) {
        super(1, obj, AiAssistantCardVh.class, "handleAction", "handleAction(Lcom/vk/catalog2/common/ui/mvp/holder/video/assistant/AiAssistantCardAction;)V", 0);
        this.b = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(jyx jyxVar) {
        super(1, jyxVar, jyx.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.b = 4;
    }
}
