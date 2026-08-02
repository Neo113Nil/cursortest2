package xsna;

import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.vnj;

/* compiled from: SimpleBinder.kt */
/* loaded from: classes17.dex */
public class jpj0<Item extends vnj> extends s770 {
    @Override // xsna.s770
    public hkp p(View view) {
        hkp hkpVar = new hkp(7);
        hkpVar.d((TextView) view.findViewById(R.id.action_text));
        return hkpVar;
    }

    @Override // xsna.s770
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m(hkp hkpVar, Item item, int i) {
        ((TextView) hkpVar.f(R.id.action_text)).setText(item.a());
    }
}
