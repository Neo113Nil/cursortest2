package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: MidasOtherBankViewHolder.kt */
/* loaded from: classes2.dex */
public final class rl20 extends vfz<ql20> {
    public final a l;

    /* compiled from: MidasOtherBankViewHolder.kt */
    public interface a {
        void g();
    }

    public rl20(ViewGroup viewGroup, pm70 pm70Var) {
        super(R.layout.vh_bank_midas, viewGroup);
        this.l = pm70Var;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.icon);
        TextView textView = (TextView) this.itemView.findViewById(R.id.name);
        omw.d(imageView, R.drawable.vk_icon_bank_outline_28, R.attr.vk_legacy_accent);
        textView.setText(R.string.nspk_other_bank);
        this.itemView.setOnClickListener(new dd6(this, 6));
    }

    @Override // xsna.vfz
    public final /* bridge */ /* synthetic */ void W5(ql20 ql20Var) {
    }
}
