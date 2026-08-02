package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.k2a0;

/* compiled from: PhoneActualizationBottomSheet.kt */
/* loaded from: classes4.dex */
public final class h2a0 extends dw20 {
    public static final /* synthetic */ int j1 = 0;
    public VkButton f1;
    public boolean h1;
    public final io.reactivex.rxjava3.disposables.b g1 = new io.reactivex.rxjava3.disposables.b();
    public final Object i1 = msy.a(LazyThreadSafetyMode.NONE, new t210(this, 15));

    /* compiled from: PhoneActualizationBottomSheet.kt */
    public static final class a extends dw20.b {
        public String e;
        public String f;
        public UserId g;

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            h2a0 h2a0Var = new h2a0();
            Bundle bundle = new Bundle(3);
            bundle.putString("arg_phone", this.e);
            bundle.putString("arg_token", this.f);
            bundle.putParcelable("arg_uid", this.g);
            h2a0Var.setArguments(bundle);
            return h2a0Var;
        }
    }

    public final UserId Yn() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("arg_uid", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("arg_uid");
            if (!(parcelable3 instanceof UserId)) {
                parcelable3 = null;
            }
            parcelable = (UserId) parcelable3;
        }
        UserId userId = (UserId) parcelable;
        return userId == null ? UserId.d : userId;
    }

    public final void Zn(k2a0 k2a0Var) {
        int i;
        if (k2a0Var instanceof k2a0.c) {
            i = 0;
        } else if (k2a0Var instanceof k2a0.a) {
            i = 1;
        } else {
            if (!(k2a0Var instanceof k2a0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle(1);
        bundle.putInt("result_type", i);
        s3q0 s3q0Var = s3q0.a;
        parentFragmentManager.k0(bundle, "req_PhoneActualizationBottomSheet");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.g1.e();
        boolean z = this.h1;
        ?? r1 = this.i1;
        if (!z) {
            ((d2a0) r1.getValue()).e(Yn());
            Zn(k2a0.a.a);
        }
        ((d2a0) r1.getValue()).c(Yn());
        super.onDismiss(dialogInterface);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        View inflate = eoy.a(getLayoutInflater()).inflate(R.layout.vk_phone_actualization_layout, (ViewGroup) null);
        com.vk.core.ui.bottomsheet.internal.e Hn = Hn();
        Hn.Y = inflate;
        Hn.Z = false;
        Dialog yn = super.yn(bundle);
        Context context = inflate.getContext();
        ((d2a0) this.i1.getValue()).d(Yn());
        yn.setOnShowListener(new g2a0());
        ViewGroup Ln = Ln();
        if (Ln != null) {
            TextView textView = (TextView) Ln.findViewById(R.id.vk_phone_actualization_phone);
            String string = requireArguments().getString("arg_phone");
            if (string == null) {
                string = "";
            }
            textView.setText(string);
            VkButton vkButton = (VkButton) Ln.findViewById(R.id.vk_phone_actualization_button_yes);
            vkButton.setTrailingIconTint(ColorStateList.valueOf(vkButton.getContext().getColor(R.color.vk_white)));
            vkButton.setOnClickListener(new xz5(this, 7));
            this.f1 = vkButton;
            ((VkSimpleButton) Ln.findViewById(R.id.vk_phone_actualization_button_no)).setOnClickListener(new s01(this, 7));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(iah0.b(12.0f));
            gradientDrawable.setColor(e3m.f(R.attr.vk_ui_background_modal, context));
            Ln.setBackground(gradientDrawable);
        }
        return yn;
    }
}
