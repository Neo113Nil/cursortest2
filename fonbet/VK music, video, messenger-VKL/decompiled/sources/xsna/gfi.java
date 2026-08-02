package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gfi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ gfi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(369540795, intValue, -1, "com.vk.draftslist.impl.ui.view.ComposableSingletons$DraftsListViewContentKt.lambda$369540795.<anonymous> (DraftsListViewContent.kt:141)");
                    }
                    q630.a aVar2 = q630.a.a;
                    float f = 34;
                    q630 H = s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    q630 b = ra8.a.b(txj0.q(aVar2, 24), dt1.a.f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    mku0.a((float) 2.5d, 384, 24, ylu0Var.getIcon().n, aVar, b);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(41223304, intValue2, -1, "com.vk.libvideo.design.compose.video.topshelf.internal.skeleton.ComposableSingletons$TopshelfCardSkeletonKt.lambda$41223304.<anonymous> (TopshelfCardSkeleton.kt:19)");
                    }
                    akv0.a(SkeletonType.Block, txj0.d(q630.a.a, 1.0f), aVar4, 54);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            default:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).m);
                return s3q0.a;
        }
    }
}
