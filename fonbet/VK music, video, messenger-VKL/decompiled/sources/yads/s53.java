package yads;

/* loaded from: classes10.dex */
public final class s53 implements z00 {
    public final z00 a;

    public s53(z00 z00Var) {
        this.a = z00Var;
    }

    @Override // yads.z00
    public final void closeNativeAd() {
        this.a.closeNativeAd();
    }

    @Override // yads.z00
    public final void onAdClicked() {
        this.a.onAdClicked();
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        this.a.onLeftApplication();
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        this.a.onReturnedToApplication();
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
    }
}
