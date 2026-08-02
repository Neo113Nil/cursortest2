package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: SettingViewHolder.kt */
/* loaded from: classes18.dex */
public final class c0j0 extends j0n0<xzi0> implements View.OnClickListener {
    public final ImageView n;
    public final TextView o;
    public final TextView p;

    public c0j0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.settings_paid_icon_item, 0);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.photo);
        this.n = imageView;
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (TextView) this.itemView.findViewById(R.id.date);
        imageView.setBackgroundTintList(ColorStateList.valueOf(this.itemView.getContext().getColor(R.color.vk_sky_300)));
        this.itemView.setBackgroundResource(R.drawable.highlight);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        xzi0 xzi0Var = (xzi0) obj;
        this.n.setImageResource(xzi0Var.b);
        this.o.setText(xzi0Var.c);
        Integer num = xzi0Var.d;
        TextView textView = this.p;
        if (num == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.itemView.getContext().getString(R.string.vk_subscription_payed, pvo0.o(num.intValue(), false, true)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xzi0 xzi0Var;
        gzs<s3q0> gzsVar;
        if (jjc.b() || (xzi0Var = (xzi0) this.m) == null || (gzsVar = xzi0Var.e) == null) {
            return;
        }
        gzsVar.invoke();
    }
}
