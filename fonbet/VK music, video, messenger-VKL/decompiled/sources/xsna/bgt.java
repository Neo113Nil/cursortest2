package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.udt;

/* compiled from: GamesHorizontalList.kt */
/* loaded from: classes17.dex */
public final class bgt {
    public static final void a(final udt.e eVar, final izs izsVar, final eev eevVar, final boolean z, final q630 q630Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a aVar2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1071308178);
        int i5 = i2 | (M.J(eVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(eevVar) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.o(i) ? 131072 : 65536);
        if (M.t(i5 & 1, (74899 & i5) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1071308178, i5, -1, "com.vk.games.presentation.components.sections.HorizontalGameItemMiniList (GamesHorizontalList.kt:29)");
            }
            final xvy a = zvy.a(0, 3, M);
            boolean z2 = eevVar.b.b;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z2) {
                c0012a = c0012a2;
                aVar2 = M;
                i3 = 131072;
                i4 = i5;
                aVar2.K(559019060);
            } else {
                M.K(560434396);
                List list = eVar.c;
                boolean z3 = (i5 & 112) == 32;
                Object x = M.x();
                if (z3 || x == c0012a2) {
                    x = new uft(izsVar, 0);
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                i4 = i5;
                c0012a = c0012a2;
                i3 = 131072;
                vbh0.b((i5 >> 3) & 896, M, list, izsVar2, a, z);
                aVar2 = M;
            }
            aVar2.j();
            u890 m = s200.m(kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean J = ((i4 & 14) == 4) | ((458752 & i4) == i3) | ((i4 & 896) == 256) | aVar2.J(a) | ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
            Object x2 = aVar2.x();
            if (J || x2 == c0012a) {
                izs izsVar3 = new izs() { // from class: xsna.vft
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        udt.e eVar2 = udt.e.this;
                        List list2 = eVar2.c;
                        wow wowVar = new wow(list2);
                        ((nvy) obj).e(list2.size(), new zft(new md8((byte) 0, 6), wowVar), new he1(wowVar, 1), new jai(2039820996, new agt(wowVar, i, eevVar, eVar2, a, z, izsVar), true));
                        return s3q0.a;
                    }
                };
                aVar2.R(izsVar3);
                x2 = izsVar3;
            }
            int i6 = (i4 >> 12) & 14;
            M = aVar2;
            lqy.b(q630Var, a, m, null, null, null, false, null, (izs) x2, M, i6, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(izsVar, eevVar, z, q630Var, i, i2) { // from class: xsna.wft
                public final /* synthetic */ izs c;
                public final /* synthetic */ eev d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ int g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    bgt.a(udt.e.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
