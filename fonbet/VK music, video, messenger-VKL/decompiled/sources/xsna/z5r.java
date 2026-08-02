package xsna;

import java.util.ArrayList;

/* compiled from: FeedbackEnabledListener.kt */
/* loaded from: classes7.dex */
public final class z5r implements f39 {
    public final z410 b;

    public z5r(z410 z410Var) {
        this.b = z410Var;
    }

    @Override // xsna.f39
    public final void onFeedbackEnabledChanged(boolean z) {
        this.b.invoke(Boolean.valueOf(z));
    }

    @Override // xsna.f39
    public final void c(String str) {
    }

    @Override // xsna.f39
    public final void j(ArrayList arrayList) {
    }

    @Override // xsna.f39
    public final void n(ArrayList arrayList) {
    }
}
