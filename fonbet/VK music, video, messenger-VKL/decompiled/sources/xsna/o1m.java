package xsna;

import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.ads.AdsItemAction;
import com.vk.clips.sdk.shared.item.ads.AdsItemPatch;
import kotlin.NoWhenBranchMatchedException;
import xsna.fw0;
import xsna.ky0;
import xsna.nz0;
import xsna.wk50;

/* compiled from: DescriptionActionApplier.kt */
/* loaded from: classes17.dex */
public final class o1m implements oj50<nz0, AdsItemAction, AdsItemPatch> {
    public final pih0 a;
    public final f4z b;
    public final f4z c;
    public final yof d;

    public o1m(iih0 iih0Var, f4z f4zVar, f4z f4zVar2, yof yofVar) {
        this.a = iih0Var;
        this.b = f4zVar;
        this.c = f4zVar2;
        this.d = yofVar;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        nz0 nz0Var = (nz0) km50Var;
        AdsItemAction adsItemAction = (AdsItemAction) kj50Var;
        if ((nz0Var instanceof nz0.a) && (adsItemAction instanceof AdsItemAction.b)) {
            AdsItemAction.b bVar = (AdsItemAction.b) adsItemAction;
            boolean z = bVar instanceof AdsItemAction.b.C0644b;
            pih0 pih0Var = this.a;
            if (z) {
                pih0Var.o2(new SdkClipViewerClick.f(((nz0.a) nz0Var).b.a()));
                aVar.b(AdsItemPatch.c.b.b);
                this.b.b(fw0.a.a);
                return;
            }
            if (bVar instanceof AdsItemAction.b.a) {
                aVar.b(AdsItemPatch.c.a.b);
                return;
            }
            if (bVar instanceof AdsItemAction.b.c) {
                SdkClipVideoFile a = ((nz0.a) nz0Var).b.a();
                String str = ((AdsItemAction.b.c) adsItemAction).b;
                pih0Var.o2(new SdkClipViewerClick.e.a(a, str));
                this.c.b(new ky0.b(str));
                return;
            }
            if (bVar instanceof AdsItemAction.b.e) {
                pih0Var.o2(new SdkClipViewerClick.e.c(((nz0.a) nz0Var).b.a(), ((AdsItemAction.b.e) adsItemAction).b));
            } else {
                if (!(bVar instanceof AdsItemAction.b.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                pih0Var.o2(new SdkClipViewerClick.e.b(((nz0.a) nz0Var).b.a(), ((AdsItemAction.b.d) adsItemAction).b));
            }
        }
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
