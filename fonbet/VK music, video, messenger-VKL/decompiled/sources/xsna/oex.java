package xsna;

import android.animation.ValueAnimator;
import com.vk.dto.music.Playlist;
import com.vk.stories.design.view.StoryProgressView;
import xsna.aex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class oex implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oex(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                qex qexVar = (qex) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((StoryProgressView) qexVar.s.getValue()).setProgress(floatValue);
                long j = (long) (15000 * floatValue);
                aex.a.C2538a c2538a = qexVar.u;
                if (c2538a != null) {
                    c2538a.a = Long.valueOf(j);
                    c2538a.b = 15000L;
                    break;
                }
                break;
            case 1:
                vg40 vg40Var = (vg40) this.c;
                vg40Var.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Playlist playlist = vg40Var.q;
                if (playlist != null) {
                    vg40Var.W5(playlist);
                    break;
                }
                break;
            default:
                y3v0 y3v0Var = (y3v0) this.c;
                y3v0Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3v0Var.invalidateSelf();
                break;
        }
    }
}
