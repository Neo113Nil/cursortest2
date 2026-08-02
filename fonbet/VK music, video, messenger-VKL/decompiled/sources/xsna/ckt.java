package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;

/* compiled from: GeoCompactHolder.kt */
/* loaded from: classes4.dex */
public final class ckt extends m56<GeoAttachment> implements View.OnClickListener {
    public final View D;
    public final TextView E;
    public final StringBuilder F;
    public e6o G;

    public ckt(ViewGroup viewGroup) {
        super(R.layout.attach_geo_compact, viewGroup);
        View findViewById = this.itemView.findViewById(R.id.attach_geo_compact_container);
        this.D = findViewById;
        this.E = (TextView) this.itemView.findViewById(R.id.attach_geo_compact_title);
        this.F = new StringBuilder();
        awt0.x(findViewById, 0, cn70.b(4), 0, cn70.b(4), 5);
        View view = this.itemView;
        View.OnClickListener onClickListener = this.G;
        view.setOnClickListener(onClickListener == null ? this : onClickListener);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a = s6oVar.a(this, s6oVar.e);
        this.G = a;
        this.itemView.setOnClickListener(a);
    }

    @Override // xsna.m56
    public final void T6(GeoAttachment geoAttachment) {
        GeoAttachment geoAttachment2 = geoAttachment;
        StringBuilder sb = this.F;
        sb.setLength(0);
        sb.append(geoAttachment2.h);
        String str = geoAttachment2.i;
        if (str != null && str.length() != 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(geoAttachment2.i);
        }
        this.E.setText(sb);
    }
}
