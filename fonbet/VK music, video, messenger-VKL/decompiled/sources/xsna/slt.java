package xsna;

import android.app.Activity;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.view.StaticMapView;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: GeoPostsMapHolder.kt */
/* loaded from: classes4.dex */
public final class slt extends rp6<tlt, NewsEntry> implements View.OnClickListener {
    public final View E;
    public final StaticMapView F;
    public final TextView G;
    public final VkMiniInfoCell H;

    public slt(ViewGroup viewGroup) {
        super(R.layout.holder_geo_feed_place, viewGroup);
        this.D = t980.a;
        View findViewById = this.itemView.findViewById(R.id.map_container);
        this.E = findViewById;
        this.F = (StaticMapView) this.itemView.findViewById(R.id.map_view);
        TextView textView = (TextView) this.itemView.findViewById(R.id.distance);
        this.G = textView;
        VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) this.itemView.findViewById(R.id.address);
        this.H = vkMiniInfoCell;
        q1i0 q1i0Var = new q1i0(this.itemView.getContext(), R.drawable.vk_bg_tip_no_tail_center, R.drawable.vk_bg_tip_tail_bottom_center);
        q1i0Var.setColorFilter(this.itemView.getContext().getColor(R.color.vk_white), PorterDuff.Mode.MULTIPLY);
        q1i0Var.j = false;
        textView.setBackground(q1i0Var);
        findViewById.setOnClickListener(this);
        vkMiniInfoCell.setOnClickListener(this);
    }

    @Override // xsna.rp6
    public final void R6(tlt tltVar) {
        tlt tltVar2 = tltVar;
        boolean z = tltVar2.l;
        String str = tltVar2.n;
        boolean z2 = tltVar2.m;
        StaticMapView staticMapView = this.F;
        staticMapView.setMyLocationEnabled(z2);
        double d = tltVar2.h;
        double d2 = tltVar2.i;
        staticMapView.e(d, d2);
        boolean z3 = tltVar2.k;
        VkMiniInfoCell vkMiniInfoCell = this.H;
        bwt0.p0(vkMiniInfoCell, z3);
        String str2 = tltVar2.j;
        if (str2 != null && str2.length() != 0) {
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, str2), false, false, false, false, null, 62));
            vkMiniInfoCell.setIcon(new VkMiniInfoCell.d(new gko(R.drawable.vk_icon_place_outline_20), null, 6));
            vkMiniInfoCell.setMode(VkMiniInfoCell.Mode.BaseAccent);
        }
        TextView textView = this.G;
        if (str != null && str.length() != 0 && z) {
            textView.setText(str);
            bwt0.p0(textView, true);
            staticMapView.c();
        } else {
            bwt0.p0(textView, false);
            if (z) {
                staticMapView.b(d, d2);
            } else {
                staticMapView.c();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tlt tltVar;
        if (bwt0.b()) {
            if ((epx.f(view, this.E) || epx.f(view, this.H)) && (tltVar = (tlt) this.C) != null) {
                double d = tltVar.h;
                double d2 = tltVar.i;
                try {
                    this.itemView.getContext().startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("geo:" + d + ',' + d2 + "?z=18&q=" + d + ',' + d2)));
                } catch (Throwable unused) {
                    Activity h = e3m.h(this.itemView.getContext());
                    if (h == null) {
                        return;
                    }
                    tn00.a(h);
                }
            }
        }
    }
}
