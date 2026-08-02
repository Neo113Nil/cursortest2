package xsna;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.vkontakte.android.R;

/* compiled from: VkUiBrowserBottomFragment.kt */
/* loaded from: classes6.dex */
public class evv0 extends com.vk.superapp.ui.b {
    public gf3 y;
    public final bpn0 z = new bpn0(new mlf0(this, 26));
    public final io.reactivex.rxjava3.disposables.b A = new io.reactivex.rxjava3.disposables.b();

    @Override // com.vk.superapp.ui.b
    public final Fragment Fn() {
        return (Fragment) this.z.getValue();
    }

    @Override // com.vk.superapp.ui.b, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bn(0, R.style.VkBottomSheetWebAppTheme);
    }

    @Override // com.vk.superapp.ui.b, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        io.reactivex.rxjava3.subjects.f<exv0> fVar = fxv0.a.a;
        awi0 awi0Var = new awi0(new ha40(29), 11);
        fVar.getClass();
        this.A.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, awi0Var).subscribe(new uk40(new u5p0(this, 13), 27)));
        return onCreateView;
    }

    @Override // com.vk.superapp.ui.b, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.A.e();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        gf3 gf3Var = this.y;
        if (gf3Var != null) {
            gf3Var.onDismiss(zn());
        }
    }
}
