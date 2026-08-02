package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import xsna.bi40;
import xsna.q630;

/* compiled from: MusicDownloadIndicationView.kt */
/* loaded from: classes3.dex */
public final class wg40 extends td {
    public static final /* synthetic */ int p = 0;
    public final wh50 l;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;

    /* compiled from: MusicDownloadIndicationView.kt */
    public static final class a implements yzs<bi40, androidx.compose.runtime.a, Integer, l5g> {
        public final /* synthetic */ bi40 b;

        public a(wg40 wg40Var, bi40 bi40Var) {
            this.b = bi40Var;
        }

        @Override // xsna.yzs
        public final l5g invoke(bi40 bi40Var, androidx.compose.runtime.a aVar, Integer num) {
            long j;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            aVar2.K(-446118039);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-446118039, intValue, -1, "com.vk.music.design.view.download.MusicDownloadIndicationView.Content.<anonymous>.<anonymous> (MusicDownloadIndicationView.kt:81)");
            }
            int i = td.k;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1561329513, 64, -1, "com.vk.music.design.view.download.MusicDownloadIndicationView.downloadIconTint (MusicDownloadIndicationView.kt:92)");
            }
            bi40.c cVar = bi40.c.a;
            bi40 bi40Var2 = this.b;
            if (bi40Var2.equals(cVar)) {
                aVar2.K(-1494069372);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().l;
                aVar2.j();
            } else {
                if (!bi40Var2.equals(bi40.a.a) && !bi40Var2.equals(bi40.d.a) && !(bi40Var2 instanceof bi40.b)) {
                    throw alb0.c(-1494071979, aVar2);
                }
                aVar2.K(-1494063774);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.b().b;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j, aVar2);
        }
    }

    public wg40(Context context) {
        super(context, null, 0);
        this.l = androidx.compose.runtime.k.b(null);
        this.m = androidx.compose.runtime.k.b(null);
        this.n = androidx.compose.runtime.k.b(null);
        this.o = androidx.compose.runtime.k.b(new xht(13));
    }

    private final izs<bi40, Integer> getContentDescriptionProducer() {
        return (izs) ((zak0) this.o).getValue();
    }

    private final bi40 getDownloadingState() {
        return (bi40) ((zak0) this.l).getValue();
    }

    private final Integer getLoadedIconRes() {
        return (Integer) ((zak0) this.m).getValue();
    }

    private final Integer getNotLoadedIconRes() {
        return (Integer) ((zak0) this.n).getValue();
    }

    private final void setContentDescriptionProducer(izs<? super bi40, Integer> izsVar) {
        ((zak0) this.o).setValue(izsVar);
    }

    private final void setDownloadingState(bi40 bi40Var) {
        ((zak0) this.l).setValue(bi40Var);
    }

    private final void setLoadedIconRes(Integer num) {
        ((zak0) this.m).setValue(num);
    }

    private final void setNotLoadedIconRes(Integer num) {
        ((zak0) this.n).setValue(num);
    }

    public static s3q0 z(wg40 wg40Var, androidx.compose.runtime.a aVar, int i) {
        lg90 a2;
        if (aVar.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1022120304, i, -1, "com.vk.music.design.view.download.MusicDownloadIndicationView.Content.<anonymous> (MusicDownloadIndicationView.kt:75)");
            }
            bi40 downloadingState = wg40Var.getDownloadingState();
            if (downloadingState == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            }
            Integer loadedIconRes = wg40Var.getLoadedIconRes();
            if (loadedIconRes == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            }
            lg90 a3 = pg90.a(loadedIconRes.intValue(), 0, aVar);
            Integer notLoadedIconRes = wg40Var.getNotLoadedIconRes();
            if (notLoadedIconRes == null) {
                aVar.K(-1331837866);
                aVar.j();
                a2 = null;
            } else {
                aVar.K(-1331837865);
                a2 = pg90.a(notLoadedIconRes.intValue(), 0, aVar);
                aVar.j();
            }
            lg90 lg90Var = a2;
            float f = 40;
            q630 D = s200.D(txj0.s(q630.a.a, f, f), 12);
            boolean booleanValue = ((Boolean) bh40.a.getValue()).booleanValue();
            a aVar2 = new a(wg40Var, downloadingState);
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new xht(13);
                aVar.R(x);
            }
            ki40.a(downloadingState, a3, aVar2, (izs) x, D, lg90Var, booleanValue, aVar, 289856, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }

    public final void A() {
        Integer invoke;
        bi40 downloadingState = getDownloadingState();
        setContentDescription((downloadingState == null || (invoke = getContentDescriptionProducer().invoke(downloadingState)) == null) ? null : getContext().getString(invoke.intValue()));
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(331425995);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(331425995, i2, -1, "com.vk.music.design.view.download.MusicDownloadIndicationView.Content (MusicDownloadIndicationView.kt:73)");
            }
            rrv0.d(null, null, null, null, kai.c(1022120304, new com.vk.movika.tools.controls.seekbar.w(this, 14), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xk6(this, i, 7);
        }
    }

    public final void setContentDescriptionProvider(izs<? super bi40, Integer> izsVar) {
        setContentDescriptionProducer(izsVar);
        A();
    }

    public final void setDownloadState(bi40 bi40Var) {
        setDownloadingState(bi40Var);
        A();
    }

    public final void setDownloadedIcon(int i) {
        setLoadedIconRes(Integer.valueOf(i));
    }

    public final void setNotLoadedIcon(Integer num) {
        setNotLoadedIconRes(num);
    }
}
