package xsna;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.dto.common.Peer;
import xsna.qbk;

/* compiled from: TranslateFeatureImpl.kt */
/* loaded from: classes6.dex */
public final class rnp0 implements pnp0 {
    public static void c(Context context, FragmentManager fragmentManager, Fragment fragment, llp llpVar) {
        vyt0 vyt0Var = new vyt0(fragment.getViewModelStore(), new qyt0(cop0.class, new hj3(context, llpVar, fragmentManager, 7)), qbk.a.b);
        rfc a = fpf0.a(cop0.class);
        String h = a.h();
        if (h == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a);
    }

    @Override // xsna.pnp0
    public final void a(a1w a1wVar, FragmentManager fragmentManager) {
        Fragment H = fragmentManager.H("MessageTranslateBottomSheetFragment");
        if (!(H instanceof pb20)) {
            H = null;
        }
        pb20 pb20Var = (pb20) H;
        if (pb20Var != null && pb20Var.f1 == null) {
            fragmentManager.c0(new qnp0(this, a1wVar, fragmentManager), false);
        }
    }

    @Override // xsna.pnp0
    public final void b(a1w a1wVar, Peer peer, int i, String str, FragmentManager fragmentManager, Context context) {
        Fragment H = fragmentManager.H("MessageTranslateBottomSheetFragment");
        if (!(H instanceof pb20)) {
            H = null;
        }
        if (((pb20) H) != null) {
            return;
        }
        pb20.k1.getClass();
        pb20 pb20Var = new pb20();
        Bundle bundle = new Bundle();
        bundle.putParcelable("vk.message.translate.screen.peer.key", peer);
        bundle.putInt("vk.message.translate.cnv.msg.id", i);
        bundle.putString("vk.message.translate.text", str);
        pb20Var.setArguments(bundle);
        pb20Var.Td(fragmentManager, "MessageTranslateBottomSheetFragment");
        c(context, fragmentManager, pb20Var, a1wVar);
    }
}
