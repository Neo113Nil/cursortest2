package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import xsna.q630;

/* compiled from: ResizableAvatarContentImpl.kt */
/* loaded from: classes17.dex */
public final class p9g0 extends HorizontalListItem$VisualContent {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public p9g0(phw phwVar, float f, p5g p5gVar) {
        rep repVar = rep.a;
        this.a = androidx.compose.runtime.k.b(phwVar);
        this.b = cq.f(f);
        this.c = androidx.compose.runtime.k.b(p5gVar);
        this.d = androidx.compose.runtime.k.b(repVar);
    }

    @Override // com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent
    public final void a(final int i, final long j, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-312469397);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-312469397, i2, -1, "com.vk.core.compose.component.horizontal.ResizableAvatarContentImpl.Draw (ResizableAvatarContentImpl.kt:29)");
            }
            bgv0.a((efj) ((zak0) this.a).getValue(), txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((pco) ((zak0) this.b).getValue()).b, 1, q630.a.a), (iy5) ((zak0) this.d).getValue(), (k18) ((zak0) this.c).getValue(), null, null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, i) { // from class: xsna.o9g0
                public final /* synthetic */ long c;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    p9g0.this.a(I, this.c, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
