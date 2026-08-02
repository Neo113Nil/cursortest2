package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.MsgRequestStatus;
import io.requery.android.database.sqlite.SQLiteStatement;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bdi implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bdi(int i) {
        this.b = i;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1898355446, intValue, -1, "com.vk.clips.upload.vk.ui.impl.fragment.store.ComposableSingletons$ClipsUploadStateMapperKt.lambda$-1898355446.<anonymous> (ClipsUploadStateMapper.kt:428)");
                    }
                    jqu0.a(s200.E(q630Var, 16, 8), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 0, 14);
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
                int i = 0;
                int i2 = 1;
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1434221393, intValue2, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$ModalPageScreenContentKt.lambda$-1434221393.<anonymous> (ModalPageScreenContent.kt:209)");
                    }
                    q630.a aVar3 = q630.a.a;
                    float f = 1.0f;
                    q630 f2 = txj0.f(aVar3, 1.0f);
                    float f3 = kqu0.b;
                    float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    q630 F = s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f2);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, F);
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
                    k9q0.w(aVar2, c, cri.a.d);
                    aVar2.K(1837704757);
                    while (i < 3) {
                        q630 F2 = s200.F(f4, kqu0.c, i2, txj0.f(aVar3, f));
                        StringBuilder sb = new StringBuilder("Row ");
                        int i3 = i + 1;
                        sb.append(i3);
                        sb.append(" — short content");
                        androidx.compose.runtime.a aVar5 = aVar2;
                        yqv0.c(sb.toString(), F2, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar5, 0, 0, 16380);
                        aVar3 = aVar3;
                        aVar2 = aVar5;
                        f4 = f4;
                        f = f;
                        i2 = i2;
                        i = i3;
                    }
                    if (gp.d(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                MsgRequestStatus msgRequestStatus = ((com.vk.im.engine.models.dialogs.b) obj2).I;
                rdi.k(sQLiteStatement, intValue3, msgRequestStatus != null ? Integer.valueOf(msgRequestStatus.j()) : null);
                return s3q0.a;
        }
    }
}
