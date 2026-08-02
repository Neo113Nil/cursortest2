package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vkontakte.android.R;
import xsna.eeu0;

/* compiled from: SmsCheckAccessBottomSheetFragment.kt */
/* loaded from: classes15.dex */
public final class k6k0 extends com.vk.auth.verification.base.a<m6k0> implements l6k0 {
    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(requireContext());
    }

    @Override // xsna.l6k0
    public final void Of(String str) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        yex yexVar = new yex(this, 1);
        eeu0.a aVar = new eeu0.a(mo2getContext);
        aVar.B(R.string.vk_auth_error);
        aVar.a.f = str;
        aVar.setPositiveButton(R.string.vk_ok, new o1c());
        aVar.i = yexVar;
        aVar.m();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.vk_auth_check_bottom_sheet_fragment, viewGroup, false);
    }

    @Override // xsna.l6k0
    public final void onSuccess() {
        b(true);
    }

    @Override // com.vk.auth.verification.base.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ((ImageView) view.findViewById(R.id.check_password_navigation_icon)).setOnClickListener(new sa6(this, 11));
        super.onViewCreated(view, bundle);
    }

    @Override // com.vk.auth.verification.base.a
    public final void tn() {
        Object obj = this.p;
        if (obj == null) {
            obj = null;
        }
        ((m6k0) obj).y0(this);
    }

    @Override // com.vk.auth.verification.base.a
    public final o6k0 un(Bundle bundle) {
        CodeState codeState = this.k;
        CheckPresenterInfo checkPresenterInfo = this.j;
        if (checkPresenterInfo == null) {
            checkPresenterInfo = null;
        }
        return new o6k0(codeState, bundle, checkPresenterInfo, this.m, this.n);
    }
}
