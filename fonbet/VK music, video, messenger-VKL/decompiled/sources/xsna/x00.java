package xsna;

import android.view.View;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ x00(View view) {
        this.b = 1;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th);
                i0q0.d(500L, new z6(1, view, th));
                break;
            case 1:
                int i2 = CommentsOutherFragment.h0;
                ucp.f(view);
                break;
            default:
                Set<String> set = MusicTrackCellVh.A;
                MusicTrackCellVh.h(view.getContext());
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ x00(CatalogViewHolder catalogViewHolder, View view, int i) {
        this.b = i;
        this.c = view;
    }
}
