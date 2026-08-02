package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.vlt0;

/* compiled from: VideoTrafficSavingBottomSheet.kt */
/* loaded from: classes2.dex */
public final class wlt0 extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        vlt0.a aVar = (vlt0.a) obj;
        ((TextView) hkpVar.f(R.id.action_title)).setText(aVar.b);
        ((TextView) hkpVar.f(R.id.action_subtitle)).setText(aVar.c);
        ((ImageView) hkpVar.f(R.id.action_check_icon)).setVisibility(aVar.d ? 0 : 8);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_title));
        hkpVar.d(view.findViewById(R.id.action_subtitle));
        View findViewById = view.findViewById(R.id.action_check_icon);
        ((ImageView) findViewById).setColorFilter(dhr0.Y(R.attr.vk_ui_icon_accent, view.getContext()));
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
