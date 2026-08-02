package xsna;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.geo.GeoPlace;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vkontakte.android.R;
import xsna.a3p0;
import xsna.ngv0;
import xsna.pjd;
import xsna.tlo0;

/* compiled from: ClipsGeoPlaceToolbar.kt */
/* loaded from: classes17.dex */
public final class w9e extends pjd {
    public boolean t;

    @Override // xsna.pjd, xsna.d3p0
    public final void b(a3p0 a3p0Var) {
        if (a3p0Var instanceof a3p0.a) {
            ClipGridParams.Data data = ((a3p0.a) a3p0Var).a;
            if (data instanceof ClipGridParams.Data.GeoPlace) {
                this.d.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.clips_grid_place_title), null, null, null, null, 30), null, null, com.vk.core.compose.component.semantics.b.a(null, new v7(14), 3), 6));
                GeoPlace geoPlace = ((ClipGridParams.Data.GeoPlace) data).b;
                tlo0.h hVar = new tlo0.h(geoPlace.i);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                this.r.setMiddle(new pgv0(new vgv0(hVar, (ngv0.a) null, (ngv0) null, 2, 6), geoPlace.k.length() > 0 ? new ugv0(new tlo0.h(geoPlace.k), (ngv0.a) null, (ngv0.a) null, 0, (fy0) null, 46) : null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
                n(new pjd.a(R.drawable.vk_icon_place_outline_32, null));
                o(data);
                super.b(a3p0Var);
            }
        }
    }

    @Override // xsna.sjd
    public final boolean j() {
        return this.t;
    }
}
