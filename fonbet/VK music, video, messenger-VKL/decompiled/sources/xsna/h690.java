package xsna;

import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import java.util.function.Function;
import one.video.calls.sdk_private.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class h690 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ h690(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((b.C2172b) obj).a;
            default:
                return (VideoDiscoverGridItem) ((DiscoverGridItem) obj);
        }
    }
}
