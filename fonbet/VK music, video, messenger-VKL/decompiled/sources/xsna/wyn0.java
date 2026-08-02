package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.concurrent.ThreadExecutorStuckException;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.Collection;
import java.util.concurrent.ExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wyn0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wyn0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ExecutorService b;
        switch (this.b) {
            case 0:
                VkTabs vkTabs = new VkTabs((Context) obj, null, 0, 14, 0);
                vkTabs.setMode(Tab$Mode.Accent);
                return vkTabs;
            case 1:
                com.vk.metrics.eventtracking.b.a.a(new ThreadExecutorStuckException((Collection) obj));
                return s3q0.a;
            case 2:
                xlb0 xlb0Var = (xlb0) obj;
                return Boolean.valueOf(xlb0Var.d && xlb0Var.h);
            case 3:
                return Integer.valueOf(((MsgFromChannel) obj).d);
            case 4:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 5:
                return Boolean.valueOf(((UIBlock) obj).e == CatalogDataType.DATA_TYPE_VIDEO_VIDEOS);
            case 6:
                return (com.vk.video.ui.discovery.minimizable.dialog.related_videos.j) obj;
            case 7:
                int intValue = ((Integer) obj).intValue();
                b = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "sub-thread-" + intValue);
                return b;
            default:
                return ((yqx0) obj).c;
        }
    }
}
