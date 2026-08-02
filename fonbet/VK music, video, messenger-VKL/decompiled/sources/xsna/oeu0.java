package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;

/* compiled from: VkBaseModalBottomSheet.kt */
/* loaded from: classes6.dex */
public abstract class oeu0 extends com.google.android.material.bottomsheet.c {
    public final zr7 A = new zr7(this, 1);
    public final LinkedHashSet B = new LinkedHashSet();
    public BottomSheetBehavior.d y;
    public Context z;

    public oeu0() {
        setRetainInstance(true);
    }

    public Context Fn(Context context) {
        return hnj.a(context);
    }

    public abstract int Gn();

    public boolean Hn() {
        return false;
    }

    public float In() {
        return 1.0f;
    }

    public final void Kn(View view, float f) {
        if (view instanceof TextView) {
            LinkedHashSet linkedHashSet = this.B;
            if (!linkedHashSet.contains(view)) {
                TextView textView = (TextView) view;
                textView.setTextSize((textView.getTextSize() * f) / textView.getResources().getDisplayMetrics().density);
                linkedHashSet.add(view);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Kn(viewGroup.getChildAt(i), f);
            }
        }
    }

    public final void Ln(final View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        ((ViewGroup.MarginLayoutParams) fVar).height = -2;
        if (iah0.q() && Hn()) {
            ((ViewGroup.MarginLayoutParams) fVar).width = (int) (viewGroup.getWidth() * 0.6d);
            final float In = In();
            view.post(new Runnable() { // from class: xsna.meu0
                @Override // java.lang.Runnable
                public final void run() {
                    oeu0.this.Kn(view, In);
                }
            });
        } else {
            ((ViewGroup.MarginLayoutParams) fVar).width = Math.min(viewGroup.getWidth(), iah0.a(480));
        }
        fVar.c = 8388611;
        view.setTranslationX((viewGroup.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).width) / 2.0f);
        view.setLayoutParams(fVar);
    }

    @Override // androidx.fragment.app.d
    public final void Td(FragmentManager fragmentManager, String str) {
        super.Td(fragmentManager, str);
        TypedValue typedValue = krv0.a;
        krv0.a(this.A);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public Context mo2getContext() {
        return this.z;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.z = Fn(context);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        View findViewById;
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.s;
        com.google.android.material.bottomsheet.b bVar = dialog instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialog : null;
        if (bVar == null || (findViewById = bVar.findViewById(R.id.design_bottom_sheet)) == null) {
            return;
        }
        findViewById.getParent().requestLayout();
        findViewById.postDelayed(new aw5(4, this, findViewById), 100L);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = this.s;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
        return layoutInflater.inflate(Gn(), viewGroup, false);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.z = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        View findViewById = ((com.google.android.material.bottomsheet.b) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (findViewById == null) {
            return;
        }
        BottomSheetBehavior L = BottomSheetBehavior.L(findViewById);
        BottomSheetBehavior.d dVar = this.y;
        if (dVar != null) {
            L.Q(dVar);
        }
        this.y = null;
        TypedValue typedValue = krv0.a;
        krv0.k(this.A);
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        boolean z = n8g.f(window.getNavigationBarColor()) >= 0.5d;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.bottomsheet.c, xsna.c33, androidx.fragment.app.d
    public Dialog yn(Bundle bundle) {
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        Dialog yn = super.yn(bundle);
        final BottomSheetBehavior.d dVar = this.y;
        if (dVar == null) {
            dVar = new neu0(this, (com.google.android.material.bottomsheet.b) yn);
        }
        this.y = dVar;
        yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.leu0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View findViewById = ((com.google.android.material.bottomsheet.b) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (findViewById == null) {
                    return;
                }
                BottomSheetBehavior L = BottomSheetBehavior.L(findViewById);
                L.D(BottomSheetBehavior.d.this);
                oeu0 oeu0Var = this;
                oeu0Var.getClass();
                L.X(3);
                oeu0Var.Ln(findViewById);
            }
        });
        return yn;
    }

    public void Jn() {
    }
}
