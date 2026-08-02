package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.lp3;

/* compiled from: ArticleColorfulPopupAdapter.kt */
/* loaded from: classes15.dex */
public final class on3 extends zoj0<lp3.a, a> {
    public final vs e;

    /* compiled from: ArticleColorfulPopupAdapter.kt */
    public static final class a extends vif0<lp3.a> {
        public final izs<lp3.a, s3q0> n;
        public final TextView o;

        public a(ViewGroup viewGroup, vs vsVar) {
            super(viewGroup, R.layout.articleeditor_colored_popup_item, 0);
            this.n = vsVar;
            this.o = (TextView) this.itemView.findViewById(android.R.id.text1);
            jjc.g(this.itemView, new com.vk.movika.sdk.base.observable.e(this, 8));
        }

        @Override // xsna.vif0
        public final void i6(lp3.a aVar) {
            lp3.a aVar2 = aVar;
            CharSequence text = this.itemView.getContext().getText(aVar2.a);
            TextView textView = this.o;
            textView.setText(text);
            textView.setTextColor(dhr0.t.c(aVar2.b));
        }
    }

    public on3(vs vsVar) {
        this.e = vsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        a aVar = (a) e0Var;
        lp3.a aVar2 = (lp3.a) this.c.c(i);
        if (aVar2 == null) {
            return;
        }
        aVar.V5(aVar2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.e);
    }
}
