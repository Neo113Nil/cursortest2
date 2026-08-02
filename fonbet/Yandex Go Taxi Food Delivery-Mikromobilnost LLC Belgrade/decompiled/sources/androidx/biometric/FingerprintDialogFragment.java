package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
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
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.ay5;
import defpackage.cy5;
import defpackage.dy40;
import defpackage.i8m;
import defpackage.ls31;
import defpackage.meh0;
import defpackage.p1b1;
import defpackage.pxh0;
import defpackage.q8r;
import defpackage.r8r;
import defpackage.t1h0;
import defpackage.wnh0;

/* loaded from: classes10.dex */
public class FingerprintDialogFragment extends DialogFragment {
    private static final int MESSAGE_DISPLAY_TIME_MS = 2000;
    static final int STATE_FINGERPRINT = 1;
    static final int STATE_FINGERPRINT_AUTHENTICATED = 3;
    static final int STATE_FINGERPRINT_ERROR = 2;
    static final int STATE_NONE = 0;
    private static final String TAG = "FingerprintFragment";
    private int mErrorTextColor;
    private ImageView mFingerprintIcon;
    TextView mHelpMessageView;
    private int mNormalTextColor;
    BiometricViewModel mViewModel;
    final Handler mHandler = new Handler(Looper.getMainLooper());
    final Runnable mResetDialogRunnable = new i8m(8, this);

    private void connectViewModel() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new ls31(activity).b(BiometricViewModel.class);
        this.mViewModel = biometricViewModel;
        if (biometricViewModel.Q == null) {
            biometricViewModel.Q = new dy40();
        }
        biometricViewModel.Q.f(this, new e(this, 0));
        BiometricViewModel biometricViewModel2 = this.mViewModel;
        if (biometricViewModel2.R == null) {
            biometricViewModel2.R = new dy40();
        }
        biometricViewModel2.R.f(this, new e(this, 1));
    }

    private Drawable getAssetForTransition(int i, int i2) {
        int i3;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        if (i == 0 && i2 == 1) {
            i3 = t1h0.fingerprint_dialog_fp_icon;
        } else if (i == 1 && i2 == 2) {
            i3 = t1h0.fingerprint_dialog_error;
        } else if (i == 2 && i2 == 1) {
            i3 = t1h0.fingerprint_dialog_fp_icon;
        } else {
            if (i != 1 || i2 != 3) {
                return null;
            }
            i3 = t1h0.fingerprint_dialog_fp_icon;
        }
        return context.getDrawable(i3);
    }

    private int getThemedColorFor(int i) {
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (context == null || activity == null) {
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static FingerprintDialogFragment newInstance() {
        return new FingerprintDialogFragment();
    }

    private boolean shouldAnimateForTransition(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        return i == 2 && i2 == 1;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        BiometricViewModel biometricViewModel = this.mViewModel;
        if (biometricViewModel.O == null) {
            biometricViewModel.O = new dy40();
        }
        BiometricViewModel.a0(biometricViewModel.O, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        connectViewModel();
        this.mErrorTextColor = getThemedColorFor(r8r.a());
        this.mNormalTextColor = getThemedColorFor(R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        int i;
        AlertDialog.a aVar = new AlertDialog.a(requireContext());
        cy5 cy5Var = this.mViewModel.w;
        CharSequence charSequence = null;
        aVar.setTitle(cy5Var != null ? cy5Var.a : null);
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(wnh0.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(meh0.fingerprint_subtitle);
        if (textView != null) {
            cy5 cy5Var2 = this.mViewModel.w;
            if (TextUtils.isEmpty(null)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText((CharSequence) null);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(meh0.fingerprint_description);
        if (textView2 != null) {
            cy5 cy5Var3 = this.mViewModel.w;
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.mFingerprintIcon = (ImageView) inflate.findViewById(meh0.fingerprint_icon);
        this.mHelpMessageView = (TextView) inflate.findViewById(meh0.fingerprint_error);
        BiometricViewModel biometricViewModel = this.mViewModel;
        cy5 cy5Var4 = biometricViewModel.w;
        if (cy5Var4 != null) {
            ay5 ay5Var = biometricViewModel.x;
            i = cy5Var4.d;
            if (i == 0) {
                i = ay5Var != null ? 15 : 255;
            }
        } else {
            i = 0;
        }
        if (p1b1.d(i)) {
            charSequence = getString(pxh0.confirm_device_credential_password);
        } else {
            BiometricViewModel biometricViewModel2 = this.mViewModel;
            String str = biometricViewModel2.B;
            if (str != null) {
                charSequence = str;
            } else {
                cy5 cy5Var5 = biometricViewModel2.w;
                if (cy5Var5 != null && (charSequence = cy5Var5.b) == null) {
                    charSequence = "";
                }
            }
        }
        aVar.e(charSequence, new DialogInterface.OnClickListener() { // from class: androidx.biometric.FingerprintDialogFragment.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                FingerprintDialogFragment.this.mViewModel.Z(true);
            }
        });
        aVar.setView(inflate);
        AlertDialog create = aVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        BiometricViewModel biometricViewModel = this.mViewModel;
        biometricViewModel.P = 0;
        biometricViewModel.Y(1);
        this.mViewModel.X(getString(pxh0.fingerprint_dialog_touch_sensor));
    }

    public void resetDialog() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.mViewModel.Y(1);
        this.mViewModel.X(context.getString(pxh0.fingerprint_dialog_touch_sensor));
    }

    public void updateFingerprintIcon(int i) {
        int i2;
        Drawable assetForTransition;
        if (this.mFingerprintIcon == null || (assetForTransition = getAssetForTransition((i2 = this.mViewModel.P), i)) == null) {
            return;
        }
        this.mFingerprintIcon.setImageDrawable(assetForTransition);
        if (shouldAnimateForTransition(i2, i)) {
            q8r.a(assetForTransition);
        }
        this.mViewModel.P = i;
    }

    public void updateHelpMessageColor(int i) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setTextColor(i == 2 ? this.mErrorTextColor : this.mNormalTextColor);
        }
    }

    public void updateHelpMessageText(CharSequence charSequence) {
        TextView textView = this.mHelpMessageView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
