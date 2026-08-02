package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.cue;
import xsna.dt1;
import xsna.q630;

/* compiled from: ClipsPlaylistsFoldersBottomContentView.kt */
/* loaded from: classes16.dex */
public final class lte extends ame<cue, jte> {
    public final xqi<cue.a<aue>> f;

    public lte(xqi xqiVar, Context context, tte tteVar, boolean z) {
        super(context, tteVar, z);
        this.f = xqiVar;
        vq.b(-1, -2, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        g((cue) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(cue cueVar, izs<? super jte, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1745283969);
        int i2 = i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1745283969, i2, -1, "com.vk.clips.playlists.folders.list.ClipsPlaylistsFoldersBottomContentView.ThemedContent (ClipsPlaylistsFoldersBottomContentView.kt:50)");
            }
            cue.a aVar3 = (cue.a) ((zak0) this.f.e).getValue();
            if (aVar3 instanceof cue.a.c) {
                M.K(-2114308731);
                M.j();
            } else if (aVar3 instanceof cue.a.C2684a) {
                M.K(-2114306587);
                M.j();
            } else {
                if (!(aVar3 instanceof cue.a.b)) {
                    throw alb0.c(-2114310555, M);
                }
                M.K(-1118895121);
                if (((Boolean) jk50.d(((cue.a.b) aVar3).c, Boolean.FALSE, M, 48).getValue()).booleanValue()) {
                    M.K(-1118772547);
                    q630.a aVar4 = q630.a.a;
                    float f = 12;
                    q630 h = txj0.h(txj0.f(aVar4, 1.0f), (2 * f) + 44);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(h, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar5);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    String N = d370.N(R.string.clips_playlist_reorder_ready, 0, M);
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    boolean z = false;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    q630 D2 = s200.D(txj0.f(aVar4, 1.0f), f);
                    if ((i2 & 112) == 32) {
                        z = true;
                    }
                    Object x = M.x();
                    if (z || x == a.C0011a.a) {
                        x = new v67(izsVar, 1);
                        M.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, D2, null, false, false, null, null, null, N, null, null, null, null, true, null, null, null, M, 28080, 12582912, 0, 4059104);
                    aVar2 = M;
                    aVar2.G();
                } else {
                    aVar2 = M;
                    aVar2.K(-1121265567);
                }
                aVar2.j();
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new cr7(i, 3, this, cueVar, izsVar);
        }
    }
}
