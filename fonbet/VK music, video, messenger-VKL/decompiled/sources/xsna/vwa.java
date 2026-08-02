package xsna;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import io.jsonwebtoken.JwtParser;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.swa;

/* compiled from: ChannelControlsVhOld.kt */
/* loaded from: classes2.dex */
public final class vwa extends vfz<swa> {
    public final leb l;
    public final CheckBox m;
    public final TextView n;
    public final TextView o;
    public final ImageView p;
    public swa q;

    public vwa(View view, leb lebVar) {
        super(view);
        this.l = lebVar;
        this.m = (CheckBox) this.itemView.findViewById(R.id.vkim_checkbox);
        this.n = (TextView) this.itemView.findViewById(R.id.vkim_username);
        this.o = (TextView) this.itemView.findViewById(R.id.vkim_counters);
        this.p = (ImageView) this.itemView.findViewById(R.id.vkim_subscribers_icon);
        bwt0.i0(this.itemView, new fb(this, 14));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(swa swaVar) {
        swa swaVar2 = swaVar;
        this.q = swaVar2;
        boolean z = swaVar2 instanceof swa.a;
        ImageView imageView = this.p;
        TextView textView = this.n;
        if (z) {
            textView.setText(this.itemView.getContext().getString(R.string.vkim_channel_control_all));
            f4m.x(cn70.b(4), textView);
            f4m.j(imageView);
        } else {
            if (!(swaVar2 instanceof swa.b)) {
                throw new NoWhenBranchMatchedException();
            }
            textView.setText(this.itemView.getContext().getString(R.string.vkim_channel_control_subscribers));
            f4m.x(cn70.b(0), textView);
            imageView.setVisibility(0);
        }
        int W5 = swaVar2.W5();
        this.o.setText(W5 >= 1000 ? String.format(Locale.getDefault(), "%.1fК", Arrays.copyOf(new Object[]{Double.valueOf(W5 / 1000.0d)}, 1)).replace(JwtParser.SEPARATOR_CHAR, ',') : String.valueOf(W5));
        this.m.setChecked(swaVar2.p());
    }
}
