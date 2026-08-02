package xsna;

import android.text.Editable;
import xsna.kcb;

/* compiled from: ChannelSettingsDelegate.kt */
/* loaded from: classes2.dex */
public final class icb extends rno0 {
    public final /* synthetic */ kcb.a b;

    public icb(kcb.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        kcb.a aVar = this.b;
        ucp ucpVar = aVar.l;
        Float valueOf = Float.valueOf(aVar.o.getTextSize());
        ucpVar.getClass();
        ucp.j(editable, valueOf);
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        kcb.a aVar = this.b;
        if (aVar.s) {
            String obj = drm0.p0(charSequence.toString()).toString();
            kcb.a.InterfaceC3174a interfaceC3174a = aVar.m;
            if (interfaceC3174a != null) {
                interfaceC3174a.g(obj);
            }
        }
    }
}
