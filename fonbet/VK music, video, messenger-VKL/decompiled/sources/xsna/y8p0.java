package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.sync.online.VkOnlineService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class y8p0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ y8p0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                o0s0 b = com.vk.toggle.d.L.b();
                return b == null ? new o0s0(true, true) : b;
            case 2:
                int i = VideoRelatedVideosFragment.n0;
                return Boolean.valueOf(fxc0.B().J().X1());
            case 3:
                return VkCell.Left.Main.Size.Companion.serializer();
            case 4:
                int i2 = VkInputSelect.m;
                return new int[]{R.attr.formItemStateValid};
            case 5:
                bpn0 bpn0Var = VkOnlineService.f;
                csu0.a.getClass();
                return csu0.a();
            case 6:
                return kq01.t();
            default:
                return new StringBuffer();
        }
    }
}
