package xsna;

import android.content.Context;
import android.widget.FrameLayout;
import com.vk.api.generated.apps.dto.AppsMiniappsCatalogDto;
import com.vk.api.generated.market.dto.MarketGetOrderPaymentURLResponseDto;
import com.vk.api.generated.market.dto.MarketPaymentParametersDto;
import com.vk.api.generated.stories.dto.StoriesSaveResponseDto;
import com.vk.dto.common.Good;
import com.vk.dto.market.order.OrderPaymentParameters;
import com.vk.geo.impl.model.Coordinate;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.bbv0;
import xsna.fnt;
import xsna.g69;
import xsna.h37;
import xsna.hfr;
import xsna.kku0;
import xsna.r69;
import xsna.xn50;

/* compiled from: BindNewCardPresenter.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class i37 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i37(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        kku0 kku0Var;
        switch (this.b) {
            case 0:
                tr90 tr90Var = (tr90) obj;
                h37 h37Var = (h37) this.receiver;
                g37 g37Var = h37Var.i;
                kku0Var = h37Var.k;
                g37Var.un();
                if (tr90Var.b()) {
                    kku0Var.d(tr90Var.e, tr90Var.d, "g37");
                } else {
                    if (h37.a.$EnumSwitchMapping$0[tr90Var.b.ordinal()] == 1) {
                        Context mo2getContext = g37Var.mo2getContext();
                        if (mo2getContext != null) {
                            kku0.a.a(kku0Var, new Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext.getString(R.string.vk_pay_checkout_system_error_occured)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), new yv2(4))));
                        }
                    } else {
                        h37Var.k();
                    }
                }
                return s3q0.a;
            case 1:
                r69 r69Var = (r69) obj;
                ((s69) this.receiver).getClass();
                if (r69Var instanceof r69.a) {
                    return new g69.b(((r69.a) r69Var).a);
                }
                if (r69Var instanceof r69.b) {
                    return new g69.c(((r69.b) r69Var).a);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                ((z37) this.receiver).b((bfa) obj);
                return s3q0.a;
            case 3:
                ((o2c) this.receiver).getClass();
                bbv0.g.getClass();
                bbv0.a.c((Throwable) obj);
                return s3q0.a;
            case 4:
                com.vk.profile.community.details.impl.contacts.b bVar = (com.vk.profile.community.details.impl.contacts.b) this.receiver;
                bVar.getClass();
                xn50.a.c(bVar, (com.vk.profile.community.details.impl.contacts.a) obj);
                return s3q0.a;
            case 5:
                Good good = (Good) obj;
                elh elhVar = (elh) this.receiver;
                int i = elh.M;
                Services services = (Services) elhVar.t;
                if (services != null) {
                    zih.a(elhVar.E, services, new ooi0(good, services), null, 12);
                }
                return s3q0.a;
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                xam xamVar = (xam) this.receiver;
                DialogExt dialogExt = xamVar.t.a;
                dialogExt.Hb(((wpp) obj).e(Long.valueOf(dialogExt.e)));
                xamVar.t.e = null;
                xamVar.X0();
                xamVar.e1();
                xamVar.a1(xamVar.t.a());
                return s3q0.a;
            case 8:
                return ((q73) this.receiver).d((AppsMiniappsCatalogDto) obj);
            case 9:
                long j = ((Coordinate) obj).j();
                fnt.a<Coordinate> aVar = ((fnt) this.receiver).b;
                aVar.b.set(new Coordinate(j));
                i0q0.e(aVar);
                return s3q0.a;
            case 10:
                zbx zbxVar = ((p5z) this.receiver).a.l0;
                if (zbxVar != null) {
                    com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.a aVar2 = zbxVar.c;
                    if (aVar2 != null) {
                        hfr.a aVar3 = new hfr.a(rli0.j(new jxt0(aVar2.b), rbx.b));
                        while (aVar3.hasNext()) {
                            ((InteractivePollStickerView) aVar3.next()).setVisibility(8);
                        }
                    }
                    mbx mbxVar = zbxVar.d;
                    if (mbxVar != null) {
                        uov uovVar = mbxVar.a;
                        mbxVar.e = true;
                        ((FrameLayout) mbxVar.g.getValue()).setVisibility(0);
                        uovVar.pause();
                        uovVar.v0(false, (r3 & 2) != 0, false);
                        mhy.j(mbxVar.a().h);
                    }
                }
                return Boolean.TRUE;
            case 11:
                ((par0) this.receiver).getClass();
                par0.d((Throwable) obj);
                return s3q0.a;
            case 12:
                MarketGetOrderPaymentURLResponseDto marketGetOrderPaymentURLResponseDto = (MarketGetOrderPaymentURLResponseDto) obj;
                ((uw80) this.receiver).getClass();
                MarketPaymentParametersDto d = marketGetOrderPaymentURLResponseDto.d();
                String url = d != null ? d.getUrl() : null;
                MarketPaymentParametersDto d2 = marketGetOrderPaymentURLResponseDto.d();
                return new OrderPaymentParameters(url, d2 != null ? d2.d() : null);
            case 13:
                ((ekm0) this.receiver).getClass();
                return ekm0.a((StoriesSaveResponseDto) obj);
            default:
                ((a2m0) this.receiver).a(((Number) obj).longValue());
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i37(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 7:
                super(1, obj, xam.class, "onUpdateAllByCacheSuccess", "onUpdateAllByCacheSuccess(Lcom/vk/im/engine/models/EntityMap;)V", 0);
                break;
            case 8:
            case 12:
            default:
                break;
            case 9:
                super(1, obj, fnt.class, "notifyNewUserLocation", "notifyNewUserLocation-ZVsG6a0(J)V", 0);
                break;
            case 10:
                super(1, obj, p5z.class, "openQuestionSticker", "openQuestionSticker(Lcom/vk/dto/stories/model/clickable/ClickableQuestion;)Z", 0);
                break;
            case 11:
                super(1, obj, par0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 13:
                super(1, obj, ekm0.class, "mapSaveResponse", "mapSaveResponse(Lcom/vk/api/generated/stories/dto/StoriesSaveResponseDto;)Lcom/vk/dto/stories/model/StoryEntry;", 0);
                break;
        }
    }
}
