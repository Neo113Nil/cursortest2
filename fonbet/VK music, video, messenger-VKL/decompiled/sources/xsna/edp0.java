package xsna;

import android.view.View;
import xsna.fdp0;

/* compiled from: TouchHelper.java */
/* loaded from: classes3.dex */
public final class edp0 implements fdp0.a {
    public final /* synthetic */ boolean b;

    public edp0(boolean z) {
        this.b = z;
    }

    @Override // xsna.fdp0.a
    public final boolean a(View view) {
        if ((!view.hasOnClickListeners() && !view.isClickable()) || view.getVisibility() != 0) {
            return false;
        }
        if (!this.b) {
            return true;
        }
        view.callOnClick();
        return true;
    }
}
