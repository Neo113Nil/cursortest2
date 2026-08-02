package xsna;

import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: KidsModeRestrictionRendererImpl.kt */
/* loaded from: classes3.dex */
public final class miy implements KidsModeRestrictionRenderer {
    @Override // com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer
    public final void a(KidsModeRestrictionRenderer.Source source, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1652226009);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1652226009, i, -1, "com.vk.musc.kidsmode.impl.KidsModeRestrictionRendererImpl.KidsModeRestriction (KidsModeRestrictionRendererImpl.kt:12)");
        }
        liy.a(source, gzsVar, null, gzsVar2, aVar, (i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i << 3) & 7168));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
