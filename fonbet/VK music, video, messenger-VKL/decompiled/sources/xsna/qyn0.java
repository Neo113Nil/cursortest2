package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.tabs.Tab$Mode;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.common.ImageSize;
import com.vk.video.ui.upload.impl.videoviewer.presentation.feature.entity.VideoViewerState;
import java.util.Collections;
import java.util.List;
import xsna.r1k0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qyn0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qyn0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                VkTabs vkTabs = new VkTabs((Context) obj, null, 0, 14, 0);
                vkTabs.setMode(Tab$Mode.Default);
                return vkTabs;
            case 1:
                return drm0.p0((String) obj).toString();
            case 2:
                return Boolean.valueOf(((ajp0) obj).c.h());
            case 3:
                qgi0.r((tgi0) obj, "user_profile_music_track_title");
                return s3q0.a;
            case 4:
                if (ics0.d.contains(Integer.valueOf(((VKApiExecutionException) obj).s()))) {
                    return ics0.e;
                }
                return null;
            case 5:
                Uri parse = Uri.parse(((ImageSize) obj).d.d);
                return Boolean.valueOf(rhs.b().d(parse) || rhs.b().c(parse) || rhs.b().f(parse));
            case 6:
                return Collections.singletonList(new r1k0((r1k0.b) obj));
            case 7:
                return VideoViewerState.a((VideoViewerState) obj, null, null, false, 0L, 0L, 4);
            case 8:
                return new jyw0((ViewGroup) obj);
            default:
                int i = c2x0.o1;
                ((List) obj).toString();
                return s3q0.a;
        }
    }
}
