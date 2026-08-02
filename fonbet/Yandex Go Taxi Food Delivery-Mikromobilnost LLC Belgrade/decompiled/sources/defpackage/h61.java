package defpackage;

import android.view.View;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.search.view.BaseAddressSearchView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes6.dex */
public final class h61 {
    public final SlideableModalView a;
    public final BaseAddressSearchView b;
    public final boolean c;
    public final boolean d;
    public boolean e = true;

    public h61(SlideableModalView slideableModalView, BaseAddressSearchView baseAddressSearchView, boolean z, boolean z2) {
        this.a = slideableModalView;
        this.b = baseAddressSearchView;
        this.c = z;
        this.d = z2;
    }

    public final void a(t1w t1wVar) {
        BaseAddressSearchView baseAddressSearchView = this.b;
        if (!baseAddressSearchView.insetsHelperHasInputFocus() && this.e && this.c) {
            this.e = false;
            return;
        }
        boolean z = this.d;
        int i = !z ? t1wVar.b : 0;
        int i2 = z ? t1wVar.b : 0;
        int i3 = t1wVar.g;
        View findViewById = baseAddressSearchView.getSuggestsView().findViewById(wch0.suggest_recycler_view);
        SlideableModalView slideableModalView = this.a;
        if (findViewById != null) {
            xw31.M(i2, slideableModalView.getCardContentView());
            xw31.I(findViewById, null, null, null, Integer.valueOf(i3));
        } else {
            slideableModalView.getCardContentView().setPadding(0, i2, 0, i3);
        }
        if (i > 0) {
            slideableModalView.setTopSystemWindowInset(i);
        }
        WeakHashMap weakHashMap = b.a;
        n751 a = op31.a(slideableModalView);
        if (!(a == null ? false : a.a.q(8))) {
            baseAddressSearchView.insetsHelperNotifyKeyboardHidden();
        } else {
            baseAddressSearchView.insetsHelperNotifyKeyboardShown();
            this.e = false;
        }
    }
}
