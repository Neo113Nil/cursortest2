package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.e3m;
import xsna.k38;

/* compiled from: BottomActionAdapterImpl.kt */
/* loaded from: classes6.dex */
public final class m38 extends k38 {
    public final gzs<s3q0> c;
    public ArrayList d;

    /* compiled from: BottomActionAdapterImpl.kt */
    public static final class a extends k38.a {
        public final ViewGroup l;
        public final gzs<s3q0> m;
        public final TextView n;
        public final ImageView o;

        public a(ViewGroup viewGroup, gzs<s3q0> gzsVar) {
            super(tf3.b(viewGroup, R.layout.holder_bottom_action_popup, viewGroup, false));
            this.l = viewGroup;
            this.m = gzsVar;
            this.n = (TextView) this.itemView.findViewById(R.id.title_action);
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.img_action);
            this.o = imageView;
            imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_action_sheet_text));
        }

        @Override // xsna.k38.a
        public final void V5(p38 p38Var) {
            this.n.setText(p38Var.b);
            this.itemView.setOnClickListener(new l38(0, this, p38Var));
            Integer num = p38Var.a.a;
            if (num != null) {
                int intValue = num.intValue();
                Context context = this.l.getContext();
                e3m.a aVar = e3m.a;
                this.o.setImageDrawable(m33.a(intValue, context));
            }
        }
    }

    public m38(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(k38.a aVar, int i) {
        p38 p38Var;
        k38.a aVar2 = aVar;
        ArrayList arrayList = this.d;
        if (arrayList == null || (p38Var = (p38) j5g.b0(i, arrayList)) == null) {
            return;
        }
        aVar2.V5(p38Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final k38.a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.c);
    }
}
