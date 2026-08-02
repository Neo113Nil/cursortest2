package xsna;

import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import java.util.Iterator;
import java.util.List;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7s implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ f7s(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    g2u0.d(((qi6) it.next()).itemView, new dam(5));
                }
                break;
            default:
                for (UsableRecyclerView.j jVar : this.c) {
                    FeedGoodsPhotoHolder feedGoodsPhotoHolder = jVar instanceof FeedGoodsPhotoHolder ? (FeedGoodsPhotoHolder) jVar : null;
                    if (feedGoodsPhotoHolder != null) {
                        feedGoodsPhotoHolder.n1();
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
