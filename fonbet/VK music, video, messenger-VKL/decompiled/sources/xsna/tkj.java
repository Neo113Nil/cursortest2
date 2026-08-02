package xsna;

import android.app.Application;
import com.vk.donut.video.impl.di.DonutVideoComponentImpl;
import com.vk.libvideo.adfree.impl.di.VideoAdFreeSubscriptionComponentImpl;
import com.vk.stickers.di.StickersComponentImpl;
import com.vk.story.impl.di.StoriesComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class tkj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tkj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new StickersComponentImpl.a((Application) obj);
            case 1:
                DonutVideoComponentImpl donutVideoComponentImpl = (DonutVideoComponentImpl) obj;
                return new z4o(donutVideoComponentImpl.a.a(), donutVideoComponentImpl.b.p().e(), new r5t0(), donutVideoComponentImpl.c, new qeq0());
            case 2:
                com.vk.auth.main.b bVar = ((vop) obj).d;
                if (bVar != null) {
                    return bVar;
                }
                return null;
            case 3:
                return ((nx50) obj).F0().wc();
            case 4:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) obj;
                qcy<Object>[] qcyVarArr = StoriesComponentImpl.N;
                return new qtl0(storiesComponentImpl.Df(), storiesComponentImpl.bf(), storiesComponentImpl.fb(), storiesComponentImpl.o7(), storiesComponentImpl.b7(), storiesComponentImpl.Ef());
            default:
                return new xyr0(((VideoAdFreeSubscriptionComponentImpl) obj).a.p());
        }
    }
}
