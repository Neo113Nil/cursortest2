package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollSettings;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ uw5(int i, Serializer.StreamParcelable streamParcelable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = streamParcelable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        PostingUserMessage postingUserMessage;
        int i = this.b;
        int i2 = 2;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                mtk0 mtk0Var = (mtk0) obj2;
                List list = sfl0.b;
                break;
            case 1:
                final Good good = (Good) obj3;
                cw00 cw00Var = (cw00) obj2;
                gw00 gw00Var = (gw00) obj;
                final UIBlock uIBlock = (UIBlock) obj4;
                if (good.J || (!cw00Var.c && !cw00Var.b)) {
                    final bw00 bw00Var = gw00Var.f;
                    final Integer num = gw00Var.j;
                    bw00Var.getClass();
                    final MarketFavable s = ao8.s(good);
                    smq.f(((BridgeComponent) ((k7m) m7m.f(bw00Var)).a(fpf0.a(BridgeComponent.class))).cb(), bw00Var.c, s, new wzs() { // from class: xsna.aw00
                        /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // xsna.wzs
                        public final Object invoke(Object obj5, Object obj6) {
                            ((Boolean) obj5).getClass();
                            MarketFavable marketFavable = MarketFavable.this;
                            if (((gmq) obj6).equals(marketFavable)) {
                                UIBlock uIBlock2 = uIBlock;
                                if (!(uIBlock2 instanceof UIBlockMarketItem)) {
                                    return s3q0.a;
                                }
                                UIBlockMarketItem.b bVar = new UIBlockMarketItem.b(marketFavable, num, ((UIBlockMarketItem) uIBlock2).z);
                                bw00 bw00Var2 = bw00Var;
                                bw00Var2.b.b.f.a(new cfp0(uIBlock2, bVar));
                                fy00 fy00Var = (fy00) bw00Var2.e.getValue();
                                Good good2 = good;
                                fy00Var.b(new hy00(good2.b, good2.c, marketFavable.f));
                            }
                            return s3q0.a;
                        }
                    }, new v17(s, bw00Var, good, 4), new ojg(s, bw00Var, good, i2), true, null, good.d0, PsExtractor.AUDIO_STREAM);
                }
                break;
            case 2:
                izs izsVar = (izs) obj3;
                PostingPollDto postingPollDto = (PostingPollDto) obj;
                PostingPollSettings postingPollSettings = (PostingPollSettings) obj4;
                ActionsAvailabilityState.Availability availability = ((ActionsAvailabilityState.AttachmentState) obj2).b;
                PostingAction.Navigation.OpenInCurrentStep openInCurrentStep = new PostingAction.Navigation.OpenInCurrentStep(new PostingStepScreen.PollEditor(postingPollDto != null ? PostingPollDto.a(postingPollDto, 0L, 2047) : new PostingPollDto(0, null, null, null, false, false, false, false, 0L, false, false, 2047, null), postingPollDto, postingPollDto != null ? PollEditorMode.Edit.b : PollEditorMode.Create.b, new PollEditorUiConfig(postingPollSettings.b, 0, 0, postingPollSettings.d, postingPollSettings.c, 0, 0, 102, null)));
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(openInCurrentStep);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, openInCurrentStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                break;
            default:
                w6s0 w6s0Var = (w6s0) obj;
                ((wh50) obj4).setValue(Boolean.FALSE);
                ((ViewGroup) obj3).removeView((ComposeView) obj2);
                k78 k78Var = w6s0Var.a.e;
                if (k78Var != null) {
                    k78Var.b("video_bottom_sheet_redesign");
                }
                fxc0.B().s().l();
                w6s0Var.c = null;
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ uw5(List list, mtk0 mtk0Var, wh50 wh50Var, mtk0 mtk0Var2) {
        this.b = 0;
        this.c = list;
        this.d = mtk0Var;
        this.f = wh50Var;
        this.e = mtk0Var2;
    }

    public /* synthetic */ uw5(wh50 wh50Var, ViewGroup viewGroup, ComposeView composeView, w6s0 w6s0Var) {
        this.b = 3;
        this.f = wh50Var;
        this.c = viewGroup;
        this.d = composeView;
        this.e = w6s0Var;
    }
}
