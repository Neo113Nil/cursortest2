package xsna;

import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.related_videos.data.VideoRelatedVideosPagingType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class n9e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n9e(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return new io.reactivex.rxjava3.internal.operators.single.k0(((yz10) this.d).d(this.c, -2, ((Integer) obj).intValue() * 10, 10));
            default:
                hus0 hus0Var = ((com.vk.video.ui.discovery.minimizable.related_videos.c) this.d).e;
                VideoRelatedVideosPagingType videoRelatedVideosPagingType = VideoRelatedVideosPagingType.VideoQueue;
                hus0Var.invoke(new c.s0.g(this.c, (rbt0) obj, videoRelatedVideosPagingType));
                return s3q0.a;
        }
    }
}
