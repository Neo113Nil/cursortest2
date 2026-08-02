package xsna;

import android.content.Context;
import com.vk.api.generated.messages.dto.MessagesGetGroupsForCallResponseDto;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.DiscoverErrorLoadContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.voip.ui.sessionrooms.f;
import xsna.cvw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class fxi0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ fxi0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((f.a.b) obj).c);
            case 1:
                ((StoryEntry) obj).h = true;
                return s3q0.a;
            case 2:
                return String.valueOf(((Peer) obj).b);
            case 3:
                return (Narrative) j5g.Y((VKList) obj);
            case 4:
                L.i((Throwable) obj);
                return s3q0.a;
            case 5:
                return Boolean.valueOf(((StoriesContainer) obj) instanceof DiscoverErrorLoadContainer);
            case 6:
                VkLinkedText vkLinkedText = new VkLinkedText((Context) obj, null, 6, 0);
                vkLinkedText.setText("This is a test [https://vk.com](https://vk.com) link");
                return vkLinkedText;
            case 7:
                return Boolean.valueOf(com.vk.libvideo.api.minimizable.a.k((VideoMinimizableState) obj));
            case 8:
                return Boolean.valueOf(dd80.f((UIBlockList) obj, new irt(27)) != null);
            case 9:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 10:
                return s3q0.a;
            case 11:
                return s3q0.a;
            case 12:
                L.g("Error on share link prepare: ", (Throwable) obj);
                return s3q0.a;
            case 13:
                return ((MessagesGetGroupsForCallResponseDto) obj).d();
            default:
                return cvw0.b.a;
        }
    }
}
