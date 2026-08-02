package defpackage;

import android.view.View;
import android.view.WindowInsets;
import ru.yandex.taxi.logistics.care.impl.router.FullScreenOverlayModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class bjs implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets onAttachedToWindow$lambda$0;
        onAttachedToWindow$lambda$0 = FullScreenOverlayModalView.onAttachedToWindow$lambda$0(view, windowInsets);
        return onAttachedToWindow$lambda$0;
    }
}
