package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoShowcaseViewHolder;
import com.vk.ecomm.market.goodpreview.domain.state.ProductPreviewError;
import com.vk.im.engine.models.messages.Msg;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;
import xsna.r1k0;
import xsna.tt9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pzj implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pzj(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj4;
                mtk0 mtk0Var = (mtk0) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2119048396, intValue, -1, "com.vk.ecomm.cart.impl.courier_map.ui.compose.CourierMapScreen.<anonymous>.<anonymous> (CourierMapScreen.kt:89)");
                    }
                    szj.a((qm00) mtk0Var.getValue(), izsVar, null, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                f9k.b(ne7.I(1), (androidx.compose.runtime.a) obj, (String) obj3, (izs) obj4);
                break;
            case 2:
                ProductPreviewError productPreviewError = (ProductPreviewError) obj4;
                i7u i7uVar = (i7u) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1706840046, intValue2, -1, "com.vk.ecomm.market.goodpreview.presentation.view.GoodPreviewView.bindError.<anonymous>.<anonymous> (GoodPreviewView.kt:171)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new gbh(i7uVar, 20);
                        aVar2.R(x);
                    }
                    ard0.a(productPreviewError, (gzs) x, txj0.d(q630.a.a, 1.0f), aVar2, Tensorflow.FRAME_WIDTH);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                k410 k410Var = (k410) obj4;
                l410 l410Var = (l410) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1225080817, intValue3, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.adapter.header.MarketItemReviewsHeaderItemViewHolder.bind.<anonymous> (MarketItemReviewsHeaderItemViewHolder.kt:32)");
                    }
                    rrv0.d(null, null, null, null, kai.c(684277420, new f6(4, k410Var, l410Var), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 4:
                Msg msg = (Msg) obj3;
                int intValue4 = ((Integer) obj).intValue();
                ((Boolean) obj2).getClass();
                pk30 pk30Var = ((ft30) obj4).g;
                if (pk30Var != null) {
                    pk30Var.J(msg, intValue4);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((t490) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((w8d0) obj4).d0((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                nud0.i((tt9.b.C3771b) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 8:
                ((Integer) obj2).getClass();
                vgg0.b((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                q1k0.a((r1k0.a) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                uml0.a((cpl0) obj3, (izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int i2 = VideoProfileCreatorOnboardingVideoCounterView.o;
                ((VideoProfileCreatorOnboardingVideoCounterView) obj3).B((izs) obj4, (androidx.compose.runtime.a) obj, ne7.I(71));
                break;
            default:
                VideoShowcaseViewHolder videoShowcaseViewHolder = (VideoShowcaseViewHolder) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2142552878, intValue5, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoShowcaseViewHolder.createView.<anonymous>.<anonymous> (VideoShowcaseViewHolder.kt:93)");
                    }
                    UIBlockVideo uIBlockVideo = (UIBlockVideo) ((zak0) videoShowcaseViewHolder.d).getValue();
                    if (uIBlockVideo == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(230161165, new sw(composeView, uIBlockVideo, videoShowcaseViewHolder, uIBlockVideo.G), aVar4), aVar4, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pzj(Object obj, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
    }

    public /* synthetic */ pzj(Object obj, q630 q630Var, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = q630Var;
    }
}
