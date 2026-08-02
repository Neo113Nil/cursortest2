package defpackage;

import com.yandex.go.trusted_contacts.ui.BaseTrustedContactsModalView;

/* loaded from: classes14.dex */
public final class hh11 implements sy60 {
    public final /* synthetic */ BaseTrustedContactsModalView a;
    public final /* synthetic */ ih11 b;

    public hh11(BaseTrustedContactsModalView baseTrustedContactsModalView, ih11 ih11Var) {
        this.a = baseTrustedContactsModalView;
        this.b = ih11Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        BaseTrustedContactsModalView baseTrustedContactsModalView = this.a;
        if (baseTrustedContactsModalView != null) {
            BaseTrustedContactsModalView.animateShowLeftToRight$default(baseTrustedContactsModalView, null, null, 3, null);
        }
    }
}
