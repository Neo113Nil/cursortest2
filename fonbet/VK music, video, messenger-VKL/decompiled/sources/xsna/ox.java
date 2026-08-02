package xsna;

import android.content.Context;
import android.os.Parcelable;
import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ox implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Parcelable f;

    public /* synthetic */ ox(int i, Parcelable parcelable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = parcelable;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PostingUserMessage postingUserMessage;
        switch (this.b) {
            case 0:
                ActionButton actionButton = (ActionButton) this.c;
                ActionButton actionButton2 = (ActionButton) this.d;
                izs izsVar = (izs) this.e;
                ActionsAvailabilityState.AttachmentState attachmentState = (ActionsAvailabilityState.AttachmentState) this.f;
                if (actionButton != null) {
                    actionButton2 = null;
                }
                ActionsAvailabilityState.Availability availability = attachmentState.b;
                PostingAction.Editing.SetActionButton setActionButton = new PostingAction.Editing.SetActionButton(actionButton2);
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(setActionButton);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, setActionButton, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                break;
            default:
                iwf iwfVar = (iwf) this.c;
                Long l = (Long) this.d;
                Context context = (Context) this.e;
                WebAdConfig webAdConfig = (WebAdConfig) this.f;
                eel0 eel0Var = (eel0) iwfVar.g.getValue();
                BannerAdUiData.LayoutType layoutType = BannerAdUiData.LayoutType.OVERLAY;
                eel0Var.c(new BannerAdUiData(layoutType, layoutType, BannerAdUiData.BannerLocation.BOTTOM, BannerAdUiData.BannerAlign.UNSPECIFIED, BannerAdUiData.HeightType.REGULAR, BannerAdUiData.Orientation.HORIZONTAL), l.longValue(), context, webAdConfig);
                break;
        }
        return s3q0.a;
    }
}
