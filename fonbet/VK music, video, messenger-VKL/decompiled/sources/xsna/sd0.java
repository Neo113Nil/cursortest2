package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.rd0;

/* compiled from: AdChoicesBottomSheet.kt */
/* loaded from: classes14.dex */
public final class sd0 extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        ((TextView) hkpVar.f(R.id.ad_choice_view)).setText(((rd0.a) obj).a.b);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view.findViewById(R.id.ad_choice_view));
        return hkpVar;
    }
}
