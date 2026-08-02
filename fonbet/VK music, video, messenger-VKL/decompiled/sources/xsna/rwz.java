package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: LocalityAdapter.kt */
/* loaded from: classes6.dex */
public final class rwz extends gf6<zif0> {
    public final unt e;

    /* compiled from: LocalityAdapter.kt */
    public static final class a extends hf6<twz> {
        @Override // xsna.hf6
        public final /* bridge */ /* synthetic */ void W5(twz twzVar) {
        }
    }

    /* compiled from: LocalityAdapter.kt */
    public static final class b extends hf6<uwz> {
        public final TextView m;
        public final TextView n;
        public final ImageView o;

        public b(View view, unt untVar) {
            super(view);
            this.m = (TextView) view.findViewById(R.id.title);
            this.n = (TextView) view.findViewById(R.id.subtitle);
            this.o = (ImageView) view.findViewById(R.id.check);
            bwt0.i0(view, new wqb(12, untVar, this));
        }

        @Override // xsna.hf6
        public final void W5(uwz uwzVar) {
            qwz qwzVar = uwzVar.a;
            boolean N = drm0.N(qwzVar.b);
            this.itemView.setMinimumHeight(iah0.a(N ? 48 : 60));
            this.m.setText(qwzVar.a);
            String str = qwzVar.b;
            TextView textView = this.n;
            textView.setText(str);
            bwt0.p0(textView, !N);
            bwt0.d0(this.o, !qwzVar.c);
        }
    }

    public rwz(unt untVar) {
        super((hg6) new com.vk.lists.a(vwz.a), false);
        this.e = untVar;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        if (i == R.layout.vk_item_superapp_locality) {
            return new b(view, this.e);
        }
        twz.a.getClass();
        if (i == twz.b) {
            return new a(view);
        }
        throw new IllegalArgumentException(lhg.a(i, "Unexpected view type: "));
    }
}
