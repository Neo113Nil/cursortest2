package xsna;

import androidx.compose.runtime.a;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import java.util.List;

/* compiled from: CommunityProfileLegacyTopBarRenderer.kt */
/* loaded from: classes5.dex */
public final class xph {
    public final guh a;
    public final iuh b;

    public xph(guh guhVar, iuh iuhVar) {
        this.a = guhVar;
        this.b = iuhVar;
    }

    public final void a(List<? extends CommunityProfileViewState.Data.d> list, androidx.compose.runtime.a aVar, int i) {
        List<? extends CommunityProfileViewState.Data.d> list2;
        androidx.compose.runtime.a M = aVar.M(-117859115);
        int i2 = (M.y(list) ? 4 : 2) | i | (M.y(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-117859115, i2, -1, "com.vk.profile.community.impl.ui.profile.viewdelegates.CommunityProfileLegacyTopBarRenderer.Content (CommunityProfileLegacyTopBarRenderer.kt:15)");
            }
            guh guhVar = this.a;
            boolean z = guhVar.d;
            iuh iuhVar = this.b;
            h4i h4iVar = new h4i(z, iuhVar.c, iuhVar.d, iuhVar.f, iuhVar.g, iuhVar.e);
            y89 y89Var = guhVar.e;
            boolean z2 = guhVar.c;
            gzs<Boolean> gzsVar = guhVar.b;
            boolean y = M.y(this);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new dhh(this, 1);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean y2 = M.y(this);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new z8f(this, 4);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean y3 = M.y(this);
            Object x3 = M.x();
            if (y3 || x3 == c0012a) {
                x3 = new l00(this, 29);
                M.R(x3);
            }
            list2 = list;
            g4i.a(list2, h4iVar, y89Var, null, z2, gzsVar, izsVar, izsVar2, (izs) x3, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            list2 = list;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a6(this, list2, i, 4);
        }
    }
}
