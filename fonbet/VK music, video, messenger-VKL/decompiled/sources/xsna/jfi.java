package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.serialize.Serializer;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jfi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jfi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1707736313, intValue, -1, "com.vk.dzenarticle.impl.ui.view.ComposableSingletons$DzenArticleViewLoadingKt.lambda$1707736313.<anonymous> (DzenArticleViewLoading.kt:26)");
                    }
                    q630.a aVar2 = q630.a.a;
                    q630 d = txj0.d(aVar2, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, d);
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
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    f9t.e(txj0.h(aVar2, 4), aVar, 6);
                    float f = 12;
                    float f2 = 16;
                    q630 H = s200.H(txj0.h(txj0.f(aVar2, 1.0f), f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 46, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    SkeletonType skeletonType = SkeletonType.Block;
                    akv0.a(skeletonType, H, aVar, 54);
                    f9t.e(txj0.h(aVar2, 6), aVar, 6);
                    akv0.a(skeletonType, s200.H(txj0.h(txj0.f(aVar2, 1.0f), f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 175, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), aVar, 54);
                    f9t.e(txj0.h(aVar2, f), aVar, 6);
                    vso.a(0, aVar);
                    vso.a(0, aVar);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue2 = ((Integer) obj3).intValue();
                List<Integer> list = ((com.vk.im.engine.models.dialogs.b) obj2).K;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.g(list);
                }
                rdi.h(sQLiteStatement, intValue2, bArr);
                return s3q0.a;
        }
    }
}
