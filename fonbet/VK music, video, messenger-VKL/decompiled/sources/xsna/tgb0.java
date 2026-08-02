package xsna;

import android.text.Spannable;
import android.view.ViewGroup;
import com.vk.core.view.links.LinkedTextView;
import com.vkontakte.android.R;

/* compiled from: PodcastDescriptionHolder.kt */
/* loaded from: classes3.dex */
public final class tgb0 extends dib0<ej90> {
    public final ViewGroup n;
    public final LinkedTextView o;
    public boolean p;
    public final gi8 q;

    public tgb0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.music_podcast_page_description_item, 0);
        this.n = (ViewGroup) this.itemView.findViewById(R.id.container);
        this.o = (LinkedTextView) this.itemView.findViewById(R.id.description);
        this.q = new gi8(this, 11);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        ej90 ej90Var = (ej90) obj;
        CharSequence charSequence = ej90Var.a;
        ViewGroup.LayoutParams layoutParams = this.n.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        CharSequence charSequence2 = this.p ? charSequence : ej90Var.b;
        LinkedTextView linkedTextView = this.o;
        linkedTextView.setText(charSequence2);
        linkedTextView.setContentDescription(ej90Var.c);
        linkedTextView.setTag(charSequence);
        bwt0.p0(linkedTextView, true);
        if (charSequence2 instanceof Spannable) {
            x7q[] x7qVarArr = (x7q[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), x7q.class);
            x7q x7qVar = x7qVarArr != null ? (x7q) rl3.O(x7qVarArr) : null;
            if (x7qVar != null) {
                x7qVar.m = this.q;
            }
        }
    }
}
