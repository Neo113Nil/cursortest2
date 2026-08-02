package xsna;

import android.os.Bundle;
import android.view.View;

/* compiled from: VkChangeEmailFragment.kt */
/* loaded from: classes6.dex */
public final class cju0 extends com.vk.superapp.browser.ui.a {
    public final bpn0 S = new bpn0(new tfu0(this, 2));

    @Override // com.vk.superapp.browser.ui.a
    public final r6y Dn() {
        return new i7y(yn(), new xka0(this, 28));
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r3y.a("user_info_changed", new lyl0(this, 18));
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        r3y.c("user_info_changed");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        a aVar = (a) this.S.getValue();
        if (z) {
            aVar.getClass();
        } else {
            aVar.f(aVar.a.getView());
        }
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((a) this.S.getValue()).b();
    }

    @Override // com.vk.superapp.browser.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((a) this.S.getValue()).c(view, false);
        mhy.d(view);
    }

    /* compiled from: VkChangeEmailFragment.kt */
    public static final class a extends ecu0 {
        @Override // xsna.ecu0
        public final void g(boolean z) {
            super.g(z);
            gfx0 gfx0Var = e370.b;
            if (gfx0Var == null) {
                gfx0Var = null;
            }
            gfx0Var.getClass();
            d(!dhr0.M());
        }

        @Override // xsna.ecu0
        public final void e(boolean z) {
        }
    }
}
