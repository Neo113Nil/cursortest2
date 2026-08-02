package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import xsna.gm6;

/* compiled from: BaseMvpModalBottomSheet.kt */
/* loaded from: classes17.dex */
public class hi6<P extends gm6> extends dw20 implements im6<P> {
    public P f1;

    public P Yn() {
        return this.f1;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        P Yn = Yn();
        if (Yn != null) {
            Yn.onDestroy();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        P Yn = Yn();
        if (Yn != null) {
            Yn.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        P Yn = Yn();
        if (Yn != null) {
            Yn.onPause();
        }
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        P Yn = Yn();
        if (Yn != null) {
            Yn.onResume();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        P Yn = Yn();
        if (Yn != null) {
            Yn.onStart();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        P Yn = Yn();
        if (Yn != null) {
            Yn.onStop();
        }
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        P Yn = Yn();
        if (Yn != null) {
            Yn.d();
        }
        return yn;
    }
}
