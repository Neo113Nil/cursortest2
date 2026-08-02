package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.bi10;
import xsna.xg10;

/* compiled from: OpenMaskCatalogHolder.kt */
/* loaded from: classes3.dex */
public final class lr80 extends vmg0<bi10.e> {
    public final View q;

    public lr80(ViewGroup viewGroup, xg10.a aVar, zzz zzzVar) {
        super(tf3.b(viewGroup, R.layout.layout_open_mask_catalog, viewGroup, false), zzzVar);
        View findViewById = this.itemView.findViewById(R.id.view_background);
        this.q = findViewById;
        findViewById.setContentDescription(g6(R.string.mask_view_holder_content_description_open_mask_catalog));
        jjc.g(findViewById, new el0(aVar, 1));
    }
}
