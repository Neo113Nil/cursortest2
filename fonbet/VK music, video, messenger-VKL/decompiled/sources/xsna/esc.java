package xsna;

import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class esc implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ esc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.b;
        Object obj5 = this.c;
        int i4 = 1;
        switch (i3) {
            case 0:
                isc iscVar = (isc) obj5;
                z37 z37Var = (z37) obj;
                euc eucVar = (euc) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                qcy<Object>[] qcyVarArr = isc.t1;
                if ((intValue & 6) == 0) {
                    i = intValue | (aVar.J(z37Var) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(eucVar) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-475560629, i, -1, "com.vk.clips.viewer.edit.presentation.fragment.ClipEditSdkBottomSheet.Content.<anonymous>.<anonymous> (ClipEditSdkBottomSheet.kt:209)");
                    }
                    rvi.a(dkw.b.b(iscVar.eo().h()), kai.c(-170718709, new fc1(i4, eucVar, z37Var), aVar), aVar, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                RichCell$Middle.d dVar = (RichCell$Middle.d) obj5;
                spg0 spg0Var = (spg0) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | (aVar2.J(spg0Var) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= aVar2.J(q630Var) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(882964735, i2, -1, "com.vk.core.compose.component.cell.content.toSexyCellMeta.<anonymous> (SexyMiddleImpl.kt:204)");
                    }
                    dVar.a(spg0Var, q630Var, aVar2, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
