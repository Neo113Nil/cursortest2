package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;

/* compiled from: StreetAddressHolder.kt */
/* loaded from: classes4.dex */
public final class lpm0 extends m56<GeoAttachment> implements View.OnClickListener, blc0 {
    public static final int G = iah0.a(42);
    public final TextView D;
    public final View E;
    public final StringBuilder F;

    public lpm0(ViewGroup viewGroup) {
        super(R.layout.post_address, viewGroup);
        this.D = (TextView) this.itemView.findViewById(R.id.attach_title);
        this.E = this.itemView.findViewById(R.id.attach_common_remove_button);
        this.F = new StringBuilder();
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.E, z);
        ((ViewGroup.MarginLayoutParams) this.D.getLayoutParams()).rightMargin = z ? G : 0;
    }

    @Override // xsna.m56
    public final void T6(GeoAttachment geoAttachment) {
        GeoAttachment geoAttachment2 = geoAttachment;
        StringBuilder sb = this.F;
        sb.setLength(0);
        String str = geoAttachment2.h;
        if (str != null && str.length() != 0) {
            sb.append(geoAttachment2.h);
        }
        String str2 = geoAttachment2.i;
        if (str2 != null && str2.length() != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(geoAttachment2.i);
        }
        if (sb.length() == 0) {
            sb.append(v6(R.string.place));
        }
        this.D.setText(sb);
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.E.setOnClickListener(onClickListener);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        W6(view);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
