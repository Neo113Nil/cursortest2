package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import xsna.fm6;

/* compiled from: BaseCheckoutFragment.kt */
/* loaded from: classes6.dex */
public abstract class bb6<T extends fm6> extends gi6<T> {
    @Override // xsna.gi6, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return hnj.a(activity);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return eoy.a(LayoutInflater.from(mo2getContext()));
    }
}
