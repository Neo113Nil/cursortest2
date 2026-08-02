package xsna;

import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vuy implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vuy(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                yzs yzsVar = (yzs) this.c;
                ksy ksyVar = (ksy) obj;
                ((Integer) obj2).getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(ksyVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-857469575, intValue, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:56)");
                    }
                    yzsVar.invoke(ksyVar, aVar, Integer.valueOf(intValue & 14));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                RichCell$Middle.c cVar = (RichCell$Middle.c) this.c;
                q9g q9gVar = (q9g) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar2.J(q9gVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar2.J(q630Var) ? 32 : 16;
                }
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1502863002, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellSubtitle.<anonymous> (SexyMiddleImpl.kt:188)");
                    }
                    cVar.b(q9gVar, q630Var, RichCell$Middle.Size.Medium, aVar2, (i & 14) | 384 | (i & 112));
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
