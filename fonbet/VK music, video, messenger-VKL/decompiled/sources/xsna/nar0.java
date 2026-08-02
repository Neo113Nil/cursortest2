package xsna;

import android.view.View;

/* compiled from: VKBottomSheetDialog.java */
/* loaded from: classes17.dex */
public final class nar0 implements View.OnClickListener {
    public final /* synthetic */ kar0 b;

    public nar0(kar0 kar0Var) {
        this.b = kar0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.cancel();
    }
}
