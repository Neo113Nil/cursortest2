package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.dat0;

/* compiled from: VideoQualityBottomSheet.kt */
/* loaded from: classes2.dex */
public final class eat0 extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        dat0.a aVar = (dat0.a) obj;
        ((TextView) hkpVar.f(R.id.action_text)).setText(aVar.a);
        ((ImageView) hkpVar.f(R.id.action_check_icon)).setVisibility(aVar.b ? 0 : 8);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_check_icon);
        ImageView imageView = (ImageView) findViewById;
        imageView.setImageResource(R.drawable.vk_icon_check_circle_on_24);
        imageView.setColorFilter(dhr0.Y(R.attr.vk_ui_icon_accent, view.getContext()));
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
