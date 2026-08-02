package xsna;

import android.view.ViewGroup;
import com.vk.dto.common.VideoFile;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerProgress;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class lir0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ lir0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        switch (this.b) {
            case 0:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.c = ((VkAuthValidateAccountResponse) obj).d;
                return s3q0.a;
            case 1:
                return ((ru.mail.libverify.e.c) obj).a();
            case 2:
                VideoPlayerProgress videoPlayerProgress = ((VideoPlayerState) obj).c;
                if ((videoPlayerProgress instanceof VideoPlayerProgress.Filled) || (videoPlayerProgress instanceof VideoPlayerProgress.Empty) || (videoPlayerProgress instanceof VideoPlayerProgress.Ad)) {
                    i = 0;
                } else {
                    if (!(videoPlayerProgress instanceof VideoPlayerProgress.Vod)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = (int) ((VideoPlayerProgress.Vod) videoPlayerProgress).b;
                }
                return Integer.valueOf(i);
            case 3:
                return s3q0.a;
            case 4:
                return Integer.valueOf(((VideoFile) obj).o0());
            case 5:
                ((Integer) obj).intValue();
                return s3q0.a;
            case 6:
                return new xd90((ViewGroup) obj);
            case 7:
                return s3q0.a;
            case 8:
                return s3q0.a;
            default:
                return ((s99) obj).c;
        }
    }
}
