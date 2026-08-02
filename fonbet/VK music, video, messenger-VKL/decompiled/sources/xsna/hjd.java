package xsna;

/* compiled from: ClipsAvatarCommentBubbleView.kt */
/* loaded from: classes16.dex */
public final class hjd implements Runnable {
    public final /* synthetic */ ijd b;

    public hjd(ijd ijdVar) {
        this.b = ijdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.getOnAppearAnimationEndListener();
    }
}
