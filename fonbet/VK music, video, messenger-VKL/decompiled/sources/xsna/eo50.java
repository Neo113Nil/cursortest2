package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Trace;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.Map;
import xsna.arf0;
import xsna.iv20;

/* compiled from: MvkAuthPresenter.kt */
/* loaded from: classes15.dex */
public final class eo50<V extends arf0> extends wv20<V> {
    public final do50 h;

    public eo50(Context context, do50 do50Var) {
        super(context, do50Var);
        this.h = do50Var;
    }

    @Override // xsna.wv20, xsna.hv20
    public final void M2(ModalAuthInfo modalAuthInfo) {
        super.M2(modalAuthInfo);
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        iv20.b bVar2 = this.d;
        String str = (bVar2 != null ? bVar2 : null).f;
        if (bVar2 == null) {
            bVar2 = null;
        }
        Integer num = bVar2.i;
        this.e.getClass();
        boolean a = coe0.a();
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.AUTH_CODE_ID, str));
        arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.APP_ID, String.valueOf(num)));
        if (a) {
            arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.AVAILABLE_MULTIACC_SELECTOR, ""));
        }
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.ENTRY_ASK_CONFIRM, arrayList, null, null, 28);
    }

    @Override // xsna.wv20
    public final void c() {
        bpn0 bpn0Var = tk8.a;
        iv20.b bVar = this.d;
        if (bVar == null) {
            bVar = null;
        }
        String str = (String) ((Map) tk8.a.getValue()).get(bVar.h);
        do50 do50Var = this.h;
        if (str != null && str.length() != 0) {
            com.vk.toggle.b bVar2 = com.vk.toggle.b.A;
            bVar2.getClass();
            boolean e = ndp0.e();
            if (e) {
                Trace.beginSection(ndp0.f("ToggleManager.isFeatureEnabled sak_browser_redirect_mvk_auth"));
            }
            try {
                b.d j = bVar2.j("sak_browser_redirect_mvk_auth", false);
                if (j != null ? j.a : false) {
                    try {
                        do50Var.requireContext().startActivity(do50Var.requireContext().getPackageManager().getLaunchIntentForPackage(str));
                        return;
                    } catch (Exception unused) {
                        do50Var.jo();
                        return;
                    } finally {
                        do50Var.G8();
                    }
                }
            } finally {
                if (e) {
                    Trace.endSection();
                }
            }
        }
        Dialog dialog = do50Var.s;
        if (dialog != null) {
            dialog.hide();
        }
        do50Var.jo();
    }
}
