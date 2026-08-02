package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ClipDraftBottomSheet.kt */
/* loaded from: classes2.dex */
public final class krc extends s770 {
    public final /* synthetic */ Context c;

    public krc(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        e520 e520Var = (e520) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        textView.setText(e520Var.a(this.c));
        int i2 = e520Var.h;
        if (i2 != 0) {
            textView.setTextColor(dhr0.t.c(i2));
        }
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        imageView.setImageResource(e520Var.b);
        int i3 = e520Var.g;
        if (i3 != 0) {
            imageView.setColorFilter(dhr0.t.c(i3));
        }
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
