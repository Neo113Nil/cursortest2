package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: SubscribeControllerNoViews.kt */
/* loaded from: classes17.dex */
public final class svm0 extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        textView.setText((String) obj);
        textView.setTextColor(dhr0.t.c(R.attr.vk_ui_background_negative));
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        return hkpVar;
    }
}
