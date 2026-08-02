package xsna;

import android.view.ViewTreeObserver;
import com.vk.core.view.AppBarShadowView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class r13 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ AppBarShadowView.a b;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        AppBarShadowView.a aVar = this.b;
        aVar.h.post(aVar.i);
    }
}
