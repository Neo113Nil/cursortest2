package androidx.fragment.app;

import android.view.View;
import defpackage.acs;
import defpackage.ny61;
import defpackage.oyr;

/* loaded from: classes.dex */
public final class i extends acs {
    public final /* synthetic */ Fragment a;

    public i(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.acs
    public final View b(int i) {
        Fragment fragment = this.a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        ny61.r(oyr.o("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // defpackage.acs
    public final boolean c() {
        return this.a.mView != null;
    }
}
