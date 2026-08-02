package xsna;

import android.view.View;
import android.widget.CheckBox;
import com.vkontakte.android.R;

/* compiled from: ScopeBinder.kt */
/* loaded from: classes6.dex */
public final class w9h0 extends s770 {
    @Override // xsna.s770
    public final /* bridge */ /* synthetic */ void m(hkp hkpVar, Object obj, int i) {
    }

    @Override // xsna.s770
    public final void o(hkp hkpVar, Object obj, boolean z) {
        CheckBox checkBox = (CheckBox) hkpVar.f(R.id.scope);
        checkBox.setText(brm0.o(((bah0) obj).b));
        checkBox.setChecked(z);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view);
        return hkpVar;
    }
}
