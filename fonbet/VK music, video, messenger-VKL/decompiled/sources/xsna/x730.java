package xsna;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: MoneyTransferItemHolder.kt */
/* loaded from: classes3.dex */
public final class x730 extends hf6<w730> {
    public final izs<Integer, s3q0> m;

    public x730(View view, o010 o010Var) {
        super(view);
        this.m = o010Var;
        this.itemView.setOnClickListener(new qp4(this, 3));
    }

    @Override // xsna.hf6
    public final void W5(w730 w730Var) {
        MenuItem menuItem = w730Var.a;
        this.itemView.setId(menuItem.getItemId());
        ((TextView) this.itemView.findViewById(R.id.title)).setText(menuItem.getTitle());
        ((ImageView) this.itemView.findViewById(R.id.icon)).setImageDrawable(menuItem.getIcon());
    }
}
