package defpackage;

import android.view.View;
import com.ybsdk.feature.savings.internal.views.SavingsCardView;

/* loaded from: classes3.dex */
public final class e561 implements zo31 {
    public final SavingsCardView a;
    public final SavingsCardView b;

    public e561(SavingsCardView savingsCardView, SavingsCardView savingsCardView2) {
        this.a = savingsCardView;
        this.b = savingsCardView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
