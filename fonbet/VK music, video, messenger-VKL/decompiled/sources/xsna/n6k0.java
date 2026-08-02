package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.eeu0;
import xsna.p4g;
import xsna.q55;

/* compiled from: SmsCheckAccessFragment.kt */
/* loaded from: classes15.dex */
public final class n6k0 extends ta6<m6k0> implements l6k0 {
    public static final /* synthetic */ int S = 0;
    public boolean R;

    @Override // xsna.l6k0
    public final void Of(String str) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        w520 w520Var = new w520(this, 1);
        eeu0.a aVar = new eeu0.a(mo2getContext);
        aVar.B(R.string.vk_auth_error);
        aVar.a.f = str;
        aVar.setPositiveButton(R.string.vk_ok, new o1c());
        aVar.i = w520Var;
        aVar.m();
    }

    @Override // com.vk.auth.verification.base.c
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // xsna.ta6, xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (!this.R) {
            q55 q55Var = q55.a;
            List y0 = j5g.y0(q55.b);
            q55.b bVar = new q55.b(par0.a);
            p4g.a aVar = p4g.a;
            Iterator it = y0.iterator();
            while (it.hasNext()) {
                try {
                    ((s25) it.next()).m();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    bVar.invoke(th);
                }
            }
        }
        super.onDestroyView();
    }

    @Override // xsna.l6k0
    public final void onSuccess() {
        this.R = true;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        CodeState codeState = this.w;
        CheckPresenterInfo checkPresenterInfo = this.v;
        if (checkPresenterInfo == null) {
            checkPresenterInfo = null;
        }
        return new o6k0(codeState, bundle, checkPresenterInfo, null, false);
    }

    @Override // xsna.ta6
    public final void yn() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((m6k0) obj).y0(this);
    }
}
