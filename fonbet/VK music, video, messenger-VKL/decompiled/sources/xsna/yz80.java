package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: OtherBankViewHolder.kt */
/* loaded from: classes2.dex */
public final class yz80 extends vfz<xz80> {
    public final a l;

    /* compiled from: OtherBankViewHolder.kt */
    public interface a {
        void g();
    }

    public yz80(ViewGroup viewGroup, pm70 pm70Var) {
        super(R.layout.vh_bank, viewGroup);
        this.l = pm70Var;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.icon);
        TextView textView = (TextView) this.itemView.findViewById(R.id.name);
        omw.d(imageView, R.drawable.vk_icon_bank_outline_28, R.attr.vk_legacy_accent);
        textView.setText(R.string.nspk_other_bank);
        this.itemView.setOnClickListener(new pc3(this, 6));
    }

    @Override // xsna.vfz
    public final /* bridge */ /* synthetic */ void W5(xz80 xz80Var) {
    }
}
