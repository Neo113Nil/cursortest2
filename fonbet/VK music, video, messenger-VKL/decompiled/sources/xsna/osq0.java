package xsna;

import android.app.Dialog;
import android.util.Size;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.vk.profile.user.impl.ui.ModalUserProfileFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import xsna.atq0;
import xsna.ikv0;

/* compiled from: UserProfileModalNotifier.kt */
/* loaded from: classes5.dex */
public final class osq0 extends btq0 {
    public final ModalUserProfileFragment e;

    public osq0(ModalUserProfileFragment modalUserProfileFragment, o0r0 o0r0Var, m230 m230Var) {
        super(o0r0Var, m230Var);
        this.e = modalUserProfileFragment;
    }

    public static void c(atq0 atq0Var, osq0 osq0Var, FragmentActivity fragmentActivity) {
        Window window;
        if (!(atq0Var instanceof atq0.d)) {
            super.a(fragmentActivity, atq0Var);
            return;
        }
        atq0.d dVar = (atq0.d) atq0Var;
        Dialog dialog = osq0Var.e.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(fragmentActivity);
        Integer num = dVar.d;
        if (num != null) {
            aVar.t = new ikv0.c.C3058c(num.intValue(), Integer.valueOf(dVar.e), (Size) null, 12);
        }
        String str = dVar.b;
        if (str != null) {
            aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        }
        Integer num2 = dVar.a;
        if (num2 != null) {
            aVar.u = new ikv0.d(fragmentActivity.getString(num2.intValue()), (String) null, (ikv0.d.a) null, 6);
        }
        tlo0 tlo0Var = dVar.c;
        if (tlo0Var != null) {
            CharSequence a = tlo0Var.a(fragmentActivity);
            aVar.u = new ikv0.d(a != null ? a.toString() : null, (String) null, (ikv0.d.a) null, 6);
        }
        Integer num3 = dVar.f;
        izs<ikv0, s3q0> izsVar = dVar.g;
        if (num3 != null && izsVar != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, fragmentActivity.getString(num3.intValue()), izsVar);
        }
        osq0Var.d = new WeakReference<>(aVar.p(window));
    }

    @Override // xsna.btq0
    public final void a(FragmentActivity fragmentActivity, atq0 atq0Var) {
        this.c.post(new ls80(atq0Var, this, fragmentActivity, 1));
    }
}
