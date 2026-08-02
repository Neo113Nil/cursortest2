package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.ecomm.storefront.impl.albums.presentation.model.LoadingState;
import java.util.HashSet;
import xsna.dll0;
import xsna.efu;
import xsna.q630;

/* compiled from: StorefrontAlbumsSuccess.kt */
/* loaded from: classes18.dex */
public final class bll0 {
    public static final void a(dsy dsyVar, gzs gzsVar, boolean z, int i, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-831868398);
        int i3 = (M.J(dsyVar) ? 4 : 2) | i2 | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-831868398, i3, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.HandlePagination (StorefrontAlbumsSuccess.kt:106)");
            }
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = bbk0.b(new i49(dsyVar, z, 1));
                M.R(x);
            }
            Boolean bool = (Boolean) ((mtk0) x).getValue();
            boolean booleanValue = bool.booleanValue();
            boolean l = M.l(booleanValue) | ((i3 & 112) == 32);
            Object x2 = M.x();
            if (l || x2 == c0012a) {
                x2 = new xkl0(booleanValue, gzsVar, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i = 5;
        } else {
            M.h();
        }
        int i4 = i;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zd1(dsyVar, gzsVar, z, i4, i2, 1);
        }
    }

    public static final void b(qa8 qa8Var, dll0.a.b bVar, LoadingState loadingState, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(198474607);
        if ((i & 6) == 0) {
            i2 = (M.J(qa8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.o(loadingState.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(198474607, i2, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsSuccess (StorefrontAlbumsSuccess.kt:40)");
            }
            M.K(1755544545);
            dsy a = gsy.a(0, 3, M);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new mif(izsVar, 5);
                M.R(x);
            }
            a(a, (gzs) x, bVar.c, 0, M, 0);
            M.j();
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            int i4 = fnj.d(context) ? 3 : 2;
            q630 f = txj0.f(q630.a.a, 1.0f);
            efu.b bVar2 = new efu.b(i4);
            float f2 = 12;
            float f3 = 16;
            u890 u890Var = new u890(f3, f2, f3, f3);
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            a.j g2 = androidx.compose.foundation.layout.a.g(8);
            boolean z2 = (i3 == 2048) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new xs70(bVar, loadingState, izsVar, qa8Var);
                M.R(x2);
            }
            uqy.b(bVar2, f, a, u890Var, g, g2, null, false, null, (izs) x2, M, 1769520, 0, 912);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rve0(qa8Var, bVar, loadingState, izsVar, i, 1);
        }
    }
}
