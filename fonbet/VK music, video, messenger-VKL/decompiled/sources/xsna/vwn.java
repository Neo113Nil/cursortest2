package xsna;

import android.content.Context;
import android.graphics.Rect;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import com.vk.donut.design.compose.banner.a;
import xsna.q630;
import xsna.uwn;

/* compiled from: DonutBannerComposeView.kt */
/* loaded from: classes5.dex */
public final class vwn extends rpo0 {
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;

    public vwn(Context context) {
        super(context, null, 0);
        this.m = androidx.compose.runtime.k.b(iyn.l);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(null);
        this.p = androidx.compose.runtime.k.b(null);
        this.q = androidx.compose.runtime.k.b(new vi0(15));
        this.r = androidx.compose.runtime.k.b(new com.vk.movika.sdk.android.defaultplayer.interactive.b(13));
    }

    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        com.vk.donut.design.compose.banner.a cVar;
        ryn b;
        androidx.compose.runtime.a M = aVar.M(-2102071939);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2102071939, i2, -1, "com.vk.profile.community.impl.ui.view.DonutBannerComposeView.ThemedContent (DonutBannerComposeView.kt:41)");
            }
            String str = getComposeViewModel().b;
            String str2 = getComposeViewModel().c;
            String str3 = getComposeViewModel().d;
            uwn uwnVar = getComposeViewModel().e;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-886701807, 0, -1, "com.vk.profile.community.impl.ui.view.toUiModel (DonutBannerComposeView.kt:59)");
            }
            if (epx.f(uwnVar, uwn.a.a)) {
                M.K(-1716906674);
                M.j();
                cVar = a.C0900a.a;
            } else if (uwnVar instanceof uwn.b) {
                M.K(-1716903222);
                T t = ((uwn.b) uwnVar).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1783471307, 0, -1, "com.vk.profile.community.impl.ui.view.toUiModel (DonutBannerComposeView.kt:68)");
                }
                if (t instanceof q3u) {
                    M.K(-223971168);
                    b = wwn.a((q3u) t, M);
                    M.j();
                } else {
                    if (!(t instanceof twm0)) {
                        throw alb0.c(-223972418, M);
                    }
                    M.K(-223969696);
                    b = wwn.b((twm0) t, M);
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                com.vk.donut.design.compose.banner.a bVar = new a.b(b);
                M.j();
                cVar = bVar;
            } else {
                if (!(uwnVar instanceof uwn.c)) {
                    throw alb0.c(-1716908300, M);
                }
                M.K(-1716899936);
                uwn.c cVar2 = (uwn.c) uwnVar;
                cVar = new a.c(wwn.b(cVar2.a, M), wwn.a(cVar2.b, M));
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            DonutBannerKt.d(str, str2, cVar, getGoalsClickListener(), getRegularSupportClickListener(), q630.a.a, str3, getComposeViewModel().f, false, getInfoClickListener(), getAdminClickListener(), getAdminIconRectListener(), M, 196608, 256);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xa2(this, i, 5);
        }
    }

    public final gzs<s3q0> getAdminClickListener() {
        return (gzs) ((zak0) this.o).getValue();
    }

    public final izs<Rect, s3q0> getAdminIconRectListener() {
        return (izs) ((zak0) this.p).getValue();
    }

    public final iyn getComposeViewModel() {
        return (iyn) ((zak0) this.m).getValue();
    }

    public final gzs<s3q0> getGoalsClickListener() {
        return (gzs) ((zak0) this.q).getValue();
    }

    public final gzs<s3q0> getInfoClickListener() {
        return (gzs) ((zak0) this.n).getValue();
    }

    public final gzs<s3q0> getRegularSupportClickListener() {
        return (gzs) ((zak0) this.r).getValue();
    }

    public final void setAdminClickListener(gzs<s3q0> gzsVar) {
        ((zak0) this.o).setValue(gzsVar);
    }

    public final void setAdminIconRectListener(izs<? super Rect, s3q0> izsVar) {
        ((zak0) this.p).setValue(izsVar);
    }

    public final void setComposeViewModel(iyn iynVar) {
        ((zak0) this.m).setValue(iynVar);
    }

    public final void setGoalsClickListener(gzs<s3q0> gzsVar) {
        ((zak0) this.q).setValue(gzsVar);
    }

    public final void setInfoClickListener(gzs<s3q0> gzsVar) {
        ((zak0) this.n).setValue(gzsVar);
    }

    public final void setRegularSupportClickListener(gzs<s3q0> gzsVar) {
        ((zak0) this.r).setValue(gzsVar);
    }
}
