package xsna;

import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: KeyboardHeaderVmojiHolder.kt */
/* loaded from: classes6.dex */
public final class zfy extends qf6 {
    public final y4l0 l;
    public final TextView m;
    public final ImageButton n;
    public final TextView o;
    public final ViewGroup p;

    public zfy(ViewGroup viewGroup, y4l0 y4l0Var) {
        super(viewGroup, R.layout.sticker_keyboard_vmoji_header, 0);
        this.l = y4l0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.pack_name);
        this.n = (ImageButton) this.itemView.findViewById(R.id.settings_button);
        this.o = (TextView) this.itemView.findViewById(R.id.accessories_counter);
        this.p = (ViewGroup) this.itemView.findViewById(R.id.promo_btn_container);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        agy agyVar = (agy) hfzVar;
        this.m.setText(agyVar.b);
        bwt0.i0(this.n, new wqb(11, this, agyVar));
        int i = agyVar.e;
        TextView textView = this.o;
        if (i > 0) {
            textView.setText(i < 100 ? go9.b("+", String.valueOf(i)) : i < 100 ? String.valueOf(i) : "99+");
            textView.setVisibility(0);
        } else {
            f4m.j(textView);
        }
        bwt0.i0(this.p, new ri0(18, this, agyVar));
    }
}
