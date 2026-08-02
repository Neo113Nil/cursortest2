package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.n930;

/* compiled from: MoreOptionsPopupDialogAdapter.kt */
/* loaded from: classes16.dex */
public final class o930<T extends n930> extends zoj0<T, o930<T>.a> {
    public final d50 e;

    /* compiled from: MoreOptionsPopupDialogAdapter.kt */
    public final class a extends vif0<T> {
        public final ImageView n;
        public final TextView o;

        public a(o930 o930Var, View view) {
            super(view);
            this.n = (ImageView) this.itemView.findViewById(R.id.action_icon);
            this.o = (TextView) this.itemView.findViewById(R.id.action_text);
            bwt0.i0(this.itemView, new g6(18, o930Var, this));
        }

        @Override // xsna.vif0
        public final void i6(Object obj) {
            n930 n930Var = (n930) obj;
            Context context = this.itemView.getContext();
            Drawable drawable = context.getDrawable(n930Var.a);
            if (drawable != null) {
                drawable.setTint(dhr0.Y(R.attr.vk_ui_icon_accent_themed, bwt0.u(context)));
            } else {
                drawable = null;
            }
            ImageView imageView = this.n;
            bwt0.p0(imageView, true);
            imageView.setImageDrawable(drawable);
            this.o.setText(n930Var.b);
        }
    }

    public o930(d50 d50Var) {
        this.e = d50Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((a) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this, tf3.b(viewGroup, R.layout.actions_popup_item, viewGroup, false));
    }
}
