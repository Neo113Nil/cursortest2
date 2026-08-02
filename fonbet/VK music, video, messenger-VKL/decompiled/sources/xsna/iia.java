package xsna;

import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class iia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ iia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (VideoRestrictedUserActionsComponent) this.c.a(fpf0.a(VideoRestrictedUserActionsComponent.class));
            default:
                return (VkClientMultiAccountComponent) this.c.a(fpf0.a(VkClientMultiAccountComponent.class));
        }
    }
}
