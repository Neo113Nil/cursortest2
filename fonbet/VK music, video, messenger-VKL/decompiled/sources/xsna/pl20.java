package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.device.store.AppStore;
import com.vkontakte.android.R;

/* compiled from: MidasBankViewHolder.kt */
/* loaded from: classes2.dex */
public final class pl20 extends vfz<ol20> {
    public final a l;
    public final ImageView m;
    public final TextView n;

    /* compiled from: MidasBankViewHolder.kt */
    public interface a {
        void b(int i);
    }

    public pl20(ViewGroup viewGroup, pm70 pm70Var) {
        super(R.layout.vh_bank_midas, viewGroup);
        this.l = pm70Var;
        this.m = (ImageView) this.itemView.findViewById(R.id.icon);
        this.n = (TextView) this.itemView.findViewById(R.id.name);
    }

    @Override // xsna.vfz
    public final void W5(ol20 ol20Var) {
        ol20 ol20Var2 = ol20Var;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        boolean g = dy2.g(context, AppStore.RUSTORE);
        ImageView imageView = this.m;
        if (g) {
            imageView.setImageDrawable(ol20Var2.c);
        } else {
            omw.d(imageView, R.drawable.vk_icon_bank_outline_28, R.attr.vk_ui_icon_accent);
        }
        this.n.setText(ol20Var2.d);
        this.itemView.setOnClickListener(new pgr(1, this, ol20Var2));
    }
}
