package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.voip.calls.join.impl.di.VoipCallsJoinRouterComponentImpl;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class eul0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ eul0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new esl0();
            case 1:
                return new rnp0();
            case 2:
                Context context = e43.a;
                return Integer.valueOf((context != null ? context : null).getResources().getDimensionPixelSize(R.dimen.voip_small_content_item_width));
            case 3:
                return Boolean.valueOf(fxc0.B().J().p1());
            case 4:
                bpn0 bpn0Var = VideoOverlayView.I;
                return new jwx(2, 30);
            case 5:
                return new mzr0();
            case 6:
                return Integer.valueOf(R.layout.fullscreen_clip_item_controls);
            case 7:
                o260 o260Var = d260.a;
                return (o260Var != null ? o260Var : null).f(NetworkClient.ClientType.WEB_SOCKET);
            case 8:
                return new bsp(VkCell.Middle.Size.values(), "com.vk.core.view.components.cell.VkCell.Middle.Size");
            case 9:
                return VkCellSkeleton$Left$Main.Companion.serializer();
            case 10:
                return Long.valueOf(SystemClock.elapsedRealtime());
            default:
                qcy<Object>[] qcyVarArr = VoipCallsJoinRouterComponentImpl.b;
                return new ukw0();
        }
    }
}
