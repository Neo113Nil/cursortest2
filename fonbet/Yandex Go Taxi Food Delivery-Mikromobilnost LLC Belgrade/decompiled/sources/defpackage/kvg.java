package defpackage;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.yandex.plus.pay.ui.core.debug.internal.DebugMenuDialogFragment;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class kvg implements ra50 {
    public final DialogFragment a;
    public final int b;
    public final FragmentManager c;
    public final ArrayList d = new ArrayList();

    public kvg(DebugMenuDialogFragment debugMenuDialogFragment, int i, FragmentManager fragmentManager) {
        this.a = debugMenuDialogFragment;
        this.b = i;
        this.c = fragmentManager;
    }

    @Override // defpackage.ra50
    public final void a(alc[] alcVarArr) {
        FragmentManager fragmentManager = this.c;
        fragmentManager.C();
        ArrayList arrayList = this.d;
        arrayList.clear();
        int K = fragmentManager.K();
        for (int i = 0; i < K; i++) {
            String str = ((a) fragmentManager.J(i)).i;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        for (alc alcVar : alcVarArr) {
            if (alcVar instanceof y0j0) {
                tis0 tis0Var = ((y0j0) alcVar).a;
                if (arrayList.isEmpty()) {
                    b(tis0Var, false);
                } else {
                    fragmentManager.V();
                    arrayList.remove(scc.f(arrayList));
                    b(tis0Var, true);
                }
            } else {
                boolean z = alcVar instanceof ff4;
                DialogFragment dialogFragment = this.a;
                if (z) {
                    dialogFragment.dismiss();
                } else if (alcVar instanceof zd4) {
                    if (arrayList.isEmpty()) {
                        dialogFragment.dismiss();
                    } else {
                        fragmentManager.V();
                        arrayList.remove(scc.f(arrayList));
                    }
                }
            }
        }
    }

    public final void b(tis0 tis0Var, boolean z) {
        FragmentManager fragmentManager = this.c;
        Fragment fragment = (Fragment) ((a9f) tis0Var.w).l(fragmentManager.M());
        String str = (String) tis0Var.c;
        a aVar = new a(fragmentManager);
        aVar.p = true;
        aVar.i(lmg0.pay_sdk_slide_in_top, lmg0.pay_sdk_slide_out_top, 0, 0);
        boolean z2 = tis0Var.b;
        int i = this.b;
        if (z2) {
            aVar.h(i, fragment, str);
        } else {
            aVar.f(i, fragment, str, 1);
        }
        if (z) {
            aVar.c(str);
            this.d.add(str);
        }
        aVar.d();
    }
}
