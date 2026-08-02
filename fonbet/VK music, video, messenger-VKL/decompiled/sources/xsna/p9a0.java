package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: PhotoGalleryViewer.kt */
/* loaded from: classes4.dex */
public final class p9a0 extends s770 {
    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        ((TextView) hkpVar.f(R.id.lg_spinner_item)).setText(((wc1) obj).a);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d(view);
        return hkpVar;
    }
}
