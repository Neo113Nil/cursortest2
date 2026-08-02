package xsna;

import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;

/* compiled from: EmailActualizationEntryPointImpl.kt */
/* loaded from: classes.dex */
public final class xbp implements wbp {
    public WeakReference<FragmentActivity> a;

    @Override // xsna.wbp
    public final void a(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity != null ? new WeakReference<>(fragmentActivity) : null;
    }

    @Override // xsna.wbp
    public final void clear() {
        WeakReference<FragmentActivity> weakReference = this.a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.a = null;
    }

    @Override // xsna.wbp
    public final FragmentActivity getActivity() {
        WeakReference<FragmentActivity> weakReference = this.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
