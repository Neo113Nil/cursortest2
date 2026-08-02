package xsna;

import androidx.fragment.app.FragmentActivity;
import java.lang.ref.WeakReference;

/* compiled from: PhoneActualizationEntryPointImpl.kt */
/* loaded from: classes4.dex */
public final class j2a0 implements i2a0 {
    public WeakReference<FragmentActivity> a;

    @Override // xsna.i2a0
    public final void a(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity != null ? new WeakReference<>(fragmentActivity) : null;
    }

    @Override // xsna.i2a0
    public final void clear() {
        WeakReference<FragmentActivity> weakReference = this.a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.a = null;
    }

    @Override // xsna.i2a0
    public final FragmentActivity getActivity() {
        WeakReference<FragmentActivity> weakReference = this.a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
