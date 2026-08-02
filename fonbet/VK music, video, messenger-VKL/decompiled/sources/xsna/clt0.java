package xsna;

import android.widget.ImageView;
import com.vk.auth.ui.multiaccount.VkMultiAccountSelectorView;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.voip.calls.join.impl.presentation.link.bypassword.VoipCallsJoinToCallByPasswordActivity;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.ejx0.b;
import xsna.hix0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class clt0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ clt0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 20;
        int i3 = 3;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Integer.valueOf(((ArrayList) obj).size());
            case 1:
                VideoView videoView = (VideoView) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                return new o640(videoView.getContext(), ((InfoBridgeComponent) ((k7m) m7m.c(videoView)).a(fpf0.a(InfoBridgeComponent.class))).t().b(), new jcf0(videoView, 24), videoView.getViewBinding().u, new uhs0(videoView, 6), new tfm0(videoView, i2), new VideoView.h(0, videoView, VideoView.class, "settingsClicked", "settingsClicked()V", 0));
            case 2:
                sqt0 sqt0Var = (sqt0) obj;
                return new c20(new m5o0(sqt0Var, 10), new qah0(sqt0Var, 21), new uvs0(sqt0Var, i3), new gqh0(sqt0Var, i2));
            case 3:
                return new bhg(((com.vk.auth.ui.password.askpassword.a) obj).b.Mb());
            case 4:
                return ((ggu0) obj).b;
            case 5:
                int i4 = VkMultiAccountSelectorView.B;
                return ((MultiAccountComponent) ((k7m) m7m.f((VkMultiAccountSelectorView) obj)).a(fpf0.a(MultiAccountComponent.class))).a();
            case 6:
                ((xbv0) obj).f.mo();
                return s3q0.a;
            case 7:
                int i5 = VoipCallsJoinToCallByPasswordActivity.z;
                ((VoipCallsJoinToCallByPasswordActivity) obj).finish();
                return s3q0.a;
            case 8:
                ejx0 ejx0Var = (ejx0) obj;
                return new hix0.a(ejx0Var.a, ejx0Var.b, ejx0Var.c, ejx0Var.d, ejx0Var.e).Z(new gf3(ejx0Var, i3)).e0(ejx0Var.new b());
            case 9:
                int i6 = WriteBar.h0;
                return (VkAvatar) ((WriteBar) obj).findViewById(R.id.writebar_channel_avatar);
            default:
                return (ImageView) ((y1y0) obj).a.findViewById(R.id.writebar_emoji_new);
        }
    }
}
