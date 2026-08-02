package xsna;

import android.text.Editable;
import xsna.dzb;

/* compiled from: ChatTitleAndAvatarDelegate.kt */
/* loaded from: classes2.dex */
public final class czb extends rno0 {
    public final /* synthetic */ dzb.a b;

    public czb(dzb.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        dzb.a aVar = this.b;
        ucp ucpVar = aVar.l;
        Float valueOf = Float.valueOf(aVar.o.getTextSize());
        ucpVar.getClass();
        ucp.j(editable, valueOf);
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        dzb.a aVar = this.b;
        if (aVar.q) {
            aVar.m.g(drm0.p0(charSequence.toString()).toString());
        }
    }
}
