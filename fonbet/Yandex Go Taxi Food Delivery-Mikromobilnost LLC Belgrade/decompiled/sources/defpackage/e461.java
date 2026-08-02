package defpackage;

import android.view.View;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFunFactView;

/* loaded from: classes3.dex */
public final class e461 implements zo31 {
    public final PfmFunFactView a;
    public final YbDivView b;

    public e461(PfmFunFactView pfmFunFactView, YbDivView ybDivView) {
        this.a = pfmFunFactView;
        this.b = ybDivView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
