package defpackage;

import android.graphics.drawable.Drawable;
import android.location.Location;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.R$drawable;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import java.io.IOException;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.b;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.cs1;
import yads.gn0;
import yads.jc2;
import yads.kf0;
import yads.lj1;

/* loaded from: classes10.dex */
public final /* synthetic */ class gp51 implements lh51, bx60, odv, zq81, rq81, ok71, gp81, ov71, rp61, ap71, n281, be71, dr71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp51(wc71 wc71Var, Object obj, long j) {
        this.a = 19;
        this.b = obj;
    }

    @Override // defpackage.ap71
    public void a() {
        qv71 qv71Var = (qv71) this.b;
        kf0 kf0Var = new kf0();
        qv71Var.a();
        if (qv71Var.h) {
            return;
        }
        qv71Var.h = true;
        String lowerCase = "TIMEOUT".toLowerCase(Locale.ROOT);
        String message = kf0Var.getMessage();
        if (message == null) {
            message = "";
        }
        fp71 fp71Var = qv71Var.d;
        fp71Var.getClass();
        fp71Var.f(b.l(new Pair(ACSPConstants.STATUS, "error"), new Pair("failure_reason", lowerCase), new Pair("error_message", message)));
    }

    @Override // defpackage.lh51
    public void b() {
        ((lyc) this.b).invoke();
    }

    @Override // defpackage.ok71
    public void c(long j, long j2, long j3) {
        zv71 zv71Var = ((xp61) this.b).e;
        if (zv71Var == null) {
            return;
        }
        zv71Var.a(j, (j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j, j2);
    }

    @Override // defpackage.zq81
    public void d(Drawable drawable) {
        jj61 jj61Var = (jj61) this.b;
        if (drawable != null) {
            ImageView imageView = (ImageView) jj61Var.d();
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) jj61Var.d();
        if (imageView2 != null) {
            imageView2.setImageDrawable(imageView2.getContext().getDrawable(R$drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }

    public void e(Location location) {
        mx81.a((db) this.b, location);
    }

    public void f(Display display) {
        gd71 gd71Var = (gd71) this.b;
        gd71Var.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            gd71Var.k = refreshRate;
            gd71Var.l = (refreshRate * 80) / 100;
        } else {
            nba1.e();
            gd71Var.k = -9223372036854775807L;
            gd71Var.l = -9223372036854775807L;
        }
    }

    @Override // defpackage.ov71
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 11:
                ((gn0) obj2).a((ub81) obj);
                break;
            case 12:
                ((ub81) obj).l((cs1) obj2);
                break;
            case 13:
                ((ub81) obj).q((dd71) obj2);
                break;
            case 14:
                ((ub81) obj).p((bf71) obj2);
                break;
            case 15:
            case 17:
            default:
                h881 h881Var = (h881) obj2;
                b171 b171Var = (b171) obj;
                b171Var.w += h881Var.g;
                b171Var.x += h881Var.e;
                break;
            case 16:
                ((ub81) obj).t((oi61) obj2);
                break;
            case 18:
                ((b171) obj).m = (jc2) obj2;
                break;
            case 19:
                ((b171) obj).getClass();
                break;
            case 20:
                b171 b171Var2 = (b171) obj;
                b171Var2.getClass();
                b171Var2.u = ((pil0) obj2).a;
                break;
        }
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 insetsListener$lambda$12;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                insetsListener$lambda$12 = YbDivView.setInsetsListener$lambda$12((YbDivView) obj, view, n751Var);
                return insetsListener$lambda$12;
            default:
                FrameLayout frameLayout = ((s861) obj).a;
                frameLayout.setPadding(frameLayout.getPaddingLeft(), p7b1.f(n751Var).b, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                return n751Var;
        }
    }

    @Override // defpackage.odv
    public void r(pdv pdvVar) {
        tf61 tf61Var = (tf61) this.b;
        tf61Var.getClass();
        try {
            jdv acquireLatestImage = pdvVar.acquireLatestImage();
            if (acquireLatestImage != null) {
                tf61Var.c.j(acquireLatestImage);
            }
        } catch (IllegalStateException e) {
            sgb1.d("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e.getMessage());
        }
    }

    @Override // defpackage.rq81
    public void e() {
        ((j471) this.b).p();
    }

    public /* synthetic */ gp51(wc71 wc71Var, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ gp51(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ gp51(wc71 wc71Var, nl81 nl81Var, pil0 pil0Var, IOException iOException, boolean z) {
        this.a = 20;
        this.b = pil0Var;
    }

    @Override // defpackage.be71
    public long a(long j) {
        long j2 = (j * r4.e) / 1000000;
        long j3 = ((cfr) this.b).j - 1;
        int i = rf71.a;
        return Math.max(0L, Math.min(j2, j3));
    }

    @Override // defpackage.n281
    public int a(Object obj) {
        try {
            return ((aq61) obj).e((qd81) this.b) ? 1 : 0;
        } catch (lj1 unused) {
            return -1;
        }
    }
}
