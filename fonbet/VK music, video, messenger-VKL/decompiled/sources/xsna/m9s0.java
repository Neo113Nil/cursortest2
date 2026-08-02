package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.l9s0;

/* compiled from: VideoCatalogNewContentBottomSheet.kt */
/* loaded from: classes16.dex */
public final class m9s0 extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        l9s0.b bVar = (l9s0.b) obj;
        ((TextView) hkpVar.f(R.id.action_text)).setText(bVar.j());
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        imageView.setImageResource(bVar.i());
        imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_action_sheet_text));
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_icon);
        ((ImageView) findViewById).setVisibility(0);
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
