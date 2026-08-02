package xsna;

import com.vk.auth.smartflow.impl.SmartflowComponentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.cell.VkCell;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.subscription.impl.di.SubscriptionComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import com.vkontakte.android.sync.online.VkOnlineService;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class w5k0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ w5k0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = SmartflowComponentImpl.c;
                return new c6k0();
            case 1:
                int i = StoryBottomViewGroup.P;
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_NEW_REACTIONS;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 2:
                qcy<Object>[] qcyVarArr2 = SubscriptionComponentImpl.d;
                return new dwg0();
            case 3:
                ComFeatures comFeatures = ComFeatures.COM_SETTINGS_WITHOUT_SUBSCRIBE;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 4:
                o0s0 b = com.vk.toggle.d.M.b();
                return b == null ? new o0s0(true, true) : b;
            case 5:
                return ((VideoMinimizablePlayerComponent) ((k7m) m7m.f(rts0.b)).a(fpf0.a(VideoMinimizablePlayerComponent.class))).b3();
            case 6:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(BuildInfo.q());
            case 7:
                DecimalFormat decimalFormat = new DecimalFormat();
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols.setGroupingSeparator(' ');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                decimalFormat.setMaximumFractionDigits(2);
                decimalFormat.setGroupingSize(3);
                return decimalFormat;
            case 8:
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                return new bsp(VkCell.Left.Main.Size.values(), "com.vk.core.view.components.cell.VkCell.Left.Main.Size");
            case 11:
                bsu0 bsu0Var = (bsu0) VkOnlineService.f.getValue();
                return Boolean.valueOf(bsu0Var != null && bsu0Var.c);
            case 12:
                return tqu0.a;
            case 13:
                return s3q0.a;
            default:
                int i3 = WhiteboardFragment.R;
                com.vk.voip.ui.c.b.getClass();
                return com.vk.voip.ui.c.m0();
        }
    }
}
