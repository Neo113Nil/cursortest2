package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import xsna.e57;

/* compiled from: FingerprintDialogFragment.java */
/* loaded from: classes11.dex */
public class ghr extends androidx.fragment.app.d {
    public int A;
    public int B;

    @Nullable
    public ImageView C;

    @Nullable
    public TextView D;
    public final Handler x = new Handler(Looper.getMainLooper());
    public final a y = new a();
    public o57 z;

    /* compiled from: FingerprintDialogFragment.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ghr ghrVar = ghr.this;
            Context mo2getContext = ghrVar.mo2getContext();
            if (mo2getContext == null) {
                return;
            }
            ghrVar.z.l(1);
            ghrVar.z.k(mo2getContext.getString(R.string.fingerprint_dialog_touch_sensor));
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ghr.this.z.m(true);
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    public static class c {
        public static void a(@NonNull Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    public static class d {
        public static int a() {
            return R.attr.colorError;
        }
    }

    public final int Dn(int i) {
        Context mo2getContext = mo2getContext();
        FragmentActivity activity = getActivity();
        if (mo2getContext == null || activity == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        mo2getContext.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        o57 o57Var = this.z;
        if (o57Var.v == null) {
            o57Var.v = new ug50<>();
        }
        o57.n(o57Var.v, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            vyt0 vyt0Var = new vyt0(activity.getViewModelStore(), activity.getDefaultViewModelProviderFactory(), activity.getDefaultViewModelCreationExtras());
            rfc a2 = fpf0.a(o57.class);
            String h = a2.h();
            if (h == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            o57 o57Var = (o57) vyt0Var.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a2);
            this.z = o57Var;
            if (o57Var.x == null) {
                o57Var.x = new ug50<>();
            }
            o57Var.x.e(this, new w47(this, 1));
            o57 o57Var2 = this.z;
            if (o57Var2.y == null) {
                o57Var2.y = new ug50<>();
            }
            o57Var2.y.e(this, new x47(this, 1));
        }
        this.A = Dn(d.a());
        this.B = Dn(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.x.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        o57 o57Var = this.z;
        o57Var.w = 0;
        o57Var.l(1);
        this.z.k(getString(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.d
    @NonNull
    public final Dialog yn(@Nullable Bundle bundle) {
        d.a aVar = new d.a(requireContext());
        e57.d dVar = this.z.d;
        CharSequence charSequence = null;
        aVar.setTitle(dVar != null ? dVar.a : null);
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            e57.d dVar2 = this.z.d;
            CharSequence charSequence2 = dVar2 != null ? dVar2.b : null;
            if (TextUtils.isEmpty(charSequence2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence2);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            e57.d dVar3 = this.z.d;
            CharSequence charSequence3 = dVar3 != null ? dVar3.c : null;
            if (TextUtils.isEmpty(charSequence3)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequence3);
            }
        }
        this.C = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.D = (TextView) inflate.findViewById(R.id.fingerprint_error);
        if (e75.a(this.z.i())) {
            charSequence = getString(R.string.confirm_device_credential_password);
        } else {
            o57 o57Var = this.z;
            String str = o57Var.i;
            if (str != null) {
                charSequence = str;
            } else {
                e57.d dVar4 = o57Var.d;
                if (dVar4 != null && (charSequence = dVar4.d) == null) {
                    charSequence = "";
                }
            }
        }
        aVar.f(charSequence, new b());
        aVar.setView(inflate);
        androidx.appcompat.app.d create = aVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }
}
