package xsna;

import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class blp0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ blp0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                Float f = (Float) obj2;
                f.getClass();
                Float f2 = (Float) obj4;
                f2.getClass();
                ((zzs) wh50Var.getValue()).invoke((ov70) obj, f, (ov70) obj3, f2);
                break;
            default:
                Cell$Left cell$Left = (Cell$Left) this.c;
                spg0 spg0Var = (spg0) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(spg0Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(q630Var) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1680241548, i, -1, "com.vk.core.compose.component.cell.rich.toSexyCellSideSlot.<anonymous> (VkRichCell.kt:46)");
                    }
                    cell$Left.a(spg0Var, q630Var, aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
