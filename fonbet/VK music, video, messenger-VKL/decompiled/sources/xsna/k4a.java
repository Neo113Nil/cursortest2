package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vkontakte.android.R;

/* compiled from: CatalogDialogs.kt */
/* loaded from: classes16.dex */
public final class k4a extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        CatalogFilterData catalogFilterData = (CatalogFilterData) obj;
        ((TextView) hkpVar.f(R.id.action_text)).setText(catalogFilterData.c);
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        int a = i4a.a(catalogFilterData.d);
        Drawable a2 = a != 0 ? dhr0.t.a(a) : null;
        imageView.setImageDrawable(a2);
        imageView.setVisibility(a2 == null ? 8 : 0);
        bwt0.p0(hkpVar.f(R.id.action_check_icon), catalogFilterData.e);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_icon);
        ImageView imageView = (ImageView) findViewById;
        imageView.setColorFilter(dhr0.t.c(R.attr.vk_legacy_accent));
        imageView.setVisibility(0);
        hkpVar.d(findViewById);
        View findViewById2 = view.findViewById(R.id.action_check_icon);
        ImageView imageView2 = (ImageView) findViewById2;
        imageView2.setVisibility(0);
        imageView2.setImageResource(R.drawable.ic_check_fill_accent_24);
        hkpVar.d(findViewById2);
        return hkpVar;
    }
}
