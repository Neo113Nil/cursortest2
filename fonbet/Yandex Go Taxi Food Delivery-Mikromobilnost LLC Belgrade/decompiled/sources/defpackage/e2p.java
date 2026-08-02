package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.eatskit.EatsKitContentView;

/* loaded from: classes12.dex */
public final class e2p implements zo31 {
    public final FrameLayout a;
    public final EatsKitContentView b;

    public e2p(FrameLayout frameLayout, EatsKitContentView eatsKitContentView) {
        this.a = frameLayout;
        this.b = eatsKitContentView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
