package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import xsna.q630;
import xsna.wkj;

/* compiled from: ImageContentImpl.kt */
/* loaded from: classes17.dex */
public final class shw extends HorizontalListItem$VisualContent {
    public final wh50 a;
    public final wh50 b = androidx.compose.runtime.k.b(Boolean.FALSE);

    public shw(lg90 lg90Var) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
    }

    @Override // com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1682970827);
        int i2 = (M.p(j) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1682970827, i2, -1, "com.vk.core.compose.component.horizontal.ImageContentImpl.Draw (ImageContentImpl.kt:25)");
            }
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            M.K(-1867696945);
            q630.a aVar2 = q630.a.a;
            q630 r = txj0.r(j, aVar2);
            if (((Boolean) ((zak0) this.b).getValue()).booleanValue()) {
                fdi.w();
                M.K(231707625);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(231707625, 0, -1, "com.vk.core.compose.component.defaults.HorizontalListItemDefaults.imageBorder (HorizontalListItemDefaults.kt:59)");
                }
                float f = (float) 0.5d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                y18 a = aqw.a(f, ylu0Var.getImage().a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                fdi.w();
                M.K(2039585641);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039585641, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeHorizontalListItemDefaults.plainImageShape (MilkshakeHorizontalListItemDefaults.kt:52)");
                }
                uog0 b = vog0.b(kqu0.f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                r = r.g(r18.b(a.a, a.b, aVar2, b));
            }
            M.j();
            fdi.w();
            M.K(2039585641);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2039585641, 0, -1, "com.vk.core.compose.component.defaults.MilkshakeHorizontalListItemDefaults.plainImageShape (MilkshakeHorizontalListItemDefaults.kt:52)");
            }
            uog0 b2 = vog0.b(kqu0.f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            vjw.a(lg90Var, null, rte0.d(r, b2), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 24632, 104);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, i) { // from class: xsna.rhw
                public final /* synthetic */ long c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    shw.this.a(I, this.c, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
