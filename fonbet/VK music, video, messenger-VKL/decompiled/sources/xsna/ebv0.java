package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.superapp.vkpay.checkout.api.dto.model.VkTransactionInfo;
import com.vk.superapp.vkpay.checkout.config.VkPayCheckoutConfig;
import com.vk.utils.vectordrawable.EnhancedVectorDrawable;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bbv0;

/* compiled from: VkPayCheckoutBottomSheet.kt */
/* loaded from: classes6.dex */
public final class ebv0 extends oeu0 {
    public final int C = R.layout.vk_pay_checkout_bottom_sheet;
    public BottomSheetBehavior.d D;
    public View E;
    public View F;
    public juw0 G;
    public zo80 H;
    public Context I;
    public VkPayCheckoutConfig J;
    public VkTransactionInfo K;

    /* compiled from: VkPayCheckoutBottomSheet.kt */
    public static final class a extends com.google.android.material.bottomsheet.b {
        public b t;

        @Override // xsna.y8i, android.app.Dialog
        public final void onBackPressed() {
            b bVar = this.t;
            if (bVar != null) {
                bVar.invoke();
            }
        }
    }

    /* compiled from: VkPayCheckoutBottomSheet.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            Object obj = (Fragment) j5g.b0(0, ((ebv0) this.receiver).getChildFragmentManager().c.f());
            if (obj == null) {
                bbv0.g.getClass();
                bbv0 bbv0Var = bbv0.h;
                if (bbv0Var != null) {
                    try {
                        ebv0 ebv0Var = bbv0Var.c.get();
                        if (ebv0Var != null) {
                            ebv0Var.tn();
                        }
                    } catch (Exception unused) {
                    }
                }
                bbv0.h = null;
                obj = s3q0.a;
            }
            if (obj instanceof iv5 ? ((iv5) obj).a0() : true) {
                bbv0.g.getClass();
                bbv0.a.f().d.i();
            }
            return s3q0.a;
        }
    }

    @Override // xsna.oeu0
    public final int Gn() {
        return this.C;
    }

    public final void Mn() {
        bbv0.g.getClass();
        bbv0.a.f().d.l();
        dismiss();
        zo80 zo80Var = this.H;
        if (zo80Var != null) {
            zo80Var.invoke();
        }
    }

    @Override // xsna.oeu0, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return this.I;
    }

    @Override // xsna.oeu0, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.I = hnj.a(context);
        Bundle arguments = getArguments();
        this.J = arguments != null ? (VkPayCheckoutConfig) arguments.getParcelable("key_config") : null;
        Bundle arguments2 = getArguments();
        this.K = arguments2 != null ? (VkTransactionInfo) arguments2.getParcelable("key_transaction_info") : null;
        bbv0.g.getClass();
        if (bbv0.h != null) {
            return;
        }
        VkTransactionInfo vkTransactionInfo = this.K;
        VkPayCheckoutConfig vkPayCheckoutConfig = this.J;
        shn0 shn0Var = new shn0(new uen0(String.valueOf(vkPayCheckoutConfig.c.getUserId().b), vkPayCheckoutConfig.f, vkTransactionInfo.c));
        gbv0 gbv0Var = new gbv0(new WeakReference(this));
        bbv0.h = new bbv0(vkTransactionInfo, vkPayCheckoutConfig, new WeakReference(this), gbv0Var, shn0Var);
        if (bbv0.a.b()) {
            if (vkPayCheckoutConfig.l) {
                bbv0.a.h(gbv0Var, this, shn0Var, null);
            } else {
                this.G = new juw0(1, shn0Var, new qjo0(gbv0Var, 13));
            }
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Mn();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.D = null;
        this.G = null;
        this.E = null;
        this.I = null;
        this.J = null;
        this.K = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        juw0 juw0Var;
        super.onViewCreated(view, bundle);
        this.F = view.findViewById(R.id.vk_pay_checkout_logo);
        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(requireContext(), R.drawable.vk_pay_checkout_ic_vkpay_logo);
        int f = e3m.f(R.attr.vk_legacy_text_primary, requireContext());
        com.vk.utils.vectordrawable.a.b(enhancedVectorDrawable, "vk_pay_logo_vk", e3m.f(R.attr.vk_legacy_button_primary_background, requireContext()));
        com.vk.utils.vectordrawable.a.b(enhancedVectorDrawable, "vk_pay_logo_letter_p", f);
        com.vk.utils.vectordrawable.a.b(enhancedVectorDrawable, "vk_pay_logo_letter_a", f);
        com.vk.utils.vectordrawable.a.b(enhancedVectorDrawable, "vk_pay_logo_letter_y", f);
        ((ImageView) this.F).setImageDrawable(enhancedVectorDrawable);
        this.E = view.findViewById(R.id.toolbar);
        view.findViewById(R.id.checkout_navigation_icon).setOnClickListener(new c98(this, 17));
        if (bundle != null || (juw0Var = this.G) == null) {
            return;
        }
        juw0Var.invoke();
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkPayCheckoutBottomSheetTheme;
    }

    @Override // xsna.oeu0, com.google.android.material.bottomsheet.c, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        a aVar = new a(requireContext(), R.style.VkPayCheckoutBottomSheetTheme);
        Window window = aVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(19);
        }
        final BottomSheetBehavior.d dVar = this.D;
        if (dVar == null) {
            dVar = new fbv0(new WeakReference(aVar), this);
        }
        this.D = dVar;
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.dbv0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View findViewById = ((com.google.android.material.bottomsheet.b) dialogInterface).findViewById(R$id.design_bottom_sheet);
                if (findViewById == null) {
                    return;
                }
                BottomSheetBehavior L = BottomSheetBehavior.L(findViewById);
                L.D(BottomSheetBehavior.d.this);
                this.getClass();
                L.X(3);
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) findViewById.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) fVar).height = -2;
                ((ViewGroup.MarginLayoutParams) fVar).width = Math.min(findViewById.getWidth(), iah0.a(480));
                fVar.c = 8388611;
                findViewById.setTranslationX((((ViewGroup) findViewById.getParent()).getWidth() - ((ViewGroup.MarginLayoutParams) fVar).width) / 2.0f);
                findViewById.setLayoutParams(fVar);
            }
        });
        aVar.t = new b(0, this, ebv0.class, "handleOnBackPressed", "handleOnBackPressed()V", 0);
        aVar.setOnShowListener(new k4p0(this, 1));
        return aVar;
    }

    /* compiled from: VkPayCheckoutBottomSheet.kt */
    public static final class c extends BottomSheetBehavior.d {
        public c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void c(int i, View view) {
            zo80 zo80Var;
            if (i != 5 || (zo80Var = ebv0.this.H) == null) {
                return;
            }
            zo80Var.invoke();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(View view, float f) {
        }
    }
}
