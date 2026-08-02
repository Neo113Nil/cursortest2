package defpackage;

import android.view.View;
import com.yandex.go.taxi.order.multi.feed.ui.HandlerStickyView;

/* loaded from: classes14.dex */
public final class l6u implements zo31 {
    public final HandlerStickyView a;
    public final View b;

    public l6u(HandlerStickyView handlerStickyView, View view) {
        this.a = handlerStickyView;
        this.b = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
