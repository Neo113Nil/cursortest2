package androidx.transition;

/* loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        d0(1);
        Z(new Fade(2));
        Z(new ChangeBounds());
        Z(new Fade(1));
    }
}
