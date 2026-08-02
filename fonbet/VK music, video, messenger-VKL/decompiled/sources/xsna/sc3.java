package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: AppearanceSettingsWithBackgroundsFragment.kt */
/* loaded from: classes2.dex */
public final class sc3 implements e5z {
    public final /* synthetic */ Lifecycle b;
    public final /* synthetic */ gzs<s3q0> c;

    public sc3(Lifecycle lifecycle, gzs<s3q0> gzsVar) {
        this.b = lifecycle;
        this.c = gzsVar;
    }

    @androidx.lifecycle.o(Lifecycle.Event.ON_START)
    public final void onStart() {
        this.b.removeObserver(this);
        this.c.invoke();
    }
}
