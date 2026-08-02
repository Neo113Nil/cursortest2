package defpackage;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.yandex.go.agreement.simple.ui.AgreementModalView;
import com.ybsdk.core.design.widget.SlideableModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class dk1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ dk1(FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i) {
        this.a = i;
        this.c = frameLayout;
        this.b = onPreDrawListener;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean preDrawListener$lambda$0;
        boolean preDrawListener$lambda$02;
        boolean lambda$getPreDrawListener$0;
        int i = this.a;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.b;
        FrameLayout frameLayout = this.c;
        switch (i) {
            case 0:
                preDrawListener$lambda$0 = AgreementModalView.getPreDrawListener$lambda$0((AgreementModalView) frameLayout, onPreDrawListener);
                return preDrawListener$lambda$0;
            case 1:
                preDrawListener$lambda$02 = CompositeAddressSearchModalView.getPreDrawListener$lambda$0((CompositeAddressSearchModalView) frameLayout, onPreDrawListener);
                return preDrawListener$lambda$02;
            default:
                lambda$getPreDrawListener$0 = ((SlideableModalView) frameLayout).lambda$getPreDrawListener$0(onPreDrawListener);
                return lambda$getPreDrawListener$0;
        }
    }
}
