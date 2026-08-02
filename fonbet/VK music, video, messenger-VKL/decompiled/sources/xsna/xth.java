package xsna;

import android.view.LayoutInflater;
import com.vk.core.fragments.FragmentImpl;
import xsna.kbx0;

/* compiled from: CommunityProfileSideEffectWarningNotificationDelegate.kt */
/* loaded from: classes5.dex */
public final class xth implements kbx0.a {
    public final FragmentImpl a;
    public final kbx0 b;

    public xth(FragmentImpl fragmentImpl) {
        this.a = fragmentImpl;
        this.b = new kbx0(fragmentImpl);
    }

    @Override // xsna.kbx0.a
    public final void a(fcn fcnVar) {
        LayoutInflater.Factory activity = this.a.getActivity();
        if (activity != null && (activity instanceof ey50)) {
            ((ey50) activity).Y().H(fcnVar);
        }
    }

    @Override // xsna.kbx0.a
    public final void b(kbx0.d dVar) {
        LayoutInflater.Factory activity = this.a.getActivity();
        if (activity != null && (activity instanceof ey50)) {
            ((ey50) activity).Y().S(dVar);
        }
    }
}
