package xsna;

import android.content.Context;
import android.view.View;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.statistic.DeprecatedStatisticPlayheadViewabilityMrcUrl;
import com.vk.superapp.api.dto.app.catalog.SectionButton;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import xsna.m8v0;
import xsna.pg30;
import xsna.x7a;
import xsna.xt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vx implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vx(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PostingUserMessage postingUserMessage;
        String str;
        int i = this.b;
        xt0.a aVar = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                izs izsVar = (izs) obj3;
                ActionsAvailabilityState.Availability availability = ((ActionsAvailabilityState.AttachmentState) obj2).b;
                PostingAction.Editing.SelectVkTicketMiniAppActionButton selectVkTicketMiniAppActionButton = new PostingAction.Editing.SelectVkTicketMiniAppActionButton((ActionButton) obj);
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(selectVkTicketMiniAppActionButton);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, selectVkTicketMiniAppActionButton, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                break;
            case 1:
                myc0.h((yvj) obj2, null, null, new fet((izs) obj3, (xdt) obj, null), 3);
                break;
            case 2:
                ((Iterator) obj3).remove();
                ((rg30) obj2).a.a(new pg30.b((DeprecatedStatisticPlayheadViewabilityMrcUrl) obj));
                break;
            case 3:
                jd80 jd80Var = (jd80) obj3;
                String str2 = (String) obj2;
                uk ukVar = (uk) obj;
                if (jd80Var.b.getVisibility() == 0 && jd80Var.f) {
                    etv0 etv0Var = jd80Var.d;
                    if (etv0Var != null) {
                        etv0Var.b(false);
                    }
                    int i2 = m8v0.M;
                    View view = jd80Var.b;
                    VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopLeft;
                    VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style1;
                    VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size56;
                    VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Lime;
                    dhr0.a.getClass();
                    m8v0.a.a(view, str2, null, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, vkOnboarding$TintColor, vkTooltip$BalloonPosition, null, new yr00(jd80Var, 12), null, null, null, new bbw(jd80Var, 16), new aq1(17, jd80Var, ukVar), null, 0, false, null, null, true, dhr0.y(), false, 1035908);
                    jd80Var.e = new lg(27);
                }
                break;
            case 4:
                ((pgc0) obj3).e0((UserId) obj2, (PostingCreationEntryPoint) obj);
                break;
            case 5:
                String str3 = (String) obj2;
                b3d0 b3d0Var = (b3d0) obj;
                PostInteract postInteract = ((PrettyCardAttachment.Card) obj3).l;
                if (postInteract != null && (str = postInteract.c) != null) {
                    AdsintEventTypeDto adsintEventTypeDto = AdsintEventTypeDto.MRC_IMPRESSION_PRETTY_CARD;
                    int layoutPosition = b3d0Var.getLayoutPosition();
                    aVar = new xt0.a(adsintEventTypeDto, str3, str, layoutPosition < 0 ? xt0.c.b.a : new xt0.c.a(layoutPosition));
                    break;
                }
                break;
            case 6:
                x7a.b bVar = (x7a.b) obj;
                ((wkf0) obj3).m.f(((SectionButton) obj2).c, bVar.g.b.b, bVar.e, null);
                break;
            default:
                ((u4t0) obj3).b((Context) obj2, (VideoAlbum) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ vx(yvj yvjVar, izs izsVar, xdt xdtVar) {
        this.b = 1;
        this.d = yvjVar;
        this.c = izsVar;
        this.e = xdtVar;
    }
}
