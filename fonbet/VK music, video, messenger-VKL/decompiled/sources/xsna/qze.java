package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.attachments.api.di.ClipsAttachmentsComponent;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qze implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ qze(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipsUploadUiVkComponent) this.c.mo408a(fpf0.a(ClipsUploadUiVkComponent.class));
            case 1:
                return ((ClipsAttachmentsComponent) this.c.a(fpf0.a(ClipsAttachmentsComponent.class))).i2().a();
            case 2:
                return ((NewsFeedComponent) this.c.a(fpf0.a(NewsFeedComponent.class))).w();
            case 3:
                return (StorefrontServicesComponent) this.c.a(fpf0.a(StorefrontServicesComponent.class));
            default:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).p();
        }
    }
}
