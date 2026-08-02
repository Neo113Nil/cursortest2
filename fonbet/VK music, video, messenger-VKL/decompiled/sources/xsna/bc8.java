package xsna;

import com.vk.profile.community.address.api.di.CommunityAddressComponent;
import com.vk.voip.stereo.api.notifications.di.VoipStereoNotificationsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class bc8 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ bc8(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (VoipStereoNotificationsComponent) this.c.a(fpf0.a(VoipStereoNotificationsComponent.class));
            default:
                return (CommunityAddressComponent) this.c.a(fpf0.a(CommunityAddressComponent.class));
        }
    }
}
