package androidx.compose.ui.window;

import defpackage.i1k;

/* loaded from: classes10.dex */
public final class a implements i1k {
    public final /* synthetic */ DialogWrapper a;

    public a(DialogWrapper dialogWrapper) {
        this.a = dialogWrapper;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        DialogWrapper dialogWrapper = this.a;
        dialogWrapper.dismiss();
        dialogWrapper.disposeComposition();
    }
}
