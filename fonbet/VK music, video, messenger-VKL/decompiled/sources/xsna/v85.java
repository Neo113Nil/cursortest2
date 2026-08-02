package xsna;

import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class v85 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v85(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                AuthorHeaderConfig authorHeaderConfig = (AuthorHeaderConfig) this.c;
                q630 q630Var = (q630) obj;
                rv5 rv5Var = (rv5) obj2;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    i = (aVar.J(q630Var) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= aVar.J(rv5Var) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1815821228, i, -1, "com.vk.profile.design.compose.header.content.InternalHeaderContent.<anonymous> (AuthorHeaderHeaderContent.kt:168)");
                    }
                    d95.c(authorHeaderConfig.a.d, ahn.E(q630Var, "author_header_badge_container"), rv5Var, aVar, (i << 3) & 896);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                r8o0 r8o0Var = (r8o0) this.c;
                com.vk.messagetemplates.impl.details.f fVar = (com.vk.messagetemplates.impl.details.f) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= aVar2.J(fVar) ? 32 : 16;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 145) != 144)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1683032713, intValue2, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsScreen.<anonymous> (TemplateDetailsScreen.kt:24)");
                    }
                    rrv0.d(null, null, null, null, kai.c(184308078, new rv7(10, fVar, r8o0Var), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                yzs yzsVar = (yzs) this.c;
                Float f = (Float) obj2;
                f.floatValue();
                Float f2 = (Float) obj4;
                f2.floatValue();
                yzsVar.invoke(f, (ov70) obj3, f2);
                break;
            default:
                RichCell$Middle richCell$Middle = (RichCell$Middle) this.c;
                spg0 spg0Var = (spg0) obj;
                q630 q630Var2 = (q630) obj2;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i2 = (aVar3.J(spg0Var) ? 4 : 2) | intValue3;
                } else {
                    i2 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i2 |= aVar3.J(q630Var2) ? 32 : 16;
                }
                if (aVar3.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1468647365, i2, -1, "com.vk.core.compose.component.cell.rich.toSexyCellMiddle.<anonymous> (VkRichCell.kt:54)");
                    }
                    richCell$Middle.a(spg0Var, q630Var2, aVar3, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
