package androidx.media3.exoplayer.scheduler;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RequirementsWatcher$NetworkCallback b;

    public /* synthetic */ a(RequirementsWatcher$NetworkCallback requirementsWatcher$NetworkCallback, int i) {
        this.a = i;
        this.b = requirementsWatcher$NetworkCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RequirementsWatcher$NetworkCallback requirementsWatcher$NetworkCallback = this.b;
        switch (i) {
            case 0:
                requirementsWatcher$NetworkCallback.lambda$postCheckRequirements$0();
                break;
            default:
                requirementsWatcher$NetworkCallback.lambda$postRecheckNotMetNetworkRequirements$1();
                break;
        }
    }
}
