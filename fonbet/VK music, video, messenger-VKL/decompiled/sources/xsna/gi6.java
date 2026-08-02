package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import xsna.fm6;

/* compiled from: BaseMvpFragment.kt */
@ozl
/* loaded from: classes6.dex */
public class gi6<P extends fm6> extends uhv0 implements hm6<P> {
    public P h;

    public boolean a0() {
        P tn = tn();
        if (tn != null) {
            return tn.a0();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public Context mo2getContext() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        P tn = tn();
        if (tn != null) {
            tn.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        P tn = tn();
        if (tn != null) {
            tn.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        P tn = tn();
        if (tn != null) {
            tn.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        P tn = tn();
        if (tn != null) {
            tn.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        P tn = tn();
        if (tn != null) {
            tn.d();
        }
    }

    public P tn() {
        return this.h;
    }
}
