package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.NumberCheckoutView;

/* loaded from: classes12.dex */
public final class cna implements zo31 {
    public final FrameLayout a;
    public final GoView b;
    public final NumberCheckoutView c;
    public final dna d;
    public final dda e;

    public cna(FrameLayout frameLayout, GoView goView, NumberCheckoutView numberCheckoutView, dna dnaVar, dda ddaVar) {
        this.a = frameLayout;
        this.b = goView;
        this.c = numberCheckoutView;
        this.d = dnaVar;
        this.e = ddaVar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
