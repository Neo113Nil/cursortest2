package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.core.serialize.Serializer;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.HashMap;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ddi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ddi(int i) {
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
                        androidx.compose.runtime.b.f(1643548510, intValue, -1, "com.vk.profile.community.details.impl.contacts.ComposableSingletons$CommunityAddContactsViewKt.lambda$1643548510.<anonymous> (CommunityAddContactsView.kt:116)");
                    }
                    String N = d370.N(R.string.community_add_info_bs_save, 0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, null, ylu0Var.getText().e, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar, 0, 0, 16378);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-846868824, intValue2, -1, "com.vk.dzenarticle.impl.ui.view.ComposableSingletons$DzenArticleTopBarKt.lambda$-846868824.<anonymous> (DzenArticleTopBar.kt:123)");
                    }
                    q630.a aVar3 = q630.a.a;
                    q630 c = txj0.c(txj0.f(aVar3, 1.0f), 1.0f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c2 = qri.c(aVar2, c);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c2, cri.a.d);
                    f9t.e(txj0.v(aVar3, 60), aVar2, 6);
                    akv0.a(SkeletonType.Circle, txj0.q(aVar3, 28), aVar2, 54);
                    float f = 12;
                    f9t.e(txj0.v(aVar3, f), aVar2, 6);
                    akv0.a(SkeletonType.Block, s200.H(txj0.h(txj0.f(aVar3, 1.0f), f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 76, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), aVar2, 54);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                List<Integer> list = ((com.vk.im.engine.models.dialogs.b) obj2).J;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    bArr = Serializer.b.g(list);
                }
                rdi.h(sQLiteStatement, intValue3, bArr);
                return s3q0.a;
        }
    }
}
