package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.q630;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tna implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tna(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.b;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                q630 q630Var = (q630) obj7;
                Cell$Middle.Size size = (Cell$Middle.Size) obj6;
                v5v v5vVar = (v5v) obj5;
                izs izsVar = (izs) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.y(izsVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2085559916, intValue, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.CellOnboardingTitle.Content.<anonymous> (PrivacyEntryPointCell2.kt:124)");
                    }
                    us2.b b = xga0.b(1526650579, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    int m = b.m(new hik0(ylu0Var.getText().o, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        b.g(v5vVar.a);
                        s3q0 s3q0Var = s3q0.a;
                        b.k(m);
                        us2 n = b.n();
                        aVar.j();
                        Cell$Middle.d.b.b(n, null, null, null, 0, 0, null, null, izsVar, aVar, (intValue << 27) & 1879048192, 6, 510).c(q630Var, size, aVar, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } catch (Throwable th) {
                        b.k(m);
                        throw th;
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                List list = (List) obj7;
                qhw qhwVar = (qhw) obj6;
                pco pcoVar = (pco) obj5;
                int intValue2 = ((Integer) obj2).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(829319562, intValue3, -1, "com.vk.ecomm.design.compose.tile.impl.image.ImageContent.ManyImagesContent.<anonymous>.<anonymous> (ImageContent.kt:141)");
                }
                epd0.b(list.get(intValue2), q630.a.a, ((Boolean) ((zak0) qhwVar.c).getValue()).booleanValue(), ((Boolean) ((zak0) qhwVar.b).getValue()).booleanValue(), pcoVar, aVar2, 48);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
        }
    }
}
