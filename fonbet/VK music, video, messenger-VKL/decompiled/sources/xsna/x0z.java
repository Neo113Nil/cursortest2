package xsna;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.vk.rlottie.RLottieDrawable;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: LegacyDoubleTapInitAction.kt */
@ozl
/* loaded from: classes4.dex */
public final class x0z extends gux {
    public final UsableRecyclerView a;
    public final g7o b;

    public x0z(UsableRecyclerView usableRecyclerView, g7o g7oVar) {
        this.a = usableRecyclerView;
        this.b = g7oVar;
    }

    @Override // xsna.gux
    public final void a() {
        UsableRecyclerView.t tVar = new UsableRecyclerView.t() { // from class: xsna.u0z
            @Override // me.grishka.appkit.views.UsableRecyclerView.t
            public final void a(int i, int i2, int i3, int i4) {
                x0z.this.b.l();
            }
        };
        UsableRecyclerView usableRecyclerView = this.a;
        usableRecyclerView.z.a.add(tVar);
        usableRecyclerView.A.b.add(new UsableRecyclerView.k() { // from class: xsna.v0z
            @Override // me.grishka.appkit.views.UsableRecyclerView.k
            public final boolean c(Drawable drawable) {
                return drawable == x0z.this.b.g;
            }
        });
        usableRecyclerView.B.a.add(new UsableRecyclerView.i() { // from class: xsna.w0z
            @Override // me.grishka.appkit.views.UsableRecyclerView.i
            public final void detach() {
                g7o g7oVar = x0z.this.b;
                RLottieDrawable rLottieDrawable = g7oVar.g;
                if (rLottieDrawable != null) {
                    rLottieDrawable.k();
                }
                ValueAnimator valueAnimator = g7oVar.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
        });
    }
}
