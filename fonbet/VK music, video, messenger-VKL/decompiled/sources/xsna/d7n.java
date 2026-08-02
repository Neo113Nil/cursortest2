package xsna;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.util.Timer;
import com.ironsource.C4602vb;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.vk.dto.music.Thumb;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import java.util.concurrent.CountDownLatch;
import xsna.a9q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d7n implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d7n(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) obj2;
                sq60 sq60Var = (sq60) obj;
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                a9q0 a9q0Var = sq60Var.h;
                if ((a9q0Var instanceof a9q0.b) || (a9q0Var instanceof a9q0.a) || (a9q0Var instanceof a9q0.c) || (a9q0Var instanceof a9q0.d)) {
                    bs60.b(discoverSimilarFeedFragment.eo().b());
                    discoverSimilarFeedFragment.eo().b().c();
                }
                if (!discoverSimilarFeedFragment.eo().a().A0(sq60Var.a)) {
                    discoverSimilarFeedFragment.p0.d(sq60Var, (tc60) discoverSimilarFeedFragment.eo().a.U.getValue(), discoverSimilarFeedFragment.go().get());
                }
                discoverSimilarFeedFragment.eo().b().l();
                break;
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    taskCompletionSource.setResult(((piw) obj2).m());
                    break;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 2:
                fnw fnwVar = (fnw) obj2;
                mjw mjwVar = (mjw) obj;
                fir0 fir0Var = fnwVar.m;
                int width = mjwVar.getWidth();
                int height = mjwVar.getHeight();
                h64 h64Var = fir0Var.m;
                h64Var.q = width;
                h64Var.p = height;
                if (width != -1 || height != -1) {
                    h64Var.o.reset();
                    h64Var.c();
                    VKImageView g = h64Var.g();
                    if (g != null) {
                        g.invalidate();
                    }
                }
                fnwVar.getCallback().i(fnwVar.getPosition());
                if (!fnwVar.getCallback().e(fnwVar.getPosition())) {
                    fnwVar.setZoomable(true);
                    fnwVar.setAlpha(1.0f);
                    break;
                }
                break;
            case 3:
                IronSourceThreadManager.a((Runnable) obj2, (CountDownLatch) obj);
                break;
            case 4:
                v220 v220Var = (v220) obj2;
                com.google.firebase.perf.v1.b b = v220Var.b((Timer) obj);
                if (b != null) {
                    v220Var.b.add(b);
                    break;
                }
                break;
            case 5:
                ((y780) obj2).k((Thumb) obj);
                break;
            case 6:
                ((com.my.tracker.obfuscated.e0) obj2).a((String) obj);
                break;
            default:
                C4602vb.b((C4602vb) obj2, (Runnable) obj);
                break;
        }
    }
}
