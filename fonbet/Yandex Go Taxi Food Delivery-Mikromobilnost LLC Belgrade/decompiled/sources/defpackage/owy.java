package defpackage;

/* loaded from: classes10.dex */
public interface owy {
    public static final sf10 F2 = new sf10(new Object());

    au1 getAllocator();

    default long getBackBufferDurationUs() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    long getBackBufferDurationUs(vyc0 vyc0Var);

    default void onPrepared() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    void onPrepared(vyc0 vyc0Var);

    default void onReleased() {
        throw new IllegalStateException("onReleased not implemented");
    }

    void onReleased(vyc0 vyc0Var);

    default void onStopped() {
        throw new IllegalStateException("onStopped not implemented");
    }

    void onStopped(vyc0 vyc0Var);

    void onTracksSelected(a9z0 a9z0Var, sf10 sf10Var, fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr);

    void onTracksSelected(nwy nwyVar, yzz0 yzz0Var, loo[] looVarArr);

    default void onTracksSelected(fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default boolean retainBackBufferFromKeyframe() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    boolean retainBackBufferFromKeyframe(vyc0 vyc0Var);

    default boolean shouldContinueLoading(long j, long j2, float f) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    boolean shouldContinueLoading(nwy nwyVar);

    boolean shouldContinuePreloading(a9z0 a9z0Var, sf10 sf10Var, long j);

    default boolean shouldStartPlayback(a9z0 a9z0Var, sf10 sf10Var, long j, float f, boolean z, long j2) {
        return shouldStartPlayback(j, f, z, j2);
    }

    boolean shouldStartPlayback(nwy nwyVar);

    default boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }
}
