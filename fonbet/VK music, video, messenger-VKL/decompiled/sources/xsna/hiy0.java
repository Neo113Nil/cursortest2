package xsna;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import com.vkontakte.android.R;
import xsna.j9y0;
import xsna.p9y0;

/* compiled from: VKCaptchaNoInternetFragment.kt */
/* loaded from: classes2.dex */
public final class hiy0 extends DialogFragment {
    public ImageView b;
    public ImageView c;
    public Button d;
    public p9y0 e = p9y0.b.a;

    public final void a() {
        p9y0 p9y0Var = this.e;
        p9y0.a aVar = p9y0.a.a;
        if (epx.f(p9y0Var, aVar)) {
            return;
        }
        if (!epx.f(p9y0Var, p9y0.c.a)) {
            b();
            var0 var0Var = var0.a;
            j9y0.a aVar2 = j9y0.a.a;
            var0Var.getClass();
            var0.a(aVar2);
            return;
        }
        b();
        this.e = aVar;
        var0 var0Var2 = var0.a;
        j9y0.c cVar = j9y0.c.a;
        var0Var2.getClass();
        var0.a(cVar);
    }

    public final void b() {
        if (getActivity() == null || getActivity().isFinishing()) {
            return;
        }
        getActivity().finish();
        if (Build.VERSION.SDK_INT >= 34) {
            getActivity().overrideActivityTransition(1, R.anim.fade_in, R.anim.fade_out);
        } else {
            getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        a();
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        return new bfy0(getActivity());
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        View inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.vk_captcha_no_internet_fragment, (ViewGroup) null) : null;
        this.b = inflate != null ? (ImageView) inflate.findViewById(R.id.vkid_logo) : null;
        this.c = inflate != null ? (ImageView) inflate.findViewById(R.id.antenna) : null;
        this.d = inflate != null ? (Button) inflate.findViewById(R.id.retry_btn) : null;
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.logo_vkid);
        }
        ImageView imageView2 = this.c;
        if (imageView2 != null) {
            imageView2.setImageResource(R.drawable.antenna);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Button button = this.d;
        if (button != null) {
            button.setOnClickListener(new u01(this, 18));
        }
        return inflate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        a();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -2);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setGravity(80);
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        if (fragmentManager != null) {
            try {
                fragmentManager.executePendingTransactions();
            } catch (Exception unused) {
                return;
            }
        }
        if ((fragmentManager != null ? fragmentManager.findFragmentByTag(str) : null) != null) {
            return;
        }
        super.show(fragmentManager, str);
    }
}
