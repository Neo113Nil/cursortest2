package defpackage;

import android.view.View;
import com.yandex.go.ultima_mode.ui.progress_bar.SimpleProgressBarView;
import com.yandex.go.ultima_mode.ui.progress_bar.UltimaModeProgressBarView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class nv11 implements zo31 {
    public final UltimaModeProgressBarView a;
    public final RobotoTextView b;
    public final RobotoTextView c;
    public final RobotoTextView d;
    public final SimpleProgressBarView e;

    public nv11(UltimaModeProgressBarView ultimaModeProgressBarView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, SimpleProgressBarView simpleProgressBarView) {
        this.a = ultimaModeProgressBarView;
        this.b = robotoTextView;
        this.c = robotoTextView2;
        this.d = robotoTextView3;
        this.e = simpleProgressBarView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
