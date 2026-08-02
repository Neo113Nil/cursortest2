package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class g961 implements zo31 {
    public final FrameLayout a;

    public g961(FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    public static g961 p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_topup_notice, viewGroup, false);
        if (inflate != null) {
            return new g961((FrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final FrameLayout o() {
        return this.a;
    }
}
