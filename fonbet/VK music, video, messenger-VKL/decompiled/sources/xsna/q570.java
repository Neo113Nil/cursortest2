package xsna;

import android.view.ViewTreeObserver;
import com.google.android.material.appbar.NonBouncedAppBarShadowView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class q570 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ NonBouncedAppBarShadowView.a b;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        NonBouncedAppBarShadowView.a aVar = this.b;
        aVar.h.post(aVar.i);
    }
}
