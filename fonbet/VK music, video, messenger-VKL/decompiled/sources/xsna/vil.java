package xsna;

/* compiled from: DefaultModalDialogProvider.kt */
/* loaded from: classes3.dex */
public final class vil extends m180 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vil(boolean z) {
        super(true);
        this.a = z;
    }

    @Override // xsna.m180
    public final void handleOnBackPressed() {
        if (this.a) {
            wil.a.getClass();
            wil.a();
            setEnabled(false);
        }
    }
}
