package xsna;

import android.view.View;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;

/* compiled from: StoryBackgroundAdapter.kt */
/* loaded from: classes16.dex */
public final class eyl0 extends gf6 {
    public final /* synthetic */ int e = 0;
    public final izs f;

    public eyl0(ListDataSet listDataSet, lyl0 lyl0Var) {
        super((hg6) listDataSet, true);
        this.f = lyl0Var;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        switch (this.e) {
            case 0:
                if (i == R.layout.item_story_background) {
                    return new pyl0(view, (lyl0) this.f);
                }
                throw new IllegalStateException(lhg.a(i, "Unsupported viewType in StoryArchiveAdapter = "));
            default:
                if (i == R.layout.item_swap_recycler) {
                    return new z21(view, (tm0) this.f);
                }
                throw new IllegalStateException("Unsupported viewType");
        }
    }

    public eyl0(ListDataSet listDataSet, tm0 tm0Var) {
        super((hg6) listDataSet, false);
        this.f = tm0Var;
    }
}
