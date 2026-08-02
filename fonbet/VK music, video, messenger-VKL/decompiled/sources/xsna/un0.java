package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: StickerWordsHolder.kt */
/* loaded from: classes6.dex */
public final class un0 extends vfz<vn0> {
    public final c2l0 l;
    public final View m;

    public un0(ViewGroup viewGroup, k8l0 k8l0Var) {
        super(R.layout.sticker_suggest_list_add_suggest_item, viewGroup);
        Context context = this.itemView.getContext();
        View view = this.itemView;
        this.l = new c2l0(context, view, k8l0Var);
        this.m = view.findViewById(R.id.add);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(vn0 vn0Var) {
        jjc.g(this.m, new tn0(0, this, vn0Var));
    }
}
