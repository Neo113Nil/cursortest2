package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class czm implements zo31 {
    public final /* synthetic */ int a;
    public final FrameLayout b;
    public final RobotoTextView c;

    public /* synthetic */ czm(FrameLayout frameLayout, RobotoTextView robotoTextView, int i) {
        this.a = i;
        this.b = frameLayout;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
