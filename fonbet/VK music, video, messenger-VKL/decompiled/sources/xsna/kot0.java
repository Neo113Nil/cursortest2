package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.mot0;

/* compiled from: VideoUploadNavigator.kt */
/* loaded from: classes3.dex */
public final class kot0 extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        mot0.b bVar = (mot0.b) obj;
        TextView textView = (TextView) hkpVar.f(R.id.title);
        his0.w(textView, bVar.h(), R.attr.vk_ui_action_sheet_text);
        textView.setText(bVar.j());
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.title));
        return hkpVar;
    }
}
