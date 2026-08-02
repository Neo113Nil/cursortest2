package xsna;

import android.view.Surface;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.vk.core.view.AppBarShadowView;
import com.vk.voip.ui.view.VoipActionVerticalButtonView;
import com.vungle.ads.BidTokenCallback;
import kotlin.Lazy;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import xsna.mp50;
import xsna.xp50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vo2 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vo2(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Runnable runnable = (Runnable) this.c;
                View view = (View) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                view.setVisibility(4);
                cp2.b(view, 1, view.getTranslationY());
                break;
            case 1:
                AppBarShadowView.a aVar = (AppBarShadowView.a) this.c;
                AppBarShadowView appBarShadowView = (AppBarShadowView) this.d;
                CoordinatorLayout coordinatorLayout = aVar.l;
                AppBarLayout appBarLayout = aVar.m;
                View view2 = aVar.n;
                if (coordinatorLayout != null && appBarLayout != null && view2 != null) {
                    AppBarShadowView.U(appBarShadowView, view2);
                    break;
                }
                break;
            case 2:
                LevelPlayNativeAd.b((LevelPlayNativeAd) this.c, (AdInfo) this.d);
                break;
            case 3:
                bq50 bq50Var = (bq50) this.c;
                xp50 xp50Var = (xp50) this.d;
                mp50 mp50Var = bq50Var.a;
                if (!(xp50Var instanceof xp50.j)) {
                    if (!(xp50Var instanceof xp50.i)) {
                        if (xp50Var instanceof xp50.a) {
                            mp50Var.a(new mp50.a.C3362a(((xp50.a) xp50Var).a));
                            break;
                        }
                    } else {
                        mp50.a i = bq50.i(((xp50.i) xp50Var).c);
                        if (i != null) {
                            mp50Var.a(i);
                            break;
                        }
                    }
                } else {
                    mp50.a i2 = bq50.i(((xp50.j) xp50Var).b);
                    if (i2 != null) {
                        mp50Var.a(i2);
                        break;
                    }
                }
                break;
            case 4:
                ((io.reactivex.rxjava3.functions.f) this.c).accept(this.d);
                break;
            case 5:
                ((o7j) this.c).accept(new ao5(4, (Surface) this.d));
                break;
            case 6:
                tcp0 tcp0Var = (tcp0) this.c;
                yg5 yg5Var = (yg5) this.d;
                Long l = tcp0Var.h.c;
                if (l != null) {
                    yg5Var.seek(l.longValue());
                }
                yg5 yg5Var2 = tcp0Var.k;
                if (yg5Var2 != null && yg5Var2.p0() && tcp0Var.j.invoke().booleanValue()) {
                    yg5Var2.play();
                    break;
                }
                break;
            case 7:
                ((VideoFileRenderer) this.c).lambda$onFrame$0((VideoFrame) this.d);
                break;
            case 8:
                VoipActionVerticalButtonView voipActionVerticalButtonView = (VoipActionVerticalButtonView) this.c;
                voipActionVerticalButtonView.u.setText((CharSequence) this.d);
                break;
            default:
                com.vungle.ads.internal.z2.a((BidTokenCallback) this.c, (Lazy) this.d);
                break;
        }
    }
}
