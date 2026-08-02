package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: DraftBottomSheet.kt */
/* loaded from: classes16.dex */
public final class bdo extends s770 {
    public final /* synthetic */ Context c;

    public bdo(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        e520 e520Var = (e520) obj;
        ((TextView) hkpVar.f(R.id.action_text)).setText(e520Var.a(this.c));
        ((ImageView) hkpVar.f(R.id.action_icon)).setImageResource(e520Var.b);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        View findViewById = view.findViewById(R.id.action_icon);
        ImageView imageView = (ImageView) findViewById;
        int i = dhr0.C().c;
        dhr0.a.getClass();
        if (i == dhr0.u().c) {
            imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_icon_primary));
        } else {
            imageView.setColorFilter(dhr0.t.c(R.attr.vk_ui_background_tertiary));
        }
        imageView.setVisibility(0);
        hkpVar.d(findViewById);
        return hkpVar;
    }
}
