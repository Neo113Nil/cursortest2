package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.StaticMapView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;

/* compiled from: MapAddressHolder.kt */
/* loaded from: classes4.dex */
public final class pj00 extends m56<GeoAttachment> implements View.OnClickListener {
    public final StaticMapView D;
    public final TextView E;
    public final TextView F;

    public pj00(ViewGroup viewGroup) {
        super(R.layout.attach_map, viewGroup);
        this.D = (StaticMapView) this.itemView.findViewById(R.id.map);
        this.E = (TextView) this.itemView.findViewById(R.id.attach_title);
        this.F = (TextView) this.itemView.findViewById(R.id.attach_subtitle);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.m56
    public final void T6(GeoAttachment geoAttachment) {
        GeoAttachment geoAttachment2 = geoAttachment;
        this.E.setText(geoAttachment2.h);
        this.F.setText(geoAttachment2.i);
        this.D.e(geoAttachment2.f, geoAttachment2.g);
    }
}
