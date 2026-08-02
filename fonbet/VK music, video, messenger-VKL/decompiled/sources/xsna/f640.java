package xsna;

import android.view.View;
import com.vkontakte.android.R;

/* compiled from: MultiStoryAdapter.kt */
/* loaded from: classes16.dex */
public final class f640 extends gf6<zif0> {
    public final bjk e;
    public final el30 f;
    public final ecm g;

    public f640(hg6 hg6Var, bjk bjkVar, el30 el30Var, ecm ecmVar) {
        super(hg6Var, false);
        this.e = bjkVar;
        this.f = el30Var;
        this.g = ecmVar;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        if (i == R.layout.item_editor_story) {
            return new g640(view, this.e);
        }
        if (i == R.layout.item_editor_new_story) {
            return new x340(view, this.g);
        }
        throw new IllegalStateException("Unsupported viewType");
    }
}
