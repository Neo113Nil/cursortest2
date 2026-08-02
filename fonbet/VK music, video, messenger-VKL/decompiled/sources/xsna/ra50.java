package xsna;

import android.view.View;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ra50 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ra50(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                Set<String> set = MusicTrackCellVh.A;
                MusicTrackCellVh.h(view.getContext());
                return s3q0.a;
            case 1:
                u11.h(-1, -2, view);
                return view;
            default:
                int i2 = nvi0.k1;
                bwt0.p0(view, ((Integer) obj).intValue() > 0);
                return s3q0.a;
        }
    }

    public /* synthetic */ ra50(MusicTrackCellVh musicTrackCellVh, View view) {
        this.b = 0;
        this.c = view;
    }
}
