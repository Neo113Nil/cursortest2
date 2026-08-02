package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: ClipsDownloadLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class prd extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        TextView textView = (TextView) hkpVar.f(R.id.action_text);
        textView.setText(((e520) obj).a(textView.getContext()));
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.action_text));
        return hkpVar;
    }
}
