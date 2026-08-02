package androidx.compose.material3;

import defpackage.i1k;

/* loaded from: classes10.dex */
public final class s implements i1k {
    public final /* synthetic */ ModalBottomSheetDialogWrapper a;

    public s(ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper) {
        this.a = modalBottomSheetDialogWrapper;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = this.a;
        modalBottomSheetDialogWrapper.dismiss();
        modalBottomSheetDialogWrapper.disposeComposition();
    }
}
