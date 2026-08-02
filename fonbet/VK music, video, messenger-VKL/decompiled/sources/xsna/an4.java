package xsna;

import android.view.View;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;

/* compiled from: AudioEffectAdapter.kt */
/* loaded from: classes16.dex */
public final class an4 extends gf6<cn4> {
    public final q8 e;

    public an4(ListDataSet listDataSet, q8 q8Var) {
        super((hg6) listDataSet, false);
        this.e = q8Var;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        if (i == R.layout.item_clips_morphing_effect_holder) {
            return new bn4(view, this.e);
        }
        throw new IllegalStateException("Unsupported viewType");
    }
}
