package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.h30;

/* compiled from: ActionLinksSnippetPresenter.kt */
/* loaded from: classes3.dex */
public final class i30 extends s770 {
    public final /* synthetic */ Context c;

    public i30(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        h30.a aVar = (h30.a) obj;
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        textView.setText(aVar.i());
        textView.setTextColor(dhr0.Y(aVar.j() ? R.attr.vk_ui_text_negative : R.attr.vk_ui_text_primary, this.c));
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        return hkpVar;
    }
}
