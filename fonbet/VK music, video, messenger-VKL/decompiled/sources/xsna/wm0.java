package xsna;

import android.text.Editable;

/* compiled from: AddOrRenameSessionRoomDialog.kt */
/* loaded from: classes7.dex */
public final class wm0 extends rno0 {
    public final /* synthetic */ ym0 b;

    public wm0(ym0 ym0Var) {
        this.b = ym0Var;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.f1.onNext(drm0.p0(editable.toString()).toString());
    }
}
