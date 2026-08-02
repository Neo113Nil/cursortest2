package xsna;

import android.util.Log;
import androidx.core.widget.ContentLoadingProgressBar;
import com.vk.stickers.views.RLottieImageView;
import ru.ok.android.onelog.OneLogItem;
import xsna.jwj0;
import xsna.xfk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yv6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xfk0 xfk0Var;
        int i = 0;
        switch (this.b) {
            case 0:
                zv6 zv6Var = (zv6) this.c;
                try {
                    xfk0.a aVar = new xfk0.a();
                    aVar.b = zv6Var.c;
                    aVar.a = new d9(zv6Var, 2);
                    xfk0Var = aVar.a();
                } catch (Exception e) {
                    Log.e("SoundHistogramTask", "Failed to populate audio spectr", e);
                    zv6Var.e = true;
                    xfk0Var = null;
                }
                if (zv6Var.b == null || zv6Var.e) {
                    return;
                }
                long[] jArr = xfk0Var != null ? xfk0Var.b : null;
                if (jArr != null) {
                    zv6Var.a.post(new xy4(1, zv6Var, jArr));
                    return;
                }
                return;
            case 1:
                rxd rxdVar = (rxd) this.c;
                rxdVar.c.b(new io.reactivex.rxjava3.internal.operators.single.v(new qxd(rxdVar, i)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k5(new j5(rxdVar, 21), 11), new ir0(new l5(rxdVar, 23), 6)));
                return;
            case 2:
                ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this.c;
                int i2 = ContentLoadingProgressBar.d;
                contentLoadingProgressBar.setVisibility(8);
                return;
            case 3:
                czg0 czg0Var = (czg0) this.c;
                synchronized (czg0Var.a) {
                    try {
                        czg0Var.c = true;
                        czg0Var.d.d();
                        if (czg0Var.b == 0) {
                            czg0Var.close();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                ((OneLogItem) this.c).log();
                return;
            case 5:
                ((RLottieImageView) this.c).requestLayout();
                return;
            case 6:
                y5f0 y5f0Var = (y5f0) this.c;
                m3r m3rVar = y5f0Var.a;
                int i3 = m3r.R;
                m3rVar.h(null);
                bwt0.p0(m3rVar, true);
                m3rVar.setPopupTranslationY(0);
                m3rVar.E = 1.0f;
                m3rVar.H = m3rVar.v;
                m3rVar.G = m3rVar.t;
                m3rVar.requestLayout();
                m3rVar.invalidate();
                m3rVar.setSelectedReactionPosition(-1);
                m3rVar.P.a();
                f3r[] reactionViews = y5f0Var.b.getReactionViews();
                int length = reactionViews.length;
                while (i < length) {
                    reactionViews[i].b();
                    i++;
                }
                y5f0Var.c.f(m3rVar);
                return;
            case 7:
                ((com.vk.superapp.verification.account.d) this.c).tn();
                return;
            case 8:
                ((jwj0.a.C3151a) this.c).invoke();
                return;
            case 9:
                ((ru.mail.libverify.b0.a) this.c).d();
                return;
            default:
                ((com.mbridge.msdk.config.component.common.network.retry.c) this.c).c();
                return;
        }
    }
}
